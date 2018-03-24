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
public class FragmentInfoMakananSurabaya2 extends Fragment {

    private TextView mTextView;

    public FragmentInfoMakananSurabaya2() {
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

        mTextView.setText("Kuliner yang satu ini menggunakan bahan baku daging yang unik yaitu daging yang berasal dari bagian cingur (hidung) sapi. Teksturnya yang kenyal akan menimbulkan sensasi yang khas di lidah.\n" +
                "\n" +
                "Terdapat banyak penjaja rujak cingur di Surabaya, yang hampir bisa ditemui di setipap sudut kota. Meskipun harganya murah, kamu tidak akan menyesal jika mencoba makanan yang terbilang unik ini.");
    }




}
