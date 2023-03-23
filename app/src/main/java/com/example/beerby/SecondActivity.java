//Carmen Albiter
package com.example.beerby;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.beerby.databinding.ListResultsBinding;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

//this class initializes an instance of the GetDataService interface, the RecyclerView, and also the adapter.
//Finally, it calls the generateDataList() method.
public class SecondActivity extends AppCompatActivity {

    private ListResultsBinding binding2;
    private CustomAdapter adapter;
    private RecyclerView recyclerView;

    List<BreweryInfo> listOfBreweries;

    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding2 = ListResultsBinding.inflate(getLayoutInflater());
        setContentView(binding2.getRoot());


        progressDialog = new ProgressDialog(SecondActivity.this);
        progressDialog.setMessage("Loading....");
        progressDialog.show();

        /*Create handle for the RetrofitInstance interface*/
        GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
        Call<List<BreweryInfo>> call = service.getAllBreweries();
        call.enqueue(new Callback<List<BreweryInfo>>() {
            @Override
            public void onResponse(Call<List<BreweryInfo>> call, Response<List<BreweryInfo>> response) {
                progressDialog.dismiss();
                generateDataList(response.body());

            }

            @Override
            public void onFailure(Call<List<BreweryInfo>> call, Throwable t) {
                progressDialog.dismiss();
                Toast.makeText(SecondActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    /*Method to generate List of data using RecyclerView with custom adapter*/
    private void generateDataList(List<BreweryInfo> BreweryList) {
        recyclerView = findViewById(R.id.itemInfo);
        for (BreweryInfo b: BreweryList) {
            Log.d("Data:", b.toString());
        }
        adapter = new CustomAdapter(this, BreweryList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(SecondActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
