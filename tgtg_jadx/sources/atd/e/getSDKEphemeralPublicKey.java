package atd.e;

import atd.n.getSDKTransactionID;
import atd.z.getSDKAppID;
import java.util.UUID;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u000bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/SdkTransactionIdentifier;", "", "<init>", "()V", "_value", "Lcom/adyen/threeds2/internal/util/DestroyableString;", "value", "", "getValue", "()Ljava/lang/String;", "generate", "", "destroy", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKEphemeralPublicKey {

    @Nullable
    private static atd.bc.AuthenticationRequestParameters AuthenticationRequestParameters = null;
    private static int getDeviceData = 1;
    private static int getMessageVersion = 1;
    private static int getSDKAppID;

    @NotNull
    public static final getSDKEphemeralPublicKey getSDKReferenceNumber = new getSDKEphemeralPublicKey();
    private static int getSDKTransactionID;

    static {
        int i11 = getSDKAppID + 48;
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        getMessageVersion = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    private getSDKEphemeralPublicKey() {
    }

    public static /* synthetic */ Object AuthenticationRequestParameters(int i11, int i12, int i13, Object[] objArr, int i14, int i15, int i16) {
        int i17 = ~i16;
        int i18 = ~i13;
        int i19 = (~(i17 | i18)) | (~(i17 | i11)) | (~(i18 | i11));
        int i21 = ~(i13 | i17);
        int i22 = i11 | i21 | (~(i18 | i16));
        int i23 = 1262354432 * i12;
        int i24 = ((-2070937600) * i15) + ((-1408630784) * i14) + i23 + ((-1679707278) * i22) + (1679707278 * i21) + (i19 * 1679707278) + ((-417352845) * i16) + ((-1352905585) * i11) + 1468203008;
        int iC = a0.c(i15, 1930545336, (1997535707 * i14) + i11 + i16 + i12);
        int i25 = i21 * (-890);
        int i26 = i22 * 890;
        int i27 = i12 * (-2054694363);
        int i28 = i14 * 1502648999;
        int i29 = i15 * 931574424;
        int iE = a0.e(iC, -2139684864, i29 + i28 + i27 + i26 + i25 + (i19 * (-890)) + (i16 * (-2054693473)) + (i11 * (-2054695253)) + 138751921, -174260224, (392888320 * iC) + i24);
        if (iE != 1) {
            return iE != 2 ? getDeviceData(objArr) : AuthenticationRequestParameters(objArr);
        }
        String string = UUID.randomUUID().toString();
        string.getClass();
        AuthenticationRequestParameters = new atd.bc.AuthenticationRequestParameters(string);
        int i31 = getSDKTransactionID;
        getDeviceData = (((i31 | 57) << 1) - (i31 ^ 57)) % 128;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004f, code lost:
    
        if (r9 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0075, code lost:
    
        if (r9 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
    
        r0 = atd.e.getSDKEphemeralPublicKey.getSDKTransactionID;
        r2 = r0 & 83;
        r1 = ((r0 ^ 83) | r2) << 1;
        r0 = -((r0 | 83) & (~r2));
        r2 = ((r1 & r0) + (r0 | r1)) % 128;
        atd.e.getSDKEphemeralPublicKey.getDeviceData = r2;
        r0 = ((r2 | 91) << 1) - (r2 ^ 91);
        atd.e.getSDKEphemeralPublicKey.getSDKTransactionID = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009a, code lost:
    
        if ((r0 % 2) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009c, code lost:
    
        r0 = 17 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a0, code lost:
    
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object getDeviceData(java.lang.Object[] r9) throws atd.e.ChallengeResultCancelled {
        /*
            int r9 = atd.e.getSDKEphemeralPublicKey.getSDKTransactionID
            int r0 = r9 + 5
            int r1 = r0 % 128
            atd.e.getSDKEphemeralPublicKey.getDeviceData = r1
            int r0 = r0 % 2
            if (r0 == 0) goto Lad
            atd.bc.AuthenticationRequestParameters r0 = atd.e.getSDKEphemeralPublicKey.AuthenticationRequestParameters     // Catch: atd.bc.getSDKTransactionID -> La7
            if (r0 == 0) goto La1
            r1 = r9 ^ 105(0x69, float:1.47E-43)
            r2 = r9 & 105(0x69, float:1.47E-43)
            r1 = r1 | r2
            int r1 = r1 << 1
            r2 = r9 & (-106(0xffffffffffffff96, float:NaN))
            int r9 = ~r9
            r3 = 105(0x69, float:1.47E-43)
            r9 = r9 & r3
            r9 = r9 | r2
            int r9 = -r9
            int r9 = ~r9
            int r1 = r1 - r9
            int r1 = r1 + (-1)
            int r9 = r1 % 128
            atd.e.getSDKEphemeralPublicKey.getDeviceData = r9
            int r1 = r1 % 2
            if (r1 != 0) goto L55
            java.lang.Object[] r6 = new java.lang.Object[]{r0}     // Catch: atd.bc.getSDKTransactionID -> La7
            int r5 = atd.z.getSDKAppID.getSDKTransactionID.getSDKAppID()     // Catch: atd.bc.getSDKTransactionID -> La7
            int r8 = atd.z.getSDKAppID.getSDKTransactionID.getSDKAppID()     // Catch: atd.bc.getSDKTransactionID -> La7
            int r2 = atd.z.getSDKAppID.getSDKTransactionID.getSDKAppID()     // Catch: atd.bc.getSDKTransactionID -> La7
            int r7 = atd.z.getSDKAppID.getSDKTransactionID.getSDKAppID()     // Catch: atd.bc.getSDKTransactionID -> La7
            r4 = 600043858(0x23c3f152, float:2.1244145E-17)
            r3 = -600043858(0xffffffffdc3c0eae, float:-2.1173374E17)
            java.lang.Object r9 = atd.bc.AuthenticationRequestParameters.getDeviceData(r2, r3, r4, r5, r6, r7, r8)     // Catch: atd.bc.getSDKTransactionID -> La7
            java.lang.String r9 = (java.lang.String) r9     // Catch: atd.bc.getSDKTransactionID -> La7
            r0 = 61
            int r0 = r0 / 0
            if (r9 == 0) goto La1
            goto L77
        L52:
            r0 = move-exception
            r9 = r0
            throw r9
        L55:
            java.lang.Object[] r4 = new java.lang.Object[]{r0}     // Catch: atd.bc.getSDKTransactionID -> La7
            int r3 = atd.z.getSDKAppID.getSDKTransactionID.getSDKAppID()     // Catch: atd.bc.getSDKTransactionID -> La7
            int r6 = atd.z.getSDKAppID.getSDKTransactionID.getSDKAppID()     // Catch: atd.bc.getSDKTransactionID -> La7
            int r0 = atd.z.getSDKAppID.getSDKTransactionID.getSDKAppID()     // Catch: atd.bc.getSDKTransactionID -> La7
            int r5 = atd.z.getSDKAppID.getSDKTransactionID.getSDKAppID()     // Catch: atd.bc.getSDKTransactionID -> La7
            r2 = 600043858(0x23c3f152, float:2.1244145E-17)
            r1 = -600043858(0xffffffffdc3c0eae, float:-2.1173374E17)
            java.lang.Object r9 = atd.bc.AuthenticationRequestParameters.getDeviceData(r0, r1, r2, r3, r4, r5, r6)     // Catch: atd.bc.getSDKTransactionID -> La7
            java.lang.String r9 = (java.lang.String) r9     // Catch: atd.bc.getSDKTransactionID -> La7
            if (r9 == 0) goto La1
        L77:
            int r0 = atd.e.getSDKEphemeralPublicKey.getSDKTransactionID
            r1 = r0 ^ 83
            r2 = r0 & 83
            r1 = r1 | r2
            int r1 = r1 << 1
            int r2 = ~r2
            r0 = r0 | 83
            r0 = r0 & r2
            int r0 = -r0
            r2 = r1 & r0
            r0 = r0 | r1
            int r2 = r2 + r0
            int r2 = r2 % 128
            atd.e.getSDKEphemeralPublicKey.getDeviceData = r2
            r0 = r2 | 91
            int r0 = r0 << 1
            r1 = r2 ^ 91
            int r0 = r0 - r1
            int r1 = r0 % 128
            atd.e.getSDKEphemeralPublicKey.getSDKTransactionID = r1
            int r0 = r0 % 2
            if (r0 == 0) goto La0
            r0 = 17
            int r0 = r0 / 0
        La0:
            return r9
        La1:
            atd.e.ChallengeResultCancelled r9 = new atd.e.ChallengeResultCancelled     // Catch: atd.bc.getSDKTransactionID -> La7
            r9.<init>()     // Catch: atd.bc.getSDKTransactionID -> La7
            throw r9     // Catch: atd.bc.getSDKTransactionID -> La7
        La7:
            atd.e.ChallengeResultCancelled r9 = new atd.e.ChallengeResultCancelled
            r9.<init>()
            throw r9
        Lad:
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.e.getSDKEphemeralPublicKey.getDeviceData(java.lang.Object[]):java.lang.Object");
    }

    @NotNull
    public static String getSDKAppID() {
        int sDKAppID = getSDKTransactionID.getSDKAppID.getSDKAppID();
        return (String) AuthenticationRequestParameters(-899766066, getSDKTransactionID.getSDKAppID.getSDKAppID(), sDKAppID, new Object[0], getSDKTransactionID.getSDKAppID.getSDKAppID(), getSDKTransactionID.getSDKAppID.getSDKAppID(), 899766066);
    }

    public static void getSDKReferenceNumber() {
        int sDKAppID = getSDKTransactionID.getSDKAppID.getSDKAppID();
        AuthenticationRequestParameters(1085225141, getSDKTransactionID.getSDKAppID.getSDKAppID(), sDKAppID, new Object[0], getSDKTransactionID.getSDKAppID.getSDKAppID(), getSDKTransactionID.getSDKAppID.getSDKAppID(), -1085225140);
    }

    public static void getSDKTransactionID() {
        int sDKAppID = getSDKTransactionID.getSDKAppID.getSDKAppID();
        AuthenticationRequestParameters(-1415593479, getSDKTransactionID.getSDKAppID.getSDKAppID(), sDKAppID, new Object[0], getSDKTransactionID.getSDKAppID.getSDKAppID(), getSDKTransactionID.getSDKAppID.getSDKAppID(), 1415593481);
    }

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) throws atd.bc.getSDKTransactionID {
        int i11 = getDeviceData;
        int i12 = i11 & 91;
        int iD = a0.d(i12, ~((i11 ^ 91) | i12), 1, 128);
        getSDKTransactionID = iD;
        atd.bc.AuthenticationRequestParameters authenticationRequestParameters = AuthenticationRequestParameters;
        if (authenticationRequestParameters != null) {
            int i13 = ((iD & 29) - (~(-(-(iD | 29))))) - 1;
            getDeviceData = i13 % 128;
            if (i13 % 2 == 0) {
                int sDKAppID = getSDKAppID.getSDKTransactionID.getSDKAppID();
                int sDKAppID2 = getSDKAppID.getSDKTransactionID.getSDKAppID();
                atd.bc.AuthenticationRequestParameters.getDeviceData(getSDKAppID.getSDKTransactionID.getSDKAppID(), 762869508, -762869506, sDKAppID, new Object[]{authenticationRequestParameters}, getSDKAppID.getSDKTransactionID.getSDKAppID(), sDKAppID2);
                throw null;
            }
            int sDKAppID3 = getSDKAppID.getSDKTransactionID.getSDKAppID();
            int sDKAppID4 = getSDKAppID.getSDKTransactionID.getSDKAppID();
            atd.bc.AuthenticationRequestParameters.getDeviceData(getSDKAppID.getSDKTransactionID.getSDKAppID(), 762869508, -762869506, sDKAppID3, new Object[]{authenticationRequestParameters}, getSDKAppID.getSDKTransactionID.getSDKAppID(), sDKAppID4);
            getSDKTransactionID = (getDeviceData + 53) % 128;
        } else {
            int i14 = ((i11 ^ 3) | (i11 & 3)) << 1;
            int i15 = -(((~i11) & 3) | (i11 & (-4)));
            getSDKTransactionID = (((i14 | i15) << 1) - (i15 ^ i14)) % 128;
        }
        AuthenticationRequestParameters = null;
        int i16 = getSDKTransactionID;
        int i17 = i16 & 13;
        int i18 = ((i16 ^ 13) | i17) << 1;
        int i19 = -((i16 | 13) & (~i17));
        int i21 = (i18 ^ i19) + ((i19 & i18) << 1);
        getDeviceData = i21 % 128;
        if (i21 % 2 != 0) {
            return null;
        }
        throw null;
    }
}
