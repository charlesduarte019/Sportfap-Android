package br.com.chitv.sportfap.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.android.volley.VolleyError;

import br.com.chitv.sportfap.R;
import br.com.chitv.sportfap.connection.ReqRepObserver;

public class EventoActivity extends AppCompatActivity implements ReqRepObserver {

    private Button buttonE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evento);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle(R.string.title_toolbar_evento);

        buttonE = (Button) findViewById(R.id.button_e);

        buttonE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EventoActivity.this, TimeActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void doOnResponse(String response) {

    }

    @Override
    public void onErrorResponse(VolleyError error) {

    }

}
