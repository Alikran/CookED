package com.example.cooked_group5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class soloOption extends AppCompatActivity {

    ArrayList<String>  myList;
    ArrayList<Integer> myImages;
    ArrayList<String> myDescription;
    Context myContext;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        RecyclerView nameView = (RecyclerView) findViewById(R.id.recyler_view);

        List<String> names = Arrays.asList("Szechuan Beef Noodles", "Cajun Chicken Sandwich", "Turkey Meatball Flatbread","House Burgers", "Mushroom & Chive Risotto", "Pork Bulgogi Bowls");
        myList = new ArrayList<>();
        myList.addAll(names);

        List<Integer> foodPics = Arrays.asList(R.drawable.zecbeefnoodles,R.drawable.cajunsandwich,R.drawable.turkeyflat,R.drawable.houseburger,R.drawable.mandc,R.drawable.porkbowl);
        myImages = new ArrayList<>();
        myImages.addAll(foodPics);

        List<String> mDes = Arrays.asList(
                "Combines zingy, spicy, Szechuan paste with tangy-sweet soy glaze, beef stock concentrate, and a sprinkle of sugar",
                "Crispy chicken between two toasted buns, spread with spicy-mayo relish, topped off with pickles, and served with crispy potato wedges",
                "Turkey meatballs, tossed in an herby tomato sauce. Layered over the crusts with mozzarella and roasted pepper and onion, then baked until they reach crispy-melty-saucy perfection",
                "Juicy beef patties topped with melted cheddar, sweet griddled onion, ripe tomato slices, and served with crispy potato wedges",
                "Al dente and creamy rice in garlicky butter topped off with tomatoes, crispy mushrooms, and a generous dollop of garlic herb butter, then garnished with chives and Parmesan ",
                "Pork cooked in a sesame and soy sauce marinade with peppery sweetness, with crisp quick-pickled cucumbers, tender carrots, and a spicy crema, all over fluffy rice"
                );
        myDescription = new ArrayList<>();
        myDescription.addAll(mDes);

        myContext = this;

        //Define the listener with a lambda and access the name of the list item from the view
        RVClickListener listener = (view,position)->{
            // Handle clicks later
            Intent intent = new Intent(this, soloYTvid.class);

            //Add the bundle to the intent
            intent.putExtra("pos", String.valueOf(position));
            startActivity(intent);
        };

        myAdapter adapter = new myAdapter(myList, myImages, myDescription, listener, myContext);
        nameView.setHasFixedSize(true);
        nameView.setAdapter(adapter);

        nameView.setLayoutManager(new GridLayoutManager(this, 1)); //use this line to see as a standard vertical list

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.solo_option);
        RecyclerView nameView = (RecyclerView) findViewById(R.id.recyler_view);

        List<String> names = Arrays.asList("Szechuan Beef Noodles", "Cajun Chicken Sandwich", "Turkey Meatball Flatbread","House Burgers", "Mushroom & Chive Risotto", "Pork Bulgogi Bowls");
        myList = new ArrayList<>();
        myList.addAll(names);

        List<Integer> foodPics = Arrays.asList(R.drawable.zecbeefnoodles,R.drawable.cajunsandwich,R.drawable.turkeyflat,R.drawable.houseburger,R.drawable.mandc,R.drawable.porkbowl);
        myImages = new ArrayList<>();
        myImages.addAll(foodPics);

        List<String> mDes = Arrays.asList(
                "Combines zingy, spicy, Szechuan paste with tangy-sweet soy glaze, beef stock concentrate, and a sprinkle of sugar",
                "Crispy chicken between two toasted buns, spread with spicy-mayo relish, topped off with pickles, and served with crispy potato wedges",
                "Turkey meatballs, tossed in an herby tomato sauce. Layered over the crusts with mozzarella and roasted pepper and onion, then baked until they reach crispy-melty-saucy perfection",
                "Juicy beef patties topped with melted cheddar, sweet griddled onion, ripe tomato slices, and served with crispy potato wedges",
                "Al dente and creamy rice in garlicky butter topped off with tomatoes, crispy mushrooms, and a generous dollop of garlic herb butter, then garnished with chives and Parmesan ",
                "Pork cooked in a sesame and soy sauce marinade with peppery sweetness, with crisp quick-pickled cucumbers, tender carrots, and a spicy crema, all over fluffy rice"
        );
        myDescription = new ArrayList<>();
        myDescription.addAll(mDes);

        myContext = this;

        //Define the listener with a lambda and access the name of the list item from the view
        RVClickListener listener = (view,position)->{
            // Handle clicks later
            Intent intent = new Intent(this, soloYTvid.class);

            //Add the bundle to the intent
            intent.putExtra("pos", String.valueOf(position));
            startActivity(intent);
        };

        myAdapter adapter = new myAdapter(myList, myImages, myDescription, listener, myContext);
        nameView.setHasFixedSize(true);
        nameView.setAdapter(adapter);

        nameView.setLayoutManager(new GridLayoutManager(this, 1)); //use this line to see as a standard vertical list
    }

}
