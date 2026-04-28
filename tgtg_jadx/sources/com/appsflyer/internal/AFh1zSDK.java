package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public enum AFh1zSDK {
    application,
    activity,
    other;

    public static AFh1zSDK AFAdRevenueData(Context context) {
        return context instanceof Activity ? activity : context instanceof Application ? application : other;
    }
}
