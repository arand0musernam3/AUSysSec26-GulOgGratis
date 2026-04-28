package atd.bc;

import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.n.getSDKAppID;
import com.app.tgtg.model.local.AppConstants;
import com.braze.Constants;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import org.bouncycastle.i18n.LocalizedMessage;
import org.json.JSONException;
import org.json.JSONObject;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getSDKReferenceNumber {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int BuildConfig;
    private static boolean ChallengeResult;
    private static int ChallengeResultCancelled;
    private static int ChallengeResultError;
    private static final Charset getDeviceData;
    private static int getMessageVersion;
    private static int getSDKAppID;
    private static boolean getSDKEphemeralPublicKey;
    private static char[] getSDKTransactionID;
    private final Charset AuthenticationRequestParameters;
    private final int getSDKReferenceNumber;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, byte r7, short r8) {
        /*
            int r7 = r7 * 4
            int r7 = r7 + 4
            int r6 = r6 * 3
            int r0 = r6 + 1
            byte[] r1 = atd.bc.getSDKReferenceNumber.$$a
            int r8 = r8 * 4
            int r8 = 115 - r8
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r1
            r4 = r2
            r1 = r8
            r8 = r7
            goto L2d
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L26:
            r3 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r1
            r1 = r5
        L2d:
            int r7 = -r7
            int r8 = r8 + 1
            int r7 = r7 + r1
            r1 = r8
            r8 = r7
            r7 = r1
            r1 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.bc.getSDKReferenceNumber.$$c(short, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        BuildConfig = 0;
        ChallengeResultError = 1;
        ChallengeResultCancelled = 0;
        getMessageVersion = 1;
        getDeviceData();
        ViewConfiguration.getWindowTouchSlop();
        getDeviceData = atd.e.getSDKAppID.getSDKAppID;
        BuildConfig = (ChallengeResultError + 121) % 128;
    }

    private getSDKReferenceNumber(Charset charset, int i11) {
        this.AuthenticationRequestParameters = charset;
        this.getSDKReferenceNumber = i11;
    }

    private byte[] ChallengeResult(String str) {
        int i11 = ChallengeResultCancelled + 91;
        getMessageVersion = i11 % 128;
        int i12 = i11 % 2;
        Charset charset = this.AuthenticationRequestParameters;
        if (i12 == 0) {
            str.getBytes(charset);
            throw null;
        }
        byte[] bytes = str.getBytes(charset);
        ChallengeResultCancelled = (getMessageVersion + 33) % 128;
        return bytes;
    }

    private static void a(int i11, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        int i12;
        char[] cArr;
        int i13;
        char[] cArr2;
        int i14;
        String str3 = str2;
        int i15 = 2;
        int i16 = 0;
        Object bytes = str3;
        if (str3 != null) {
            int i17 = $11 + 65;
            $10 = i17 % 128;
            if (i17 % 2 != 0) {
                int i18 = 96 / 0;
                bytes = str3.getBytes(LocalizedMessage.DEFAULT_ENCODING);
            } else {
                bytes = str3.getBytes(LocalizedMessage.DEFAULT_ENCODING);
            }
        }
        byte[] bArr = (byte[]) bytes;
        char[] charArray = str != null ? str.toCharArray() : str;
        atd.bb.ChallengeResultTimeout challengeResultTimeout = new atd.bb.ChallengeResultTimeout();
        char[] cArr3 = getSDKTransactionID;
        Class cls = Integer.TYPE;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            $11 = ($10 + 47) % 128;
            int i19 = 0;
            while (i19 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i19])};
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(887083134);
                    if (sDKTransactionID == null) {
                        int iCombineMeasuredStates = View.combineMeasuredStates(i16, i16) + 2555;
                        char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(i16) + 48598);
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 31;
                        byte b8 = $$a[i16];
                        i14 = i15;
                        byte b11 = (byte) (b8 - 1);
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData(iCombineMeasuredStates, cNormalizeMetaState, maximumDrawingCacheSize, -390605202, false, $$c(b11, b11, b8), new Class[]{cls});
                    } else {
                        i14 = i15;
                    }
                    cArr4[i19] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    i19++;
                    i15 = i14;
                    i16 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        int i21 = i15;
        Object[] objArr3 = {Integer.valueOf(getSDKAppID)};
        Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(-1144184369);
        if (sDKTransactionID2 == null) {
            sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData((Process.myTid() >> 22) + 147, (char) View.combineMeasuredStates(0, 0), 31 - ExpandableListView.getPackedPositionChild(0L), 1738876895, false, Constants.BRAZE_PUSH_TITLE_KEY, new Class[]{cls});
        }
        int iIntValue = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
        if (ChallengeResult) {
            int i22 = $10 + 67;
            $11 = i22 % 128;
            if (i22 % 2 == 0) {
                int length2 = bArr.length;
                challengeResultTimeout.AuthenticationRequestParameters = length2;
                cArr2 = new char[length2];
                i13 = 0;
            } else {
                i13 = 0;
                int length3 = bArr.length;
                challengeResultTimeout.AuthenticationRequestParameters = length3;
                cArr2 = new char[length3];
            }
            challengeResultTimeout.getSDKAppID = i13;
            while (true) {
                int i23 = challengeResultTimeout.getSDKAppID;
                int i24 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i23 >= i24) {
                    objArr[0] = new String(cArr2);
                    return;
                }
                cArr2[i23] = (char) (cArr3[bArr[(i24 - 1) - i23] + i11] - iIntValue);
                Object[] objArr4 = new Object[i21];
                objArr4[1] = challengeResultTimeout;
                objArr4[0] = challengeResultTimeout;
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(1124287645);
                if (sDKTransactionID3 == null) {
                    int i25 = 1698 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                    int maximumDrawingCacheSize2 = 29 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    byte b12 = (byte) ($$a[0] - 1);
                    byte b13 = b12;
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(i25, capsMode, maximumDrawingCacheSize2, -1620360563, false, $$c(b12, b13, b13), new Class[]{Object.class, Object.class});
                }
                ((Method) sDKTransactionID3).invoke(null, objArr4);
                i21 = 2;
            }
        } else if (getSDKEphemeralPublicKey) {
            int i26 = $11 + 117;
            $10 = i26 % 128;
            if (i26 % 2 != 0) {
                int length4 = charArray.length;
                challengeResultTimeout.AuthenticationRequestParameters = length4;
                cArr = new char[length4];
                i12 = 0;
            } else {
                i12 = 0;
                int length5 = charArray.length;
                challengeResultTimeout.AuthenticationRequestParameters = length5;
                cArr = new char[length5];
            }
            challengeResultTimeout.getSDKAppID = i12;
            while (true) {
                int i27 = challengeResultTimeout.getSDKAppID;
                int i28 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i27 >= i28) {
                    objArr[0] = new String(cArr);
                    return;
                }
                cArr[i27] = (char) (cArr3[charArray[(i28 - 1) - i27] - i11] - iIntValue);
                Object[] objArr5 = {challengeResultTimeout, challengeResultTimeout};
                Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(1124287645);
                if (sDKTransactionID4 == null) {
                    int i29 = 1697 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29;
                    byte b14 = (byte) ($$a[0] - 1);
                    byte b15 = b14;
                    sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(i29, jumpTapTimeout, scrollBarFadeDuration, -1620360563, false, $$c(b14, b15, b15), new Class[]{Object.class, Object.class});
                }
                ((Method) sDKTransactionID4).invoke(null, objArr5);
            }
        } else {
            int length6 = iArr.length;
            challengeResultTimeout.AuthenticationRequestParameters = length6;
            char[] cArr5 = new char[length6];
            challengeResultTimeout.getSDKAppID = 0;
            $10 = ($11 + 41) % 128;
            while (true) {
                int i31 = challengeResultTimeout.getSDKAppID;
                int i32 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i31 >= i32) {
                    objArr[0] = new String(cArr5);
                    return;
                } else {
                    cArr5[i31] = (char) (cArr3[iArr[(i32 - 1) - i31] - i11] - iIntValue);
                    challengeResultTimeout.getSDKAppID = i31 + 1;
                }
            }
        }
    }

    public static void getDeviceData() {
        getSDKTransactionID = new char[]{21763, 21705, 21788, 21734, 21746, 21791, 21766, 21823, 21789, 21760, 21745, 21758, 21762, 21711, 21710, 21701};
        getSDKAppID = 1286296737;
        getSDKEphemeralPublicKey = true;
        ChallengeResult = true;
    }

    public static getSDKReferenceNumber getSDKAppID(Charset charset) {
        getMessageVersion = (ChallengeResultCancelled + 9) % 128;
        getSDKReferenceNumber getsdkreferencenumber = (getSDKReferenceNumber) getSDKReferenceNumber(-2013422705, new Object[]{charset, new int[]{11}}, getSDKAppID.getSDKReferenceNumber.getDeviceData(), getSDKAppID.getSDKReferenceNumber.getDeviceData(), getSDKAppID.getSDKReferenceNumber.getDeviceData(), getSDKAppID.getSDKReferenceNumber.getDeviceData(), 2013422706);
        ChallengeResultCancelled = (getMessageVersion + 77) % 128;
        return getsdkreferencenumber;
    }

    public static /* synthetic */ Object getSDKReferenceNumber(int i11, Object[] objArr, int i12, int i13, int i14, int i15, int i16) {
        int i17 = ~i11;
        int i18 = ~i16;
        int i19 = ~(i17 | i18);
        int i21 = (~(i17 | i13)) | i19 | (~(i18 | i13));
        int i22 = ~i13;
        int i23 = (~(i22 | i18 | i11)) | (~(i17 | i22 | i16));
        int i24 = (-1389494272) * i14;
        int i25 = (1623064576 * i15) + i24 + (1843789824 * i12) + ((-42925423) * i23) + (i19 * (-42925423)) + (i21 * (-42925423)) + (1886715248 * i16) + (i11 * 1886715248) + 940376064;
        int iC = a0.c(i15, -904719387, ((-195996979) * i14) + i11 + i16 + i12);
        int i26 = i19 * 737;
        int i27 = i23 * 737;
        int i28 = i12 * 1590985553;
        int i29 = i14 * (-1025631779);
        int i31 = i15 * 1121679989;
        int iE = a0.e(iC, 622657536, i31 + i29 + i28 + i27 + i26 + (i21 * 737) + (i16 * 1590984816) + (i11 * 1590984816) + 1398186415, -1928134656, (1510801408 * iC) + i25);
        if (iE != 1) {
            if (iE != 2) {
                String str = new String((byte[]) objArr[1], ((getSDKReferenceNumber) objArr[0]).AuthenticationRequestParameters);
                getMessageVersion = (ChallengeResultCancelled + 107) % 128;
                return str;
            }
            getSDKReferenceNumber getsdkreferencenumber = (getSDKReferenceNumber) objArr[0];
            String str2 = (String) objArr[1];
            getMessageVersion = (ChallengeResultCancelled + 121) % 128;
            String str3 = (String) getSDKReferenceNumber(-849146359, new Object[]{getsdkreferencenumber, getsdkreferencenumber.getSDKAppID(str2)}, getSDKAppID.getSDKReferenceNumber.getDeviceData(), getSDKAppID.getSDKReferenceNumber.getDeviceData(), getSDKAppID.getSDKReferenceNumber.getDeviceData(), getSDKAppID.getSDKReferenceNumber.getDeviceData(), 849146359);
            getMessageVersion = (ChallengeResultCancelled + 27) % 128;
            return str3;
        }
        Charset charset = (Charset) objArr[0];
        int[] iArr = (int[]) objArr[1];
        int length = iArr.length;
        int i32 = 0;
        int i33 = 0;
        while (i32 <= 0) {
            int i34 = (getMessageVersion + 99) % 128;
            ChallengeResultCancelled = i34;
            int i35 = iArr[0];
            i32++;
            getMessageVersion = (i34 + 67) % 128;
            i33 = i35;
        }
        return new getSDKReferenceNumber(charset, i33);
    }

    public static getSDKReferenceNumber getSDKTransactionID() {
        ChallengeResultCancelled = (getMessageVersion + 109) % 128;
        getSDKReferenceNumber getsdkreferencenumber = (getSDKReferenceNumber) getSDKReferenceNumber(-2013422705, new Object[]{getDeviceData, new int[]{11}}, getSDKAppID.getSDKReferenceNumber.getDeviceData(), getSDKAppID.getSDKReferenceNumber.getDeviceData(), getSDKAppID.getSDKReferenceNumber.getDeviceData(), getSDKAppID.getSDKReferenceNumber.getDeviceData(), 2013422706);
        int i11 = ChallengeResultCancelled + 107;
        getMessageVersion = i11 % 128;
        if (i11 % 2 != 0) {
            return getsdkreferencenumber;
        }
        throw null;
    }

    public static void init$0() {
        $$a = new byte[]{1, 2, 88, 62};
        $$b = 200;
    }

    public final JSONObject AuthenticationRequestParameters(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(getDeviceData(str));
        int i11 = getMessageVersion + 3;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 == 0) {
            return jSONObject;
        }
        throw null;
    }

    private static byte[] getDeviceData(byte[] bArr) {
        int i11 = ChallengeResultCancelled + 39;
        getMessageVersion = i11 % 128;
        try {
            bArr = i11 % 2 == 0 ? Base64.decode(bArr, 108) : Base64.decode(bArr, 8);
            return bArr;
        } catch (IllegalArgumentException unused) {
            return Base64.decode(bArr, 0);
        }
    }

    public final String getDeviceData(String str) {
        return (String) getSDKReferenceNumber(106455532, new Object[]{this, str}, getSDKAppID.getSDKReferenceNumber.getDeviceData(), getSDKAppID.getSDKReferenceNumber.getDeviceData(), getSDKAppID.getSDKReferenceNumber.getDeviceData(), getSDKAppID.getSDKReferenceNumber.getDeviceData(), -106455530);
    }

    private String AuthenticationRequestParameters(byte[] bArr) {
        String str = new String(bArr, this.AuthenticationRequestParameters);
        int i11 = ChallengeResultCancelled + 107;
        getMessageVersion = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 93 / 0;
        }
        return str;
    }

    public final Charset getSDKAppID() {
        int i11 = getMessageVersion;
        Charset charset = this.AuthenticationRequestParameters;
        ChallengeResultCancelled = (i11 + 51) % 128;
        return charset;
    }

    public final String getSDKAppID(byte[] bArr) {
        getMessageVersion = (ChallengeResultCancelled + 27) % 128;
        String strAuthenticationRequestParameters = AuthenticationRequestParameters(getSDKTransactionID(bArr));
        ChallengeResultCancelled = (getMessageVersion + 19) % 128;
        return strAuthenticationRequestParameters;
    }

    public final byte[] getSDKAppID(String str) {
        int i11 = ChallengeResultCancelled + 99;
        getMessageVersion = i11 % 128;
        int i12 = i11 % 2;
        byte[] bArrChallengeResult = ChallengeResult(str);
        if (i12 != 0) {
            return getDeviceData(bArrChallengeResult);
        }
        getDeviceData(bArrChallengeResult);
        throw null;
    }

    public final byte[] getSDKTransactionID(byte[] bArr) {
        int i11 = getMessageVersion + 65;
        ChallengeResultCancelled = i11 % 128;
        int i12 = i11 % 2;
        int i13 = this.getSDKReferenceNumber;
        if (i12 != 0) {
            Base64.encode(bArr, i13);
            throw null;
        }
        byte[] bArrEncode = Base64.encode(bArr, i13);
        int i14 = ChallengeResultCancelled + 41;
        getMessageVersion = i14 % 128;
        if (i14 % 2 != 0) {
            return bArrEncode;
        }
        throw null;
    }

    public final String getSDKTransactionID(String str) {
        int i11 = getMessageVersion + 27;
        ChallengeResultCancelled = i11 % 128;
        int i12 = i11 % 2;
        byte[] bytes = str.getBytes(this.AuthenticationRequestParameters);
        if (i12 != 0) {
            getSDKAppID(bytes);
            throw null;
        }
        String sDKAppID = getSDKAppID(bytes);
        int i13 = getMessageVersion + AppConstants.RESULT_CODE_ORDER_CANCELLED;
        ChallengeResultCancelled = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 92 / 0;
        }
        return sDKAppID;
    }

    private static getSDKReferenceNumber getSDKTransactionID(Charset charset, int... iArr) {
        return (getSDKReferenceNumber) getSDKReferenceNumber(-2013422705, new Object[]{charset, iArr}, getSDKAppID.getSDKReferenceNumber.getDeviceData(), getSDKAppID.getSDKReferenceNumber.getDeviceData(), getSDKAppID.getSDKReferenceNumber.getDeviceData(), getSDKAppID.getSDKReferenceNumber.getDeviceData(), 2013422706);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004b, code lost:
    
        if (r6.matches(((java.lang.String) r5[0]).intern()) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0031, code lost:
    
        if (r6.matches(((java.lang.String) r5[0]).intern()) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean getSDKReferenceNumber(java.lang.String r6) throws java.lang.Throwable {
        /*
            int r0 = atd.bc.getSDKReferenceNumber.getMessageVersion
            int r1 = r0 + 47
            int r1 = r1 % 128
            atd.bc.getSDKReferenceNumber.ChallengeResultCancelled = r1
            r1 = 1
            r2 = 0
            if (r6 == 0) goto L4f
            int r0 = r0 + 119
            int r3 = r0 % 128
            atd.bc.getSDKReferenceNumber.ChallengeResultCancelled = r3
            int r0 = r0 % 2
            java.lang.String r3 = "\u0090\u008f\u008e\u008d\u008c\u0085\u008b\u008a\u0085\u0089\u0088\u0085\u0087\u0086\u0085\u0084\u0083\u0082\u0081"
            r4 = 0
            if (r0 == 0) goto L34
            r0 = 10
            int r5 = android.view.View.combineMeasuredStates(r1, r2)
            int r0 = r0 / r5
            java.lang.Object[] r5 = new java.lang.Object[r1]
            a(r0, r4, r4, r3, r5)
            r0 = r5[r2]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            boolean r6 = r6.matches(r0)
            if (r6 == 0) goto L4e
            goto L4f
        L34:
            int r0 = android.view.View.combineMeasuredStates(r2, r2)
            int r0 = 127 - r0
            java.lang.Object[] r5 = new java.lang.Object[r1]
            a(r0, r4, r4, r3, r5)
            r0 = r5[r2]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            boolean r6 = r6.matches(r0)
            if (r6 == 0) goto L4e
            goto L4f
        L4e:
            return r2
        L4f:
            int r6 = atd.bc.getSDKReferenceNumber.getMessageVersion
            int r6 = r6 + 73
            int r0 = r6 % 128
            atd.bc.getSDKReferenceNumber.ChallengeResultCancelled = r0
            int r6 = r6 % 2
            if (r6 == 0) goto L5d
            r6 = 6
            int r6 = r6 / r2
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.bc.getSDKReferenceNumber.getSDKReferenceNumber(java.lang.String):boolean");
    }

    private String getSDKReferenceNumber(byte[] bArr) {
        return (String) getSDKReferenceNumber(-849146359, new Object[]{this, bArr}, getSDKAppID.getSDKReferenceNumber.getDeviceData(), getSDKAppID.getSDKReferenceNumber.getDeviceData(), getSDKAppID.getSDKReferenceNumber.getDeviceData(), getSDKAppID.getSDKReferenceNumber.getDeviceData(), 849146359);
    }
}
