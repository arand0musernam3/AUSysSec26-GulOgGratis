package atd.ar;

import android.content.Context;
import androidx.annotation.NonNull;
import atd.as.getSDKEphemeralPublicKey;
import com.adyen.threeds2.Warning;
import java.util.Collection;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getSDKReferenceNumber extends AuthenticationRequestParameters {
    private static int BuildConfig = 0;
    private static int ChallengeResultCancelled = 1;
    public static int getDeviceData;
    public static int getSDKReferenceNumber;
    private final String AuthenticationRequestParameters;
    private final Collection<String> getSDKAppID;
    private final atd.aq.getSDKTransactionID getSDKTransactionID;

    public getSDKReferenceNumber(String str, Collection<String> collection, atd.aq.getSDKTransactionID getsdktransactionid) {
        this.AuthenticationRequestParameters = str;
        this.getSDKAppID = collection;
        this.getSDKTransactionID = getsdktransactionid;
    }

    public static int getDeviceData() {
        int i11 = getDeviceData;
        int i12 = i11 % 9560664;
        getDeviceData = i11 + 1;
        if (i12 != 0) {
            return getSDKReferenceNumber;
        }
        int i13 = (int) Runtime.getRuntime().totalMemory();
        getSDKReferenceNumber = i13;
        return i13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        if (r1.getSDKTransactionID.getSDKReferenceNumber(r6, r3) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object getSDKReferenceNumber(java.lang.Object[] r6) {
        /*
            r0 = 0
            r1 = r6[r0]
            atd.ar.getSDKReferenceNumber r1 = (atd.ar.getSDKReferenceNumber) r1
            r2 = 1
            r6 = r6[r2]
            android.content.Context r6 = (android.content.Context) r6
            int r3 = atd.ar.getSDKReferenceNumber.ChallengeResultCancelled
            r4 = r3 & 125(0x7d, float:1.75E-43)
            int r5 = ~r4
            r3 = r3 | 125(0x7d, float:1.75E-43)
            r3 = r3 & r5
            int r4 = r4 << r2
            int r3 = r3 + r4
            int r4 = r3 % 128
            atd.ar.getSDKReferenceNumber.BuildConfig = r4
            int r3 = r3 % 2
            if (r3 == 0) goto L2a
            atd.aq.getSDKTransactionID r3 = r1.getSDKTransactionID
            java.util.Collection<java.lang.String> r4 = r1.getSDKAppID
            boolean r3 = r3.getSDKAppID(r6, r4)
            r4 = 50
            int r4 = r4 / r0
            if (r3 == 0) goto L62
            goto L34
        L2a:
            atd.aq.getSDKTransactionID r3 = r1.getSDKTransactionID
            java.util.Collection<java.lang.String> r4 = r1.getSDKAppID
            boolean r3 = r3.getSDKAppID(r6, r4)
            if (r3 == 0) goto L62
        L34:
            java.lang.String r3 = r1.AuthenticationRequestParameters
            if (r3 == 0) goto L4d
            int r4 = atd.ar.getSDKReferenceNumber.ChallengeResultCancelled
            r5 = r4 | 121(0x79, float:1.7E-43)
            int r5 = r5 << r2
            r4 = r4 ^ 121(0x79, float:1.7E-43)
            int r5 = r5 - r4
            int r5 = r5 % 128
            atd.ar.getSDKReferenceNumber.BuildConfig = r5
            atd.aq.getSDKTransactionID r1 = r1.getSDKTransactionID
            boolean r6 = r1.getSDKReferenceNumber(r6, r3)
            if (r6 != 0) goto L4d
            goto L62
        L4d:
            int r6 = atd.ar.getSDKReferenceNumber.BuildConfig
            r0 = r6 & 69
            int r1 = ~r0
            r6 = r6 | 69
            r6 = r6 & r1
            int r0 = r0 << r2
            r1 = r6 ^ r0
            r6 = r6 & r0
            int r6 = r6 << r2
            int r1 = r1 + r6
            int r1 = r1 % 128
            atd.ar.getSDKReferenceNumber.ChallengeResultCancelled = r1
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L62:
            int r6 = atd.ar.getSDKReferenceNumber.ChallengeResultCancelled
            r1 = r6 | 76
            int r1 = r1 << r2
            r6 = r6 ^ 76
            int r1 = r1 - r6
            int r1 = r1 - r2
            int r6 = r1 % 128
            atd.ar.getSDKReferenceNumber.BuildConfig = r6
            int r1 = r1 % 2
            if (r1 == 0) goto L79
            r6 = 82
            int r6 = r6 / r0
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L79:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ar.getSDKReferenceNumber.getSDKReferenceNumber(java.lang.Object[]):java.lang.Object");
    }

    public static /* synthetic */ Object getSDKTransactionID(int i11, int i12, Object[] objArr, int i13, int i14, int i15, int i16) {
        int i17 = ~(i14 | i15 | i16);
        int i18 = ~i15;
        int i19 = (~(i18 | i16)) | (~((~i16) | i14));
        int i21 = (~(i16 | (~i14))) | i18;
        int i22 = ((-299892736) * i11) + (689963008 * i13) + (606076928 * i12) + ((-441125413) * i21) + (441125413 * i19) + (i17 * 441125413) + (164951516 * i15) + ((1047202342 * i14) - 713031680);
        int iC = a0.c(i11, 1743660113, ((-2044576983) * i13) + i14 + i15 + i12);
        return a0.e(iC, 1885470720, (i11 * (-1448904853)) + ((i13 * 2142076211) + ((i12 * 2048728315) + ((i21 * 441) + ((i19 * (-441)) + ((i17 * (-441)) + ((i15 * 2048728756) + ((i14 * 2048727874) + (-782056376)))))))), -1618345984, ((-1081737216) * iC) + i22) != 1 ? getSDKReferenceNumber(objArr) : getSDKTransactionID(objArr);
    }

    @Override // atd.ar.AuthenticationRequestParameters
    public final boolean AuthenticationRequestParameters(Context context) {
        int deviceData = getDeviceData();
        int deviceData2 = getDeviceData();
        int deviceData3 = getDeviceData();
        return ((Boolean) getSDKTransactionID(getDeviceData(), deviceData2, new Object[]{this, context}, deviceData3, -1741581590, 1741581590, deviceData)).booleanValue();
    }

    @Override // atd.ar.AuthenticationRequestParameters
    @NonNull
    public final Warning AuthenticationRequestParameters() {
        int deviceData = getDeviceData();
        int deviceData2 = getDeviceData();
        int deviceData3 = getDeviceData();
        return (Warning) getSDKTransactionID(getDeviceData(), deviceData2, new Object[]{this}, deviceData3, 2086376708, -2086376707, deviceData);
    }

    private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
        BuildConfig = (ChallengeResultCancelled + 29) % 128;
        getSDKEphemeralPublicKey getsdkephemeralpublickey = getSDKEphemeralPublicKey.getDeviceData;
        int i11 = BuildConfig;
        int i12 = ((i11 ^ 25) | (i11 & 25)) << 1;
        int i13 = -(((~i11) & 25) | (i11 & (-26)));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        ChallengeResultCancelled = i14 % 128;
        if (i14 % 2 != 0) {
            return getsdkephemeralpublickey;
        }
        throw null;
    }
}
