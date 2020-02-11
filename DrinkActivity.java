package com.hfad.coffeina;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends Activity {
    public static final String EXTRA_DRINKID = "drinkId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        // Pobieramy identyfikator napoju z intencji
        int drinkId = (Integer)getIntent().getExtras().get(EXTRA_DRINKID);
        Drink drink = Drink.drinks[drinkId];

        //Wyświetlamy nazwę napoju
        TextView name = (TextView)findViewById(R.id.name);
        name.setText(drink.getName());

        // Wyświetlamy opis napoju
        TextView description = (TextView)findViewById(R.id.description);
        description.setText(drink.getDescription());

        // Wyświetlamy zdjęcie napoju
        ImageView photo = (ImageView)findViewById(R.id.photo);
        photo.setImageResource(drink.getImageResourceId());
        photo.setContentDescription(drink.getName());
    }
}
