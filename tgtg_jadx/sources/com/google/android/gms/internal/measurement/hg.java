package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class hg extends xg {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f11478d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f11479c = new AtomicLong(-1);

    static {
        new eg(1);
    }

    @Override // com.google.android.gms.internal.measurement.xg
    public final void a() {
        AtomicLong atomicLong = this.f11479c;
        atomicLong.set(Math.max(-atomicLong.get(), 0L));
    }
}
