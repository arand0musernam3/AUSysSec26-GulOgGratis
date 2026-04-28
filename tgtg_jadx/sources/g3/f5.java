package g3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f18605a = l3.o.f27066c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f18606b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f18607c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f18608d = l3.a0.f26835b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f18609e = l3.a0.f26836c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f18610f = l3.o.f27065b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final t1.b1 f18611g = new t1.b1(1.0f, 50.0f, Float.valueOf(0.001f));

    public static final void a(k4.d dVar, int i11, long j9, float f11, float f12) {
        if (i11 == 1) {
            float f13 = f11 / 2.0f;
            float fIntBitsToFloat = (Float.intBitsToFloat((int) (dVar.d() >> 32)) - f13) - f12;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (dVar.d() & 4294967295L)) / 2.0f;
            k4.d.w0(dVar, j9, f13, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2))), null, 120);
            return;
        }
        float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (dVar.d() >> 32)) - f11) - f12;
        float fIntBitsToFloat4 = (Float.intBitsToFloat((int) (dVar.d() & 4294967295L)) - f11) / 2.0f;
        k4.d.B0(dVar, j9, (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L), (((long) Float.floatToRawIntBits(f11)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f11))), 0.0f, 120);
    }
}
