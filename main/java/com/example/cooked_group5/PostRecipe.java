package com.example.cooked_group5;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PostRecipe extends AppCompatActivity {
EditText instructionEdit;
EditText ingredientEdit;
EditText descriptionEdit;
DatabaseHelper mDatabaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.post_recipe);


        Button Back = findViewById(R.id.back1);
        /******************************************************************************************/
        // button listeners
        Back.setOnClickListener(L->{
            instructionEdit = (EditText)findViewById(R.id.instructionInput);
            ingredientEdit  = (EditText)findViewById(R.id.ingredientInput);
            descriptionEdit = (EditText)findViewById(R.id.des_input);
            mDatabaseHelper = new DatabaseHelper(this);

            String msg, msg2, msg3, msg4;
            msg = ingredientEdit.getText().toString();
            msg2 = instructionEdit.getText().toString();
            msg3 = descriptionEdit.getText().toString();
            msg4 = "0";
            Log.i("testing ingredient", msg);
            Log.i("testing instruction", msg2);
            Log.i("testing instruction", msg3);

            Toast.makeText(PostRecipe.this, "Posted your recipe: " + msg + " into posted recipes!",Toast.LENGTH_LONG).show();

            if(ingredientEdit.length() != 0)
            {
                AddData(msg,msg2,msg3,msg4);
                toastMessage("db contains" + mDatabaseHelper.getData());
            }
            Intent intent = new Intent(this, userSelectMenu.class);

            intent.putExtra("ing", msg);
            intent.putExtra("ins", msg2);

            startActivity(intent); //switches to main menu
        });
        /******************************************************************************************/
        //Silver you mux
    }
    /******************************************************************************************/
    //see works cited in DatabaseHelper.java
    public void AddData(String newEntry, String newEntry2, String newEntry3, String newEntry4) {
        boolean insertData = mDatabaseHelper.addData(newEntry,newEntry2,newEntry3,newEntry4);

        if (insertData) {
            toastMessage("Data Successfully Inserted!");
        } else {
            toastMessage("Something went wrong");
        }
    }

    private void toastMessage(String message){
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show();
    }
    /******************************************************************************************/
}
