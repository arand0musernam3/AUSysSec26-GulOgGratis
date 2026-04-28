package atd.ah;

import android.os.Process;
import atd.n.ChallengeResult;
import java.util.Arrays;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getSDKAppID {
    private static int BuildConfig = 0;
    private static int ChallengeResultCancelled = 1;
    public static int getDeviceData;
    public static int getSDKReferenceNumber;
    private final byte[] AuthenticationRequestParameters;
    private final byte[] getSDKAppID;
    private final byte[] getSDKTransactionID;

    public getSDKAppID(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.AuthenticationRequestParameters = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.getSDKTransactionID = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : null;
        this.getSDKAppID = bArr3 != null ? Arrays.copyOf(bArr3, bArr3.length) : null;
    }

    public static int AuthenticationRequestParameters() {
        int i11 = getDeviceData;
        int i12 = i11 % 6243167;
        getDeviceData = i11 + 1;
        if (i12 != 0) {
            return getSDKReferenceNumber;
        }
        int iMyTid = Process.myTid();
        getSDKReferenceNumber = iMyTid;
        return iMyTid;
    }

    private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
        getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
        int i11 = BuildConfig;
        ChallengeResultCancelled = (((i11 | 25) << 1) - (i11 ^ 25)) % 128;
        byte[] bArr = getsdkappid.AuthenticationRequestParameters;
        if (bArr != null) {
            int i12 = ((i11 | 69) << 1) - (i11 ^ 69);
            ChallengeResultCancelled = i12 % 128;
            if (i12 % 2 == 0) {
                Arrays.fill(bArr, (byte) 1);
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            int i13 = BuildConfig;
            int i14 = i13 & 47;
            ChallengeResultCancelled = a0.d((i13 | 47) & (~i14), ~(i14 << 1), 1, 128);
        }
        byte[] bArr2 = getsdkappid.getSDKTransactionID;
        if (bArr2 != null) {
            ChallengeResultCancelled = (BuildConfig + 71) % 128;
            Arrays.fill(bArr2, (byte) 0);
            int i15 = BuildConfig;
            int i16 = i15 ^ 29;
            ChallengeResultCancelled = a0.d(((i15 & 29) | i16) << 1, ~(-i16), 1, 128);
        }
        byte[] bArr3 = getsdkappid.getSDKAppID;
        if (bArr3 != null) {
            int i17 = BuildConfig;
            int i18 = i17 & 105;
            ChallengeResultCancelled = a0.d(((i17 ^ 105) | i18) << 1, ~(-((i17 | 105) & (~i18))), 1, 128);
            Arrays.fill(bArr3, (byte) 0);
            int i19 = BuildConfig;
            int i21 = i19 | 87;
            ChallengeResultCancelled = a0.d(i21 << 1, ~(-((~(i19 & 87)) & i21)), 1, 128);
        }
        int i22 = BuildConfig;
        int i23 = i22 & 7;
        int i24 = -(-((i22 ^ 7) | i23));
        int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
        ChallengeResultCancelled = i25 % 128;
        if (i25 % 2 == 0) {
            int i26 = 35 / 0;
        }
        return null;
    }

    public static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr, int i11, int i12, int i13, int i14, int i15, int i16) {
        int i17 = ~i13;
        int i18 = ~i16;
        int i19 = ~(i17 | i18);
        int i21 = ~(i17 | i14);
        int i22 = i19 | i21 | (~(i18 | i14));
        int i23 = i16 | i21;
        int i24 = ~i14;
        int i25 = (~(i16 | i24 | i13)) | (~(i17 | i24 | i18)) | (~(i18 | i13 | i14));
        int i26 = (1577058304 * i11) + (494927872 * i15) + (276824064 * i12) + (935884852 * i25) + (i23 * 935884852) + ((-1871769704) * i22) + ((-659060787) * i14) + ((1212708917 * i13) - 1912602624);
        int iC = a0.c(i11, -1277752516, ((-1329026341) * i15) + i13 + i14 + i12);
        int i27 = i25 * 252;
        int i28 = i12 * 595972219;
        int i29 = i15 * (-1341978823);
        int i31 = i11 * 731850196;
        int iE = a0.e(iC, 1869086720, i31 + i29 + i28 + i27 + (i23 * 252) + (i22 * (-504)) + (i14 * 595971967) + (i13 * 595972471) + 129777640, -846725120, ((-1783103488) * iC) + i26);
        if (iE != 1) {
            return iE != 2 ? getSDKReferenceNumber(objArr) : getSDKAppID(objArr);
        }
        getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
        int i32 = ChallengeResultCancelled;
        int i33 = i32 & 115;
        BuildConfig = a0.d(i33, ~(-(-((i32 ^ 115) | i33))), 1, 128);
        byte[] bArr = getsdkappid.getSDKTransactionID;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        int i34 = BuildConfig;
        ChallengeResultCancelled = (((i34 & (-100)) | ((~i34) & 99)) + ((i34 & 99) << 1)) % 128;
        return bArrCopyOf;
    }

    public final void getDeviceData() {
        int sDKAppID = ChallengeResult.getSDKTransactionID.getSDKAppID();
        getSDKReferenceNumber(new Object[]{this}, ChallengeResult.getSDKTransactionID.getSDKAppID(), ChallengeResult.getSDKTransactionID.getSDKAppID(), -309456216, 309456218, ChallengeResult.getSDKTransactionID.getSDKAppID(), sDKAppID);
    }

    public final byte[] getSDKAppID() {
        int sDKAppID = ChallengeResult.getSDKTransactionID.getSDKAppID();
        return (byte[]) getSDKReferenceNumber(new Object[]{this}, ChallengeResult.getSDKTransactionID.getSDKAppID(), ChallengeResult.getSDKTransactionID.getSDKAppID(), -799161082, 799161082, ChallengeResult.getSDKTransactionID.getSDKAppID(), sDKAppID);
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
        getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
        int i11 = BuildConfig;
        int i12 = (i11 ^ 83) + ((i11 & 83) << 1);
        ChallengeResultCancelled = i12 % 128;
        int i13 = i12 % 2;
        byte[] bArr = getsdkappid.getSDKAppID;
        if (i13 == 0) {
            Arrays.copyOf(bArr, bArr.length);
            throw null;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        int i14 = ChallengeResultCancelled;
        BuildConfig = a0.d((i14 | 70) << 1, i14 ^ 70, 1, 128);
        return bArrCopyOf;
    }

    public final byte[] getSDKReferenceNumber() {
        int sDKAppID = ChallengeResult.getSDKTransactionID.getSDKAppID();
        return (byte[]) getSDKReferenceNumber(new Object[]{this}, ChallengeResult.getSDKTransactionID.getSDKAppID(), ChallengeResult.getSDKTransactionID.getSDKAppID(), -1853715844, 1853715845, ChallengeResult.getSDKTransactionID.getSDKAppID(), sDKAppID);
    }
}
