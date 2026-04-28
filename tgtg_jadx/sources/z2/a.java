package z2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f46795a = a(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f46796b = 0;

    public static long a(float f11, float f12) {
        return (((long) Float.floatToRawIntBits(f12)) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32);
    }

    public static String b(long j9) {
        return "InlineDensity(density=" + Float.intBitsToFloat((int) (j9 >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j9 & 4294967295L)) + ')';
    }
}
