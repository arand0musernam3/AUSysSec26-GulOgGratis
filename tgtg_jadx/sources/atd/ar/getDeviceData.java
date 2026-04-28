package atd.ar;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import atd.bb.onCompletion;
import atd.e.ChallengeResult;
import com.adyen.threeds2.Warning;
import java.lang.reflect.Method;
import java.util.Set;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getDeviceData extends AuthenticationRequestParameters {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10;
    private static int $11;
    private static long AuthenticationRequestParameters;
    private static int ChallengeResult;
    private static char getSDKAppID;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;
    private final atd.aq.getSDKReferenceNumber getDeviceData;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(byte r7, short r8, short r9) {
        /*
            int r8 = r8 + 4
            byte[] r0 = atd.ar.getDeviceData.$$c
            int r7 = r7 + 68
            int r9 = r9 * 2
            int r9 = 1 - r9
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r0
            r4 = r2
            r0 = r8
            goto L2d
        L13:
            r3 = r8
            r8 = r7
            r7 = r3
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            int r7 = r7 + 1
            if (r4 != r9) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L26:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r0
            r0 = r6
        L2d:
            int r7 = r7 + r0
            r0 = r8
            r8 = r7
            r7 = r0
            r0 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ar.getDeviceData.$$e(byte, short, short):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getSDKReferenceNumber = 0;
        ChallengeResult = 1;
        AuthenticationRequestParameters = 1878553093941532100L;
        getSDKTransactionID = -2038612665;
        getSDKAppID = (char) 15687;
    }

    public getDeviceData(atd.aq.getSDKReferenceNumber getsdkreferencenumber) {
        this.getDeviceData = getsdkreferencenumber;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002e -> B:11:0x0035). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 25
            int r8 = 28 - r8
            int r6 = r6 * 6
            int r6 = r6 + 97
            int r7 = r7 * 15
            int r0 = 26 - r7
            byte[] r1 = atd.ar.getDeviceData.$$a
            byte[] r0 = new byte[r0]
            int r7 = 25 - r7
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r1
            r4 = r2
            r1 = r8
            goto L35
        L19:
            r3 = r8
            r8 = r6
            r6 = r3
            r3 = r2
        L1d:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r6 = r6 + 1
            int r4 = r3 + 1
            if (r3 != r7) goto L2e
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2e:
            r3 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r1
            r1 = r5
        L35:
            int r1 = r1 + r6
            int r6 = r1 + (-5)
            r1 = r8
            r8 = r6
            r6 = r1
            r1 = r3
            r3 = r4
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ar.getDeviceData.a(short, int, byte, java.lang.Object[]):void");
    }

    private static void b(String str, String str2, String str3, int i11, char c3, Object[] objArr) throws Throwable {
        char[] charArray;
        char[] charArray2;
        int i12;
        long j9;
        int i13;
        int i14;
        char[] cArr;
        char c7;
        char[] charArray3 = str3 != null ? str3.toCharArray() : str3;
        if (str2 != null) {
            $10 = ($11 + 9) % 128;
            charArray = str2.toCharArray();
            $10 = ($11 + 67) % 128;
        } else {
            charArray = str2;
        }
        char[] cArr2 = charArray;
        if (str != null) {
            $11 = ($10 + 117) % 128;
            charArray2 = str.toCharArray();
        } else {
            charArray2 = str;
        }
        char[] cArr3 = charArray2;
        onCompletion oncompletion = new onCompletion();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        int i15 = 0;
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c3);
        int i16 = 2;
        cArr5[2] = (char) (cArr5[2] + ((char) i11));
        int length3 = charArray3.length;
        char[] cArr6 = new char[length3];
        oncompletion.getDeviceData = 0;
        while (oncompletion.getDeviceData < length3) {
            try {
                Object[] objArr2 = {oncompletion};
                Object sDKTransactionID = ChallengeResult.getSDKTransactionID(874886523);
                if (sDKTransactionID == null) {
                    j9 = 0;
                    i12 = i16;
                    byte b8 = (byte) (-1);
                    sDKTransactionID = ChallengeResult.getDeviceData((ViewConfiguration.getKeyRepeatDelay() >> 16) + 2069, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 44656), TextUtils.getTrimmedLength("") + 32, -397560981, false, $$e((byte) 49, b8, (byte) (b8 + 1)), new Class[]{Object.class});
                } else {
                    i12 = i16;
                    j9 = 0;
                }
                int iIntValue = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {oncompletion};
                Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(1806403515);
                if (sDKTransactionID2 == null) {
                    int iResolveOpacity = Drawable.resolveOpacity(i15, i15) + 3095;
                    char c8 = (char) ((ViewConfiguration.getZoomControlsTimeout() > j9 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j9 ? 0 : -1)) + 14366);
                    int iIndexOf = 18 - TextUtils.indexOf("", "", i15);
                    i13 = i15;
                    byte b11 = (byte) (-1);
                    i14 = -1;
                    sDKTransactionID2 = ChallengeResult.getDeviceData(iResolveOpacity, c8, iIndexOf, -1211924053, false, $$e((byte) 50, b11, (byte) (b11 + 1)), new Class[]{Object.class});
                } else {
                    i13 = i15;
                    i14 = -1;
                }
                int iIntValue2 = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
                int i17 = cArr4[oncompletion.getDeviceData % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i12] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i17);
                objArr4[i13] = oncompletion;
                Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(1695612280);
                Class cls = Integer.TYPE;
                if (sDKTransactionID3 == null) {
                    int i18 = i13;
                    c7 = 1;
                    byte b12 = (byte) i14;
                    cArr = charArray3;
                    sDKTransactionID3 = ChallengeResult.getDeviceData(1428 - TextUtils.indexOf("", "", i18, i18), (char) ((-1) - ImageFormat.getBitsPerPixel(i18)), (-16777186) - Color.rgb(i18, i18, i18), -1183253656, false, $$e((byte) 51, b12, (byte) (b12 + 1)), new Class[]{Object.class, cls, cls});
                } else {
                    cArr = charArray3;
                    c7 = 1;
                }
                ((Method) sDKTransactionID3).invoke(null, objArr4);
                int i19 = cArr4[iIntValue2] * 32718;
                char c11 = cArr5[iIntValue];
                int i21 = i12;
                Object[] objArr5 = new Object[i21];
                objArr5[c7] = Integer.valueOf(c11);
                objArr5[0] = Integer.valueOf(i19);
                Object sDKTransactionID4 = ChallengeResult.getSDKTransactionID(814479823);
                if (sDKTransactionID4 == null) {
                    byte b13 = (byte) 0;
                    byte b14 = (byte) (b13 - 1);
                    sDKTransactionID4 = ChallengeResult.getDeviceData(2774 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (TextUtils.lastIndexOf("", '0') + 13061), 25 - Color.blue(0), -320602145, false, $$e(b13, b14, (byte) (b14 + 1)), new Class[]{cls, cls});
                }
                cArr5[iIntValue2] = ((Character) ((Method) sDKTransactionID4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = oncompletion.AuthenticationRequestParameters;
                int i22 = oncompletion.getDeviceData;
                cArr6[i22] = (char) (((((long) (r0 ^ cArr[i22])) ^ (AuthenticationRequestParameters ^ 1905653906042338631L)) ^ ((long) ((int) (((long) getSDKTransactionID) ^ 1905653906042338631L)))) ^ ((long) ((char) (((long) getSDKAppID) ^ 1905653906042338631L))));
                oncompletion.getDeviceData = i22 + 1;
                i16 = i21;
                charArray3 = cArr;
                i15 = 0;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        String str4 = new String(cArr6);
        $10 = ($11 + 3) % 128;
        objArr[0] = str4;
    }

    public static void getSDKReferenceNumber(long j9, long j11) throws Throwable {
        int i11 = ChallengeResult + 1;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            byte b8 = $$a[28];
            byte b11 = b8;
            Object[] objArr = new Object[1];
            a(b8, b11, (byte) (b11 + 1), objArr);
            a0.B(null, (String) objArr[0], "AuthenticationRequestParameters");
            throw null;
        }
        byte[] bArr = $$a;
        byte b12 = bArr[28];
        byte b13 = b12;
        Object[] objArr2 = new Object[1];
        a(b12, b13, (byte) (b13 + 1), objArr2);
        a0.B(null, (String) objArr2[0], "AuthenticationRequestParameters");
        getSDKReferenceNumber = (ChallengeResult + 25) % 128;
        try {
            byte b14 = bArr[28];
            byte b15 = b14;
            Object[] objArr3 = new Object[1];
            a(b14, b15, (byte) (b15 + 1), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b16 = (byte) ($$b & 7);
            Object[] objArr4 = new Object[1];
            a(b16, b16, bArr[28], objArr4);
            Method method = cls.getMethod((String) objArr4[0], null);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, null);
            Object[] objArr5 = {atd.as.getDeviceData.class.getField("getSDKTransactionID").get(null)};
            Object[] objArr6 = new Object[1];
            b("ꢃ虥젷c", "㐙紶⼌\uebd6", "\ue82d青\uf0f3", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 209532468, (char) (AndroidCharacter.getMirror('0') + 54783), objArr6);
            Method method2 = Set.class.getMethod(((String) objArr6[0]).intern(), Object.class);
            method2.setAccessible(true);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    public static void init$0() {
        $$a = new byte[]{80, -63, 35, 89, 24, -11, -49, 56, 22, -63, 62, 3, 20, -28, -10, 12, 14, 35, -12, 18, 10, -13, 7, 22, -6, 11, 4, -32, 0, 3, 20, -28, -10, 12, -5, 52, 5, -34, 0};
        $$b = 169;
    }

    public static void init$1() {
        $$c = new byte[]{39, 64, -52, -10};
        $$d = 155;
    }

    @Override // atd.ar.AuthenticationRequestParameters
    public final boolean AuthenticationRequestParameters(Context context) {
        getSDKReferenceNumber = (ChallengeResult + 103) % 128;
        if (!this.getDeviceData.AuthenticationRequestParameters()) {
            return true;
        }
        getSDKReferenceNumber = (ChallengeResult + 93) % 128;
        return false;
    }

    @Override // atd.ar.AuthenticationRequestParameters
    @NonNull
    public final Warning AuthenticationRequestParameters() {
        int i11 = ChallengeResult + 29;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            return atd.as.ChallengeResult.getSDKReferenceNumber;
        }
        int i12 = 83 / 0;
        return atd.as.ChallengeResult.getSDKReferenceNumber;
    }
}
