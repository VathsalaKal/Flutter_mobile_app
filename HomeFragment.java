package com.example.lakvimana.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.lakvimana.R;
import com.example.lakvimana.databinding.FragmentHomeBinding;
import com.example.lakvimana.ui.ViewCategories.ViewCategories;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    Button button;
    ImageView imageView;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        imageView = view.findViewById(R.id.categories);
        ImageSlider imageSlider = view.findViewById(R.id.slider);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new ViewCategories();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment_content_dashboard, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.image1,null));
        slideModels.add(new SlideModel(R.drawable.image2,null));
        slideModels.add(new SlideModel(R.drawable.image3,null));
        imageSlider.setImageList(slideModels);

        return view;
    }

}