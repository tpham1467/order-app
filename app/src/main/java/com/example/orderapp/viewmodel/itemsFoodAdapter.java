package com.example.orderapp.viewmodel;


import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.orderapp.R;
import com.example.orderapp.model.foodItem;

import java.util.List;

public class itemsFoodAdapter extends RecyclerView.Adapter<itemsFoodAdapter.ViewHolder> {

    private Context context;
    List<foodItem> foodItems;

    public itemsFoodAdapter(Context context) {
        this.context = context;
    }

    public void setData(List<foodItem> items){
        this.foodItems = items;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.foods_item,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        foodItem foodItem = foodItems.get(position);
        holder.tvTitle.setText(foodItem.getTitle());
        holder.tvCost.setText((String) foodItem.getCost());

        holder.itemView.findViewById(R.id.ll_fooditem).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFeedbackDialog(Gravity.CENTER);
            }

            private void openFeedbackDialog(int gravity){
                final Dialog dialog = new Dialog (context);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.layout_dialog_add_food_for_table);

                Window window = dialog.getWindow();
                if(window==null){
                    return;
                }

                window.setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
                window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

                WindowManager.LayoutParams windowAttributes = window.getAttributes();
                windowAttributes.gravity= gravity;
                window.setAttributes(windowAttributes);

                if(Gravity.BOTTOM == gravity){
                    dialog.setCancelable(true);
                } else{
                    dialog.setCancelable(false);
                }

                //EditText edtFeedback = dialog.findViewById(R.id.edt_feedback);
                Button btnNoThanks = dialog.findViewById(R.id.btn_no_thanks);
                Button btnSend = dialog.findViewById(R.id.btn_send);

                btnNoThanks.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                btnSend.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        //Toast.makeText(context,"Send feedback", Toast.LENGTH_SHORT).show();
                    }
                });
                dialog.show();
            }
        });
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
        private TextView tvCost;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvTitle = itemView.findViewById(R.id.tv_title);
            tvCost = itemView.findViewById(R.id.tv_cost);
        }
    }

}
