package br.com.chitv.sportfap.view;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.android.volley.VolleyError;

import br.com.chitv.sportfap.R;
import br.com.chitv.sportfap.connection.ReqRepObserver;

public class JogadoresActivity extends AppCompatActivity implements ReqRepObserver {

    private final String URL = "rest/jogador/listarJogadores";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogadores);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle(R.string.title_toolbar_jogador);

    }

    @Override
    public void doOnResponse(String response) {

    }

    @Override
    public void onErrorResponse(VolleyError error) {

    }
}
