//Carmen Albiter
package com.example.beerby;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

//import com.example.beerby.databinding.BreweryCard;
import com.example.beerby.databinding.BreweryCardBinding;

public class BreweryCard  extends AppCompatActivity {

    public static int chosenBrewery;
    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }

    private BreweryCardBinding binding;;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();

        binding = BreweryCardBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //RadioGroup rg = (RadioGroup) binding.includeContainer.radioGroup;

        TextView textV  = (TextView) binding.breweryName;
        Intent intent2 = new Intent(this, BreweryDetailsCard.class);
        startActivity(intent2);

        int a;



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
