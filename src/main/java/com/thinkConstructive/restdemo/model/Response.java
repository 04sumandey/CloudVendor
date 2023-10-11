package com.thinkConstructive.restdemo.model;

public class Response {
    Boolean Success;
    String Message;

    public Response(Boolean success, String message) {
        Success = success;
        Message = message;
    }
}

