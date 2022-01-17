package com.example.lakvimana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class Login extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ImageSlider imageSlider = (ImageSlider)findViewById(R.id.slider);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Login.this, "Sign in successfully", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Login.this, Dashboard.class);
                startActivity(intent);
            }
        });

        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://tse4.mm.bing.net/th?id=OIP.00LAZMXhxuVxwEQlgO0PKQHaEo&pid=Api&P=0&w=259&h=163",null));
        slideModels.add(new SlideModel("https://tse3.mm.bing.net/th?id=OIP.96KW08ZqRkv7zrc8qbw9VAHaEK&pid=Api&P=0&w=320&h=180",null));
        slideModels.add(new SlideModel("https://tse4.mm.bing.net/th?id=OIP.L7dTX81ERmKAhx-eK8eZ5AHaE7&pid=Api&P=0&w=227&h=152",null));
        imageSlider.setImageList(slideModels);
    }
}