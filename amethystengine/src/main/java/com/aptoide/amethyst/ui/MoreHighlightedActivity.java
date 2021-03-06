package com.aptoide.amethyst.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.aptoide.amethyst.analytics.Analytics;
import com.aptoide.amethyst.webservices.v2.GetAdsRequest;
import com.aptoide.models.displayables.AdItem;
import com.aptoide.models.ApkSuggestionJson;
import com.octo.android.robospice.persistence.exception.SpiceException;
import com.octo.android.robospice.request.listener.RequestListener;


import com.aptoide.amethyst.adapter.BaseAdapter;
import com.aptoide.amethyst.adapter.main.HomeTabAdapter;
import com.aptoide.amethyst.fragments.store.BaseWebserviceFragment;

public class MoreHighlightedActivity extends MoreActivity {


    @Override
    protected Fragment getFragment(Bundle args) {
        Fragment fragment = MoreHighlightedFragment.newInstance();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Analytics.Home.clickOnHighlighted();
    }

    public static class MoreHighlightedFragment extends BaseWebserviceFragment {

        // on v6, 50 was the limit
        private static final int ADS_LIMIT = 50;
        private BaseAdapter adapter;

        public static Fragment newInstance() {
            return new MoreHighlightedFragment();
        }

        @Override
        protected void executeSpiceRequest(boolean useCache) {}

        @Override
        protected BaseAdapter getAdapter() {
            if (adapter == null) {
                adapter = new HomeTabAdapter(displayableList, getFragmentManager(), getStoreTheme(),getStoreName());
            }
            return adapter;
        }

        @Override
        protected String getBaseContext() {
            return "GetMoreHighlighted";
        }
    }

    @Override
    protected String getScreenName() {
        return "More Highlighted";
    }
}
