package com.google.android.gms.internal.measurement;

import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class dd implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11348a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f11349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11351d;

    public dd(y00.d3 d3Var, y00.a3 a3Var, long j9) {
        this.f11350c = a3Var;
        this.f11349b = j9;
        Objects.requireNonNull(d3Var);
        this.f11351d = d3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11348a) {
            case 0:
                ((xc) this.f11350c).run();
                o30.x0 x0Var = (o30.x0) this.f11351d;
                x0Var.getClass();
                o30.d1 d1Var = new o30.d1(Executors.callable(this, null));
                o30.v0 v0Var = new o30.v0(d1Var, x0Var.f31937b.schedule(d1Var, this.f11349b, TimeUnit.MINUTES));
                v0Var.a(new xc(v0Var, 1), o30.g0.INSTANCE);
                break;
            default:
                y00.d3 d3Var = (y00.d3) this.f11351d;
                d3Var.y((y00.a3) this.f11350c, false, this.f11349b);
                d3Var.f44681f = null;
                y00.m3 m3VarP = ((y00.n1) d3Var.f21216b).p();
                m3VarP.p();
                m3VarP.q();
                m3VarP.D(new x0.f(m3VarP, (y00.a3) null));
                break;
        }
    }

    public dd(ed edVar, xc xcVar, o30.x0 x0Var, long j9) {
        this.f11350c = xcVar;
        this.f11351d = x0Var;
        this.f11349b = j9;
    }
}
