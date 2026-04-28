package gg;

import android.graphics.Path;
import android.graphics.RectF;
import h4.d;
import i4.g0;
import i4.h;
import i4.l;
import i4.m0;
import i4.p0;
import i4.v0;
import z5.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f20435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f20436b;

    public c(float f11, float f12) {
        this.f20435a = f11;
        this.f20436b = f12;
    }

    @Override // i4.v0
    public final g0 a(long j9, m mVar, z5.c cVar) {
        mVar.getClass();
        cVar.getClass();
        float fC0 = cVar.c0(this.f20435a);
        float f11 = 2;
        float fC02 = cVar.c0(this.f20436b) / f11;
        h hVarA = l.a();
        h4.c cVarS = na0.a.S(0L, j9);
        h.c(hVarA, new d(cVarS.f21380a, cVarS.f21381b, cVarS.f21382c, cVarS.f21383d, (((long) Float.floatToRawIntBits(fC0)) << 32) | (((long) Float.floatToRawIntBits(fC0)) & 4294967295L), (((long) Float.floatToRawIntBits(fC0)) << 32) | (((long) Float.floatToRawIntBits(fC0)) & 4294967295L), 0L, 0L));
        h hVarA2 = l.a();
        int i11 = (int) (j9 >> 32);
        float fIntBitsToFloat = (Float.intBitsToFloat(i11) / f11) - fC02;
        float f12 = fC02 / f11;
        float f13 = (-fC02) - f12;
        float fIntBitsToFloat2 = (Float.intBitsToFloat(i11) / f11) + fC02;
        float f14 = fC02 - f12;
        p0 p0Var = p0.CounterClockwise;
        if (hVarA2.f23259b == null) {
            hVarA2.f23259b = new RectF();
        }
        RectF rectF = hVarA2.f23259b;
        rectF.getClass();
        rectF.set(fIntBitsToFloat, f13, fIntBitsToFloat2, f14);
        Path path = hVarA2.f23258a;
        RectF rectF2 = hVarA2.f23259b;
        rectF2.getClass();
        path.addOval(rectF2, l.b(p0Var));
        h hVarA3 = l.a();
        if (hVarA3.g(hVarA, hVarA2, 0)) {
            return new m0(hVarA3);
        }
        i4.a.f("Path.combine() failed.  This may be due an invalid path; in particular, check for NaN values.");
        return null;
    }
}
