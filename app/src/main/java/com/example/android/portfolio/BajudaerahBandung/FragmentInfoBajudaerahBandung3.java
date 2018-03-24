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
public class FragmentInfoBajudaerahBandung3 extends Fragment {

    private TextView mTextView;

    public FragmentInfoBajudaerahBandung3() {
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

        mTextView.setText("Para jajaka menggunakan jas takwa atau jas tutup dengan warna bebas (lebih sering hitam), celana panjang dengan warna yang sama, kain samping yang diikatkan di pinggang, penutup kepala berupa bendo, dan alas kaki selop. Hiasan yang dikenakan hanya berupa jam rantai yang biasanya dijepitkan pada saku jas. Sementara untuk para mojang, mereka akan menggunakan pakaian berupa kebaya polos dengan hiasan sulam, kain kebat, beubeur (ikat pinggang), kutang (kamisol), karembong (selendang) sebagai pemanis, dan alas kaki berupa selop dengan warna sama seperti warna kebaya. Adapun untuk hiasannya yaitu tusuk konde berhias bunga untuk rambut disanggul, giwang, cincin, bros, kalung, gelang keroncong, peniti rantai, dan beberapa perhiasan lain yang terbuat dari emas bertahta berlian.\n" +
                "\n" +
                "Sumber: http://adat-tradisional.blogspot.com/2016/07/pakaian-adat-jawa-barat-sunda-gambar.html\n" +
                "Disalin dari Blog Adat Tradisional.");
    }




}
