package com.example.android.portfolio.BatikSurabaya;


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
public class FragmentInfoBatikSurabaya3 extends Fragment {

    private TextView mTextView;

    public FragmentInfoBatikSurabaya3() {
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

        mTextView.setText("Batik Surabaya motif Sawunggaling, motif ini berasal dari kisah Joko Berek yang suka adu ayam, Joko Berek sendiri adalah nama asli Sawunggaling. Motif ini menggambarkan ayam jago dengan paduan warna-warna modern seperti ungu, Osaka atau warna-warna lain yang jarang ada di pasaran.");

    }




}
