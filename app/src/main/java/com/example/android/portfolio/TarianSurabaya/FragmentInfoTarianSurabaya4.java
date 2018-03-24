package com.example.android.portfolio.TarianSurabaya;


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
public class FragmentInfoTarianSurabaya4 extends Fragment {

    private TextView mTextView;

    public FragmentInfoTarianSurabaya4() {
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

        mTextView.setText("Tari Caping Ngancak adalah tarian tradisional dari kabupaten Lamongan, Jawa Timur, yang menggambarkan tentang aktivitas para petani di sawah. Dalam tarian ini penari menari layaknya para petani dengan menggunakan caping atau topi yang terbuat dari anyaman bambu sebagai attribute menarinya. Tari Caping Ngancak ini merupakan salah satu tarian tradisional dari kabupaten Lamongan yang terkenal selain Tari Boran.\n" +
                "\n" +
                "Tari Caping Ngancak ini merupakan tarian kreasi baru yang dikemas apik dengan gaya tradisional. Sesuai dengan tema dari tarian ini yang menggambarkan aktivitas para petani saat di sawah. Sehingga baik dari kostum dan gerakannya menggambarkan layaknya para petani di sawah. Tari Caping Ngancak ini awalnya diciptakan oleh Tri Kristiani dan Ninin dalam rangka mengikuti festival budaya yang digelar di Jawa Timur untuk mewakili kabupaten Lamongan. Tarian ini kemudian mendapat sambutan baik dengan memenangkan berbagai penghargaan dalam festival budaya dan mulai dikenal oleh masyarakat luas.\n" +
                "\n" +
                "Dalam pertunjukannya Tari Caping Ngancak ini dilakukan oleh penari secara berkelompok. Tarian ini biasanya dilakukan oleh 9 orang penari wanita dengan formasi dan gerakan yang kompak, lincah dan penuh makna. Gerakan dalam tarian ini menggambarkan aktivitas para petani di sawah mulai dari menanam padi hingga panen. Tarian ini didominasi dengan gerakan tangan dan permainan caping sebagai attribute menari mereka. Gerakan tersebut dilakukan secara kompak dan rapi sehingga terlihat menarik.\n" +
                "\n" +
                "Dalam pertunjukannya penari juga menggunakan kostum layaknya seorang petani dengan caping sebagai attribute menarinya. Pada bagian atas penari menggunakan baju lengan panjang. kemudian pada bagian bawah menggunakan celana sepanjang dengkul dan kain sarung yang menutupinya. Selain itu juga berbagai aksesoris seperti sabuk dengan kain depan – belakang lengkap dengan hiasan pernak – pernik sebagai pemanis.");
    }




}
