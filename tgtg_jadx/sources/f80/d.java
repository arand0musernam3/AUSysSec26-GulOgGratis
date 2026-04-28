package f80;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f17523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f17524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f17525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f17526d;

    static {
        byte[] bArr = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        f17523a = bArr;
        int[] iArr = new int[256];
        int i11 = 0;
        Arrays.fill(iArr, 0, 256, -1);
        iArr[61] = -2;
        int i12 = 0;
        int i13 = 0;
        while (i12 < 64) {
            iArr[bArr[i12]] = i13;
            i12++;
            i13++;
        }
        f17524b = iArr;
        byte[] bArr2 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        f17525c = bArr2;
        int[] iArr2 = new int[256];
        Arrays.fill(iArr2, 0, 256, -1);
        iArr2[61] = -2;
        int i14 = 0;
        while (i11 < 64) {
            iArr2[bArr2[i11]] = i14;
            i11++;
            i14++;
        }
        f17526d = iArr2;
    }
}
