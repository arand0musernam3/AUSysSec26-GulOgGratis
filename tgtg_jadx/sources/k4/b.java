package k4;

import android.graphics.Paint;
import android.graphics.Shader;
import i0.w;
import i4.g0;
import i4.i;
import i4.r;
import i4.t;
import i4.v;
import kotlin.jvm.internal.Intrinsics;
import z5.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f25937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j30.g f25938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w f25939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w f25940d;

    public b() {
        m mVar = m.Ltr;
        a aVar = new a();
        aVar.f25933a = c.f25941a;
        aVar.f25934b = mVar;
        aVar.f25935c = f.f25942a;
        aVar.f25936d = 0L;
        this.f25937a = aVar;
        this.f25938b = new j30.g(this);
    }

    public static w b(b bVar, long j9, e eVar, float f11, int i11) {
        w wVarE = bVar.e(eVar);
        Paint paint = (Paint) wVarE.f22746c;
        if (f11 != 1.0f) {
            j9 = v.b(v.d(j9) * f11, j9);
        }
        if (!v.c(g0.c(paint.getColor()), j9)) {
            wVarE.H(j9);
        }
        if (((Shader) wVarE.f22747d) != null) {
            wVarE.L(null);
        }
        if (!Intrinsics.areEqual((i4.w) wVarE.f22748e, (Object) null)) {
            wVarE.I(null);
        }
        if (wVarE.f22745b != i11) {
            wVarE.G(i11);
        }
        if (paint.isFilterBitmap()) {
            return wVarE;
        }
        wVarE.J(1);
        return wVarE;
    }

    @Override // k4.d
    public final void A(i4.f fVar, long j9, long j11, long j12, float f11, i4.w wVar, int i11) {
        this.f25937a.f25935c.g(fVar, j9, j11, j12, c(null, g.f25943a, f11, wVar, 3, i11));
    }

    @Override // k4.d
    public final void B(long j9, float f11, float f12, long j11, long j12, float f13, h hVar) {
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        this.f25937a.f25935c.i(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat((int) (j12 >> 32)) + Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j12 & 4294967295L)) + Float.intBitsToFloat(i12), f11, f12, b(this, j9, hVar, f13, 3));
    }

    @Override // k4.d
    public final void C(i4.f fVar, long j9, float f11, i4.w wVar, int i11) {
        this.f25937a.f25935c.p(fVar, j9, c(null, g.f25943a, f11, wVar, i11, 1));
    }

    @Override // k4.d
    public final void D0(long j9, long j11, long j12, float f11, int i11) {
        int i12 = (int) (j11 >> 32);
        int i13 = (int) (j11 & 4294967295L);
        this.f25937a.f25935c.r(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13), Float.intBitsToFloat((int) (j12 >> 32)) + Float.intBitsToFloat(i12), Float.intBitsToFloat((int) (4294967295L & j12)) + Float.intBitsToFloat(i13), b(this, j9, g.f25943a, f11, i11));
    }

    @Override // k4.d
    public final void H(long j9, long j11, long j12, float f11, int i11, i iVar) {
        t tVar = this.f25937a.f25935c;
        w wVarG = this.f25940d;
        if (wVarG == null) {
            wVarG = g0.g();
            wVarG.R(1);
            this.f25940d = wVarG;
        }
        Paint paint = (Paint) wVarG.f22746c;
        if (!v.c(g0.c(paint.getColor()), j9)) {
            wVarG.H(j9);
        }
        if (((Shader) wVarG.f22747d) != null) {
            wVarG.L(null);
        }
        if (!Intrinsics.areEqual((i4.w) wVarG.f22748e, (Object) null)) {
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
        if (wVarG.y() != i11) {
            wVarG.O(i11);
        }
        if (wVarG.z() != 0) {
            wVarG.P(0);
        }
        if (!Intrinsics.areEqual((i) wVarG.f22749f, iVar)) {
            wVarG.K(iVar);
        }
        if (!paint.isFilterBitmap()) {
            wVarG.J(1);
        }
        tVar.k(j11, j12, wVarG);
    }

    @Override // k4.d
    public final void J0(i4.h hVar, r rVar, float f11, e eVar, int i11) {
        this.f25937a.f25935c.l(hVar, c(rVar, eVar, f11, null, i11, 1));
    }

    @Override // k4.d
    public final void W(long j9, long j11, long j12, long j13, e eVar) {
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        this.f25937a.f25935c.j(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat((int) (j12 >> 32)) + Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j12 & 4294967295L)) + Float.intBitsToFloat(i12), Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j13 & 4294967295L)), b(this, j9, eVar, 1.0f, 3));
    }

    @Override // z5.c
    public final float X() {
        return this.f25937a.f25933a.X();
    }

    @Override // z5.c
    public final float a() {
        return this.f25937a.f25933a.a();
    }

    public final w c(r rVar, e eVar, float f11, i4.w wVar, int i11, int i12) {
        w wVarE = e(eVar);
        Paint paint = (Paint) wVarE.f22746c;
        if (rVar != null) {
            rVar.a(f11, d(), wVarE);
        } else {
            if (((Shader) wVarE.f22747d) != null) {
                wVarE.L(null);
            }
            long jC = g0.c(paint.getColor());
            long j9 = v.f23309b;
            if (!v.c(jC, j9)) {
                wVarE.H(j9);
            }
            if (paint.getAlpha() / 255.0f != f11) {
                wVarE.F(f11);
            }
        }
        if (!Intrinsics.areEqual((i4.w) wVarE.f22748e, wVar)) {
            wVarE.I(wVar);
        }
        if (wVarE.f22745b != i11) {
            wVarE.G(i11);
        }
        if (paint.isFilterBitmap() == i12) {
            return wVarE;
        }
        wVarE.J(i12);
        return wVarE;
    }

    public final w e(e eVar) {
        if (Intrinsics.areEqual(eVar, g.f25943a)) {
            w wVar = this.f25939c;
            if (wVar != null) {
                return wVar;
            }
            w wVarG = g0.g();
            wVarG.R(0);
            this.f25939c = wVarG;
            return wVarG;
        }
        if (!(eVar instanceof h)) {
            e40.a.f();
            return null;
        }
        w wVarG2 = this.f25940d;
        if (wVarG2 == null) {
            wVarG2 = g0.g();
            wVarG2.R(1);
            this.f25940d = wVarG2;
        }
        Paint paint = (Paint) wVarG2.f22746c;
        float strokeWidth = paint.getStrokeWidth();
        h hVar = (h) eVar;
        i iVar = hVar.f25948e;
        float f11 = hVar.f25944a;
        if (strokeWidth != f11) {
            wVarG2.Q(f11);
        }
        int iY = wVarG2.y();
        int i11 = hVar.f25946c;
        if (iY != i11) {
            wVarG2.O(i11);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f12 = hVar.f25945b;
        if (strokeMiter != f12) {
            paint.setStrokeMiter(f12);
        }
        int iZ = wVarG2.z();
        int i12 = hVar.f25947d;
        if (iZ != i12) {
            wVarG2.P(i12);
        }
        if (!Intrinsics.areEqual((i) wVarG2.f22749f, iVar)) {
            wVarG2.K(iVar);
        }
        return wVarG2;
    }

    @Override // k4.d
    public final j30.g g0() {
        return this.f25938b;
    }

    @Override // k4.d
    public final m getLayoutDirection() {
        return this.f25937a.f25934b;
    }

    @Override // k4.d
    public final void i0(i4.h hVar, long j9, float f11, e eVar) {
        this.f25937a.f25935c.l(hVar, b(this, j9, eVar, f11, 3));
    }

    @Override // k4.d
    public final void k0(long j9, float f11, long j11, e eVar) {
        this.f25937a.f25935c.q(f11, j11, b(this, j9, eVar, 1.0f, 3));
    }

    @Override // k4.d
    public final void s0(r rVar, long j9, long j11, float f11, e eVar, int i11) {
        int i12 = (int) (j9 >> 32);
        int i13 = (int) (j9 & 4294967295L);
        this.f25937a.f25935c.r(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13), Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat(i12), Float.intBitsToFloat((int) (4294967295L & j11)) + Float.intBitsToFloat(i13), c(rVar, eVar, f11, null, i11, 1));
    }
}
