package com.example.jonathan.pokedex;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.jonathan.pokedex.models.Pokemon;
import com.example.jonathan.pokedex.networking.GetPokemonDataService;
import com.example.jonathan.pokedex.networking.PokemonClientReference;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class PokemonActivity extends SingleFragmentActivity {

    public static final String EXTRA_POKEMON_ID = "com.example.jonathan.pokedex.pokemon_id";
    Pokemon pokemon;

    // Activity creates pokemon view fragment
    @Override
    protected Fragment createFragment() {

        String pokemonId = (String) getIntent().getSerializableExtra(EXTRA_POKEMON_ID);

        pokeAPIRequest();

        return PokemonFragment.newInstance(pokemon);
    }

    public static Intent newIntent(Context packageContext, String pokemonId) {
        Intent intent = new Intent(packageContext, PokemonActivity.class);

        intent.putExtra(EXTRA_POKEMON_ID, pokemonId);
        return intent;

    }

    private void pokeAPIRequest() {
        String pokemonId = (String) getIntent().getSerializableExtra(EXTRA_POKEMON_ID);

        // Retrofit sets up the connection to PokeAPI
        Retrofit retrofit = PokemonClientReference.getRetrofitInstance();
        GetPokemonDataService pokemonDataService = retrofit.create(GetPokemonDataService.class);

        Call<Pokemon> pokemonCall = pokemonDataService.getPokemon(pokemonId);

        Log.d("..." + pokemonId, "The Pokemon ID");

        pokemon = new Pokemon();

        // Execute the call and, if it succeeds, set it to a Pokemon object
        //mPokemon = pokemonCall.execute().body();
        pokemonCall.enqueue(new Callback<Pokemon>() {
            @Override
            public void onResponse(Call<Pokemon> call, Response<Pokemon> response) {
                //pokemon = response.body();
                Log.d("Response String", response.body().toString());
            }

            @Override
            public void onFailure(Call<Pokemon> call, Throwable t) {
                Log.d("Call Failure", "A call was made, but it failed");
            }
        });

        Log.d("Done", "This actually finished.");
    }
}
