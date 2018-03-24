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
public class FragmentInfoSejarahBandung5 extends Fragment {

    private TextView mTextView;

    public FragmentInfoSejarahBandung5() {
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

        mTextView.setText("Sejarah mencatat, bahwa ide awal pembangunan Stasiun Bandung mempunyai kaitan yang erat dengan dibukanya areal perkebunan di sekitar wilayah Bandung dan sekitarnya. Proyek pembangunan stasiun ini dimulai pada tahun 1870.\n" +
                "\n" +
                "Pada tanggal 17 Mei tahun 1884, Stasiun Bandung diresmikan oleh pemerintahan yang kala itu dijabat oleh Bupati Koesoemadilaga. Di saat yang bersamaan, jalur kereta Api  jurusan Batavia ke Bandung melalui Bogor dan Cianjur juga dibuka.\n" +
                "\n" +
                "Pembukaan jalur kereta api ini sangat menguntungkan para pemilik perkebunan (Preangerplanters), dimana melalui jalur ini, mereka bisa mengirimkan hasil perkebunannya dengan cepat menuju Batavia.\n" +
                "\n" +
                "Selain itu, untuk menunjang pengiriman hasil perkebunan, dibangunlah beberapa gudang penimbunan barang yang berdekatan dengan Stasiun Bandung seperti jalan Cibangkong dan Cikudatapeuh, maupun derah – daerah seperti Kosambi, Kiaracondong, Braga, Pasirkaliki, Ciroyom dan Andir.\n" +
                "\n" +
                "Pembangunan gudang – gudang tersebut akan digunakan untuk menyimpan hasil dari perkebunan untuk diangkut kemudian dengan menggunakan kereta menuju ke Batavia (Jakarta masa kini).\n" +
                "\n" +
                "Pada tanggal 1 November 1984, para pengusaha dan pemilik perusahaan perkebunan gula yang bersala dari Jawa Tengah dan Jawa Timur  (Suikerplanters), menyewa gerbong kereta menuju Bandung setelah rute Bandung menuju Surabaya diresmikan.\n" +
                "\n" +
                "Keberangkatan para Suikerplanters tersebut untuk menghadiri Kongres Pengusaha Perkebunan Gula di Surabaya yang diselenggarakan pada tahun 1896. Kongres tersebut diprakarsai oleh dewan Pengurus Besar Perkumpulan Pengusaha Perkebunan Gula (Bestuur van de Vereniging van Suikerplanters).\n" +
                "\n" +
                "Seni bangunan bergaya Art Deco tampaknya menjadi favorit para arsitek pada masa silam. Hal ini dapat ditemukan Pada Stasiun Bandung, yaitu hiasan kaca patri beton pada bagian selatan Stasiun. Arsitek FJA Cousin yang telah berjasa menjadi kreator seni tersebut dalam upayanya memperluas bangunan lama Stasiun Bandung pada tahun 1909.\n" +
                "\n" +
                "Stasiun Bandung mulai membuka rute yang menghubungkan Bandung-Rancaekek-Jatinangor-Citali pada tahun 1918. Berselang satu tahun kemudian, rute Bandung-Citeureup-Majalaya dibuka. Pada tahun 1921, pada jalur yang sama, rute Citeureup-Banjaran-Pegalengan resmi dibuka.\n" +
                "\n" +
                "Jalur Bandung menuju Kopo resmi dibuka pada tahun 1918 untuk melayani jalur yang menuju ke perkebunan teh. Menyusul rute ke Ciwidey pada bulan Maret 1921. Sejarah merekam pada saat itu, koran Belanda yang bernama Javabodie menulis, euforia masyarakat yang merayakan peresmian Stasiun Bandung yang dilakukan selama 2 hari berturut – turut.\n" +
                "\n" +
                "Perekonomian Kota Bandung yang maju pesat pada masa itu merupakan hasil dari komoditas perkebunan rakyat seperti kina, teh, kopi dan karet. Hasil – hasil bumi tersebut didistribusikan dengan cepat  menggunakan kereta api sebagai alat transportasi utama.\n" +
                "\n" +
                "Dengan prestasi yang demikian, Stasiun Bandung mendapatkan penghargaan dari pemerintah kota berupa sebuah monumen yang dibangun persis di depan stasiun, pada peron di bagian selatan.\n" +
                "\n" +
                "Monumen tersebut dihiasi oleh lentera yang berjumlah 1.000 lentera yang merupakan rancangan Ir. EH De Roo. Pada tahun 1990, tugu tersebut diganti oleh monumen lokomotif uap seri TC 1008 yang merupakan replika dari bentuk aslinya.\n" +
                "\n" +
                "Dibalik kisah sejarahnya yang panjang dan mengesankan, Stasiun Bandung menjadi daya tarik yang atraktif bagi pengunjung dan menjadi bagian dari rangkaian perjalanan menjelajah wisata Bandung.\n" +
                "\n");
    }




}
