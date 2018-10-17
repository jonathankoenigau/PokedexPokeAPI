package com.example.jonathan.pokedex.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Pokemon {

    @SerializedName("name")
    public String pokemon_name;

    @SerializedName("types")
    public ArrayList<PokemonType> pokemon_types;

    @SerializedName("height")
    public int pokemon_height;

    @SerializedName("weight")
    public int pokemon_weight;

    @SerializedName("stats")
    public ArrayList<PokemonStat> pokemon_stats;

    public class PokemonType {
        @SerializedName("type")
        public ArrayList<Type> pokemon_types;

        public class Type {
            @SerializedName("name")
            public String pokemon_type_name;
        }
    }

    public class PokemonStat {
        @SerializedName("stat")
        public ArrayList<Stat> pokemon_stats;

        @SerializedName("base_stat")
        public int pokemon_base_stat;

        public class Stat {
            @SerializedName("name")
            public String pokemon_stat_name;
        }
    }
}
