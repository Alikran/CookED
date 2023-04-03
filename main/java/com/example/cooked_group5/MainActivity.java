package com.example.cooked_group5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import java.util.Hashtable;


public class MainActivity extends AppCompatActivity { //Jack comment test :)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Hashtable accounts = fill(new Hashtable<>());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button LogIn = findViewById(R.id.button);
        TextView user = findViewById(R.id.editTextTextEmailAddress2);
        TextView pass = findViewById(R.id.editTextTextPassword);
        //listener button for log in button
        LogIn.setOnClickListener(L->{
            //implement hash table login w/username & passwords

            String user_ = "";
            user_= user.getText().toString();
            String passWord_ = "";
            passWord_ = pass.getText().toString();

            // out put for debug
            // Log.i(user_, passWord_);
            // Log.i(accounts.get(user_).toString(), "<<");
            // is username and password matched
            if(accounts.containsKey(user_)) {
                if(accounts.get(user_).toString().equals(passWord_)) {
                    Intent intent = new Intent(this, userSelectMenu.class);
                    startActivity(intent);
                }
                // if it doesn't match pass word.
                else {
                    // display text wrong password
                    return;
                }
            }
            // if key doesn't exist.
            else {
                //display text user doesn't exist.
                return;
            }
        });

    }


    // functions to call so that doesn't spaghettify the function above.
    Hashtable<String, String> fill(Hashtable<String, String> acc) {
        acc.put("jack", "jack");
        acc.put("jorge", "123");
        acc.put(".", ".");
        acc.put("daniela", "daniela");
        return acc;
    }
//daniela's test

}