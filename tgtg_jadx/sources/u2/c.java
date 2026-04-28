package u2;

import a3.i1;
import b5.i2;
import b5.m;
import b5.m1;
import b5.n;
import b5.o2;
import b5.q;
import g4.b0;
import g4.g;
import g4.x;
import g4.z;
import kotlin.jvm.functions.Function0;
import w4.h0;
import w4.m0;
import w4.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends n implements i2, g, x {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Function0 f40637q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f40638r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final m0 f40639s;

    public c(Function0 function0) {
        this.f40637q = function0;
        i1 i1Var = new i1(this, 5);
        w4.n nVar = h0.f43125a;
        m0 m0Var = new m0(null, null, i1Var);
        L0(m0Var);
        this.f40639s = m0Var;
    }

    @Override // b5.i2
    public final void F() {
        this.f40639s.F();
    }

    @Override // g4.g
    public final void e0(z zVar) {
        this.f40638r = ((b0) zVar).c();
    }

    @Override // b5.i2
    public final long j() {
        q qVar = b.f40636a;
        z5.c cVar = m.g(this).f5889z;
        qVar.getClass();
        int i11 = o2.f5913b;
        return m1.c(cVar.q0(qVar.f5924a), cVar.q0(qVar.f5925b), cVar.q0(qVar.f5926c), cVar.q0(qVar.f5927d));
    }

    @Override // b5.i2
    public final void p0(w4.n nVar, o oVar, long j9) {
        this.f40639s.p0(nVar, oVar, j9);
    }
}
