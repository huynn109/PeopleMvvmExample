package com.huynn109.peoplemvvmexample.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 * Created by huyuit on 12/23/2016.
 */

public class Name implements Serializable {
  @SerializedName("title") public String title;

  @SerializedName("first") public String firts;

  @SerializedName("last") public String last;
}
