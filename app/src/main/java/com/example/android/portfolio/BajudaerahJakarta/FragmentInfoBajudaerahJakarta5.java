package com.example.android.portfolio.BajudaerahJakarta;


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
public class FragmentInfoBajudaerahJakarta5 extends Fragment {

    private TextView mTextView;

    public FragmentInfoBajudaerahJakarta5() {
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

        mTextView.setText("Pengantin wanita dalam perinikahan adat betawi menggunakan baju adat betawi yang bernama Rias besar Dandanan care none pengantin cine.\n" +
                "\n" +
                "Pakaian yang dikenakan blus bergaya China dengan bahan utama satin berwarna cerah. Untuk bawahannya menggunakan rok atau bernama Kun yang berwarna gelap dengan model duyung. Warna yang sering dipakai adalah hitam dan merah.\n" +
                "\n" +
                "Sebagai pelengkap bagian kepala dipakaikan kembang goyang bermotif burung hong dengan sanggul palsu, dilengkapi dengan cadar di bagian wajahnya. Pada bagian sunggul dihiasi dengan bunga melati yang dibentuk sedemikian rupa seperti ronjee dan sisir.\n" +
                "\n" +
                "Perhiasan lain yang dipakai adalah kalung lebar, gelang listing serta hiasan teratai manik-manik yang dikalungkan di bagian dada, serta selop dengan model perahu sebagai alas kaki.\n" +
                "\n" +
                "Pada baju pengantin, terlihat proses asimilasi dari berbagai kelompok etnis pembentuk adat masyarakat betawi. Pakaian yang dikenakan penhantin pria terdiri dari : sorban, jubah panjang serta celana panjang yang banyak dipengaruhi oleh kebudayaan Arab.\n" +
                "\n" +
                "Sedangkan pada baju pengantin wanita yang menggunakan syangko (penutup muka), pakaian model encim dan rok panjang menunjukkan adanya pengaruh kebudayaan China. Uniknya, terompah (alas kaki) yang dipakai oleh pengantin pria dan wanita banyak dipengaruhi oleh kebudayaan Arab.");
    }




}
