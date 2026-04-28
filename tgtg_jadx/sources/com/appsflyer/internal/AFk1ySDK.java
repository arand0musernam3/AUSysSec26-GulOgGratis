package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFk1ySDK {
    public String getMonetizationNetwork;
    public final WeakReference<Context> getRevenue;

    public AFk1ySDK(@NonNull Context context) {
        this.getRevenue = new WeakReference<>(context);
    }
}
