package t1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f39548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f39549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f39550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f39551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f39552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f39553f;

    public r(float f11, float f12, float f13, float f14) {
        int iG;
        this.f39548a = f11;
        this.f39549b = f12;
        this.f39550c = f13;
        this.f39551d = f14;
        if (!((Float.isNaN(f11) || Float.isNaN(f12) || Float.isNaN(f13) || Float.isNaN(f14)) ? false : true)) {
            o0.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f11 + ", " + f12 + ", " + f13 + ", " + f14 + '.');
        }
        float[] fArr = new float[5];
        float f15 = (f12 - 0.0f) * 3.0f;
        float f16 = (f14 - f12) * 3.0f;
        float f17 = (1.0f - f14) * 3.0f;
        double d3 = f15;
        double d11 = f16;
        double d12 = f17;
        double d13 = d11 * 2.0d;
        double d14 = (d3 - d13) + d12;
        if (d14 == 0.0d) {
            iG = d11 == d12 ? 0 : i4.g0.G((float) ((d13 - d12) / (d13 - (d12 * 2.0d))), fArr, 0);
        } else {
            double d15 = -Math.sqrt((d11 * d11) - (d12 * d3));
            double d16 = (-d3) + d11;
            int iG2 = i4.g0.G((float) ((-(d15 + d16)) / d14), fArr, 0);
            int iG3 = i4.g0.G((float) ((d15 - d16) / d14), fArr, iG2) + iG2;
            if (iG3 > 1) {
                float f18 = fArr[0];
                float f19 = fArr[1];
                if (f18 > f19) {
                    fArr[0] = f19;
                    fArr[1] = f18;
                } else if (f18 == f19) {
                    iG = iG3 - 1;
                }
                iG = iG3;
            } else {
                iG = iG3;
            }
        }
        float f20 = (f16 - f15) * 2.0f;
        int iG4 = i4.g0.G((-f20) / (((f17 - f16) * 2.0f) - f20), fArr, iG) + iG;
        float fMin = Math.min(0.0f, 1.0f);
        float fMax = Math.max(0.0f, 1.0f);
        for (int i11 = 0; i11 < iG4; i11++) {
            float f21 = fArr[i11];
            float f22 = (((((((((f12 - f14) * 3.0f) + 1.0f) - 0.0f) * f21) + (((f14 - (f12 * 2.0f)) + 0.0f) * 3.0f)) * f21) + f15) * f21) + 0.0f;
            fMin = Math.min(fMin, f22);
            fMax = Math.max(fMax, f22);
        }
        long jA = q1.h.a(fMin, fMax);
        this.f39552e = Float.intBitsToFloat((int) (jA >> 32));
        this.f39553f = Float.intBitsToFloat((int) (jA & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0092 A[PHI: r3
      0x0092: PHI (r3v28 float) = (r3v5 float), (r3v16 float), (r3v21 float), (r3v32 float), (r3v37 float) binds: [B:128:0x0236, B:117:0x0206, B:92:0x01bb, B:47:0x00e5, B:22:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0162 A[PHI: r12
      0x0162: PHI (r12v41 float) = (r12v25 float), (r12v36 float) binds: [B:68:0x0160, B:81:0x0191] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // t1.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(float r27) {
        /*
            Method dump skipped, instruction units count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.r.a(float):float");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f39548a == rVar.f39548a && this.f39549b == rVar.f39549b && this.f39550c == rVar.f39550c && this.f39551d == rVar.f39551d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f39551d) + r8.k.a(r8.k.a(Float.hashCode(this.f39548a) * 31, this.f39549b, 31), this.f39550c, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CubicBezierEasing(a=");
        sb2.append(this.f39548a);
        sb2.append(", b=");
        sb2.append(this.f39549b);
        sb2.append(", c=");
        sb2.append(this.f39550c);
        sb2.append(", d=");
        return r8.k.n(sb2, this.f39551d, ')');
    }
}
