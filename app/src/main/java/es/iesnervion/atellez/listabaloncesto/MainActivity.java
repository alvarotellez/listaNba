package es.iesnervion.atellez.listabaloncesto;

import android.app.ListActivity;
import android.content.Context;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends ListActivity {
    TextView seleccion;
    private static final String []equipos ={"lorem","ipsun","elit","morbi","adios"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setListAdapter(new IconicAdapter<String>(this,R.layout.fila,R.id.label,equipos));

    }
    public void onListItemClick(ListView parent, View v, int posicion, long id){
        seleccion.setText(equipos[posicion]);
    }

    class IconicAdapter<T> extends ArrayAdapter<T> {
        IconicAdapter(Context c, int resourceId, int textId, T[] objects) {
            super(c,resourceId,textId,objects);
        }

        public  View getView(int posicion, View convertView, ViewGroup parent){

            View vistaFila = super.getView(posicion,convertView,parent);

            ImageView icono = (ImageView) vistaFila.findViewById(R.id.icon);

            if(equipos[posicion].equals("lorem")){

            }
            else if(equipos[posicion].equals("ipsun")){
                icono.setImageResource(R.drawable.porteria);
            }
            else if(equipos[posicion].equals("elit")){
                icono.setImageResource(R.drawable.natacion);
            }
            else if(equipos[posicion].equals("morbi")){
                icono.setImageResource(R.drawable.carrera);
            }
            else if(equipos[posicion].equals("morbi")){
                icono.setImageResource(R.drawable.ganadores);
            }
            return (vistaFila);
        }
    }
}
