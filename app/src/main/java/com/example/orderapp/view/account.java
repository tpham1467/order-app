package com.example.orderapp.view;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
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
    private LinearLayout  serHome, serhisorder, serServe;
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

        serhisorder = view.findViewById(R.id.nav_his);

        serhisorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.hisOrder, savedInstanceState);
            }
        });


        serServe = view.findViewById(R.id.nav_serve);

        serServe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.serve, savedInstanceState);
            }
        });

        //edit Name

        ImageView editName = view.findViewById(R.id.pen_editName);
        EditText editText_Name = view.findViewById(R.id.edit_Name);
        ImageView editDateBirth = view.findViewById(R.id.pen_editDateBirth);
        EditText editText_DateBirth = view.findViewById(R.id.edit_DateBirth);


        editName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Nếu EditText không được kích hoạt, kích hoạt nó và thay đổi văn bản của Button
                if (!editText_Name.isEnabled()) {
                    editText_Name.setEnabled(true);
                    editText_Name.setBackgroundColor(Color.parseColor("#f09e98"));

                    //button.setText("Lưu");
                }
                // Ngược lại, vô hiệu hóa EditText và đặt lại văn bản của Button
                else {
                    editText_Name.setEnabled(false);
                    //button.setText("Chỉnh sửa");
                    editText_Name.setBackgroundColor(Color.parseColor("#f5c3c0"));
                }
            }
        });

        //edit Date birth


        editDateBirth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Nếu EditText không được kích hoạt, kích hoạt nó và thay đổi văn bản của Button
                if (!editText_DateBirth.isEnabled()) {
                    editText_DateBirth.setEnabled(true);
                    editText_DateBirth.setBackgroundColor(Color.parseColor("#f09e98"));

                    //button.setText("Lưu");
                }
                // Ngược lại, vô hiệu hóa EditText và đặt lại văn bản của Button
                else {
                    editText_DateBirth.setEnabled(false);
                    //button.setText("Chỉnh sửa");
                    editText_DateBirth.setBackgroundColor(Color.parseColor("#f5c3c0"));
                }

            }
        });

        //edit Phone number


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_account, container, false);
    }
}