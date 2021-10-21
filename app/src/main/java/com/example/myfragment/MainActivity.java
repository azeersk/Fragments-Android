package com.example.myfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Button buttonR,buttonY;
    LinearLayout linear1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonR = findViewById(R.id.RedButton);
        buttonY = findViewById(R.id.YellowButton);
        linear1 = findViewById(R.id.LayoutLinear1);

        buttonR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment1 RedFram = new Fragment1();
                FragmentTransaction ftransation = getSupportFragmentManager().beginTransaction();
                ftransation.replace(R.id.LayoutLinear1, RedFram);
                ftransation.commit();
            }
        });

        buttonY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment2 YellowFram = new Fragment2();
                FragmentTransaction ft =  getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.LayoutLinear1, YellowFram);
                ft.commit();
            }
        });

    }
}