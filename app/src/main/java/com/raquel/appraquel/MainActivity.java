package com.raquel.appraquel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;
    ImageView imageV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.ERahel);
        textView.setText("Ingeniera Raquel Elizabeth Acuña " +
                "estudia\n" +
                "    segundo año en Universidad Centroamericana Sabe tocar bateria y le gusta\n" +
                "    leer Biblia, Sus Padres Luis Acuña y Yolanda Talavera, es cristiana Nacio con\n" +
                "    buenos principios en un seno familiar que sirven a Dios");

        imageV = (ImageView)findViewById(R.id.imageV);
    }
}
