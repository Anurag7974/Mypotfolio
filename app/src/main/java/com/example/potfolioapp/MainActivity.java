package com.example.potfolioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.potfolioapp.home.HomeFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        setHomeFragment();
    }

    void setHomeFragment(){

        getSupportFragmentManager().beginTransaction().replace(R.id.container,new HomeFragment()).commit();

    }
}