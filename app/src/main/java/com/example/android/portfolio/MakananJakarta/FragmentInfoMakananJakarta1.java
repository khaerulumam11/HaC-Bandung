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
public class FragmentInfoMakananJakarta1 extends Fragment {

    private TextView mTextView;

    public FragmentInfoMakananJakarta1() {
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

        mTextView.setText("Di Indonesia, terkenal dua jenis asinan yakni asinan Bogor dan asinan Betawi. Asinan bogor umumnya menggunakan buah-buahan tropis dan jarang yang menggunakan sayur. Sementara asinan betawi lebih sering ditemukan berisikan sayur-sayuran seperti sawi, kembang kol, tauge, selada, kacang tanah goreng, dan tahu putih. Kuah dari asinan betawi berupa bumbu kacang yang segar karena dicampur dengan cuka dan cabai.\n" +
                "\n" +
                "Asinan betawi termasuk kuliner khas Betawi yang disukai oleh para pecinta kuliner Jakarta. Selain enak dan menyegarkan, asinan betawi juga tergolong makanan yang menyehatkan karena banyak mengandung sayur-sayuran. Sebagai pelengkap makan, asinan betawi biasanya ditambahkan dengan kerupuk mie kuning. Di Jakarta, banyak penjual asinan di pinggir jalan. Untuk harganya, asinan betawi biasa dibandrol dengan harga jual mulai dari Rp.10.000 hingga Rp20.000.");
    }




}
