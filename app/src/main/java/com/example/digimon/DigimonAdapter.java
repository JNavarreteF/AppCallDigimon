package com.example.digimon;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class DigimonAdapter extends RecyclerView.Adapter<DigimonHolder> {
    private Context context;
    private List<DigimonModel> digimons;

    public DigimonAdapter(Context applicationContext, List<DigimonModel> digimons) {
        this.context = applicationContext;
        this.digimons = digimons;
    }

    @NonNull
    @Override
    public DigimonHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DigimonHolder(LayoutInflater.from(context).inflate(R.layout.item_digimon, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull DigimonHolder holder, int position) {
        holder.getName().setText(digimons.get(position).getName());
        holder.getLevel().setText(digimons.get(position).getLevel());
        Picasso.get().load(digimons.get(position).getImageUrl()).into(holder.getImage());
    }

    @Override
    public int getItemCount() {
        return digimons.size();
    }
}
