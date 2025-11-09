package com.example.myapplication;

public class Choice {
    Message message;

    // Helper untuk mengambil message content
    public String getMessageContent() {
        if (message != null) {
            return message.content;
        }
        return null;
    }
}