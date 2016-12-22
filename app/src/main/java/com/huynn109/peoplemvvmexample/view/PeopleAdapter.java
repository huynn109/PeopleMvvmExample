package com.huynn109.peoplemvvmexample.view;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.huynn109.peoplemvvmexample.R;
import com.huynn109.peoplemvvmexample.databinding.ItemPeopleBinding;

/**
 * Created by huyuit on 12/23/2016.
 */

public class PeopleAdapter extends RecyclerView.Adapter<PeopleAdapter.PeopleAdapterViewHolder> {
  @Override public PeopleAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    ItemPeopleBinding itemPeopleBinding =
        DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_people,
            parent, false);
    return new PeopleAdapterViewHolder(itemPeopleBinding);
  }

  @Override public void onBindViewHolder(PeopleAdapterViewHolder holder, int position) {

  }

  @Override public int getItemCount() {
    return 0;
  }

  public class PeopleAdapterViewHolder extends RecyclerView.ViewHolder {

    public PeopleAdapterViewHolder(ItemPeopleBinding itemPeopleBinding) {
      super(itemPeopleBinding.itemPeople);
    }
  }
}
