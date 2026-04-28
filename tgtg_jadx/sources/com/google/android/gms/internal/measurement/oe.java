package com.google.android.gms.internal.measurement;

import android.os.SystemClock;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class oe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o30.t f11724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final te f11725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k8.d f11726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zw.q2 f11727e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zw.q2 f11728f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f11729g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h1 f11730h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f11731i;

    public oe(te teVar, o30.t tVar) {
        i5 i5Var = new i5(this);
        o30.g0 g0Var = o30.g0.INSTANCE;
        this.f11728f = new zw.q2(i5Var, g0Var);
        Object obj = new Object();
        this.f11729g = obj;
        this.f11731i = new ArrayList();
        this.f11725c = teVar;
        this.f11724b = tVar;
        this.f11723a = (String) teVar.f11894b;
        this.f11727e = new zw.q2(new re(teVar, 1), g0Var);
        this.f11726d = new k8.d(23);
        this.f11730h = new h1(19);
        lc lcVar = new lc(this, 4);
        synchronized (obj) {
            this.f11731i.add(lcVar);
        }
    }

    public final o30.u a(oc ocVar, o30.x0 x0Var) throws Throwable {
        int i11 = 3;
        lc lcVar = new lc(ocVar, i11);
        int i12 = ag.f11261a;
        zc zcVar = new zc(i11, hf.a(), lcVar);
        cg cgVar = dg.f11353a;
        na0.a.b0(cgVar, "ticker");
        switch (cgVar.f11329a) {
            case 0:
                SystemClock.elapsedRealtimeNanos();
                break;
            default:
                SystemClock.elapsedRealtime();
                break;
        }
        String strConcat = "Update ".concat(String.valueOf(this.f11723a));
        bg bgVar = bg.zza;
        this.f11730h.getClass();
        pf pfVarD = h1.d(strConcat, bgVar);
        try {
            o30.j jVarR0 = this.f11728f.r0();
            k8.d dVar = this.f11726d;
            s5 s5Var = new s5(jVarR0, 17);
            o30.g0 g0Var = o30.g0.INSTANCE;
            dVar.y(s5Var, g0Var);
            try {
                ListenableFuture listenableFutureY = dVar.y(ag.a(new b7(this, jVarR0, zcVar, x0Var, 3)), g0Var);
                o30.o0.propagateCancellation(listenableFutureY, jVarR0);
                o30.o0.e(this.f11724b);
                j30.f fVar = new j30.f();
                int i13 = o30.v.f31928k;
                o30.u uVar = new o30.u(listenableFutureY, fVar);
                listenableFutureY.a(uVar, wd.a.E(g0Var, uVar));
                pfVarD.a(uVar);
                pfVarD.close();
                return uVar;
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                try {
                    pfVarD.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
