package com.example.androiddevelopment.zadatak_termin20.fragments;


import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androiddevelopment.zadatak_termin20.R;
import com.example.androiddevelopment.zadatak_termin20.adapters.GlumacAdapter;

import java.util.List;

import providers.GlumacProvider;

public class SviGlumciFragment extends Fragment {

    OnItemSelectedListener listener;

    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);

        final List<String> glumciNames = GlumacProvider.getGlumacNames();


        GlumacAdapter dataAdapter = new GlumacAdapter((OnItemSelectedListener) getActivity(), glumciNames);
        RecyclerView listView = (RecyclerView) getActivity().findViewById(R.id.listofGlumacs);

        listView.setLayoutManager(new LinearLayoutManager(getActivity()));

        listView.setAdapter(dataAdapter);

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_svi_glumci, container, false);
    }

    @Override
    public void onAttach(Activity activity) {

        super.onAttach(activity);


        try {
            listener = (OnItemSelectedListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement OnItemSelectedListener");
        }
    }

    public interface OnItemSelectedListener {

        public void onItemSelected(int position);
    }
}
