package atd.ai;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class AuthenticationRequestParameters {
    private static int BuildConfig = 0;
    private static int ChallengeResult = 0;
    private static int ChallengeResultCancelled = 1;
    private static int getSDKEphemeralPublicKey = 1;
    private static getSDKAppID AuthenticationRequestParameters = new getDeviceData();
    private static getSDKAppID getDeviceData = new getSDKReferenceNumber();
    private static getSDKAppID getSDKTransactionID = new getSDKTransactionID();
    public static List<getSDKAppID> getSDKAppID = Arrays.asList(AuthenticationRequestParameters, getDeviceData);
    public static List<getSDKAppID> getSDKReferenceNumber = Arrays.asList(getDeviceData, getSDKTransactionID);

    static {
        int i11 = getSDKEphemeralPublicKey;
        int i12 = ((((i11 ^ 109) | (i11 & 109)) << 1) - (~(-(((~i11) & 109) | (i11 & (-110)))))) - 1;
        BuildConfig = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    public static getSDKAppID getDeviceData(String str, List<getSDKAppID> list) {
        ChallengeResult = (ChallengeResultCancelled + 109) % 128;
        int i11 = ChallengeResultCancelled;
        int i12 = i11 & 53;
        int i13 = (i11 ^ 53) | i12;
        ChallengeResult = ((i12 & i13) + (i13 | i12)) % 128;
        for (getSDKAppID getsdkappid : list) {
            int i14 = ChallengeResultCancelled;
            int i15 = i14 ^ 29;
            ChallengeResult = ((((i14 & 29) | i15) << 1) - i15) % 128;
            if (getsdkappid.AuthenticationRequestParameters().equals(str)) {
                int i16 = ChallengeResultCancelled;
                int i17 = (i16 & 110) + (i16 | 110);
                int i18 = (i17 ^ (-1)) + (i17 << 1);
                ChallengeResult = i18 % 128;
                if (i18 % 2 == 0) {
                    return getsdkappid;
                }
                throw null;
            }
            int i19 = ChallengeResultCancelled;
            int i21 = (i19 & 118) + (i19 | 118);
            ChallengeResult = ((i21 ^ (-1)) + (i21 << 1)) % 128;
        }
        throw atd.aa.getSDKReferenceNumber.CRYPTO_FAILURE.getDeviceData();
    }
}
