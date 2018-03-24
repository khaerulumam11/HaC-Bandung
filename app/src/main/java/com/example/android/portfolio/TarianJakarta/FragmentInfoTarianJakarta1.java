package com.example.android.portfolio.TarianJakarta;


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
public class FragmentInfoTarianJakarta1 extends Fragment {

    private TextView mTextView;

    public FragmentInfoTarianJakarta1() {
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

        mTextView.setText("Tari Cokek merupakan tarian tradisional yang berasal dari budaya Betawi. Selain dari Betawi, tarian ini juga seringkali dijumpai di kawasan Tangerang. Karena tarian ini merupakan hasil gesekan antara budaya Betawi, Banten, dan Cina. Tari Cokek telah ada sejak abad ke-19 di daerah Teluknaga, Tangerang yang dibawa oleh seorang saudagar Cina yang bernama Tan Sio Kek.\n" +
                "\n" +
                "Awal kemunculannya, Tari Cokek ini dimainkan oleh tiga para penari perempuan. Sekarang, pertunjukan Tari Cokek sering kali dimainkan oleh lima orang penari perempuan dan beberapa orang laki laki sebagai para pemain musik yang sebagian ikut mengiringi tarian wanita ini. Sehelai selendang yang terikat pada pinggang penari perempuan merupakan salah satu dari ornamen pakaian utama para penari wanita yang dipadu kebaya warna mencolok. Selendang ini bernama cokek.\n" +
                "\n" +
                "Sekilas, Tari Cokek ini mirip tari Sintren dari Cirebon atau sejenis Ronggeng yang ada di Jawa Tengah, di mana para penarinya memiliki kewenangan untuk mengajak para penonton ikut menari. Akan tetapi, salah satu bagian yang menarik dalam Tarian Cokek adalah iringan musik Gambang Kromong.");
    }




}
