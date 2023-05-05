package com.dp.structural.decorator2;

import io.github.resilience4j.retry.Retry;
import io.github.resilience4j.retry.RetryConfig;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;

@Slf4j
public class RetryClient implements RestClient {

    private RestClient restClient;
    private Function<HttpRequest, HttpResponse<String>> callRestClient;
    public RetryClient(RestClient restClient) {
        this.restClient = restClient;
        RetryConfig retryConfig = RetryConfig.custom()
                .maxAttempts(2)
                .waitDuration(Duration.ofMillis(100))
                .retryOnResult(response -> ((HttpResponse<String>)response).statusCode() == 500)
                .retryOnException(e -> e instanceof RuntimeException)
                .retryExceptions(IOException.class, TimeoutException.class)
//                .ignoreExceptions(BusinessException.class, OtherBusinessException.class)
                .build();
        callRestClient = Retry.decorateFunction(Retry.of("Call Rest Client", retryConfig), restClient::send);
    }

    @Override
    public HttpResponse<String> send(HttpRequest httpRequest) {
        return callRestClient.apply(httpRequest);
    }
}
