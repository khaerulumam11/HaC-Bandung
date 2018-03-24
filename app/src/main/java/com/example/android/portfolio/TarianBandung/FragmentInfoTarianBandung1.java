package com.example.android.portfolio.TarianBandung;


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
public class FragmentInfoTarianBandung1 extends Fragment {

    private TextView mTextView;

    public FragmentInfoTarianBandung1() {
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

        mTextView.setText("Tari Topeng Priangan adalah tari topeng yang menyebar di wilayah Jawa Barat sekarang ini. Dalam gerak dbanyak gerakan yang sedikit mirip dengan tari Topeng Cirebon namun dalam Topeng Priangan ini lebih difokuskan pada gerak tari puteri. Dalam tata kostum pun biasanya tari ini memakai kain kebat atau samping, dengan tekes yang menggunung tinggi.\n" +
                "\n" +
                "Karya Topeng Priangan bersumber dari Topeng Cirebon gaya Palimanan yang penyebarannya ke wilayah Priangan dilakukan oleh dalang (penari) Topeng Wentar serta putri-putrinya yaitu Ami, Dasih, dan Suji. Nugraha mulai memperdalam Topeng Cirebon pada 9September 1959 bersama Enoch Atmadibrata dan Soosman kerabat dekat R. SambasWirakusumah yang pernah belajar Topeng Cirebon kepada Wentar. Tari Topeng Priangan karya Nugraha, merupakan reinterpretasi, improvisasi, modifikasi atau inovasi serta seleksi terhadap Topeng Cirebon sehingga terjadi transformasi budaya meliputi aspek gerak, tata busana, iringan,dan konsep estetik yang digunakannya.");
    }




}
