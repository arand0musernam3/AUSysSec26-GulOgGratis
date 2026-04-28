package g3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f19094a = 240;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f19095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f19096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f19097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t1.r f19098e;

    static {
        float f11 = l3.a0.f26834a;
        f19095b = l3.a0.f26834a;
        f19096c = 6;
        float f12 = l3.o.f27064a;
        f19097d = l3.o.f27064a;
        t1.r rVar = l3.g0.f26960a;
        f19098e = l3.g0.f26962c;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(b4.t r28, long r29, float r31, long r32, int r34, float r35, m3.n r36, final int r37, final int r38) {
        /*
            Method dump skipped, instruction units count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.m5.a(b4.t, long, float, long, int, float, m3.n, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0199 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final kotlin.jvm.functions.Function0 r20, final b4.t r21, final long r22, final long r24, int r26, float r27, kotlin.jvm.functions.Function1 r28, m3.n r29, final int r30, final int r31) {
        /*
            Method dump skipped, instruction units count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.m5.b(kotlin.jvm.functions.Function0, b4.t, long, long, int, float, kotlin.jvm.functions.Function1, m3.n, int, int):void");
    }

    public static final void c(k4.d dVar, float f11, float f12, long j9, k4.h hVar) {
        float f13 = 2;
        float f14 = hVar.f25944a / f13;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.d() >> 32)) - (f13 * f14);
        dVar.B(j9, f11, f12, (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (768 & 64) != 0 ? 1.0f : 0.0f, hVar);
    }

    public static final void d(k4.d dVar, float f11, float f12, long j9, float f13, int i11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.d() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (dVar.d() & 4294967295L));
        float f14 = 2;
        float f15 = fIntBitsToFloat2 / f14;
        boolean z11 = dVar.getLayoutDirection() == z5.m.Ltr;
        float f16 = (z11 ? f11 : 1.0f - f12) * fIntBitsToFloat;
        float f17 = (z11 ? f12 : 1.0f - f11) * fIntBitsToFloat;
        if (i11 == 0 || fIntBitsToFloat2 > fIntBitsToFloat) {
            dVar.H(j9, (((long) Float.floatToRawIntBits(f16)) << 32) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L), (((long) Float.floatToRawIntBits(f17)) << 32) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L), f13, (496 & 16) != 0 ? 0 : 0, (496 & 32) != 0 ? null : null);
            return;
        }
        float f18 = f13 / f14;
        float f19 = fIntBitsToFloat - f18;
        if (f16 < f18) {
            f16 = f18;
        }
        if (f16 > f19) {
            f16 = f19;
        }
        if (f17 < f18) {
            f17 = f18;
        }
        if (f17 <= f19) {
            f19 = f17;
        }
        if (Math.abs(f12 - f11) > 0.0f) {
            dVar.H(j9, (((long) Float.floatToRawIntBits(f16)) << 32) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L), (((long) Float.floatToRawIntBits(f19)) << 32) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L), f13, (496 & 16) != 0 ? 0 : i11, (496 & 32) != 0 ? null : null);
        }
    }
}
