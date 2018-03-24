package com.example.android.portfolio.BatikSurabaya;


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
public class FragmentInfoBatikSurabaya1 extends Fragment {

    private TextView mTextView;

    public FragmentInfoBatikSurabaya1() {
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

        mTextView.setText("Batik Mangrove merupakan salah satu jenis batik tulis baru di Surabaya. Keistimewaan batik mangrove dibandingkan dengan batik lainnya adalah dalam hal motif dan proses pembuatan pewarna\n" +
                "       Di Wonorejo sendiri setidaknya ada 17 pembatik. Ibu- ibu warga Wonorejo membatik hanya berdasarkan kemauan mereka. Namun justru mereka tak henti melakukan eksperimen untuk berkreasi, sehingga pengembangannya tampak nyata. Kini batik Mangrove sudah menghiasi berbagai bentuk perlengkapan seperti taplak meja, sarung bantal hingga aneka pakaian. Karena motif dasarnya Mangrove dengan segala biotanya, batik tersebut disebut batik Mangrove. Dan kampung Wonorejo terutama di RW 07 itupun dinobatkan sebagai kampung batik Mangrove. Berkali- kali kunjungan wisatawan maupun pemerintahan selalu diarahkan ke kampung ini. Selain ingin mengetahui proses membatik Mangrove, wisatawan juga tertarik untuk membeli dan mencoba memasarkannya keluar kota. Kerap kali rumah para pembatik menjadi tempat jujuga wisatawan. Pada salah satu penggeraknya ada yang memang didisplay batik mangrove dalam berbagai bentuknya. Menurut salah satu pembatik Mangrove, mereka membatik disela- sela kesibukan sehari- hari sebagai ibu rumah tangga atau pekerja, tidak ada waktu khusus. Bahkan tidak ada waktu khusus. Bahkan tidak ada pertemuan rutin untuk berkumpul bersama. Namun, diam- diam mereka telah menghasilkan beragam produk batik mangrove yang siap untuk dipasarkan.\n" +
                "       Batik hasil kreasi ibu- ibu warga Wonorejo itupun diberi label Batik Tulis mangrove Pesisir Rungkut Surabaya. Batik Mangrove sudah dikonsumsi para pejabat baik dilingkungan Dinas Provinsi Jawa Timur maupun Dinas Pemerintahan Kota dan Kabupaten di Jawa Timur. Sehingga batik Mangrove terkenal ke berbagai wilayah di Jawa Timur dan sekitarnya. Bahkan oleh Dinas Koperasi, batik Mangrove sudah pernah diperkenalkan ke Singapura untuk menjajaki pasar di negeri Merlion itu. Saat ini Batik Mangrove mempunyai tempat workshop dan penjualan di rumah tinggal Ibu Nanie  di Jalan Wonorejo Timur Blok B no.03 Rungkut, Surabaya. Sesuai dengan keahlian yang dimiliki, akhirnya beliau mempunyai kesempatan untuk mengikuti pelatihan, melalui Kementerian Perindustrian Republik Indonesia di Badan Penelitian dan Pengembangan Industri Balai Besar Kerajinan dan Batik di Yogyakarta. Dengan pelatihan tersebut banyak manfaat yang diperoleh sehingga beliau ingin mengembangkan ilmu yang beliau peroleh sesuai dengan potensi yang dimiliki. Selain itu sebagai masyarakat Wonorejo Rungkut ingin memperkenalkan kepada masyarakat luas bahwa daerah lokasi tempat tinggal Ibu Nanie memiliki tempat wisata “Ekowisata Mangrove” beserta kerajinan Batik Tulis “Mangrove Pesisir”, dimana hal tersebut dapat meningkatkan kreatifitas masyarakat dan memajukan wilayah setempat khususnya Kota Surabaya.");

    }




}
