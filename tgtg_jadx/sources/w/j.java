package w;

import android.util.Log;
import b0.e3;
import b0.j2;
import b0.k3;
import b0.l2;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import m0.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements s0.i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e3 f42697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0.g0 f42698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s0.f0 f42699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k3 f42700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o f42701e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f42702f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s0.z f42703g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f42704h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r80.a f42705i;

    public j(a50.c cVar, e3 e3Var, s0.g0 g0Var, s0.f0 f0Var, k3 k3Var, o oVar) {
        cVar.getClass();
        e3Var.getClass();
        g0Var.getClass();
        f0Var.getClass();
        k3Var.getClass();
        oVar.getClass();
        this.f42697a = e3Var;
        this.f42698b = g0Var;
        this.f42699c = f0Var;
        this.f42700d = k3Var;
        this.f42701e = oVar;
        String str = (String) cVar.f822b;
        this.f42702f = str;
        s0.b0 b0Var = s0.c0.f38306a;
        b0Var.getClass();
        this.f42703g = b0Var;
        r80.b bVar = k.f42711a;
        bVar.getClass();
        this.f42704h = r80.b.f37780b.incrementAndGet(bVar);
        this.f42705i = b.p(false);
        if (wd.a.B(3, "CXCP")) {
            Log.d("CXCP", "Created " + this + " for " + ((Object) e0.s.b(str)));
        }
    }

    @Override // s0.i0
    public final ListenableFuture a() {
        return ox.h.A(new z(v80.f0.B(this.f42700d.f5265a, null, null, new i(this, null, 1), 3), 0));
    }

    @Override // m0.l1
    public final void c(m1 m1Var) {
        e3 e3Var = this.f42697a;
        e3Var.getClass();
        synchronized (e3Var.f5157k) {
            if (e3Var.l.contains(m1Var)) {
                e3Var.j(e3Var.l);
            }
        }
    }

    @Override // m0.l1
    public final void e(m1 m1Var) {
        e3 e3Var = this.f42697a;
        e3Var.getClass();
        synchronized (e3Var.f5157k) {
            if (e3Var.l.contains(m1Var)) {
                e3Var.k();
            }
        }
    }

    @Override // s0.i0
    public final s0.f0 f() {
        return this.f42699c;
    }

    @Override // m0.l1
    public final void g(m1 m1Var) {
        e3 e3Var = this.f42697a;
        e3Var.getClass();
        synchronized (e3Var.f5157k) {
            if (e3Var.f5158m.add(m1Var)) {
                e3Var.k();
            }
        }
    }

    @Override // s0.i0
    public final s0.z h() {
        return this.f42703g;
    }

    @Override // s0.i0
    public final void i(s0.z zVar) {
        s0.z zVar2;
        if (zVar == null) {
            zVar2 = s0.c0.f38306a;
            zVar2.getClass();
        } else {
            zVar2 = zVar;
        }
        this.f42703g = zVar2;
        if (zVar != null) {
            zVar.p();
        }
        synchronized (this.f42697a.f5157k) {
        }
    }

    @Override // s0.i0
    public final void j(boolean z11) {
        e3 e3Var = this.f42697a;
        synchronized (e3Var.f5157k) {
            e3Var.f5159n = z11;
            l2 l2VarG = e3Var.g();
            if (l2VarG != null) {
                v80.f0.B(l2VarG.f5293b.f5270f, null, null, new j2((x70.c) null, l2VarG, z11), 3);
            }
        }
    }

    @Override // s0.i0
    public final boolean k() {
        return this.f42705i.b();
    }

    @Override // s0.i0
    public final void l(Collection collection) {
        collection.getClass();
        this.f42697a.c(CollectionsKt.r0(collection));
    }

    @Override // s0.i0
    public final void m(ArrayList arrayList) {
        this.f42697a.f(CollectionsKt.r0(arrayList));
    }

    @Override // s0.i0
    public final void n() {
        if (wd.a.B(3, "CXCP")) {
            Log.d("CXCP", this + " received removed signal. Cleaning up.");
        }
        if (this.f42705i.a()) {
            v80.f0.B(this.f42700d.f5265a, null, null, new i(this, null, 0), 3);
        }
    }

    @Override // s0.i0
    public final void p(boolean z11) {
        e3 e3Var = this.f42697a;
        synchronized (e3Var.f5157k) {
            e3Var.f5161p = z11;
        }
    }

    @Override // s0.i0
    public final s0.g0 q() {
        return this.f42698b;
    }

    @Override // m0.l1
    public final void r(m1 m1Var) {
        e3 e3Var = this.f42697a;
        e3Var.getClass();
        synchronized (e3Var.f5157k) {
            if (e3Var.f5158m.remove(m1Var)) {
                e3Var.k();
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CameraInternalAdapter<");
        sb2.append((Object) e0.s.b(this.f42702f));
        sb2.append('(');
        return r8.k.i(this.f42704h, ")>", sb2);
    }
}
