package com.braze.triggers.events;

import android.util.Base64;
import com.braze.models.k;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class i implements b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f10846d = BrazeLogger.getBrazeLogTag((Class<?>) i.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f10849c;

    public i() {
        long jNowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        this.f10848b = jNowInMilliseconds;
        this.f10847a = jNowInMilliseconds / 1000;
    }

    public static String a(String str) {
        if (StringUtils.isNullOrBlank(str)) {
            return null;
        }
        try {
            return new String(Base64.decode(str, 0)).split("_")[0];
        } catch (Exception e5) {
            BrazeLogger.e(f10846d, "Unexpected error decoding Base64 encoded campaign Id " + str, e5);
            return null;
        }
    }

    public final k b() {
        return this.f10849c;
    }
}
