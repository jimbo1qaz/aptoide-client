package com.aptoide.amethyst.viewholders;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.aptoide.amethyst.R;
import com.aptoide.models.displayables.Displayable;
import com.aptoide.models.displayables.SuggestedAppDisplayable;
import com.bumptech.glide.Glide;

import java.text.DecimalFormat;

import com.aptoide.amethyst.AppViewActivity;


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
import static com.aptoide.dataprovider.webservices.models.Constants.STORENAME_KEY;
import static com.aptoide.dataprovider.webservices.models.Constants.WHERE_FROM_KEY;

/**
 * Created by neuro on 05-11-2015.
 */
public class SuggestedAppViewHolder extends BaseViewHolder {

    TextView labelTextView;
    TextView sizeTextView;
    TextView descriptionTextView;
    ImageView iconImageView;
    TextView store;
    View bottomView;

    public SuggestedAppViewHolder(View view, int viewType) {
        super(view, viewType);
    }

    public void populateView(Displayable displayable) {}

    @Override
    protected void bindViews(View itemView) {
        labelTextView = (TextView )itemView.findViewById(R.id.app_name);
        sizeTextView = (TextView )itemView.findViewById(R.id.size_value);
        descriptionTextView = (TextView )itemView.findViewById(R.id.description);
        iconImageView = (ImageView )itemView.findViewById(R.id.app_icon);
        store = (TextView )itemView.findViewById(R.id.search_store);
        bottomView = (View )itemView.findViewById(R.id.bottom_view);
    }
}
