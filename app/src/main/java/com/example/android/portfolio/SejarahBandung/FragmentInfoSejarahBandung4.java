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
public class FragmentInfoSejarahBandung4 extends Fragment {

    private TextView mTextView;

    public FragmentInfoSejarahBandung4() {
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

        mTextView.setText("Ada banyak hal yang menarik dari obyek wisata Bandung  ini, terutama dari sisi sejarahnya di masa silam. Dahulu, ketika kota Bandung baru berdiri, kuda menjadi transportadi andalan yang digunakan untuk mengantarkan surat.\n" +
                "\n" +
                "Ada sebuah jalan yang bernama Jalan banceuy yang dahulu bernama Oude Kerkhoffweg karena disna merupakan bekas kuburan China. Lambat laun, lokasi tersebut kini semkain ramai digunakan sebagai pusat penjualan suku cadang mobil dan peralatan listrik.\n" +
                "\n" +
                "Alun – alun bandung yang menempati sisi di bagian selatan salah satu jalan raya pos (Grote Postweg) yang lokasinya berdekatan dengan Kantor Pos Besar Bandung, terkadang disebut masyarakat sekitar masih ada, tapi juga tidak ada. Aneh memang.\n" +
                "\n" +
                "Masyarakat yang menyebut tidak ada, beranggapan bahwa lokasi yang dimaksud telah tiada dan secara fisik telah digantikan dengan bangunan plaza modern yang menjadi bagian dari Masjid Raya bandung.\n" +
                "\n" +
                "Sebaliknya, saah satu obyek wisata bandung yang bersejarah ini disebut oleh sebagian masyarakat masih ada, lantaran mereka jugha menyebutkan tempat ini sebagai Alun – alun Bandung.\n" +
                "\n" +
                "Sempat direnovasi beberapa kali oleh pemerintah hingga terakhir dilakukan pada tahun 2014. Hingga pada tanggal 31 Desember pada tahun yang sama, Walikota Bandung yang saat itu dijabat oleh Ridwan Kamil, meresmikan pengunaan Alun – alun Bandung secara resmi.\n" +
                "\n" +
                "Dengan luas area taman yang mencapai 1,2000 meter persegi, kawasan obyek wisata bandung ini dilengkapi dengan aneka fasilitas yang memanjakan pengunjungnya.  Dilengkapi dengan rumput sintetis, fasilitas pendukung seperti arena bermain anak, perpustakaan hingga jaringan internet melalui WiFi, bisa ditemukan disini.\n" +
                "\n" +
                "Disebelah utara alun -alun, terdapat halte bis yang memanjang guna melengkapi fasilitas bangunan yang ada pada Alun – laun tersebut. Selain itu, di kawasan ini pula, banyak terdapat penjaja kuliner dan pedagang aksesoris.\n" +
                "\n" +
                "Selain berfungsi sebagai taman hiburan dan sarana berkumpul, disekitar Alun – alun ini juga terdapat berbagai lokasi untuk berbelanja seperti di Jalan Dalem Kaum, Jalan Dewi Sartika, Jalan Otto Iskandardinata, atau Jalan Sudirman.");
    }




}
