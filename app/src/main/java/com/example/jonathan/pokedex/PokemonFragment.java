package com.example.jonathan.pokedex;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jonathan.pokedex.models.Pokemon;
import com.example.jonathan.pokedex.networking.GetPokemonDataService;
import com.example.jonathan.pokedex.networking.PokemonClientReference;

import java.io.IOException;
import java.util.UUID;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class PokemonFragment extends Fragment {

    // Variables holds the current Pokemon
    private String mPokemonId;
    private Pokemon mPokemon;

    private static final String ARG_POKEMON_ID = "pokemon_id";

    public static PokemonFragment newInstance(String pokemonId) {
        Bundle args = new Bundle();
        args.putString(ARG_POKEMON_ID, pokemonId);

        PokemonFragment fragment = new PokemonFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mPokemonId = (String) getArguments().getString(ARG_POKEMON_ID);

        //mPokemon = PokemonLab.get(getActivity()).getPokemon(pokemonId);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Sets the Pokemon layout.
        View v = inflater.inflate(R.layout.fragment_pokemon, container, false);

        // Retrofit sets up the connection to PokeAPI
        Retrofit retrofit = PokemonClientReference.getRetrofitInstance();
        GetPokemonDataService pokemonDataService = retrofit.create(GetPokemonDataService.class);

        Call<Pokemon> pokemonCall = pokemonDataService.getPokemon(mPokemonId);

        Log.d("..." + mPokemonId, "The Pokemon ID");

        mPokemon = new Pokemon();

        // Execute the call and, if it succeeds, set it to a Pokemon object
        //mPokemon = pokemonCall.execute().body();
        pokemonCall.enqueue(new Callback<Pokemon>() {
            @Override
            public void onResponse(Call<Pokemon> call, Response<Pokemon> response) {
                mPokemon = response.body();
                Log.d("Response String", mPokemon.pokemon_name);
            }

            @Override
            public void onFailure(Call<Pokemon> call, Throwable t) {
                Log.d("Call Failure", "A call was made, but it failed");
            }
        });

        Log.d("Done", "This actually finished.");

        // Set default values to the values of this Pokemon
        //ImageView mPokemonImage = (ImageView) v.findViewById(R.id.pokemonImage);
        //mPokemonImage.setImageResource(mPokemon.getImage());

        //TextView mPokemonName = (TextView) v.findViewById(R.id.pokemonName);
        //mPokemonName.setText(mPokemon.pokemon_name);

        /*
        TextView mPokemonType = (TextView) v.findViewById(R.id.pokemonType);
        mPokemonType.setText(mPokemon.getType());

        TextView mPokemonWeight = (TextView) v.findViewById(R.id.pokemonWeight);
        mPokemonWeight.setText("" + mPokemon.getWeight() + "kg");

        TextView mPokemonHeight = (TextView) v.findViewById(R.id.pokemonHeight);
        mPokemonHeight.setText("" + mPokemon.getHeight() + "m");

        TextView mPokemonHP = (TextView) v.findViewById(R.id.pokemonHP);
        mPokemonHP.setText("HP: " + mPokemon.getHP());

        TextView mPokemonAttack = (TextView) v.findViewById(R.id.pokemonAttack);
        mPokemonAttack.setText("Atk: " + mPokemon.getAttack());

        TextView mPokemonDefense = (TextView) v.findViewById(R.id.pokemonDefense);
        mPokemonDefense.setText("Def: " + mPokemon.getDefense());

        TextView mPokemonSpAttack = (TextView) v.findViewById(R.id.pokemonSpAttack);
        mPokemonSpAttack.setText("Sp. Atk: " + mPokemon.getSpAttack());

        TextView mPokemonSpDefense = (TextView) v.findViewById(R.id.pokemonSpDefense);
        mPokemonSpDefense.setText("Sp. Def: " + mPokemon.getSpDefense());

        TextView mPokemonSpeed = (TextView) v.findViewById(R.id.pokemonSpeed);
        mPokemonSpeed.setText("Speed: " + mPokemon.getSpeed());
        */

        return v;
    }


}
