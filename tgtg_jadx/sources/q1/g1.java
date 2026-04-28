package q1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long[] f35760a = {-9187201950435737345L, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t0 f35761b = new t0(0);

    public static final int a(int i11) {
        if (i11 == 7) {
            return 6;
        }
        return i11 - (i11 / 8);
    }

    public static final int b(int i11) {
        if (i11 == 0) {
            return 6;
        }
        return (i11 * 2) + 1;
    }

    public static final int c(int i11) {
        if (i11 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i11);
        }
        return 0;
    }

    public static final int d(int i11) {
        if (i11 == 7) {
            return 8;
        }
        return org.bouncycastle.jcajce.provider.asymmetric.a.a(i11, 1, 7, i11);
    }
}
