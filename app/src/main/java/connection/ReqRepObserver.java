package connection;

/**
 * Created by c019 on 14/11/2016.
 */

public interface ReqRepObserver {
    void doOnResponse(String response);
    void onErrorResponse();
}