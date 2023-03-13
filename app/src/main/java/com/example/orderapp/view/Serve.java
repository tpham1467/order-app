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

import com.example.orderapp.R;
import com.example.orderapp.model.tableItem;
import com.example.orderapp.viewmodel.tablesAdapter;

import java.util.ArrayList;
import java.util.List;

public class Serve extends Fragment {
    private RecyclerView recyclerAllTable;
    private tablesAdapter tablesAdap;
    private LinearLayout navHome;
    private LinearLayout navHis;
    private LinearLayout navAcc;
    private LinearLayout navAccount;

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
        return inflater.inflate(R.layout.fragment_serve, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerAllTable = view.findViewById(R.id.rv_alltable);
        tablesAdap = new tablesAdapter(view.getContext());

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext(),recyclerAllTable.VERTICAL,false);
        recyclerAllTable.setLayoutManager(linearLayoutManager);
        tablesAdap.setData(getListItem());
        recyclerAllTable.setAdapter(tablesAdap);
        navHis = view.findViewById(R.id.nav_his);
//        navAcc = view.findViewById(R.id.nav_account);
        navHome = view.findViewById(R.id.nav_home);
        navHis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.hisOrder, savedInstanceState);
            }
        });
        navHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.home_nav, savedInstanceState);
            }
        });
        navAccount = view.findViewById(R.id.nav_account);
        navAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.account, savedInstanceState);
            }
        });
    }

            private List<tableItem> getListItem() {
                List<tableItem> list = new ArrayList<>();
                list.add(new tableItem("Table 1", true, 4, 5, "145,95"));
                list.add(new tableItem("Table 2", false, 2, 5, "145,95"));
                list.add(new tableItem("Table 3", true, 4, 5, "145,95"));
                list.add(new tableItem("Table 4", false, 4, 5, "145,95"));
                list.add(new tableItem("Table 5", false, 4, 5, "145,95"));
                list.add(new tableItem("Table 6", true, 4, 5, "145,95"));
                list.add(new tableItem("Table 7", false, 4, 5, "145,95"));
                list.add(new tableItem("Table 8", true, 4, 5, "145,95"));
                list.add(new tableItem("Table 9", false, 4, 5, "145,95"));
                list.add(new tableItem("Table 10", true, 4, 5, "145,95"));
                list.add(new tableItem("Table 11", true, 4, 5, "145,95"));
                return list;
            }

}