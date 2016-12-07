package br.com.chitv.sportfap.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

import br.com.chitv.sportfap.R;
import br.com.chitv.sportfap.adapter.JogadorAdapter;
import br.com.chitv.sportfap.model.JogadorModel;

public class JogadoresActivity extends AppCompatActivity {

//    private ReqRep reqRep;
//    private final String URL = "rest/jogador/listarJogadores";
//
//    private JSONArray jsonArray;
//    private JSONObject jsonObject;
//    private ArrayList arrayJogadores;
//
//    private ListView lvJogadores;

    private Toolbar toolbar;
    private RecyclerView recyclerView;
    private StaggeredGridLayoutManager gaggeredGridLayoutManager;
    private List<JogadorModel> arrayListJogador;
    private JogadorAdapter jogadorAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogadores);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle(R.string.title_toolbar_jogador);

//        reqRep = new ReqRep();
//        reqRep.setReqRepObserved(this);
//        reqRep.methodGet(URL);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        gaggeredGridLayoutManager = new StaggeredGridLayoutManager(2, 1);
        recyclerView.setLayoutManager(gaggeredGridLayoutManager);

        arrayListJogador = getList();

        jogadorAdapter = new JogadorAdapter(JogadoresActivity.this, arrayListJogador);
        recyclerView.setAdapter(jogadorAdapter);

    }

    public List<JogadorModel> getList() {

        List<JogadorModel> list = new ArrayList<>();

        list.add(new JogadorModel(R.drawable.user_icon, "Charles", "19"));
        list.add(new JogadorModel(R.drawable.user_icon, "Hallef", "17"));
        list.add(new JogadorModel(R.drawable.user_icon, "Ismael", "15"));
        list.add(new JogadorModel(R.drawable.user_icon, "Thomas", "13"));
        list.add(new JogadorModel(R.drawable.user_icon, "Vinicius", "11"));

        return list;
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
