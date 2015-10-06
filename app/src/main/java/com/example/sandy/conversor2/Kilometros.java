package com.example.sandy.conversor2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Sandy on 06/10/2015.
 */
public class Kilometros extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kilometros);
        Bundle km = this.getIntent().getExtras();
        double a = km.getDouble("KM");

        TextView tvrespuesta = (TextView) findViewById(R.id.resulkm);
        tvrespuesta.setText(a + "Millas");

    }
}
