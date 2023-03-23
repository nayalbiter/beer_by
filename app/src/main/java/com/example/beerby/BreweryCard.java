//Carmen Albiter
package com.example.beerby;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.beerby.databinding.BreweryCardBinding;

public class BreweryCard  extends AppCompatActivity {

    private BreweryCardBinding binding2;;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();



        binding2 = BreweryCardBinding.inflate(getLayoutInflater());
        setContentView(binding2.getRoot());




    }
    //when clicked  on the brewery name in the list it displays the brewery card with details
    public void breweryDetailedInfo(View view) {
        Intent intent2 = new Intent(this, BreweryDetailsCard.class);

        startActivity(intent2);

        //creates an intent that opens the activity  Brewery_details_card.xml
    }

    //when clicked  on the map icon in the list it goes to google maps to display the address of the brewery in the map
    public void openLocationInMap(View view) {

        //creates an intent on the imageView that opens google maps
    }
}
