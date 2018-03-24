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
public class FragmentInfoSejarahBandung2 extends Fragment {

    private TextView mTextView;

    public FragmentInfoSejarahBandung2() {
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

        mTextView.setText("Kota  Wisata Bandung yang berhawa sejuk, mempunyai sebuah bangunan yang disebut dengan Gedung sate. Gedung eksotis yang kental dengan nilai sejarah dan seni tersebut, menjadi ciri khas  yang ikonik dari Kota yang mempunyai sebutan Priangan tersebut.\n" +
                "\n" +
                "Gedung Sate yang mulai didirikan pada tahun 1920 tersebut, mempunyai ciri khas berupa ornamennya yang mempunyai arsitektur tusuk sate pada menara utama yang terletak di tengah gedung.\n" +
                "\n" +
                "Bangunan berwarna putih ini juga disebut sebagai Gouvernements Bedrijven (GB), pada masa penjajahan kolonial Belanda. Prosesi peletakan batu pertama dalam pembangunannya dilakukan oleh Johanna Catherina Coops yang merupakan puteri sulung dari Walikota Bandung, B. Coops. dan Petronella Roelofsen sekaligus mewakili Gubernur Jenderal Hindia Belanda di Batavia, J.P. Graaf van Limburg Stirum.\n" +
                "\n" +
                "Selain dihadiri oleh tokoh dan pejabat elite pada masa itu, pembangunan Gedung Sate ini merupakan hasil kolaborasi yang telah direncanakan dengan matang oleh tim arsitek Hindia Belanda.\n" +
                "\n" +
                "Tim arsitek tersenut beranggotakan Ir. J.Gerber yang merupakan seorang arsitek muda lulusan Fakultas Teknik Delf Nederland, Ir.Eh.De Roo dan Ir.G. Hendriks dan didukung oleh pihak dari Gemeente van Bandoeng, diketuai Kol. Pur. VL. Slors.\n" +
                "\n" +
                "Selain para arsitek Belanda tersebut, pengerjaan bangunan gedung ini juga banyak melibatkan pekerja pribumi dan China, dengan jumlah total hingga 2000 pekerja. Pekerja dari China yang dipekerjakan mencapai 150 orang dengan keahlian sebagai pengukir kayu dan batu nisan.\n" +
                "\n" +
                "Sementara itu, dari pihak pribumi, banyak yang didatangkan dari Kampung Sekeloa, Kampung Coblong Dago, Kampung Gandok dan Kampung Cibarengkok. Mereka bertugas sebagai tukang batu dan kuli aduk bahan bangunan.\n" +
                "\n" +
                "Arsitektur Gedung Sate yang mempunyai nuansa tradisional khas Indonesia ini, tidak lepas dari tangan dingin arsitek Ir. J.Gerber dan timnya, serta masukan dan arahan dari maestro arsitek Belanda yaitu Dr.Hendrik Petrus Berlage. Pada medio 1980-an, Gedung sate lebih dikenal sebagai Kantor Gubernur dan digunakan sebagai pusat pemerintahan Provinsi Jawa Barat.\n" +
                "\n" +
                "Gedung Sate di masa kini telah menjadi salah satu bangunan cagar budaya yang mempunyai nilai seni dan historis yang tinggi. Tidak salah jika bangunan ini menjadi ikon dari Kota Bandung yang banyak menyita perhatian masyarakat.");
    }




}
