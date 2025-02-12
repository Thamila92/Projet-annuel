package com.example.companion.ApiClient;


import com.fasterxml.jackson.databind.JsonNode;

public class HttpResponseWrapper {
    private JsonNode body;
    private int statusCode;

    public HttpResponseWrapper(JsonNode body, int statusCode) {
        this.body = body;
        this.statusCode = statusCode;
    }

    public JsonNode getBody() {
        return body;
    }

    public int getStatusCode() {
        return statusCode;
    }
}

