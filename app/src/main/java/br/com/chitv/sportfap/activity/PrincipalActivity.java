package br.com.chitv.sportfap.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

import br.com.chitv.sportfap.R;
import br.com.chitv.sportfap.adapter.PrincipalViewAdapter;

public class PrincipalActivity extends AppCompatActivity {

    private StaggeredGridLayoutManager gaggeredGridLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle(R.string.title_toolbar_principal);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        gaggeredGridLayoutManager = new StaggeredGridLayoutManager(2, 1);
        recyclerView.setLayoutManager(gaggeredGridLayoutManager);

        ArrayList<Integer> gaggeredListImg = getListImg();
        ArrayList<String> gaggeredListText = getListText();

        PrincipalViewAdapter rcAdapter = new PrincipalViewAdapter(PrincipalActivity.this, gaggeredListImg, gaggeredListText);
        recyclerView.setAdapter(rcAdapter);

    }

    private ArrayList<Integer> getListImg(){
        ArrayList<Integer> listViewItems = new ArrayList();

        listViewItems.add(R.drawable.soccer_border);
        listViewItems.add(R.drawable.basket_border);
        listViewItems.add(R.drawable.volley_border);
        listViewItems.add(R.drawable.bolling_border);

        return listViewItems;
    }

    private ArrayList<String> getListText(){
        ArrayList<String> listViewItems = new ArrayList();

        listViewItems.add("Futebol");
        listViewItems.add("Basquete");
        listViewItems.add("Volley");
        listViewItems.add("Boliche");

        return listViewItems;
    }
}

