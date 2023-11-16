package com.example.digimon.connectors;

import com.example.digimon.DigimonModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiReference {

    @GET("digimon")
    Call<List<DigimonModel>> getDigimon();
}
