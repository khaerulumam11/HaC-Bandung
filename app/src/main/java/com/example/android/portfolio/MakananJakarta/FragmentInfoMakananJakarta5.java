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
public class FragmentInfoMakananJakarta5 extends Fragment {

    private TextView mTextView;

    public FragmentInfoMakananJakarta5() {
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

        mTextView.setText("Toge goreng saat ini masih banyak di jual di kawasan ibukota. Biasanya makanan khas orang Betawi ini bisa ditemukan di pinggiran jalan atau saat festival-festival tertentu. Bagi masyarakat Betawi, makanan ini bagaikan sesuatu yang tak boleh dilewatkan apabila tampak keberadaannya. Jadi tak heran apabila toge goreng selalu ramai dikelilingi oleh para pembeli. Terlebih dengan harganya yang murah, toge goreng senantiasa mendapatkan tempat di hati para penikmatnya.\n" +
                "\n" +
                "Kamu yang belum pernah mencoba makanan ini, toge goreng adalah makanan yang berisikan mie kuning, toge, dan daun kucai. Semua bahan tersebut digoreng menggunakan air, bukan minyak. Setelah agak lama, toge bersama bahan lain tadi akan disajikan bersama lontong dan dicampurkan lagi dengan tauco dan oncom. Toge goreng memiliki cita rasa asam manis yang dihasilkan dari tauco dan oncomnya. Selain enak, toge goreng juga mempunyai aroma yang menggoda selera.");
    }




}
