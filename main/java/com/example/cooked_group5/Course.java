package com.example.cooked_group5;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Course extends AppCompatActivity {

    ArrayList<String> myList;
    ArrayList<Integer> myImages;
    ArrayList<String> myDescription;
    Context myContext;


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {


        RecyclerView nameView = (RecyclerView) findViewById(R.id.listCourses);
        List<String> names = Arrays.asList("Lasagna", "Black-eyed Pea Soup", "New England Clam Chowder","Tomato Soup with Grilled Cheese"
                , "Butternut Squash Soup","Alfredo Shrimp Pasta", "Huevos Rancheros" , "Filipino-Style Chicken Adobo", "Lomo Saltado");
        myList = new ArrayList<>();
        myList.addAll(names);

        List<Integer> foodPics = Arrays.asList(R.drawable.lasagna,R.drawable.soup,R.drawable.tomato,R.drawable.squash,R.drawable.alfredo,
                R.drawable.rancheros,R.drawable.adobo,R.drawable.lomosaltado);
        myImages = new ArrayList<>();
        myImages.addAll(foodPics);

        List<String> mDes = Arrays.asList(
                "Cooking lesson by: The Stay At Home Chef ",
                "Cooking lesson by: Cook E doeFace",
                "Cooking lesson by: Chef Tips",
                "Cooking lesson by: Adam Ragusea",
                "Cooking lesson by: Food Wishes",
                "Cooking lesson by: Natasha's Kitchen",
                "Cooking lesson by: De mi Rancho a Tu Cocina",
                "Cooking lesson by: Pailin's Kitchen",
                "Cooking lesson by: Serious Eats"

        );
        myDescription = new ArrayList<>();
        myDescription.addAll(mDes);

        myContext = this;

        //Define the listener with a lambda and access the name of the list item from the view
        RVClickListener listener = (view,position)->{
            // Handle clicks later

            Intent intent = new Intent(this, EmbeddedYouTube.class);

            //Add the bundle to the intent
            intent.putExtra("pos", String.valueOf(position));

            startActivity(intent);

        };

        courseRecyclerView adapter = new courseRecyclerView(myList, myImages, myDescription, listener, myContext);
        nameView.setHasFixedSize(true);
        nameView.setAdapter(adapter);

        nameView.setLayoutManager(new GridLayoutManager(this, 1)); //use this line to see as a standard vertical list



        return super.onOptionsItemSelected(item);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course);


        RecyclerView nameView = (RecyclerView) findViewById(R.id.listCourses);
        List<String> names = Arrays.asList("Lasagna", "Black-eyed Pea Soup", "New England Clam Chowder","Tomato Soup with Grilled Cheese"
        , "Butternut Squash Soup","Alfredo Shrimp Pasta", "Huevos Rancheros" , "Filipino-Style Chicken Adobo", "Lomo Saltado");
        myList = new ArrayList<>();
        myList.addAll(names);

        List<Integer> foodPics = Arrays.asList(R.drawable.lasagna,R.drawable.soup,R.drawable.chowder,R.drawable.tomato,R.drawable.squash,R.drawable.alfredo,
                R.drawable.rancheros,R.drawable.adobo,R.drawable.lomosaltado);
        myImages = new ArrayList<>();
        myImages.addAll(foodPics);

        List<String> mDes = Arrays.asList(
                "Cooking lesson by: The Stay At Home Chef ",
                "Cooking lesson by: Cook E doeFace",
                "Cooking lesson by: Chef Tips",
                "Cooking lesson by: Adam Ragusea",
                "Cooking lesson by: Food Wishes",
                "Cooking lesson by: Natasha's Kitchen",
                "Cooking lesson by: De mi Rancho a Tu Cocina",
                "Cooking lesson by: Pailin's Kitchen",
                "Cooking lesson by: Serious Eats"

        );
        myDescription = new ArrayList<>();
        myDescription.addAll(mDes);

        myContext = this;

        RVClickListener listener = (view,position)->{
            // Handle clicks later

            //Go to next activity....

            Intent intent = new Intent(this, EmbeddedYouTube.class);
            //Add the bundle to the intent
            intent.putExtra("pos", String.valueOf(position));

            startActivity(intent);

        };

        courseRecyclerView adapter = new courseRecyclerView(myList, myImages, myDescription, listener, myContext);
        nameView.setHasFixedSize(true);
        nameView.setAdapter(adapter);

        nameView.setLayoutManager(new GridLayoutManager(this, 1)); //use this line to see as a standard vertical list



        /******************************************************************************************/

        /******************************************************************************************/

    }
}
