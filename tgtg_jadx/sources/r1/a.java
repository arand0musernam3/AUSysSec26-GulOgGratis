package r1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f37527a = new int[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f37528b = new long[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object[] f37529c = new Object[0];

    public static final int a(int i11, int i12, int[] iArr) {
        iArr.getClass();
        int i13 = i11 - 1;
        int i14 = 0;
        while (i14 <= i13) {
            int i15 = (i14 + i13) >>> 1;
            int i16 = iArr[i15];
            if (i16 < i12) {
                i14 = i15 + 1;
            } else {
                if (i16 <= i12) {
                    return i15;
                }
                i13 = i15 - 1;
            }
        }
        return ~i14;
    }

    public static final int b(long[] jArr, int i11, long j9) {
        jArr.getClass();
        int i12 = i11 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            long j11 = jArr[i14];
            if (j11 < j9) {
                i13 = i14 + 1;
            } else {
                if (j11 <= j9) {
                    return i14;
                }
                i12 = i14 - 1;
            }
        }
        return ~i13;
    }
}
