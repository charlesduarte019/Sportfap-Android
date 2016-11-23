package br.com.chitv.sportfap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.android.volley.VolleyError;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import connection.ReqRep;
import connection.ReqRepObserver;

public class PrincipalActivity extends AppCompatActivity implements ReqRepObserver {

    private ListView lv_jogadores;

    private Button bt_reqRep;

    private JSONArray jsonArray;
    private JSONObject jsonObject;
    private ArrayList<String> arrayJogadores;
//    private Map<String, String> params;
    private ReqRep reqRep;

    private final String URL = "rest/jogador/listarJogadores";

    @Override
    public void doOnResponse(final String response) {
//        try {
//            jsonArray = new JSONArray(response);
//
//            for (int i = 0; i < jsonArray.length(); i++) {
//                jsonObject = new JSONObject(jsonArray.getString(i));
//                arrayJogadores.add(jsonObject.getString("nome"));
//                arrayJogadores.add(jsonObject.getString("numero"));
//                arrayJogadores.add(jsonObject.getString("semestre"));
//                arrayJogadores.add(jsonObject.getString("curso"));
//            }
//
//            if (!arrayJogadores.isEmpty()) {
//                ArrayAdapter<String> adapterJogadores = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, arrayJogadores);
//                listView.setAdapter(adapterJogadores);
//            }
//
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
        System.out.println("Retornou");
    }

//    @Override
//    public void onErrorResponse(VolleyError error) {
//        System.out.println("Erro: " + error);
//    }

    private void onClickListener() {
        bt_reqRep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reqRep.methodGet(URL);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        reqRep = new ReqRep();
        reqRep.setReqRepObserved(this);

//        params = new HashMap<>();
        arrayJogadores = new ArrayList<>();

        lv_jogadores = (ListView) findViewById(R.id.lv_jogadores);
        bt_reqRep = (Button) findViewById(R.id.bt_req_rep);

        onClickListener();
//        params.put("","");
//        reqRep.methodPost(params, URL);
    }
}
