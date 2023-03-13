package com.example.orderapp.view;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.Navigation;

import com.example.orderapp.R;
public class account extends Fragment {
    private LinearLayout  serHome;
    public account() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        serHome = view.findViewById(R.id.nav_home);

                serHome.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Navigation.findNavController(view).navigate(R.id.home_nav, savedInstanceState);
                    }
                });

        ImageView editName = view.findViewById(R.id.pen_editName);
        EditText editText_Name = view.findViewById(R.id.edit_Name);

        editName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                editText_Name.setEnabled(true);
//                String text = editText_Name.getText().toString();
//                editText_Name.setEnabled(false);

            }
        });

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_account, container, false);
    }
}