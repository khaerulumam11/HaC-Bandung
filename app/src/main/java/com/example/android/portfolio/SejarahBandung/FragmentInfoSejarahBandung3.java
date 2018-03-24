package com.example.android.portfolio.SejarahBandung;


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
public class FragmentInfoSejarahBandung3 extends Fragment {

    private TextView mTextView;

    public FragmentInfoSejarahBandung3() {
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

        mTextView.setText("Kota wisata Bandung yang penuh dengan bangunan bersejarah pada masa penjajahan kolonial Belanda, menyisakan berbagai peninggalan penting yang keberadaannya bisa disaksikan hingga di zaman modern.\n" +
                "\n" +
                "Salah satu dari gedung bersejarah tersebut adalah Gedung Konvensional Landmark yang terletak di kawasan Braga, Kota Bandung. Gedung yang kini termasuk cagar budaya sejarah yang dilestraikan keberadaanya, mempunyai cerita sejarah yang unik untuk diungkap.\n" +
                "\n" +
                "Ketika Indonesia menjadi jajahan pemerintah kolonial Belanda, bangunan yang kini dikenal sebagai Gedung Landmark itu, dulunya merupakan bangunan toko buku yang bernama Van Dorp yang didirikan sejak tahun 1922 hingga medio tahun 1960-an.\n" +
                "\n" +
                "Memasuki tahun 1970, toko buku Van Dorp ditutup dan beralih fungsi menjadi gedung bioskop. Sejak dari saat itu, Gedung Landmark tersebut berubah – ubah fungsinya penggunaannya, meski dari segi bangunan tidak ada perubahan yang mencolok.\n" +
                "\n" +
                "Di era modern saat ini, Gedung Landmark berubah menjadi gedung serbaguna yang memiliki banyak fungsi dan kegunaan. Salah satu kegiatan yang sering diselenggarakan adalah pesta pernikahan maupun kegiatan resmi lainnya seperti pameran dan bazaar.");
    }




}
