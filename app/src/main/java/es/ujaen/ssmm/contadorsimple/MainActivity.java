package es.ujaen.ssmm.contadorsimple;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /* Constantes y Variables Globales */
    public int contador;

    /**
     * Método de inicialización.
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inicializamos la varaible
        contador=0;
    }

    /**
     * Método restContador
     * Inicializa el contador a 0.
     * @param vista
     *
     * ¿Pórque recibe un parámetro de tipo View?
     * Recibimos un parámetro de tipo View denominada
     * vista, la cual, es la vista desencadenante del evento,
     * es decir, vista donde se hizo click
     */
    public void resetContador (View vista){
        contador=0; //Ponemos el contador a 0.
        mostrarContador(); //Mostramos el resultado
    }

    /**
     * Método increContador
     * Incrementa en una unidad el contador
     * @param vista
     */
    public void increContador (View vista){
        contador++; //Se pulso el botón de incrementar
        mostrarContador(); //Mostramos el resultado
    }

    /**
     * Método decreContador
     * Drecrementa en una unidad el contador
     * @param vista
     */
    public void decreContador (View vista){
        contador--; //Se pulso el botón de decrementar
        mostrarContador(); //Mostramos el resultado
    }

    /**
     * Método mostrarContador
     * Mostramos el valor del contador en la vista
     */
    public void mostrarContador (){
        //Creamos una instancia de la case textView y buscamos el
        //LabView donde queremos escribir (necesita un casting)
        TextView textoResultado = (TextView) findViewById(R.id.textView_cont);
        //Pasamos el resultado al textView
        textoResultado.setText("Contador: " + contador);

    }


}
