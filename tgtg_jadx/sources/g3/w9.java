package g3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w9 extends b4.s implements b5.c0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b2.k f19734o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f19735p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public t1.b1 f19736q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f19737r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public t1.b f19738s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public t1.b f19739t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f19740u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f19741v;

    @Override // b4.s
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // b5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final z4.v0 mo58measure3p2s80s(z4.w0 w0Var, z4.t0 t0Var, long j9) {
        float fC0 = w0Var.c0(this.f19737r ? l3.y0.f27247n : ((t0Var.b(z5.a.i(j9)) != 0 && t0Var.y(z5.a.h(j9)) != 0) || this.f19735p) ? z7.f19899a : z7.f19900b);
        t1.b bVar = this.f19739t;
        int iFloatValue = (int) (bVar != null ? ((Number) bVar.d()).floatValue() : fC0);
        if (!((iFloatValue >= 0) & (iFloatValue >= 0))) {
            z5.i.a("width and height must be >= 0");
        }
        z4.m1 m1VarD = t0Var.D(z5.b.h(iFloatValue, iFloatValue, iFloatValue, iFloatValue));
        float fC02 = w0Var.c0((z7.f19902d - w0Var.R(fC0)) / 2.0f);
        float fC03 = w0Var.c0((z7.f19901c - z7.f19899a) - z7.f19903e);
        boolean z11 = this.f19737r;
        if (z11 && this.f19735p) {
            fC02 = fC03 - w0Var.c0(l3.y0.f27252s);
        } else if (z11 && !this.f19735p) {
            fC02 = w0Var.c0(l3.y0.f27252s);
        } else if (this.f19735p) {
            fC02 = fC03;
        }
        t1.b bVar2 = this.f19739t;
        x70.c cVar = null;
        if (!Intrinsics.areEqual(bVar2 != null ? (Float) bVar2.f39361e.getValue() : null, fC0)) {
            v80.f0.B(getCoroutineScope(), null, null, new t9(this, fC0, cVar, 0), 3);
        }
        t1.b bVar3 = this.f19738s;
        if (!Intrinsics.areEqual(bVar3 != null ? (Float) bVar3.f39361e.getValue() : null, fC02)) {
            v80.f0.B(getCoroutineScope(), null, null, new t9(this, fC02, cVar, 1), 3);
        }
        if (Float.isNaN(this.f19741v) && Float.isNaN(this.f19740u)) {
            this.f19741v = fC0;
            this.f19740u = fC02;
        }
        return z4.w0.f(w0Var, iFloatValue, iFloatValue, new l3(m1VarD, this, fC02, 2));
    }

    @Override // b4.s
    public final void onAttach() {
        v80.f0.B(getCoroutineScope(), null, null, new v9(this, null), 3);
    }

    @Override // b4.s
    public final void onReset() {
        super.onReset();
        this.f19738s = null;
        this.f19739t = null;
        this.f19741v = Float.NaN;
        this.f19740u = Float.NaN;
    }
}
