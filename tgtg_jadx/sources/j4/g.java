package j4;

import i4.g0;
import i4.v;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f24560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r f24561f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f24562g;

    public g(r rVar, r rVar2) {
        float[] fArrG;
        super(rVar2, rVar, rVar2, null);
        this.f24560e = rVar;
        this.f24561f = rVar2;
        float[] fArr = a.f24525b.f24526a;
        u uVar = rVar.f24587d;
        float[] fArr2 = rVar.f24592i;
        u uVar2 = rVar2.f24587d;
        float[] fArr3 = rVar2.f24593j;
        if (k.d(uVar, uVar2)) {
            fArrG = k.g(fArr3, fArr2);
        } else {
            float[] fArrA = uVar.a();
            float[] fArrA2 = uVar2.a();
            u uVar3 = k.f24569b;
            fArrG = k.g(k.d(uVar2, uVar3) ? fArr3 : k.f(k.g(k.c(fArr, fArrA2, new float[]{0.964212f, 1.0f, 0.825188f}), rVar2.f24592i)), k.d(uVar, uVar3) ? fArr2 : k.g(k.c(fArr, fArrA, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.f24562g = fArrG;
    }

    @Override // j4.h
    public final long a(long j9) {
        float fH = v.h(j9);
        float fG = v.g(j9);
        float fE = v.e(j9);
        float fD = v.d(j9);
        n nVar = this.f24560e.f24598p;
        float fA = (float) nVar.a(fH);
        float fA2 = (float) nVar.a(fG);
        float fA3 = (float) nVar.a(fE);
        float[] fArr = this.f24562g;
        float f11 = (fArr[6] * fA3) + (fArr[3] * fA2) + (fArr[0] * fA);
        float f12 = (fArr[7] * fA3) + (fArr[4] * fA2) + (fArr[1] * fA);
        float f13 = (fArr[8] * fA3) + (fArr[5] * fA2) + (fArr[2] * fA);
        r rVar = this.f24561f;
        float fA4 = (float) rVar.f24595m.a(f11);
        n nVar2 = rVar.f24595m;
        return g0.b(fA4, (float) nVar2.a(f12), (float) nVar2.a(f13), fD, rVar);
    }
}
