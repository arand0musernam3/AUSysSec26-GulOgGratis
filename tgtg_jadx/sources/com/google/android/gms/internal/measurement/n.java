package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f11648b = new n(s.f11836a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f11649a;

    public n(r rVar) {
        this.f11649a = new AtomicReference(rVar);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final void a(String str, Level level, boolean z11) {
        ((r) this.f11649a.get()).a(str, level, z11);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final y b() {
        return ((r) this.f11649a.get()).b();
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final la c() {
        return ((r) this.f11649a.get()).c();
    }
}
