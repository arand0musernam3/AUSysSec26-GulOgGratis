package x2;

import a3.j0;
import m5.k0;
import m5.q0;
import m5.t0;
import w2.o1;
import w2.s1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements a3.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final us.j f43746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43747b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f43748c = 9205357640488583168L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f43749d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w f43750e;

    public l(w wVar, us.j jVar) {
        this.f43750e = wVar;
        this.f43746a = jVar;
    }

    public final long a(long j9, j0 j0Var, q0 q0Var, boolean z11) {
        int length = q0Var.f29617a.f29603a.f29538b.length();
        int iC = this.f43747b;
        w wVar = this.f43750e;
        if (iC < 0 || iC > length) {
            iC = wVar.f43782b.c(this.f43748c, false);
        }
        int i11 = iC;
        long jA = wVar.A(wVar.f43781a.d(), i11, wVar.f43782b.c(j9, false), false, j0Var, false, z11);
        if (this.f43747b == -1 && !t0.d(jA)) {
            this.f43747b = (int) (jA >> 32);
        }
        if (t0.h(jA)) {
            jA = k0.b((int) (4294967295L & jA), (int) (jA >> 32));
        }
        wVar.f43781a.j(jA);
        wVar.w(b0.Selection);
        return jA;
    }

    @Override // a3.o
    public final boolean d(long j9) {
        return true;
    }

    @Override // a3.o
    public final void f() {
        k kVar = k.None;
        w wVar = this.f43750e;
        wVar.f43796q.setValue(kVar);
        if (this.f43749d) {
            wVar.r();
        }
    }

    @Override // a3.o
    public final boolean g(long j9, j0 j0Var, int i11) {
        w wVar = this.f43750e;
        q0 q0VarG = wVar.f43782b.f43008b.g();
        if (!wVar.f43789i || q0VarG == null || wVar.f43781a.d().f41928c.length() == 0) {
            return false;
        }
        this.f43749d = i11 >= 2;
        wVar.f43796q.setValue(k.Mouse);
        this.f43746a.invoke();
        wVar.f43801v = -1;
        this.f43747b = -1;
        this.f43748c = j9;
        this.f43747b = (int) (a(j9, j0Var, q0VarG, true) >> 32);
        return true;
    }

    @Override // a3.o
    public final boolean h(long j9, j0 j0Var) {
        w wVar = this.f43750e;
        o1 o1Var = wVar.f43782b;
        s1 s1Var = wVar.f43781a;
        q0 q0VarG = o1Var.f43008b.g();
        if (!wVar.f43789i || q0VarG == null || s1Var.d().f41928c.length() == 0) {
            return false;
        }
        if (t0.c(s1Var.d().f41929d, a(j9, j0Var, q0VarG, false))) {
            return true;
        }
        this.f43749d = false;
        return true;
    }

    @Override // a3.o
    public final boolean l(long j9) {
        w wVar = this.f43750e;
        q0 q0VarG = wVar.f43782b.f43008b.g();
        if (!wVar.f43789i || q0VarG == null || wVar.f43781a.d().f41928c.length() == 0) {
            return false;
        }
        this.f43749d = false;
        this.f43746a.invoke();
        a(j9, a3.k0.f431d, q0VarG, false);
        return true;
    }
}
