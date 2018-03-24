package com.example.android.portfolio.Kuis;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.portfolio.R;

public class Kuis9 extends AppCompatActivity {

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

        final String ac = getIntent().getStringExtra("score");
        e.setText(ac);

        d.setImageResource(R.mipmap.batikboschaperkasa);
        b.setText("Batik lahir pada tahun berapa ?");


        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String jwb = a.getText().toString();

                if (jwb.equals("2007")){
                    int skor1 = Integer.parseInt(ac) +10;
                    e.setText("Skor kamu : "+skor1);
                    Intent ab = new Intent(Kuis9.this,KuisTerakhir.class);
                    ab.putExtra("score",String.valueOf(skor1));
                    startActivity(ab);
                } else
                {
                    int skor2 = Integer.parseInt(ac);
                    Intent ad = new Intent(Kuis9.this,KuisTerakhir.class);
                    ad.putExtra("score",String.valueOf(skor2));
                    startActivity(ad);
                }
            }
        });
    }
}
