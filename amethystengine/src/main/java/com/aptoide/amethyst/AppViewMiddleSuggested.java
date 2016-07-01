package com.aptoide.amethyst;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.amazon.insights.ABTestClient;
import com.amazon.insights.AmazonInsights;
import com.amazon.insights.Event;
import com.amazon.insights.EventClient;
import com.amazon.insights.InsightsCallback;
import com.amazon.insights.InsightsCredentials;
import com.amazon.insights.Variation;
import com.amazon.insights.VariationSet;
import com.amazon.insights.error.InsightsError;
import com.aptoide.amethyst.database.AptoideDatabase;
import com.aptoide.amethyst.downloadmanager.model.Download;
import com.aptoide.amethyst.utils.AptoideUtils;
import com.aptoide.amethyst.utils.Logger;
import com.aptoide.amethyst.utils.ReferrerUtils;
import com.aptoide.amethyst.utils.SimpleFuture;
import com.aptoide.amethyst.webservices.json.GetApkInfoJson;
import com.aptoide.amethyst.webservices.v2.GetAdsRequest;
import com.aptoide.models.ApkSuggestionJson;
import com.bumptech.glide.Glide;
import com.octo.android.robospice.SpiceManager;
import com.octo.android.robospice.persistence.exception.SpiceException;
import com.octo.android.robospice.request.listener.RequestListener;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import com.aptoide.amethyst.webservices.GetApkInfoRequestFromId;

import static com.aptoide.dataprovider.webservices.models.Constants.AD_ID_KEY;
import static com.aptoide.dataprovider.webservices.models.Constants.APPNAME_KEY;
import static com.aptoide.dataprovider.webservices.models.Constants.APP_ID_KEY;
import static com.aptoide.dataprovider.webservices.models.Constants.CPC_KEY;
import static com.aptoide.dataprovider.webservices.models.Constants.CPI_KEY;
import static com.aptoide.dataprovider.webservices.models.Constants.DOWNLOAD_FROM_KEY;
import static com.aptoide.dataprovider.webservices.models.Constants.FROM_SPONSORED_KEY;
import static com.aptoide.dataprovider.webservices.models.Constants.KEYWORD_KEY;
import static com.aptoide.dataprovider.webservices.models.Constants.LOCATION_KEY;
import static com.aptoide.dataprovider.webservices.models.Constants.PACKAGENAME_KEY;
import static com.aptoide.dataprovider.webservices.models.Constants.PARTNER_CLICK_URL_KEY;
import static com.aptoide.dataprovider.webservices.models.Constants.PARTNER_EXTRA;
import static com.aptoide.dataprovider.webservices.models.Constants.PARTNER_TYPE_KEY;
import static com.aptoide.dataprovider.webservices.models.Constants.STOREID_KEY;
import static com.aptoide.dataprovider.webservices.models.Constants.WHERE_FROM_KEY;

/**
 * Created by neuro on 01-10-2015.
 */
public class AppViewMiddleSuggested {

    List<View.OnClickListener> buttonListeners = new ArrayList<>(3);
    List<String> installButtonLabel = new ArrayList<>(3);

    String[] referrer = new String[1];

    // Variável de controlo para coordenação entre webservice e amazon responses. Quando a true, é suposto desenhar a view.
    boolean control = false;
    AppViewActivity context;
    // Temp
    //
    public static EventClient eventClient;
    int middleAppViewVariant = 1;

    // Add helpers
    private String click_url;
    private long id;
    private long adId;


    private void onLoadMiddleAppViewEvent(AmazonInsights insightsInstance) {}

    private void informInfoReady() {}

    View view;

    public AppViewMiddleSuggested(final AppViewActivity context, final View view, final SpiceManager spiceManager, long appId, final String packageName, List<String> keywords) {}

    private void fillAppViewActivityIntent(Intent i, ApkSuggestionJson apkSuggestionJson) {}

    private void prepareABTestingVariables(final AppViewActivity context, final String label, final ApkSuggestionJson apkSuggestionJson) {}
}
