package com.example.android.portfolio.MakananBandung;


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
public class FragmentInfoMakananBandung4 extends Fragment {

    private TextView mTextView;

    public FragmentInfoMakananBandung4() {
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

        mTextView.setText("Makanan khas bandung yang berikutnya akan kita bahas di sini adalah sebuah makanan yang terkenal dengan nama Mie Kocok. Makanan yang satu ini tentu sangat mudah bisa kita temukan di Kota Bandung, karena banyak pedagang dengan menggunakan gerobak yang menjajakan makanan khas bandung bernama Mie Kocok ini. Mie Kocok ini merupakan hidangan mie yang di campur dengan berbagai sayuran.\n" +
                "\n" +
                "Tentu tidak hanya sayuran saja yang di campurkan di Mie Kocok ini, ada juga seperti misalkan saja kikil sapi. Tentu anda sangat penasaran dengan nama Mie Kocok yang di berikan pada makanan khas bandung ini bukan? Sebenarnya nama Mie Kocok ini karena proses sebelum penyajian dari makanan khas bandung Mie Kocok ini yakni pada saat proses pembuatannya mienya di kocok dan di aduk hingga terolah secara sempurna.");
    }




}
