package atd.a;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.ae.getSDKEphemeralPublicKey;
import atd.bb.ChallengeResultTimeout;
import atd.bb.getMessageVersion;
import atd.c.BuildConfig;
import atd.c.ChallengeResultCancelled;
import atd.d.getAdditionalDetails;
import atd.d.getDeviceData;
import atd.d.getTransactionStatus;
import atd.e.ChallengeResult;
import atd.e.getSDKAppID;
import atd.i.AuthenticationRequestParameters;
import atd.n.ChallengeResultError;
import atd.q.getSDKEphemeralPublicKey;
import com.braze.Constants;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import n90.b0;
import org.bouncycastle.i18n.LocalizedMessage;
import org.bouncycastle.jce.provider.a;
import org.json.JSONException;
import org.json.JSONObject;
import w.a0;
import zendesk.messaging.android.internal.conversationscreen.ConversationTypingEvents;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
final class getSDKTransactionID extends getDeviceData {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10;
    private static int $11;
    private static boolean BuildConfig;
    private static boolean ChallengeResultCancelled;
    private static int ChallengeResultCompleted;
    private static int ChallengeResultError;
    private static int ChallengeResultTimeout;
    private static int[] getAdditionalDetails;
    private static final int getDeviceData;
    private static int getMessageVersion;
    private static final int getSDKAppID;
    private static char[] getSDKEphemeralPublicKey;
    private static final Charset getSDKReferenceNumber;
    private static int getTransactionStatus;
    private String AuthenticationRequestParameters;
    private ArrayList<getSDKEphemeralPublicKey> ChallengeResult = new ArrayList<>();
    private Object getSDKTransactionID;

    private static String $$e(int i11, byte b8, byte b11) {
        int i12 = 3 - (i11 * 2);
        int i13 = b11 * 3;
        int i14 = 115 - b8;
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[1 - i13];
        int i15 = 0 - i13;
        int i16 = -1;
        if (bArr == null) {
            i14 = (-i12) + i15;
            i12 = i12;
            bArr = bArr;
            i16 = -1;
        }
        while (true) {
            int i17 = i16 + 1;
            int i18 = i12 + 1;
            bArr2[i17] = (byte) i14;
            if (i17 == i15) {
                return new String(bArr2, 0);
            }
            byte[] bArr3 = bArr;
            i14 = (-bArr[i18]) + i14;
            i12 = i18;
            bArr = bArr3;
            i16 = i17;
        }
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        ChallengeResultError = 0;
        ChallengeResultTimeout = 1;
        getTransactionStatus = 0;
        ChallengeResultCompleted = 1;
        getDeviceData();
        int i11 = (int) ConversationTypingEvents.TIME_INTERVAL_IN_MILLIS;
        getDeviceData = i11;
        getSDKAppID = i11;
        getSDKReferenceNumber = getSDKAppID.getSDKAppID;
        int i12 = ChallengeResultError + 121;
        ChallengeResultTimeout = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    public getSDKTransactionID(String str, Object obj) {
        this.AuthenticationRequestParameters = str;
        this.getSDKTransactionID = obj;
    }

    private static byte[] AuthenticationRequestParameters(atd.i.getDeviceData getdevicedata) throws JSONException {
        getTransactionStatus = (ChallengeResultCompleted + 107) % 128;
        JSONObject jSONObjectAuthenticationRequestParameters = getdevicedata.AuthenticationRequestParameters();
        String string = jSONObjectAuthenticationRequestParameters.toString();
        int deviceData = atd.ak.getDeviceData.getDeviceData();
        int deviceData2 = atd.ak.getDeviceData.getDeviceData();
        atd.bc.getDeviceData.getSDKTransactionID(atd.ak.getDeviceData.getDeviceData(), deviceData2, atd.ak.getDeviceData.getDeviceData(), deviceData, -1676234569, new Object[]{jSONObjectAuthenticationRequestParameters}, 1676234570);
        byte[] bytes = string.getBytes(getSDKReferenceNumber);
        ChallengeResultCompleted = (getTransactionStatus + 31) % 128;
        return bytes;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 38
            int r7 = r7 + 65
            int r8 = r8 * 2
            int r0 = 31 - r8
            byte[] r1 = atd.a.getSDKTransactionID.$$a
            int r6 = r6 * 2
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            int r8 = 30 - r8
            r2 = 0
            if (r1 != 0) goto L19
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2e
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2e:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + 2
            int r7 = r7 + 1
            r3 = r7
            r7 = r6
            r6 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.a.getSDKTransactionID.a(int, byte, short, java.lang.Object[]):void");
    }

    private static void b(int i11, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        int i12;
        char[] cArr;
        String str3 = str2;
        Object obj = str3;
        if (str3 != null) {
            byte[] bytes = str3.getBytes(LocalizedMessage.DEFAULT_ENCODING);
            $10 = ($11 + 53) % 128;
            obj = bytes;
        }
        byte[] bArr = (byte[]) obj;
        char[] charArray = str != null ? str.toCharArray() : str;
        ChallengeResultTimeout challengeResultTimeout = new ChallengeResultTimeout();
        char[] cArr2 = getSDKEphemeralPublicKey;
        Class cls = Integer.TYPE;
        int i13 = 2;
        int i14 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i15 = 0;
            while (i15 < length) {
                int i16 = $11 + 45;
                $10 = i16 % 128;
                if (i16 % i13 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i15])};
                        Object sDKTransactionID = ChallengeResult.getSDKTransactionID(887083134);
                        if (sDKTransactionID == null) {
                            int iKeyCodeFromString = 2555 - KeyEvent.keyCodeFromString("");
                            char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(i14) + 48599);
                            int windowTouchSlop = 31 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                            byte b8 = (byte) i14;
                            byte length2 = (byte) $$c.length;
                            sDKTransactionID = ChallengeResult.getDeviceData(iKeyCodeFromString, bitsPerPixel, windowTouchSlop, -390605202, false, $$e(b8, length2, (byte) (length2 - 4)), new Class[]{cls});
                        }
                        cArr3[i15] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                        i15 >>= 1;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i15])};
                    Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(887083134);
                    if (sDKTransactionID2 == null) {
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 2555;
                        char deadChar = (char) (48598 - KeyEvent.getDeadChar(0, 0));
                        int iAlpha = 31 - Color.alpha(0);
                        byte length3 = (byte) $$c.length;
                        cArr = cArr2;
                        sDKTransactionID2 = ChallengeResult.getDeviceData(packedPositionType, deadChar, iAlpha, -390605202, false, $$e((byte) 0, length3, (byte) (length3 - 4)), new Class[]{cls});
                    } else {
                        cArr = cArr2;
                    }
                    cArr3[i15] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
                    i15++;
                    cArr2 = cArr;
                }
                i13 = 2;
                i14 = 0;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(getMessageVersion)};
        Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(-1144184369);
        if (sDKTransactionID3 == null) {
            sDKTransactionID3 = ChallengeResult.getDeviceData(147 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getEdgeSlop() >> 16), 32 - KeyEvent.getDeadChar(0, 0), 1738876895, false, Constants.BRAZE_PUSH_TITLE_KEY, new Class[]{cls});
        }
        int iIntValue = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
        int i17 = 1124287645;
        if (BuildConfig) {
            int length4 = bArr.length;
            challengeResultTimeout.AuthenticationRequestParameters = length4;
            char[] cArr4 = new char[length4];
            challengeResultTimeout.getSDKAppID = 0;
            while (true) {
                int i18 = challengeResultTimeout.getSDKAppID;
                int i19 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i18 >= i19) {
                    break;
                }
                cArr4[i18] = (char) (cArr2[bArr[(i19 - 1) - i18] + i11] - iIntValue);
                Object[] objArr5 = {challengeResultTimeout, challengeResultTimeout};
                Object sDKTransactionID4 = ChallengeResult.getSDKTransactionID(1124287645);
                if (sDKTransactionID4 == null) {
                    byte b11 = (byte) 0;
                    byte b12 = b11;
                    sDKTransactionID4 = ChallengeResult.getDeviceData(1696 - TextUtils.lastIndexOf("", '0'), (char) View.resolveSize(0, 0), 28 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -1620360563, false, $$e(b11, b12, b12), new Class[]{Object.class, Object.class});
                }
                ((Method) sDKTransactionID4).invoke(null, objArr5);
            }
            String str4 = new String(cArr4);
            int i21 = $11 + 83;
            $10 = i21 % 128;
            if (i21 % 2 != 0) {
                throw null;
            }
            objArr[0] = str4;
            return;
        }
        if (ChallengeResultCancelled) {
            $11 = ($10 + 115) % 128;
            int length5 = charArray.length;
            challengeResultTimeout.AuthenticationRequestParameters = length5;
            char[] cArr5 = new char[length5];
            challengeResultTimeout.getSDKAppID = 0;
            while (true) {
                int i22 = challengeResultTimeout.getSDKAppID;
                int i23 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i22 >= i23) {
                    objArr[0] = new String(cArr5);
                    return;
                }
                int i24 = $10 + 69;
                $11 = i24 % 128;
                if (i24 % 2 == 0) {
                    cArr5[i22] = (char) (cArr2[charArray[(i23 / 0) * i22] / i11] / iIntValue);
                    Object[] objArr6 = {challengeResultTimeout, challengeResultTimeout};
                    Object sDKTransactionID5 = ChallengeResult.getSDKTransactionID(i17);
                    if (sDKTransactionID5 == null) {
                        byte b13 = (byte) 0;
                        byte b14 = b13;
                        i12 = i17;
                        sDKTransactionID5 = ChallengeResult.getDeviceData(1697 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 29 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -1620360563, false, $$e(b13, b14, b14), new Class[]{Object.class, Object.class});
                    } else {
                        i12 = i17;
                    }
                    ((Method) sDKTransactionID5).invoke(null, objArr6);
                } else {
                    i12 = i17;
                    cArr5[i22] = (char) (cArr2[charArray[(i23 - 1) - i22] - i11] - iIntValue);
                    Object[] objArr7 = {challengeResultTimeout, challengeResultTimeout};
                    Object sDKTransactionID6 = ChallengeResult.getSDKTransactionID(i12);
                    if (sDKTransactionID6 == null) {
                        byte b15 = (byte) 0;
                        byte b16 = b15;
                        sDKTransactionID6 = ChallengeResult.getDeviceData((ViewConfiguration.getScrollDefaultDelay() >> 16) + 1697, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf("", "") + 29, -1620360563, false, $$e(b15, b16, b16), new Class[]{Object.class, Object.class});
                    }
                    ((Method) sDKTransactionID6).invoke(null, objArr7);
                }
                i17 = i12;
            }
        } else {
            int i25 = 0;
            int length6 = iArr.length;
            challengeResultTimeout.AuthenticationRequestParameters = length6;
            char[] cArr6 = new char[length6];
            while (true) {
                challengeResultTimeout.getSDKAppID = i25;
                int i26 = challengeResultTimeout.getSDKAppID;
                int i27 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i26 >= i27) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[i26] = (char) (cArr2[iArr[(i27 - 1) - i26] - i11] - iIntValue);
                    i25 = i26 + 1;
                }
            }
        }
    }

    private static void c(int[] iArr, int i11, Object[] objArr) throws Throwable {
        int i12;
        int i13;
        char[] cArr;
        int[] iArr2;
        long j9;
        int i14;
        int i15;
        int i16;
        getMessageVersion getmessageversion = new getMessageVersion();
        char[] cArr2 = new char[4];
        int i17 = 2;
        char[] cArr3 = new char[iArr.length * 2];
        int[] iArr3 = getAdditionalDetails;
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
                        i14 = i17;
                        i15 = i18;
                        byte b8 = (byte) i19;
                        i16 = i19;
                        byte b11 = (byte) (b8 + 1);
                        sDKTransactionID = ChallengeResult.getDeviceData(2223 - Color.green(i19), (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 53070), 21 - (ViewConfiguration.getPressedStateDuration() >> 16), 1089703072, false, $$e(b8, b11, (byte) (b11 - 1)), new Class[]{cls});
                    } else {
                        i14 = i17;
                        i15 = i18;
                        i16 = i19;
                    }
                    iArr4[i21] = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
                    i21++;
                    i17 = i14;
                    i18 = i15;
                    i19 = i16;
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
        int i24 = i19;
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = getAdditionalDetails;
        long j11 = 0;
        if (iArr6 != null) {
            int i25 = $10;
            $11 = (i25 + 117) % 128;
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            $11 = (i25 + 47) % 128;
            int i26 = i24;
            while (i26 < length3) {
                $11 = ($10 + 53) % 128;
                Object[] objArr3 = {Integer.valueOf(iArr6[i26])};
                Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(-1667528016);
                if (sDKTransactionID2 == null) {
                    j9 = j11;
                    cArr = cArr2;
                    byte b12 = (byte) i24;
                    byte b13 = (byte) (b12 + 1);
                    iArr2 = iArr6;
                    sDKTransactionID2 = ChallengeResult.getDeviceData(2223 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) ((ExpandableListView.getPackedPositionForGroup(i24) > j11 ? 1 : (ExpandableListView.getPackedPositionForGroup(i24) == j11 ? 0 : -1)) + i12), 21 - (ViewConfiguration.getTapTimeout() >> 16), 1089703072, false, $$e(b12, b13, (byte) (b13 - 1)), new Class[]{cls});
                } else {
                    cArr = cArr2;
                    iArr2 = iArr6;
                    j9 = j11;
                }
                iArr7[i26] = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
                i26++;
                cArr2 = cArr;
                j11 = j9;
                iArr6 = iArr2;
                i24 = 0;
            }
            iArr6 = iArr7;
        }
        char[] cArr4 = cArr2;
        long j12 = j11;
        char c3 = 0;
        System.arraycopy(iArr6, 0, iArr5, 0, length2);
        getmessageversion.getSDKAppID = 0;
        while (true) {
            int i27 = getmessageversion.getSDKAppID;
            if (i27 >= iArr.length) {
                String str = new String(cArr3, 0, i11);
                $11 = ($10 + 111) % 128;
                objArr[0] = str;
                return;
            }
            int i28 = iArr[i27];
            char c7 = (char) (i28 >> 16);
            cArr4[c3] = c7;
            char c8 = (char) i28;
            cArr4[1] = c8;
            char c11 = (char) (iArr[i27 + 1] >> 16);
            cArr4[i22] = c11;
            char c12 = (char) iArr[i27 + 1];
            cArr4[3] = c12;
            getmessageversion.getDeviceData = (c7 << 16) + c8;
            getmessageversion.AuthenticationRequestParameters = (c11 << 16) + c12;
            getMessageVersion.getSDKTransactionID(iArr5);
            int i29 = 0;
            while (true) {
                i13 = getmessageversion.getDeviceData;
                if (i29 >= i23) {
                    break;
                }
                int i31 = i13 ^ iArr5[i29];
                getmessageversion.getDeviceData = i31;
                int sDKReferenceNumber = getMessageVersion.getSDKReferenceNumber(i31);
                Object[] objArr4 = new Object[4];
                objArr4[3] = getmessageversion;
                objArr4[i22] = getmessageversion;
                objArr4[1] = Integer.valueOf(sDKReferenceNumber);
                objArr4[0] = getmessageversion;
                Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(1513246698);
                if (sDKTransactionID3 == null) {
                    int iRgb = (-16774830) - Color.rgb(0, 0, 0);
                    char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int iIndexOf = 19 - TextUtils.indexOf("", "", 0, 0);
                    byte b14 = $$c[3];
                    sDKTransactionID3 = ChallengeResult.getDeviceData(iRgb, minimumFlingVelocity, iIndexOf, -2040903174, false, $$e((byte) 0, b14, (byte) (b14 - 3)), new Class[]{Object.class, cls, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                getmessageversion.getDeviceData = getmessageversion.AuthenticationRequestParameters;
                getmessageversion.AuthenticationRequestParameters = iIntValue;
                i29++;
                i23 = 16;
            }
            int i32 = getmessageversion.AuthenticationRequestParameters;
            getmessageversion.getDeviceData = i32;
            getmessageversion.AuthenticationRequestParameters = i13;
            i23 = 16;
            int i33 = i13 ^ iArr5[16];
            getmessageversion.AuthenticationRequestParameters = i33;
            int i34 = i32 ^ iArr5[17];
            getmessageversion.getDeviceData = i34;
            cArr4[0] = (char) (i34 >>> 16);
            cArr4[1] = (char) i34;
            cArr4[i22] = (char) (i33 >>> 16);
            cArr4[3] = (char) i33;
            getMessageVersion.getSDKTransactionID(iArr5);
            int i35 = getmessageversion.getSDKAppID;
            cArr3[i35 * 2] = cArr4[0];
            cArr3[(i35 * 2) + 1] = cArr4[1];
            cArr3[(i35 * 2) + 2] = cArr4[i22];
            cArr3[(i35 * 2) + 3] = cArr4[3];
            int i36 = i22;
            Object[] objArr5 = new Object[i36];
            objArr5[1] = getmessageversion;
            objArr5[0] = getmessageversion;
            Object sDKTransactionID4 = ChallengeResult.getSDKTransactionID(35442447);
            if (sDKTransactionID4 == null) {
                byte b15 = (byte) 0;
                byte b16 = (byte) (b15 + 2);
                sDKTransactionID4 = ChallengeResult.getDeviceData(1862 - (Process.getElapsedCpuTime() > j12 ? 1 : (Process.getElapsedCpuTime() == j12 ? 0 : -1)), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), ((byte) KeyEvent.getModifierMetaStateMask()) + 41, -562771681, false, $$e(b15, b16, (byte) (b16 - 2)), new Class[]{Object.class, Object.class});
            }
            ((Method) sDKTransactionID4).invoke(null, objArr5);
            i22 = i36;
            c3 = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static atd.c.BuildConfig getDeviceData(atd.c.BuildConfig r19, atd.c.ChallengeResultCancelled r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.a.getSDKTransactionID.getDeviceData(atd.c.BuildConfig, atd.c.ChallengeResultCancelled):atd.c.BuildConfig");
    }

    private byte[] getSDKAppID(byte[] bArr) throws Throwable {
        int i11 = ChallengeResultCompleted + 11;
        int i12 = i11 % 128;
        getTransactionStatus = i12;
        int i13 = i11 % 2;
        Object obj = this.getSDKTransactionID;
        if (i13 != 0) {
            throw null;
        }
        ChallengeResultCompleted = (i12 + 1) % 128;
        try {
            Class cls = (Class) ChallengeResult.AuthenticationRequestParameters(Color.blue(0) + 147, (char) Color.green(0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 32);
            byte[] bArr2 = $$a;
            Object[] objArr = new Object[1];
            a(bArr2[2], bArr2[45], bArr2[51], objArr);
            getSDKEphemeralPublicKey getsdkephemeralpublickey = (getSDKEphemeralPublicKey) cls.getMethod((String) objArr[0], byte[].class).invoke(obj, bArr);
            String sDKReferenceNumber = getsdkephemeralpublickey.getSDKReferenceNumber();
            this.ChallengeResult.add(getsdkephemeralpublickey);
            byte[] bytes = sDKReferenceNumber.getBytes(getSDKReferenceNumber);
            int i14 = ChallengeResultCompleted + 93;
            getTransactionStatus = i14 % 128;
            if (i14 % 2 != 0) {
                int i15 = 1 / 0;
            }
            return bytes;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) throws Throwable {
        Map<String, List<String>> sDKAppID;
        byte[] sDKAppID2;
        getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
        ChallengeResultCancelled challengeResultCancelled = (ChallengeResultCancelled) objArr[1];
        getTransactionStatus.getDeviceData getdevicedataAuthenticationRequestParameters = new getTransactionStatus.getDeviceData().AuthenticationRequestParameters(getsdktransactionid.AuthenticationRequestParameters);
        if (challengeResultCancelled.getSDKTransactionID()) {
            ChallengeResultCompleted = (getTransactionStatus + 23) % 128;
            sDKAppID = AuthenticationRequestParameters.getDeviceData();
        } else {
            sDKAppID = AuthenticationRequestParameters.getSDKAppID();
        }
        byte[] bArrAuthenticationRequestParameters = AuthenticationRequestParameters(challengeResultCancelled);
        if (challengeResultCancelled.getSDKTransactionID()) {
            int i11 = ChallengeResultCompleted + 53;
            getTransactionStatus = i11 % 128;
            if (i11 % 2 != 0) {
                sDKAppID2 = getsdktransactionid.getSDKAppID(bArrAuthenticationRequestParameters);
                int i12 = 80 / 0;
            } else {
                sDKAppID2 = getsdktransactionid.getSDKAppID(bArrAuthenticationRequestParameters);
            }
        } else {
            sDKAppID2 = bArrAuthenticationRequestParameters;
        }
        getdevicedataAuthenticationRequestParameters.getSDKAppID(sDKAppID).getSDKAppID(sDKAppID2);
        if (bArrAuthenticationRequestParameters != null) {
            int i13 = ChallengeResultCompleted + 39;
            getTransactionStatus = i13 % 128;
            int i14 = i13 % 2;
            Arrays.fill(bArrAuthenticationRequestParameters, (byte) 0);
        }
        if (sDKAppID2 != null) {
            Arrays.fill(sDKAppID2, (byte) 0);
        }
        return getdevicedataAuthenticationRequestParameters.AuthenticationRequestParameters();
    }

    public static void init$0() {
        $$a = new byte[]{103, -111, 6, -126, 4, -13, 50, -31, -15, 15, 8, 0, 35, -27, -17, 21, 4, -13, 35, 17, -5, 12, -45, 2, 41, 7, -50, 3, 14, 5, -7, -4, 13, 8, 4, -17, 13, -4, 3, 30, -17, -10, -2, 18, -12, 1, 38, -15, -15, 19, -10, 10, -13, 17, -11, 1};
        $$b = 18;
    }

    public static void init$1() {
        $$c = new byte[]{106, -50, -41, 3};
        $$d = 231;
    }

    public final void getSDKTransactionID() {
        getTransactionStatus = (ChallengeResultCompleted + 1) % 128;
        this.AuthenticationRequestParameters = null;
        Object obj = this.getSDKTransactionID;
        if (obj != null) {
            try {
                Object sDKTransactionID = ChallengeResult.getSDKTransactionID(803075204);
                if (sDKTransactionID == null) {
                    int iMyPid = 147 - (Process.myPid() >> 22);
                    char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                    int iAlpha = 32 - Color.alpha(0);
                    byte[] bArr = $$a;
                    byte b8 = bArr[11];
                    byte b11 = bArr[45];
                    Object[] objArr = new Object[1];
                    a(b8, b11, (byte) (b11 | 8), objArr);
                    sDKTransactionID = ChallengeResult.getDeviceData(iMyPid, cNormalizeMetaState, iAlpha, -206179692, false, (String) objArr[0], new Class[0]);
                }
                ((Method) sDKTransactionID).invoke(obj, null);
                this.getSDKTransactionID = null;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        ArrayList<getSDKEphemeralPublicKey> arrayList = this.ChallengeResult;
        if (arrayList != null) {
            for (getSDKEphemeralPublicKey getsdkephemeralpublickey : arrayList) {
                if (getsdkephemeralpublickey != null) {
                    ChallengeResultCompleted = (getTransactionStatus + 77) % 128;
                    getsdkephemeralpublickey.getSDKAppID();
                }
            }
            this.ChallengeResult.clear();
            this.ChallengeResult = null;
        }
    }

    @Override // atd.d.getDeviceData
    public final int getSDKReferenceNumber() {
        int i11 = getTransactionStatus + 75;
        ChallengeResultCompleted = i11 % 128;
        if (i11 % 2 != 0) {
            return getSDKAppID;
        }
        throw null;
    }

    private getTransactionStatus getSDKReferenceNumber(ChallengeResultCancelled challengeResultCancelled) throws JSONException, GeneralSecurityException {
        int sDKAppID = getSDKEphemeralPublicKey.getSDKTransactionID.getSDKAppID();
        int sDKAppID2 = getSDKEphemeralPublicKey.getSDKTransactionID.getSDKAppID();
        int sDKAppID3 = getSDKEphemeralPublicKey.getSDKTransactionID.getSDKAppID();
        return (getTransactionStatus) getDeviceData(-1466844596, sDKAppID2, 1466844596, getSDKEphemeralPublicKey.getSDKTransactionID.getSDKAppID(), sDKAppID, new Object[]{this, challengeResultCancelled}, sDKAppID3);
    }

    public final Callable<BuildConfig> getSDKAppID(final ChallengeResultCancelled challengeResultCancelled) {
        Callable<BuildConfig> callable = new Callable<BuildConfig>() { // from class: atd.a.getSDKTransactionID.2
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$c = null;
            private static final byte[] $$d = null;
            private static final int $$e = 0;
            private static final int $$f = 0;
            private static int $10;
            private static int $11;
            private static char[] getDeviceData;
            private static int getSDKEphemeralPublicKey;
            private static long getSDKReferenceNumber;
            private static int getSDKTransactionID;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static java.lang.String $$g(int r6, byte r7, short r8) {
                /*
                    int r6 = r6 + 103
                    byte[] r0 = atd.a.getSDKTransactionID.AnonymousClass2.$$c
                    int r7 = r7 + 4
                    int r8 = r8 * 4
                    int r8 = r8 + 1
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L13
                    r3 = r6
                    r6 = r8
                    r5 = r2
                    goto L25
                L13:
                    r3 = r2
                L14:
                    byte r4 = (byte) r6
                    int r5 = r3 + 1
                    r1[r3] = r4
                    if (r5 != r8) goto L21
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L21:
                    int r7 = r7 + 1
                    r3 = r0[r7]
                L25:
                    int r6 = r6 + r3
                    r3 = r5
                    goto L14
                */
                throw new UnsupportedOperationException("Method not decompiled: atd.a.getSDKTransactionID.AnonymousClass2.$$g(int, byte, short):java.lang.String");
            }

            static {
                init$2();
                $10 = 0;
                $11 = 1;
                init$1();
                init$0();
                getSDKTransactionID = 0;
                getSDKEphemeralPublicKey = 1;
                getDeviceData = new char[]{62575, 48082, 27418, 62567, 48069, 27450, 6979, 51852, 31459, 10809, 55905, 35243, 14596, 59773, 39049, 18624, 63544, 43131, 24485, 4090, 48979, 28314, 62585, 48087, 27415, 6994, 51847, 31480, 10809, 55872, 35233, 14596, 59770, 39043, 18636, 63523, 43129, 24481, 4075, 48964, 62575, 48088, 27418, 6996, 51841, 31487, 10810, 55848, 35233, 14597, 59664, 39074, 18635, 63540, 43115, 24481, 62497, 48069, 27399, 6997, 51905, 31485, 10811, 55924, 35232, 14611, 59730, 39113, 18634, 63539, 43132, 24499, 4073, 48921, 28298, 7892, 52751, 32373, 11703, 56808, 36137, 15577, 60637, 39955, 19548, 62372, 41979, 21288, 890, 45801, 25098, 4692, 49551, 29173, 8507, 53620, 64515, 46010, 25453, 62497, 48070, 27404, 6985, 51853, 31417, 10797, 55935, 35261, 14681, 59733, 39043, 18652, 63544, 43131, 24490, 4001, 48976, 28298, 7892, 52751, 32373, 11707, 56793, 36139, 15512, 60639, 39940, 19522, 62387, 41978, 55330, 62497, 48069, 27399, 6997, 51905, 31485, 10811, 55924, 35232, 14611, 59730, 39113, 18634, 63539, 43132, 24499, 4073, 48921, 28298, 7892, 52751, 32373, 11703, 56808, 36137, 15577, 60618, 39956, 19535, 62389, 41975, 21288, 873, 45801, 25105, 4680};
                getSDKReferenceNumber = -4216258004485948490L;
            }

            @SuppressLint({"SyntheticAccessor"})
            private BuildConfig AuthenticationRequestParameters() throws Throwable {
                int i11 = getSDKTransactionID + 19;
                getSDKEphemeralPublicKey = i11 % 128;
                int i12 = i11 % 2;
                getSDKTransactionID getsdktransactionid = getSDKTransactionID.this;
                if (i12 == 0) {
                    getSDKTransactionID.getDeviceData(getsdktransactionid.getDeviceData(challengeResultCancelled), challengeResultCancelled);
                    throw null;
                }
                BuildConfig deviceData = getSDKTransactionID.getDeviceData(getsdktransactionid.getDeviceData(challengeResultCancelled), challengeResultCancelled);
                int i13 = getSDKTransactionID + 79;
                getSDKEphemeralPublicKey = i13 % 128;
                if (i13 % 2 == 0) {
                    int i14 = 99 / 0;
                }
                return deviceData;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static void a(short r6, byte r7, short r8, java.lang.Object[] r9) {
                /*
                    int r8 = r8 * 6
                    int r8 = 103 - r8
                    byte[] r0 = atd.a.getSDKTransactionID.AnonymousClass2.$$d
                    int r7 = r7 * 15
                    int r7 = 26 - r7
                    int r6 = r6 * 25
                    int r6 = 28 - r6
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r3 = r8
                    r5 = r2
                    r8 = r7
                    goto L2b
                L17:
                    r3 = r2
                L18:
                    byte r4 = (byte) r8
                    int r5 = r3 + 1
                    r1[r3] = r4
                    if (r5 != r7) goto L27
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L27:
                    int r6 = r6 + 1
                    r3 = r0[r6]
                L2b:
                    int r8 = r8 + r3
                    int r8 = r8 + (-5)
                    r3 = r5
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: atd.a.getSDKTransactionID.AnonymousClass2.a(short, byte, short, java.lang.Object[]):void");
            }

            /* JADX WARN: Removed duplicated region for block: B:54:0x02ab  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x02ac  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static void b(int r32, char r33, int r34, java.lang.Object[] r35) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 693
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: atd.a.getSDKTransactionID.AnonymousClass2.b(int, char, int, java.lang.Object[]):void");
            }

            private static void c(byte b8, short s7, int i11, Object[] objArr) {
                int i12 = 3 - (b8 * 3);
                int i13 = i11 * 2;
                int i14 = (s7 * 3) + 104;
                byte[] bArr = $$a;
                byte[] bArr2 = new byte[i13 + 4];
                int i15 = i13 + 3;
                int i16 = -1;
                if (bArr == null) {
                    i14 = (i15 + i14) - 2;
                }
                while (true) {
                    i12++;
                    i16++;
                    bArr2[i16] = (byte) i14;
                    if (i16 == i15) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    }
                    i14 = (i14 + bArr[i12]) - 2;
                }
            }

            /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                java.util.NoSuchElementException
                	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
                	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
                	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
                */
            public static java.lang.Object[] getDeviceData(int r34, int r35) {
                /*
                    Method dump skipped, instruction units count: 1417
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: atd.a.getSDKTransactionID.AnonymousClass2.getDeviceData(int, int):java.lang.Object[]");
            }

            public static void init$0() {
                $$a = new byte[]{39, 64, -52, -10, 3, -3, 3};
                $$b = 117;
            }

            public static void init$1() {
                $$d = new byte[]{26, -110, -23, -5, 24, -11, -49, 56, 22, -63, 62, 3, 20, -28, -10, 12, 14, 35, -12, 18, 10, -13, 7, 22, -6, 11, 4, -32, 0, 3, 20, -28, -10, 12, -5, 52, 5, -34, 0};
                $$e = 127;
            }

            public static void init$2() {
                $$c = new byte[]{62, -80, -102, 31};
                $$f = 174;
            }

            @Override // java.util.concurrent.Callable
            @SuppressLint({"SyntheticAccessor"})
            public /* synthetic */ BuildConfig call() throws Exception {
                getSDKEphemeralPublicKey = (getSDKTransactionID + 53) % 128;
                BuildConfig buildConfigAuthenticationRequestParameters = AuthenticationRequestParameters();
                int i11 = getSDKEphemeralPublicKey + 71;
                getSDKTransactionID = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 78 / 0;
                }
                return buildConfigAuthenticationRequestParameters;
            }

            private static void getDeviceData() throws Throwable {
                int i11 = $$e;
                byte[] bArr = $$d;
                byte b8 = bArr[28];
                Object[] objArr = new Object[1];
                a((byte) (i11 & 1), b8, (byte) (b8 + 1), objArr);
                a0.B(null, (String) objArr[0], "AuthenticationRequestParameters");
                int i12 = (getSDKEphemeralPublicKey + 13) % 128;
                getSDKTransactionID = i12;
                getSDKEphemeralPublicKey = (i12 + 77) % 128;
                byte b11 = (byte) (i11 & 1);
                try {
                    byte b12 = bArr[28];
                    Object[] objArr2 = new Object[1];
                    a(b11, b12, (byte) (b12 + 1), objArr2);
                    Class<?> cls = Class.forName((String) objArr2[0]);
                    byte b13 = bArr[28];
                    byte b14 = b13;
                    Object[] objArr3 = new Object[1];
                    a(b14, (byte) (b14 + 1), b13, objArr3);
                    Method method = cls.getMethod((String) objArr3[0], null);
                    method.setAccessible(true);
                    Object objInvoke = method.invoke(null, null);
                    Object[] objArr4 = {atd.as.AuthenticationRequestParameters.class.getField("getSDKAppID").get(null)};
                    Object[] objArr5 = new Object[1];
                    b(TextUtils.getOffsetAfter("", 0), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 3 - Drawable.resolveOpacity(0, 0), objArr5);
                    Method method2 = Set.class.getMethod(((String) objArr5[0]).intern(), Object.class);
                    method2.setAccessible(true);
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
        };
        int i11 = ChallengeResultCompleted + 35;
        getTransactionStatus = i11 % 128;
        if (i11 % 2 == 0) {
            return callable;
        }
        throw null;
    }

    @Override // atd.d.getDeviceData
    public final int getSDKAppID() {
        int sDKAppID = getSDKEphemeralPublicKey.getSDKTransactionID.getSDKAppID();
        int sDKAppID2 = getSDKEphemeralPublicKey.getSDKTransactionID.getSDKAppID();
        int sDKAppID3 = getSDKEphemeralPublicKey.getSDKTransactionID.getSDKAppID();
        return ((Integer) getDeviceData(683254308, sDKAppID2, -683254307, getSDKEphemeralPublicKey.getSDKTransactionID.getSDKAppID(), sDKAppID, new Object[]{this}, sDKAppID3)).intValue();
    }

    private static b0 getSDKTransactionID(byte[] bArr, Charset charset) throws IllegalArgumentException {
        if (charset == null) {
            charset = getSDKReferenceNumber;
        }
        Object[] objArr = {new String(bArr, charset)};
        int sDKAppID = ChallengeResultError.getDeviceData.getSDKAppID();
        int sDKAppID2 = ChallengeResultError.getDeviceData.getSDKAppID();
        return (b0) atd.d.ChallengeResultCancelled.getSDKTransactionID(-526590508, sDKAppID, objArr, 526590510, ChallengeResultError.getDeviceData.getSDKAppID(), ChallengeResultError.getDeviceData.getSDKAppID(), sDKAppID2);
    }

    public final BuildConfig getDeviceData(ChallengeResultCancelled challengeResultCancelled) throws Throwable {
        getAdditionalDetails sDKTransactionID;
        try {
            int sDKAppID = getSDKEphemeralPublicKey.getSDKTransactionID.getSDKAppID();
            int sDKAppID2 = getSDKEphemeralPublicKey.getSDKTransactionID.getSDKAppID();
            int sDKAppID3 = getSDKEphemeralPublicKey.getSDKTransactionID.getSDKAppID();
            getTransactionStatus gettransactionstatus = (getTransactionStatus) getDeviceData(-1466844596, sDKAppID2, 1466844596, getSDKEphemeralPublicKey.getSDKTransactionID.getSDKAppID(), sDKAppID, new Object[]{this, challengeResultCancelled}, sDKAppID3);
            int i11 = ChallengeResultCompleted + 87;
            getTransactionStatus = i11 % 128;
            try {
                if (i11 % 2 != 0) {
                    sDKTransactionID = getSDKTransactionID(gettransactionstatus);
                    int i12 = 76 / 0;
                } else {
                    sDKTransactionID = getSDKTransactionID(gettransactionstatus);
                }
                getTransactionStatus = (ChallengeResultCompleted + 11) % 128;
                return getDeviceData(sDKTransactionID);
            } catch (SocketTimeoutException unused) {
                Object[] objArr = new Object[1];
                b(127 - ExpandableListView.getPackedPositionType(0L), null, null, "\u008f\u0089\u0088\u008e\u008a\u008d\u0082\u008c\u008b\u0089\u008a\u0089\u0083\u0082\u0088\u0087\u0082\u0086\u0082\u0085\u0084\u0083\u0083\u0082\u0081", objArr);
                throw new atd.ac.getSDKAppID(((String) objArr[0]).intern(), atd.h.getSDKReferenceNumber.TRANSACTION_TIMED_OUT, atd.am.getSDKEphemeralPublicKey.POST_MESSAGE_RESPONSE_TIMEOUT);
            } catch (IOException unused2) {
                Object[] objArr2 = new Object[1];
                c(new int[]{1051000479, -1634189998, 821346503, -1809195989, 112261941, -181248760, -1868379561, 1196258023, -749753675, 743288318, 515624273, -1348715690, -1402162307, -111587219, 98088249, 106461669}, 30 - TextUtils.getCapsMode("", 0, 0), objArr2);
                throw new atd.ac.getSDKAppID(((String) objArr2[0]).intern(), atd.h.getSDKReferenceNumber.SYSTEM_CONNECTION_FAILURE, atd.am.getSDKEphemeralPublicKey.POST_ERROR_ESTABLISHING_CONNECTION);
            }
        } catch (GeneralSecurityException | JSONException e5) {
            a.m(e5);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (r0.length <= 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        r12 = atd.d.getSDKReferenceNumber.getDeviceData((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) atd.d.getAdditionalDetails.getSDKTransactionID(atd.y.timedout.AuthenticationRequestParameters.getSDKAppID(), atd.y.timedout.AuthenticationRequestParameters.getSDKAppID(), atd.y.timedout.AuthenticationRequestParameters.getSDKAppID(), atd.y.timedout.AuthenticationRequestParameters.getSDKAppID(), new java.lang.Object[]{r12}, 952058546, -952058545));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
    
        if (r12 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        atd.a.getSDKTransactionID.getTransactionStatus = (atd.a.getSDKTransactionID.ChallengeResultCompleted + 17) % 128;
        r2 = r12.AuthenticationRequestParameters();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0070, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
    
        if (r12 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
    
        atd.a.getSDKTransactionID.ChallengeResultCompleted = (atd.a.getSDKTransactionID.getTransactionStatus + 65) % 128;
        r12 = r12.getDeviceData();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0080, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0084, code lost:
    
        if (r2 != atd.d.getSDKReferenceNumber.getDeviceData.APPLICATION_JOSE) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0086, code lost:
    
        atd.a.getSDKTransactionID.ChallengeResultCompleted = (atd.a.getSDKTransactionID.getTransactionStatus + 41) % 128;
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0090, code lost:
    
        atd.a.getSDKTransactionID.ChallengeResultCompleted = (atd.a.getSDKTransactionID.getTransactionStatus + 75) % 128;
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0099, code lost:
    
        if (r4 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009b, code lost:
    
        r0 = getDeviceData(r0, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009f, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a1, code lost:
    
        r2 = new java.lang.Object[1];
        b(127 - android.view.View.resolveSize(0, 0), null, null, "\u008f\u0082\u0083\u0096\u008e\u0095\u0083\u0082\u0086\u0082\u0085\u0084\u0083\u0083\u0082\u0081\u008a\u0089\u0095\u0094\u0093\u0092\u0082\u008d\u008a\u008e\u0089\u008a\u008d\u0082\u0091\u008b\u0084\u0090", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bf, code lost:
    
        throw new atd.ac.getSDKAppID(((java.lang.String) r2[0]).intern(), atd.h.getSDKReferenceNumber.DATA_DECRYPTION_FAILURE, atd.am.getSDKEphemeralPublicKey.PARSE_MESSAGE_DECRYPTION_FAILURE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c0, code lost:
    
        if (r4 != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c4, code lost:
    
        if (r2 != atd.d.getSDKReferenceNumber.getDeviceData.APPLICATION_JSON) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c7, code lost:
    
        r2 = new java.lang.Object[1];
        b(android.graphics.ImageFormat.getBitsPerPixel(0) + 128, null, null, "\u008f\u0084\u0089\u0084\u008d\u008a\u009c\u009b\u009a\u0099\u008a\u0082\u0089\u0084\u0092\u008b\u008d\u0096\u008b\u008a\u0089\u008e\u0096\u008a\u0083\u0082\u008e\u008d\u008a\u0093\u0082\u008d\u0084\u0082\u009d\u008a\u0082\u0083\u0096\u008e\u0095\u0083\u0082\u0086", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e5, code lost:
    
        throw new atd.ac.getSDKAppID(((java.lang.String) r2[0]).intern(), atd.h.getSDKReferenceNumber.MESSAGE_RECEIVED_INVALID, atd.am.getSDKEphemeralPublicKey.PARSE_MESSAGE_CONTENT_TYPE_MISSING);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e6, code lost:
    
        r12 = getSDKTransactionID(r6, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ea, code lost:
    
        if (r6 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ec, code lost:
    
        java.util.Arrays.fill(r6, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ef, code lost:
    
        r12 = atd.c.BuildConfig.AuthenticationRequestParameters(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f3, code lost:
    
        if (r4 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f9, code lost:
    
        if (r12.AuthenticationRequestParameters() != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fb, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fc, code lost:
    
        r2 = new java.lang.Object[1];
        c(new int[]{-1599326896, -1204961747, -1273060712, 1372848882, 1094539716, 1809841473, 1179761697, 1247343349, 581838661, -1283184715, -1807539155, 103370718, 623146112, -359005666, -1918647478, -806956233, 769461287, -744410648, -2003309179, -1617238569, -470078624, 176319309, 883057141, -1975833436, 745992612, -1651146708, 1213876657, 1784645432}, 53 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0122, code lost:
    
        throw new atd.ac.getSDKAppID(((java.lang.String) r2[0]).intern(), atd.h.getSDKReferenceNumber.MESSAGE_RECEIVED_INVALID, atd.am.getSDKEphemeralPublicKey.PARSE_MESSAGE_CONTENT_NOT_ENCRYPTED);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0123, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0124, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0127, code lost:
    
        r4 = new java.lang.Object[1];
        b(android.view.View.MeasureSpec.getSize(0) + 127, null, null, "\u008f\u009c\u009b\u009a\u0099\u008a\u008d\u008b\u0091\u0084\u0098\u0096\u0097", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0145, code lost:
    
        throw new atd.ac.getSDKAppID(((java.lang.String) r4[0]).intern(), atd.h.getSDKReferenceNumber.MESSAGE_RECEIVED_INVALID, atd.am.getSDKEphemeralPublicKey.PARSE_MESSAGE_INVALID_JSON);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0034, code lost:
    
        if (r0.length <= 0) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private atd.c.BuildConfig getDeviceData(atd.d.getAdditionalDetails r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.a.getSDKTransactionID.getDeviceData(atd.d.getAdditionalDetails):atd.c.BuildConfig");
    }

    private byte[] getDeviceData(byte[] bArr, Charset charset) throws Throwable {
        if (charset == null) {
            charset = getSDKReferenceNumber;
        }
        atd.ae.getSDKEphemeralPublicKey sDKAppID = atd.ae.getSDKEphemeralPublicKey.getSDKAppID(new String(bArr, charset));
        Object obj = this.getSDKTransactionID;
        try {
            Class cls = (Class) ChallengeResult.AuthenticationRequestParameters((ViewConfiguration.getKeyRepeatDelay() >> 16) + 147, (char) Color.green(0), ImageFormat.getBitsPerPixel(0) + 33);
            byte[] bArr2 = $$a;
            byte b8 = (byte) (-bArr2[54]);
            byte b11 = bArr2[11];
            Object[] objArr = new Object[1];
            a(b8, b11, b11, objArr);
            byte[] bArr3 = (byte[]) cls.getMethod((String) objArr[0], atd.ae.getSDKEphemeralPublicKey.class).invoke(obj, sDKAppID);
            sDKAppID.getSDKAppID();
            return bArr3;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public static /* synthetic */ Object getDeviceData(int i11, int i12, int i13, int i14, int i15, Object[] objArr, int i16) {
        int i17 = ~i11;
        int i18 = ~i13;
        int i19 = ~(i17 | i18);
        int i21 = (~(i17 | i15)) | i19;
        int i22 = (~((~i15) | i17 | i13)) | (~(i18 | i11));
        int i23 = (-1238368256) * i12;
        int i24 = (-45088768) * i16;
        int i25 = ((-419430400) * i14) + i24 + i23 + ((-1010133554) * i22) + (i21 * (-1010133554)) + (i19 * (-1010133554)) + ((-228234701) * i13) + (i11 * (-228234701)) + 730857472;
        int iC = a0.c(i14, -608630064, (531708263 * i16) + i11 + i13 + i12);
        if (a0.e(iC, -865337344, (i14 * 2062148848) + (i16 * (-166744051)) + (i12 * (-1679524245)) + (i22 * 282) + (i21 * 282) + (i19 * 282) + (i13 * (-1679524527)) + ((i11 * (-1679524527)) - 150938974), -1617166336, ((-1471938560) * iC) + i25) != 1) {
            return getSDKReferenceNumber(objArr);
        }
        int i26 = (ChallengeResultCompleted + 71) % 128;
        getTransactionStatus = i26;
        int i27 = getDeviceData;
        ChallengeResultCompleted = (i26 + 109) % 128;
        return Integer.valueOf(i27);
    }

    public static void getDeviceData() {
        getSDKEphemeralPublicKey = new char[]{21614, 21638, 21680, 21634, 21636, 21651, 21682, 21686, 21681, 21597, 21642, 21646, 21633, 21644, 21583, 21607, 21641, 21632, 21683, 21690, 21645, 21647, 21610, 21687, 21611, 21648, 21612, 21615, 21637, 21602, 21600, 21601, 21608};
        getMessageVersion = 1286296637;
        ChallengeResultCancelled = true;
        BuildConfig = true;
        getAdditionalDetails = new int[]{-721975997, 2144939668, 539249199, -1014696950, 956823840, -334741746, 2140257922, -197723493, 2054934868, 1462899999, 602062355, 41603849, 377967726, 1560904613, 1611044701, 683048731, -1287282733, 2070371029};
    }
}
