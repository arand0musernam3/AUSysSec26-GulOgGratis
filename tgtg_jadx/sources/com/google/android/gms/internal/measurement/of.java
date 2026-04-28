package com.google.android.gms.internal.measurement;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class of extends ef {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final of f11732g;

    static {
        UUID uuidRandomUUID = UUID.randomUUID();
        f11732g = new of("<skip trace>", uuidRandomUUID, bf.a(uuidRandomUUID), rf.f11834e, hf.c());
    }

    @Override // com.google.android.gms.internal.measurement.yf
    public final sf l() {
        return rf.f11834e;
    }

    @Override // com.google.android.gms.internal.measurement.yf
    public final yf t0(String str, sf sfVar, xf xfVar) {
        throw new IllegalStateException("Can't create child trace for no trace!");
    }
}
