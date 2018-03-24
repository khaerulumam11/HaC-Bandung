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
public class FragmentInfoMakananBandung1 extends Fragment {

    private TextView mTextView;

    public FragmentInfoMakananBandung1() {
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

        mTextView.setText("Makanan khas bandung atau masakan khas bandung yang selanjutnya akan kita bahas di sini adalah sebuah makanan yang bernama Bandros. Makanan yang satu ini merupakan makanan atau jajanan khas bandung yang sangat populer. Di buat dengan bahan utamanya yakni tepung terigu yang di olah sedemikian rupa dengan di campur dengan santan kelapa, makanan khas bandung ini bisa membuat ketagihan.\n" +
                "\n" +
                "Bandros adalah sebuah makanan yang di masak dengan menggunakan cetakan cekung khas yang kemudian di beri kelapa parut, sehingga menghasilkan aroma dan cita rasa yang sangat lezat khas bandung. Biasanya untuk saran penyajian makanan bernama Bandros ini wajib untuk anda nikmati ketika masih baru di masak yakni masih hangat yang tentu sangat cocok bila di makan bersama dengan minuman seperti kopi atau teh.");
    }




}
