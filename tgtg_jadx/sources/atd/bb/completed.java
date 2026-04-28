package atd.bb;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class completed {
    public int getSDKAppID;
    public int getSDKTransactionID;

    public static char[] getSDKTransactionID(long j9, char[] cArr, int i11) {
        int length = cArr.length;
        char[] cArr2 = new char[length];
        int i12 = 0;
        int i13 = 0;
        int i14 = 4;
        while (i12 < cArr.length) {
            if ((((j9 >>> i12) & 1) != i11 || i13 >= 4) && i14 < length) {
                cArr2[i14] = cArr[i12];
                i14++;
                i12++;
            } else {
                cArr2[i13] = cArr[i12];
                i13++;
                i12++;
            }
        }
        return cArr2;
    }
}
