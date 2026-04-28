package g3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m3.e0 f19473a = new m3.e0(new fw.b(24));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t5 f19474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t5 f19475c;

    static {
        long j9 = i4.v.f23315h;
        f19474b = new t5(true, Float.NaN, j9);
        f19475c = new t5(false, Float.NaN, j9);
    }

    public static t5 a(float f11, int i11, long j9, boolean z11) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            f11 = Float.NaN;
        }
        if ((i11 & 4) != 0) {
            j9 = i4.v.f23315h;
        }
        return (z5.f.c(f11, Float.NaN) && i4.v.c(j9, i4.v.f23315h)) ? z11 ? f19474b : f19475c : new t5(z11, f11, j9);
    }
}
