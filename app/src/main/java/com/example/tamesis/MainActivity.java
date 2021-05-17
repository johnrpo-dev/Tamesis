package com.example.tamesis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Turismo> listadeActividades = new  ArrayList<>();
    RecyclerView listadoGrafico;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listadoGrafico = findViewById(R.id.listado);
        listadoGrafico.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearlista();
        ListaAdaptador adaptador = new ListaAdaptador(listadeActividades);
        listadoGrafico.setAdapter(adaptador);
    }

    private void crearlista (){
        listadeActividades.add(new Turismo("Conoce Támesis",R.drawable.ppal, "Támesis – un pueblo muy bonito en el Valle de Cartama en la región del suroeste de Antioquia a aproximadamente 3 horas desde Medellín. Rodeado por una naturaleza espectacular que invita a parar y disfrutar de las vistas del hermoso paisaje totalmente verde y natural y casas antiguas con fachadas típicas de muchos colores, Támesis no es tan famoso como por ejemplo Jardín o Jericó pero definitivamente puede competir al mismo nivel – es más, a mí Támesis me gusta más porque es más auténtico porque (aún) no llegan tantos turistas a recorrer el pueblo y sus alrededores."));


        listadeActividades.add(new Turismo("Cultura",R.drawable.cultura, "La gran cantidad de petroglifos encontrados en Támesis y sus alrededores son testigos de la riqueza y significado que tiene la zona en cuanto a cultura e historia por sus tierras fértiles. Cristian nos acompañó nuevamente para explicarnos el significado de los diferentes signos tallados en las rocas. En esta ruta conocerán no solo sobre la importancia del lugar en el pasado pero también podrán disfrutar del paisaje y el campo antioqueño.\n" +
                "\n" +
                "Pocas saben que en Támesis hay un resguardo indígena de los Embera Chamí. Fuimos con nuestro guía Cristian de Turis-Támesis que también es indígena y vive en el resguardo. Nos contó su historia personal, de la vida diaria de sus vecinos, el orgullo y también de los problemas de ser indígena en Colombia."));
        listadeActividades.add(new Turismo("Hoteles",R.drawable.hotel1, "En Támesis ofrece diferentes hospedajes dependiendo de los gustos, preferencias y presupuesto de cada uno: pueden alquilar una finca o una cabaña un poco alejada del pueblo para vivir la tranquilidad del campo y disfrutar una hermosas vistas o quedarse en uno de los hoteles en el pueblo para deambular por las calles empedradas del pueblo o conversar con la gente mientras toman un tinto en la plaza. \n" +
                "\n" +
                "•Hotel Balcón Tamesino\n" +
                "\n" +
                "•Hotel Vegas Del Rio\n" +
                "\n" +
                "•La Cabaña Encantada\n" +
                "\n" +
                "•La Oculta Lodge\n"
        ));
        listadeActividades.add(new Turismo("¿Que hacer en Támesis?", R.drawable.turismo,"1. Caminata cerro Cristo Rey\n" +
                "Una de las primeras cosas que les va a llamar la atención cuando lleguen a Támesis seguramente será el cerro Cristo Rey porque la montaña y su estatua “reinan” sobre el pueblo. El cerro es un símbolo de ese pueblo típico del suroeste antioqueño y además ofrece una hermosa vista sobre todo el Valle del Cartama, el Farallon de la Pintada y hasta el Río Cauca. \n"+
                "\n"+
                "2. Parapente\n" +
                "Los amantes de la adrenalina pueden optar también por un vuelo en parapente para disfrutar de uno de los paisajes más hermosos de Colombia desde la perspectiva de los pájaros. "
                ));

    }
}