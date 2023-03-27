package com.example.orderapp.viewmodel;


import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.orderapp.R;
import com.example.orderapp.model.tableItem;

import java.util.List;

public class tablesAdapter extends RecyclerView.Adapter<tablesAdapter.ViewHolder> {

    private Context context;
    List<tableItem> tableItems;
    List<tableItem> tableItemsOpening;

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
        if(tables.isStatus()==0){
            holder.tvStatus.setText("Opening");
        }
        else if(tables.isStatus()==1){
            holder.tvStatus.setText("Serving");
        }
        else{
            holder.tvStatus.setText("Served");
        }
        holder.tvNumServed.setText(Integer.toString(tables.getNumServed()));
        holder.tvTotalServe.setText(Integer.toString(tables.getTotalServe()));
        holder.tvCostFoods.setText(tables.getTotalCostFood().toString());

        holder.llTableItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("nameTable", tables.getNameTable().toString());
                Navigation.findNavController(view).navigate(R.id.action_serve_to_detailsOrder2, bundle);
            }
        });
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
        private LinearLayout llTableItem;
        private Switch swStatus;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNameTable = itemView.findViewById(R.id.tv_nametable);
            tvStatus = itemView.findViewById(R.id.tv_status);
            tvNumServed = itemView.findViewById(R.id.tv_numserved);
            tvTotalServe = itemView.findViewById(R.id.tv_totalserve);
            tvCostFoods = itemView.findViewById(R.id.tv_totalcostfood);
            llTableItem = itemView.findViewById(R.id.ll_tableitem);
            swStatus = itemView.findViewById(R.id.swStatus);

            swStatus.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {

                    } else {
                        // Xử lý khi switch được chuyển sang trạng thái tắt
                    }
                }
            });
        }
    }

}
