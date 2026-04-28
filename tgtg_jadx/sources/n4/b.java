package n4;

import androidx.fragment.app.r;
import h4.c;
import i0.w;
import i4.g0;
import i4.t;
import jd.f;
import k4.d;
import kotlin.jvm.internal.Intrinsics;
import z5.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w f30502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f30503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i4.w f30504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f30505d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m f30506e = m.Ltr;

    public b() {
        new r(this, 26);
    }

    public boolean a(float f11) {
        return false;
    }

    public boolean e(i4.w wVar) {
        return false;
    }

    public final void g(d dVar, long j9, float f11, i4.w wVar) {
        if (this.f30505d != f11) {
            if (!a(f11)) {
                w wVarG = this.f30502a;
                if (f11 == 1.0f) {
                    if (wVarG != null) {
                        wVarG.F(f11);
                    }
                    this.f30503b = false;
                } else {
                    if (wVarG == null) {
                        wVarG = g0.g();
                        this.f30502a = wVarG;
                    }
                    wVarG.F(f11);
                    this.f30503b = true;
                }
            }
            this.f30505d = f11;
        }
        if (!Intrinsics.areEqual(this.f30504c, wVar)) {
            if (!e(wVar)) {
                w wVarG2 = this.f30502a;
                if (wVar == null) {
                    if (wVarG2 != null) {
                        wVarG2.I(null);
                    }
                    this.f30503b = false;
                } else {
                    if (wVarG2 == null) {
                        wVarG2 = g0.g();
                        this.f30502a = wVarG2;
                    }
                    wVarG2.I(wVar);
                    this.f30503b = true;
                }
            }
            this.f30504c = wVar;
        }
        m layoutDirection = dVar.getLayoutDirection();
        if (this.f30506e != layoutDirection) {
            f(layoutDirection);
            this.f30506e = layoutDirection;
        }
        int i11 = (int) (j9 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.d() >> 32)) - Float.intBitsToFloat(i11);
        int i12 = (int) (j9 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (dVar.d() & 4294967295L)) - Float.intBitsToFloat(i12);
        ((f) dVar.g0().f24502b).l(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f11 > 0.0f) {
            try {
                if (Float.intBitsToFloat(i11) > 0.0f && Float.intBitsToFloat(i12) > 0.0f) {
                    if (this.f30503b) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat(i11);
                        c cVarS = na0.a.S(0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i12))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32));
                        t tVarI = dVar.g0().i();
                        w wVarG3 = this.f30502a;
                        if (wVarG3 == null) {
                            wVarG3 = g0.g();
                            this.f30502a = wVarG3;
                        }
                        try {
                            tVarI.t(cVarS, wVarG3);
                            i(dVar);
                            tVarI.o();
                        } catch (Throwable th2) {
                            tVarI.o();
                            throw th2;
                        }
                    } else {
                        i(dVar);
                    }
                }
            } catch (Throwable th3) {
                ((f) dVar.g0().f24502b).l(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
                throw th3;
            }
        }
        ((f) dVar.g0().f24502b).l(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
    }

    public abstract long h();

    public abstract void i(d dVar);

    public void f(m mVar) {
    }
}
