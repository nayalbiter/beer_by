//Carmen Albiter
package com.example.beerby;


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.beerby.databinding.BreweryCardBinding;

public class BreweryCard  extends AppCompatActivity {


    private BreweryCardBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = BreweryCardBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }



}
