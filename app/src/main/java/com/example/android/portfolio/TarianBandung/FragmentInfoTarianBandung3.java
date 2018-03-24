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
public class FragmentInfoTarianBandung3 extends Fragment {

    private TextView mTextView;

    public FragmentInfoTarianBandung3() {
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

        mTextView.setText("Tari Merak merupakan tarian kreasi baru dari daerah Pasundan, Jawa Barat. Tarian ini diciptakan oleh Raden Tjetjep Somantri, seorang koreografer tari Sunda pada tahun 1950-an. Pada tahun 1965, tarian ini kembali diperkenalkan dengan kreasi gerak baru oleh Irawati Urban, seorang wanita pecinta seni tari yang berasal dari daerah Bandung, Jawa Barat. Di daerah Pasundan, tari Merak seringkali dimainkan ketika menyambut kedatangan tamu kehormatan dalam sebuah acara. Dalam sebuah pesta pernikahan adat Sunda, Tari Merak seringkali menjadi tari menyambut kehadiran pengantin lelaki yang hendak berjalan menuju pelaminan.\n" +
                "\n" +
                "Dalam sebuah pertunjukan, tari Merak umumnya dimainkan oleh seorang atau beberapa orang penari wanita. Ketika pertunjukan, mereka mengenakan kostum yang penuh warna, seperti merah, kuning, serta hijau. Konon, warna itu menggambarkan pesona warna dari burung merak.\n" +
                "\n" +
                "Untuk menambah kesan menarik, mereka juga mengenakan selendang yang warnanya senada dengan kostum penari. Selendang itu terikat pada pinggang penari Merak. Ketika dibentangkan, selendang itu tampak seperti sepasang sayap dari seekor burung Merak. Tak pernah terlewatkan, penari Merak juga menggunakan mahkota yang berhiaskan replika kepala burung merak.\n" +
                "\n" +
                "Dengan diiringi seperangkat alat musik gamelan Sunda, pertunjukan tari Merak dimulai. Gerakan lemah gemulai dari sang penari Merak menjadi ciri khas tersendiri dari pertunjukan tari Merak. Sesekali, mereka menampilkan gerakan layaknya seekor burung yang sedang melompat. Gerakan tari Merak semakin terkesan mempesona ketika penari Merak menari sambil membentang sepasang sayap yang penuh warna.\n" +
                "\n" +
                "Dari awal hingga pertunjukan itu usai, penari Merak memainkan gerak yang menggambarkan keanggunan, keindahan serta kelincahan seekor burung Merak. Menurut ceritanya, keseluruhan gerak dalam pertunjukan tari Merak ini menggambarkan seekor merak jantan yang berusaha menarik hati sang merak betina.");
    }




}
