package com.example.myfragmentproject;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;


public class FragmentOne extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        String[] countries = new String[]{"austria","africa","austria","afrida","axar","axeious"};
        View v=  inflater.inflate(R.layout.fragment_fragment_one, container, false);
        AutoCompleteTextView  auto = v.findViewById(R.id.autoComplete);
        ArrayAdapter ad = new ArrayAdapter(getActivity(),R.layout.support_simple_spinner_dropdown_item,countries);
        auto.setThreshold(1);
        auto.setAdapter(ad);
         return v ;
    }

}
