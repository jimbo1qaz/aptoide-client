package com.aptoide.amethyst.utils;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PixelFormat;
import android.os.Build;
import android.util.Log;
import android.view.Gravity;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.aptoide.amethyst.AppViewActivity;
import com.aptoide.amethyst.Aptoide;
import com.aptoide.amethyst.data_provider.getAds.GetAdsRequestListener;
import com.aptoide.amethyst.database.AptoideDatabase;
import com.aptoide.amethyst.webservices.RegisterAdRefererRequest;
import com.aptoide.amethyst.webservices.json.GetApkInfoJson;
import com.aptoide.amethyst.webservices.v2.GetAdsRequest;
import com.aptoide.models.ApkSuggestionJson;
import com.crashlytics.android.Crashlytics;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.octo.android.robospice.SpiceManager;

import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

import java.io.IOException;
import java.net.URI;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * Created by neuro on 08-10-2015.
 */
public class ReferrerUtils {

    public static final int RETRIES = 2;
    public static final int TIME_OUT = 5;

    public static final ReferrersMap excludedCampaings = new ReferrersMap();
    private static final ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

    public static void extractReferrer(final ApkSuggestionJson.Ads ads, final SpiceManager spiceManager) {}

    public static void extractReferrer(final ApkSuggestionJson.Ads ads, final SpiceManager spiceManager, final SimpleFuture<String> simpleFuture) {}

    public static void extractReferrer(ApkSuggestionJson.Ads ads, final SpiceManager spiceManager, final SimpleFuture<String> simpleFuture, final int retries) {}

    public static void extractReferrer(final String packageName, final long appId, final long adId, final long networkId, final String click_url, final
    SpiceManager spiceManager, final SimpleFuture<String> simpleFuture, final int retries) {}

    public static String getReferrer(String uri) {
        return "fuck getReferrer";
    }

    public static void broadcastReferrer(Context context, String packageName, String referrer) {}
}
