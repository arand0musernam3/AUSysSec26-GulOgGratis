package com.braze.support;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f10753a = new c();

    public static final com.braze.enums.e a(Intent intent, ConnectivityManager connectivityManager) {
        intent.getClass();
        connectivityManager.getClass();
        String action = intent.getAction();
        if (!Intrinsics.areEqual("android.net.conn.CONNECTIVITY_CHANGE", action)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f10753a, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new mw.d(action, 16), 6, (Object) null);
            return com.braze.enums.e.NONE;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
            if (activeNetworkInfo == null || booleanExtra) {
                return com.braze.enums.e.NONE;
            }
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                return (type == 1 || type == 6) ? com.braze.enums.e.GREAT : type != 9 ? com.braze.enums.e.NONE : com.braze.enums.e.GOOD;
            }
            int subtype = activeNetworkInfo.getSubtype();
            return subtype != 3 ? (subtype == 13 || subtype == 20) ? com.braze.enums.e.GREAT : com.braze.enums.e.BAD : com.braze.enums.e.GOOD;
        } catch (SecurityException e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f10753a, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new mw.e(16), 4, (Object) null);
            return com.braze.enums.e.NONE;
        }
    }

    public static final String a() {
        return "Failed to get active network information. Ensure the permission android.permission.ACCESS_NETWORK_STATE is defined in your AndroidManifest.xml";
    }

    public static final String a(String str) {
        return a0.p("Unexpected system broadcast received [", str, "]");
    }

    public static final com.braze.enums.e a(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities == null) {
            return com.braze.enums.e.NONE;
        }
        int iMin = Math.min(networkCapabilities.getLinkDownstreamBandwidthKbps(), networkCapabilities.getLinkUpstreamBandwidthKbps());
        if (iMin > 14000) {
            return com.braze.enums.e.GREAT;
        }
        if (iMin > 4000) {
            return com.braze.enums.e.GOOD;
        }
        return com.braze.enums.e.BAD;
    }
}
