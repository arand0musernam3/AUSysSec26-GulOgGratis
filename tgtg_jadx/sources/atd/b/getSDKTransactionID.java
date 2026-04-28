package atd.b;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.bb.ChallengeResultTimeout;
import com.braze.Constants;
import java.lang.reflect.Method;
import org.bouncycastle.i18n.LocalizedMessage;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getSDKTransactionID extends getSDKAppID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int ChallengeResultCancelled;
    private static int getDeviceData;
    private static int getMessageVersion;
    private static char[] getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static boolean getSDKReferenceNumber;
    private static boolean getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, short r7, int r8) {
        /*
            byte[] r0 = atd.b.getSDKTransactionID.$$a
            int r6 = r6 * 2
            int r6 = r6 + 1
            int r7 = r7 + 4
            int r8 = r8 * 4
            int r8 = r8 + 111
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r8
            r3 = r2
            r8 = r7
            goto L2a
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2a:
            int r4 = -r4
            int r7 = r7 + r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.b.getSDKTransactionID.$$c(short, short, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKEphemeralPublicKey = 0;
        ChallengeResultCancelled = 1;
        getDeviceData = 0;
        getMessageVersion = 1;
        getDeviceData();
        View.resolveSize(0, 0);
        getSDKEphemeralPublicKey = (ChallengeResultCancelled + 47) % 128;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public getSDKTransactionID() throws Throwable {
        Object[] objArr = new Object[1];
        a(View.MeasureSpec.getSize(0) + 127, null, null, "\u0082\u0081", objArr);
        super(((String) objArr[0]).intern());
    }

    private static void a(int i11, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        char c3;
        float f11;
        long j9;
        float f12;
        int length;
        char[] cArr;
        int i12;
        String str3 = str2;
        Object bytes = str3;
        if (str3 != null) {
            bytes = str3.getBytes(LocalizedMessage.DEFAULT_ENCODING);
        }
        byte[] bArr = (byte[]) bytes;
        char[] charArray = str != null ? str.toCharArray() : str;
        ChallengeResultTimeout challengeResultTimeout = new ChallengeResultTimeout();
        char[] cArr2 = getSDKAppID;
        Class cls = Integer.TYPE;
        int i13 = 2;
        int i14 = 0;
        if (cArr2 != null) {
            int i15 = $11 + 71;
            j9 = 0;
            $10 = i15 % 128;
            if (i15 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
                i12 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i12 = 0;
            }
            while (i12 < length) {
                int i16 = $10 + 43;
                $11 = i16 % 128;
                if (i16 % i13 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i12])};
                        Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(887083134);
                        if (sDKTransactionID == null) {
                            int i17 = 2556 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            char c7 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 48597);
                            int i18 = (TypedValue.complexToFloat(i14) > 0.0f ? 1 : (TypedValue.complexToFloat(i14) == 0.0f ? 0 : -1)) + 31;
                            byte b8 = (byte) i14;
                            byte b11 = (byte) (b8 - 1);
                            sDKTransactionID = atd.e.ChallengeResult.getDeviceData(i17, c7, i18, -390605202, false, $$c(b8, b11, (byte) (b11 + 1)), new Class[]{cls});
                        }
                        cArr[i12] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i12])};
                    Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(887083134);
                    if (sDKTransactionID2 == null) {
                        byte b12 = (byte) 0;
                        byte b13 = (byte) (b12 - 1);
                        sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(View.resolveSize(0, 0) + 2555, (char) (48598 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 30 - TextUtils.lastIndexOf("", '0'), -390605202, false, $$c(b12, b13, (byte) (b13 + 1)), new Class[]{cls});
                    }
                    cArr[i12] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
                    i12++;
                }
                i13 = 2;
                i14 = 0;
            }
            c3 = 1;
            f11 = 0.0f;
            $10 = ($11 + 93) % 128;
            cArr2 = cArr;
        } else {
            c3 = 1;
            f11 = 0.0f;
            j9 = 0;
        }
        Object[] objArr4 = {Integer.valueOf(AuthenticationRequestParameters)};
        Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(-1144184369);
        if (sDKTransactionID3 == null) {
            sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(147 - View.MeasureSpec.getSize(0), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), Color.alpha(0) + 32, 1738876895, false, Constants.BRAZE_PUSH_TITLE_KEY, new Class[]{cls});
        }
        int iIntValue = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
        if (getSDKReferenceNumber) {
            int length2 = bArr.length;
            challengeResultTimeout.AuthenticationRequestParameters = length2;
            char[] cArr3 = new char[length2];
            challengeResultTimeout.getSDKAppID = 0;
            while (true) {
                int i19 = challengeResultTimeout.getSDKAppID;
                int i21 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i19 >= i21) {
                    objArr[0] = new String(cArr3);
                    return;
                }
                cArr3[i19] = (char) (cArr2[bArr[(i21 - 1) - i19] + i11] - iIntValue);
                Object[] objArr5 = new Object[2];
                objArr5[c3] = challengeResultTimeout;
                objArr5[0] = challengeResultTimeout;
                Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(1124287645);
                if (sDKTransactionID4 == null) {
                    f12 = f11;
                    byte b14 = (byte) 0;
                    byte b15 = (byte) (b14 - 1);
                    sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(1697 - (TypedValue.complexToFraction(0, f12, f12) > f12 ? 1 : (TypedValue.complexToFraction(0, f12, f12) == f12 ? 0 : -1)), (char) View.getDefaultSize(0, 0), 29 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1620360563, false, $$c(b14, b15, (byte) (-b15)), new Class[]{Object.class, Object.class});
                } else {
                    f12 = f11;
                }
                ((Method) sDKTransactionID4).invoke(null, objArr5);
                f11 = f12;
            }
        } else if (getSDKTransactionID) {
            int length3 = charArray.length;
            challengeResultTimeout.AuthenticationRequestParameters = length3;
            char[] cArr4 = new char[length3];
            challengeResultTimeout.getSDKAppID = 0;
            while (true) {
                int i22 = challengeResultTimeout.getSDKAppID;
                int i23 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i22 >= i23) {
                    objArr[0] = new String(cArr4);
                    return;
                }
                cArr4[i22] = (char) (cArr2[charArray[(i23 - 1) - i22] - i11] - iIntValue);
                Object[] objArr6 = new Object[2];
                objArr6[c3] = challengeResultTimeout;
                objArr6[0] = challengeResultTimeout;
                Object sDKTransactionID5 = atd.e.ChallengeResult.getSDKTransactionID(1124287645);
                if (sDKTransactionID5 == null) {
                    byte b16 = (byte) 0;
                    byte b17 = (byte) (b16 - 1);
                    sDKTransactionID5 = atd.e.ChallengeResult.getDeviceData(1696 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (KeyEvent.getMaxKeyCode() >> 16), (SystemClock.elapsedRealtimeNanos() > j9 ? 1 : (SystemClock.elapsedRealtimeNanos() == j9 ? 0 : -1)) + 28, -1620360563, false, $$c(b16, b17, (byte) (-b17)), new Class[]{Object.class, Object.class});
                }
                ((Method) sDKTransactionID5).invoke(null, objArr6);
            }
        } else {
            int length4 = iArr.length;
            challengeResultTimeout.AuthenticationRequestParameters = length4;
            char[] cArr5 = new char[length4];
            challengeResultTimeout.getSDKAppID = 0;
            while (true) {
                int i24 = challengeResultTimeout.getSDKAppID;
                int i25 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i24 >= i25) {
                    objArr[0] = new String(cArr5);
                    return;
                } else {
                    cArr5[i24] = (char) (cArr2[iArr[(i25 - 1) - i24] - i11] - iIntValue);
                    challengeResultTimeout.getSDKAppID = i24 + 1;
                }
            }
        }
    }

    private static boolean getDeviceData(String str) throws Throwable {
        Object obj;
        int i11 = getDeviceData + 119;
        getMessageVersion = i11 % 128;
        int i12 = i11 % 2;
        long packedPositionForGroup = ExpandableListView.getPackedPositionForGroup(0);
        if (i12 == 0) {
            Object[] objArr = new Object[1];
            a(82 << (packedPositionForGroup > 0L ? 1 : (packedPositionForGroup == 0L ? 0 : -1)), null, null, "\u0082\u0081", objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(127 - (packedPositionForGroup > 0L ? 1 : (packedPositionForGroup == 0L ? 0 : -1)), null, null, "\u0082\u0081", objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern().equals(str);
    }

    public static void init$0() {
        $$a = new byte[]{49, 92, 68, -39};
        $$b = 208;
    }

    @Override // atd.b.getDeviceData
    public final /* synthetic */ boolean getSDKReferenceNumber(String str) throws Throwable {
        int i11 = getDeviceData + 41;
        getMessageVersion = i11 % 128;
        int i12 = i11 % 2;
        boolean deviceData = getDeviceData(str);
        if (i12 == 0) {
            int i13 = 99 / 0;
        }
        return deviceData;
    }

    public static void getDeviceData() {
        getSDKAppID = new char[]{21854, 21855};
        AuthenticationRequestParameters = 1286296846;
        getSDKTransactionID = true;
        getSDKReferenceNumber = true;
    }
}
