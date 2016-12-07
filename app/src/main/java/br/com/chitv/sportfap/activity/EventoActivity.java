package br.com.chitv.sportfap.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;

import com.android.volley.VolleyError;

import java.util.ArrayList;
import java.util.List;

import br.com.chitv.sportfap.R;
import br.com.chitv.sportfap.adapter.EventoAdapter;
import br.com.chitv.sportfap.connection.ReqRepObserver;
import br.com.chitv.sportfap.model.EventoModel;

public class EventoActivity extends AppCompatActivity implements ReqRepObserver {

    private Toolbar toolbar;
    private RecyclerView recyclerView;
    private StaggeredGridLayoutManager gaggeredGridLayoutManager;
    private List<EventoModel> arrayListEvento;
    private EventoAdapter eventoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evento);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle(R.string.title_toolbar_evento);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        gaggeredGridLayoutManager = new StaggeredGridLayoutManager(1, 1);
        recyclerView.setLayoutManager(gaggeredGridLayoutManager);

        arrayListEvento = getList();

        eventoAdapter = new EventoAdapter(EventoActivity.this, arrayListEvento);
        recyclerView.setAdapter(eventoAdapter);

    }

    public List<EventoModel> getList() {

        List<EventoModel> list = new ArrayList<>();

        list.add(new EventoModel("Campeonato 2012.1"));
        list.add(new EventoModel("Campeonato 2012.2"));
        list.add(new EventoModel("Campeonato 2013.1"));
        list.add(new EventoModel("Campeonato 2013.2"));
        list.add(new EventoModel("Campeonato 2014.1"));
        list.add(new EventoModel("Campeonato 2014.2"));
        list.add(new EventoModel("Campeonato 2015.1"));
        list.add(new EventoModel("Campeonato 2015.2"));
        list.add(new EventoModel("Campeonato 2016.1"));
        list.add(new EventoModel("Campeonato 2016.2"));

        return list;
    }

    @Override
    public void doOnResponse(String response) {

    }

    @Override
    public void onErrorResponse(VolleyError error) {

    }
}
