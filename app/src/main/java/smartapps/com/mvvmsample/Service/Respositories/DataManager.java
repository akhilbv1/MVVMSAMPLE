package smartapps.com.mvvmsample.Service.Respositories;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.support.annotation.NonNull;

import javax.inject.Inject;
import javax.inject.Singleton;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import smartapps.com.mvvmsample.Service.Model.TestResponsePojo;

/**
 * Created by akhil on 23/7/18.
 */
@Singleton
public class DataManager {

    private RestClient restClient = new RestClient();

    @Inject public DataManager(){
    }


    public LiveData<TestResponsePojo> getTestResponsePojo(){
        final MutableLiveData<TestResponsePojo> data = new MutableLiveData<>();

        restClient.getRestApi().getDetails().enqueue(new Callback<TestResponsePojo>() {
            @Override
            public void onResponse(@NonNull Call<TestResponsePojo> call, @NonNull Response<TestResponsePojo> response) {
                data.setValue(response.body());
            }

            @Override
            public void onFailure(@NonNull Call<TestResponsePojo> call, @NonNull Throwable t) {

            }
        });

        return data;
    }


}
