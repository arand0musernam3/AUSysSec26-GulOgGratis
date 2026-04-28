package com.appsflyer.internal;

import android.content.Intent;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFb1rSDK {
    public static Uri k_(Intent intent) {
        if (intent == null) {
            return null;
        }
        AFj1nSDK aFj1nSDK = new AFj1nSDK(intent);
        Uri uri = (Uri) aFj1nSDK.H_("android.intent.extra.REFERRER");
        if (uri != null) {
            return uri;
        }
        String mediationNetwork = aFj1nSDK.getMediationNetwork("android.intent.extra.REFERRER_NAME");
        if (mediationNetwork != null) {
            return Uri.parse(mediationNetwork);
        }
        return null;
    }
}
