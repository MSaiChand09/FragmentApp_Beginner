package com.example.myfragmentproject;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;


public class FragmentTwo extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_fragment_two, container, false);
        final TimePicker tp = (TimePicker) view.findViewById(R.id.time);
        Button b = (Button) view.findViewById(R.id.button);
        tp.setIs24HourView(true);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Alarm is set at "+ tp.getCurrentHour() + ":" +
                        tp.getCurrentMinute(), Toast.LENGTH_LONG).show();
            }
        });
        return view ;
    }
}




