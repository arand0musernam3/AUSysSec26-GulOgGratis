package com.braze.managers;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a0 {
    public static String a(String str, String str2, String str3, String str4, int i11) {
        w.a0.C(str, str2, str3);
        if (!kotlin.text.y.p(str, "http://", false) && !kotlin.text.y.p(str, "https://", false)) {
            str = "https://".concat(str);
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        builderBuildUpon.appendPath("sse");
        builderBuildUpon.appendQueryParameter("mite", str2);
        builderBuildUpon.appendQueryParameter("auth", str3);
        builderBuildUpon.appendQueryParameter("attempts", String.valueOf(i11));
        if (str4 != null) {
            builderBuildUpon.appendQueryParameter("rcs", str4);
        }
        String string = builderBuildUpon.build().toString();
        string.getClass();
        return string;
    }
}
