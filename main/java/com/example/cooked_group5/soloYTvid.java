package com.example.cooked_group5;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;


import java.util.Hashtable;

public class soloYTvid extends AppCompatActivity {

    private YouTubePlayerView youtubePlayer;
    String ingredients = "";
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson);

        //creating a wat to initialize the youtube cooking courses
        youtubePlayer = findViewById(R.id.EmbeddedYouTube_youtubePlayerView);
        getLifecycle().addObserver(youtubePlayer);

        textview = findViewById(R.id.ingred);

        Intent i = getIntent();
        //Extract the data…
        String temp = i.getStringExtra("pos");
        int key = Integer.valueOf(temp);
        //plays videos
        youtubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = "";
                //switch case to determine what video to watch
                switch(key){
                    case 0:
                        videoId = "ZiM-UAyoN3U";
                        ingredients= "• 2 unit Scallions\n" +
                                "• 4 ounce Shredded Red Cabbage\n" +
                                "• 10 ounce Ground Beef\n" +
                                "• 2 tablespoon Szechuan Paste\n" +
                                "• 1 unit Beef Stock Concentrate\n" +
                                "• 4 tablespoon Sweet Soy Glaze\n" +
                                "• 6 ounce Ramen Noodles\n" +
                                "• 1/2 cup chicken broth\n" +
                                "• 1 tablespoon Sesame Seeds\n";
                        textview.setText(ingredients);
                        break;
                    case 1:
                        videoId = "1WerrbJDlcw";
                        ingredients = "• 10 ounce Chicken Cutlets\n" +
                                "• 2 unit Brioche Buns\n" +
                                "• 2 tablespoon Cajun Spice Blend\n" +
                                "• ½ cup Flour \n" +
                                "• 1 teaspoon Hot Sauce\n" +
                                "• 1 unit Sliced Dill Pickle\n" +
                                "• 1 tablespoon Cornstarch\n" +
                                "• 4 tablespoon Sour Cream\n" +
                                "• 2 tablespoon Mayonnaise\n" +
                                "• 12 ounce Yukon Gold Potatoes\n";
                        textview.setText(ingredients);
                        break;
                    case 2:
                        videoId = "sXrtvVr0JjM";
                        ingredients = "• 1 unit Green Bell Pepper\n" +
                                "• 1 unit Yellow Onion\n" +
                                "• 8 ounce Pre-Cooked Turkey Meatballs\n" +
                                "• 2 unit Flatbreads\n" +
                                "• 1.5 ounce Tomato Paste\n" +
                                "• ½ cup Mozzarella Cheese\n" +
                                "• 1 teaspoon Italian Seasoning\n";
                        textview.setText(ingredients);
                        break;
                    case 3:
                        videoId = "WpNKq7NHQmc";
                        ingredients = "• 1 unit Yellow Onion\n" +
                                "• 1 unit Roma Tomato\n" +
                                "• 1 teaspoon Garlic Powder\n" +
                                "• 2 tablespoon Ketchup\n" +
                                "• 2 tablespoon Sour Cream\n" +
                                "• ½ cup Cheddar Cheese\n" +
                                "• 12 ounce Yukon Gold Potatoes\n" +
                                "• 2 unit Potato Buns\n" +
                                "• 5 teaspoon White Wine Vinegar\n" +
                                "• 2 teaspoon Dijon Mustard\n" +
                                "• 10 ounce Ground Beef\n";
                        textview.setText(ingredients);
                        break;
                    case 4:
                        videoId = "DuketvQuM5g";
                        ingredients = "• 2 unit Veggie Stock Concentrate\n" +
                                "• 4 ounce Button Mushrooms\n" +
                                "• 1 unit Yellow Onion\n" +
                                "• 1 clove Garlic\n" +
                                "• ¾ cup Arborio Rice\n" +
                                "• 4 ounce Grape Tomatoes\n"+
                                "• ¼ ounce Chives\n" +
                                "• 2 tablespoon Garlic Herb Butter\n" +
                                "• ¼ cup Parmesan Cheese\n" +
                                "• 1 teaspoon Chili Flakes\n";
                        textview.setText(ingredients);
                        break;
                    case 5:
                        videoId = "qk9PcCnt0v8";
                        ingredients = "• ½ cup Jasmine Rice\n" +
                                "• 1 unit Scallions\n" +
                                "• 5 teaspoon White Wine Vinegar\n" +
                                "• 1 unit Cucumber\n" +
                                "• 4 ounce Shredded Carrots\n" +
                                "• 10 ounce Ground Beef\n" +
                                "• 1 tablespoon Sesame Seeds\n" +
                                "• 4 ounce Bulgogi Sauce\n" +
                                "• 4 tablespoon Sour Cream\n" +
                                "• 1 teaspoon Sriracha\n";
                        textview.setText(ingredients);
                        break;
                }
                youTubePlayer.cueVideo(videoId, 0);
            }
        });
    }





}


