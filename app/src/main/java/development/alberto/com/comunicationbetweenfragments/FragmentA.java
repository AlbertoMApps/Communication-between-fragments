package development.alberto.com.comunicationbetweenfragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by alber on 13/03/2016.
 */
public class FragmentA extends Fragment implements View.OnClickListener {

    Button btn;
    int contador =0;
    Comunicator comunicacion;







    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**     * restaurar textoGuardado     */

        if (null == savedInstanceState) {
            contador = 0;
        } else {
            contador = savedInstanceState.getInt("contador", 0);//0 es el valor por defecto    }

        }
    }


       public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle
        savedInstanceState){
            return inflater.inflate(R.layout.fragment_a, container, false);

        }


        @Override

        public void onActivityCreated (Bundle savedInstanceState){
            super.onActivityCreated(savedInstanceState);

            comunicacion = (Comunicator) getActivity();//ESTO SOLO ES POSIBLE SI MainActivity es una subclase de Comunicador por lo tanto implementa Comunicator: Polimorfismo
            btn = (Button) getActivity().findViewById(R.id.btn_fragA);
            btn.setOnClickListener(this);

        }


/** * guardar contador * @param outState */

        @Override
        public void onSaveInstanceState (Bundle outState){
            super.onSaveInstanceState(outState);

            outState.putInt("contador", contador);
        }


        @Override
        public void onClick (View v){
            contador++;
            comunicacion.responder("Numero de clicks +" + contador);//Esta llamando al metodo responder de la MainActivity    }
        }
    }