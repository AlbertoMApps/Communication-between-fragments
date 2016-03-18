package development.alberto.com.comunicationbetweenfragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by alber on 13/03/2016.
 */
public class FragmentB extends Fragment {


    TextView tv;

    String textoGuardado;



    @Nullable
    @Override
    public
    View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.fragment_b, container,false);
        if(savedInstanceState==null){

        }else {//restaurar el texto

            textoGuardado = savedInstanceState.getString("texto");
            tv=(TextView) rootView.findViewById(R.id.tv_fragB);
            tv.setText(textoGuardado);

        }

        return rootView;

    }



    @Override

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        tv= (TextView) getActivity().findViewById(R.id.tv_fragB);
    }





    @Override
    public void onSaveInstanceState(Bundle outState) {//guardar el texto

        super.onSaveInstanceState(outState);
        outState.putString("texto", textoGuardado);
    }





    public void cambiarTexto(String texto){

        this.textoGuardado =texto;//almacenar en la variable cualquier cambio, del texto

        tv.setText(texto);

    }

}
