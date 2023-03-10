package com.example.potfolioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.potfolioapp.cv.CVFragment;
import com.example.potfolioapp.home.HomeFragment;
import com.example.potfolioapp.portfolio.PortfolioFragment;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();
       // setHomeFragment();
       setPortfoliofragment();
       // setTeamFragment();
       // setCVFreagment();
    }

    void setPortfoliofragment(){
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new PortfolioFragment()).commit();
    }

    void setTeamFragment(){
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new TeamFragment()).commit();
    }

    void setCVFreagment(){
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new CVFragment()).commit();
    }


    void setHomeFragment(){

        getSupportFragmentManager().beginTransaction().replace(R.id.container,new HomeFragment()).commit();

    }
}