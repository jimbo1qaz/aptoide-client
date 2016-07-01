package com.aptoide.amethyst.webservices.v2;

import android.text.TextUtils;

import com.aptoide.amethyst.Aptoide;
import com.aptoide.amethyst.database.AptoideDatabase;
import com.aptoide.amethyst.preferences.EnumPreferences;
import com.aptoide.amethyst.utils.AptoideUtils;
import com.aptoide.amethyst.utils.ReferrerUtils;
import com.aptoide.dataprovider.webservices.models.Constants;
import com.aptoide.models.ApkSuggestionJson;
import com.aptoide.models.InstalledPackage;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.octo.android.robospice.request.retrofit.RetrofitSpiceRequest;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit.http.FieldMap;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/**
 * Created by rmateus on 29-07-2014.
 */
public class GetAdsRequest extends RetrofitSpiceRequest<ApkSuggestionJson, GetAdsRequest.Webservice> {

    private int CONNECTION_TIMEOUT = 10000;

    private String location;
    private String keyword;
    private int limit;
    private String package_name;
    private String repo;
    private String categories;

    private String excludedPackage;
    private boolean addGlobalExcludedAds;
    private String excludedNetworks;

    public GetAdsRequest(String excludedPackageName, boolean addGlobalExcludedAds) {
        this();
        this.excludedPackage = excludedPackageName;
        this.addGlobalExcludedAds = addGlobalExcludedAds;
    }

    public GetAdsRequest() {
        super(ApkSuggestionJson.class, Webservice.class);

    }

    public interface Webservice{
        @POST("/webservices.aptwords.net/api/2/getAds")
        @FormUrlEncoded
        ApkSuggestionJson getAds(@FieldMap HashMap<String, String> arg);
    }

    String url = "http://webservices.aptwords.net/api/2/getAds";

    @Override
    public ApkSuggestionJson loadDataFromNetwork() throws Exception {
        return new ApkSuggestionJson();
    }

    public void setTimeout(int timeout){
        CONNECTION_TIMEOUT = timeout;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public void setPackage_name(String package_name) {
        this.package_name = package_name;
    }

    public void setRepo(String repo) {
        this.repo = repo;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public static GetAdsRequest newDefaultRequest(String placement, String packageName) {

        final GetAdsRequest request = new GetAdsRequest();

        return request;
    }
}
