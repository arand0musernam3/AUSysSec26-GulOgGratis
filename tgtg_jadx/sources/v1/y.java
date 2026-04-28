package v1;

import b5.l2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends b5.n implements l2 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public v f41880q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f41881r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public i4.x0 f41882s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public i4.v0 f41883t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final f4.b f41884u;

    public y(float f11, i4.x0 x0Var, i4.v0 v0Var) {
        this.f41881r = f11;
        this.f41882s = x0Var;
        this.f41883t = v0Var;
        f4.b bVar = new f4.b(new f4.c(), new sg.c(this, 15));
        L0(bVar);
        this.f41884u = bVar;
    }

    @Override // b5.l2
    public final boolean c() {
        return false;
    }

    @Override // b4.s
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // b5.l2
    public final void h0(j5.b0 b0Var) {
        j5.z.n(b0Var, this.f41883t);
    }
}
