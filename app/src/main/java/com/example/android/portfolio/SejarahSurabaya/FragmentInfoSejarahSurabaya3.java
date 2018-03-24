package com.example.android.portfolio.SejarahSurabaya;


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
public class FragmentInfoSejarahSurabaya3 extends Fragment {

    private TextView mTextView;

    public FragmentInfoSejarahSurabaya3() {
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

        mTextView.setText("Di dalam Museum Mpu Tantular terdapat berbagai barang peninggalan sejarah, terutama dari zaman kerajaan. Ada kurang lebih 1.500 koleksi barang antik dari Kerajaan Hindhu, Islam, dan Buddha. Untuk masuk ke sana, kamu hanya perlu membayar tiket Rp 4 ribu* untuk dewasa dan Rp 3 ribu* untuk anak-anak.");
    }




}
