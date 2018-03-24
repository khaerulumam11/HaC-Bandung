package com.example.android.portfolio.Jakarta;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.portfolio.AdapterListview;
import com.example.android.portfolio.MakananJakarta.TablayoutInfoMakananJakarta1;
import com.example.android.portfolio.R;
import com.example.android.portfolio.TarianJakarta.TablayoutInfoTarianJakarta1;
import com.example.android.portfolio.TarianJakarta.TablayoutInfoTarianJakarta2;
import com.example.android.portfolio.TarianJakarta.TablayoutInfoTarianJakarta3;
import com.example.android.portfolio.TarianJakarta.TablayoutInfoTarianJakarta4;
import com.example.android.portfolio.TarianJakarta.TablayoutInfoTarianJakarta5;

/**
 * Created by nurcahyadiperdana on 11/28/17.
 */

public class ListviewTarianJakarta extends Activity {

    ListView list;

    String[] itemname = {
            "Tari Cokek",
            "Tari Lenggang Nyai",
            "Tari Renggong Manis",
            "Tari Sirih Kuning",
            "Tari Topeng Betawi"
    };

    Integer[] imgid = {
            R.mipmap.taricokek,
            R.mipmap.tarilenggangnyai,
            R.mipmap.tarirenggongmanis,
            R.mipmap.tarisirihkuning,
            R.mipmap.taritopengbetawi
    };
    String[] textname = {
            "Tari Cokek merupakan tarian tradisional yang berasal dari budaya Betawi. Selain dari Betawi, tarian ini juga seringkali dijumpai di kawasan Tangerang",
            "Asal mula tari lenggang ini berasal dari kisah seorang gadis cantik asal bertawi bernama Nyai Dasimah yang sedang berada dalam kebingunannya untuk memilih dua pilihan pasangan hidup",
            "Tari Renggong Manis merupakan hasil dari kawin silang budaya, yakni Tari Renggong Manis. Tarian yang merupakan ungkapan dari kebahagiaan dan juga rasa kebersamaan para remaja putri ini merupakan perpaduan diantara budaya Betawi",
            "Tari Renggong Manis merupakan hasil dari kawin silang budaya, yakni Tari Renggong Manis",
            "Tari Topeng Betawi adalah salah satu tarian tradisional masyarakat betawi di Jakarta yang memakai topeng sebagai ciri khasnya",
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
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoTarianJakarta1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoTarianJakarta2.class);
                    startActivityForResult(myIntent, 1);
                }
                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoTarianJakarta3.class);
                    startActivityForResult(myIntent, 2);
                }
                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoTarianJakarta4.class);
                    startActivityForResult(myIntent, 3);
                }
                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoTarianJakarta5.class);
                    startActivityForResult(myIntent, 4);
                }

            }
        });
    }

}