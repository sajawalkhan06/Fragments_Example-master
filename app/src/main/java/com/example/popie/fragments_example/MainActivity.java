package com.example.popie.fragments_example;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import layout.FragmentOne;
import layout.FragmentTwo;

public class MainActivity extends AppCompatActivity {

    Button fragmentOne, fragmentTwo;
    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentOne = (Button) findViewById(R.id.fragmentOne);
        fragmentTwo = (Button) findViewById(R.id.fragmentTwo);

        fragmentOne.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        fragment = new FragmentOne();
                        getSupportFragmentManager().beginTransaction().addToBackStack(null).replace(R.id.fragment_place, fragment).commit();


                    }
                }
        );

        fragmentTwo.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        fragment = new FragmentTwo();
                        getSupportFragmentManager().beginTransaction().addToBackStack(null).replace(R.id.fragment_place, fragment).commit();

                    }
                }
        );
    }


}
