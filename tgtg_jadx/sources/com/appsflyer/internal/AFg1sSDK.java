package com.appsflyer.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFg1sSDK implements AFg1uSDK {

    @NotNull
    private Map<String, String> getMonetizationNetwork = new LinkedHashMap();

    @Override // com.appsflyer.internal.AFg1uSDK
    @NotNull
    public final Map<String, String> getMonetizationNetwork(@NotNull Context context) {
        context.getClass();
        if (this.getMonetizationNetwork.isEmpty()) {
            Resources resources = context.getResources();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            int i11 = resources.getConfiguration().screenLayout & 15;
            this.getMonetizationNetwork.put("xdp", String.valueOf(displayMetrics.xdpi));
            this.getMonetizationNetwork.put("ydp", String.valueOf(displayMetrics.ydpi));
            this.getMonetizationNetwork.put("x_px", String.valueOf(displayMetrics.widthPixels));
            this.getMonetizationNetwork.put("y_px", String.valueOf(displayMetrics.heightPixels));
            this.getMonetizationNetwork.put("d_dpi", String.valueOf(displayMetrics.densityDpi));
            this.getMonetizationNetwork.put("size", String.valueOf(i11));
        }
        return this.getMonetizationNetwork;
    }
}
