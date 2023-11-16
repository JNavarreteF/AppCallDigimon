package com.example.digimon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.digimon.connectors.RetrofitInstance;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private List<DigimonModel> digimons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        RecyclerView rvMains = findViewById(R.id.rvMain);
        rvMains.setLayoutManager(new LinearLayoutManager(this));
        RetrofitInstance.getInstance().getApiInterface().getDigimon().enqueue(new Callback<List<DigimonModel>>() {
            @Override
            public void onResponse(Call<List<DigimonModel>> call, Response<List<DigimonModel>> response) {
                digimons = response.body();
                rvMains.setAdapter(new DigimonAdapter(getApplicationContext(), digimons));
            }

            @Override
            public void onFailure(Call<List<DigimonModel>> call, Throwable t) {

            }
        });


    }
}