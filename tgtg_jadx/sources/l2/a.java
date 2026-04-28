package l2;

import i4.g0;
import i4.n0;
import i4.o0;
import i4.v0;
import z5.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f26783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f26784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f26785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f26786d;

    public a(b bVar, b bVar2, b bVar3, b bVar4) {
        this.f26783a = bVar;
        this.f26784b = bVar2;
        this.f26785c = bVar3;
        this.f26786d = bVar4;
    }

    public static f b(a aVar, b bVar, b bVar2, b bVar3, b bVar4, int i11) {
        if ((i11 & 1) != 0) {
            bVar = aVar.f26783a;
        }
        if ((i11 & 2) != 0) {
            bVar2 = aVar.f26784b;
        }
        if ((i11 & 4) != 0) {
            bVar3 = aVar.f26785c;
        }
        if ((i11 & 8) != 0) {
            bVar4 = aVar.f26786d;
        }
        ((f) aVar).getClass();
        return new f(bVar, bVar2, bVar3, bVar4);
    }

    @Override // i4.v0
    public final g0 a(long j9, m mVar, z5.c cVar) {
        float fA = this.f26783a.a(j9, cVar);
        float fA2 = this.f26784b.a(j9, cVar);
        float fA3 = this.f26785c.a(j9, cVar);
        float fA4 = this.f26786d.a(j9, cVar);
        float fC = h4.e.c(j9);
        float f11 = fA + fA4;
        if (f11 > fC) {
            float f12 = fC / f11;
            fA *= f12;
            fA4 *= f12;
        }
        float f13 = fA2 + fA3;
        if (f13 > fC) {
            float f14 = fC / f13;
            fA2 *= f14;
            fA3 *= f14;
        }
        if (fA < 0.0f || fA2 < 0.0f || fA3 < 0.0f || fA4 < 0.0f) {
            c2.a.a("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + fA4 + ")!");
        }
        if (fA + fA2 + fA3 + fA4 == 0.0f) {
            return new n0(na0.a.S(0L, j9));
        }
        h4.c cVarS = na0.a.S(0L, j9);
        m mVar2 = m.Ltr;
        float f15 = mVar == mVar2 ? fA : fA2;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L);
        if (mVar == mVar2) {
            fA = fA2;
        }
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fA)) << 32) | (((long) Float.floatToRawIntBits(fA)) & 4294967295L);
        float f16 = mVar == mVar2 ? fA3 : fA4;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f16)) << 32) | (((long) Float.floatToRawIntBits(f16)) & 4294967295L);
        if (mVar != mVar2) {
            fA4 = fA3;
        }
        return new o0(new h4.d(cVarS.f21380a, cVarS.f21381b, cVarS.f21382c, cVarS.f21383d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(fA4)) << 32) | (((long) Float.floatToRawIntBits(fA4)) & 4294967295L)));
    }
}
