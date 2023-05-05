package com.dp.structural.decorator2;

import lombok.extern.slf4j.Slf4j;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


@Slf4j
public class LoggingClient implements RestClient {

    private RestClient restClient;

    public LoggingClient(RestClient restClient) {
        this.restClient = restClient;
    }

    @Override
    public HttpResponse<String> send(HttpRequest httpRequest) {
        log.info("Trying to hit : {} {}", httpRequest.method(), httpRequest.uri());
        HttpResponse<String> response = restClient.send(httpRequest);
        log.info("Response: {} ", response.statusCode());
        return response;
    }
}
