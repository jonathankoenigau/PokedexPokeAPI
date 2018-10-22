package com.example.jonathan.pokedex;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PokedexFragment extends Fragment {
    private RecyclerView mPokemonRecyclerView;
    private PokemonAdapter mAdapter;

    @Override
    public void onResume() {
        super.onResume();
        updateUI();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pokedex_list, container, false);

        mPokemonRecyclerView = (RecyclerView) view.findViewById((R.id.pokemon_recycler_view));
        mPokemonRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        updateUI();

        return view;
    }

    public void updateUI() {
        PokemonLab pokemonLab = PokemonLab.get(getActivity());
        List<String> pokedex = pokemonLab.getPokedex();

        if (mAdapter == null) {
            mAdapter = new PokemonAdapter(pokedex);
            mPokemonRecyclerView.setAdapter(mAdapter);
        }
        else {
            mAdapter.notifyDataSetChanged();
        }
    }

    private class PokemonHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private String mPokemon;
        //private ImageView mPokemonImageView;
        private TextView mNameTextView;

        public PokemonHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.list_item_pokemon, parent, false));
            itemView.setOnClickListener(this);

            mNameTextView = (TextView) itemView.findViewById(R.id.pokemonName);
        }

        public void bind(String pokemon) {
            mPokemon = pokemon;
            //mPokemonImageView.setImageResource(mPokemon.getImage());
            mNameTextView.setText(mPokemon);
        }

        @Override
        public void onClick(View view) {
            Intent intent = PokemonActivity.newIntent(getActivity(), mPokemon);
            startActivity(intent);
        }
    }

    private class PokemonAdapter extends RecyclerView.Adapter<PokemonHolder> {
        private List<String> mPokedex;

        public PokemonAdapter(List<String> pokedex) {
            mPokedex = pokedex;
        }

        @Override
        public PokemonHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());

            return new PokemonHolder(layoutInflater, parent);
        }

        @Override
        public void onBindViewHolder(@NonNull PokemonHolder holder, int position) {
            String pokemon = mPokedex.get(position);
            holder.bind(pokemon);
        }

        @Override
        public int getItemCount() {
            return mPokedex.size();
        }
    }
}
