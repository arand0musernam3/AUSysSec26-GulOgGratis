package atd.ak;

import atd.bc.getSDKEphemeralPublicKey;
import atd.x.ChallengeResult;
import com.app.tgtg.model.local.AppConstants;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class AuthenticationRequestParameters implements com.adyen.threeds2.AuthenticationRequestParameters {
    private static int ChallengeResultCancelled = 0;
    private static int getSDKEphemeralPublicKey = 1;
    private String AuthenticationRequestParameters;
    private String getDeviceData;
    private String getMessageVersion;
    private String getSDKAppID;
    private String getSDKReferenceNumber;
    private String getSDKTransactionID;

    public AuthenticationRequestParameters(String str, String str2, String str3, String str4, String str5, String str6) throws Throwable {
        getSDKEphemeralPublicKey.getSDKAppID(str, atd.aa.getDeviceData.SDK_TRANSACTION_ID);
        getSDKEphemeralPublicKey.getSDKAppID(str2, atd.aa.getDeviceData.DEVICE_DATA);
        getSDKEphemeralPublicKey.getSDKAppID(str3, atd.aa.getDeviceData.SDK_EPHEMERAL_PUBLIC_KEY);
        getSDKEphemeralPublicKey.getSDKAppID(str4, atd.aa.getDeviceData.SDK_APP_ID);
        getSDKEphemeralPublicKey.getSDKAppID(str5, atd.aa.getDeviceData.SDK_REFERENCE_NUMBER);
        getSDKEphemeralPublicKey.getSDKAppID(str6, atd.aa.getDeviceData.MESSAGE_VERSION);
        this.getSDKAppID = str;
        this.getSDKTransactionID = str2;
        this.getDeviceData = str3;
        this.getSDKReferenceNumber = str4;
        this.AuthenticationRequestParameters = str5;
        this.getMessageVersion = str6;
    }

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
        int i11 = ChallengeResultCancelled;
        int i12 = (i11 | 43) << 1;
        int i13 = -(((~i11) & 43) | (i11 & (-44)));
        int i14 = (i12 & i13) + (i13 | i12);
        getSDKEphemeralPublicKey = i14 % 128;
        int i15 = i14 % 2;
        String str = authenticationRequestParameters.getSDKTransactionID;
        if (i15 != 0) {
            return str;
        }
        throw null;
    }

    public static /* synthetic */ Object getSDKAppID(int i11, int i12, Object[] objArr, int i13, int i14, int i15, int i16) {
        int i17 = ~i15;
        int i18 = ~i11;
        int i19 = ~i12;
        int i21 = (~(i18 | i19)) | i17;
        int i22 = ~(i12 | i11);
        int i23 = i21 | i22;
        int i24 = i22 * (-1165201990);
        int i25 = (~(i17 | i11)) | (~(i17 | i19)) | (~(i19 | i11));
        int i26 = 1885863936 * i14;
        int i27 = ((-1249902592) * i16) + ((-1100480512) * i13) + i26 + ((-1165201990) * i25) + i24 + (1165201990 * i23) + ((-1243901369) * i15) + (720661947 * i11) + 1572077568;
        int iC = a0.c(i16, 266941808, (669352129 * i13) + i11 + i15 + i14);
        int i28 = i23 * (-582);
        int i29 = i22 * 582;
        int i31 = i25 * 582;
        int i32 = i14 * 1617401855;
        int i33 = i13 * 1244927807;
        int i34 = i16 * (-404665712);
        switch (a0.e(iC, -45350912, i34 + i33 + i32 + i31 + i29 + i28 + (i15 * 1617401273) + (i11 * 1617402437) + 56426783, 1565261824, ((-491520000) * iC) + i27)) {
            case 1:
                return getSDKReferenceNumber(objArr);
            case 2:
                return getSDKTransactionID(objArr);
            case 3:
                AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
                int i35 = ChallengeResultCancelled;
                int i36 = i35 ^ AppConstants.RESULT_CODE_ORDER_CANCELLED;
                int i37 = i35 & AppConstants.RESULT_CODE_ORDER_CANCELLED;
                int i38 = (i36 | i37) << 1;
                int i39 = -((i35 | AppConstants.RESULT_CODE_ORDER_CANCELLED) & (~i37));
                int i41 = (((i38 | i39) << 1) - (i39 ^ i38)) % 128;
                getSDKEphemeralPublicKey = i41;
                String str = authenticationRequestParameters.getDeviceData;
                ChallengeResultCancelled = a0.d((i41 | 6) << 1, i41 ^ 6, 1, 128);
                return str;
            case 4:
                AuthenticationRequestParameters authenticationRequestParameters2 = (AuthenticationRequestParameters) objArr[0];
                int i42 = ChallengeResultCancelled;
                int i43 = (i42 & (-30)) | ((~i42) & 29);
                int i44 = -(-((i42 & 29) << 1));
                int i45 = ((i43 ^ i44) + ((i44 & i43) << 1)) % 128;
                getSDKEphemeralPublicKey = i45;
                String str2 = authenticationRequestParameters2.getSDKAppID;
                int i46 = i45 & 15;
                ChallengeResultCancelled = (((~i46) & (i45 | 15)) + (i46 << 1)) % 128;
                return str2;
            case 5:
                AuthenticationRequestParameters authenticationRequestParameters3 = (AuthenticationRequestParameters) objArr[0];
                int i47 = (ChallengeResultCancelled + 55) % 128;
                getSDKEphemeralPublicKey = i47;
                String str3 = authenticationRequestParameters3.getMessageVersion;
                ChallengeResultCancelled = (i47 + 87) % 128;
                return str3;
            case 6:
                AuthenticationRequestParameters authenticationRequestParameters4 = (AuthenticationRequestParameters) objArr[0];
                int i48 = ChallengeResultCancelled;
                int i49 = i48 & 45;
                getSDKEphemeralPublicKey = a0.d((~i49) & (i48 | 45), ~(i49 << 1), 1, 128);
                String str4 = authenticationRequestParameters4.getSDKReferenceNumber;
                int i51 = i48 & 65;
                getSDKEphemeralPublicKey = a0.d(((i48 ^ 65) | i51) << 1, ~(-((i48 | 65) & (~i51))), 1, 128);
                return str4;
            default:
                return AuthenticationRequestParameters(objArr);
        }
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
        System.identityHashCode(authenticationRequestParameters);
        System.identityHashCode(authenticationRequestParameters);
        String str = authenticationRequestParameters.AuthenticationRequestParameters;
        int i11 = ChallengeResultCancelled;
        int i12 = (i11 & (-116)) | ((~i11) & 115);
        int i13 = (i11 & 115) << 1;
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        getSDKEphemeralPublicKey = i14 % 128;
        if (i14 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
        int i11 = ChallengeResultCancelled;
        int i12 = (-2) - ((((i11 | 22) << 1) - (i11 ^ 22)) ^ (-1));
        getSDKEphemeralPublicKey = i12 % 128;
        if (i12 % 2 == 0) {
            authenticationRequestParameters.getSDKAppID = null;
            authenticationRequestParameters.getSDKTransactionID = null;
            authenticationRequestParameters.getDeviceData = null;
            authenticationRequestParameters.getSDKReferenceNumber = null;
            authenticationRequestParameters.AuthenticationRequestParameters = null;
            authenticationRequestParameters.getMessageVersion = null;
            int i13 = 35 / 0;
        } else {
            authenticationRequestParameters.getSDKAppID = null;
            authenticationRequestParameters.getSDKTransactionID = null;
            authenticationRequestParameters.getDeviceData = null;
            authenticationRequestParameters.getSDKReferenceNumber = null;
            authenticationRequestParameters.AuthenticationRequestParameters = null;
            authenticationRequestParameters.getMessageVersion = null;
        }
        int i14 = ((i11 ^ 63) | (i11 & 63)) << 1;
        int i15 = -((i11 & (-64)) | ((~i11) & 63));
        getSDKEphemeralPublicKey = ((i14 ^ i15) + ((i14 & i15) << 1)) % 128;
        return null;
    }

    @Override // com.adyen.threeds2.AuthenticationRequestParameters
    public final String getDeviceData() {
        return (String) getSDKAppID(1090422577, ChallengeResult.AuthenticationRequestParameters.AuthenticationRequestParameters(), new Object[]{this}, ChallengeResult.AuthenticationRequestParameters.AuthenticationRequestParameters(), ChallengeResult.AuthenticationRequestParameters.AuthenticationRequestParameters(), -1090422577, ChallengeResult.AuthenticationRequestParameters.AuthenticationRequestParameters());
    }

    @Override // com.adyen.threeds2.AuthenticationRequestParameters
    public final String getMessageVersion() {
        return (String) getSDKAppID(688859004, ChallengeResult.AuthenticationRequestParameters.AuthenticationRequestParameters(), new Object[]{this}, ChallengeResult.AuthenticationRequestParameters.AuthenticationRequestParameters(), ChallengeResult.AuthenticationRequestParameters.AuthenticationRequestParameters(), -688858999, ChallengeResult.AuthenticationRequestParameters.AuthenticationRequestParameters());
    }

    @Override // com.adyen.threeds2.AuthenticationRequestParameters
    public final String getSDKEphemeralPublicKey() {
        return (String) getSDKAppID(1775408355, ChallengeResult.AuthenticationRequestParameters.AuthenticationRequestParameters(), new Object[]{this}, ChallengeResult.AuthenticationRequestParameters.AuthenticationRequestParameters(), ChallengeResult.AuthenticationRequestParameters.AuthenticationRequestParameters(), -1775408352, ChallengeResult.AuthenticationRequestParameters.AuthenticationRequestParameters());
    }

    public final void AuthenticationRequestParameters() {
        getSDKAppID(882022779, ChallengeResult.AuthenticationRequestParameters.AuthenticationRequestParameters(), new Object[]{this}, ChallengeResult.AuthenticationRequestParameters.AuthenticationRequestParameters(), ChallengeResult.AuthenticationRequestParameters.AuthenticationRequestParameters(), -882022777, ChallengeResult.AuthenticationRequestParameters.AuthenticationRequestParameters());
    }

    @Override // com.adyen.threeds2.AuthenticationRequestParameters
    public final String getSDKReferenceNumber() {
        return (String) getSDKAppID(437904200, ChallengeResult.AuthenticationRequestParameters.AuthenticationRequestParameters(), new Object[]{this}, ChallengeResult.AuthenticationRequestParameters.AuthenticationRequestParameters(), ChallengeResult.AuthenticationRequestParameters.AuthenticationRequestParameters(), -437904199, ChallengeResult.AuthenticationRequestParameters.AuthenticationRequestParameters());
    }

    @Override // com.adyen.threeds2.AuthenticationRequestParameters
    public final String getSDKTransactionID() {
        return (String) getSDKAppID(-318274702, ChallengeResult.AuthenticationRequestParameters.AuthenticationRequestParameters(), new Object[]{this}, ChallengeResult.AuthenticationRequestParameters.AuthenticationRequestParameters(), ChallengeResult.AuthenticationRequestParameters.AuthenticationRequestParameters(), 318274706, ChallengeResult.AuthenticationRequestParameters.AuthenticationRequestParameters());
    }

    @Override // com.adyen.threeds2.AuthenticationRequestParameters
    public final String getSDKAppID() {
        return (String) getSDKAppID(1501881301, ChallengeResult.AuthenticationRequestParameters.AuthenticationRequestParameters(), new Object[]{this}, ChallengeResult.AuthenticationRequestParameters.AuthenticationRequestParameters(), ChallengeResult.AuthenticationRequestParameters.AuthenticationRequestParameters(), -1501881295, ChallengeResult.AuthenticationRequestParameters.AuthenticationRequestParameters());
    }
}
