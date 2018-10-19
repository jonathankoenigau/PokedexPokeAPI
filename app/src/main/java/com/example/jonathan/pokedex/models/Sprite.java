package com.example.jonathan.pokedex.models;

import com.google.gson.annotations.SerializedName;

public class Sprite {
    @SerializedName("front_default")
    public String pokemon_default_front;

    @SerializedName("front_female")
    public String pokemon_female_front;

    @SerializedName("back_default")
    public String pokemon_default_back;

    @SerializedName("back_female")
    public String pokemon_female_back;
}
