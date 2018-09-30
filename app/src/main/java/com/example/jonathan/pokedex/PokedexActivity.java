package com.example.jonathan.pokedex;

import android.support.v4.app.Fragment;

public class PokedexActivity extends SingleFragmentActivity {

    // Activity creates Pokedex List Fragment
    @Override
    protected Fragment createFragment() {
        return new PokedexFragment();
    }
}
