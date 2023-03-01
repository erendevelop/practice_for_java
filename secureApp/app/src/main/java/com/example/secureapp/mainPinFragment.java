package com.example.secureapp;
import static java.lang.System.in;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import androidx.appcompat.widget.ButtonBarLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class mainPinFragment extends Fragment {
    public mainPinFragment() {
        // Required empty public constructor
    }
    // TODO: Rename and change types and number of parameters
    public static mainPinFragment newInstance(String param1, String param2) {
        mainPinFragment fragment = new mainPinFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_pin, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView pinText = view.findViewById(R.id.pin);
        List<String> newNumbers = new ArrayList();

        Button btn1 = view.findViewById(R.id.btn1);
        Button btn2 = view.findViewById(R.id.btn2);
        Button btn3 = view.findViewById(R.id.btn3);
        Button btn4 = view.findViewById(R.id.btn4);
        Button btn5 = view.findViewById(R.id.btn5);
        Button btn6 = view.findViewById(R.id.btn6);
        Button btn7 = view.findViewById(R.id.btn7);
        Button btn8 = view.findViewById(R.id.btn8);
        Button btn9 = view.findViewById(R.id.btn9);
        Button btn0 = view.findViewById(R.id.btn0);
        Button enterButton = view.findViewById(R.id.enterbtn);


        btn1.setOnClickListener(e -> pinText.append("1"));
        btn2.setOnClickListener(e -> pinText.append("2"));
        btn3.setOnClickListener(e -> pinText.append("3"));
        btn4.setOnClickListener(e -> pinText.append("4"));
        btn5.setOnClickListener(e -> pinText.append("5"));
        btn6.setOnClickListener(e -> pinText.append("6"));
        btn7.setOnClickListener(e -> pinText.append("7"));
        btn8.setOnClickListener(e -> pinText.append("8"));
        btn9.setOnClickListener(e -> pinText.append("9"));
        btn9.setOnClickListener(e -> pinText.append("9"));
        btn0.setOnClickListener(e -> pinText.append("0"));

        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String password = "12";
                String secondPassword = password + password;
                if(password.equals(pinText.getText().toString())){
                    pinText.setText("");
                    for(Integer i = 0; i < 10; i++) newNumbers.add(i.toString());
                    Collections.shuffle(newNumbers);

                    btn1.setOnClickListener(q -> pinText.append(newNumbers.get(0)));
                    btn1.setText(newNumbers.get(0));
                    btn2.setOnClickListener(q -> pinText.append(newNumbers.get(1)));
                    btn2.setText(newNumbers.get(1));
                    btn3.setOnClickListener(q -> pinText.append(newNumbers.get(2)));
                    btn3.setText(newNumbers.get(2));
                    btn4.setOnClickListener(q -> pinText.append(newNumbers.get(3)));
                    btn4.setText(newNumbers.get(3));
                    btn5.setOnClickListener(q -> pinText.append(newNumbers.get(4)));
                    btn5.setText(newNumbers.get(4));
                    btn6.setOnClickListener(q -> pinText.append(newNumbers.get(5)));
                    btn6.setText(newNumbers.get(5));
                    btn7.setOnClickListener(q -> pinText.append(newNumbers.get(6)));
                    btn7.setText(newNumbers.get(6));
                    btn8.setOnClickListener(q -> pinText.append(newNumbers.get(7)));
                    btn8.setText(newNumbers.get(7));
                    btn9.setOnClickListener(q -> pinText.append(newNumbers.get(8)));
                    btn9.setText(newNumbers.get(8));
                    btn0.setOnClickListener(q -> pinText.append(newNumbers.get(9)));
                    btn0.setText(newNumbers.get(9));
                }
                else if(secondPassword.equals(pinText.getText().toString())){
                    FragmentManager fragmentManager = getFragmentManager();
                    fragmentManager.beginTransaction()
                            .replace(R.id.fragmentContainerView2, mainPageFragment.class, null)
                            .setReorderingAllowed(true)
                            .addToBackStack("name")
                            .commit();
                }
            }
        });
    }
}