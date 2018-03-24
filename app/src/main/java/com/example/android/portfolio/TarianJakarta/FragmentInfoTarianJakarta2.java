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
public class FragmentInfoTarianJakarta2 extends Fragment {

    private TextView mTextView;

    public FragmentInfoTarianJakarta2() {
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

        mTextView.setText("Asal mula tari lenggang ini berasal dari kisah seorang gadis cantik asal bertawi bernama Nyai Dasimah yang sedang berada dalam kebingunannya untuk memilih dua pilihan pasangan hidup, yaitu seorang Belanda dan seorang Indonesia. Ia pun kemudian menjadi istri seorang Belanda yang bernama Edward William. Merasa terkekang oleh aturan yang dibuat suaminya, Nyai Dasima pun menjadikan alasan tersebut untuk memberontak atas kesewenangan yang dilakukan terhadap dirinya. Perjuangan atas hak-hak perempuan inilah yang menginspirasi Wiwiek Widiastuti untuk mengenang dari perjuangan Nyai Dasima dalam bentuk gerak tarian Lenggang Nyai.\n" +
                "\n" +
                "Karakter tari lenggang nyai ini lebih banyak menggunakan bentuk gerakan yang lincah sebagai personifikasi masyarakat betawi. Terkadang, seperti yang tidak dapat mengambil keputusan, gerakan tarian ini menunjukan bagaimana ia bergerak disatu sisi ke sisi lain. selain itu juga, tari Lenggang Nyai menceritakan keceriaan serta keluwesan gadis belia Betawi dan tentunya kebahagiaan Nyai Dasima yang dapat menentukan pilihan hidupnya.");
    }




}
