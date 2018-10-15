package com.example.jonathan.pokedex.networking;

import retrofit2.Retrofit;

public class PokemonClientReference {
    public static Retrofit retrofit;
    public static final String BASE_URL = "https://pokeapi.co/";

    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
    }

}