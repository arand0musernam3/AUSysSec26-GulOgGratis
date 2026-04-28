package v1;

import b5.l2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends b4.s implements b5.r, b5.y1, l2 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f41803o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public i4.r f41804p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f41805q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public i4.v0 f41806r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f41807s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public z5.m f41808t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public i4.g0 f41809u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public i4.v0 f41810v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public i4.g0 f41811w;

    @Override // b5.l2
    public final boolean c() {
        return false;
    }

    @Override // b5.l2
    public final void h0(j5.b0 b0Var) {
        j5.z.n(b0Var, this.f41806r);
    }

    @Override // b5.y1
    public final void l0() {
        this.f41807s = 9205357640488583168L;
        this.f41808t = null;
        this.f41809u = null;
        this.f41810v = null;
        b5.o.h(this);
    }

    @Override // b5.r
    public final void n(b5.o0 o0Var) {
        i4.g0 g0Var;
        i4.r rVar;
        i4.h hVar;
        k4.b bVar = o0Var.f5908a;
        if (this.f41806r == i4.g0.f23254b) {
            if (!i4.v.c(this.f41803o, i4.v.f23315h)) {
                k4.d.B0(o0Var, this.f41803o, 0L, 0L, 0.0f, 126);
            }
            i4.r rVar2 = this.f41804p;
            if (rVar2 != null) {
                k4.d.A0(o0Var, rVar2, 0L, 0L, this.f41805q, null, 0, 118);
            }
        } else {
            if (h4.e.a(bVar.d(), this.f41807s) && o0Var.getLayoutDirection() == this.f41808t && Intrinsics.areEqual(this.f41810v, this.f41806r)) {
                g0Var = this.f41809u;
                g0Var.getClass();
            } else {
                b5.o.m(this, new us.j(2, this, o0Var));
                g0Var = this.f41811w;
                this.f41811w = null;
            }
            this.f41809u = g0Var;
            this.f41807s = bVar.d();
            this.f41808t = o0Var.getLayoutDirection();
            this.f41810v = this.f41806r;
            g0Var.getClass();
            if (!i4.v.c(this.f41803o, i4.v.f23315h)) {
                i4.g0.m(o0Var, g0Var, this.f41803o);
            }
            i4.r rVar3 = this.f41804p;
            if (rVar3 != null) {
                float f11 = this.f41805q;
                boolean z11 = g0Var instanceof i4.n0;
                k4.g gVar = k4.g.f25943a;
                if (z11) {
                    h4.c cVar = ((i4.n0) g0Var).f23271f;
                    float f12 = cVar.f21380a;
                    o0Var.s0(rVar3, (4294967295L & ((long) Float.floatToRawIntBits(cVar.f21381b))) | (Float.floatToRawIntBits(f12) << 32), i4.g0.y(cVar), f11, gVar, 3);
                } else {
                    if (g0Var instanceof i4.o0) {
                        i4.o0 o0Var2 = (i4.o0) g0Var;
                        rVar = rVar3;
                        hVar = o0Var2.f23275g;
                        if (hVar == null) {
                            h4.d dVar = o0Var2.f23274f;
                            float f13 = dVar.f21385b;
                            float f14 = dVar.f21384a;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.f21391h >> 32));
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f13)) & 4294967295L);
                            float f15 = dVar.f21386c - f14;
                            o0Var.e(rVar, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(dVar.f21387d - f13)) & 4294967295L) | (Float.floatToRawIntBits(f15) << 32), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), f11, gVar);
                        }
                    } else if (!(g0Var instanceof i4.m0)) {
                        e40.a.f();
                        return;
                    } else {
                        i4.h hVar2 = ((i4.m0) g0Var).f23270f;
                        rVar = rVar3;
                        hVar = hVar2;
                    }
                    o0Var.J0(hVar, rVar, f11, gVar, 3);
                }
            }
        }
        o0Var.b();
    }
}
