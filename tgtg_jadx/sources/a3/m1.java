package a3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j5.a0 f480c = new j5.a0("SelectionHandleInfo");

    static {
        float f11 = 25;
        f478a = f11;
        f479b = f11;
    }

    public static final long a(long j9) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j9 & 4294967295L)) - 1.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
