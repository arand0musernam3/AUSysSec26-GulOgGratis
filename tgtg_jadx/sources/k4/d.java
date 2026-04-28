package k4;

import android.graphics.Paint;
import b5.o0;
import i4.g0;
import i4.i;
import i4.r;
import i4.t;
import i4.w;
import kotlin.jvm.internal.Intrinsics;
import o00.h0;
import z5.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public interface d extends z5.c {
    static /* synthetic */ void A0(d dVar, r rVar, long j9, long j11, float f11, e eVar, int i11, int i12) {
        if ((i12 & 2) != 0) {
            j9 = 0;
        }
        long j12 = j9;
        dVar.s0(rVar, j12, (i12 & 4) != 0 ? T(dVar.d(), j12) : j11, (i12 & 8) != 0 ? 1.0f : f11, (i12 & 16) != 0 ? g.f25943a : eVar, (i12 & 64) != 0 ? 3 : i11);
    }

    static /* synthetic */ void B0(d dVar, long j9, long j11, long j12, float f11, int i11) {
        if ((i11 & 2) != 0) {
            j11 = 0;
        }
        long j13 = j11;
        dVar.D0(j9, j13, (i11 & 4) != 0 ? T(dVar.d(), j13) : j12, (i11 & 8) != 0 ? 1.0f : f11, (i11 & 64) != 0 ? 3 : 0);
    }

    static void K0(o0 o0Var, r rVar, long j9, long j11, long j12, e eVar, int i11) {
        if ((i11 & 2) != 0) {
            j9 = 0;
        }
        long j13 = j9;
        o0Var.e(rVar, j13, (i11 & 4) != 0 ? T(o0Var.f5908a.d(), j13) : j11, j12, 1.0f, (i11 & 32) != 0 ? g.f25943a : eVar);
    }

    static /* synthetic */ void M(d dVar, long j9, long j11, long j12, long j13, e eVar, int i11) {
        long j14 = (i11 & 2) != 0 ? 0L : j11;
        dVar.W(j9, j14, (i11 & 4) != 0 ? T(dVar.d(), j14) : j12, j13, (i11 & 16) != 0 ? g.f25943a : eVar);
    }

    static long T(long j9, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32)) - Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L)) - Float.intBitsToFloat((int) (j11 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    static /* synthetic */ void a0(d dVar, i4.f fVar, long j9, float f11, w wVar, int i11, int i12) {
        if ((i12 & 2) != 0) {
            j9 = 0;
        }
        long j11 = j9;
        if ((i12 & 4) != 0) {
            f11 = 1.0f;
        }
        float f12 = f11;
        if ((i12 & 32) != 0) {
            i11 = 3;
        }
        dVar.C(fVar, j11, f12, wVar, i11);
    }

    static void h(o0 o0Var, r rVar, long j9, long j11, float f11, float f12, int i11) {
        if ((i11 & 64) != 0) {
            f12 = 1.0f;
        }
        b bVar = o0Var.f5908a;
        t tVar = bVar.f25937a.f25935c;
        i0.w wVarG = bVar.f25940d;
        if (wVarG == null) {
            wVarG = g0.g();
            wVarG.R(1);
            bVar.f25940d = wVarG;
        }
        Paint paint = (Paint) wVarG.f22746c;
        if (rVar != null) {
            rVar.a(f12, bVar.d(), wVarG);
        } else if (paint.getAlpha() / 255.0f != f12) {
            wVarG.F(f12);
        }
        if (!Intrinsics.areEqual((w) wVarG.f22748e, (Object) null)) {
            wVarG.I(null);
        }
        if (wVarG.f22745b != 3) {
            wVarG.G(3);
        }
        if (paint.getStrokeWidth() != f11) {
            wVarG.Q(f11);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (wVarG.y() != 0) {
            wVarG.O(0);
        }
        if (wVarG.z() != 0) {
            wVarG.P(0);
        }
        if (!Intrinsics.areEqual((i) wVarG.f22749f, (Object) null)) {
            wVarG.K(null);
        }
        if (!paint.isFilterBitmap()) {
            wVarG.J(1);
        }
        tVar.k(j9, j11, wVarG);
    }

    static void n0(d dVar, i4.f fVar, long j9, long j11, float f11, w wVar, int i11, int i12) {
        dVar.A(fVar, 0L, j9, (i12 & 16) != 0 ? j9 : j11, (i12 & 32) != 0 ? 1.0f : f11, wVar, (i12 & 512) != 0 ? 1 : i11);
    }

    static /* synthetic */ void r0(d dVar, i4.h hVar, long j9, float f11, e eVar, int i11) {
        if ((i11 & 4) != 0) {
            f11 = 1.0f;
        }
        float f12 = f11;
        if ((i11 & 8) != 0) {
            eVar = g.f25943a;
        }
        dVar.i0(hVar, j9, f12, eVar);
    }

    static /* synthetic */ void s(d dVar, i4.h hVar, r rVar, float f11, h hVar2, int i11) {
        if ((i11 & 4) != 0) {
            f11 = 1.0f;
        }
        float f12 = f11;
        e eVar = hVar2;
        if ((i11 & 8) != 0) {
            eVar = g.f25943a;
        }
        dVar.J0(hVar, rVar, f12, eVar, (i11 & 32) != 0 ? 3 : 0);
    }

    static /* synthetic */ void w0(d dVar, long j9, float f11, long j11, e eVar, int i11) {
        if ((i11 & 4) != 0) {
            j11 = dVar.t0();
        }
        long j12 = j11;
        if ((i11 & 16) != 0) {
            eVar = g.f25943a;
        }
        dVar.k0(j9, f11, j12, eVar);
    }

    void A(i4.f fVar, long j9, long j11, long j12, float f11, w wVar, int i11);

    void B(long j9, float f11, float f12, long j11, long j12, float f13, h hVar);

    void C(i4.f fVar, long j9, float f11, w wVar, int i11);

    void D0(long j9, long j11, long j12, float f11, int i11);

    void H(long j9, long j11, long j12, float f11, int i11, i iVar);

    void J0(i4.h hVar, r rVar, float f11, e eVar, int i11);

    void W(long j9, long j11, long j12, long j13, e eVar);

    default long d() {
        return g0().o();
    }

    j30.g g0();

    m getLayoutDirection();

    void i0(i4.h hVar, long j9, float f11, e eVar);

    void k0(long j9, float f11, long j11, e eVar);

    void s0(r rVar, long j9, long j11, float f11, e eVar, int i11);

    default long t0() {
        return h0.v(g0().o());
    }
}
