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
import com.example.orderapp.model.foodItem;
import com.example.orderapp.model.hisOrderedItem;
import com.example.orderapp.viewmodel.customerOrderedAdapter;
import com.example.orderapp.viewmodel.foodsOrderAdapter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class hisOrder extends Fragment {
    private RecyclerView recyclerHisOrder;
    private customerOrderedAdapter cusOrderedAdapter;
    private LinearLayout navHome;
    private LinearLayout navSer;
    private LinearLayout navAccount;
    private LinearLayout navAcc;
    private String nameTable;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_his_order, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerHisOrder = view.findViewById(R.id.rv_allHisOrderedTable);
        cusOrderedAdapter = new customerOrderedAdapter(view.getContext());

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext(),recyclerHisOrder.VERTICAL,false);
        recyclerHisOrder.setLayoutManager(linearLayoutManager);
        cusOrderedAdapter.setData(getListItem());
        recyclerHisOrder.setAdapter(cusOrderedAdapter);

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
//        navAccount = view.findViewById(R.id.nav_account);
//        navAccount.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Navigation.findNavController(view).navigate(R.id.account, savedInstanceState);
//            }
//        });
    }

    private List<hisOrderedItem> getListItem(){

        List<hisOrderedItem> list = new ArrayList<>();
        list.add(new hisOrderedItem("Selina Nguyennn","250,9","28/02/2023"));
        list.add(new hisOrderedItem("Selina Nguyennn","250,9","28/02/2023"));
        list.add(new hisOrderedItem("Selina Nguyennn","250,9","28/02/2023"));
        list.add(new hisOrderedItem("Selina Nguyennn","250,9","28/02/2023"));
        list.add(new hisOrderedItem("Selina Nguyennn","250,9","28/02/2023"));
        return list;
    }
}