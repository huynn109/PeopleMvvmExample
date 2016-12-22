package com.huynn109.peoplemvvmexample.viewmodel;

import android.content.Context;
import com.huynn109.peoplemvvmexample.model.People;
import java.util.List;

/**
 * Created by huyuit on 12/23/2016.
 */

public interface PeopleViewModelContract {
  interface MainView {
    Context getContext();

    void loadData(List<People> peoples);
  }

  interface ViewModel {
    void destroy();
  }
}
