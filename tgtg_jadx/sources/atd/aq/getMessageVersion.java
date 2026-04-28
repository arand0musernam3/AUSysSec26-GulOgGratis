package atd.aq;

import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.bb.ChallengeResultTimeout;
import atd.bc.ChallengeResultCancelled;
import atd.e.ChallengeResult;
import com.braze.Constants;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import org.bouncycastle.i18n.LocalizedMessage;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getMessageVersion {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static boolean AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int ChallengeResultCancelled;
    private static boolean getDeviceData;
    private static char[] getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r5, int r6, int r7) {
        /*
            int r7 = r7 * 2
            int r0 = 1 - r7
            int r5 = r5 + 4
            byte[] r1 = atd.aq.getMessageVersion.$$a
            int r6 = r6 * 4
            int r6 = r6 + 111
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L17
            r3 = r6
            r6 = r7
            r4 = r2
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r5 = r5 + 1
            int r4 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L27:
            r3 = r1[r5]
        L29:
            int r6 = r6 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aq.getMessageVersion.$$c(int, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        BuildConfig = 0;
        getSDKEphemeralPublicKey = 1;
        getSDKReferenceNumber = 0;
        ChallengeResultCancelled = 1;
        getSDKAppID();
        Process.getThreadPriority(0);
        getSDKEphemeralPublicKey = (BuildConfig + 71) % 128;
    }

    private static void a(int i11, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12;
        String str3 = str2;
        $10 = ($11 + 19) % 128;
        Object bytes = str3;
        if (str3 != null) {
            bytes = str3.getBytes(LocalizedMessage.DEFAULT_ENCODING);
        }
        byte[] bArr = (byte[]) bytes;
        if (str != null) {
            charArray = str.toCharArray();
            $11 = ($10 + 19) % 128;
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        ChallengeResultTimeout challengeResultTimeout = new ChallengeResultTimeout();
        char[] cArr2 = getSDKAppID;
        Class cls = Integer.TYPE;
        char c3 = '0';
        int i13 = -1;
        int i14 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i15 = 0;
            while (i15 < length) {
                $11 = ($10 + 21) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i15])};
                    Object sDKTransactionID = ChallengeResult.getSDKTransactionID(887083134);
                    if (sDKTransactionID == null) {
                        byte b8 = (byte) i13;
                        byte b11 = (byte) (b8 + 1);
                        sDKTransactionID = ChallengeResult.getDeviceData(2555 - TextUtils.indexOf("", "", i14), (char) (TextUtils.lastIndexOf("", c3, i14) + 48599), (Process.myPid() >> 22) + 31, -390605202, false, $$c(b8, b11, b11), new Class[]{cls});
                    }
                    cArr3[i15] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    i15++;
                    c3 = '0';
                    i13 = -1;
                    i14 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(getSDKTransactionID)};
        Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(-1144184369);
        if (sDKTransactionID2 == null) {
            sDKTransactionID2 = ChallengeResult.getDeviceData(TextUtils.getOffsetBefore("", 0) + 147, (char) (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.lastIndexOf("", '0') + 33, 1738876895, false, Constants.BRAZE_PUSH_TITLE_KEY, new Class[]{cls});
        }
        int iIntValue = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
        int i16 = 1124287645;
        float f11 = 0.0f;
        if (getDeviceData) {
            int length2 = bArr.length;
            challengeResultTimeout.AuthenticationRequestParameters = length2;
            char[] cArr4 = new char[length2];
            challengeResultTimeout.getSDKAppID = 0;
            while (true) {
                int i17 = challengeResultTimeout.getSDKAppID;
                int i18 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i17 >= i18) {
                    objArr[0] = new String(cArr4);
                    return;
                }
                $10 = ($11 + 19) % 128;
                cArr4[i17] = (char) (cArr2[bArr[(i18 - 1) - i17] + i11] - iIntValue);
                Object[] objArr4 = {challengeResultTimeout, challengeResultTimeout};
                Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(i16);
                if (sDKTransactionID3 == null) {
                    byte b12 = (byte) (-1);
                    byte b13 = (byte) (-b12);
                    i12 = i16;
                    sDKTransactionID3 = ChallengeResult.getDeviceData(1697 - (Process.myPid() >> 22), (char) TextUtils.indexOf("", "", 0, 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 28, -1620360563, false, $$c(b12, b13, (byte) (b13 - 1)), new Class[]{Object.class, Object.class});
                } else {
                    i12 = i16;
                }
                ((Method) sDKTransactionID3).invoke(null, objArr4);
                i16 = i12;
            }
        } else if (AuthenticationRequestParameters) {
            int length3 = cArr.length;
            challengeResultTimeout.AuthenticationRequestParameters = length3;
            char[] cArr5 = new char[length3];
            challengeResultTimeout.getSDKAppID = 0;
            while (true) {
                int i19 = challengeResultTimeout.getSDKAppID;
                int i21 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i19 >= i21) {
                    objArr[0] = new String(cArr5);
                    return;
                }
                int i22 = $10 + 85;
                $11 = i22 % 128;
                if (i22 % 2 == 0) {
                    cArr5[i19] = (char) (cArr2[cArr[(i21 << 1) - i19] + i11] << iIntValue);
                    Object[] objArr5 = {challengeResultTimeout, challengeResultTimeout};
                    Object sDKTransactionID4 = ChallengeResult.getSDKTransactionID(1124287645);
                    if (sDKTransactionID4 == null) {
                        byte b14 = (byte) (-1);
                        byte b15 = (byte) (-b14);
                        sDKTransactionID4 = ChallengeResult.getDeviceData(ExpandableListView.getPackedPositionType(0L) + 1697, (char) TextUtils.getOffsetAfter("", 0), (TypedValue.complexToFraction(0, f11, f11) > f11 ? 1 : (TypedValue.complexToFraction(0, f11, f11) == f11 ? 0 : -1)) + 29, -1620360563, false, $$c(b14, b15, (byte) (b15 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) sDKTransactionID4).invoke(null, objArr5);
                } else {
                    cArr5[i19] = (char) (cArr2[cArr[(i21 - 1) - i19] - i11] - iIntValue);
                    Object[] objArr6 = {challengeResultTimeout, challengeResultTimeout};
                    Object sDKTransactionID5 = ChallengeResult.getSDKTransactionID(1124287645);
                    if (sDKTransactionID5 == null) {
                        byte b16 = (byte) (-1);
                        byte b17 = (byte) (-b16);
                        sDKTransactionID5 = ChallengeResult.getDeviceData(TextUtils.getCapsMode("", 0, 0) + 1697, (char) View.MeasureSpec.getMode(0), View.MeasureSpec.getSize(0) + 29, -1620360563, false, $$c(b16, b17, (byte) (b17 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) sDKTransactionID5).invoke(null, objArr6);
                }
                f11 = 0.0f;
            }
        } else {
            int length4 = iArr.length;
            challengeResultTimeout.AuthenticationRequestParameters = length4;
            char[] cArr6 = new char[length4];
            challengeResultTimeout.getSDKAppID = 0;
            while (true) {
                int i23 = challengeResultTimeout.getSDKAppID;
                int i24 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i23 >= i24) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[i23] = (char) (cArr2[iArr[(i24 - 1) - i23] - i11] - iIntValue);
                    challengeResultTimeout.getSDKAppID = i23 + 1;
                    $10 = ($11 + 31) % 128;
                }
            }
        }
    }

    public static List<String> getDeviceData() throws Throwable {
        getSDKReferenceNumber = (ChallengeResultCancelled + 119) % 128;
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getTapTimeout() >> 16) + 127, null, null, "£¢\u0089¡\u0086\u0091 \u0098\u009f\u0089\u0081\u009e\u0086\u0081\u008c\u009d\u0097\u0096\u0081\u009c\u0090\u0089\u008d\u0097\u008b\u009b\u008b\u009a\u0099\u0098\u0093\u0097\u0090\u0096\u008c\u0095\u0083\u0081\u0094\u0082\u0086\u008b\u0093\u0092\u0083\u0091\u0090\u008f\u008e\u008b\u008d\u0089\u008b\u008b\u008c\u0083\u008b\u0083\u008a\u0089\u0083\u0088\u0081\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
        List<String> listAsList = Arrays.asList(getSDKReferenceNumber(((String) objArr[0]).intern()));
        int i11 = getSDKReferenceNumber + 43;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 36 / 0;
        }
        return listAsList;
    }

    public static void getSDKAppID() {
        getSDKAppID = new char[]{21778, 21815, 21731, 21709, 21782, 21765, 21741, 21777, 21776, 21790, 21779, 21740, 21791, 21783, 21759, 21743, 21767, 21729, 21738, 21742, 21758, 21705, 21739, 21770, 21734, 21808, 21764, 21814, 21728, 21773, 21735, 21762, 21757, 21771, 21788};
        getSDKTransactionID = 1286296761;
        AuthenticationRequestParameters = true;
        getDeviceData = true;
    }

    private static String getSDKReferenceNumber(String str) throws Throwable {
        int i11 = ChallengeResultCancelled + 43;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            ChallengeResultCancelled.getSDKAppID(str);
            throw null;
        }
        String sDKAppID = ChallengeResultCancelled.getSDKAppID(str);
        getSDKReferenceNumber = (ChallengeResultCancelled + 61) % 128;
        return sDKAppID;
    }

    public static void init$0() {
        $$a = new byte[]{116, 6, -52, -64};
        $$b = 147;
    }
}
