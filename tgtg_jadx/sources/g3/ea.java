package g3;

import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class ea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v1.l1 f18567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1.k0 f18568b = new t1.k0(Boolean.FALSE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v80.l f18569c;

    public ea(v1.l1 l1Var) {
        this.f18567a = l1Var;
    }

    public final void a() {
        this.f18568b.f39472d.setValue(Boolean.FALSE);
    }

    public final boolean b() {
        t1.k0 k0Var = this.f18568b;
        return ((Boolean) k0Var.f39471c.getValue()).booleanValue() || ((Boolean) k0Var.f39472d.getValue()).booleanValue();
    }

    public final Object c(v1.j1 j1Var, z70.i iVar) {
        aa.t tVar = new aa.t(this, j1Var, new a3.c2(this, null, 7), null, 3);
        v1.l1 l1Var = this.f18567a;
        l1Var.getClass();
        Object objN = v80.f0.n(new b0.c2(j1Var, l1Var, tVar, (x70.c) null), iVar);
        return objN == y70.a.COROUTINE_SUSPENDED ? objN : Unit.f26487a;
    }
}
