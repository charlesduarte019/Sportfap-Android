package br.com.chitv.sportfap.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.android.volley.VolleyError;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import br.com.chitv.sportfap.R;
import br.com.chitv.sportfap.adapter.EventoAdapter;
import br.com.chitv.sportfap.adapter.TimeAdapter;
import br.com.chitv.sportfap.connection.ReqRep;
import br.com.chitv.sportfap.connection.ReqRepObserver;
import br.com.chitv.sportfap.model.EventoModel;
import br.com.chitv.sportfap.model.TimeModel;

public class TimeActivity extends AppCompatActivity implements ReqRepObserver {

    private Toolbar toolbar;
    private RecyclerView recyclerView;
    private StaggeredGridLayoutManager gaggeredGridLayoutManager;
    private List<TimeModel> arrayListTime;
    private TimeAdapter timeAdapter;

    private ReqRep reqRep;
    private final String URL = "rest/time/listarTimes";

    private JSONArray jsonArray;
    private JSONObject jsonObject;

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

    public List<TimeModel> getList() {

        List<TimeModel> list = new ArrayList<>();

        list.add(new TimeModel("Piratas"));
        list.add(new TimeModel("Marujo"));

        return list;
    }

    @Override
    public void doOnResponse(String response) {

        arrayListTime = new ArrayList<>();

        try {
            jsonArray = new JSONArray(response);

            for (int i = 0; i < jsonArray.length(); i++) {
                jsonObject = new JSONObject(jsonArray.getString(i));
                arrayListTime.add(new TimeModel(jsonObject.getString("nome")));
            }

            timeAdapter = new TimeAdapter(TimeActivity.this, arrayListTime);
            recyclerView.setAdapter(timeAdapter);

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onErrorResponse(VolleyError error) {
        Log.d("Error Evento", error.toString());
    }

}
