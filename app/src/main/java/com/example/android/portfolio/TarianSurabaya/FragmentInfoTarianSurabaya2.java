package com.example.android.portfolio.TarianSurabaya;


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
public class FragmentInfoTarianSurabaya2 extends Fragment {

    private TextView mTextView;

    public FragmentInfoTarianSurabaya2() {
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

        mTextView.setText("Tari Beskalan adalah salah satu tarian tradisional dari kabupaten Malang, Jawa Timur. Tarian ini biasanya dipertunjukan pada saat penyambutan tamu besar yang datang ke sana. Selain menjadi tarian selamat datang, Tari Beskalan ini juga sering dipertunjukan pada pementasan Ludruk sebagai tarian pembuka setelah Tari Remo. Tarian ini merupakan salah satu tarian tradisional Malang yang terkenal selain Tari Topeng Malangan.\n" +
                "\n" +
                "Menurut beberapa sumber sejarah yang ada, Tari Beskalan ini awalnya merupakan bentuk tarian ritual yang dilakukan oleh masyarakat Malang pada jaman dahulu apabila akan membuka lahan atau mendirikan bangunan. Pada saat mengawali penggalian tanah, biasanya diadakan ritual penanaman tumbal yang sering disebut dengan “cok bakal” atau “sesajen”. Tumbal yang digunakan pada umumnya adalah kepala kerbau. Tumbal tersebut merupakan sedekah bumi yang harus dilakukan agar terhindar dari bahaya dan lahan yang dibuka tersebut diberikan kesuburan. \n" +
                "\n" +
                "Pada saat acara ritual tersebut berlangsung diiringi dengan pertunjukan Tari Beskalan. Tari Beskalan ini dianggap sebagai wujud rasa syukur dan rasa hormat kepada leluhur agar dijauhkan dari bahaya dan diberkati tanah yang subur dan rejeki yang melimpah. Selain dipertunjukan dalam acara ritual, di daerah tertentu Tari Beskalan ini juga menjadi tarian wajib yang harus dipentaskan ketika acara bersih desa. Selain menggambarkan rasa syukur dan hormat kepada lulur, tarian beskalan ini juga dianggap sebagai simbol permulaan/ awal dari kehidupan. Kepercayaan tersebut menjadikan tarian ini mulai berkembang, tidak hanya sebagai bagian dari ritual, namun juga sebagai pembuka acara dan penyambutan tamu besar. \n" +
                "\n" +
                "Dalam pertunjukannya, Tari Beskalan ini biasanya dimainkan oleh empat orang penari wanita. Namun di acara tertentu dapat juga dimainkan oleh dua orang, bahkan ada juga yang lebih dari empat orang. Dalam pertunjukannya penari menggunakan busana dan tata rias khas Tari Beskalan. Pada bagian kepala penari menggunakan sanggul yang dihias dengan cundhuk mentul. Lalu  pada bagian tubuh atas menggunakan kemben dan dipadukan dengan ilat – ilatan. Untuk bagian bawah menggunakan celana sepanjang lutut dan tambahan kain pada bagian depan dan belakan yang panjangnya sejajar dengan celana. Sedangkan pada bagian kaki menggunakan kaus kaki putih dan gongseng. Tidak lupa selendang yang di pasangkan di bahu yang digunakan untuk attribute menari.\n" +
                "\n" +
                "Gerakan dalam Tari Beskalan ini hampir sama dengan gerakan pada Tari Remo, hanya saja gerakan dalam tarian ini lebih anggun, lincah dan dinamis. Sehingga menggambarkan sisi kecantikan dan kelincahan seorang wanita. Dalam pertunjukan Tari Beskalan ini juga diiringi oleh iringan music tradisional. Awalnya Tari Beskalan ini diiringi oleh beberapa alat musik yang sederhana seperti kendang, jidor dan lain – lain. Namun pada masa sekarang ini biasanya diiringi oleh musik gamelan jawa dengan laras slendro yang menjadi  ciri khas gamelan di Jawa Timur." +
                "\n" +
                "Dalam perkembangannya, Tari Beskalan ini telah menjadi salah satu tarian kebanggan kota Malang, Jawa Timur. Tarian yang awalnya menjadi tarian ritual kini telah menjadi tarian pembuka di berbagai acara budaya di kota Malang, seperti kesenian Ludruk, festival budaya dan lain - lain. Selain itu Tari Beskalan ini juga sering digunakan sebagai tarian selamat datang untuk menyambut tamu besar atau para rombongan wisatawan yang berkunjung kesana.");
    }




}
