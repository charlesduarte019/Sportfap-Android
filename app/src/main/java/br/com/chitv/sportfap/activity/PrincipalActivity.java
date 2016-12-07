package br.com.chitv.sportfap.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

import br.com.chitv.sportfap.R;
import br.com.chitv.sportfap.adapter.PrincipalAdapter;
import br.com.chitv.sportfap.dao.CategoriasDao;

public class PrincipalActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private RecyclerView recyclerView;
    private StaggeredGridLayoutManager gaggeredGridLayoutManager;
    private List<CategoriasDao> arrayListCategoria;
    private PrincipalAdapter principalAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle(R.string.title_toolbar_principal);

        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        gaggeredGridLayoutManager = new StaggeredGridLayoutManager(2, 1);
        recyclerView.setLayoutManager(gaggeredGridLayoutManager);

        arrayListCategoria = getList();

        principalAdapter = new PrincipalAdapter(PrincipalActivity.this, arrayListCategoria);
        recyclerView.setAdapter(principalAdapter);

    }

    public List<CategoriasDao> getList() {

        List<CategoriasDao> list = new ArrayList<>();

        list.add(new CategoriasDao(R.drawable.soccer_border, "Futebol"));
        list.add(new CategoriasDao(R.drawable.volley_border, "Volei"));
        list.add(new CategoriasDao(R.drawable.basket_border, "Basquete"));
        list.add(new CategoriasDao(R.drawable.bolling_border, "Boliche"));

        return list;
    }
}

