package smartapps.com.mvvmsample;

import android.app.Activity;
import android.app.Application;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import smartapps.com.mvvmsample.DI.Component.AppComponent;
import smartapps.com.mvvmsample.DI.Component.DaggerAppComponent;

/**
 * Created by akhil on 23/7/18.
 */

public class MVVMAPP extends Application implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        AppComponent appComponent =  DaggerAppComponent.builder().application(this).build();
        appComponent.inject(this);
        // AppInjector.inject(this);

    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }
}

