package ar.toprs.com.mvparmsdemo.net;

import java.util.List;

import ar.toprs.com.mvparmsdemo.Bean.User;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * Created by TY on 2017/11/2.
 */

public interface CommonService {
    String HEADER_API_VERSION = "Accept: application/vnd.github.v3+json";

    @Headers({HEADER_API_VERSION})
    @GET("/users")
    Observable<List<User>> getUsers(@Query("since") int lastIdQueried, @Query("per_page") int perPage);
}
