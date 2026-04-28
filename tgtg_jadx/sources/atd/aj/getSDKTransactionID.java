package atd.aj;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.app.tgtg.model.local.AppConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getSDKTransactionID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] AuthenticationRequestParameters;
    private static int getSDKAppID;
    private static long getSDKReferenceNumber;
    private static int getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r5, byte r6, short r7) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 4
            int r6 = r6 * 3
            int r0 = 1 - r6
            byte[] r1 = atd.aj.getSDKTransactionID.$$a
            int r5 = 106 - r5
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L16
            r4 = r6
            r3 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L22:
            int r3 = r3 + 1
            r4 = r1[r7]
        L26:
            int r4 = -r4
            int r5 = r5 + r4
            int r7 = r7 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aj.getSDKTransactionID.$$c(short, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKTransactionID = 0;
        getSDKAppID = 1;
        AuthenticationRequestParameters = new char[]{19452, 12120, 33424, 26047, 55649, 48161, 6115};
        getSDKReferenceNumber = -1084112475972595535L;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r30, char r31, int r32, java.lang.Object[] r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aj.getSDKTransactionID.a(int, char, int, java.lang.Object[]):void");
    }

    private static byte[] getSDKAppID(int i11) {
        int i12 = getSDKAppID + AppConstants.RESULT_CODE_ORDER_CANCELLED;
        getSDKTransactionID = i12 % 128;
        byte[] bArrArray = ByteBuffer.allocate(i12 % 2 != 0 ? 5 : 4).putInt(i11).array();
        int i13 = getSDKAppID + 93;
        getSDKTransactionID = i13 % 128;
        if (i13 % 2 == 0) {
            return bArrArray;
        }
        throw null;
    }

    public static byte[] getSDKReferenceNumber(byte[] bArr, int i11, String str, String str2, String str3) throws Throwable {
        byte[] sDKAppID = getSDKAppID(1);
        byte[] sDKTransactionID = getSDKTransactionID(str);
        byte[] sDKTransactionID2 = getSDKTransactionID(str2);
        byte[] sDKTransactionID3 = getSDKTransactionID(str3);
        byte[] sDKAppID2 = getSDKAppID(i11);
        byte[] bArr2 = new byte[0];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(sDKAppID);
            byteArrayOutputStream.write(bArr);
            byteArrayOutputStream.write(sDKTransactionID);
            byteArrayOutputStream.write(sDKTransactionID2);
            byteArrayOutputStream.write(sDKTransactionID3);
            byteArrayOutputStream.write(sDKAppID2);
            byteArrayOutputStream.write(bArr2);
            getSDKAppID = (getSDKTransactionID + 63) % 128;
            try {
                Object[] objArr = new Object[1];
                a(ViewConfiguration.getMaximumDrawingCacheSize() >> 24, (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 49057), 7 - TextUtils.getOffsetBefore("", 0), objArr);
                MessageDigest messageDigest = MessageDigest.getInstance(((String) objArr[0]).intern());
                int i12 = (getSDKAppID + 99) % 128;
                getSDKTransactionID = i12;
                getSDKAppID = (i12 + 63) % 128;
                messageDigest.update(byteArrayOutputStream.toByteArray());
                byte[] bArrCopyOf = Arrays.copyOf(messageDigest.digest(), i11 / 8);
                getSDKAppID = (getSDKTransactionID + 103) % 128;
                return bArrCopyOf;
            } catch (NoSuchAlgorithmException unused) {
                throw atd.aa.getSDKReferenceNumber.CRYPTO_FAILURE.AuthenticationRequestParameters();
            }
        } catch (IOException unused2) {
            throw atd.aa.getSDKReferenceNumber.CRYPTO_FAILURE.AuthenticationRequestParameters();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static byte[] getSDKTransactionID(java.lang.String r3) {
        /*
            int r0 = atd.aj.getSDKTransactionID.getSDKTransactionID
            int r1 = r0 + 125
            int r2 = r1 % 128
            atd.aj.getSDKTransactionID.getSDKAppID = r2
            int r1 = r1 % 2
            if (r1 != 0) goto L13
            r1 = 16
            int r1 = r1 / 0
            if (r3 == 0) goto L1c
            goto L15
        L13:
            if (r3 == 0) goto L1c
        L15:
            int r0 = r0 + 65
            int r0 = r0 % 128
            atd.aj.getSDKTransactionID.getSDKAppID = r0
            goto L24
        L1c:
            int r2 = r2 + 103
            int r2 = r2 % 128
            atd.aj.getSDKTransactionID.getSDKTransactionID = r2
            java.lang.String r3 = ""
        L24:
            int r0 = r3.length()
            int r0 = r0 + 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            int r1 = r3.length()
            java.nio.ByteBuffer r0 = r0.putInt(r1)
            java.nio.charset.Charset r1 = atd.e.getSDKAppID.getSDKAppID
            byte[] r3 = r3.getBytes(r1)
            java.nio.ByteBuffer r3 = r0.put(r3)
            byte[] r3 = r3.array()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aj.getSDKTransactionID.getSDKTransactionID(java.lang.String):byte[]");
    }

    public static void init$0() {
        $$a = new byte[]{88, -124, -103, 69};
        $$b = 226;
    }
}
