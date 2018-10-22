package com.example.jonathan.pokedex;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

// Sets up ArrayList of Pokemon for the Pokemon Adapter
public class PokemonLab {

    private static PokemonLab sPokemonLab;
    private List<String> mPokedex;

    public static PokemonLab get(Context context) {
        if(sPokemonLab == null) {
            sPokemonLab = new PokemonLab(context);
        }
        return sPokemonLab;
    }

    private PokemonLab(Context context) {
        mPokedex = new ArrayList<>();

        mPokedex.add("electrode");
        mPokedex.add("diglett");
        mPokedex.add("nidoran");
        mPokedex.add("mankey");
        mPokedex.add("venusaur");
        mPokedex.add("rattata");
        mPokedex.add("fearow");
        mPokedex.add("pidgey");
        mPokedex.add("seaking");
        mPokedex.add("jolteon");
        mPokedex.add("dragonite");
        mPokedex.add("gastly");
        mPokedex.add("ponyta");
        mPokedex.add("vaporeon");
        mPokedex.add("poliwrath");
        mPokedex.add("butterfree");

        /**
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
         */
    }

    public List<String> getPokedex() {
        return mPokedex;
    }

    public String getPokemon(String name) {
        for (String pokemon : mPokedex) {
            if (pokemon.equals(name)) {
                return pokemon;
            }
        }
        return null;
    }
}
