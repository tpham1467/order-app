package com.example.orderapp.viewmodel;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.orderapp.R;
import com.example.orderapp.model.foodItem;

import java.util.List;

public class foodsOrderAdapter extends RecyclerView.Adapter<foodsOrderAdapter.ViewHolder> {

    private Context context;
    List<foodItem> foodItems;

    public foodsOrderAdapter(Context context) {
        this.context = context;
    }

    public void setData(List<foodItem> items){
        this.foodItems = items;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.details_food,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        foodItem foodItem = foodItems.get(position);
        holder.tvTitle.setText(foodItem.getTitle());
        holder.tvCostFood.setText((String) foodItem.getCost());
        holder.tvDescrip.setText(foodItem.getCost());
        if(foodItem.isStatus()){
            holder.tvStatusServe.setText("Done");
        }
        else{
            holder.tvStatusServe.setText("Not done");
        }
    }

    @Override
    public int getItemCount() {
        if(foodItems != null){
            return foodItems.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView tvTitle;
        private TextView tvCostFood;
        private TextView tvStatusServe;
        private TextView tvDescrip;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvTitle = itemView.findViewById(R.id.tv_nameFood);
            tvCostFood = itemView.findViewById(R.id.tv_costfood);
            tvStatusServe = itemView.findViewById(R.id.tv_statusserve);
            tvDescrip = itemView.findViewById(R.id.tv_details);
        }
    }

}
