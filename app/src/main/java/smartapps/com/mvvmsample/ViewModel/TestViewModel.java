package smartapps.com.mvvmsample.ViewModel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import android.support.annotation.NonNull;

import javax.inject.Inject;

import smartapps.com.mvvmsample.Service.Model.TestResponsePojo;
import smartapps.com.mvvmsample.Service.Respositories.DataManager;

/*
 * Created by akhil on 23/7/18.
 */

public class TestViewModel extends AndroidViewModel {

    private LiveData<TestResponsePojo> TestResponseObservable;

    @Inject
    public TestViewModel(@NonNull DataManager dataManager,@NonNull Application application) {
        super(application);

        TestResponseObservable = dataManager.getTestResponsePojo();
    }

    public LiveData<TestResponsePojo> getTestResponseObservable(){
        return TestResponseObservable;
    }
}
