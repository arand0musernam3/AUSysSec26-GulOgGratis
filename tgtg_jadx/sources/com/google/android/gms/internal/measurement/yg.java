package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class yg extends xg {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final eg f12071d = new eg(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c5.a1 f12072e = new c5.a1(3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f12073c = new AtomicInteger();

    @Override // com.google.android.gms.internal.measurement.xg
    public final void a() {
        this.f12073c.decrementAndGet();
    }
}
