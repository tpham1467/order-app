package com.example.orderapp.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.orderapp.R;
import com.example.orderapp.viewmodel.customerOrderedAdapter;
import com.example.orderapp.viewmodel.foodsOrderAdapter;
import com.example.orderapp.viewmodel.itemsFoodAdapter;
import com.example.orderapp.model.foodItem;

import java.util.ArrayList;
import java.util.List;

public class HisDetailOrdered extends Fragment {

    private RecyclerView recyclerListFoods;
    private foodsOrderAdapter foodsOrAdapter;
    private LinearLayout navHome;
    private LinearLayout navHis;
    private LinearLayout navAcc;
    private LinearLayout navSer;
    private LinearLayout navAccount;
    private String nameCustom;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        if (bundle != null) {
            nameCustom = bundle.getString("nameCustom");
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_his_detail_ordered, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerListFoods = view.findViewById(R.id.rv_his_detail_ordered);
        foodsOrAdapter = new foodsOrderAdapter(view.getContext());

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext(),recyclerListFoods.VERTICAL,false);
        recyclerListFoods.setLayoutManager(linearLayoutManager);
        foodsOrAdapter.setData(getListItem());
        recyclerListFoods.setAdapter(foodsOrAdapter);

        TextView tvNameTable = view.findViewById(R.id.textView1);
        tvNameTable.setText(nameCustom);

        navHome = view.findViewById(R.id.nav_home);
        navSer = view.findViewById(R.id.nav_serve);
        navAccount = view.findViewById(R.id.nav_account);
//        navAcc = view.findViewById(R.id.nav_account);

        navHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.home_nav, savedInstanceState);
            }
        });
        navSer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.serve, savedInstanceState);
            }
        });
        navAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.account, savedInstanceState);
            }
        });
//        navAcc.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Navigation.findNavController(view).navigate(R.id.nav_account, savedInstanceState);
//            }
//        });

    }

    private List<foodItem> getListItem(){
        List<foodItem> list = new ArrayList<>();
        list.add(new foodItem("Hamperger","15.93","Carrot, rise, broccoli, paprica",true));
        list.add(new foodItem("Hamperger","15.93","Carrot, rise, broccoli, paprica",false));
        list.add(new foodItem("Hamperger","15.93","Carrot, rise, broccoli, paprica",true));
        list.add(new foodItem("Hamperger","15.93","Carrot, rise, broccoli, paprica",false));
        list.add(new foodItem("Hamperger","15.93","Carrot, rise, broccoli, paprica",true));
        list.add(new foodItem("Hamperger","15.93","Carrot, rise, broccoli, paprica",true));
        list.add(new foodItem("Hamperger","15.93","Carrot, rise, broccoli, paprica",true));
        list.add(new foodItem("Hamperger","15.93","Carrot, rise, broccoli, paprica",true));
        list.add(new foodItem("Hamperger","15.93","Carrot, rise, broccoli, paprica",true));
        return list;
    }
}
