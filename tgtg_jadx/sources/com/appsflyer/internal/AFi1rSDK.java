package com.appsflyer.internal;

import android.app.Activity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public interface AFi1rSDK {
    void getCurrencyIso4217Code(@NotNull Activity activity);

    @NotNull
    String getMediationNetwork(@Nullable Activity activity);

    @Nullable
    String getMonetizationNetwork(@Nullable Activity activity);
}
