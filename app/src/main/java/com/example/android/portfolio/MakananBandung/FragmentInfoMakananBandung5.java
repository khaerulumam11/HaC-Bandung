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
public class FragmentInfoMakananBandung5 extends Fragment {

    private TextView mTextView;

    public FragmentInfoMakananBandung5() {
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

        mTextView.setText("Makanan khas bandung yang selanjutnya akan kita bahas adalah sebuah makanan yang bernama Siomay Bandung. Makanan bandung yang satu ini sangat mudah untuk kita temukan saat kita sedang berlibur ke suatu tempat di Indonesia, hal ini di karenakan memang makanan Siomay Bandung ini berasal dari Bandung, akan tetapi saat ini Siomay Bandung ini sudah banyak tersebar di kota-kota yang lainnya dan tentu tidak kalah enak.\n" +
                "\n" +
                "Makanan bandung yang satu ini sangat luar biasa, hal ini di karenakan makanan yang di balut dengan bumbu khas bandung ini sangat enak dan di sukai oleh berbagai kalangan. Biasanya Siomay Bandung ini di buat dari daging ikan, sagu dan juga bumbu kacang yang lezat. Bahkan makanan bandung yang satu ini sangat mudah di jumpai seperti misalkan saja sekolahan, perumahan atau bahkan perkantoran juga tertarik dengan makanan khas bandung yang satu ini.");
    }




}
