package com.example.orderapp;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.orderapp.model.foodItem;
import com.example.orderapp.model.tableItem;

import java.util.List;

public class tablesAdapter extends RecyclerView.Adapter<tablesAdapter.ViewHolder> {

    private Context context;
    List<tableItem> tableItems;

    public tablesAdapter(Context context) {
        this.context = context;
    }

    public void setData(List<tableItem> items){
        this.tableItems = items;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tables_item,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        tableItem tables = tableItems.get(position);

        holder.tvNameTable.setText(tables.getNameTable().toString());
        if(tables.isStatus()){
            holder.tvStatus.setText("Served");
        }
        else{
            holder.tvStatus.setText("Serving");
        }
        holder.tvNumServed.setText(Integer.toString(tables.getNumServed()));
        holder.tvTotalServe.setText(Integer.toString(tables.getTotalServe()));
        holder.tvCostFoods.setText(tables.getTotalCostFood().toString());
    }

    @Override
    public int getItemCount() {
        if(tableItems != null){
            return tableItems.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tvNameTable;
        private TextView tvStatus;
        private TextView tvNumServed;
        private TextView tvTotalServe;
        private TextView tvCostFoods;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNameTable = itemView.findViewById(R.id.tv_nametable);
            tvStatus = itemView.findViewById(R.id.tv_status);
            tvNumServed = itemView.findViewById(R.id.tv_numserved);
            tvTotalServe = itemView.findViewById(R.id.tv_totalserve);
            tvCostFoods = itemView.findViewById(R.id.tv_totalcostfood);
        }
    }

}
