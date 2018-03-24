package com.example.android.portfolio.BajudaerahSurabaya;


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
public class FragmentInfoBajudaerahSurabaya2 extends Fragment {

    private TextView mTextView;

    public FragmentInfoBajudaerahSurabaya2() {
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

        mTextView.setText("Sesuai dengan namanya, baju ini umumnya hanya dikenakan pada saat resepsi pernikahan adat Jawa Timuran oleh para mempelai. Baik untuk mempelai laki-laki maupun untuk mempelai wanita, baju mantenan ini memiliki corak warna yang sama, yaitu warna hitam sebagai dasar dan warna merah sebagai motif hiasannya. Penggunaan pakaian ini juga dilengkapi dengan penutup kepala dan rangkaian bunga melati yang dikalungkan di leher untuk mempelai pria dan digantungkan pada sanggul untuk mempelai wanitanya. Sabuk emas dan gelang tangan juga dipakai sebagai pelengkap bersama dengan terompah, selendang yang diselempangkan bahu, serta aksesoris tambahan lainnya.\n" +
                "\n" +
                "Sumber: http://adat-tradisional.blogspot.com/2016/07/pakaian-adat-jawa-timur.html\n" +
                "Disalin dari Blog Adat Tradisional.");
    }




}
