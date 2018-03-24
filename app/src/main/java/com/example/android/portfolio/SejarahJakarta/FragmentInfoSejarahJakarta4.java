package com.example.android.portfolio.SejarahJakarta;


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
public class FragmentInfoSejarahJakarta4 extends Fragment {

    private TextView mTextView;

    public FragmentInfoSejarahJakarta4() {
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

        mTextView.setText("Museum Bahari adalah museum yang menyimpan koleksi yang berhubungan dengan kebaharian dan kenelayanan bangsa Indonesia dari Sabang hingga Merauke yang berlokasi di seberang Pelabuhan Sunda Kelapa. Koleksi-koleksi yang disimpan terdiri atas berbagai jenis perahu tradisional dengan aneka bentuk, gaya dan ragam hias, hingga kapal zaman VOC. Selain itu ada pula berbagai model dan miniatur kapal modern dan perlengkapan penunjang kegiatan pelayaran. Juga peralatan yang digunakan oleh pelaut pada masa lalu seperti alat navigasi, jangkar, teropong, model mercusuar dan meriam.");

    }




}
