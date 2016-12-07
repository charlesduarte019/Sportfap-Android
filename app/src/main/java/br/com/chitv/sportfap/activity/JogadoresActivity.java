package br.com.chitv.sportfap.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.android.volley.VolleyError;

import java.util.ArrayList;
import java.util.List;

import br.com.chitv.sportfap.R;

public class JogadoresActivity extends AppCompatActivity {

//    private ReqRep reqRep;
//    private final String URL = "rest/jogador/listarJogadores";
//
//    private JSONArray jsonArray;
//    private JSONObject jsonObject;
//    private ArrayList arrayJogadores;
//
//    private ListView lvJogadores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogadores);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle(R.string.title_toolbar_jogador);

//        reqRep = new ReqRep();
//        reqRep.setReqRepObserved(this);
//
//        lvJogadores = (ListView) findViewById(R.id.lv_jogadores);
//        arrayJogadores = new ArrayList();
//
//        reqRep.methodGet(URL);

    }

//    @Override
//    public void doOnResponse(String response) {
//        Log.d("Response", response);
//    }
//
//    @Override
//    public void onErrorResponse(VolleyError error) {
//        Log.d("ErrorResponse", error.toString());
//    }
}
