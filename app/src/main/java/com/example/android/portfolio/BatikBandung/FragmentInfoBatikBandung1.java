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
public class FragmentInfoBatikBandung1 extends Fragment {

    private TextView mTextView;

    public FragmentInfoBatikBandung1() {
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

        mTextView.setText("Sejarah batik kawung yang lain menyebutkan bahwa terdapat cerita rakyat dimana seorang pemuda dari desa yang berwibawa juga disegani oleh lingkungannya karena tutur kata yang santun dan bijak hingga menjadi perhatian oleh kalangan keraton Mataram. Pihak keraton mataram memiliki rasa penasaran yang tinggi atas kemashuran pemuda tersebut, hingga diutuslah seorang telik sandi kepada pemuda tersebut untuk menghadap sang raja. Sang ibu mendengar dari masyarakat setempat bahwa sang putra diundang oleh raja mataram. Hal ini membuat sang ibunda menjadi terharu dan menggantungkan banyak harapan kepada pemuda tersebut. Untuk itulah sang ibunda tersebut membuatkan batik dengan motif kawung, dengan harapan putranya bisa menjaga diri dari hawa nafsu juga menjadi manusia yang berguna bagi masyarakat banyak. Singkat cerita pemuda tersebut naik pangkat menjadi adipati Wonobodro. Dalam prosesi pengangkatannya sebagai adipati, pemuda tersebut memakai model baju batik motif kawung pemberian ibundanya.\n" +
                "\n" +
                "Pada umumnya turunan motif batik kawung diberi nama berdasarkan ukuran bentuk bulat-lonjong yang ada pada suatu motif batik kawung tertentu. Misalnya,\n" +
                "\n" +
                "motif batik kawung picis yang merupakan motif kawung yang tersusun oleh bentuk bulat-lonjong yang berukuran kecil menyerupai mata uang picis senilai dengan sepuluh senyang.\n" +
                "Motif batik kawung bribil merupakan salah satu jenis motif kawung yang tersusun oleh bentuk bulat-lonjong yang ukurannya menyerupai mata uang bribil senilai setengah sen.\n" +
                "Motif batik kawung sen merupakan salah satu jenis motif kawung dimana ukuran isen-isennya sebesar mata uang sen. Seringkali mata uang sen digunakan untuk ditebar sepanjang jalan sebagai pengiring jenasah hingga pada akhirnya kain batik kawung ini digunakan sebagai penutup orang mayat sebelum di kafani atau disemayamkan. Sumber lain mengatakan bahwa karena filosofi dari motif batik kawung sen yang memaknai kehidupan akan kembali ke alam sawung.");

    }




}
