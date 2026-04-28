package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ne implements o30.b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11667a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zc f11668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f11669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11670d;

    public /* synthetic */ ne(zc zcVar, int i11, ArrayList arrayList) {
        this.f11668b = zcVar;
        this.f11670d = i11;
        this.f11669c = arrayList;
    }

    @Override // o30.b0
    public final ListenableFuture apply(Object obj) {
        switch (this.f11667a) {
            case 0:
                int i11 = this.f11670d;
                ArrayList arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 < i11; i12++) {
                    if (((Boolean) o30.o0.b((Future) this.f11669c.get(i12))).booleanValue()) {
                        ((List) this.f11668b.f12086b).get(i12).getClass();
                        org.bouncycastle.jce.provider.a.c();
                        return null;
                    }
                }
                k30.h hVarL = k30.h.l(arrayList);
                ax.x xVar = new ax.x(2);
                o30.g0 g0Var = o30.g0.INSTANCE;
                o30.d0 d0Var = new o30.d0(hVarL, true);
                d0Var.f31867n = new o30.c0(d0Var, xVar, g0Var, 1);
                d0Var.s();
                return d0Var;
            default:
                ArrayList arrayList2 = this.f11669c;
                k30.h hVarL2 = k30.h.l(arrayList2);
                zc zcVar = this.f11668b;
                i5 i5VarA = ag.a(new oz.o(zcVar, (n0) obj, this.f11670d, arrayList2));
                Executor executor = (Executor) zcVar.f12087c;
                o30.d0 d0Var2 = new o30.d0(hVarL2, false);
                d0Var2.f31867n = new o30.c0(d0Var2, i5VarA, executor, 0);
                d0Var2.s();
                return d0Var2;
        }
    }

    public /* synthetic */ ne(zc zcVar, ArrayList arrayList, int i11) {
        this.f11668b = zcVar;
        this.f11669c = arrayList;
        this.f11670d = i11;
    }
}
