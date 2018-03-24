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
public class FragmentInfoTarianJakarta5 extends Fragment {

    private TextView mTextView;

    public FragmentInfoTarianJakarta5() {
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

        mTextView.setText("Tari Topeng Betawi adalah salah satu tarian tradisional masyarakat betawi di Jakarta yang memakai topeng sebagai ciri khasnya. Tari Topeng Betawi ini merupakan perpaduan antara musik, seni tari, dan nyanyian. Seperti pertunjukan teater atau opera, para penari menari dengan diiringi suara musik dan nyanyian. Tari Topeng Betawi ini lebih bersifat teatrikal dan juga komunikatif lewat gerakan.\n" +
                "\n" +
                "Dalam pertunjukannya, tarian ini diawali dengan lagu yang diiringi oleh musik pengiring. Setelah itu para penari keluar sambil menari dengan menggunakan topeng. Gerakan yang dilakukan para penari tergantung pada tema yang dibawakan. Tema yang dibawakan dalam tarian ini tergolong variatif diantaranya adalah cerita legenda, kritik sosial, kehidupan masyarakat, dan cerita klasik lainnya. Tari Topeng Betawi ini merupakan tarian yang bersifat teatrikal. Sehingga ada pesan yang disampaikan melalui gerakan para penari dalam menari.");
    }




}
