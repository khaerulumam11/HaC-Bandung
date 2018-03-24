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
public class FragmentInfoBajudaerahJakarta1 extends Fragment {

    private TextView mTextView;

    public FragmentInfoBajudaerahJakarta1() {
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

        mTextView.setText("Yang dimaksud dengan pakaian keseharian disini adalah baju yang umum dipakai oleh orang betawi dalam kesehariannya. terdiri dari :\n" +
                "\n" +
                "a. Baju koko atau sadariah\n" +
                "\n" +
                "Baju koko adat betawi yang biasa dikenakan bernama juga sadariah. Bentuknya mirip sekali dengan baju koko pada umumnya, hanya saja baju koko adat betawi ini berwarna polos.\n" +
                "\n" +
                " b. Celana Batik\n" +
                "Celana batik yang dipakai oleh orang betawi adalah celana kolor batik yang panjang. Dengan warna tidak terlalu ramai, umumnya hanya berwarna putih, coklat, dan hitam.\n" +
                "\n" +
                "c. Sorban/selendang\n" +
                "\n" +
                "Adalah kain yang menyerupai selendang ditempatkan pada pundak/di kalungkan pada leher.\n" +
                "\n" +
                "d. Kopya/Peci\n" +
                "\n" +
                "Kopyah bisa juga disebut peci yang dikenakan pada umumnya berwarna hitam dan merah berbahan beludru yang menjadi ciri khas adat masyarakat betawi.");
    }




}
