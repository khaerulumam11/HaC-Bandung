package com.example.android.portfolio.TarianBandung;


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
public class FragmentInfoTarianBandung4 extends Fragment {

    private TextView mTextView;

    public FragmentInfoTarianBandung4() {
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

        mTextView.setText("Merupakan tarian tradisional yang biasanya dilakukan pada acara puncak pada upacara seren taun yang dilakukan masyarakat Jawa Barat. Tarian ini merupakan kreasi dari Emalia Djatikusumah, istri dari Pangeran Djatikusumah salah seorang sesepuh adat. \n" +
                "\n" +
                "Tarian ini menggambarkan para gadis desa yang mandi dan mengambil air bersama-sama dicurug (air terjun) Ciereng dengan menggunakan buyung (tempat air dari logam/tanah liat).");
    }




}
