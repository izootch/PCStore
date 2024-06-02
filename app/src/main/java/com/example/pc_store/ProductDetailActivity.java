package com.example.pc_store;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class ProductDetailActivity extends AppCompatActivity {

    private TextView nameTextView, typeTextView, manufacturerTextView, seriesTextView, numberTextView, characteristicsTextView;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

        nameTextView = findViewById(R.id.product_detail_name);
        typeTextView = findViewById(R.id.product_detail_type);
        manufacturerTextView = findViewById(R.id.product_detail_manufacturer);
        seriesTextView = findViewById(R.id.product_detail_series);
        numberTextView = findViewById(R.id.product_detail_number);
        characteristicsTextView = findViewById(R.id.product_detail_characteristics);
        imageView = findViewById(R.id.product_detail_image);

        String name =  getIntent().getStringExtra("name");
        String characteristics =  getIntent().getStringExtra("characteristics");
        String type =  getIntent().getStringExtra("type");
        String manufacturer =  getIntent().getStringExtra("manufacturer");
        String series =  getIntent().getStringExtra("series");
        String image_url =  getIntent().getStringExtra("image_url");


    nameTextView.setText(name);
        typeTextView.setText(type);
        manufacturerTextView.setText(manufacturer);
        seriesTextView.setText(series);
        characteristicsTextView.setText(characteristics);
        Glide.with(this).load(image_url).into(imageView);
    }
}
