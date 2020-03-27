package com.example.myfragmentproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{

    Button button_alr , button_at;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_at=findViewById(R.id.button1);
        button_at.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentOne frag = new FragmentOne();
                FragmentTransaction ft =fm.beginTransaction();
                ft.replace(R.id.layout,frag,"A");
                ft.commit();
            }
        });
        button_alr=findViewById(R.id.button2);
        button_alr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTwo fragT = new FragmentTwo();
                FragmentTransaction ft =fm.beginTransaction();
                ft.replace(R.id.layout,fragT,"B");
                ft.commit();
            }
        });

    }

  /*  public void changefragment(View view) {
        Fragment fragment ;

        button_alr=findViewById(R.id.button2);
        if(view == button_alr) {
            Log.e("this is pressed","");
            fragment =new FragmentTwo();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft =fm.beginTransaction();
            ft.replace(R.id.frag1,fragment);
            ft.commit();
        }

        }*/
    }

