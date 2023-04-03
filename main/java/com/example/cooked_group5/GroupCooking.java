package com.example.cooked_group5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupCooking extends AppCompatActivity {

    Context myContext;
    private static final String TAG = "ListDataActivity";
    DatabaseHelper mDatabaseHelper;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        RecyclerView nameView = (RecyclerView) findViewById(R.id.recyler_view2);

        mDatabaseHelper = new DatabaseHelper(this);
        myContext = this;
        Cursor data = mDatabaseHelper.getData();
        ArrayList<String> listData = new ArrayList<>();
        ArrayList<String> myInstructions = new ArrayList<>();
        ArrayList<String> myDesc = new ArrayList<>();
        ArrayList<String> myRate = new ArrayList<>();
        while(data.moveToNext()){
            //get the value from the database in column 1
            //then add it to the ArrayList
            listData.add(data.getString(1));
            myInstructions.add(data.getString(2));
            myDesc.add(data.getString(3));
            myRate.add(data.getString(4));
        }
        //Define the listener with a lambda and access the name of the list item from the view
        RVClickListener listener = (view,position)->{
            // Handle clicks later
            String description = myDesc.get(position);
            String instructions = myInstructions.get(position);
            String name = listData.get(position);

            Intent intent = new Intent(this, posted_recipes.class);
            intent.putExtra("name", name);
            intent.putExtra("inst", instructions);
            intent.putExtra("desc", description);
            startActivity(intent);
        };

        groupAdapter adapter = new groupAdapter(listData, myInstructions, myDesc,myRate,listener, myContext);
        nameView.setHasFixedSize(true);
        nameView.setAdapter(adapter);

        nameView.setLayoutManager(new GridLayoutManager(this, 1)); //use this line to see as a standard vertical list

        return super.onOptionsItemSelected(item);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.group_cooking);
        mDatabaseHelper = new DatabaseHelper(this);

        // passed data from userSelectMenu
        RecyclerView nameView = (RecyclerView) findViewById(R.id.recyler_view2);
        Cursor data = mDatabaseHelper.getData();
        ArrayList<String> listData = new ArrayList<>();
        ArrayList<String> myInstructions = new ArrayList<>();
        ArrayList<String> myDesc = new ArrayList<>();
        ArrayList<String> myRate = new ArrayList<>();
        while(data.moveToNext()){
            //get the value from the database in column 1
            //then add it to the ArrayList
            listData.add(data.getString(1));
            myInstructions.add(data.getString(2));
            myDesc.add(data.getString(3));
            myRate.add(data.getString(4));
        }
        //Define the listener with a lambda and access the name of the list item from the view
        RVClickListener listener = (view,position)->{
            // Handle clicks later
            String description = myDesc.get(position);
            String instructions = myInstructions.get(position);
            String name = listData.get(position);

            Intent intent = new Intent(this, posted_recipes.class);
            intent.putExtra("name", name);
            intent.putExtra("inst", instructions);
            intent.putExtra("desc", description);
            startActivity(intent);
        };

        groupAdapter adapter = new groupAdapter(listData, myInstructions, myDesc,myRate,listener, myContext);
        nameView.setHasFixedSize(true);
        nameView.setAdapter(adapter);

        nameView.setLayoutManager(new GridLayoutManager(this, 1)); //use this line to see as a standard vertical list

    }

}
