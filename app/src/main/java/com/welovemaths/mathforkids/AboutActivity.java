package com.welovemaths.mathforkids;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.welovekids.mathforkids.R;

/**
 * @author Created by Janice
 * Shows information about the application version
 * and the developers
 */
public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        Resources res = getResources();
        //Put the version number into the about page
        final TextView versionText = (TextView) findViewById(R.id.version);
        try {
            PackageInfo pInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
            String version = pInfo.versionName;
            versionText.setText(res.getString(R.string.versionNumber,version));
        } catch (PackageManager.NameNotFoundException e) {
            versionText.setText(res.getString(R.string.versionNumber,1.0));
        }
    }
}
