package com.example.potfolioapp.cv;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.potfolioapp.R;

import java.util.ArrayList;
import java.util.List;

public class CVFragment extends Fragment {

    RecyclerView RvCv;
    CVAdpter adapter;
    List<CVItem> items;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RvCv = view.findViewById(R.id.recyclerview_cv);

        // create a list of cv items
        items = new ArrayList<>();
        items.add(new CVItem("20 April 2013", getString(R.string.lorem_text)));
        items.add(new CVItem("20 May 2013", getString(R.string.lorem_text2)));
        items.add(new CVItem("25 July 2013", getString(R.string.lorem_text)));
        items.add(new CVItem("20 April 2013", getString(R.string.lorem_text2)));

        adapter = new CVAdpter(items);

        RvCv.setLayoutManager(new LinearLayoutManager(getContext()));
        RvCv.setAdapter(adapter);

    }


    public CVFragment() {

        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_c_v, container, false);
    }
}