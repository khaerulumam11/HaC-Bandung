package com.example.android.portfolio.Kuis;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.portfolio.R;

public class Kuis1 extends AppCompatActivity {

    private EditText a;
    private TextView b,e;
    private Button c;
    private ImageView d;
    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis1);

        a = (EditText) findViewById(R.id.jawaban);
        b = (TextView) findViewById(R.id.pertanyaan);
        c = (Button) findViewById(R.id.submit);
        d = (ImageView) findViewById(R.id.image);
        e = (TextView) findViewById(R.id.skor);

        d.setImageResource(R.mipmap.gedungmerdeka);
        b.setText("Apakah nama gedung diatas ?");

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String jwb = a.getText().toString();

                if (jwb.equals("Gedung Merdeka") || jwb.equals("Merdeka")){
                    int skor1 = score +10;
                    e.setText("Skor kamu : "+skor1);
                    Intent ab = new Intent(Kuis1.this,Kuis2.class);
                    ab.putExtra("score",String.valueOf(skor1));
                    startActivity(ab);
                } else
                {
                    Intent ad = new Intent(Kuis1.this,Kuis2.class);
                    ad.putExtra("score",String.valueOf(score));
                    startActivity(ad);
                }
            }
        });
    }
}
