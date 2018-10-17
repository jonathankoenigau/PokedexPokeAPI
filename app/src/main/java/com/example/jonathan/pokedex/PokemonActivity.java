package com.example.jonathan.pokedex;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.UUID;

public class PokemonActivity extends SingleFragmentActivity {

    public static final String EXTRA_POKEMON_ID = "com.example.jonathan.pokedex.pokemon_id";

    // Activity creates pokemon view fragment
    @Override
    protected Fragment createFragment() {

        String pokemonId = (String) getIntent().getSerializableExtra(EXTRA_POKEMON_ID);
        return PokemonFragment.newInstance(pokemonId);
    }

    public static Intent newIntent(Context packageContext, String pokemonId) {
        Intent intent = new Intent(packageContext, PokemonActivity.class);
        intent.putExtra(EXTRA_POKEMON_ID, pokemonId);
        return intent;

    }
}
