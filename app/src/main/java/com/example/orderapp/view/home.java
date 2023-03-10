package com.example.orderapp.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.orderapp.R;
import com.example.orderapp.viewmodel.itemsFoodAdapter;
import com.example.orderapp.model.foodItem;

import java.util.ArrayList;
import java.util.List;

public class home extends Fragment {
    private RecyclerView recyclerPopular;
    private RecyclerView recyclerFoods;
    private itemsFoodAdapter itemsAdapter;
    private LinearLayout navSer;
    private LinearLayout navHis;
    private LinearLayout navAcc;
    private LinearLayout navHome;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerPopular = view.findViewById(R.id.rv_popular);
        recyclerFoods = view.findViewById(R.id.rv_foods);
        itemsAdapter = new itemsFoodAdapter(view.getContext());

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext(),recyclerPopular.HORIZONTAL,false);
        recyclerPopular.setLayoutManager(linearLayoutManager);
        itemsAdapter.setData(getListItem());
        recyclerPopular.setAdapter(itemsAdapter);


        GridLayoutManager gridLayoutManager = new GridLayoutManager(view.getContext(), 3); // số 2 ở đây là số cột hiển thị
        recyclerFoods.setLayoutManager(gridLayoutManager);

        recyclerFoods.setAdapter(itemsAdapter);

        navSer = view.findViewById(R.id.nav_serve);
        navHis = view.findViewById(R.id.nav_his);
//        navAcc = view.findViewById(R.id.nav_account);
        navHome = view.findViewById(R.id.nav_home);
        navSer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.serve, savedInstanceState);
            }
        });
        navHis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.hisOrder, savedInstanceState);
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