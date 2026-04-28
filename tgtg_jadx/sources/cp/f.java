package cp;

import i4.g0;
import i4.m0;
import i4.v0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements v0 {
    @Override // i4.v0
    public final g0 a(long j9, z5.m mVar, z5.c cVar) {
        mVar.getClass();
        cVar.getClass();
        float fC0 = cVar.c0(12);
        float fC02 = cVar.c0(14);
        float fC03 = cVar.c0(8);
        i4.h hVarA = i4.l.a();
        int i11 = (int) (j9 >> 32);
        i4.h.c(hVarA, nx.d.k(0.0f, fC03, Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j9 & 4294967295L)), (((long) Float.floatToRawIntBits(fC0)) << 32) | (((long) Float.floatToRawIntBits(fC0)) & 4294967295L)));
        float f11 = 2;
        float f12 = fC02 / f11;
        hVarA.f((Float.intBitsToFloat(i11) / f11) - f12, fC03);
        hVarA.e(Float.intBitsToFloat(i11) / f11, 0.0f);
        hVarA.e((Float.intBitsToFloat(i11) / f11) + f12, fC03);
        hVarA.f23258a.close();
        return new m0(hVarA);
    }
}
