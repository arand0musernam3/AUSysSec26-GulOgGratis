package atd.ah;

import atd.z.getAdditionalDetails;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class AuthenticationRequestParameters extends SecretKeySpec {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;
    private final SecretKey getDeviceData;
    private final SecretKey getSDKAppID;

    static {
        init$0();
        getSDKTransactionID = 0;
        getSDKReferenceNumber = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthenticationRequestParameters(byte[] bArr, getDeviceData getdevicedata) throws Throwable {
        super(bArr, getdevicedata.getSDKAppID());
        try {
            Object[] objArr = {new ArrayList()};
            byte[] bArr2 = $$a;
            byte b8 = bArr2[56];
            Object[] objArr2 = new Object[1];
            a(b8, (byte) (b8 | 28), (byte) 121, objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            byte b11 = bArr2[18];
            byte b12 = bArr2[55];
            int i11 = $$b;
            Object[] objArr3 = new Object[1];
            a(b11, b12, (byte) (i11 & 490), objArr3);
            int iIntValue = ((Integer) cls.getMethod((String) objArr3[0], List.class).invoke(null, objArr)).intValue();
            if (iIntValue != 0) {
                try {
                    Object[] objArr4 = {Long.valueOf(8014966323652067328L ^ ((long) iIntValue)), 1866129769L};
                    Object[] objArr5 = new Object[1];
                    a(bArr2[56], (byte) (i11 & 58), (byte) 42, objArr5);
                    Class<?> cls2 = Class.forName((String) objArr5[0]);
                    byte b13 = bArr2[13];
                    byte b14 = b13;
                    Object[] objArr6 = new Object[1];
                    a(b13, b14, b14, objArr6);
                    String str = (String) objArr6[0];
                    Class cls3 = Long.TYPE;
                    cls2.getMethod(str, cls3, cls3).invoke(null, objArr4);
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            int length = bArr.length;
            int i12 = length / 2;
            this.getDeviceData = new SecretKeySpec(Arrays.copyOfRange(bArr, i12, length), getdevicedata.getSDKAppID());
            this.getSDKAppID = new SecretKeySpec(Arrays.copyOfRange(bArr, 0, i12), getdevicedata.getSDKEphemeralPublicKey());
        } catch (Throwable th3) {
            Throwable cause2 = th3.getCause();
            if (cause2 == null) {
                throw th3;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = 125 - r8
            byte[] r0 = atd.ah.AuthenticationRequestParameters.$$a
            int r1 = r7 + 19
            int r6 = r6 * 2
            int r6 = 103 - r6
            byte[] r1 = new byte[r1]
            int r7 = r7 + 18
            r2 = 0
            if (r0 != 0) goto L16
            r6 = r7
            r3 = r0
            r4 = r2
            r0 = r8
            goto L2d
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r0
            r0 = r8
            r8 = r4
            r4 = r3
            r3 = r5
        L2d:
            int r8 = -r8
            int r6 = r6 + r8
            int r8 = r0 + 1
            r0 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ah.AuthenticationRequestParameters.a(int, short, int, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object getDeviceData(int i11, int i12, int i13, Object[] objArr, int i14, int i15, int i16) {
        int i17 = ~i16;
        int i18 = ~i15;
        int i19 = ~((~i11) | i18);
        int i21 = i11 | i18;
        int i22 = (1092222976 * i13) + (952107008 * i14) + ((-271974400) * i12) + ((-282608405) * i21) + (282608405 * i19) + (i17 * 282608405) + (10634006 * i16) + (((-554582804) * i15) - 1671495680);
        int iC = a0.c(i13, -1809372279, ((-189913888) * i14) + i15 + i16 + i12);
        if (a0.e(iC, -2050686976, (i13 * (-1872984789)) + (i14 * 1843362976) + (i12 * 986544659) + (i21 * 881) + (i19 * (-881)) + (i17 * (-881)) + (i16 * 986543778) + (i15 * 986545540) + 223666697, 1179713536, ((-70844416) * iC) + i22) == 1) {
            return getSDKReferenceNumber(objArr);
        }
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
        int i23 = getSDKTransactionID;
        int i24 = i23 & 61;
        getSDKReferenceNumber = (((~i24) & (i23 | 61)) + (i24 << 1)) % 128;
        SecretKey secretKey = authenticationRequestParameters.getDeviceData;
        getSDKReferenceNumber = ((i23 & 49) + (i23 | 49)) % 128;
        return secretKey;
    }

    public static void init$0() {
        $$a = new byte[]{52, -114, -70, 47, -19, 16, 54, -73, 73, -21, -37, 7, -11, 0, 7, -9, 7, 2, 19, -19, -14, -2, 9, -8, 49, -44, 2, -3, 4, 7, -15, 15, 1, 64, -67, 2, -15, 33, 15, -7, -9, -30, 17, -13, -5, 18, -2, -17, 11, -6, 1, 37, 5, -52, 1, 12, 3, -9, -6, 11, 6, 2, -19, 11, -6, 1, 28, -19, -12, -4, 16, -14, -1, 36, -17, -17, 17, -12, 8, -15, 15, -13, -1, -19, 16, 54, -73, 73, -27, -37, 5, -11, 11, 8, -11, 3, -17, 21, 19, -19, -14, -2, 9, -8, 46, -27, -8, -3, -9, 3, 13, 65, -67, 2, -15, 48, -33, -17, 13, 6, -2, 33, -29, -19, 19, 2, -15, 33, 15, -7, -9, -30, 17, -13, -5, 18, -2, -17, 11, -6, 1, 37, 5};
        $$b = 93;
    }

    public final Key getSDKReferenceNumber() {
        int sDKTransactionID = getAdditionalDetails.AuthenticationRequestParameters.getSDKTransactionID();
        int sDKTransactionID2 = getAdditionalDetails.AuthenticationRequestParameters.getSDKTransactionID();
        int sDKTransactionID3 = getAdditionalDetails.AuthenticationRequestParameters.getSDKTransactionID();
        return (Key) getDeviceData(sDKTransactionID, sDKTransactionID2, getAdditionalDetails.AuthenticationRequestParameters.getSDKTransactionID(), new Object[]{this}, sDKTransactionID3, -2093641177, 2093641178);
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
        int i11 = getSDKReferenceNumber + 121;
        getSDKTransactionID = i11 % 128;
        int i12 = i11 % 2;
        SecretKey secretKey = authenticationRequestParameters.getSDKAppID;
        if (i12 == 0) {
            return secretKey;
        }
        throw null;
    }

    public final SecretKey getDeviceData() {
        int sDKTransactionID = getAdditionalDetails.AuthenticationRequestParameters.getSDKTransactionID();
        int sDKTransactionID2 = getAdditionalDetails.AuthenticationRequestParameters.getSDKTransactionID();
        int sDKTransactionID3 = getAdditionalDetails.AuthenticationRequestParameters.getSDKTransactionID();
        return (SecretKey) getDeviceData(sDKTransactionID, sDKTransactionID2, getAdditionalDetails.AuthenticationRequestParameters.getSDKTransactionID(), new Object[]{this}, sDKTransactionID3, -299159216, 299159216);
    }

    public AuthenticationRequestParameters(SecretKey secretKey, getDeviceData getdevicedata) {
        this(secretKey.getEncoded(), getdevicedata);
    }
}
