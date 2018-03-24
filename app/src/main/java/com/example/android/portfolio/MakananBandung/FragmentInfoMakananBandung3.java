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
public class FragmentInfoMakananBandung3 extends Fragment {

    private TextView mTextView;

    public FragmentInfoMakananBandung3() {
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

        mTextView.setText("Makanan khas bandung yang selanjutnya akan kita bahas adalah sebuah makanan yang tentu sudah tidak asing lagi bagi pencinta kuliner tanah air, pasalnya makanan khas bandung yang satu ini telah tersebar luas di seluruh indonesia. Pada dasarnya makanan khas bandung yang bernama Lotek ini sangat mirip dengan pecel yang sudah kita kenal. Akan tetapi yang membedakan adalah dalam bumbu lotek terdapat bahan seperti gula merah, bawang putih dan terasi.\n" +
                "\n" +
                "Tentu dengan beberapa bahan yang telah kita sebutkan yang tersemat dalam bumbu tersebut membuat makanan khas bandung ini mempunyai rasa yang lebih manis jika di banding kan dengan pecel yang sudah kita kenal. Saat menyantap Lotek ini anda bisa memilih di campur dengan nasi hangat atau lontong, akan tetapi jangan sampai lupa kriuknya yakni biasanya dalam makanan Lotek ini di campur pula bawang goreng dan kerupuk.");
    }




}
