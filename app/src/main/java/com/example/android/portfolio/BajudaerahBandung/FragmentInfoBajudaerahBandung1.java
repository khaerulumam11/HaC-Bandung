package com.example.android.portfolio.BajudaerahBandung;


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
public class FragmentInfoBajudaerahBandung1 extends Fragment {

    private TextView mTextView;

    public FragmentInfoBajudaerahBandung1() {
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

        mTextView.setText("Untuk keperluan upacara adat perkawinan, para pengantin adat Sunda akan mengenakan pakaian khusus yang dinamai pakaian Pengantin Sukapura. Pakaian ini untuk mempelai pria berupa jas tutup berwarna putih yang dilengkapi ikat pinggang warna putih, kain rereng sebagai bawahan, tutup kepala bendo motif rereng pula, dan selop berwarna putih. Untuk hiasannya, kalung panjang dari bunga melati dan keris atau kujang sebagai senjata tradisionalnya\n" +
                "\n" +
                "Sumber: http://adat-tradisional.blogspot.com/2016/07/pakaian-adat-jawa-barat-sunda-gambar.html\n" +
                "Disalin dari Blog Adat Tradisional.\n" +
                "Sementara untuk mempelai wanita, atasannya berupa kebaya brukat warna putih, bawahan berupa kain rereng eneng, benten atau ikat pinggang warna emas, dan alas kaki selop warna putih. Adapun hiasannya berupa perhiasan kilat bahu, kalung panjang, gelang, bros, giwang, dan cincin, serta sanggulan rambut yang dilengkapi hiasan siger subadra lima untaian bunga sedap malam (mangle), dan tujuh buah kembang goyang\n" +
                "\n" +
                "Sumber: http://adat-tradisional.blogspot.com/2016/07/pakaian-adat-jawa-barat-sunda-gambar.html\n" +
                "Disalin dari Blog Adat Tradisional.");
    }




}
