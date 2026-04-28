package atd.aj;

import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.bb.onCompletion;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class ChallengeResultCancelled {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int ChallengeResult;
    private static int ChallengeResultCancelled;
    private static int getDeviceData;
    private static long getSDKAppID;
    private static char getSDKReferenceNumber;
    private static int getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, byte r7, int r8) {
        /*
            int r7 = r7 + 4
            int r8 = r8 * 2
            int r0 = 1 - r8
            byte[] r1 = atd.aj.ChallengeResultCancelled.$$a
            int r6 = r6 + 68
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            r3 = -1
            if (r1 != 0) goto L15
            r6 = r7
            r4 = r8
            goto L29
        L15:
            r5 = r7
            r7 = r6
            r6 = r5
        L18:
            int r3 = r3 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            int r6 = r6 + 1
            r4 = r1[r6]
        L29:
            int r4 = -r4
            int r7 = r7 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aj.ChallengeResultCancelled.$$c(int, byte, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeResultCancelled = 0;
        ChallengeResult = 1;
        AuthenticationRequestParameters = 0;
        getDeviceData = 1;
        getSDKAppID();
        ViewConfiguration.getFadingEdgeLength();
        View.combineMeasuredStates(0, 0);
        int i11 = ChallengeResultCancelled + 69;
        ChallengeResult = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private static void a(String str, String str2, String str3, int i11, char c3, Object[] objArr) throws Throwable {
        char[] charArray;
        char[] charArray2;
        int i12;
        int i13;
        long j9;
        String str4;
        char c7;
        String str5 = "";
        int i14 = $10 + 75;
        $11 = i14 % 128;
        int i15 = 2;
        Object obj = null;
        if (i14 % 2 == 0) {
            throw null;
        }
        char[] charArray3 = str3 != null ? str3.toCharArray() : str3;
        if (str2 != null) {
            $11 = ($10 + 105) % 128;
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        char[] cArr = charArray;
        if (str != null) {
            $10 = ($11 + 33) % 128;
            charArray2 = str.toCharArray();
            $10 = ($11 + 67) % 128;
        } else {
            charArray2 = str;
        }
        char[] cArr2 = charArray2;
        onCompletion oncompletion = new onCompletion();
        int length = cArr.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
        int i16 = 0;
        System.arraycopy(cArr, 0, cArr3, 0, length);
        System.arraycopy(cArr2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c3);
        cArr4[2] = (char) (cArr4[2] + ((char) i11));
        int length3 = charArray3.length;
        char[] cArr5 = new char[length3];
        oncompletion.getDeviceData = 0;
        while (oncompletion.getDeviceData < length3) {
            $10 = ($11 + 47) % 128;
            try {
                Object[] objArr2 = {oncompletion};
                Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(874886523);
                if (sDKTransactionID == null) {
                    int iIndexOf = TextUtils.indexOf(str5, str5, i16, i16) + 2069;
                    char cIndexOf = (char) (44656 - TextUtils.indexOf((CharSequence) str5, '0', i16, i16));
                    int iIndexOf2 = 31 - TextUtils.indexOf((CharSequence) str5, '0', i16);
                    i13 = i16;
                    byte b8 = (byte) (-1);
                    i12 = i15;
                    sDKTransactionID = atd.e.ChallengeResult.getDeviceData(iIndexOf, cIndexOf, iIndexOf2, -397560981, false, $$c((byte) ($$b | 32), b8, (byte) (b8 + 1)), new Class[]{Object.class});
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                int iIntValue = ((Integer) ((Method) sDKTransactionID).invoke(obj, objArr2)).intValue();
                Object[] objArr3 = {oncompletion};
                Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(1806403515);
                if (sDKTransactionID2 == null) {
                    j9 = 0;
                    byte b11 = (byte) (-1);
                    sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getScrollBarSize() >> 8) + 3095, (char) (View.MeasureSpec.getSize(i13) + 14367), (ExpandableListView.getPackedPositionForGroup(i13) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i13) == 0L ? 0 : -1)) + 18, -1211924053, false, $$c((byte) 50, b11, (byte) (b11 + 1)), new Class[]{Object.class});
                } else {
                    j9 = 0;
                }
                int iIntValue2 = ((Integer) ((Method) sDKTransactionID2).invoke(obj, objArr3)).intValue();
                int i17 = cArr3[oncompletion.getDeviceData % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i12] = Integer.valueOf(cArr4[iIntValue]);
                objArr4[1] = Integer.valueOf(i17);
                objArr4[i13] = oncompletion;
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(1695612280);
                Class cls = Integer.TYPE;
                if (sDKTransactionID3 == null) {
                    c7 = 1;
                    byte b12 = (byte) (-1);
                    str4 = str5;
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(1428 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) View.MeasureSpec.getSize(i13), 30 - (ViewConfiguration.getLongPressTimeout() >> 16), -1183253656, false, $$c((byte) ($$b | 34), b12, (byte) (b12 + 1)), new Class[]{Object.class, cls, cls});
                } else {
                    str4 = str5;
                    c7 = 1;
                }
                ((Method) sDKTransactionID3).invoke(null, objArr4);
                int i18 = cArr3[iIntValue2] * 32718;
                int i19 = i12;
                Object[] objArr5 = new Object[i19];
                objArr5[c7] = Integer.valueOf(cArr4[iIntValue]);
                objArr5[i13] = Integer.valueOf(i18);
                Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(814479823);
                if (sDKTransactionID4 == null) {
                    int i21 = i13;
                    byte b13 = (byte) 0;
                    byte b14 = (byte) (b13 - 1);
                    sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(2774 - View.resolveSize(i21, i21), (char) (ExpandableListView.getPackedPositionGroup(j9) + 13060), (ViewConfiguration.getWindowTouchSlop() >> 8) + 25, -320602145, false, $$c(b13, b14, (byte) (b14 + 1)), new Class[]{cls, cls});
                }
                cArr4[iIntValue2] = ((Character) ((Method) sDKTransactionID4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = oncompletion.AuthenticationRequestParameters;
                int i22 = oncompletion.getDeviceData;
                cArr5[i22] = (char) (((((long) (r0 ^ charArray3[i22])) ^ (getSDKAppID ^ 1905653906042338631L)) ^ ((long) ((int) (((long) getSDKTransactionID) ^ 1905653906042338631L)))) ^ ((long) ((char) (((long) getSDKReferenceNumber) ^ 1905653906042338631L))));
                oncompletion.getDeviceData = i22 + 1;
                i15 = i19;
                str5 = str4;
                obj = null;
                i16 = 0;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr5);
    }

    public static RSAPrivateKey getDeviceData(BigInteger bigInteger, BigInteger bigInteger2) throws Throwable {
        try {
            Object[] objArr = new Object[1];
            a("\ufffeﰝ᭟㽎", "ꉃ躷箲俸", "麰\uf0c2붸", AndroidCharacter.getMirror('0') - 18574, (char) (KeyEvent.getDeadChar(0, 0) + 63611), objArr);
            RSAPrivateKey rSAPrivateKey = (RSAPrivateKey) KeyFactory.getInstance(((String) objArr[0]).intern()).generatePrivate(new RSAPrivateKeySpec(bigInteger, bigInteger2));
            getDeviceData = (AuthenticationRequestParameters + 19) % 128;
            return rSAPrivateKey;
        } catch (GeneralSecurityException unused) {
            throw atd.aa.getSDKReferenceNumber.CRYPTO_FAILURE.AuthenticationRequestParameters();
        }
    }

    public static void getSDKAppID() {
        getSDKAppID = 2683060703155241657L;
        getSDKTransactionID = -2038612665;
        getSDKReferenceNumber = (char) 15687;
    }

    public static RSAPublicKey getSDKTransactionID(BigInteger bigInteger, BigInteger bigInteger2) throws Throwable {
        try {
            Object[] objArr = new Object[1];
            a("\ufffeﰝ᭟㽎", "ꉃ躷箲俸", "麰\uf0c2붸", (-1299269725) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 63611), objArr);
            RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance(((String) objArr[0]).intern()).generatePublic(new RSAPublicKeySpec(bigInteger, bigInteger2));
            int i11 = getDeviceData + 77;
            AuthenticationRequestParameters = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 28 / 0;
            }
            return rSAPublicKey;
        } catch (GeneralSecurityException unused) {
            throw atd.aa.getSDKReferenceNumber.CRYPTO_FAILURE.AuthenticationRequestParameters();
        }
    }

    public static void init$0() {
        $$a = new byte[]{71, 110, 67, -59};
        $$b = 17;
    }
}
