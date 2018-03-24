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
public class FragmentInfoTarianSurabaya3 extends Fragment {

    private TextView mTextView;

    public FragmentInfoTarianSurabaya3() {
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

        mTextView.setText("Tari Boran adalah tarian tradisional dari Lamongan yang menggambarkan kehidupan para penjual nasi boran yang menjajakan dagangannya dan berinteraksi dengan pembeli. Tarian ini selain kaya akan nilai seni dan budaya, namun juga banyak terdapat nilai filosofis di dalamnya. Tari Boran ini merupakan tarian tradisional yang sangat terkenal di Lamongan dan menjadi salah satu tarian khas disana.\n" +
                "\n" +
                "Tari Boran terinspirasi dari para penjual nasi boran, yaitu makanan tradisional khas dari Lamongan, Jawa Timur. Pada jaman dahulu para penjual nasi boran menjajakan dagangannya dengan cara menggunakan Wakul atau wadah nasi yang terbuat dari bambu dan ditaruh diatas kepala mereka untuk membawanya. Untuk menjajakannya mereka berjalan kaki dan menawarkan dagangannya kepada setiap orang yang dijumpainya. Di bawah panasnya terik matahari dan kerasnya kehidupan mereka berjuang untuk mencari rejeki. Dari perjuangan mereka itulah yang menginspirasi para seniman di Lamongan untuk menciptakan Tari Boran ini.\n" +
                "\n" +
                "Keindahan dari Tari Boran ini terletak pada gerakannya yang indah dan tersusun rapi. Dalam pertunjukannya, Tari Boran ini dilakukan secara berkelompok sehingga formasi dan kekompakan sangat penting di sini. Gerakan Tari Boran ini cenderung gerakan yang sederhana dan penuh makna. Setiap gerakan dalam Tari Boran ini menggambarkan aktivitas para penjual nasi boran pada jaman dahulu, mulai dari menyiapkan makanan sampai menjualkannya kepada pelanggan. \n" +
                "\n" +
                "Dalam pertunjukannya, penari menari dengan lincah dan kompak. Ritme gerakan pada tarian ini kadang lambat dan kadang menjadi cepat sesuai dengan jalan cerita yang ditampilkan agar pesan dan maknanya bisa tersampaikan dengan mudah kepada penonton. Selain itu gerakan juga disesuikan dengan music pengiringnya agar terlihat selaras. Music pengiring pada Tari Boran ini adalah music gamelan yang khas dari Jawa Timur.\n" +
                "\n" +
                "Kostum yang digunakan pada Tari Boran ini biasanya menggunakan busana tradisional berupa baju kemben lengan panjang. Pada bagian bawah menggunakan celana sepanjang bawah dengkul dengan warna yang sama seperti kebaya dan kain batik khas Lamongan pada bagian pinggang menutupi celana. Selain itu pada bagian kepala menggunakan kupluk atau kain penutup kepala. Tidak lupa tempat nasi atau Wakul yang digunakan sebagai property menarinya. ");
    }




}
