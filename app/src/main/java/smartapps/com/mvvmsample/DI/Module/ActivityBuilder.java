package smartapps.com.mvvmsample.DI.Module;

/*
 * Created by akhil on 24/7/18.
 */

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import smartapps.com.mvvmsample.View.DetailFragmentProvider;
import smartapps.com.mvvmsample.View.DetailsActivity;
import smartapps.com.mvvmsample.View.DetailsActivityModule;

@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = {DetailsActivityModule.class, DetailFragmentProvider.class})
    abstract DetailsActivity bindDetailsActivity();
}
