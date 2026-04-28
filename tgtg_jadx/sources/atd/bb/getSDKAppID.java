package atd.bb;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getSDKAppID {
    public static void AuthenticationRequestParameters(int i11, int i12, boolean z11, int i13, int[] iArr, int[][] iArr2, int[] iArr3) {
        if (!z11) {
            getDeviceData(iArr);
        }
        int i14 = 0;
        while (i14 < i13) {
            int i15 = i11 ^ iArr[i14];
            int iAuthenticationRequestParameters = i12 ^ AuthenticationRequestParameters(i15, iArr2);
            i14++;
            i12 = i15;
            i11 = iAuthenticationRequestParameters;
        }
        int i16 = i11 ^ iArr[iArr.length - 2];
        int i17 = i12 ^ iArr[iArr.length - 1];
        if (!z11) {
            getDeviceData(iArr);
        }
        iArr3[0] = i17;
        iArr3[1] = i16;
    }

    private static void getDeviceData(int[] iArr) {
        for (int i11 = 0; i11 < iArr.length / 2; i11++) {
            int i12 = iArr[i11];
            iArr[i11] = iArr[(iArr.length - i11) - 1];
            iArr[(iArr.length - i11) - 1] = i12;
        }
    }

    private static int AuthenticationRequestParameters(int i11, int[][] iArr) {
        return ((iArr[0][i11 >>> 24] + iArr[1][(i11 >>> 16) & 255]) ^ iArr[2][(i11 >>> 8) & 255]) + iArr[3][i11 & 255];
    }
}
