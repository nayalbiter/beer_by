//Carmen Albiter
package com.example.beerby;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.example.beerby.databinding.BreweryDetailsCardBinding;

//this class creates an object of BreweryInfo that displays all the information of the brewery
public class BreweryDetailsCard extends AppCompatActivity {

    private BreweryDetailsCardBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = BreweryDetailsCardBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        TextView website = (TextView) binding.breweryWebsite;
        TextView type = (TextView) binding.breweryType;
        TextView address = (TextView) binding.breweryAddress;
        TextView city = (TextView) binding.breweryCity;
        TextView state = (TextView) binding.breweryState;
        TextView zipCode = (TextView) binding.breweryZipCode;
        TextView country = (TextView) binding.breweryCountry;
        TextView phone = (TextView) binding.breweryPhone;

        website.setText("Website: "+SecondActivity.object.GetURL());

        type.setText("Type: "+SecondActivity.object.GetType());

        address.setText("Address: "+SecondActivity.object.GetStreet());

        city.setText("City: "+SecondActivity.object.GetCity());

        state.setText("State: "+SecondActivity.object.GetState());

        zipCode.setText("Zip Code: "+SecondActivity.object.GetZipCode());

        country.setText("Country: "+SecondActivity.object.GetCountry());

        phone.setText("Phone: "+SecondActivity.object.GetPhone());

    }


}
