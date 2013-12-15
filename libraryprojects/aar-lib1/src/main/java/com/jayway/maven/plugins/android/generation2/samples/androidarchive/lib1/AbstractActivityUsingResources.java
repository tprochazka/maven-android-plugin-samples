package com.jayway.maven.plugins.android.generation2.samples.androidarchive.lib1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by William on 15/12/13.
 */
public class AbstractActivityUsingResources extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final String lib1Resource = getResources().getString(R.string.lib1resource);
        Toast.makeText(this, "Found resource : " + lib1Resource, Toast.LENGTH_LONG).show();
    }
}
