package com.example.cooked_group5;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class posted_recipes extends AppCompatActivity { //Jack comment test :)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.posted_recipe_layout);
        Intent i = getIntent();

        Button back_Btn = findViewById(R.id.back_btn);
        Button rate_Btn = findViewById(R.id.rate_btn);

        TextView rec_name = findViewById(R.id.rec_id);
        String recipe_name = i.getStringExtra("name");
        rec_name.setText(recipe_name);

        TextView des_name = findViewById(R.id.descr_txt);
        String description_txt = i.getStringExtra("desc");
        des_name.setText(description_txt);

        TextView instruct = findViewById(R.id.instructions_txt);
        String instruct_txt = i.getStringExtra("inst");
        instruct.setText(instruct_txt);

        //listener button for log in button
        rate_Btn.setOnClickListener(L->{
            Intent intent = new Intent(this, rateRec.class);
            intent.putExtra("name", recipe_name);
            startActivity(intent);
        });

        back_Btn.setOnClickListener(L->{
            this.finish();
        });

    }
}