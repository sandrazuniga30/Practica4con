package com.example.sandy.conversor2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Sandy on 06/10/2015.
 */
public class Celsius extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.celsius);
        Bundle gra = this.getIntent().getExtras();
        double regr = gra.getDouble("grado");

        TextView tvresultado = (TextView) findViewById(R.id.resucel);
        tvresultado.setText(regr + "°F");

    }
}