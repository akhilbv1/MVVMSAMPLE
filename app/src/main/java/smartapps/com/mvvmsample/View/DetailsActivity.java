package smartapps.com.mvvmsample.View;

import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.TextView;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DaggerActivity;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import dagger.android.support.HasSupportFragmentInjector;
import smartapps.com.mvvmsample.R;
import smartapps.com.mvvmsample.Service.Model.TestResponsePojo;
import smartapps.com.mvvmsample.ViewModel.TestViewModel;
import smartapps.com.mvvmsample.ViewModel.TestViewModelFactory;

/**
 * Created by akhil on 23/7/18.
 */

public class DetailsActivity extends AppCompatActivity implements HasSupportFragmentInjector  {

    @Inject
    DispatchingAndroidInjector<Fragment> dispatchingAndroidInjector;

   /* private TextView testTv;
    @Inject
    ViewModelProvider.Factory testViewModelFactory;*/

   // TestViewModel testViewModel;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //testTv = findViewById(R.id.testTv);
         //testViewModel = ViewModelProviders.of(this, testViewModelFactory).get(TestViewModel.class);
        //observeViewModel();
        //FrameLayout frameLayout = findViewById(R.id.container);

        Fragment fragment = new DetailsFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().add(R.id.container,fragment).commit();

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

   /* private void observeViewModel()
    {
        testViewModel.getTestResponseObservable()
                .observe(this, testResponsePojo -> {
            Log.i("data",""+testResponsePojo.getBody());
            if(testResponsePojo.getBody()!=null)
            testTv.setText(testResponsePojo.getBody());
        });
    }*/


    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return dispatchingAndroidInjector;
    }
}
