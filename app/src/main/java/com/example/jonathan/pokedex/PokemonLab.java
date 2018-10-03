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

        // Ditto
        Pokemon ditto = new Pokemon();
        ditto.setImage(R.drawable.ditto);
        ditto.setName("Ditto");
        ditto.setType("Normal");
        ditto.setWeight(4.39f);
        ditto.setHeight(0.32f);
        ditto.setHP(48);
        ditto.setAttack(48);
        ditto.setDefense(48);
        ditto.setSpAttack(48);
        ditto.setSpDefense(48);
        ditto.setSpeed(48);
        mPokedex.add(ditto);

        // Porygon
        Pokemon porygon = new Pokemon();
        porygon.setImage(R.drawable.porygon);
        porygon.setName("Porygon");
        porygon.setType("Normal");
        porygon.setWeight(33.36f);
        porygon.setHeight(0.67f);
        porygon.setHP(65);
        porygon.setAttack(60);
        porygon.setDefense(70);
        porygon.setSpAttack(85);
        porygon.setSpDefense(75);
        porygon.setSpeed(40);
        mPokedex.add(porygon);

        // Mudkip
        Pokemon mudkip = new Pokemon();
        mudkip.setImage(R.drawable.mudkip);
        mudkip.setName("Mudkip");
        mudkip.setType("Water");
        mudkip.setWeight(11.97f);
        mudkip.setHeight(0.52f);
        mudkip.setHP(50);
        mudkip.setAttack(70);
        mudkip.setDefense(50);
        mudkip.setSpAttack(50);
        mudkip.setSpDefense(50);
        mudkip.setSpeed(40);
        mPokedex.add(mudkip);

        // Magikarp
        Pokemon magikarp = new Pokemon();
        magikarp.setImage(R.drawable.magikarp);
        magikarp.setName("Magikarp");
        magikarp.setType("Water");
        magikarp.setWeight(12.26f);
        magikarp.setHeight(0.95f);
        magikarp.setHP(20);
        magikarp.setAttack(10);
        magikarp.setDefense(55);
        magikarp.setSpAttack(15);
        magikarp.setSpDefense(20);
        magikarp.setSpeed(80);
        mPokedex.add(magikarp);

        // Venusaur
        Pokemon venusaur = new Pokemon();
        venusaur.setImage(R.drawable.venusaur);
        venusaur.setName("Venusaur");
        venusaur.setType("Grass/Poison");
        venusaur.setWeight(122.29f);
        venusaur.setHeight(2.16f);
        venusaur.setHP(80);
        venusaur.setAttack(82);
        venusaur.setDefense(83);
        venusaur.setSpAttack(100);
        venusaur.setSpDefense(100);
        venusaur.setSpeed(80);
        mPokedex.add(venusaur);

        // Pikachu
        Pokemon pikachu = new Pokemon();
        pikachu.setImage(R.drawable.pikachu);
        pikachu.setName("Pikachu");
        pikachu.setType("Electric");
        pikachu.setWeight(5.4f);
        pikachu.setHeight(0.41f);
        pikachu.setHP(35);
        pikachu.setAttack(55);
        pikachu.setDefense(40);
        pikachu.setSpAttack(50);
        pikachu.setSpDefense(50);
        pikachu.setSpeed(90);
        mPokedex.add(pikachu);

        // Jigglypuff
        Pokemon jigglypuff = new Pokemon();
        jigglypuff.setImage(R.drawable.jigglypuff);
        jigglypuff.setName("Jigglypuff");
        jigglypuff.setType("Normal/Fairy");
        jigglypuff.setWeight(2.36f);
        jigglypuff.setHeight(0.36f);
        jigglypuff.setHP(115);
        jigglypuff.setAttack(45);
        jigglypuff.setDefense(20);
        jigglypuff.setSpAttack(45);
        jigglypuff.setSpDefense(25);
        jigglypuff.setSpeed(20);
        mPokedex.add(jigglypuff);

        // Vaporeon
        Pokemon vaporeon = new Pokemon();
        vaporeon.setImage(R.drawable.vaporeon);
        vaporeon.setName("Vaporeon");
        vaporeon.setType("Water");
        vaporeon.setWeight(40.66f);
        vaporeon.setHeight(1.1f);
        vaporeon.setHP(130);
        vaporeon.setAttack(65);
        vaporeon.setDefense(60);
        vaporeon.setSpAttack(110);
        vaporeon.setSpDefense(95);
        vaporeon.setSpeed(65);
        mPokedex.add(vaporeon);

        // Gengar
        Pokemon gengar = new Pokemon();
        gengar.setImage(R.drawable.gengar);
        gengar.setName("Gengar");
        gengar.setType("Ghost/Poison");
        gengar.setWeight(40.71f);
        gengar.setHeight(1.52f);
        gengar.setHP(60);
        gengar.setAttack(65);
        gengar.setDefense(80);
        gengar.setSpAttack(170);
        gengar.setSpDefense(95);
        gengar.setSpeed(130);
        mPokedex.add(gengar);

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
