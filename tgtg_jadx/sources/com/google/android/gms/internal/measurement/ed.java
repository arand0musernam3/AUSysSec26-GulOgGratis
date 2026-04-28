package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class ed implements gd {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f11386d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j30.l f11387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h1 f11389c;

    public ed(j30.l lVar) {
        h1 h1Var = h1.f11450g;
        this.f11387a = lVar;
        this.f11388b = Math.max(5, 10);
        this.f11389c = h1Var;
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final void a() {
        synchronized (ed.class) {
            try {
                if (!f11386d) {
                    xc xcVar = new xc(this, 3);
                    long j9 = this.f11388b;
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    o30.x0 x0Var = (o30.x0) this.f11387a.get();
                    dd ddVar = new dd(this, xcVar, x0Var, j9);
                    x0Var.getClass();
                    o30.d1 d1Var = new o30.d1(Executors.callable(ddVar, null));
                    o30.v0 v0Var = new o30.v0(d1Var, x0Var.f31937b.schedule(d1Var, j9, timeUnit));
                    v0Var.a(new xc(v0Var, 1), o30.g0.INSTANCE);
                    f11386d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
