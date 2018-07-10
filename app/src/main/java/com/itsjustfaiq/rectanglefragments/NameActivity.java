package com.itsjustfaiq.rectanglefragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NameActivity extends AppCompatActivity {

    TextView displayNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);
        displayNama = findViewById(R.id.tvDisplayNama);
        String namaPanggil = getIntent().getStringExtra("DISPLAY NAMA");
        displayNama.setText(namaPanggil);
    }
}
