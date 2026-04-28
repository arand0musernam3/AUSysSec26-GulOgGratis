package atd.a;

import android.os.SystemClock;
import atd.c.BuildConfig;
import atd.c.ChallengeResultCancelled;
import atd.d.AuthenticationRequestParameters;
import atd.x.completed;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getSDKReferenceNumber {
    public static int AuthenticationRequestParameters = 0;
    private static int BuildConfig = 0;
    private static int ChallengeResultCancelled = 1;
    public static int getDeviceData;
    private final ExecutorService getSDKAppID = Executors.newFixedThreadPool(3);
    private final atd.d.getSDKTransactionID<BuildConfig> getSDKReferenceNumber;
    private getSDKTransactionID getSDKTransactionID;

    public getSDKReferenceNumber(String str, Object obj, atd.d.getSDKTransactionID<BuildConfig> getsdktransactionid) {
        this.getSDKTransactionID = new getSDKTransactionID(str, obj);
        this.getSDKReferenceNumber = getsdktransactionid;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object getDeviceData(java.lang.Object[] r5) {
        /*
            r0 = 0
            r5 = r5[r0]
            atd.a.getSDKReferenceNumber r5 = (atd.a.getSDKReferenceNumber) r5
            int r1 = atd.a.getSDKReferenceNumber.ChallengeResultCancelled
            r2 = r1 ^ 45
            r3 = r1 & 45
            r2 = r2 | r3
            int r2 = r2 << 1
            r3 = r1 & (-46)
            int r1 = ~r1
            r4 = 45
            r1 = r1 & r4
            r1 = r1 | r3
            int r1 = -r1
            r3 = r2 ^ r1
            r1 = r1 & r2
            int r1 = r1 << 1
            int r3 = r3 + r1
            int r1 = r3 % 128
            atd.a.getSDKReferenceNumber.BuildConfig = r1
            int r3 = r3 % 2
            r2 = 0
            if (r3 == 0) goto L2d
            atd.a.getSDKTransactionID r3 = r5.getSDKTransactionID
            r4 = 94
            int r4 = r4 / r0
            if (r3 == 0) goto L51
            goto L31
        L2d:
            atd.a.getSDKTransactionID r3 = r5.getSDKTransactionID
            if (r3 == 0) goto L51
        L31:
            r3 = r1 & 111(0x6f, float:1.56E-43)
            r1 = r1 ^ 111(0x6f, float:1.56E-43)
            r1 = r1 | r3
            int r1 = -r1
            int r1 = -r1
            r4 = r3 ^ r1
            r1 = r1 & r3
            int r1 = r1 << 1
            int r4 = r4 + r1
            int r4 = r4 % 128
            atd.a.getSDKReferenceNumber.ChallengeResultCancelled = r4
            atd.a.getSDKTransactionID r1 = r5.getSDKTransactionID
            r1.getSDKTransactionID()
            r5.getSDKTransactionID = r2
            int r5 = atd.a.getSDKReferenceNumber.ChallengeResultCancelled
            int r5 = r5 + 93
            int r5 = r5 % 128
            atd.a.getSDKReferenceNumber.BuildConfig = r5
        L51:
            int r5 = atd.a.getSDKReferenceNumber.BuildConfig
            r1 = r5 ^ 1
            r5 = r5 & 1
            int r5 = r5 << 1
            int r5 = -r5
            int r5 = -r5
            int r5 = ~r5
            int r1 = r1 - r5
            int r1 = r1 + (-1)
            int r5 = r1 % 128
            atd.a.getSDKReferenceNumber.ChallengeResultCancelled = r5
            int r1 = r1 % 2
            if (r1 != 0) goto L6a
            r5 = 50
            int r5 = r5 / r0
        L6a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.a.getSDKReferenceNumber.getDeviceData(java.lang.Object[]):java.lang.Object");
    }

    public static int getSDKAppID() {
        int i11 = AuthenticationRequestParameters;
        int i12 = i11 % 7110181;
        AuthenticationRequestParameters = i11 + 1;
        if (i12 != 0) {
            return getDeviceData;
        }
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        getDeviceData = iUptimeMillis;
        return iUptimeMillis;
    }

    public static /* synthetic */ Object getSDKReferenceNumber(int i11, int i12, int i13, int i14, int i15, int i16, Object[] objArr) {
        int i17 = ~(i15 | i11);
        int i18 = ~(i11 | i13);
        int i19 = i17 | i18;
        int i21 = ~i15;
        int i22 = ~i11;
        int i23 = (~(i21 | i13)) | (~(i21 | i22)) | (~(i22 | i13));
        int i24 = ~i13;
        int i25 = i23 | (~(i24 | i15 | i11));
        int i26 = (~(i24 | i22)) | i15 | i18;
        int i27 = 1274019840 * i12;
        int i28 = ((-325058560) * i16) + ((-1660944384) * i14) + i27 + ((-2001489518) * i26) + (i25 * (-2001489518)) + (2001489518 * i19) + ((-1019457937) * i11) + ((i15 * (-1019457937)) - 559939584);
        int iC = a0.c(i16, 1167700406, (1962400304 * i14) + i15 + i11 + i12);
        if (a0.e(iC, 1407582208, (i16 * (-873382486)) + (i14 * (-1621399344)) + (i12 * (-1629561329)) + (i26 * 910) + (i25 * 910) + (i19 * (-910)) + (i11 * (-1629562239)) + ((i15 * (-1629562239)) - 1134582380), -1895432192, (867827712 * iC) + i28) == 1) {
            return getDeviceData(objArr);
        }
        getSDKReferenceNumber getsdkreferencenumber = (getSDKReferenceNumber) objArr[0];
        getsdkreferencenumber.getSDKAppID.submit(new AuthenticationRequestParameters(getsdkreferencenumber.getSDKReferenceNumber, getsdkreferencenumber.getSDKTransactionID.getSDKAppID((ChallengeResultCancelled) objArr[1])));
        int i29 = ChallengeResultCancelled;
        int i31 = i29 & 81;
        int i32 = (i29 ^ 81) | i31;
        BuildConfig = (((i31 | i32) << 1) - (i32 ^ i31)) % 128;
        return null;
    }

    public final void getSDKTransactionID(ChallengeResultCancelled challengeResultCancelled) {
        int iAuthenticationRequestParameters = completed.getSDKTransactionID.AuthenticationRequestParameters();
        getSDKReferenceNumber(272745556, completed.getSDKTransactionID.AuthenticationRequestParameters(), iAuthenticationRequestParameters, completed.getSDKTransactionID.AuthenticationRequestParameters(), -272745556, completed.getSDKTransactionID.AuthenticationRequestParameters(), new Object[]{this, challengeResultCancelled});
    }

    public final void getSDKReferenceNumber() {
        int iAuthenticationRequestParameters = completed.getSDKTransactionID.AuthenticationRequestParameters();
        getSDKReferenceNumber(727551435, completed.getSDKTransactionID.AuthenticationRequestParameters(), iAuthenticationRequestParameters, completed.getSDKTransactionID.AuthenticationRequestParameters(), -727551434, completed.getSDKTransactionID.AuthenticationRequestParameters(), new Object[]{this});
    }
}
