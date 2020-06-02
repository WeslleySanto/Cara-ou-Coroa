package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView imageViewResultado;
    private Button buttonVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imageViewResultado = findViewById(R.id.imageViewResultado);
        buttonVoltar = findViewById(R.id.buttonVoltar);

        //Recuperar dados
        Bundle dados = getIntent().getExtras();

        int numero = dados.getInt("numero");

        if(numero == 0){ //cara
            imageViewResultado.setImageResource(R.drawable.moeda_cara);
        }else{//coroa
            imageViewResultado.setImageResource(R.drawable.moeda_coroa);
        }

        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
