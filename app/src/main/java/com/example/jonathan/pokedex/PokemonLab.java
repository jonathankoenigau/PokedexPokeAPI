package com.example.jonathan.pokedex;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

// Sets up ArrayList of Pokemon for the Pokemon Adapter
public class PokemonLab {

    private static PokemonLab sPokemonLab;
    private List<Pokemon> mPokedex;

    public static PokemonLab get(Context context) {
        if(sPokemonLab == null) {
            sPokemonLab = new PokemonLab(context);
        }
        return sPokemonLab;
    }

    private PokemonLab(Context context) {
        mPokedex = new ArrayList<>();
        // Golbat
        Pokemon golbat = new Pokemon();
        golbat.setImage(R.drawable.golbat);
        golbat.setName("Golbat");
        golbat.setType("Poison/Flying");
        golbat.setWeight(60.1f);
        golbat.setHeight(1.59f);
        golbat.setHP(75);
        golbat.setAttack(80);
        golbat.setDefense(70);
        golbat.setSpAttack(65);
        golbat.setSpDefense(75);
        golbat.setSpeed(90);
        mPokedex.add(golbat);

        // Test Pokemon
        for (int i = 0; i < 20; i++) {
            Pokemon pokemon = new Pokemon();
            pokemon.setImage(R.drawable.gem_pal);
            pokemon.setName("Pokemon " + i);
            pokemon.setType("Normal");
            pokemon.setWeight(100);
            pokemon.setHeight(20);
            pokemon.setHP(100);
            pokemon.setAttack(100);
            pokemon.setDefense(100);
            pokemon.setSpAttack(100);
            pokemon.setSpDefense(100);
            pokemon.setSpeed(100);
            mPokedex.add(pokemon);
        }
    }

    public List<Pokemon> getPokedex() {
        return mPokedex;
    }

    public Pokemon getPokemon(UUID id) {
        for (Pokemon pokemon : mPokedex) {
            if (pokemon.getID().equals(id)) {
                return pokemon;
            }
        }
        return null;
    }
}
