package atd.ad;

import atd.aj.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AuthenticationRequestParameters {
    private static int AuthenticationRequestParameters = 1;
    private static int getSDKTransactionID;

    static {
        BuildConfig.getSDKTransactionID();
        int i11 = getSDKTransactionID;
        int i12 = i11 & 109;
        int i13 = i11 | 109;
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        AuthenticationRequestParameters = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
    }

    public abstract String AuthenticationRequestParameters();
}
