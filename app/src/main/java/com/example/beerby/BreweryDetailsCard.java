//Carmen Albiter
package com.example.beerby;

import android.os.Bundle;

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

        website.setText(getString(R.string.url)+SecondActivity.object.GetURL());

        type.setText(getString(R.string.type)+SecondActivity.object.GetType());

        address.setText(getString(R.string.address)+SecondActivity.object.GetStreet());

        city.setText(getString(R.string.cityToShow)+SecondActivity.object.GetCity());

        state.setText(getString(R.string.stateToShow)+SecondActivity.object.GetState());

        zipCode.setText(getString(R.string.zipCodeToShow)+SecondActivity.object.GetZipCode());

        country.setText(getString(R.string.countryToShow)+SecondActivity.object.GetCountry());

        phone.setText(getString(R.string.phoneToShow)+SecondActivity.object.GetPhone());


    }


}
