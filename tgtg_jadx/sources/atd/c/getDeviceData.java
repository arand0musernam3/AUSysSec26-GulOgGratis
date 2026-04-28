package atd.c;

import atd.k.ChallengeResultError;
import n90.b0;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getDeviceData extends BuildConfig {
    private static int AuthenticationRequestParameters = 0;
    private static int getMessageVersion = 1;
    private int getDeviceData;
    private atd.h.getDeviceData getSDKAppID;
    private atd.h.getMessageVersion getSDKReferenceNumber;
    private getSDKTransactionID getSDKTransactionID;

    public getDeviceData(b0 b0Var) throws Throwable {
        String sDKAppID;
        super(b0Var);
        this.getDeviceData = atd.d.getSDKEphemeralPublicKey.getDeviceData(b0Var, atd.am.getSDKReferenceNumber.ACS_COUNTER_A_TO_S).getSDKAppID().intValue();
        atd.am.getSDKReferenceNumber getsdkreferencenumber = atd.am.getSDKReferenceNumber.CHALLENGE_COMPLETION_INDICATOR;
        atd.h.getDeviceData sDKReferenceNumber = atd.h.getDeviceData.getSDKReferenceNumber(atd.d.getSDKEphemeralPublicKey.getSDKTransactionID(b0Var, getsdkreferencenumber).getSDKAppID(), getsdkreferencenumber);
        this.getSDKAppID = sDKReferenceNumber;
        if (sDKReferenceNumber.getSDKTransactionID()) {
            Object[] objArr = {b0Var, atd.am.getSDKReferenceNumber.TRANSACTION_STATUS};
            int sDKAppID2 = atd.a.getSDKReferenceNumber.getSDKAppID();
            sDKAppID = (String) ((atd.am.getSDKTransactionID) atd.d.getSDKEphemeralPublicKey.getSDKAppID(atd.a.getSDKReferenceNumber.getSDKAppID(), atd.a.getSDKReferenceNumber.getSDKAppID(), objArr, atd.a.getSDKReferenceNumber.getSDKAppID(), sDKAppID2, 1505785998, -1505785998)).getSDKAppID();
        } else {
            sDKAppID = atd.d.getSDKEphemeralPublicKey.getSDKTransactionID(b0Var, atd.am.getSDKReferenceNumber.TRANSACTION_STATUS).getSDKAppID();
        }
        this.getSDKReferenceNumber = atd.h.getMessageVersion.getSDKReferenceNumber(sDKAppID);
        this.getSDKTransactionID = this.getSDKAppID.getSDKTransactionID() ? getSDKTransactionID.getSDKAppID(b0Var) : null;
    }

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
        getDeviceData getdevicedata = (getDeviceData) objArr[0];
        int i11 = getMessageVersion;
        int i12 = i11 & 107;
        int i13 = (((i11 ^ 107) | i12) << 1) - ((i11 | 107) & (~i12));
        int i14 = i13 % 128;
        AuthenticationRequestParameters = i14;
        int i15 = i13 % 2;
        int i16 = getdevicedata.getDeviceData;
        if (i15 != 0) {
            throw null;
        }
        int i17 = (i14 | 39) << 1;
        int i18 = -(((~i14) & 39) | (i14 & (-40)));
        int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
        getMessageVersion = i19 % 128;
        if (i19 % 2 != 0) {
            return Integer.valueOf(i16);
        }
        throw null;
    }

    public static /* synthetic */ Object getDeviceData(int i11, int i12, int i13, int i14, int i15, Object[] objArr, int i16) {
        int i17 = ~i15;
        int i18 = ~i16;
        int i19 = (~(i17 | i18)) | (~(i17 | i11)) | (~(i18 | i11));
        int i21 = (1134570258 * i19) + (61854959 * i15) + ((-1963971821) * i11) + 932184064;
        int i22 = ~i11;
        int i23 = (~(i22 | i15)) | (~(i18 | i15));
        int i24 = ~(i18 | i17 | i22);
        int i25 = 1196425216 * i12;
        int i26 = 610271232 * i13;
        int i27 = (922746880 * i14) + i26 + i25 + ((-1134570258) * i24) + (i23 * (-1134570258)) + i21;
        int iC = a0.c(i14, 2078889904, ((-2109949842) * i13) + i11 + i15 + i12);
        int i28 = i19 * (-518);
        int i29 = i23 * 518;
        int i31 = i24 * 518;
        int i32 = i12 * (-573803307);
        int i33 = i13 * (-843101306);
        int i34 = i14 * (-1524517520);
        switch (a0.e(iC, 458489856, i34 + i33 + i32 + i31 + i29 + i28 + (i15 * (-573802789)) + (i11 * (-573803825)) + 196542130, 64749568, (671350784 * iC) + i27)) {
            case 1:
                return getSDKAppID(objArr);
            case 2:
                return AuthenticationRequestParameters(objArr);
            case 3:
                getDeviceData getdevicedata = (getDeviceData) objArr[0];
                AuthenticationRequestParameters = ((-2) - ((getMessageVersion + 36) ^ (-1))) % 128;
                String sDKAppID = getdevicedata.getSDKReferenceNumber.getSDKAppID();
                int i35 = AuthenticationRequestParameters;
                int i36 = i35 & 75;
                getMessageVersion = a0.d(i36, ~((i35 ^ 75) | i36), 1, 128);
                return sDKAppID;
            case 4:
                int i37 = getMessageVersion;
                int i38 = i37 & 9;
                int i39 = -(-((i37 ^ 9) | i38));
                AuthenticationRequestParameters = (((i38 | i39) << 1) - (i39 ^ i38)) % 128;
                return true;
            case 5:
                return getSDKReferenceNumber(objArr);
            case 6:
                return getSDKTransactionID(objArr);
            default:
                return getDeviceData(objArr);
        }
    }

    private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
        getDeviceData getdevicedata = (getDeviceData) objArr[0];
        int i11 = getMessageVersion;
        int i12 = i11 ^ 27;
        int i13 = (i11 & 27) << 1;
        AuthenticationRequestParameters = (((i12 | i13) << 1) - (i13 ^ i12)) % 128;
        super.BuildConfig();
        getdevicedata.getDeviceData = 0;
        getdevicedata.getSDKAppID = null;
        getdevicedata.getSDKReferenceNumber = null;
        getSDKTransactionID getsdktransactionid = getdevicedata.getSDKTransactionID;
        if (getsdktransactionid != null) {
            int i14 = getMessageVersion;
            int i15 = (i14 & 47) + (i14 | 47);
            AuthenticationRequestParameters = i15 % 128;
            if (i15 % 2 != 0) {
                getsdktransactionid.getDeviceData();
                getdevicedata.getSDKTransactionID = null;
                throw null;
            }
            getsdktransactionid.getDeviceData();
            getdevicedata.getSDKTransactionID = null;
            int i16 = AuthenticationRequestParameters;
            getMessageVersion = (((i16 | 117) << 1) - (i16 ^ 117)) % 128;
        }
        int i17 = getMessageVersion;
        AuthenticationRequestParameters = (((i17 & 6) + (i17 | 6)) - 1) % 128;
        return null;
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
        getDeviceData getdevicedata = (getDeviceData) objArr[0];
        int i11 = AuthenticationRequestParameters;
        int i12 = i11 & 87;
        int i13 = ((i11 ^ 87) | i12) << 1;
        int i14 = -((~i12) & (i11 | 87));
        int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
        getMessageVersion = i15 % 128;
        int i16 = i15 % 2;
        getSDKTransactionID getsdktransactionid = getdevicedata.getSDKTransactionID;
        if (i16 == 0) {
            throw null;
        }
        int i17 = ((i11 & (-96)) | ((~i11) & 95)) + ((i11 & 95) << 1);
        getMessageVersion = i17 % 128;
        if (i17 % 2 != 0) {
            return getsdktransactionid;
        }
        throw null;
    }

    private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
        b0 b0Var = (b0) objArr[1];
        atd.am.getSDKReferenceNumber getsdkreferencenumber = (atd.am.getSDKReferenceNumber) objArr[2];
        int i11 = AuthenticationRequestParameters;
        int i12 = i11 & 119;
        int i13 = ((i11 ^ 119) | i12) << 1;
        int i14 = -((i11 | 119) & (~i12));
        getMessageVersion = (((i13 | i14) << 1) - (i14 ^ i13)) % 128;
        String sDKAppID = atd.d.getSDKEphemeralPublicKey.ChallengeResultCancelled(b0Var, getsdkreferencenumber).getSDKAppID();
        int i15 = getMessageVersion + 99;
        AuthenticationRequestParameters = i15 % 128;
        if (i15 % 2 == 0) {
            return sDKAppID;
        }
        throw null;
    }

    @Override // atd.c.BuildConfig
    public final void BuildConfig() {
        int sDKReferenceNumber = ChallengeResultError.getDeviceData.getSDKReferenceNumber();
        getDeviceData(-1398401487, ChallengeResultError.getDeviceData.getSDKReferenceNumber(), ChallengeResultError.getDeviceData.getSDKReferenceNumber(), ChallengeResultError.getDeviceData.getSDKReferenceNumber(), 1398401488, new Object[]{this}, sDKReferenceNumber);
    }

    public final boolean getSDKReferenceNumber() {
        int sDKReferenceNumber = ChallengeResultError.getDeviceData.getSDKReferenceNumber();
        return ((Boolean) getDeviceData(-937670488, ChallengeResultError.getDeviceData.getSDKReferenceNumber(), ChallengeResultError.getDeviceData.getSDKReferenceNumber(), ChallengeResultError.getDeviceData.getSDKReferenceNumber(), 937670488, new Object[]{this}, sDKReferenceNumber)).booleanValue();
    }

    public final int getSDKTransactionID() {
        int sDKReferenceNumber = ChallengeResultError.getDeviceData.getSDKReferenceNumber();
        return ((Integer) getDeviceData(-1521046505, ChallengeResultError.getDeviceData.getSDKReferenceNumber(), ChallengeResultError.getDeviceData.getSDKReferenceNumber(), ChallengeResultError.getDeviceData.getSDKReferenceNumber(), 1521046507, new Object[]{this}, sDKReferenceNumber)).intValue();
    }

    @Override // atd.c.BuildConfig
    public final boolean AuthenticationRequestParameters() {
        int sDKReferenceNumber = ChallengeResultError.getDeviceData.getSDKReferenceNumber();
        return ((Boolean) getDeviceData(1797614372, ChallengeResultError.getDeviceData.getSDKReferenceNumber(), ChallengeResultError.getDeviceData.getSDKReferenceNumber(), ChallengeResultError.getDeviceData.getSDKReferenceNumber(), -1797614368, new Object[]{this}, sDKReferenceNumber)).booleanValue();
    }

    public final String getSDKAppID() {
        int sDKReferenceNumber = ChallengeResultError.getDeviceData.getSDKReferenceNumber();
        return (String) getDeviceData(-1974468743, ChallengeResultError.getDeviceData.getSDKReferenceNumber(), ChallengeResultError.getDeviceData.getSDKReferenceNumber(), ChallengeResultError.getDeviceData.getSDKReferenceNumber(), 1974468746, new Object[]{this}, sDKReferenceNumber);
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) throws Throwable {
        getDeviceData getdevicedata = (getDeviceData) objArr[0];
        int i11 = AuthenticationRequestParameters;
        int i12 = ((i11 ^ 7) | (i11 & 7)) << 1;
        int i13 = -(((~i11) & 7) | (i11 & (-8)));
        getMessageVersion = (((i12 | i13) << 1) - (i13 ^ i12)) % 128;
        boolean sDKAppID = getdevicedata.getSDKAppID.getSDKAppID();
        int i14 = AuthenticationRequestParameters;
        int i15 = i14 & 93;
        int i16 = -(-(i14 | 93));
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        getMessageVersion = i17 % 128;
        if (i17 % 2 != 0) {
            return Boolean.valueOf(sDKAppID);
        }
        throw null;
    }

    @Override // atd.c.BuildConfig
    public final String getDeviceData(b0 b0Var, atd.am.getSDKReferenceNumber getsdkreferencenumber) throws atd.ac.getSDKAppID {
        int sDKReferenceNumber = ChallengeResultError.getDeviceData.getSDKReferenceNumber();
        return (String) getDeviceData(-473234327, ChallengeResultError.getDeviceData.getSDKReferenceNumber(), ChallengeResultError.getDeviceData.getSDKReferenceNumber(), ChallengeResultError.getDeviceData.getSDKReferenceNumber(), 473234333, new Object[]{this, b0Var, getsdkreferencenumber}, sDKReferenceNumber);
    }

    public final getSDKTransactionID getDeviceData() {
        int sDKReferenceNumber = ChallengeResultError.getDeviceData.getSDKReferenceNumber();
        return (getSDKTransactionID) getDeviceData(457390264, ChallengeResultError.getDeviceData.getSDKReferenceNumber(), ChallengeResultError.getDeviceData.getSDKReferenceNumber(), ChallengeResultError.getDeviceData.getSDKReferenceNumber(), -457390259, new Object[]{this}, sDKReferenceNumber);
    }
}
