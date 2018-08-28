package smartapps.com.mvvmsample.View;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import javax.inject.Inject;

import dagger.android.support.AndroidSupportInjection;
import smartapps.com.mvvmsample.R;
import smartapps.com.mvvmsample.ViewModel.TestViewModel;

/**
 * Created by akhil on 28/8/18.
 */

public class DetailsFragment extends Fragment {

    private TextView tvTest;

    @Inject
    public ViewModelProvider.Factory testViewModelFactory;

    private TestViewModel testViewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        AndroidSupportInjection.inject(this);
        View view = inflater.inflate(R.layout.fragment_layout, container, false);
        tvTest = view.findViewById(R.id.testTv);
        testViewModel = ViewModelProviders.of(this, testViewModelFactory).get(TestViewModel.class);
        observeViewModel();
        return view;
    }

    private void observeViewModel() {
        testViewModel.getTestResponseObservable()
                .observe(this, testResponsePojo -> {
                    Log.i("data", "" + testResponsePojo.getBody());
                    if (testResponsePojo.getBody() != null)
                        tvTest.setText(testResponsePojo.getBody());
                });

    }
}
