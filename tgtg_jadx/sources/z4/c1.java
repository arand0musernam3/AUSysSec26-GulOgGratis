package z4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 implements a2, m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c1 f47096b = new c1(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47097a;

    public /* synthetic */ c1(int i11) {
        this.f47097a = i11;
    }

    @Override // z4.m
    public long a(long j9, long j11) {
        switch (this.f47097a) {
            case 1:
                float fMax = Math.max(Float.intBitsToFloat((int) (j11 >> 32)) / Float.intBitsToFloat((int) (j9 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)) / Float.intBitsToFloat((int) (j9 & 4294967295L)));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
                int i11 = r1.f47223a;
                return jFloatToRawIntBits;
            case 2:
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) / Float.intBitsToFloat((int) (j9 >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) / Float.intBitsToFloat((int) (j9 & 4294967295L));
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
                int i12 = r1.f47223a;
                return jFloatToRawIntBits2;
            case 3:
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j11 & 4294967295L)) / Float.intBitsToFloat((int) (j9 & 4294967295L));
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
                int i13 = r1.f47223a;
                return jFloatToRawIntBits3;
            case 4:
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j11 >> 32)) / Float.intBitsToFloat((int) (j9 >> 32));
                long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L);
                int i14 = r1.f47223a;
                return jFloatToRawIntBits4;
            case 5:
                float fD = c0.d(j9, j11);
                long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(fD)) << 32) | (((long) Float.floatToRawIntBits(fD)) & 4294967295L);
                int i15 = r1.f47223a;
                return jFloatToRawIntBits5;
            default:
                if (Float.intBitsToFloat((int) (j9 >> 32)) <= Float.intBitsToFloat((int) (j11 >> 32)) && Float.intBitsToFloat((int) (j9 & 4294967295L)) <= Float.intBitsToFloat((int) (j11 & 4294967295L))) {
                    long jFloatToRawIntBits6 = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
                    int i16 = r1.f47223a;
                    return jFloatToRawIntBits6;
                }
                float fD2 = c0.d(j9, j11);
                long jFloatToRawIntBits7 = (((long) Float.floatToRawIntBits(fD2)) << 32) | (((long) Float.floatToRawIntBits(fD2)) & 4294967295L);
                int i17 = r1.f47223a;
                return jFloatToRawIntBits7;
        }
    }

    @Override // z4.a2
    public boolean d(Object obj, Object obj2) {
        return false;
    }

    @Override // z4.a2
    public void g(q1.n1 n1Var) {
        n1Var.clear();
    }

    public String toString() {
        switch (this.f47097a) {
            case 7:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }
}
