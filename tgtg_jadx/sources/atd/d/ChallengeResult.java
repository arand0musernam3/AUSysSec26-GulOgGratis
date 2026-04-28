package atd.d;

import java.net.HttpURLConnection;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
final class ChallengeResult extends getSDKAppID {
    private static int getSDKReferenceNumber = 1;
    private static int getSDKTransactionID;

    @Override // atd.d.getSDKAppID
    public final HttpURLConnection getSDKAppID(HttpURLConnection httpURLConnection) {
        int i11 = getSDKReferenceNumber;
        int iD = a0.d((i11 | 85) << 1, ~(-(((~i11) & 85) | (i11 & (-86)))), 1, 128);
        getSDKTransactionID = iD;
        int i12 = iD + 95;
        getSDKReferenceNumber = i12 % 128;
        if (i12 % 2 != 0) {
            return httpURLConnection;
        }
        throw null;
    }
}
