package com.example.android.portfolio.Bandung;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.portfolio.AdapterListview;
import com.example.android.portfolio.BajudaerahBandung.TablayoutInfoBajudaerahBandung1;
import com.example.android.portfolio.BajudaerahBandung.TablayoutInfoBajudaerahBandung2;
import com.example.android.portfolio.BajudaerahBandung.TablayoutInfoBajudaerahBandung3;
import com.example.android.portfolio.BajudaerahBandung.TablayoutInfoBajudaerahBandung4;
import com.example.android.portfolio.R;

/**
 * Created by nurcahyadiperdana on 11/28/17.
 */

public class ListviewBajudaerahBandung extends Activity {

    ListView list;

    String[] itemname = {
            "Pakaian Adat Pengantin Bandung",
            "Pakaian Adat Bangsawan Bandung",
            "Pakaian Adat Bandung",
            "Pakaian Adat Sunda Menengah",

    };

    Integer[] imgid = {
            R.mipmap.bajupengantinadatbandung,
            R.mipmap.bajuadatbangsawanbandung,
            R.mipmap.bajuadatbandung,
            R.mipmap.bajuadatsundamenengah

    };

    String[] textname = {
            "Untuk keperluan upacara adat perkawinan, para pengantin adat Sunda akan mengenakan pakaian khusus yang dinamai pakaian Pengantin Sukapura.",
            "Bagi para pria bangsawan, pakaian adat Sunda yang mereka kenakan terdiri dari jas tutup berbahan beludru hitam yang disulam benang emas",
            "Para jajaka menggunakan jas takwa atau jas tutup dengan warna bebas (lebih sering hitam), celana panjang dengan warna yang sama",
            "Beda kelas, beda pula tampilannya. Untuk mereka yang terbilang kaum menengah dalam strata sosial, penggunaan pakaian adat",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        AdapterListview adapter = new AdapterListview(this, itemname, imgid, textname);
        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                //String Slecteditem = itemname[+position];
                // Toast.makeText(getApplicationContext(), "selamat datang", Toast.LENGTH_SHORT).show();
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoBajudaerahBandung1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoBajudaerahBandung2.class);
                    startActivityForResult(myIntent, 1);
                }
                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoBajudaerahBandung3.class);
                    startActivityForResult(myIntent, 2);
                }
                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoBajudaerahBandung4.class);
                    startActivityForResult(myIntent, 3);
                }
                if (position == 4) {
//                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoBajudaerahBandung5.class);
//                    startActivityForResult(myIntent, 4);
                }

            }
        });
    }

}