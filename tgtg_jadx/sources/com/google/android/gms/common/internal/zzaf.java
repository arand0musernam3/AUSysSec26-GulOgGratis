package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaf extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pz.b f11216a;

    public zzaf(pz.b bVar) {
        i0.a("ResolvableConnectionException can only be created with a connection result containing a resolution.", (bVar.f35644b == 0 || bVar.f35645c == null) ? false : true);
        this.f11216a = bVar;
    }
}
