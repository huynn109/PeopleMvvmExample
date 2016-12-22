package com.huynn109.peoplemvvmexample.viewmodel;

import android.content.Context;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.view.View;
import com.huynn109.peoplemvvmexample.R;
import rx.Subscription;

/**
 * Created by huyuit on 12/23/2016.
 */

public class PeopleViewModel implements PeopleViewModelContract.ViewModel {
  public ObservableInt peopleProgress;
  public ObservableInt peopleList;
  public ObservableInt peopleLabel;
  public ObservableField<String> messageLabel;

  private PeopleViewModelContract.MainView mainView;
  private Context context;
  private Subscription subscription;

  public PeopleViewModel(PeopleViewModelContract.MainView mainView, Context context) {
    this.mainView = mainView;
    this.context = context;
    peopleProgress = new ObservableInt(View.GONE);
    peopleList = new ObservableInt(View.GONE);
    peopleLabel = new ObservableInt(View.VISIBLE);
    messageLabel = new ObservableField<>(context.getString(R.string.default_loading_people));
  }

  @Override public void destroy() {
    reset();
  }

  private void reset() {
    unSubscribeFromObservable();
    subscription = null;
    context = null;
    mainView = null;
  }

  private void unSubscribeFromObservable() {
    if (subscription != null && !subscription.isUnsubscribed()) {
      subscription.unsubscribe();
    }
  }
}
