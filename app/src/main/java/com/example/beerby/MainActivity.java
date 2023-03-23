//Carmen Albiter
package com.example.beerby;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


import com.example.beerby.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();

    private ActivityMainBinding binding;

    ActivityResultLauncher<Intent> Launcher;


    //*********************************************************************************************\\
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        this.Launcher = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult result) {
                        if(result.getResultCode() == Activity.RESULT_OK){

                            System.out.println("launcher working fine");
                        }
                    }
                });

    }


    //*********************************************************************************************\\
    //this method is used to show the user what option was selected from the toolbar items
    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }


    //*********************************************************************************************\\
    //this method is used to go to the homepage of the app
    public void backHome() {
        Intent intent = new Intent(this, MainActivity.class);
        Launcher.launch(intent);

    }

    //*********************************************************************************************\\
    //this method is used to show an alert when the user tries to exit the application
    public void alert(){
        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Are you sure to exit?")
                .setMessage("Exiting will close the app.")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        displayToast("Thanks for staying!   :=)");
                    }
                })
                .show();
    }



    //*********************************************************************************************\\
    //this method shows the items that are part of the menu in the toolbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        //this item is used to go to the homepage of the app
        MenuItem mHome = menu.getItem(0);
        mHome.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {

                backHome();
                return false;
            }
        });


        //this item is used to exit the application
        MenuItem mLeave = menu.getItem(1);
        mLeave.setOnMenuItemClickListener(
                new MenuItem.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {

                        alert();
                        return false;
                    }
                }
        );
        return true;
    }



    //*********************************************************************************************\\
    //this method handles the action bar item clicks
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();


        return super.onOptionsItemSelected(item);
    }


    //*********************************************************************************************\\
    //ToDO
    //from the buttons used to define search by city, state or zip code
    public void onRadioButtonClicked(View view) {

        //getting the buttons from the radio group
        RadioGroup rg = (RadioGroup) binding.includeContainer.radioGroup;

        //getting the id of the button pressed in the radio group
        int pressedButtonID = rg.getCheckedRadioButtonId();

        //finding the radio button pressed
        RadioButton rb = (RadioButton) rg.findViewById(pressedButtonID);

        String pressedButton = rb.getText().toString();

        //TODo
        // Check which radio button was clicked.
        switch (pressedButton) {
            case "City":
                displayToast(getString(R.string.cityB));
                break;
            case "State":
                displayToast(getString(R.string.stateB));
                break;
            case "Zip Code":
                displayToast(getString(R.string.zipCodeB));
                break;
            default:
                // Do nothing.
                break;
        }
    }


    //*********************************************************************************************\\
    //ToDo
    //this method creates an intent that opens a second Activity that shows the recycler view list of the http request


    public void showAListOfResults(View view) {

        Log.d(LOG_TAG, "Button clicked!");

        Intent intent2 = new Intent(this, SecondActivity.class);
        //Launcher.launch(intent2);

        startActivity(intent2);

    }



}