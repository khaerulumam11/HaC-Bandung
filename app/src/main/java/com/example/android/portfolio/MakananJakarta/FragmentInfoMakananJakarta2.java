package com.example.android.portfolio.MakananJakarta;


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
public class FragmentInfoMakananJakarta2 extends Fragment {

    private TextView mTextView;

    public FragmentInfoMakananJakarta2() {
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

        mTextView.setText("Kue kembang goyang adalah makanan khas Betawi berikutnya yang bisa kamu coba. Kue ini dinamakan kembang goyang karena bentuknya yang seperti bunga kembang dan dibuat dengan cara digoyang-goyang di atas minyak panas hingga adonannya terlepas dari cetakan. Kue ini termasuk kue tradisional khas Betawi yang paling diminati masyarakat dari berbagai kota.\n" +
                "\n" +
                "Pada mulanya, kue kembang goyang hanya bercita rasa original dan manis. Tapi semakin ke sini, banyak variasi yang diberikan pada kembang goyang sehingga rasanya pun semakin beragam. Kue ini biasanya menjadi hidangan yang disuguhkan oleh warga Betawi untuk orang-orang yang bertamu ke rumahnya. Dan yang lebih unik lagi, kue ini biasanya ditempatkan dalam stoples bening agar pesonanya tak tertutup oleh warna-warna yang terdapat pada stoplesnya.");
    }




}
