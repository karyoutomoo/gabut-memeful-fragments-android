package com.itsjustfaiq.rectanglefragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().replace(R.id.container, new FragmentHome()).commit();
    }
    public void gotoFragmentHome(View view){
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new FragmentHome()).commit();
    }
    public void gotoFragmentProfile(View view){
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new FragmentProfile()).commit();
    }
    public void gotoFragmentGallery(View view){
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new FragmentGallery()).commit();
    }
}