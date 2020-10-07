package com.example.myformulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MostrarDatos extends AppCompatActivity {

    TextView  tvNombre ,tvApellidos, tvEdad , tvCorreo;
    Button  btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_datos);

        tvNombre = (TextView)findViewById(R.id.tvNombre);
        tvApellidos =(TextView)findViewById(R.id.tvApellidos );
        tvEdad = (TextView)findViewById(R.id.tvEdad );
        tvCorreo = (TextView)findViewById(R.id.tvCorreo );
        btnOk =(Button)findViewById(R.id.btnOk );

        btnOk. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( MostrarDatos.this,MainActivity.class);
                startActivity(intent);

            }
        });

        mostrarDato();
    }
    private  void mostrarDato(){
        Bundle  datos = this.getIntent().getExtras();
        String  nombre = datos.getString( "name");
        String  apellidos = datos.getString( "ape");
        String  edad = datos.getString( "age");
        String  correo = datos.getString( "email");

        tvNombre.setText(nombre);
        tvApellidos.setText(apellidos);
        tvEdad .setText(edad );
        tvCorreo.setText(correo );


    }
}