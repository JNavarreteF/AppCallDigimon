package com.example.digimon.connectors;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

    public static RetrofitInstance instance;
    private ApiReference apiReference;

    RetrofitInstance() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://digimon-api.vercel.app/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        apiReference = retrofit.create(ApiReference.class);
    }

    public static RetrofitInstance getInstance() {
        if (instance == null) {
            instance = new RetrofitInstance();
        }
        return instance;
    }

    public ApiReference getApiInterface() {
        return apiReference;
    }
}
