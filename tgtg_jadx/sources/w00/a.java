package w00;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.common.internal.i0;
import h7.h1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import ky.p;
import q1.e;
import y00.a0;
import y00.a3;
import y00.d3;
import y00.i2;
import y00.l1;
import y00.n1;
import y00.o4;
import y00.r4;
import y00.t2;
import y00.w0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1 f42822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t2 f42823b;

    public a(n1 n1Var) {
        i0.h(n1Var);
        this.f42822a = n1Var;
        t2 t2Var = n1Var.f44993m;
        n1.l(t2Var);
        this.f42823b = t2Var;
    }

    @Override // y00.u2
    public final void b(String str, String str2, Bundle bundle) {
        this.f42823b.t(str, str2, bundle);
    }

    @Override // y00.u2
    public final String c() {
        d3 d3Var = ((n1) this.f42823b.f21216b).l;
        n1.l(d3Var);
        a3 a3Var = d3Var.f44679d;
        if (a3Var != null) {
            return a3Var.f44580b;
        }
        return null;
    }

    @Override // y00.u2
    public final String d() {
        d3 d3Var = ((n1) this.f42823b.f21216b).l;
        n1.l(d3Var);
        a3 a3Var = d3Var.f44679d;
        if (a3Var != null) {
            return a3Var.f44579a;
        }
        return null;
    }

    @Override // y00.u2
    public final void e(Bundle bundle) {
        t2 t2Var = this.f42823b;
        ((n1) t2Var.f21216b).f44992k.getClass();
        t2Var.C(bundle, System.currentTimeMillis());
    }

    @Override // y00.u2
    public final void f(String str) {
        n1 n1Var = this.f42822a;
        a0 a0Var = n1Var.f44994n;
        n1.j(a0Var);
        n1Var.f44992k.getClass();
        a0Var.r(SystemClock.elapsedRealtime(), str);
    }

    @Override // y00.u2
    public final void g(String str) {
        n1 n1Var = this.f42822a;
        a0 a0Var = n1Var.f44994n;
        n1.j(a0Var);
        n1Var.f44992k.getClass();
        a0Var.q(SystemClock.elapsedRealtime(), str);
    }

    @Override // y00.u2
    public final void h(String str, String str2, Bundle bundle) {
        t2 t2Var = this.f42822a.f44993m;
        n1.l(t2Var);
        t2Var.D(str, str2, bundle);
    }

    @Override // y00.u2
    public final List i(String str, String str2) {
        t2 t2Var = this.f42823b;
        n1 n1Var = (n1) t2Var.f21216b;
        l1 l1Var = n1Var.f44988g;
        w0 w0Var = n1Var.f44987f;
        n1.m(l1Var);
        if (l1Var.v()) {
            n1.m(w0Var);
            w0Var.f45260g.a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (p.v()) {
            n1.m(w0Var);
            w0Var.f45260g.a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        l1 l1Var2 = n1Var.f44988g;
        n1.m(l1Var2);
        l1Var2.z(atomicReference, 5000L, "get conditional user properties", new h1(t2Var, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return r4.k0(list);
        }
        n1.m(w0Var);
        w0Var.f45260g.b(null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    @Override // y00.u2
    public final int j(String str) {
        t2 t2Var = this.f42823b;
        t2Var.getClass();
        i0.e(str);
        ((n1) t2Var.f21216b).getClass();
        return 25;
    }

    @Override // y00.u2
    public final String k() {
        return (String) this.f42823b.f45153h.get();
    }

    @Override // y00.u2
    public final long l() {
        r4 r4Var = this.f42822a.f44990i;
        n1.k(r4Var);
        return r4Var.o0();
    }

    @Override // y00.u2
    public final String m() {
        return this.f42823b.E();
    }

    @Override // y00.u2
    public final Map n(String str, String str2, boolean z11) {
        t2 t2Var = this.f42823b;
        n1 n1Var = (n1) t2Var.f21216b;
        l1 l1Var = n1Var.f44988g;
        w0 w0Var = n1Var.f44987f;
        n1.m(l1Var);
        if (l1Var.v()) {
            n1.m(w0Var);
            w0Var.f45260g.a("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (p.v()) {
            n1.m(w0Var);
            w0Var.f45260g.a("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        l1 l1Var2 = n1Var.f44988g;
        n1.m(l1Var2);
        l1Var2.z(atomicReference, 5000L, "get user properties", new i2(t2Var, atomicReference, str, str2, z11));
        List<o4> list = (List) atomicReference.get();
        if (list == null) {
            n1.m(w0Var);
            w0Var.f45260g.b(Boolean.valueOf(z11), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.EMPTY_MAP;
        }
        e eVar = new e(list.size());
        for (o4 o4Var : list) {
            Object objD = o4Var.d();
            if (objD != null) {
                eVar.put(o4Var.f45052b, objD);
            }
        }
        return eVar;
    }
}
