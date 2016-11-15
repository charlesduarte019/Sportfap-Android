package connection;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.RetryPolicy;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import java.util.Map;

/**
 * Created by c019 on 14/11/2016.
 */

public class ReqRep {

    private ReqRepObserver reqRepObserver;
    private final static String IP = "http://";

    public void setNetworkObserved(ReqRepObserver reqRepObserver) {
        this.reqRepObserver = reqRepObserver;
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
                // response
                reqRepObserver.doOnResponse(response);
            }
        };
    }

    public Response.ErrorListener getErrorResponse() {
        return new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                reqRepObserver.onErrorResponse();
            }
        };
    }

}
