package com.example.digimon;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DigimonHolder extends RecyclerView.ViewHolder {
    private TextView name;
    private ImageView image;
    private TextView level;

    public DigimonHolder(@NonNull View viewItem) {
        super(viewItem);
        name = viewItem.findViewById(R.id.name);
        image = viewItem.findViewById(R.id.imageDigimon);
        level = viewItem.findViewById(R.id.level);
    }

    public TextView getLevel() {
        return level;
    }

    public ImageView getImage() {
        return image;
    }

    public TextView getName() {
        return name;
    }
}
