package atd.ae;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getSDKEphemeralPublicKey {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int BuildConfig;
    private static char ChallengeResult;
    private static char ChallengeResultCancelled;
    private static int ChallengeResultCompleted;
    private static int ChallengeResultError;
    private static int ChallengeResultTimeout;
    private static char getMessageVersion;
    private static char getSDKEphemeralPublicKey;
    private ChallengeResult AuthenticationRequestParameters;
    private ChallengeResultCancelled getDeviceData;
    private getDeviceData getSDKAppID;
    private AuthenticationRequestParameters getSDKReferenceNumber;
    private getSDKAppID getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, short r7, short r8) {
        /*
            int r6 = r6 * 4
            int r6 = 3 - r6
            int r8 = r8 * 3
            int r8 = r8 + 66
            int r7 = r7 * 2
            int r0 = r7 + 1
            byte[] r1 = atd.ae.getSDKEphemeralPublicKey.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r1
            r4 = r2
            r1 = r8
            r8 = r6
            goto L2f
        L18:
            r3 = r2
        L19:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L28:
            r3 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r1
            r1 = r5
        L2f:
            int r6 = -r6
            int r6 = r6 + r1
            r1 = r8
            r8 = r6
            r6 = r1
            r1 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ae.getSDKEphemeralPublicKey.$$c(short, short, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeResultCompleted = 0;
        ChallengeResultError = 1;
        BuildConfig = 0;
        ChallengeResultTimeout = 1;
        ChallengeResultCancelled();
        ExpandableListView.getPackedPositionForGroup(0);
        ChallengeResultError = (ChallengeResultCompleted + 81) % 128;
    }

    public getSDKEphemeralPublicKey(ChallengeResultCancelled challengeResultCancelled, AuthenticationRequestParameters authenticationRequestParameters, ChallengeResult challengeResult, getSDKAppID getsdkappid, getDeviceData getdevicedata) {
        this.getDeviceData = challengeResultCancelled;
        this.getSDKReferenceNumber = authenticationRequestParameters;
        this.AuthenticationRequestParameters = challengeResult;
        this.getSDKTransactionID = getsdkappid;
        this.getSDKAppID = getdevicedata;
    }

    public static void ChallengeResultCancelled() {
        getMessageVersion = (char) 48078;
        getSDKEphemeralPublicKey = (char) 6907;
        ChallengeResultCancelled = (char) 63601;
        ChallengeResult = (char) 64217;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(java.lang.String r31, int r32, java.lang.Object[] r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ae.getSDKEphemeralPublicKey.a(java.lang.String, int, java.lang.Object[]):void");
    }

    public static getSDKEphemeralPublicKey getSDKAppID(String str) throws Throwable {
        Object[] objArr = new Object[1];
        a("\ufbd2涨", 1 - MotionEvent.axisFromString(""), objArr);
        String[] strArrSplit = str.split(((String) objArr[0]).intern());
        if (strArrSplit.length != 5) {
            BuildConfig = (ChallengeResultTimeout + 21) % 128;
            throw atd.aa.getSDKReferenceNumber.CRYPTO_FAILURE.getDeviceData();
        }
        getSDKEphemeralPublicKey getsdkephemeralpublickey = new getSDKEphemeralPublicKey(new ChallengeResultCancelled(strArrSplit[0]), new AuthenticationRequestParameters(strArrSplit[1]), new ChallengeResult(strArrSplit[2]), new getSDKAppID(strArrSplit[3]), new getDeviceData(strArrSplit[4]));
        int i11 = ChallengeResultTimeout + 13;
        BuildConfig = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 87 / 0;
        }
        return getsdkephemeralpublickey;
    }

    public static void init$0() {
        $$a = new byte[]{64, 105, 71, -25};
        $$b = 225;
    }

    public final ChallengeResultCancelled AuthenticationRequestParameters() {
        int i11 = BuildConfig;
        ChallengeResultCancelled challengeResultCancelled = this.getDeviceData;
        int i12 = i11 + 111;
        ChallengeResultTimeout = i12 % 128;
        if (i12 % 2 != 0) {
            return challengeResultCancelled;
        }
        throw null;
    }

    public final ChallengeResult getDeviceData() {
        int i11 = (ChallengeResultTimeout + 69) % 128;
        BuildConfig = i11;
        ChallengeResult challengeResult = this.AuthenticationRequestParameters;
        ChallengeResultTimeout = (i11 + 33) % 128;
        return challengeResult;
    }

    public final getDeviceData getSDKEphemeralPublicKey() {
        int i11 = BuildConfig + 49;
        int i12 = i11 % 128;
        ChallengeResultTimeout = i12;
        int i13 = i11 % 2;
        getDeviceData getdevicedata = this.getSDKAppID;
        if (i13 == 0) {
            int i14 = 51 / 0;
        }
        int i15 = i12 + 75;
        BuildConfig = i15 % 128;
        if (i15 % 2 == 0) {
            return getdevicedata;
        }
        throw null;
    }

    public final String getSDKReferenceNumber() throws Throwable {
        BuildConfig = (ChallengeResultTimeout + 55) % 128;
        Locale locale = Locale.US;
        Object[] objArr = new Object[1];
        a("덍꘣慗脖\ud7a4㝀덍꘣慗脖\ud7a4㝀덍꘣", 14 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
        String str = String.format(locale, ((String) objArr[0]).intern(), this.getDeviceData.getSDKAppID(), this.getSDKReferenceNumber.getSDKAppID(), this.AuthenticationRequestParameters.getSDKAppID(), this.getSDKTransactionID.getSDKAppID(), this.getSDKAppID.getSDKAppID());
        BuildConfig = (ChallengeResultTimeout + 7) % 128;
        return str;
    }

    public final getSDKAppID getSDKTransactionID() {
        int i11 = BuildConfig + 69;
        int i12 = i11 % 128;
        ChallengeResultTimeout = i12;
        int i13 = i11 % 2;
        getSDKAppID getsdkappid = this.getSDKTransactionID;
        if (i13 == 0) {
            throw null;
        }
        BuildConfig = (i12 + 37) % 128;
        return getsdkappid;
    }

    public final void getSDKAppID() {
        int i11 = ChallengeResultTimeout + 101;
        BuildConfig = i11 % 128;
        int i12 = i11 % 2;
        ChallengeResultCancelled challengeResultCancelled = this.getDeviceData;
        if (i12 == 0) {
            if (challengeResultCancelled != null) {
                challengeResultCancelled.getSDKReferenceNumber();
                this.getDeviceData = null;
                ChallengeResultTimeout = (BuildConfig + 69) % 128;
            }
            AuthenticationRequestParameters authenticationRequestParameters = this.getSDKReferenceNumber;
            if (authenticationRequestParameters != null) {
                authenticationRequestParameters.getSDKReferenceNumber();
                this.getSDKReferenceNumber = null;
                ChallengeResultTimeout = (BuildConfig + 83) % 128;
            }
            ChallengeResult challengeResult = this.AuthenticationRequestParameters;
            if (challengeResult != null) {
                challengeResult.getSDKReferenceNumber();
                this.AuthenticationRequestParameters = null;
            }
            getSDKAppID getsdkappid = this.getSDKTransactionID;
            if (getsdkappid != null) {
                BuildConfig = (ChallengeResultTimeout + 13) % 128;
                getsdkappid.getSDKReferenceNumber();
                this.getSDKTransactionID = null;
            }
            getDeviceData getdevicedata = this.getSDKAppID;
            if (getdevicedata != null) {
                int i13 = ChallengeResultTimeout + 111;
                BuildConfig = i13 % 128;
                if (i13 % 2 == 0) {
                    getdevicedata.getSDKReferenceNumber();
                    this.getSDKAppID = null;
                    return;
                } else {
                    getdevicedata.getSDKReferenceNumber();
                    this.getSDKAppID = null;
                    throw null;
                }
            }
            return;
        }
        throw null;
    }
}
