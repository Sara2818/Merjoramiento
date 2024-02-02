package com.ug.merjoramiento;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText NOTA1;
    private TextView Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NOTA1=findViewById(R.id.nota1);
        Resultado=findViewById(R.id.resultado);

        Button calcularL =findViewById(R.id.button);
        calcularL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularLado();}
        });
    }
    private void calcularLado(){
        float lado = Float.parseFloat(NOTA1.getText().toString());

        float area= lado*lado;

        Resultado.setText(String.valueOf(area) + "cm^2");
}
    }