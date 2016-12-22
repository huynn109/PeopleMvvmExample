package com.huynn109.peoplemvvmexample.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 * Created by huyuit on 12/23/2016.
 */

public class Picture implements Serializable {
  @SerializedName("large") public String large;

  @SerializedName("medium") public String medium;

  @SerializedName("thumbnail") public String thumbnail;
}
