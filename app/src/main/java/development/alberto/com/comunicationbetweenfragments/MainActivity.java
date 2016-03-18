package development.alberto.com.comunicationbetweenfragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Comunicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void responder(String datos) {//los datos recibidos son el numero de clicks
        android.app.FragmentManager fragmentManager = getFragmentManager();
        FragmentB fragmentb=(FragmentB) fragmentManager.findFragmentById(R.id.fragmentB_element); //le comunicamos al fragmento B cuando tengamoss los datos, lo que tiene que hacer
        fragmentb.cambiarTexto(datos);
    }
}
