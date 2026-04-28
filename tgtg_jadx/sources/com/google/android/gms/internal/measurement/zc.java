package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zc implements o30.b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f12087c;

    public /* synthetic */ zc(int i11, Object obj, Object obj2) {
        this.f12085a = i11;
        this.f12086b = obj;
        this.f12087c = obj2;
    }

    @Override // o30.b0
    public final ListenableFuture apply(Object obj) throws IOException {
        switch (this.f12085a) {
            case 0:
                cd cdVar = (cd) this.f12086b;
                return ((fb) cdVar.f11314d.get()).a(new bd(cdVar, (gd) this.f12087c));
            case 1:
                List list = (List) this.f12086b;
                ue ueVar = (ue) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    throw e0.f.e(it);
                }
                ne neVar = new ne(this, arrayList, size);
                int i11 = ag.f11261a;
                int i12 = 3;
                zc zcVar = new zc(i12, hf.a(), neVar);
                o30.g0 g0Var = o30.g0.INSTANCE;
                o30.t tVarF = o30.o0.f(o30.o0.e(ueVar.f11943a.f11727e.r0()), new zc(i12, hf.a(), new se(ueVar, zcVar, g0Var, 2)), g0Var);
                j30.f fVar = new j30.f();
                int i13 = o30.v.f31928k;
                o30.u uVar = new o30.u(tVarF, fVar);
                tVarF.a(uVar, wd.a.E(g0Var, uVar));
                return o30.o0.f(uVar, new zc(i12, hf.a(), new ne(this, size, arrayList)), g0Var);
            case 2:
                te teVar = (te) this.f12086b;
                o30.t tVar = (o30.t) this.f12087c;
                teVar.m((Uri) o30.o0.b((ListenableFuture) teVar.f11895c), obj);
                synchronized (teVar.f11893a) {
                    teVar.f11896d = tVar;
                    break;
                }
                return o30.o0.d(obj);
            default:
                yf yfVarB = hf.b(hf.c(), (yf) this.f12086b);
                try {
                    ListenableFuture listenableFutureApply = ((o30.b0) this.f12087c).apply(obj);
                    if (listenableFutureApply != null) {
                        return listenableFutureApply;
                    }
                    throw new IllegalStateException("AsyncFunction should return a ListenableFuture instead of null.");
                } finally {
                }
        }
    }

    public String toString() {
        switch (this.f12085a) {
            case 3:
                o30.b0 b0Var = (o30.b0) this.f12087c;
                StringBuilder sb2 = new StringBuilder(b0Var.toString().length() + 14);
                sb2.append("propagating=[");
                sb2.append(b0Var);
                sb2.append("]");
                return sb2.toString();
            default:
                return super.toString();
        }
    }
}
