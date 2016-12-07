package br.com.chitv.sportfap.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.android.volley.VolleyError;

import java.util.ArrayList;
import java.util.List;

import br.com.chitv.sportfap.R;
import br.com.chitv.sportfap.adapter.EventoAdapter;
import br.com.chitv.sportfap.adapter.TimeAdapter;
import br.com.chitv.sportfap.connection.ReqRepObserver;
import br.com.chitv.sportfap.dao.EventosDao;
import br.com.chitv.sportfap.dao.TimesDao;

public class TimeActivity extends AppCompatActivity implements ReqRepObserver {

    private Toolbar toolbar;
    private RecyclerView recyclerView;
    private StaggeredGridLayoutManager gaggeredGridLayoutManager;
    private List<TimesDao> arrayListTime;
    private TimeAdapter timeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle(R.string.title_toolbar_time);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        gaggeredGridLayoutManager = new StaggeredGridLayoutManager(1, 1);
        recyclerView.setLayoutManager(gaggeredGridLayoutManager);

        arrayListTime = getList();

        timeAdapter = new TimeAdapter(TimeActivity.this, arrayListTime);
        recyclerView.setAdapter(timeAdapter);

    }

    public List<TimesDao> getList() {

        List<TimesDao> list = new ArrayList<>();

        list.add(new TimesDao("Piratas"));

        return list;
    }

    @Override
    public void doOnResponse(String response) {

    }

    @Override
    public void onErrorResponse(VolleyError error) {

    }

}
