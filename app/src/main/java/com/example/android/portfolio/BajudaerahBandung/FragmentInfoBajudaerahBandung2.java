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
public class FragmentInfoBajudaerahBandung2 extends Fragment {

    private TextView mTextView;

    public FragmentInfoBajudaerahBandung2() {
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

        mTextView.setText("Bagi para pria bangsawan, pakaian adat Sunda yang mereka kenakan terdiri dari jas tutup berbahan beludru hitam yang disulam benang emas menyusuri tepi dan ujung lengan, celana panjang dengan motif sama, kain dodot motif rengreng parang rusak, benten atau sabuk emas, bendo untuk tutup kepala, dan selop hitam sebagai alas kaki. Sedangkan untuk para wanita, pakaian adat Jawa Barat yang dikenakan kebaya beludru hitam bersulam benang emas, kain kebat motif rereng, dan alas kaki berupa sepatu atau selop berbahan beludru hitam bersulam manik-manik. Tak lupa beberapa pernik perhiasan juga dikenakan seperti tusuk konde emas untuk rambut yang disanggul, giwang, cincin, bros, kalung, gelang keroncong, peniti rantai, dan beberapa perhiasan lain yang terbuat dari emas bertahta berlian.\n" +
                "\n" +
                "Sumber: http://adat-tradisional.blogspot.com/2016/07/pakaian-adat-jawa-barat-sunda-gambar.html\n" +
                "Disalin dari Blog Adat Tradisional.");
    }




}
