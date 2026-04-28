package i3;

import a3.y0;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import z1.g1;
import z1.h2;
import z4.m1;
import z4.v0;
import z4.w0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends b4.s implements b5.c0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public z1.r f23178o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Function2 f23179p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public h2 f23180q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f23181r;

    @Override // b5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final v0 mo58measure3p2s80s(w0 w0Var, z4.t0 t0Var, long j9) {
        m1 m1VarD = t0Var.D(j9);
        if (!w0Var.Z() || !this.f23181r) {
            Pair pair = (Pair) this.f23179p.invoke(new z5.l((((long) m1VarD.f47184b) & 4294967295L) | (((long) m1VarD.f47183a) << 32)), new z5.a(j9));
            this.f23178o.j((g1) pair.f26485a, pair.f26486b);
        }
        this.f23181r = w0Var.Z() || this.f23181r;
        return w0.f(w0Var, m1VarD.f47183a, m1VarD.f47184b, new y0(w0Var, this, m1VarD, 23));
    }

    @Override // b4.s
    public final void onDetach() {
        this.f23181r = false;
    }
}
