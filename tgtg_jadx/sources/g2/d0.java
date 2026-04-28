package g2;

import a3.b2;
import b0.a1;
import h2.g1;
import kotlin.Unit;
import v1.j1;
import z1.h2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f18153a;

    public d0(b0 b0Var) {
        this.f18153a = b0Var;
    }

    @Override // h2.g1
    public final int a() {
        b0 b0Var = this.f18153a;
        return (int) (b0Var.g().f18223q == h2.Vertical ? b0Var.g().f() & 4294967295L : b0Var.g().f() >> 32);
    }

    @Override // h2.g1
    public final float b() {
        b0 b0Var = this.f18153a;
        return (b0Var.f18129d.f17224b.h() * 500) + b0Var.f18129d.f17225c.h();
    }

    @Override // h2.g1
    public final int c() {
        b0 b0Var = this.f18153a;
        return (-b0Var.g().f18220n) + b0Var.g().f18224r;
    }

    @Override // h2.g1
    public final float d() {
        b0 b0Var = this.f18153a;
        int iH = b0Var.f18129d.f17224b.h();
        int iH2 = b0Var.f18129d.f17225c.h();
        return b0Var.d() ? (iH * 500) + iH2 + 100 : (iH * 500) + iH2;
    }

    @Override // h2.g1
    public final j5.d e() {
        return new j5.d(-1, -1);
    }

    @Override // h2.g1
    public final Object f(int i11, a1 a1Var) {
        ub.a aVar = b0.f18125w;
        b0 b0Var = this.f18153a;
        b0Var.getClass();
        Object objA = b0Var.a(j1.Default, new b2(b0Var, i11, null, 22), a1Var);
        y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
        if (objA != aVar2) {
            objA = Unit.f26487a;
        }
        return objA == aVar2 ? objA : Unit.f26487a;
    }
}
