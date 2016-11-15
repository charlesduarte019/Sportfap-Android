package br.com.chitv.sportfap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private void runActivity() {

        Thread t = new Thread() {
            public void run() {

                new Timer().schedule(new TimerTask() {

                    @Override
                    public void run() {

                        Intent intent = new Intent();
                        intent.setClass(MainActivity.this, PrincipalActivity.class);
                        finish();
                        startActivity(intent);

                    }

                }, 100);
            }

        };

        t.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        runActivity();
    }
}
