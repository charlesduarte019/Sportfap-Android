package br.com.chitv.sportfap;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.android.volley.VolleyError;

import connection.ReqRep;
import connection.ReqRepObserver;

public class PrincipalActivity extends AppCompatActivity implements ReqRepObserver{

    private Toolbar toolbar;
    private FloatingActionButton floatingActionButton;

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
        Log.d("OnResponse", response);
    }

    @Override
    public void onErrorResponse(VolleyError error) {
        Log.d("ErrorResponse", error.toString());
    }

    private void onClickListener() {

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("ClickListener", "Update");
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        loadingUIElements();
        setSupportActionBar(toolbar);

        reqRep = new ReqRep();
        reqRep.setReqRepObserved(this);

        onClickListener();
    }

    private void loadingUIElements(){
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        floatingActionButton = (FloatingActionButton) findViewById(R.id.fab_sync_princ);
    }
}
