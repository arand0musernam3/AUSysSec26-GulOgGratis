package v1;

import b0.r2;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1 f41846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m3.k1 f41847b = m3.i.w(Boolean.FALSE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v80.l f41848c;

    public u(l1 l1Var) {
        this.f41846a = l1Var;
    }

    public final void a(boolean z11) {
        this.f41847b.setValue(Boolean.valueOf(z11));
    }

    public final Object b(j1 j1Var, z70.i iVar) {
        r2 r2Var = new r2(this, new a3.c2(this, null, 9), null, 7);
        l1 l1Var = this.f41846a;
        l1Var.getClass();
        Object objN = v80.f0.n(new b0.c2(j1Var, l1Var, r2Var, (x70.c) null), iVar);
        return objN == y70.a.COROUTINE_SUSPENDED ? objN : Unit.f26487a;
    }
}
