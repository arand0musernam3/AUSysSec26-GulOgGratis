package com.google.android.gms.internal.measurement;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class dg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cg f11353a;

    static {
        cg cgVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            cgVar = new cg(0);
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            cgVar = new cg(1);
        }
        f11353a = cgVar;
    }
}
