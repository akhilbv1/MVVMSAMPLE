package smartapps.com.mvvmsample.View;

import android.arch.lifecycle.ViewModelProvider;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import smartapps.com.mvvmsample.ViewModel.TestViewModelFactory;

/**
 * Created by akhil on 28/8/18.
 */

@Module
public class DetailsActivityModule {

   /* @Provides
    @Singleton
    ViewModelProvider.Factory providesViewModel(TestViewModelSubComponent.Builder testSubComp){
        return new TestViewModelFactory(testSubComp.build());
    }*/
}
