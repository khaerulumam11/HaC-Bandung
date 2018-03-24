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
public class FragmentInfoMakananJakarta4 extends Fragment {

    private TextView mTextView;

    public FragmentInfoMakananJakarta4() {
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

        mTextView.setText("Belum beranjak dari bahasan kue khas Betawi, kali ini ada kue rangi atau sagu rangi yang juga termasuk salah satu kue traidisonal dari Betawi. Sesuai namanya, kue ini terbuat dari tepung kanji atau masyarakat Betawi lebih akrab menyebutnya dengan tepung sagu. Selain tepung kanji, ada juga bahan lain seperti kelapa parut panggang. Kue ini dimatangkan dengan cara dipanggang dalam cetakan khusus.\n" +
                "\n" +
                "Eksistensi dari kue rangi masih kuat. Kamu bisa dengan mudah mendapatkannya di Jakarta ataupun di kota-kota lain yang tak jauh dari Jakarta. Kue sagu rangi disajikan bersama olesan gula merah yang diberi tambahan tepung kanji agar sedikit kental. Saat dimakan, lidah akan menangkap rasa gurih dan sedikit manis dari gula merahnya. Bagi orang yang masih awam dengan makanan khas Betawi, biasanya menganggap kue rangi dan kue pancong sama, padahal berbeda, dari segi tekstur, rasa, dan bahan yang digunakan.");
    }




}
