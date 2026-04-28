package f2;

import b0.a1;
import h2.g1;
import kotlin.Unit;
import m3.i0;
import z1.h2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f17118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f17119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f17120c;

    public g(c0 c0Var, boolean z11) {
        this.f17119b = c0Var;
        this.f17120c = z11;
        this.f17118a = m3.i.q(new f(c0Var, 0));
    }

    @Override // h2.g1
    public final int a() {
        c0 c0Var = this.f17119b;
        return (int) (c0Var.j().f17196p == h2.Vertical ? c0Var.j().f() & 4294967295L : c0Var.j().f() >> 32);
    }

    @Override // h2.g1
    public final float b() {
        c0 c0Var = this.f17119b;
        return (c0Var.h() * 500) + c0Var.i();
    }

    @Override // h2.g1
    public final int c() {
        c0 c0Var = this.f17119b;
        return (-c0Var.j().l) + c0Var.j().f17197q;
    }

    @Override // h2.g1
    public final float d() {
        c0 c0Var = this.f17119b;
        int iH = c0Var.h();
        int i11 = c0Var.i();
        return c0Var.d() ? (iH * 500) + i11 + 100 : (iH * 500) + i11;
    }

    @Override // h2.g1
    public final j5.d e() {
        boolean z11 = this.f17120c;
        i0 i0Var = this.f17118a;
        return z11 ? new j5.d(((Number) i0Var.getValue()).intValue(), 1) : new j5.d(1, ((Number) i0Var.getValue()).intValue());
    }

    @Override // h2.g1
    public final Object f(int i11, a1 a1Var) {
        Object objL = c0.l(this.f17119b, i11, a1Var);
        return objL == y70.a.COROUTINE_SUSPENDED ? objL : Unit.f26487a;
    }
}
