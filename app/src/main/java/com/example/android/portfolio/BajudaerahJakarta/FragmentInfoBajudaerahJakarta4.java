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
public class FragmentInfoBajudaerahJakarta4 extends Fragment {

    private TextView mTextView;

    public FragmentInfoBajudaerahJakarta4() {
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

        mTextView.setText("Bagi para pengantin Pria, pakaian adat betawi yang dikenakan bernama Dandanan Care Haji. Pakaian pengantin laki-laki ini meliputi jubah panjang serta berwarna merah serta tutup kepala.\n" +
                "\n" +
                "Jubah yang dikenakan baju pengantin adat betawi terbuat dari bahan beludru yang berwarna cerah. sedangkan jubah untuk bagian dalam terbuat dari kain berwarna putih yang halus.\n" +
                "\n" +
                "Untuk tutup kepala, terbuat dari sorban desbut juga dengan nama Alpie. sebagai pelengkap dipergunakan selendang bermotif dengan bahan benang emas dan manik-manik berwarna cerah.\n" +
                "\n" +
                "Supaya lebih serasi, pengantin pria pernikahan adat betawi memakai alas kaki berupa sepatu pantofel.");
    }




}
