package com.dp.behaviour.decorator;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public interface RestClient {

    public HttpResponse<String> send(HttpRequest httpRequest);
}
