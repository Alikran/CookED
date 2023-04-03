package com.example.cooked_group5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class rateRec extends AppCompatActivity { //Jack comment test :)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rating_screen);
        Intent i = getIntent();
        DatabaseHelper mDatabaseHelper = new DatabaseHelper(this);

        TextView rec_name = findViewById(R.id.rateTxt);
        String recipe_name = i.getStringExtra("name");
        rec_name.setText("Please select a Rating for: " + recipe_name);

        Button zero_btn = findViewById(R.id.zero_btn);
        Button one_btn = findViewById(R.id.one_btn);
        Button two_btn = findViewById(R.id.two_btn);
        Button three_btn = findViewById(R.id.three_btn);
        Button four_btn = findViewById(R.id.four_btn);
        Button five_btn = findViewById(R.id.five_btn);

        zero_btn.setOnClickListener(L->{
            mDatabaseHelper.updateRating(recipe_name,"0");
            this.finish();
        });

        one_btn.setOnClickListener(L->{
            mDatabaseHelper.updateRating(recipe_name,"1");
            this.finish();
        });

        two_btn.setOnClickListener(L->{
            mDatabaseHelper.updateRating(recipe_name,"2");
            this.finish();
        });

        three_btn.setOnClickListener(L->{
            mDatabaseHelper.updateRating(recipe_name,"3");
            this.finish();
        });

        four_btn.setOnClickListener(L->{
            mDatabaseHelper.updateRating(recipe_name,"4");
            this.finish();
        });

        five_btn.setOnClickListener(L->{
            mDatabaseHelper.updateRating(recipe_name,"5");
            this.finish();
        });

    }
}