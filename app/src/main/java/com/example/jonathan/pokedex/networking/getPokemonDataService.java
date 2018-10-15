package com.example.jonathan.pokedex.networking;

import com.example.jonathan.pokedex.models.Pokemon;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface getPokemonDataService {
    @GET("api/v2/pokemon/{name}")
    Call<Pokemon> getPokemon(@Path("name") String name);
}
