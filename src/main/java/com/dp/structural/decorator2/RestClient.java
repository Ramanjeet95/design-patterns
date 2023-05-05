package com.dp.structural.decorator2;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public interface RestClient {

    public HttpResponse<String> send(HttpRequest httpRequest);
}
