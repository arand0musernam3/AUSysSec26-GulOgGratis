package com.braze.lrucache;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f9928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f9930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9931e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final File f9932f;

    public g(String str, int i11, File file) {
        this.f9927a = str;
        this.f9931e = i11;
        this.f9932f = file;
        this.f9928b = new long[i11];
    }

    public final File a(int i11) {
        return new File(this.f9932f, this.f9927a + "." + i11 + ".tmp");
    }
}
