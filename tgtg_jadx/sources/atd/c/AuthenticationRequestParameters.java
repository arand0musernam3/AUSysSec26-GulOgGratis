package atd.c;

import atd.y.protocolError;
import n90.b0;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class AuthenticationRequestParameters extends BuildConfig {
    private static int ChallengeResult = 1;
    private static int ChallengeResultCancelled;
    private String AuthenticationRequestParameters;
    private String getDeviceData;
    private String getSDKAppID;
    private String getSDKReferenceNumber;
    private String getSDKTransactionID;

    public AuthenticationRequestParameters(b0 b0Var) throws atd.ac.getSDKAppID {
        super(b0Var);
        this.getSDKReferenceNumber = atd.d.getSDKEphemeralPublicKey.getSDKTransactionID(b0Var, atd.am.getSDKReferenceNumber.ERROR_CODE).getSDKAppID();
        this.getDeviceData = atd.d.getSDKEphemeralPublicKey.getSDKTransactionID(b0Var, atd.am.getSDKReferenceNumber.ERROR_COMPONENT).getSDKAppID();
        this.getSDKTransactionID = atd.d.getSDKEphemeralPublicKey.getSDKTransactionID(b0Var, atd.am.getSDKReferenceNumber.ERROR_DESCRIPTION).getSDKAppID();
        this.AuthenticationRequestParameters = atd.d.getSDKEphemeralPublicKey.getSDKTransactionID(b0Var, atd.am.getSDKReferenceNumber.ERROR_DETAIL).getSDKAppID();
        this.getSDKAppID = atd.d.getSDKEphemeralPublicKey.getSDKTransactionID(b0Var, atd.am.getSDKReferenceNumber.ERROR_MESSAGE_TYPE).getSDKAppID();
    }

    public static /* synthetic */ Object getDeviceData(int i11, int i12, int i13, int i14, Object[] objArr, int i15, int i16) {
        int i17 = ~i12;
        int i18 = i11 | i17;
        int i19 = (~(i16 | i12)) | i11;
        int i21 = ~i16;
        int i22 = (~(i12 | i16 | i11)) | (~(i17 | i21)) | (~((~i11) | i21));
        int i23 = (23068672 * i15) + ((-2101346304) * i14) + (543162368 * i13) + (1033423461 * i22) + ((-2066846922) * i19) + (i18 * 1033423461) + (1576585830 * i11) + (((-490261092) * i16) - 1772093440);
        int iC = a0.c(i15, 1307081305, (1609234610 * i14) + i16 + i11 + i13);
        int i24 = i22 * 309;
        int i25 = i13 * 273352337;
        int i26 = i14 * (-770635566);
        int i27 = i15 * (-73506199);
        int iE = a0.e(iC, -2011693056, i27 + i26 + i25 + i24 + (i19 * (-618)) + (i18 * 309) + (i11 * 273352646) + (i16 * 273352028) + 245730370, 1080557568, ((-2103967744) * iC) + i23);
        if (iE == 1) {
            int i28 = (-2) - ((ChallengeResultCancelled + 90) ^ (-1));
            ChallengeResult = i28 % 128;
            return Boolean.valueOf(i28 % 2 == 0);
        }
        if (iE != 2) {
            if (iE == 3) {
                return getDeviceData(objArr);
            }
            if (iE != 4) {
                return iE != 5 ? getSDKReferenceNumber(objArr) : getSDKAppID(objArr);
            }
            AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
            int i29 = ChallengeResult;
            int i31 = (((i29 | 113) << 1) - (i29 ^ 113)) % 128;
            ChallengeResultCancelled = i31;
            String str = authenticationRequestParameters.getSDKTransactionID;
            int i32 = (i31 & (-20)) | ((~i31) & 19);
            int i33 = -(-((i31 & 19) << 1));
            ChallengeResult = ((i32 & i33) + (i32 | i33)) % 128;
            return str;
        }
        AuthenticationRequestParameters authenticationRequestParameters2 = (AuthenticationRequestParameters) objArr[0];
        int i34 = ChallengeResult;
        int i35 = i34 & 35;
        ChallengeResultCancelled = a0.d(i35, ~(-(-((i34 ^ 35) | i35))), 1, 128);
        super.BuildConfig();
        authenticationRequestParameters2.getSDKReferenceNumber = null;
        authenticationRequestParameters2.getDeviceData = null;
        authenticationRequestParameters2.getSDKTransactionID = null;
        authenticationRequestParameters2.AuthenticationRequestParameters = null;
        authenticationRequestParameters2.getSDKAppID = null;
        int i36 = ChallengeResult;
        ChallengeResultCancelled = (((i36 | 47) << 1) - (i36 ^ 47)) % 128;
        return null;
    }

    private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
        int i11 = ChallengeResult;
        int i12 = (i11 ^ 103) + ((i11 & 103) << 1);
        ChallengeResultCancelled = i12 % 128;
        int i13 = i12 % 2;
        String str = authenticationRequestParameters.AuthenticationRequestParameters;
        if (i13 != 0) {
            int i14 = 83 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
        int i11 = ChallengeResultCancelled;
        int i12 = i11 & 69;
        int i13 = -(-((i11 ^ 69) | i12));
        int i14 = (i12 & i13) + (i12 | i13);
        ChallengeResult = i14 % 128;
        int i15 = i14 % 2;
        String str = authenticationRequestParameters.getSDKReferenceNumber;
        if (i15 == 0) {
            throw null;
        }
        int i16 = (i11 | 125) << 1;
        int i17 = -(i11 ^ 125);
        ChallengeResult = ((i16 ^ i17) + ((i17 & i16) << 1)) % 128;
        return str;
    }

    @Override // atd.c.BuildConfig
    public final boolean AuthenticationRequestParameters() {
        return ((Boolean) getDeviceData(-286641862, protocolError.getSDKTransactionID.getDeviceData(), protocolError.getSDKTransactionID.getDeviceData(), protocolError.getSDKTransactionID.getDeviceData(), new Object[]{this}, protocolError.getSDKTransactionID.getDeviceData(), 286641863)).booleanValue();
    }

    @Override // atd.c.BuildConfig
    public final void BuildConfig() {
        getDeviceData(1228850946, protocolError.getSDKTransactionID.getDeviceData(), protocolError.getSDKTransactionID.getDeviceData(), protocolError.getSDKTransactionID.getDeviceData(), new Object[]{this}, protocolError.getSDKTransactionID.getDeviceData(), -1228850944);
    }

    public final String getSDKTransactionID() {
        return (String) getDeviceData(358796799, protocolError.getSDKTransactionID.getDeviceData(), protocolError.getSDKTransactionID.getDeviceData(), protocolError.getSDKTransactionID.getDeviceData(), new Object[]{this}, protocolError.getSDKTransactionID.getDeviceData(), -358796799);
    }

    public final String getSDKReferenceNumber() {
        return (String) getDeviceData(1368297550, protocolError.getSDKTransactionID.getDeviceData(), protocolError.getSDKTransactionID.getDeviceData(), protocolError.getSDKTransactionID.getDeviceData(), new Object[]{this}, protocolError.getSDKTransactionID.getDeviceData(), -1368297545);
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) {
        b0 b0Var = (b0) objArr[1];
        atd.am.getSDKReferenceNumber getsdkreferencenumber = (atd.am.getSDKReferenceNumber) objArr[2];
        ChallengeResultCancelled = (ChallengeResult + 53) % 128;
        String sDKAppID = atd.d.getSDKEphemeralPublicKey.getMessageVersion(b0Var, getsdkreferencenumber).getSDKAppID();
        int i11 = ChallengeResultCancelled;
        int i12 = (i11 & 21) + (i11 | 21);
        ChallengeResult = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 56 / 0;
        }
        return sDKAppID;
    }

    @Override // atd.c.BuildConfig
    public final String getDeviceData(b0 b0Var, atd.am.getSDKReferenceNumber getsdkreferencenumber) throws atd.ac.getSDKAppID {
        return (String) getDeviceData(-793916023, protocolError.getSDKTransactionID.getDeviceData(), protocolError.getSDKTransactionID.getDeviceData(), protocolError.getSDKTransactionID.getDeviceData(), new Object[]{this, b0Var, getsdkreferencenumber}, protocolError.getSDKTransactionID.getDeviceData(), 793916026);
    }

    public final String getDeviceData() {
        return (String) getDeviceData(-1768130080, protocolError.getSDKTransactionID.getDeviceData(), protocolError.getSDKTransactionID.getDeviceData(), protocolError.getSDKTransactionID.getDeviceData(), new Object[]{this}, protocolError.getSDKTransactionID.getDeviceData(), 1768130084);
    }
}
