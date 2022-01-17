package com.example.lakvimana.ui.ConfirmOrder;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.lakvimana.R;


public class ConfirmOrder extends Fragment {

    Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_confirm_order, container, false);

        button = view.findViewById(R.id.button10);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Order Confirmed", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}