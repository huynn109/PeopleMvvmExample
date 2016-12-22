package com.huynn109.peoplemvvmexample.view;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.huynn109.peoplemvvmexample.R;
import com.huynn109.peoplemvvmexample.databinding.PeopleActivityBinding;
import com.huynn109.peoplemvvmexample.model.People;
import com.huynn109.peoplemvvmexample.viewmodel.PeopleViewModel;
import com.huynn109.peoplemvvmexample.viewmodel.PeopleViewModelContract;
import java.util.List;

public class PeopleActivity extends AppCompatActivity implements PeopleViewModelContract.MainView {

  private PeopleActivityBinding peopleActivityBinding;
  private PeopleViewModelContract.MainView mainView = this;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    initDataBinding();
  }

  private void initDataBinding() {
    peopleActivityBinding = DataBindingUtil.setContentView(this, R.layout.people_activity);
    PeopleViewModel peopleViewModel = new PeopleViewModel(mainView, getContext());
    peopleActivityBinding.setMainViewModel(peopleViewModel);
  }

  @Override public Context getContext() {
    return PeopleActivity.this;
  }

  @Override public void loadData(List<People> peoples) {
  }
}
