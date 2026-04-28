package atd.d;

import atd.y.ChallengeResultCompleted;
import atd.y.timedout;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getAdditionalDetails {
    private static int ChallengeResult = 1;
    public static int getDeviceData;
    private static int getMessageVersion;
    public static int getSDKAppID;
    private final int AuthenticationRequestParameters;
    private final byte[] ChallengeResultCancelled;
    private final String getSDKReferenceNumber;
    private final Map<String, List<String>> getSDKTransactionID;

    public getAdditionalDetails(AuthenticationRequestParameters authenticationRequestParameters) {
        this.AuthenticationRequestParameters = authenticationRequestParameters.getSDKTransactionID;
        this.getSDKReferenceNumber = authenticationRequestParameters.getSDKReferenceNumber;
        this.getSDKTransactionID = authenticationRequestParameters.getDeviceData;
        this.ChallengeResultCancelled = authenticationRequestParameters.AuthenticationRequestParameters;
    }

    public static int getDeviceData() {
        int i11 = getSDKAppID;
        int i12 = i11 % 8025104;
        getSDKAppID = i11 + 1;
        if (i12 != 0) {
            return getDeviceData;
        }
        int iB = a0.b(210233361);
        getDeviceData = iB;
        return iB;
    }

    private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
        getAdditionalDetails getadditionaldetails = (getAdditionalDetails) objArr[0];
        int i11 = ChallengeResult;
        getMessageVersion = a0.d((i11 | 68) << 1, i11 ^ 68, 1, 128);
        Map<String, List<String>> map = getadditionaldetails.getSDKTransactionID;
        int i12 = (i11 ^ 97) + ((i11 & 97) << 1);
        getMessageVersion = i12 % 128;
        if (i12 % 2 == 0) {
            return map;
        }
        throw null;
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
        getAdditionalDetails getadditionaldetails = (getAdditionalDetails) objArr[0];
        int i11 = getMessageVersion;
        int i12 = i11 & 15;
        int i13 = -(-((i11 ^ 15) | i12));
        int i14 = ((i12 & i13) + (i13 | i12)) % 128;
        ChallengeResult = i14;
        byte[] bArr = getadditionaldetails.ChallengeResultCancelled;
        if (bArr == null) {
            int i15 = (i14 ^ 95) + ((i14 & 95) << 1);
            getMessageVersion = i15 % 128;
            if (i15 % 2 == 0) {
                return null;
            }
            throw null;
        }
        int i16 = i14 | 21;
        int i17 = i16 << 1;
        int i18 = -(i16 & (~(i14 & 21)));
        int i19 = (i17 & i18) + (i18 | i17);
        getMessageVersion = i19 % 128;
        if (i19 % 2 == 0) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        int i21 = 35 / 0;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public static /* synthetic */ Object getSDKTransactionID(int i11, int i12, int i13, int i14, Object[] objArr, int i15, int i16) {
        int i17 = ~i15;
        int i18 = ~(i17 | i16);
        int i19 = ~(i16 | i15);
        int i21 = i17 | (~i16);
        int i22 = i19 | (~(i21 | i13));
        int i23 = (~i13) | i21;
        int i24 = (748945408 * i12) + (1924136960 * i11) + ((-1666056192) * i14) + (1283506547 * i23) + ((-1283506547) * i22) + (1727954202 * i18) + ((-382549644) * i15) + (1345404558 * i16) + 1061748736;
        int iC = a0.c(i12, -1730424158, (1134938392 * i11) + i16 + i15 + i14);
        return a0.e(iC, -1605042176, (i12 * (-1338016710)) + ((i11 * (-1451741640)) + ((i14 * 1914918157) + ((i23 * 471) + ((i22 * (-471)) + ((i18 * (-942)) + ((i15 * 1914918628) + ((i16 * 1914917686) + 639827133))))))), -230752256, (912850944 * iC) + i24) != 1 ? getSDKReferenceNumber(objArr) : getSDKAppID(objArr);
    }

    public final Map<String, List<String>> AuthenticationRequestParameters() {
        int sDKAppID = timedout.AuthenticationRequestParameters.getSDKAppID();
        int sDKAppID2 = timedout.AuthenticationRequestParameters.getSDKAppID();
        return (Map) getSDKTransactionID(timedout.AuthenticationRequestParameters.getSDKAppID(), timedout.AuthenticationRequestParameters.getSDKAppID(), sDKAppID, sDKAppID2, new Object[]{this}, 952058546, -952058545);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class AuthenticationRequestParameters {
        private static int ChallengeResult = 1;
        private static int getSDKAppID;
        byte[] AuthenticationRequestParameters;
        Map<String, List<String>> getDeviceData;
        String getSDKReferenceNumber;
        int getSDKTransactionID;

        private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
            AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
            String str = (String) objArr[1];
            int i11 = ChallengeResult;
            int i12 = ((i11 ^ 5) + ((i11 & 5) << 1)) % 128;
            getSDKAppID = i12;
            authenticationRequestParameters.getSDKReferenceNumber = str;
            int i13 = (i12 ^ 111) + ((i12 & 111) << 1);
            ChallengeResult = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 88 / 0;
            }
            return authenticationRequestParameters;
        }

        public static /* synthetic */ Object getDeviceData(int i11, int i12, int i13, int i14, Object[] objArr, int i15, int i16) {
            int i17 = ~i13;
            int i18 = ~i14;
            int i19 = (~(i18 | i15)) | i17;
            int i21 = (~(i17 | (~i15) | i14)) | (~(i17 | i18 | i15));
            int i22 = (~(i15 | i14)) | (~(i13 | i14));
            int i23 = (408289280 * i12) + ((-206831616) * i11) + (393871360 * i16) + (481927660 * i22) + (i21 * 481927660) + ((-481927660) * i19) + (875799021 * i14) + (((-88056299) * i13) - 1254686720);
            int iC = a0.c(i12, 1880343047, ((-1520811122) * i11) + i13 + i14 + i16);
            int i24 = i12 * (-2012083377);
            int iE = a0.e(iC, -1027145728, i24 + (i11 * 644061726) + (i16 * (-660833671)) + (i22 * 140) + (i21 * 140) + (i19 * (-140)) + (i14 * (-660833531)) + ((i13 * (-660833811)) - 1995073173), 814809088, ((-683737088) * iC) + i23);
            return iE != 1 ? iE != 2 ? iE != 3 ? iE != 4 ? getSDKReferenceNumber(objArr) : getDeviceData(objArr) : getSDKTransactionID(objArr) : getSDKAppID(objArr) : AuthenticationRequestParameters(objArr);
        }

        private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
            byte[] bArrCopyOf;
            AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
            byte[] bArr = (byte[]) objArr[1];
            int i11 = ChallengeResult;
            int i12 = i11 & 45;
            int i13 = -(-((i11 ^ 45) | i12));
            int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
            int i15 = i14 % 128;
            getSDKAppID = i15;
            if (i14 % 2 != 0) {
                throw null;
            }
            if (bArr != null) {
                int i16 = (i11 & (-94)) | ((~i11) & 93);
                int i17 = -(-((i11 & 93) << 1));
                int i18 = (i16 & i17) + (i17 | i16);
                getSDKAppID = i18 % 128;
                if (i18 % 2 != 0) {
                    Arrays.copyOf(bArr, bArr.length);
                    throw null;
                }
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                int i19 = i15 & 97;
                ChallengeResult = a0.d(((i15 ^ 97) | i19) << 1, ~(-((~i19) & (i15 | 97))), 1, 128);
                bArrCopyOf = null;
            }
            authenticationRequestParameters.AuthenticationRequestParameters = bArrCopyOf;
            int i21 = ChallengeResult + 111;
            getSDKAppID = i21 % 128;
            if (i21 % 2 == 0) {
                return authenticationRequestParameters;
            }
            throw null;
        }

        private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
            AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
            Map<String, List<String>> map = (Map) objArr[1];
            int i11 = ChallengeResult;
            getSDKAppID = (i11 + 21) % 128;
            authenticationRequestParameters.getDeviceData = map;
            int i12 = (-2) - ((((i11 | 116) << 1) - (i11 ^ 116)) ^ (-1));
            getSDKAppID = i12 % 128;
            if (i12 % 2 == 0) {
                return authenticationRequestParameters;
            }
            throw null;
        }

        private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
            getAdditionalDetails getadditionaldetails = new getAdditionalDetails((AuthenticationRequestParameters) objArr[0]);
            int i11 = getSDKAppID;
            int i12 = i11 & 107;
            int i13 = (i11 | 107) & (~i12);
            int i14 = i12 << 1;
            int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
            ChallengeResult = i15 % 128;
            if (i15 % 2 != 0) {
                return getadditionaldetails;
            }
            throw null;
        }

        public final getAdditionalDetails getSDKTransactionID() {
            int sDKReferenceNumber = ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber();
            int sDKReferenceNumber2 = ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber();
            return (getAdditionalDetails) getDeviceData(ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber(), ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber(), 1480433641, -1480433638, new Object[]{this}, sDKReferenceNumber, sDKReferenceNumber2);
        }

        public final AuthenticationRequestParameters AuthenticationRequestParameters(Map<String, List<String>> map) {
            int sDKReferenceNumber = ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber();
            int sDKReferenceNumber2 = ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber();
            return (AuthenticationRequestParameters) getDeviceData(ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber(), ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber(), -249606708, 249606708, new Object[]{this, map}, sDKReferenceNumber, sDKReferenceNumber2);
        }

        public final AuthenticationRequestParameters getSDKAppID(String str) {
            int sDKReferenceNumber = ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber();
            int sDKReferenceNumber2 = ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber();
            return (AuthenticationRequestParameters) getDeviceData(ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber(), ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber(), -900930583, 900930584, new Object[]{this, str}, sDKReferenceNumber, sDKReferenceNumber2);
        }

        public final AuthenticationRequestParameters getSDKAppID(int i11) {
            return (AuthenticationRequestParameters) getDeviceData(ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber(), ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber(), -58865009, 58865013, new Object[]{this, Integer.valueOf(i11)}, ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber(), ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber());
        }

        private static /* synthetic */ Object getDeviceData(Object[] objArr) {
            AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
            int iIntValue = ((Number) objArr[1]).intValue();
            int i11 = getSDKAppID;
            int i12 = i11 & 117;
            int i13 = (((i11 | 117) & (~i12)) + (i12 << 1)) % 128;
            ChallengeResult = i13;
            authenticationRequestParameters.getSDKTransactionID = iIntValue;
            int i14 = i13 ^ 71;
            int i15 = ((((i13 & 71) | i14) << 1) - (~(-i14))) - 1;
            getSDKAppID = i15 % 128;
            if (i15 % 2 == 0) {
                return authenticationRequestParameters;
            }
            throw null;
        }

        public final AuthenticationRequestParameters getDeviceData(byte[] bArr) {
            int sDKReferenceNumber = ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber();
            int sDKReferenceNumber2 = ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber();
            return (AuthenticationRequestParameters) getDeviceData(ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber(), ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber(), -1918740805, 1918740807, new Object[]{this, bArr}, sDKReferenceNumber, sDKReferenceNumber2);
        }
    }

    public final byte[] getSDKReferenceNumber() {
        int sDKAppID = timedout.AuthenticationRequestParameters.getSDKAppID();
        int sDKAppID2 = timedout.AuthenticationRequestParameters.getSDKAppID();
        return (byte[]) getSDKTransactionID(timedout.AuthenticationRequestParameters.getSDKAppID(), timedout.AuthenticationRequestParameters.getSDKAppID(), sDKAppID, sDKAppID2, new Object[]{this}, 580301817, -580301817);
    }
}
