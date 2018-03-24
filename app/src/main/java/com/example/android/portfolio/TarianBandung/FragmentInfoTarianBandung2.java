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
public class FragmentInfoTarianBandung2 extends Fragment {

    private TextView mTextView;

    public FragmentInfoTarianBandung2() {
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

        mTextView.setText("Kemunculan tari jaipongan 1980 an yang lahir dari kekreatifitasan para seniman Bandung yang dikenal dengan Gugum Gumbira , pada awalnya tarian tersebut pengembangan dari ketuk tilu apabila dilihat dari perkembangannya dan dasar koreografernya. Kata jaipong bersal dari masyarakat Karawang yang bersal dari bunyi kendang sebagai iringan tari rakyat yang menurut mereka berbunyi jaipong yang secara onomotofe, tepak kendang tersebut sebagai iringan tari pergaulan dalam kesenian banjidoran yang berasal dari Subang dan Karawang yang akhirnya menjadi populer dengan istilah jaipongan.\n" +
                "\n" +
                "Karya jaipongan pertama yang diciptakan oleh Gugum Gumbira adalah tari daun pulus keser bojong dan tari Raden Bojong yang berpasangan putra- putri. Tarian tersebut sangat digemari dan populer di seluruh Jawa Barat termasuk Kabupaten Bandung karya lain yang diciptakan oleh Gugum diantaranya toka-toka, setra sari, sonteng, pencug, kuntul mangut, iring-iring daun puring , rawayan, kaum anten dll. juga para penari yang populer diantaranya seperti Iceu Efendi, Yumiati Mandiri, Mimin Mintarsih, Nani, Erna, Mira Tejaningrum, Ine Diar, Asep Safat.\n" +
                "\n" +
                "Penari jaipongan terdiri dari Tunggal, rampak atau kolosal\n" +
                "\n" +
                "a. Rampak sejenis\n" +
                "b. Rampak berpasangan\n" +
                "c. Tunggal laki-laki dan tunggal perempuan\n" +
                "d. Berpasangan laki- laki atau perempuan");
    }




}
