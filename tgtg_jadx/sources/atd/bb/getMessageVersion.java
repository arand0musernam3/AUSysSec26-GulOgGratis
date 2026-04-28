package atd.bb;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getMessageVersion {
    public int AuthenticationRequestParameters;
    public int getDeviceData;
    public int getSDKAppID;

    public static int getSDKReferenceNumber(int i11) {
        int[][] iArr = getSDKReferenceNumber.getSDKAppID.getSDKReferenceNumber;
        return ((iArr[0][(i11 >>> 24) & 255] + iArr[1][(i11 >>> 16) & 255]) ^ iArr[2][(i11 >>> 8) & 255]) + iArr[3][i11 & 255];
    }

    public static void getSDKTransactionID(int[] iArr) {
        for (int i11 = 0; i11 < iArr.length / 2; i11++) {
            int i12 = iArr[i11];
            iArr[i11] = iArr[(iArr.length - i11) - 1];
            iArr[(iArr.length - i11) - 1] = i12;
        }
    }
}
