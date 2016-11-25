package connection;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.RetryPolicy;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import java.util.Map;

public class ReqRep {

    private ReqRepObserver reqRepObserver;
    private static final String IP = "http://192.168.43.140:8080/sportfap/";

    public void setReqRepObserved(ReqRepObserver reqRepObserver) {
        this.reqRepObserver = reqRepObserver;
    }

    public void methodGet(String URL) {
        StringRequest getRequest = new StringRequest(Request.Method.GET, (IP),
                getResponseListener(),
                getErrorResponse()
        );

        RetryPolicy policy = new DefaultRetryPolicy(DefaultRetryPolicy.DEFAULT_TIMEOUT_MS, DefaultRetryPolicy.DEFAULT_MAX_RETRIES, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        getRequest.setRetryPolicy(policy);

        Queue.getInstance().addToRequestQueue(getRequest);

    }

    public void methodPost(final Map<String, String> entity, String URL) {
        StringRequest postRequest = new StringRequest(Request.Method.POST, (IP + URL),
                getResponseListener(),
                getErrorResponse()
        ) {
            @Override
            protected Map<String, String> getParams() {
                return entity;
            }
        };

        RetryPolicy policy = new DefaultRetryPolicy(DefaultRetryPolicy.DEFAULT_TIMEOUT_MS, DefaultRetryPolicy.DEFAULT_MAX_RETRIES, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        postRequest.setRetryPolicy(policy);

        Queue.getInstance().addToRequestQueue(postRequest);

    }

    public Response.Listener<String> getResponseListener() {
        return new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                // Observer
                reqRepObserver.doOnResponse(response);
            }
        };
    }

    public Response.ErrorListener getErrorResponse() {
        return new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                // Observer
                reqRepObserver.onErrorResponse(error);
            }
        };
    }

}
