package com.google.android.gms.internal.measurement;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g0 implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c5.a1 f11427b = new c5.a1(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11428a;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i11 = this.f11428a;
        if (i11 > 0) {
            this.f11428a = i11 - 1;
        } else {
            i4.a.d("Mismatched calls to RecursionDepth (possible error in core library)");
        }
    }
}
