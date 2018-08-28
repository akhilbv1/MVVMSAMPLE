package smartapps.com.mvvmsample.Service.Respositories;

import retrofit2.Call;
import retrofit2.http.GET;
import smartapps.com.mvvmsample.Service.Model.TestResponsePojo;

/**
 * Created by akhil on 23/7/18.
 */

public interface RestService {
    @GET("posts/1")
    Call<TestResponsePojo> getDetails();
}
