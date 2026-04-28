package atd.ah;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import atd.bb.ChallengeResultTimeout;
import atd.bb.getMessageVersion;
import atd.e.ChallengeResult;
import atd.z.getAdditionalDetails;
import com.braze.Constants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.util.Arrays;
import java.util.Random;
import javax.crypto.Mac;
import org.bouncycastle.i18n.LocalizedMessage;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class getDeviceData extends atd.ad.AuthenticationRequestParameters {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$h = null;
    private static final int $$i = 0;
    private static int $10;
    private static int $11;
    private static long AuthenticationRequestParameters;
    private static int ChallengeResult;
    private static int[] ChallengeResultCancelled;
    private static int getDeviceData;
    private static boolean getMessageVersion;
    private static boolean getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static char[] getSDKReferenceNumber;
    private static char[] getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$j(int r6, int r7, int r8) {
        /*
            int r6 = r6 * 2
            int r0 = 1 - r6
            int r8 = r8 + 4
            int r7 = r7 + 103
            byte[] r1 = atd.ah.getDeviceData.$$h
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            r3 = -1
            if (r1 != 0) goto L16
            r4 = r3
            r3 = r1
            r1 = r8
            goto L30
        L16:
            r5 = r8
            r8 = r7
            r7 = r5
        L19:
            int r3 = r3 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L28:
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r5
        L30:
            int r7 = r7 + r1
            r1 = r8
            r8 = r7
            r7 = r1
            r1 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ah.getDeviceData.$$j(int, int, int):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        getSDKEphemeralPublicKey = 0;
        ChallengeResult = 1;
        ChallengeResult();
        getSDKTransactionID = new char[]{31676, 59859, 24383, 52356, 13044, 41044, 5547, 31721, 59718, 24239, 52231, 12925, 42966, 5388, 31527, 59612, 24108, 50065, 12731, 42840, 5262, 31471, 59484, 24048, 49947, 12657, 42679, 5188, 31332, 61395, 23843, 49819, 12533, 42600, 62570, 26170, 53502, 17270, 48396, 12200, 39488, 14551, 43655, 7293, 36813, 29183, 58134, 22270, 14510, 43522, 7584, 36673, 28977, 58527, 22094, 14370, 43915, 7545, 32920, 29334, 58393, 22485, 14754, 43776, 7924, 45868, 8565, 38793, 1047, 64072, 26856, 56576, 45904, 8698, 38429, 1207, 64209, 11656, 49112, 2338, 39570, 25760, 63049, 17313, 11761, 48989, 2303, 39454, 25710, 61888, 17169, 11645, 48852, 2086, 38343, 26569, 61772, 17050, 11516, 48726, 2982, 38159, 26483, 62567, 26150, 53494, 17278, 48406, 12192, 39514, 62486, 62569, 26160, 53452, 17229, 48391, 12221, 39513, 62465, 26296, 53609, 17401, 48535, 10287};
        AuthenticationRequestParameters = -4445570680784984491L;
        getSDKReferenceNumber = new char[]{21760, 21787, 21772, 21810, 21700, 21785, 21768, 21811, 21770, 21774, 21765, 21753, 21763, 21762, 21791, 21789, 21738, 21767, 21742, 21769, 21755, 21737, 21731};
        getDeviceData = 1286296762;
        getSDKAppID = true;
        getMessageVersion = true;
    }

    private byte[] AuthenticationRequestParameters(AuthenticationRequestParameters authenticationRequestParameters, byte[] bArr, byte[] bArr2, byte[] bArr3) throws Throwable {
        byte[] bArrCopyOf;
        int i11 = getSDKEphemeralPublicKey + 55;
        ChallengeResult = i11 % 128;
        if (i11 % 2 == 0) {
            byte[] sDKReferenceNumber = getSDKReferenceNumber(bArr2, bArr, bArr3);
            Mac mac = Mac.getInstance(getSDKEphemeralPublicKey());
            int sDKTransactionID = getAdditionalDetails.AuthenticationRequestParameters.getSDKTransactionID();
            int sDKTransactionID2 = getAdditionalDetails.AuthenticationRequestParameters.getSDKTransactionID();
            int sDKTransactionID3 = getAdditionalDetails.AuthenticationRequestParameters.getSDKTransactionID();
            mac.init((Key) AuthenticationRequestParameters.getDeviceData(sDKTransactionID, sDKTransactionID2, getAdditionalDetails.AuthenticationRequestParameters.getSDKTransactionID(), new Object[]{authenticationRequestParameters}, sDKTransactionID3, -2093641177, 2093641178));
            mac.update(sDKReferenceNumber);
            bArrCopyOf = Arrays.copyOf(mac.doFinal(), BuildConfig());
            int i12 = 51 / 0;
        } else {
            byte[] sDKReferenceNumber2 = getSDKReferenceNumber(bArr2, bArr, bArr3);
            Mac mac2 = Mac.getInstance(getSDKEphemeralPublicKey());
            int sDKTransactionID4 = getAdditionalDetails.AuthenticationRequestParameters.getSDKTransactionID();
            int sDKTransactionID5 = getAdditionalDetails.AuthenticationRequestParameters.getSDKTransactionID();
            int sDKTransactionID6 = getAdditionalDetails.AuthenticationRequestParameters.getSDKTransactionID();
            mac2.init((Key) AuthenticationRequestParameters.getDeviceData(sDKTransactionID4, sDKTransactionID5, getAdditionalDetails.AuthenticationRequestParameters.getSDKTransactionID(), new Object[]{authenticationRequestParameters}, sDKTransactionID6, -2093641177, 2093641178));
            mac2.update(sDKReferenceNumber2);
            bArrCopyOf = Arrays.copyOf(mac2.doFinal(), BuildConfig());
        }
        int i13 = ChallengeResult + 31;
        getSDKEphemeralPublicKey = i13 % 128;
        if (i13 % 2 == 0) {
            return bArrCopyOf;
        }
        throw null;
    }

    public static void ChallengeResult() {
        ChallengeResultCancelled = new int[]{1668425987, 2137220955, 1608033068, 622016576, 743072614, 172633396, 357323516, 495026090, 145585700, 1085212596, -1210891833, -1859252896, -1828363008, 752040212, -608808647, -400608526, -1839321181, -1438625994};
    }

    private static void b(int[] iArr, int i11, Object[] objArr) throws Throwable {
        int i12;
        int i13;
        char c3;
        char[] cArr;
        int[] iArr2;
        int i14;
        int i15;
        int i16;
        getMessageVersion getmessageversion = new getMessageVersion();
        char[] cArr2 = new char[4];
        int i17 = 2;
        char[] cArr3 = new char[iArr.length * 2];
        int[] iArr3 = ChallengeResultCancelled;
        Class cls = Integer.TYPE;
        int i18 = 16;
        int i19 = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i21 = 0;
            i12 = 53070;
            while (i21 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i21])};
                    Object sDKTransactionID = ChallengeResult.getSDKTransactionID(-1667528016);
                    if (sDKTransactionID == null) {
                        i15 = i17;
                        i16 = i18;
                        byte b8 = (byte) i19;
                        sDKTransactionID = ChallengeResult.getDeviceData((Process.myPid() >> 22) + 2223, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 53070), 21 - KeyEvent.getDeadChar(i19, i19), 1089703072, false, $$j(b8, (byte) (b8 | 11), (byte) (-1)), new Class[]{cls});
                    } else {
                        i15 = i17;
                        i16 = i18;
                    }
                    iArr4[i21] = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
                    i21++;
                    i17 = i15;
                    i18 = i16;
                    i19 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        } else {
            i12 = 53070;
        }
        int i22 = i17;
        int i23 = i18;
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = ChallengeResultCancelled;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i24 = 0;
            while (i24 < length3) {
                Object[] objArr3 = {Integer.valueOf(iArr6[i24])};
                Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(-1667528016);
                if (sDKTransactionID2 == null) {
                    cArr = cArr2;
                    byte b11 = (byte) 0;
                    iArr2 = iArr6;
                    i14 = length3;
                    sDKTransactionID2 = ChallengeResult.getDeviceData(2223 - TextUtils.getCapsMode("", 0, 0), (char) (View.MeasureSpec.getSize(0) + i12), Gravity.getAbsoluteGravity(0, 0) + 21, 1089703072, false, $$j(b11, (byte) (b11 | 11), (byte) (-1)), new Class[]{cls});
                } else {
                    cArr = cArr2;
                    iArr2 = iArr6;
                    i14 = length3;
                }
                iArr7[i24] = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
                i24++;
                cArr2 = cArr;
                iArr6 = iArr2;
                length3 = i14;
            }
            iArr6 = iArr7;
        }
        char[] cArr4 = cArr2;
        char c7 = 0;
        System.arraycopy(iArr6, 0, iArr5, 0, length2);
        getmessageversion.getSDKAppID = 0;
        while (true) {
            int i25 = getmessageversion.getSDKAppID;
            if (i25 >= iArr.length) {
                objArr[0] = new String(cArr3, 0, i11);
                return;
            }
            int i26 = iArr[i25];
            char c8 = (char) (i26 >> 16);
            cArr4[c7] = c8;
            char c11 = (char) i26;
            char c12 = 1;
            cArr4[1] = c11;
            char c13 = (char) (iArr[i25 + 1] >> 16);
            cArr4[i22] = c13;
            char c14 = (char) iArr[i25 + 1];
            cArr4[3] = c14;
            getmessageversion.getDeviceData = (c8 << 16) + c11;
            getmessageversion.AuthenticationRequestParameters = (c13 << 16) + c14;
            getMessageVersion.getSDKTransactionID(iArr5);
            int i27 = 0;
            while (true) {
                i13 = getmessageversion.getDeviceData;
                if (i27 >= i23) {
                    break;
                }
                int i28 = i13 ^ iArr5[i27];
                getmessageversion.getDeviceData = i28;
                int sDKReferenceNumber = getMessageVersion.getSDKReferenceNumber(i28);
                Object[] objArr4 = new Object[4];
                objArr4[3] = getmessageversion;
                objArr4[i22] = getmessageversion;
                objArr4[c12] = Integer.valueOf(sDKReferenceNumber);
                objArr4[0] = getmessageversion;
                Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(1513246698);
                if (sDKTransactionID3 == null) {
                    byte b12 = (byte) 0;
                    c3 = c12;
                    sDKTransactionID3 = ChallengeResult.getDeviceData((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2386, (char) Color.red(0), (ViewConfiguration.getTouchSlop() >> 8) + 19, -2040903174, false, $$j(b12, (byte) (b12 | 9), (byte) (-1)), new Class[]{Object.class, cls, Object.class, Object.class});
                } else {
                    c3 = c12;
                }
                int iIntValue = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                getmessageversion.getDeviceData = getmessageversion.AuthenticationRequestParameters;
                getmessageversion.AuthenticationRequestParameters = iIntValue;
                i27++;
                c12 = c3;
                i23 = 16;
            }
            char c15 = c12;
            int i29 = getmessageversion.AuthenticationRequestParameters;
            getmessageversion.getDeviceData = i29;
            getmessageversion.AuthenticationRequestParameters = i13;
            int i31 = i13 ^ iArr5[16];
            getmessageversion.AuthenticationRequestParameters = i31;
            int i32 = i29 ^ iArr5[17];
            getmessageversion.getDeviceData = i32;
            cArr4[0] = (char) (i32 >>> 16);
            cArr4[c15] = (char) i32;
            cArr4[i22] = (char) (i31 >>> 16);
            cArr4[3] = (char) i31;
            getMessageVersion.getSDKTransactionID(iArr5);
            int i33 = getmessageversion.getSDKAppID;
            cArr3[i33 * 2] = cArr4[0];
            cArr3[(i33 * 2) + 1] = cArr4[c15];
            cArr3[(i33 * 2) + 2] = cArr4[i22];
            cArr3[(i33 * 2) + 3] = cArr4[3];
            int i34 = i22;
            Object[] objArr5 = new Object[i34];
            objArr5[c15] = getmessageversion;
            objArr5[0] = getmessageversion;
            Object sDKTransactionID4 = ChallengeResult.getSDKTransactionID(35442447);
            if (sDKTransactionID4 == null) {
                i23 = 16;
                byte b13 = (byte) 0;
                sDKTransactionID4 = ChallengeResult.getDeviceData(1861 - TextUtils.indexOf("", ""), (char) (ViewConfiguration.getLongPressTimeout() >> 16), 40 - Color.red(0), -562771681, false, $$j(b13, (byte) (b13 | 10), (byte) (-1)), new Class[]{Object.class, Object.class});
            } else {
                i23 = 16;
            }
            ((Method) sDKTransactionID4).invoke(null, objArr5);
            i22 = i34;
            c7 = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(char r23, int r24, int r25, java.lang.Object[] r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ah.getDeviceData.c(char, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = atd.ah.getDeviceData.$$d
            int r7 = 88 - r7
            int r6 = r6 + 11
            int r8 = r8 * 6
            int r8 = r8 + 97
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r6
            r8 = r7
            r5 = r2
            goto L2a
        L13:
            r3 = r8
            r8 = r7
            r7 = r3
            r3 = r2
        L17:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            int r8 = r8 + 1
            if (r5 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r0[r8]
        L2a:
            int r7 = r7 + r3
            int r7 = r7 + (-2)
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ah.getDeviceData.d(short, short, short, java.lang.Object[]):void");
    }

    private static void e(int[] iArr, int i11, String str, String str2, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12;
        char[] cArr;
        int i13;
        char[] cArr2;
        String str3 = str2;
        $11 = ($10 + 3) % 128;
        Object bytes = str3;
        if (str3 != null) {
            bytes = str3.getBytes(LocalizedMessage.DEFAULT_ENCODING);
        }
        byte[] bArr = (byte[]) bytes;
        if (str != null) {
            $10 = ($11 + 5) % 128;
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr3 = charArray;
        ChallengeResultTimeout challengeResultTimeout = new ChallengeResultTimeout();
        char[] cArr4 = getSDKReferenceNumber;
        Class cls = Integer.TYPE;
        char c3 = '0';
        int i14 = 0;
        if (cArr4 != null) {
            int length = cArr4.length;
            char[] cArr5 = new char[length];
            int i15 = 0;
            while (i15 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr4[i15])};
                    Object sDKTransactionID = ChallengeResult.getSDKTransactionID(887083134);
                    if (sDKTransactionID == null) {
                        byte b8 = (byte) i14;
                        cArr2 = cArr4;
                        sDKTransactionID = ChallengeResult.getDeviceData(2555 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (TextUtils.lastIndexOf("", c3, i14) + 48599), 31 - KeyEvent.normalizeMetaState(i14), -390605202, false, $$j(b8, (byte) (b8 | 8), (byte) (-1)), new Class[]{cls});
                    } else {
                        cArr2 = cArr4;
                    }
                    cArr5[i15] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    i15++;
                    cArr4 = cArr2;
                    c3 = '0';
                    i14 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr4 = cArr5;
        }
        Object[] objArr3 = {Integer.valueOf(getDeviceData)};
        Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(-1144184369);
        if (sDKTransactionID2 == null) {
            sDKTransactionID2 = ChallengeResult.getDeviceData(((byte) KeyEvent.getModifierMetaStateMask()) + 148, (char) (ViewConfiguration.getTapTimeout() >> 16), 32 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1738876895, false, Constants.BRAZE_PUSH_TITLE_KEY, new Class[]{cls});
        }
        int iIntValue = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
        int i16 = 1124287645;
        int i17 = 2;
        if (getMessageVersion) {
            int length2 = bArr.length;
            challengeResultTimeout.AuthenticationRequestParameters = length2;
            char[] cArr6 = new char[length2];
            challengeResultTimeout.getSDKAppID = 0;
            while (true) {
                int i18 = challengeResultTimeout.getSDKAppID;
                int i19 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i18 >= i19) {
                    objArr[0] = new String(cArr6);
                    return;
                }
                $10 = ($11 + 67) % 128;
                cArr6[i18] = (char) (cArr4[bArr[(i19 - 1) - i18] + i11] - iIntValue);
                Object[] objArr4 = {challengeResultTimeout, challengeResultTimeout};
                Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(i16);
                if (sDKTransactionID3 == null) {
                    byte b11 = (byte) 0;
                    i13 = i16;
                    sDKTransactionID3 = ChallengeResult.getDeviceData(TextUtils.getOffsetBefore("", 0) + 1697, (char) (ViewConfiguration.getScrollBarSize() >> 8), Color.alpha(0) + 29, -1620360563, false, $$j(b11, (byte) (b11 | 12), (byte) (-1)), new Class[]{Object.class, Object.class});
                } else {
                    i13 = i16;
                }
                ((Method) sDKTransactionID3).invoke(null, objArr4);
                i16 = i13;
            }
        } else if (getSDKAppID) {
            int i21 = $10 + 119;
            $11 = i21 % 128;
            if (i21 % 2 == 0) {
                int length3 = cArr3.length;
                challengeResultTimeout.AuthenticationRequestParameters = length3;
                cArr = new char[length3];
                i12 = 0;
            } else {
                i12 = 0;
                int length4 = cArr3.length;
                challengeResultTimeout.AuthenticationRequestParameters = length4;
                cArr = new char[length4];
            }
            challengeResultTimeout.getSDKAppID = i12;
            while (true) {
                int i22 = challengeResultTimeout.getSDKAppID;
                int i23 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i22 >= i23) {
                    objArr[0] = new String(cArr);
                    return;
                }
                cArr[i22] = (char) (cArr4[cArr3[(i23 - 1) - i22] - i11] - iIntValue);
                Object[] objArr5 = new Object[i17];
                objArr5[1] = challengeResultTimeout;
                objArr5[0] = challengeResultTimeout;
                Object sDKTransactionID4 = ChallengeResult.getSDKTransactionID(1124287645);
                if (sDKTransactionID4 == null) {
                    byte b12 = (byte) 0;
                    sDKTransactionID4 = ChallengeResult.getDeviceData(View.MeasureSpec.getMode(0) + 1697, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 29, -1620360563, false, $$j(b12, (byte) (b12 | 12), (byte) (-1)), new Class[]{Object.class, Object.class});
                }
                ((Method) sDKTransactionID4).invoke(null, objArr5);
                i17 = 2;
            }
        } else {
            int length5 = iArr.length;
            challengeResultTimeout.AuthenticationRequestParameters = length5;
            char[] cArr7 = new char[length5];
            challengeResultTimeout.getSDKAppID = 0;
            while (true) {
                int i24 = challengeResultTimeout.getSDKAppID;
                int i25 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i24 >= i25) {
                    objArr[0] = new String(cArr7);
                    return;
                } else {
                    cArr7[i24] = (char) (cArr4[iArr[(i25 - 1) - i24] - i11] - iIntValue);
                    challengeResultTimeout.getSDKAppID = i24 + 1;
                }
            }
        }
    }

    private static void f(short s7, byte b8, short s8, Object[] objArr) {
        int i11 = s7 + 4;
        int i12 = 122 - s8;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[b8 + 2];
        int i13 = b8 + 1;
        int i14 = -1;
        if (bArr == null) {
            int i15 = i13 + i11;
            i11++;
            i12 = i15 - 11;
            bArr = bArr;
            i14 = -1;
        }
        while (true) {
            int i16 = i14 + 1;
            bArr2[i16] = (byte) i12;
            if (i16 == i13) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte[] bArr3 = bArr;
            i11++;
            i12 = (i12 + bArr[i11]) - 11;
            bArr = bArr3;
            i14 = i16;
        }
    }

    private static byte[] getSDKAppID(int i11) {
        int i12;
        int i13;
        int i14 = getSDKEphemeralPublicKey + 53;
        ChallengeResult = i14 % 128;
        if (i14 % 2 == 0) {
            i12 = i11 >> 5;
            i13 = 91;
        } else {
            i12 = i11 << 3;
            i13 = 8;
        }
        byte[] bArrArray = ByteBuffer.allocate(i13).putLong(i12).array();
        int i15 = ChallengeResult + 11;
        getSDKEphemeralPublicKey = i15 % 128;
        if (i15 % 2 == 0) {
            return bArrArray;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x06ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private byte[] getSDKReferenceNumber(atd.ah.AuthenticationRequestParameters r44, int r45, byte[] r46, byte[] r47) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2068
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ah.getDeviceData.getSDKReferenceNumber(atd.ah.AuthenticationRequestParameters, int, byte[], byte[]):byte[]");
    }

    public static void init$0() {
        $$a = new byte[]{82, 88, 59, -83, 9, 26, -22, -4, 18, 20, 41, -6, 24, 16, -7, 13, 28, 0, 17, 10, -26, 6, -32, 34, -41, 0, 18, 19};
        $$b = 81;
    }

    public static void init$1() {
        $$d = new byte[]{119, 91, -93, 47, 21, -14, -52, 76, -72, 23, 39, -5, 13, 2, -5, 11, -5, 0, -16, 35, -17, 21, 3, 0, -31, 21, 0, 4, 6, 15, -15, 15, -76, 69, 0, 17, -31, -13, 9, -8, 49, 2, -37, -3, 0, 17, -31, -13, 9, -8, 49, 2, -37, -3, 21, -14, -52, 53, 3, -50, 59, 0, 17, -31, -13, 9, -8, 49, 2, -37, -3, 0, 17, -31, -13, 9, 11, 32, -15, 15, 7, -16, 4, 19, -9, 8, 1, -35, -3, 21, -14, -52, 75, -71, 29, 39, -3, 13, -9, -6, 13, -1, 19, -19, -17, 21, 16, 4, -7, 10, -44, 29, 10, 5, 11, -1, -11, -63, 69, 0, 17, -46, 35, 19, -11, -4, 4, -31, 31, 21, -17};
        $$e = 203;
    }

    public static void init$2() {
        $$h = new byte[]{59, -47, -94, -21};
        $$i = 81;
    }

    public abstract int BuildConfig();

    public abstract String getDeviceData();

    public final byte[] getDeviceData(AuthenticationRequestParameters authenticationRequestParameters, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws Throwable {
        ChallengeResult = (getSDKEphemeralPublicKey + 89) % 128;
        if (Arrays.equals(bArr4, AuthenticationRequestParameters(authenticationRequestParameters, bArr, bArr3, bArr2))) {
            byte[] sDKReferenceNumber = getSDKReferenceNumber(authenticationRequestParameters, 2, bArr, bArr2);
            ChallengeResult = (getSDKEphemeralPublicKey + 43) % 128;
            return sDKReferenceNumber;
        }
        Object[] objArr = new Object[1];
        c((char) (36851 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 34 - View.MeasureSpec.getSize(0), Color.green(0), objArr);
        throw new GeneralSecurityException(((String) objArr[0]).intern());
    }

    public final byte[] getMessageVersion() throws Throwable {
        getSDKEphemeralPublicKey = (ChallengeResult + 25) % 128;
        byte[] bArr = new byte[getSDKTransactionID()];
        getSDKEphemeralPublicKey = (ChallengeResult + 29) % 128;
        try {
            Object[] objArr = new Object[1];
            b(new int[]{-1721847347, 1491098579, -973592526, -372519463, -1184073722, 1290808234, -216812942, 768460929, -1995231290, 1789884162, -961028978, -1002199050, -261684560, -1124345394}, 26 - KeyEvent.keyCodeFromString(""), objArr);
            ((Random) Class.forName((String) objArr[0]).getDeclaredConstructor(null).newInstance(null)).nextBytes(bArr);
            return bArr;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public abstract String getSDKAppID();

    public abstract String getSDKEphemeralPublicKey();

    public abstract int getSDKReferenceNumber();

    public abstract int getSDKTransactionID();

    public final getSDKAppID getDeviceData(AuthenticationRequestParameters authenticationRequestParameters, byte[] bArr, byte[] bArr2, byte[] bArr3) throws Throwable {
        byte[] sDKReferenceNumber = getSDKReferenceNumber(authenticationRequestParameters, 1, bArr, bArr2);
        getSDKAppID getsdkappid = new getSDKAppID(bArr, sDKReferenceNumber, AuthenticationRequestParameters(authenticationRequestParameters, bArr, bArr3, sDKReferenceNumber));
        int i11 = getSDKEphemeralPublicKey + 25;
        ChallengeResult = i11 % 128;
        if (i11 % 2 != 0) {
            return getsdkappid;
        }
        throw null;
    }

    private static byte[] getSDKReferenceNumber(byte[] bArr, byte[] bArr2, byte[] bArr3) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            Object[] objArr = new Object[1];
            e(null, AndroidCharacter.getMirror('0') + 'O', null, "\u0097\u0097\u008c\u0096\u0095", objArr);
            byte[] sDKTransactionID = atd.bc.getSDKReferenceNumber.getSDKAppID(Charset.forName(((String) objArr[0]).intern())).getSDKTransactionID(bArr);
            byteArrayOutputStream.write(sDKTransactionID);
            byteArrayOutputStream.write(bArr2);
            byteArrayOutputStream.write(bArr3);
            byteArrayOutputStream.write(getSDKAppID(sDKTransactionID.length));
            ChallengeResult = (getSDKEphemeralPublicKey + 117) % 128;
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            getSDKEphemeralPublicKey = (ChallengeResult + 15) % 128;
            return byteArray;
        } catch (IOException unused) {
            throw atd.aa.getSDKReferenceNumber.CRYPTO_FAILURE.AuthenticationRequestParameters();
        }
    }
}
