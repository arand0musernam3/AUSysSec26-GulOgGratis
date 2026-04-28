package w2;

import a3.l2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i0 {
    public static final float a(long j9, h4.c cVar) {
        float f11 = cVar.f21383d;
        float f12 = cVar.f21382c;
        if (l2.a(j9, cVar)) {
            return 0.0f;
        }
        float fD = h4.b.d(h4.b.e(cVar.f(), j9));
        if (fD >= Float.MAX_VALUE) {
            fD = Float.MAX_VALUE;
        }
        float fD2 = h4.b.d(h4.b.e((((long) Float.floatToRawIntBits(f12)) << 32) | (((long) Float.floatToRawIntBits(cVar.f21381b)) & 4294967295L), j9));
        if (fD2 < fD) {
            fD = fD2;
        }
        float fD3 = h4.b.d(h4.b.e((((long) Float.floatToRawIntBits(cVar.f21380a)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L), j9));
        if (fD3 < fD) {
            fD = fD3;
        }
        float fD4 = h4.b.d(h4.b.e((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (((long) Float.floatToRawIntBits(f12)) << 32), j9));
        return fD4 < fD ? fD4 : fD;
    }
}
