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

public class EmbeddedYouTube extends AppCompatActivity {

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
            videoId = "zVqunZUuwSs";
            ingredients= "• 1 pound sweet Italian sausage\n" +
                  "• 1 pound lean ground beef\n" +
                  "• 1 large white onion, minced\n" +
                  "• 5 cloves garlic, crushed\n" +
                  "• 1 (28 ounce can) crushed tomatoes\n" +
                  "• 2 (6 ounce can) tomato paste\n" +
                  "• 1 (15 oz can) tomato sauce\n" +
                  "• 1/2 cup chicken broth\n" +
                  "• 2 tablespoons white sugar\n" +
                  "• 1/2 cup chopped fresh basil\n" +
                  "• 1 teaspoon fennel seeds\n" +
                  "• 1 teaspoon ground oregano\n" +
                  "• 1/2 teaspoon salt\n" +
                  "• 1/4 teaspoon ground black pepper\n" +
                  "• 1/4 cup + 2 tablespoons chopped fresh parsley\n" +
                  "• 1 pound lasagna noodles\n" +
                  "• 30 ounces ricotta cheese\n" +
                  "• 1 large egg\n" +
                  "• 1/2 teaspoon salt\n" +
                  "• 1/8 teaspoon ground nutmeg\n";
            textview.setText(ingredients);
            break;
          case 1:
            videoId = "tFY9fWAEyQo";
            ingredients = "• 1lb bag of dry black eye peas\n" +
                    "• 6 cups of water (hot)\n" +
                    "• 4 bay leaves\n" +
                    "• 4 fresh sage leaves (fresh) or ¼ tsp. dried \n" +
                    "• 3 stems of fresh thyme or ¼ tsp. of dried\n" +
                    "• 1 tsp. of adobo seasoning\n" +
                    "• 1 pack of chicken bouillon cube (Goya brand)\n" +
                    "• 1 tsp. of garlic powder\n" +
                    "• 1 tsp. of onion powder\n" +
                    "• ½ tsp. of cumin\n" +
                    "• 1 medium size yellow onion (diced)\n" +
                    "• ½ shallots (diced)\n" +
                    "• ½ green peppers (diced)\n" +
                    "• 1 ½ tsp of cornstarch\n" +
                    "• 1 piece of smoked turkey wing \n" +
                    "• 2 tbsp. of olive oil\n" +
                    "• Chopped cilantro";
            textview.setText(ingredients);
            break;
          case 2:
            videoId = "_xgU2mIDGho";
            ingredients = "• 4 slices bacon, diced\n" +
                    "• 2 tablespoons unsalted butter\n" +
                    "• 2 cloves garlic, minced\n" +
                    "• 1 onion, diced\n" +
                    "• 1/2 teaspoon dried thyme\n" +
                    "• 3 tablespoons all-purpose flour\n" +
                    "• 1 cup milk\n" +
                    "• 1 cup vegetable stock\n" +
                    "• 2 (6.5-ounce) cans chopped clams, juices reserved\n" +
                    "• 1 bay leaf\n" +
                    "• 2 russet potatoes, peeled and diced\n" +
                    "• 1 cup half and half*\n" +
                    "• Kosher salt and freshly ground black pepper, to taste\n" +
                    "• 2 tablespoons chopped fresh parsley leaves";
            textview.setText(ingredients);
            break;
          case 3:
            videoId = "r4bGuZSur0E";
            ingredients = "• 1 large onion\n" +
                    "• 1 fennel bulb (you could skip this, or replace it with another onion)\n" +
                    "• 1 stick (4 oz, 113g) butter (you could use as little as 1/4 of that)\n" +
                    "• pepper\n" +
                    "• 1 teaspoon celery seeds (very optional)\n" +
                    "• 1/4 cup flour (30g)\n" +
                    "• 2 28 oz (800g) cans of tomatoes (quality matters a lot, and I like Muir Glen in the U.S.)\n" +
                    "• 1 cup (237mL) white wine (very optional)\n" +
                    "• salt\n" +
                    "• water\n" +
                    "• sugar (if the tomatoes aren't sweet enough)\n" +
                    "• tomato paste (if the tomatoes aren tomatoey enough)\n" +
                    "• olive oil, chili flakes and a garlic clove for the chili oil garnish";
            textview.setText(ingredients);
            break;
          case 4:
            videoId = "AlRqh21CfHI";
            ingredients = "• 1 tablespoon olive oil \n" +
                    "• 1 chopped onion \n" +
                    "• 1 cup sliced carrots\n" +
                    "• 6 whole garlic cloves, peeled\n" +
                    "• 2 teaspoons kosher salt, or to taste - divided\n" +
                    "• 1 (3 1/2) pound butternut squash, halved lengthwise and seeded\n"+
                    "• 3 tablespoons unsalted butter\n" +
                    "• 6 large sage leaves\n" +
                    "• 6 cups chicken broth, plus more if needed \n" +
                    "• 2 tablespoons maple syrup\n" +
                    "• 2 tablespoons cider vinegar\n" +
                    "• 1 pinch cayenne pepper\n" +
                    "• ½ cup creme fraiche\n" +
                    "• 1 tablespoon chopped fresh chives";
            textview.setText(ingredients);
            break;
          case 5:
            videoId = "5vy9HeL8mOc";
            ingredients = "• 3/4 lb fettuccine or penne pasta\n" +
                    "• 1 lb shrimp, peeled and deveined\n" +
                    "• 1 Tbsp oil\n" +
                    "• 1 small onion, finely chopped\n" +
                    "• 2 Tbsp butter\n" +
                    "• 1 garlic clove\n" +
                    "• 1/3 cup white wine \n" +
                    "• 2 cups heavy whipping cream\n" +
                    "• 1/3 cup parmesan cheese\n" +
                    "• S&P to taste\n" +
                    "• Sprinkle of paprika\n" +
                    "• Parsley or basil for garnish if desired";
            textview.setText(ingredients);
            break;
          case 6:
            videoId = "hZMJ3h8udpA";
            ingredients =
                    "• 2 medium ripe tomatoes, chopped \n" +
                    "• ¼ cup finely chopped white onion\n" +
                    "• ¼ cup chopped fresh cilantro\n" +
                    "• 2 tablespoons lime juice (about 1 medium lime)\n" +
                    "• ¼ teaspoon fine-grain sea salt\n" +
                    "• ¼ cup finely chopped white onion\n" +
                    "• ¼ teaspoon fine-grain sea salt\n" +
                    "• 1 teaspoon ground cumin\n" +
                    "• 1 ½ cups cooked beans\n" +
                    "• Freshly ground black pepper, to taste\n" +
                    "• ½ teaspoon lime juice\n" +
                    "• 1 ½ cups (12 ounces) of your favorite red salsa,\n" +
                    "• 4 teaspoons extra-virgin olive oil, divided\n" +
                    "• 4 eggs\n" +
                    "• 4 corn tortillas\n" +
                    "• Freshly ground black pepper";
            textview.setText(ingredients);
            break;
          case 7:
            videoId = "aFzYOLfmYgM";
            ingredients = "• boneless skinless chicken thighs \n" +
                    "• soy sauce \n" +
                    "• white vinegar \n" +
                    "• onion and garlic;\n" +
                    "• peppercorns – or coarse cracked pepper;\n" +
                    "• sugar – brown best, white ok;\n" +
                    "• bay leaves – fresh or dried, not the end of the world if you don’t have; and\n" +
                    "• green onion – optional garnish";
            textview.setText(ingredients);
            break;
          case 8:
            videoId = "HquhCYq9WKc";
            ingredients = "• 2 tablespoons vegetable oil, divided\n" +
                    "• 1 lb sirloin steak, cut into strips\n" +
                    "• salt, to taste\n" +
                    "• black pepper, to taste\n" +
                    "• ½ red onion, sliced\n" +
                    "• 1 medium tomato, sliced\n" +
                    "• 2 cloves garlic, minced\n" +
                    "• 1 tablespoon aji amarillo paste\n" +
                    "• 2 tablespoons soy sauce\n" +
                    "• 1 tablespoon white vinegar\n" +
                    "• 1 tablespoon fresh cilantro, chopped\n" +
                    "• 1 lb french fries, cooked, hot\n" +
                    "• white rice, cooked, for serving, optional";
            textview.setText(ingredients);
            break;
        }

        youTubePlayer.cueVideo(videoId, 0);
      }
    });
  }





}
