package i2;

import b0.a1;
import h2.g1;
import kotlin.Unit;
import v1.j1;
import z1.h2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e0 f22844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f22845b;

    public f(e0 e0Var, boolean z11) {
        this.f22844a = e0Var;
        this.f22845b = z11;
    }

    @Override // h2.g1
    public final int a() {
        e0 e0Var = this.f22844a;
        return (int) (e0Var.n().f22910e == h2.Vertical ? e0Var.n().f() & 4294967295L : e0Var.n().f() >> 32);
    }

    @Override // h2.g1
    public final float b() {
        return w0.e.q(this.f22844a);
    }

    @Override // h2.g1
    public final int c() {
        e0 e0Var = this.f22844a;
        return (-e0Var.n().f22911f) + e0Var.n().f22909d;
    }

    @Override // h2.g1
    public final float d() {
        e0 e0Var = this.f22844a;
        return g0.a(e0Var.n(), e0Var.o());
    }

    @Override // h2.g1
    public final j5.d e() {
        boolean z11 = this.f22845b;
        e0 e0Var = this.f22844a;
        return z11 ? new j5.d(e0Var.o(), 1) : new j5.d(1, e0Var.o());
    }

    @Override // h2.g1
    public final Object f(int i11, a1 a1Var) {
        e0 e0Var = this.f22844a;
        e0Var.getClass();
        Object objA = e0Var.a(j1.Default, new d0(e0Var, i11, null, 0), a1Var);
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        if (objA != aVar) {
            objA = Unit.f26487a;
        }
        return objA == aVar ? objA : Unit.f26487a;
    }
}
