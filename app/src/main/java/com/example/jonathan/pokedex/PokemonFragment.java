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
    private Pokemon mPokemon;

    private static final String ARG_POKEMON_ID = "pokemon_id";

    public static PokemonFragment newInstance(Pokemon pokemon) {
        Bundle args = new Bundle();
        //args.putString(ARG_POKEMON_ID, pokemonId);
        //mPokemon = pokemon;
        //Log.d("Pokemon Name Test", pokemon.pokemon_name);

        PokemonFragment fragment = new PokemonFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //String pokemonId = (String) getArguments().getString(ARG_POKEMON_ID);

        //mPokemon = PokemonLab.get(getActivity()).getPokemon(pokemonId);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Sets the Pokemon layout.
        View v = inflater.inflate(R.layout.fragment_pokemon, container, false);

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
