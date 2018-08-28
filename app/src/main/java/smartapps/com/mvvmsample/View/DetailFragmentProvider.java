package smartapps.com.mvvmsample.View;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by akhil on 28/8/18.
 */

@Module
public abstract class DetailFragmentProvider {

    @ContributesAndroidInjector
  public abstract DetailsFragment provideDetailsFragment();
}
