//Carmen Albiter
package com.example.beerby;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

//this class creates a custom adapter for binding data with RecycleView.
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    private List<BreweryInfo> dataList;
    private Context context;
private SelectListener listener;


    public CustomAdapter(Context context,List<BreweryInfo> dataList, SelectListener listener){
        this.context = context;
        this.dataList = dataList;
        this.listener = listener;
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {

        public final View mView;

        ImageView logo;
        TextView breweryName;
        TextView breweryLocation;




        CustomViewHolder(View itemView) {
            super(itemView);
            mView = itemView;

            logo = mView.findViewById(R.id.beerLog);
            breweryName = mView.findViewById(R.id.breweryName);
            breweryLocation = mView.findViewById(R.id.breweryLocation);




        }


    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.brewery_card, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        holder.breweryName.setText(dataList.get(position).GetName());
        holder.breweryLocation.setText(dataList.get(position).GetStreet());
        int a = position;
        holder.breweryName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemClicked(dataList.get(a));
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}