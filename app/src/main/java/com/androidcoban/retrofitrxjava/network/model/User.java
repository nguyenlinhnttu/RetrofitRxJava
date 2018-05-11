package com.androidcoban.retrofitrxjava.network.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by nguyenvanlinh on 5/11/18.
 * Project: RetrofitRxJava
 * Web: www.androdcoban.com
 */
public class User extends BaseResponse {

    @SerializedName("api_key")
    private String apiKey;

    public String getApiKey() {
        return apiKey;
    }
}
