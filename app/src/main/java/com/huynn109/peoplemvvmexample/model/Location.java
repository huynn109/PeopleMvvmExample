package com.huynn109.peoplemvvmexample.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 * Created by huyuit on 12/23/2016.
 */

public class Location implements Serializable {
  @SerializedName("street") public String street;

  @SerializedName("city") public String city;

  @SerializedName("state") public String state;

  @SerializedName("zip") public String zip;
}
