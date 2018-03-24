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
public class FragmentInfoTarianJakarta4 extends Fragment {

    private TextView mTextView;

    public FragmentInfoTarianJakarta4() {
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

        mTextView.setText("Tari Renggong Manis merupakan hasil dari kawin silang budaya, yakni Tari Renggong Manis. Tarian yang merupakan ungkapan dari kebahagiaan dan juga rasa kebersamaan para remaja putri ini merupakan perpaduan diantara budaya Betawi, Arab, India, dan juga budaya Cina Klasik. Tidak heran jika melihat banyaknya pengaruh dari budaya luar yang masuk ke dalam budaya Betawi, mengingat letak Provinsi Jakarta dan adanya pelabuhan Sunda Kelapa sendiri yang merupakan sebuah pintu menuju Indonesia di masa lampau.\n" +
                "\n" +
                "Tari Renggong Manis ini biasanya dimainkan dalam acara-acara resmi. Biasanya akan ditampilkan pertama sebelum memasuki acara utama, yaitu sebagai media penyambutan para tamu. Kebahagiaan tuan rumah atas kedatangan para tamunya diasosiasikan dengan keceriaan dari Tari Renggong Manis tersebut.");
    }




}
