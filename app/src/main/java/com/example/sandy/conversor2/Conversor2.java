package com.example.sandy.conversor2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Conversor2 extends AppCompatActivity {

    private View.OnClickListener click  = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            convertirkm();

        }
    };
    private View.OnClickListener click2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            convertircel();

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversor2);

        Button botonkm = (Button) findViewById(R.id.km);
        botonkm.setOnClickListener(click);
        Button botoncel = (Button) findViewById(R.id.Celsius);
        botoncel.setOnClickListener(click2);
    }

        private void convertirkm(){
            EditText kilo = (EditText)findViewById(R.id.editText);
            int Km = Integer.parseInt(kilo.getText().toString());
            double millas = .621371;
            double resultado = Km*millas;

            Intent a =new Intent(this,Kilometros.class);
            a.putExtra("KM", resultado);
            startActivity(a);
        }

        private void convertircel (){
            EditText celsius = (EditText)findViewById(R.id.editText2);
            int cel = Integer.parseInt(celsius.getText().toString());
            double fah = 9/5+32;
            double resultadogra = cel * fah;

            Intent c = new Intent(this,Celsius.class);
            c.putExtra("celsius",resultadogra);
            startActivity(c);
        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_conversor2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
