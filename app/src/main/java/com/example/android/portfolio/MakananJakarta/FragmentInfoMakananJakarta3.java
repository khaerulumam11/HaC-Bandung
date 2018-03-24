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
public class FragmentInfoMakananJakarta3 extends Fragment {

    private TextView mTextView;

    public FragmentInfoMakananJakarta3() {
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

        mTextView.setText("Untuk yang pertama, kamu mungkin sudah tidak asing dengan makanan ini, Namanya kerak telor. Makanan khas Betawi ini bisa dikatakan sebagai ikon kuliner Jakarta yang dikenal oleh orang-orang dari luar kota Jakarta. Kerak telor sendiri adalah makanan yang dibuat dari bahan dasar berupa beras ketan putih, telur ayam atau telur bebek, ebi kering, bawang goreng, dan diberi bumbu halus dari campuran kelapa sangrai, cabe merah, garam, gula, merica, jahe, dan kencur.\n" +
                "\n" +
                "Kerak telor dimasak dengan cara yang unik. Biasanya panganan ini dimasak dalam wajan kecil tanpa menggunakan minyak. Saat dibakar dengan arang, kerak telor yang sudah setengah matang akan dibalik bersama dengan wajannya. Perihal rasanya, kerak telor akan memberikan pengalaman baru bagi lidah kamu. Rasa kerak telor yang gurih dengan tekstur beras ketan yang legit akan membuat kamu betah berlama-lama untuk mengunyahnya.");
    }




}
