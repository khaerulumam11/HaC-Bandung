package com.example.android.portfolio.MakananSurabaya;


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
public class FragmentInfoMakananSurabaya5 extends Fragment {

    private TextView mTextView;

    public FragmentInfoMakananSurabaya5() {
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

        mTextView.setText("Makanan khas Surabaya yang satu ini termasuk salah satu kuliner terlezat yang sayang untuk dilewatkan jika anda berada di Surabaya. Perpaduan antara daging sapi, perkedel singkong, tahu goreng, taoge, dan selada membuat lidah ingin mencobanya.\n" +
                "\n" +
                "Apalagi tidak kentinggalan bumbu petis yang hampir terdapat pada setiap makanan khas Surabaya. Pasti akan membuatmu gigit jari jika sampai kelewatan tidak mencobanya." +
                "Salah satu tempat wisata kuliner Tahu Campur yang populer adalah tahu campur yang berada di Jalan Kalasan No 22 Tambak Sari. Dengan harga yang ramah di kantong kamu sudah bisa mecicipi lezatnya Tahu Campur khas Surabaya.\n" +
                "\n");
    }




}
