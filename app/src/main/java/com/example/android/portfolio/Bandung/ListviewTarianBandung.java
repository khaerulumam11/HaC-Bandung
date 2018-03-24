package com.example.android.portfolio.Bandung;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.portfolio.AdapterListview;
import com.example.android.portfolio.R;
import com.example.android.portfolio.TarianBandung.TablayoutInfoTarianBandung1;
import com.example.android.portfolio.TarianBandung.TablayoutInfoTarianBandung2;
import com.example.android.portfolio.TarianBandung.TablayoutInfoTarianBandung3;
import com.example.android.portfolio.TarianBandung.TablayoutInfoTarianBandung4;

/**
 * Created by nurcahyadiperdana on 11/28/17.
 */

public class ListviewTarianBandung extends Activity {

    ListView list;

    String[] itemname = {
            "Tari Topeng Priangan",
            "Tari Jaipong",
            "Tari Merak Priangan",
            "Tari Buyung"

    };

    Integer[] imgid = {
            R.mipmap.taritoprngpriangan,
            R.mipmap.tarijaipong,
            R.mipmap.tarimerakpriangan,
            R.mipmap.taribuyung,

    };

    String[] textname = {
            "Tari Topeng Priangan adalah tari topeng yang menyebar di wilayah Jawa Barat sekarang ini. Dalam gerak dbanyak gerakan yang sedikit mirip dengan tari Topeng Cirebon",
            "Kemunculan tari jaipongan 1980 an yang lahir dari kekreatifitasan para seniman Bandung yang dikenal dengan Gugum Gumbira",
            "Tari Merak merupakan tarian kreasi baru dari daerah Pasundan, Jawa Barat. Tarian ini diciptakan oleh Raden Tjetjep Somantri",
            "Merupakan tarian tradisional yang biasanya dilakukan pada acara puncak pada upacara seren taun yang dilakukan masyarakat Jawa Barat",
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
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoTarianBandung1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoTarianBandung2.class);
                    startActivityForResult(myIntent, 1);
                }
                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoTarianBandung3.class);
                    startActivityForResult(myIntent, 2);
                }
                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoTarianBandung4.class);
                    startActivityForResult(myIntent, 3);
                }
                if (position == 4) {
//                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoTarianBandung5.class);
//                    startActivityForResult(myIntent, 4);
                }

            }
        });
    }

}