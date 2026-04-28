package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class se implements o30.b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11854d;

    public /* synthetic */ se(Object obj, Object obj2, Object obj3, int i11) {
        this.f11851a = i11;
        this.f11852b = obj;
        this.f11853c = obj2;
        this.f11854d = obj3;
    }

    @Override // o30.b0
    public final ListenableFuture apply(Object obj) {
        switch (this.f11851a) {
            case 0:
                te teVar = (te) this.f11852b;
                o30.t tVar = (o30.t) this.f11853c;
                o30.t tVar2 = (o30.t) this.f11854d;
                if (o30.o0.b(tVar).equals(o30.o0.b(tVar2))) {
                    return o30.o0.d(obj);
                }
                zc zcVar = new zc(2, teVar, tVar2);
                int i11 = ag.f11261a;
                o30.t tVarF = o30.o0.f(tVar2, new zc(3, hf.a(), zcVar), (o30.a1) teVar.f11898f);
                synchronized (teVar.f11893a) {
                    break;
                }
                return tVarF;
            case 1:
                oe oeVar = (oe) this.f11852b;
                return oeVar.f11725c.k((zc) this.f11853c, (Executor) this.f11854d);
            default:
                return ((ue) this.f11852b).f11943a.f11725c.k((zc) this.f11853c, (Executor) this.f11854d);
        }
    }
}
