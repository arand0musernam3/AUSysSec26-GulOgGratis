package q1;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f35766a;

    static {
        long[] jArr = g1.f35760a;
        int iD = g1.d(0);
        int iMax = iD > 0 ? Math.max(7, g1.c(iD)) : 0;
        if (iMax != 0) {
            int i11 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i11];
            Arrays.fill(jArr2, 0, i11, -9187201950435737472L);
            jArr = jArr2;
        }
        int i12 = iMax >> 3;
        long j9 = 255 << ((iMax & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j9)) | j9;
        float[] fArr = new float[iMax];
        f35766a = new float[0];
    }
}
