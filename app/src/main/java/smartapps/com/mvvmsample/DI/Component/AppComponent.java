package smartapps.com.mvvmsample.DI.Component;

import android.app.Application;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjection;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import smartapps.com.mvvmsample.DI.Module.AppModule;
import smartapps.com.mvvmsample.DI.Module.ActivityBuilder;
import smartapps.com.mvvmsample.MVVMAPP;
import smartapps.com.mvvmsample.Service.Respositories.DataManager;

/**
 * Created by akhil on 23/7/18.
 */
@Singleton
@Component(modules = {AndroidInjectionModule.class, AppModule.class, ActivityBuilder.class})
public interface AppComponent{



    DataManager getDatamanager();

   /* @ApplicationContext
    Context getContext();*/


    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
    void inject(MVVMAPP application);
}
