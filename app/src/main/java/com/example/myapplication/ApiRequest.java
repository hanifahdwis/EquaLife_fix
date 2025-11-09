package com.example.myapplication;

import java.util.List;

public class ApiRequest {
    String model;
    List<Message> messages;
    // (Opsional) tambahkan parameter lain jika perlu
    // double temperature;

    public ApiRequest(String model, List<Message> messages) {
        this.model = model;
        this.messages = messages;
    }
}