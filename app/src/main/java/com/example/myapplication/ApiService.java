package com.example.myapplication;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface ApiService {
    // Endpoint Groq sama persis dengan OpenAI
    @POST("chat/completions")
    Call<ApiResponse> getChatCompletion(
            @Body ApiRequest requestBody,
            @Header("Authorization") String authToken // <-- Key dikirim di Header
    );
}