package com.example.android.portfolio.SejarahSurabaya;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.portfolio.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentInfoSejarahSurabaya2 extends Fragment {

    private TextView mTextView;

    public FragmentInfoSejarahSurabaya2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info_batik_jakarta1, container, false);



    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        mTextView = (TextView) view.findViewById(R.id.Text);

        mTextView.setText("Monumen Kapal Selam yang dibangun di sisi Sungai Kalimas adalah monumen kapal terbesar di Asia. Monumen Kapal Selam dibangun karena ide para sesepuh Kapal Selam dari Angkatan Laut. Tujuan dibangunnya Monumen Kapal Selam adalah menciptakan kawasan wisata di Jawa Timur, agar mencerminkan Indonesia sebagai negara maritim, dan sebagai kenangan untuk para pejuang yang sudah membela Tanah Air. Di dalamnya terdapat kapal selam, pesawat tempur, tank, dan lain-lain. Kapal selam yang dipajang adalah Kapal Selam Angkatan Laut Armada RI bagian timur, KRI Pasopati 410.");
    }




}
