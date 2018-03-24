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
public class FragmentInfoSejarahSurabaya1 extends Fragment {

    private TextView mTextView;

    public FragmentInfoSejarahSurabaya1() {
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

        mTextView.setText("Monumen Jenderal Soedirman yang berada di Yos Sudarso berdiri sejak 10 November 1970 oleh Presiden Soeharto untuk memperingati Hari Pahlawan. Monumen tersebut menampilkan patung Jenderal Soedirman dengan seragam PETA, sepatu boot, dan sebilah pedang di pinggang sebelah kiri. Di bawah patung terdapat kubus dan di sisi-sisinya terpampang kata-kata Jenderal Soedirman yang sering dilontarkan selama revolusi fisik berlangsung. Jasa Soedirman yang terbesar adalah beliau berhasil memukul mundur tentara Inggris ke Semarang. Peristiwa ini disebut Palagan Ambarawa dan berlangsung dari 12 sampai 15 Desember 1945. Kemudian, Soedirman diangkat menjadi Panglima Besar TKR (Tentara Keamanan Rakyat).");
    }




}
