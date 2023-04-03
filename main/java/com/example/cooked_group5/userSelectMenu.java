package com.example.cooked_group5;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class userSelectMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        Log.i("Check0", "plz work");

        //data passing from PostRecipe
        /******************************************************************************************/
        String ingredient = null;
        String instruction = null;
        Intent i = getIntent();
        if(i.hasExtra("ing"))
        {
            ingredient = i.getStringExtra("ing");
            Log.i("userCheck", ingredient);
        }
        if(i.hasExtra("ins"))
        {
            instruction = i.getStringExtra("ins");
            Log.i("instCheck", instruction);
        }
        /******************************************************************************************/

//        String ingredient = i.getStringExtra("ing");
//        Log.i("userCheck", ingredient);
        // initialize buttons
        Button soloBtn = findViewById(R.id.solo_cook_btn);
        Button groupBtn = findViewById(R.id.group_cook_btn);
        Button postRecBtn = findViewById(R.id.post_reci_btn);
        Button courseBtn = findViewById(R.id.course_cook_btn);
        Button testBtn = findViewById(R.id.testing);


        /******************************************************************************************/
        // button listeners
        soloBtn.setOnClickListener(L->{
            Intent intent = new Intent(this, soloOption.class);
            startActivity(intent);
        });
        /******************************************************************************************/

        String finalInstruction = instruction;
        String finalIngredient = ingredient;
        groupBtn.setOnClickListener(L->{
            Intent intent = new Intent(this, GroupCooking.class);
            if(i.hasExtra("ins") && i.hasExtra("ing")) {
                intent.putExtra("inst", finalInstruction);
                intent.putExtra("ingr", finalIngredient);
            }
            startActivity(intent);
        });

        /******************************************************************************************/
        postRecBtn.setOnClickListener(L->{
            Intent intent = new Intent(this, PostRecipe.class);
            startActivity(intent);
        });

        /******************************************************************************************/
        courseBtn.setOnClickListener(L->{
            Intent intent = new Intent(this, Course.class);
            startActivity(intent);
        });
        /******************************************************************************************/

        testBtn.setOnClickListener(Bruh->{
            Intent intent = new Intent(this, TestingSQLite.class);
            startActivity(intent);
        });

    }
}
