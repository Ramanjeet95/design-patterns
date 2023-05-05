package com.dp.structural.decorator2;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;

public class TestDecoratedClient {
    public static void main(String[] args) throws URISyntaxException {

        RestClient restClient = new RetryClient(new LoggingClient(new BaseClient()));
        restClient.send(HttpRequest.newBuilder().GET().uri(new URI("https://google.com")).build());
    }
}
