package com.braze.models.outgoing;

import android.location.Location;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {
    public static final Double a(c cVar, Location location) {
        cVar.getClass();
        if (location.hasVerticalAccuracy()) {
            return Double.valueOf(location.getVerticalAccuracyMeters());
        }
        return null;
    }
}
