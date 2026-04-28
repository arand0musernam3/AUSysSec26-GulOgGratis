package j4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f24568a = new u(0.31006f, 0.31616f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f24569b = new u(0.34567f, 0.3585f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f24570c = new u(0.32168f, 0.33767f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u f24571d = new u(0.31271f, 0.32902f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float[] f24572e = {0.964212f, 1.0f, 0.825188f};

    public static c a(c cVar) {
        if (b.a(cVar.f24533b, b.f24527a)) {
            r rVar = (r) cVar;
            u uVar = rVar.f24587d;
            u uVar2 = f24569b;
            if (!d(uVar, uVar2)) {
                return new r(rVar.f24532a, rVar.f24591h, uVar2, g(c(a.f24525b.f24526a, uVar.a(), uVar2.a()), rVar.f24592i), rVar.f24594k, rVar.f24596n, rVar.f24588e, rVar.f24589f, rVar.f24590g, -1);
            }
        }
        return cVar;
    }

    public static float b(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f11 = fArr[0];
        float f12 = fArr[1];
        float f13 = fArr[2];
        float f14 = fArr[3];
        float f15 = fArr[4];
        float f16 = fArr[5];
        float f17 = (((((f13 * f16) + ((f12 * f15) + (f11 * f14))) - (f14 * f15)) - (f12 * f13)) - (f11 * f16)) * 0.5f;
        return f17 < 0.0f ? -f17 : f17;
    }

    public static final float[] c(float[] fArr, float[] fArr2, float[] fArr3) {
        h(fArr, fArr2);
        h(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] fArrF = f(fArr);
        float f11 = fArr4[0];
        float f12 = fArr[0] * f11;
        float f13 = fArr4[1];
        float f14 = fArr[1] * f13;
        float f15 = fArr4[2];
        return g(fArrF, new float[]{f12, f14, fArr[2] * f15, fArr[3] * f11, fArr[4] * f13, fArr[5] * f15, f11 * fArr[6], f13 * fArr[7], f15 * fArr[8]});
    }

    public static final boolean d(u uVar, u uVar2) {
        if (uVar == uVar2) {
            return true;
        }
        return Math.abs(uVar.f24607a - uVar2.f24607a) < 0.001f && Math.abs(uVar.f24608b - uVar2.f24608b) < 0.001f;
    }

    public static final h e(c cVar, c cVar2) {
        if (cVar == cVar2) {
            return new f(cVar, cVar, 1);
        }
        long j9 = cVar.f24533b;
        long j11 = b.f24527a;
        return (b.a(j9, j11) && b.a(cVar2.f24533b, j11)) ? new g((r) cVar, (r) cVar2) : new h(cVar, cVar2, 0);
    }

    public static final float[] f(float[] fArr) {
        float f11 = fArr[0];
        float f12 = fArr[3];
        float f13 = fArr[6];
        float f14 = fArr[1];
        float f15 = fArr[4];
        float f16 = fArr[7];
        float f17 = fArr[2];
        float f18 = fArr[5];
        float f19 = fArr[8];
        float f20 = (f15 * f19) - (f16 * f18);
        float f21 = (f16 * f17) - (f14 * f19);
        float f22 = (f14 * f18) - (f15 * f17);
        float f23 = (f13 * f22) + (f12 * f21) + (f11 * f20);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f20 / f23;
        fArr2[1] = f21 / f23;
        fArr2[2] = f22 / f23;
        fArr2[3] = ((f13 * f18) - (f12 * f19)) / f23;
        fArr2[4] = ((f19 * f11) - (f13 * f17)) / f23;
        fArr2[5] = ((f17 * f12) - (f18 * f11)) / f23;
        fArr2[6] = ((f12 * f16) - (f13 * f15)) / f23;
        fArr2[7] = ((f13 * f14) - (f16 * f11)) / f23;
        fArr2[8] = ((f11 * f15) - (f12 * f14)) / f23;
        return fArr2;
    }

    public static final float[] g(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f11 = fArr[0] * fArr2[0];
        float f12 = fArr[3];
        float f13 = fArr2[1];
        float f14 = fArr[6];
        float f15 = fArr2[2];
        fArr3[0] = (f14 * f15) + (f12 * f13) + f11;
        float f16 = fArr[1];
        float f17 = fArr2[0];
        float f18 = fArr[4];
        float f19 = fArr[7];
        float f20 = f19 * f15;
        fArr3[1] = f20 + (f13 * f18) + (f16 * f17);
        float f21 = fArr[2] * f17;
        float f22 = fArr[5];
        float f23 = (fArr2[1] * f22) + f21;
        float f24 = fArr[8];
        fArr3[2] = (f15 * f24) + f23;
        float f25 = fArr[0];
        float f26 = fArr2[3] * f25;
        float f27 = fArr2[4];
        float f28 = (f12 * f27) + f26;
        float f29 = fArr2[5];
        fArr3[3] = (f14 * f29) + f28;
        float f31 = fArr[1];
        float f32 = fArr2[3];
        float f33 = f18 * f27;
        fArr3[4] = (f19 * f29) + f33 + (f31 * f32);
        float f34 = fArr[2];
        float f35 = f29 * f24;
        fArr3[5] = f35 + (f22 * fArr2[4]) + (f32 * f34);
        float f36 = f25 * fArr2[6];
        float f37 = fArr[3];
        float f38 = fArr2[7];
        float f39 = (f37 * f38) + f36;
        float f40 = fArr2[8];
        fArr3[6] = (f14 * f40) + f39;
        float f41 = fArr2[6];
        float f42 = f19 * f40;
        fArr3[7] = f42 + (fArr[4] * f38) + (f31 * f41);
        float f43 = f24 * f40;
        fArr3[8] = f43 + (fArr[5] * fArr2[7]) + (f34 * f41);
        return fArr3;
    }

    public static final float[] h(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f11 = fArr2[0];
        float f12 = fArr2[1];
        float f13 = fArr2[2];
        fArr2[0] = (fArr[6] * f13) + (fArr[3] * f12) + (fArr[0] * f11);
        fArr2[1] = (fArr[7] * f13) + (fArr[4] * f12) + (fArr[1] * f11);
        fArr2[2] = (fArr[8] * f13) + (fArr[5] * f12) + (fArr[2] * f11);
        return fArr2;
    }
}
