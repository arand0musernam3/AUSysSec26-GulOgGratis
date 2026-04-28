package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class re implements o30.a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ te f11833b;

    public /* synthetic */ re(te teVar, int i11) {
        this.f11832a = i11;
        this.f11833b = teVar;
    }

    @Override // o30.a0
    public final ListenableFuture call() {
        ListenableFuture listenableFutureA;
        int i11 = this.f11832a;
        te teVar = this.f11833b;
        int i12 = 3;
        switch (i11) {
            case 0:
                o30.a1 a1Var = (o30.a1) teVar.f11898f;
                try {
                    return o30.o0.d(teVar.l((Uri) o30.o0.b((ListenableFuture) teVar.f11895c)));
                } catch (IOException e5) {
                    j30.i iVar = (j30.i) teVar.f11900h;
                    iVar.getClass();
                    if ((e5 instanceof zzsg) || (e5.getCause() instanceof zzsg)) {
                        return o30.o0.c(e5);
                    }
                    ve veVar = (ve) iVar.f24505a;
                    veVar.getClass();
                    if (e5.getCause() instanceof zzaeh) {
                        o30.r0 r0VarD = o30.o0.d(veVar.f11967a);
                        qe qeVar = new qe(teVar, 2);
                        int i13 = ag.f11261a;
                        listenableFutureA = o30.o0.a(o30.o0.f(r0VarD, new zc(i12, hf.a(), qeVar), a1Var), IOException.class, new lc(e5, 5), o30.g0.INSTANCE);
                    } else {
                        listenableFutureA = o30.o0.c(e5);
                    }
                    qe qeVar2 = new qe(teVar, 1);
                    int i14 = ag.f11261a;
                    return o30.o0.f(listenableFutureA, new zc(i12, hf.a(), qeVar2), a1Var);
                }
            default:
                qe qeVar3 = new qe(teVar, i12);
                int i15 = ag.f11261a;
                return o30.o0.e(o30.o0.f((ListenableFuture) teVar.f11895c, new zc(i12, hf.a(), qeVar3), (o30.a1) teVar.f11898f));
        }
    }
}
