package com.example.android.portfolio.MakananSurabaya;


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
public class FragmentInfoMakananSurabaya3 extends Fragment {

    private TextView mTextView;

    public FragmentInfoMakananSurabaya3() {
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

        mTextView.setText("Sate klopo menggunakan bahan-bahan yang sama seperti sate pada umunya, yaitu dari daging sapi atau daging ayam, dan bukan dari kelapa yang dibuat menjadi sate. Hanya saja sebagai pembeda, Sate Klopo menggunakan campuran jeroan dan lemak sapi untuk menambah cita rasa gurih.\n" +
                "\n" +
                "Selain itu, sate juga dilumuri dengan parutan kelapa terlebih dahulu sebelum dibakar yang menjadikan sate memiliki rasa yang unik dan bikin ketagihan.\n" +
                "\n" +
                "Ada banyak sekali penjual Sate Klopo yang bisa kamu temukan di Surabaya, salah satu warung sate yang paling terkenal adalah Sate Klopo Ondomohen Ibu Asih. Warung ini bisa kamu temukan di sebelah barat Balai kota Surabaya lebih tepatnya di Jalan Walikota Mustajab no 36, Surabaya.\n" +
                "\n" +
                "Meski warung sate ini terlihat sederhana, tapi kamu harus rela mengantri untuk menikmati kelezatannya, karena warung ini terkenal tidak pernah sepi pelanggan.");
    }




}
