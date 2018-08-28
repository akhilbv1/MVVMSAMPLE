package smartapps.com.mvvmsample.ViewModel;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import smartapps.com.mvvmsample.DI.Annotation.ViewModelKey;

/**
 * Created by akhil on 28/8/18.
 */

@Module
public abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(TestViewModel.class)
    abstract ViewModel bindTestViewModel(TestViewModel testViewModel);

    @Binds
    abstract ViewModelProvider.Factory bindViewModelFactory(TestViewModelFactory testViewModelFactory);
}
