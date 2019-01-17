package br.com.gabrielmoreira.exemplolistview;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    // Preparar o conteudo da lista.
    // Array de string
    // Nomes das cidades / UF

    static final String[] cidades = new String[]{"Campo Grande - MS",
                                                 "São Paulo - SP",
                                                 "Curitiba - PR"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Primeiro Passo - Criar o Adapter toda lista precisa

        setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_main,cidades));

        // Segundo Passo - Setar a Lista ao Layout

        final ListView cidadesListView = getListView();

        // Terceiro Passo - pegar o click do usuário

        cidadesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                // Ultimo passo -  tratar a informação a partir do click

                Toast.makeText(getApplicationContext(),"Cidade " + cidades[position], Toast.LENGTH_LONG ).show();

            }
        });




    }
}
