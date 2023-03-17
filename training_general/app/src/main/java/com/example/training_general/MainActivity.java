package com.example.training_general;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    Button button1;
    ScrollView scrollView;
    LinearLayout linearLayout;
    ImageView imageView;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    LinearLayout.LayoutParams layoutParams;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent = new Intent(MainActivity.this, SideActivity.class);
        // defining variables
        defineVariables();
        // setting margin parameters for imageViews
        setMargin();
        setLinearLayout();
        setImageViews();
        // applying the linearlayout into scrollView as child
        scrollView.addView(linearLayout);
        onClick();
    }
    public void defineVariables(){
        imageView = new ImageView(this);
        imageView2 = new ImageView(this);
        imageView3 = new ImageView(this);
        imageView4 = new ImageView(this);
        scrollView = findViewById(R.id.scrollView);
        linearLayout = new LinearLayout(this);
    }
    public void setMargin(){
        layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, // width
                LinearLayout.LayoutParams.WRAP_CONTENT // height
        );
        layoutParams.setMargins(5, 20, 5, 20);
    }
    public void onClick(){
        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(v -> {
            startActivity(intent);
        });
    }
    public void setLinearLayout(){
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        // adding children to linearlayout created
        linearLayout.addView(imageView);
        linearLayout.addView(imageView2);
        linearLayout.addView(imageView3);
        linearLayout.addView(imageView4);
    }
    public void setImageViews(){
        // first imageView settings

        imageView.setBackgroundResource(R.drawable.list_view_items);
        imageView.setLayoutParams(layoutParams);
        // second imageView settings

        imageView2.setBackgroundResource(R.drawable.list_view_items);
        imageView2.setLayoutParams(layoutParams);

        // third imageView settings

        imageView3.setBackgroundResource(R.drawable.list_view_items);
        imageView3.setLayoutParams(layoutParams);

        // fourth imageView settings

        imageView4.setBackgroundResource(R.drawable.list_view_items);
        imageView4.setLayoutParams(layoutParams);
    }
}