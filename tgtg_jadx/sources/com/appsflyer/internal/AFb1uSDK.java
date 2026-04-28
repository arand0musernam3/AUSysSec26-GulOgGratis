package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFb1uSDK {
    public final String[] getRevenue;

    public AFb1uSDK(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            this.getRevenue = null;
            return;
        }
        Pattern patternCompile = Pattern.compile("[\\w]{1,45}");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str == null || !patternCompile.matcher(str).matches()) {
                AFLogger.afWarnLog("Invalid partner name: ".concat(String.valueOf(str)));
            } else {
                arrayList.add(str.toLowerCase(Locale.getDefault()));
            }
        }
        if (arrayList.contains("all")) {
            this.getRevenue = new String[]{"all"};
        } else if (arrayList.isEmpty()) {
            this.getRevenue = null;
        } else {
            this.getRevenue = (String[]) arrayList.toArray(new String[0]);
        }
    }
}
