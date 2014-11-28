package com.mdumrauf.android.handson;


import android.app.Activity;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@Config(manifest = "./src/main/AndroidManifest.xml", emulateSdk = 18)
@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

    @Test
    public void testAppName() {
        Activity activity = Robolectric.buildActivity(MainActivity.class).create().get();
        Assert.assertTrue(activity != null);
    }
}
