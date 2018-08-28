package smartapps.com.mvvmsample.DI.Module;

import android.app.Application;
import android.arch.lifecycle.ViewModelProvider;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import smartapps.com.mvvmsample.DI.Annotation.ApplicationContext;
import smartapps.com.mvvmsample.Service.Respositories.DataManager;
import smartapps.com.mvvmsample.ViewModel.TestViewModelFactory;
import smartapps.com.mvvmsample.ViewModel.ViewModelModule;

/**
 * Created by akhil on 23/7/18.
 */

@Module(includes = ViewModelModule.class)
public class AppModule {

    /*private Application application;

    @Provides
    public Application providesApplication() {
        return application;
    }

    @Provides
    @ApplicationContext
    public Context providesApplicationContext() {
        return application.getApplicationContext();
    }*/

    @Provides
    @Singleton
    DataManager providesDatamanager()
    {
        return new DataManager();
    }


}
