package br.com.chitv.sportfap.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.android.volley.VolleyError;

import br.com.chitv.sportfap.R;
import br.com.chitv.sportfap.connection.ReqRep;
import br.com.chitv.sportfap.connection.ReqRepObserver;
import br.com.chitv.sportfap.view.EventoActivity;

public class PrincipalActivity extends AppCompatActivity implements ReqRepObserver {

    private ReqRep reqRep;
    private Button buttonP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle(R.string.title_toolbar_principal);

        reqRep = new ReqRep();
        reqRep.setReqRepObserved(this);

        buttonP = (Button) findViewById(R.id.button_p);

        buttonP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PrincipalActivity.this, EventoActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void doOnResponse(final String response) {
        Log.d("OnResponse", response);
    }

    @Override
    public void onErrorResponse(VolleyError error) {
        Log.d("ErrorResponse", error.toString());
    }

    private void rvAdapter() {
    }

}
