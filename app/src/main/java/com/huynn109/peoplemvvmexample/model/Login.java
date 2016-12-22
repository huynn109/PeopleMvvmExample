package com.huynn109.peoplemvvmexample.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 * Created by huyuit on 12/23/2016.
 */

public class Login implements Serializable {
  @SerializedName("username") public String userName;
}
