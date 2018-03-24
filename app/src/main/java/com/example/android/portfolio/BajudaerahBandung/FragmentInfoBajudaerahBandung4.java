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
public class FragmentInfoBajudaerahBandung4 extends Fragment {

    private TextView mTextView;

    public FragmentInfoBajudaerahBandung4() {
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

        mTextView.setText("Beda kelas, beda pula tampilannya. Untuk mereka yang terbilang kaum menengah dalam strata sosial, penggunaan pakaian adat Jawa Barat dikhususkan dengan tambahan beberapa pernik. Para pria selain akan menggunakan baju bedahan putih, kain kebat batik, alas kaki sandal tarumpah, sabuk (beubeur), dan ikat kepala, mereka juga akan mengenakan arloji rantai emas yang digantungkan di saku baju sebagai kelengkapan berbusana\n" +
                "\n" +
                "Sumber: http://adat-tradisional.blogspot.com/2016/07/pakaian-adat-jawa-barat-sunda-gambar.html\n" +
                "Disalin dari Blog Adat Tradisional.\n" +
                "Sementara untuk para wanitanya, pakaian adat Jawa Barat yang dikenakan adalah kebaya beraneka warna sebagai atasan, kain kebat batik beraneka corak sebagai bawahan, beubeur (ikat pinggang), selendang berwarna, alas kaki berupa selop atau kelom geulis, dan perhiasan berupa kalung, gelang, giwang, dan cincin yang terbuat dari perak atau emas\n" +
                "\n" +
                "Sumber: http://adat-tradisional.blogspot.com/2016/07/pakaian-adat-jawa-barat-sunda-gambar.html\n" +
                "Disalin dari Blog Adat Tradisional.");
    }




}
