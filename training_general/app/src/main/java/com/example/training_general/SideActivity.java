package com.example.training_general;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class SideActivity extends AppCompatActivity {
    Intent intent;
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_side);
        intent = new Intent(this, MainActivity.class);
        setSpinner();
        onClick();
    }

    public void onClick(){
        button2 = findViewById(R.id.button2);

        button2.setOnClickListener(v -> {
            startActivity(intent);
        });
    }
    public void setSpinner(){
        Spinner spinner = findViewById(R.id.spinner);
        String[] items = {"Item 1", "Item 2", "Item 3"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, /* used items*/items);
        spinner.setAdapter(adapter);
    }
}