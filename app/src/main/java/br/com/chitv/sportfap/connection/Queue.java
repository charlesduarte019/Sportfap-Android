package br.com.chitv.sportfap.connection;

import android.app.Application;
import android.text.TextUtils;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by c019 on 14/11/2016.
 */

public class Queue extends Application {

    private static final String TAG = Queue.class.getSimpleName();

    private static Queue queue;

    private RequestQueue requestQueue;

    @Override
    public void onCreate() {
        super.onCreate();
        queue = this;
    }

    public static synchronized Queue getInstance() {
        return queue;
    }

    public RequestQueue getRequestQueue() {
        if (requestQueue == null) {
            requestQueue = Volley.newRequestQueue(getApplicationContext());
        }
        return requestQueue;
    }

    public <T> void addToRequestQueue(Request<T> request, String tag) {
        request.setTag(TextUtils.isEmpty(tag) ? TAG : tag);
        getRequestQueue().add(request);
    }

    public <T> void addToRequestQueue(Request<T> request) {
        request.setTag(TAG);
        getRequestQueue().add(request);
    }

    public void cancelarRequestPending(Object tag) {
        if (requestQueue != null) {
            requestQueue.cancelAll(tag);
        }
    }

}
