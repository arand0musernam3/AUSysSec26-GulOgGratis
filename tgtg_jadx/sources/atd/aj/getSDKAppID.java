package atd.aj;

import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import i4.a;
import java.math.BigInteger;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getSDKAppID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int ChallengeResultCancelled;
    private static short[] getDeviceData;
    private static int getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static byte[] getSDKReferenceNumber;
    private static int getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, int r7, short r8) {
        /*
            int r8 = r8 * 3
            int r8 = 3 - r8
            byte[] r0 = atd.aj.getSDKAppID.$$a
            int r6 = r6 * 3
            int r1 = r6 + 1
            int r7 = r7 * 4
            int r7 = r7 + 101
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r0
            r4 = r2
            r0 = r8
            r8 = r6
            goto L30
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r8 = r8 + 1
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L26:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r0
            r0 = r5
        L30:
            int r7 = -r7
            int r7 = r7 + r8
            r8 = r0
            r0 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aj.getSDKAppID.$$c(short, int, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKEphemeralPublicKey = 0;
        ChallengeResultCancelled = 1;
        getSDKAppID = 542813398;
        AuthenticationRequestParameters = 829166676;
        getSDKTransactionID = -1028555736;
        getSDKReferenceNumber = new byte[]{-16, -62, 111, -104, 119, 102, 54, -52, -122, -116, 96, 53, -52, 118, -104, 118, 124, -116, 112, 113, -125, 58, -53, -120, ByteCompanionObject.MIN_VALUE, 112, -119, -127, 114, -114, 34, -59, 122, 54, -58, -116, 35, -39, 122, -119, 117, -122, 113, 82, -107, -119, 80, 85, -52, -104, 122, -126, 100, -115, 117, ByteCompanionObject.MIN_VALUE, 57, -56, 54, -37, 117, 122, -104, ByteCompanionObject.MAX_VALUE, -120, 123, 52, -37, 114, 118, 119, 119, 122, 105};
    }

    public static byte[] AuthenticationRequestParameters(BigInteger bigInteger) throws Throwable {
        getSDKEphemeralPublicKey = (ChallengeResultCancelled + 71) % 128;
        if (bigInteger.signum() < 0) {
            Object[] objArr = new Object[1];
            a(TextUtils.indexOf((CharSequence) "", '0') + 203593785, TextUtils.getOffsetAfter("", 0) - 120, (-288798965) - View.getDefaultSize(0, 0), (byte) (84 - ((Process.getThreadPriority(0) + 20) >> 6)), (short) TextUtils.indexOf("", ""), objArr);
            a.f(((String) objArr[0]).intern());
            return null;
        }
        byte[] byteArray = bigInteger.toByteArray();
        if (bigInteger.bitLength() % 8 == 0) {
            ChallengeResultCancelled = (getSDKEphemeralPublicKey + 99) % 128;
            if (byteArray[0] == 0 && byteArray.length > 1) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(byteArray, 1, byteArray.length);
                int i11 = getSDKEphemeralPublicKey + 63;
                ChallengeResultCancelled = i11 % 128;
                if (i11 % 2 != 0) {
                    return bArrCopyOfRange;
                }
                throw null;
            }
        }
        return byteArray;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x01e9 A[PHI: r3
      0x01e9: PHI (r3v10 int) = (r3v9 int), (r3v43 int) binds: [B:53:0x01e7, B:50:0x01da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ec A[PHI: r3
      0x01ec: PHI (r3v40 int) = (r3v9 int), (r3v43 int) binds: [B:53:0x01e7, B:50:0x01da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r27, int r28, int r29, byte r30, short r31, java.lang.Object[] r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aj.getSDKAppID.a(int, int, int, byte, short, java.lang.Object[]):void");
    }

    public static BigInteger getSDKAppID(byte[] bArr) {
        BigInteger bigInteger = new BigInteger(1, bArr);
        ChallengeResultCancelled = (getSDKEphemeralPublicKey + 89) % 128;
        return bigInteger;
    }

    public static void init$0() {
        $$a = new byte[]{5, 67, -107, -2};
        $$b = 32;
    }
}
