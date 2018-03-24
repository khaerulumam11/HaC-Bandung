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
public class FragmentInfoSejarahBandung1 extends Fragment {

    private TextView mTextView;

    public FragmentInfoSejarahBandung1() {
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

        mTextView.setText("Pada tahun 1926, Van Galen Lasr dan C.P Wolff Schoemaker yang merupakan Guru Besar Technische Hoogeschool te Bandoeng ( kini Institut Teknologi Bandung) yang juga merupakan seorang arsitek, merancang sebuah bangunan serbaguna yang sangat megah.\n" +
                "\n" +
                "Kemegahan gedung ini terlihat dari struktur rancangannya yang sangat luas, penggunaan marmer yang berkilau buatan italia sebagai lantainya, ruangan yang difungsikan sebagai ruang untuk bersantai sembari minum – minum yang terbuat dari kayu cikenhout, ditambah dengan lampu kristal hias sebagai pemanis ruangan yang tergantung dan terlihat gemerlap.\n" +
                "\n" +
                "Dengan luas areal mencapai 7.500 m2, pertama kali dibangun pada tahun 1895, bangunan ini dinamakan  Sociëteit Concordi, yang digunakan sebagai sarana berkumpul para pembesar, perwira, pegawai perkebunan belanda dan pengusaha Belanda yang ada di Kota Bandung.\n" +
                "\n" +
                "Di tahun 1926, bangunan megah ini direnovasi ulang secara keseluruhan oleh Wolff Schoemacher, Aalbers dan Van Gallen dan rekan – rekannya. Karena gedung ini digunakan untuk berkumpul para elite Belanda pada masa itu. Pada malam harinya, gedung ini penuh dengan keriuhan oleh mereka yang sedang berpesta, berdansa, menonton pertunjukan kesenian hingga makan malam.\n" +
                "\n" +
                "Hingga beralih masa pada pendudukan penjajah Jepang, bangunan gedung ini dinamakan Dai Toa Kaman yang berfungsi sebagai pusat kebudayaan. Pada saat peristiwa proklamasi kemerdekaan Indoenesia tanggal 17 Agustus 1945, di gedung ini pula, oleh para pemuda Indonesia kemudian menjadikannya sebagai markas komando yang bertujuan merebut kekuasaan dari penjajah Jepang yang masih tersisa.\n" +
                "\n" +
                "Setelah pulih dari penjajahan dan kondisi pemerintahan Indonesia telah terbentuk pada periode 1946 hingga 1950, gedung concordia ini difungsikan kembali sebagai tempat untuk menggelar pertemuan umum oleh pemerintahan Haminte Bandung, Negara Pasundan, dan Recomba Jawa Barat.");
    }




}
