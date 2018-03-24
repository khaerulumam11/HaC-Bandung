package com.example.android.portfolio.Bandung;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.portfolio.AdapterListview;
import com.example.android.portfolio.MakananBandung.TablayoutInfoMakananBandung1;
import com.example.android.portfolio.MakananBandung.TablayoutInfoMakananBandung2;
import com.example.android.portfolio.MakananBandung.TablayoutInfoMakananBandung3;
import com.example.android.portfolio.MakananBandung.TablayoutInfoMakananBandung4;
import com.example.android.portfolio.MakananBandung.TablayoutInfoMakananBandung5;
import com.example.android.portfolio.MakananJakarta.TablayoutInfoMakananJakarta1;
import com.example.android.portfolio.R;

/**
 * Created by nurcahyadiperdana on 11/28/17.
 */

public class ListviewMakananBandung extends Activity {
    ListView list;

    String[] itemname = {
            "Bandros Bandung",
            "Kupat Tahu",
            "Lotek Bandung",
            "Mie Kocok Bandung",
            "Siomay Bandung"
    };

    Integer[] imgid = {
            R.mipmap.bandrosbandung,
            R.mipmap.kupattahu,
            R.mipmap.lotekbandung,
            R.mipmap.miekocokbandung,
            R.mipmap.siomaybandung,

    };

    String[] textname = {
            "Makanan khas bandung atau masakan khas bandung yang selanjutnya akan kita bahas di sini adalah sebuah makanan yang bernama Bandros",
            "Masakan khas bandung yang berikutnya akan ada dalam bahasan disini adalah sebuah makanan yang populer dengan nama Kupat Tahu",
            "Makanan khas bandung yang selanjutnya akan kita bahas adalah sebuah makanan yang tentu sudah tidak asing lagi bagi pencinta kuliner tanah air",
            "Makanan khas bandung yang berikutnya akan kita bahas di sini adalah sebuah makanan yang terkenal dengan nama Mie Kocok",
            "Makanan khas bandung yang selanjutnya akan kita bahas adalah sebuah makanan yang bernama Siomay Bandung",
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
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoMakananBandung1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoMakananBandung2.class);
                    startActivityForResult(myIntent, 1);
                }
                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoMakananBandung3.class);
                    startActivityForResult(myIntent, 2);
                }
                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoMakananBandung4.class);
                    startActivityForResult(myIntent, 3);
                }
                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoMakananBandung5.class);
                    startActivityForResult(myIntent, 4);
                }

            }
        });
    }

}