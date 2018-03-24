package com.example.android.portfolio.BatikBandung;


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
public class FragmentInfoBatikBandung3 extends Fragment {

    private TextView mTextView;

    public FragmentInfoBatikBandung3() {
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

        mTextView.setText("Motif-motif batik Bandung berkaitan erat dengan kerajaan Pajajaran. Konon dalam naskah kuno Siksa Kanda Ing Karesian, telah dikenal berbagai motif batik di Rakean Darma siksa (1175-1297). Motif-motif batiknya antara lain motif Ragen Penganten, Kampuh Jayati, dan lain sebagainya. Namun motif-motif ini hilang bersamaan dengan lenyapnya kerajaan Pakuan Pajajaran sekitar tahun 1579. Ada beberapa motif yang berhasil direka ulang, yakni motif Ragen Penganten, kembang Muncang Jayanti, dan Banyak Ngantrang, yang kemudian dikenal sebagai motif batik Pakuan Pajajaran. Motif-motif inilah yang diterapkan pada Batik Kabupaten Bandung.");

    }




}
