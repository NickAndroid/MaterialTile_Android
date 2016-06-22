package dev.nick.androidsdkdemos.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;

import dev.nick.androidsdkdemos.Dashboards;
import dev.nick.androidsdkdemos.R;

public class NavigatorActivity extends TransactionSafeActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigator_content);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        placeFragment(R.id.container, new Dashboards(), null, true);
    }
}
