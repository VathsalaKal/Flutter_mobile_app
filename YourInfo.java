package com.example.lakvimana.ui.YourInfo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.lakvimana.R;
import com.example.lakvimana.ui.Delivery.Delivery;
import com.example.lakvimana.ui.ViewTeddyDetails.ViewTeddyDetails;


public class YourInfo extends Fragment {

    EditText editText;
    Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_your_info, container, false);

        editText = view.findViewById(R.id.num);
        button = view.findViewById(R.id.godel);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().isEmpty()){
                    editText.setError("Phone number required");
                }else if (editText.getText().toString().length() > 10){
                    editText.setError("Invalid Phone number");
                }else{
                    Toast.makeText(getActivity(), "Successfully added", Toast.LENGTH_SHORT).show();

                    Fragment fragment = new Delivery();
                    FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.nav_host_fragment_content_dashboard, fragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }
            }
        });

        return view;
    }
}