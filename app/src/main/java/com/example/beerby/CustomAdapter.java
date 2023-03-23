//Carmen Albiter
package com.example.beerby;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

//this class creates a custom adapter for binding data with RecycleView.
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    private List<BreweryInfo> dataList;
    private Context context;

    public CustomAdapter(Context context,List<BreweryInfo> dataList){
        this.context = context;
        this.dataList = dataList;
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {

        public final View mView;

        ImageView logo;
        TextView breweryName;
        TextView breweryLocation;
        TextView breweryMap;
        ImageView map;


        CustomViewHolder(View itemView) {
            super(itemView);
            mView = itemView;

            logo = mView.findViewById(R.id.beerLog);
            breweryName = mView.findViewById(R.id.breweryName);
            breweryLocation = mView.findViewById(R.id.breweryLocation);
            breweryMap = mView.findViewById(R.id.breweryMap);
            map = mView.findViewById(R.id.map);

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

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}