package com.dp.structural.decorator2;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BaseClient implements RestClient {

    private HttpClient httpClient;
    public BaseClient() {
        httpClient = HttpClient.newBuilder().build();
    }

    @Override
    public HttpResponse<String> send(HttpRequest httpRequest) {
        try {
            return httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
