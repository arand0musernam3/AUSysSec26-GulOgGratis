package atd.as;

import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.adyen.threeds2.Warning;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/security/warning/UnsupportedOsWarning;", "Lcom/adyen/threeds2/Warning;", "<init>", "()V", "getID", "", "getMessage", "getSeverity", "Lcom/adyen/threeds2/Warning$Severity;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeResult implements Warning {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int getDeviceData;
    private static int getMessageVersion;
    private static int[] getSDKAppID;

    @NotNull
    public static final ChallengeResult getSDKReferenceNumber;
    private static int getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r5, int r6, byte r7) {
        /*
            int r6 = r6 * 2
            int r0 = 1 - r6
            int r7 = r7 + 112
            int r5 = r5 * 3
            int r5 = 3 - r5
            byte[] r1 = atd.as.ChallengeResult.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r5 = r5 + 1
            int r4 = r3 + 1
            if (r3 != r6) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L26:
            r3 = r1[r5]
        L28:
            int r3 = -r3
            int r7 = r7 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.as.ChallengeResult.$$c(byte, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKTransactionID = 0;
        getMessageVersion = 1;
        getDeviceData = 0;
        AuthenticationRequestParameters = 1;
        getDeviceData();
        getSDKReferenceNumber = new ChallengeResult();
        getMessageVersion = (getSDKTransactionID + 125) % 128;
    }

    private ChallengeResult() {
    }

    private static void a(int[] iArr, int i11, Object[] objArr) throws Throwable {
        int i12;
        int i13;
        int i14;
        int i15;
        char c3;
        char[] cArr;
        int[] iArr2;
        int i16;
        int i17;
        int i18;
        atd.bb.getMessageVersion getmessageversion = new atd.bb.getMessageVersion();
        char[] cArr2 = new char[4];
        int i19 = 2;
        char[] cArr3 = new char[iArr.length * 2];
        int[] iArr3 = getSDKAppID;
        int i21 = -1667528016;
        Class cls = Integer.TYPE;
        int i22 = 16;
        int i23 = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i24 = 0;
            while (i24 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i24])};
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(i21);
                    if (sDKTransactionID == null) {
                        i17 = i21;
                        i16 = i19;
                        byte b8 = (byte) i23;
                        i18 = i22;
                        byte b11 = b8;
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData(2224 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (53070 - (ViewConfiguration.getPressedStateDuration() >> 16)), (ViewConfiguration.getPressedStateDuration() >> 16) + 21, 1089703072, false, $$c(b8, b11, (byte) (b11 + 2)), new Class[]{cls});
                    } else {
                        i16 = i19;
                        i17 = i21;
                        i18 = i22;
                    }
                    iArr4[i24] = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
                    i24++;
                    i19 = i16;
                    i22 = i18;
                    i21 = i17;
                    i23 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            i12 = i19;
            i13 = i21;
            i14 = i22;
            i15 = 53070;
            $11 = ($10 + 73) % 128;
            iArr3 = iArr4;
        } else {
            i12 = 2;
            i13 = -1667528016;
            i14 = 16;
            i15 = 53070;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = getSDKAppID;
        if (iArr6 != null) {
            $10 = ($11 + 13) % 128;
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i25 = 0;
            while (i25 < length3) {
                Object[] objArr3 = {Integer.valueOf(iArr6[i25])};
                Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(i13);
                if (sDKTransactionID2 == null) {
                    cArr = cArr2;
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    iArr2 = iArr6;
                    sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(Process.getGidForName("") + 2224, (char) (i15 - KeyEvent.getDeadChar(0, 0)), 21 - (Process.myPid() >> 22), 1089703072, false, $$c(b12, b13, (byte) (b13 + 2)), new Class[]{cls});
                } else {
                    cArr = cArr2;
                    iArr2 = iArr6;
                }
                iArr7[i25] = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
                i25++;
                cArr2 = cArr;
                iArr6 = iArr2;
            }
            iArr6 = iArr7;
        }
        char[] cArr4 = cArr2;
        char c7 = 0;
        System.arraycopy(iArr6, 0, iArr5, 0, length2);
        getmessageversion.getSDKAppID = 0;
        while (true) {
            int i26 = getmessageversion.getSDKAppID;
            if (i26 >= iArr.length) {
                break;
            }
            int i27 = iArr[i26];
            char c8 = (char) (i27 >> 16);
            cArr4[c7] = c8;
            char c11 = (char) i27;
            char c12 = 1;
            cArr4[1] = c11;
            char c13 = (char) (iArr[i26 + 1] >> 16);
            cArr4[i12] = c13;
            char c14 = (char) iArr[i26 + 1];
            cArr4[3] = c14;
            getmessageversion.getDeviceData = (c8 << 16) + c11;
            getmessageversion.AuthenticationRequestParameters = (c13 << 16) + c14;
            atd.bb.getMessageVersion.getSDKTransactionID(iArr5);
            int i28 = 0;
            while (i28 < i14) {
                int i29 = $10 + 31;
                $11 = i29 % 128;
                int i31 = i29 % 2;
                int i32 = getmessageversion.getDeviceData;
                if (i31 == 0) {
                    int i33 = iArr5[i28] ^ i32;
                    getmessageversion.getDeviceData = i33;
                    int sDKReferenceNumber = atd.bb.getMessageVersion.getSDKReferenceNumber(i33);
                    Object[] objArr4 = new Object[4];
                    objArr4[3] = getmessageversion;
                    objArr4[i12] = getmessageversion;
                    objArr4[c12] = Integer.valueOf(sDKReferenceNumber);
                    objArr4[0] = getmessageversion;
                    Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(1513246698);
                    if (sDKTransactionID3 == null) {
                        byte b14 = (byte) 0;
                        byte b15 = b14;
                        sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(2385 - TextUtils.indexOf((CharSequence) "", '0'), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 19 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -2040903174, false, $$c(b14, b15, b15), new Class[]{Object.class, cls, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                    getmessageversion.getDeviceData = getmessageversion.AuthenticationRequestParameters;
                    getmessageversion.AuthenticationRequestParameters = iIntValue;
                    i28 += 84;
                } else {
                    int i34 = iArr5[i28] ^ i32;
                    getmessageversion.getDeviceData = i34;
                    int sDKReferenceNumber2 = atd.bb.getMessageVersion.getSDKReferenceNumber(i34);
                    Object[] objArr5 = new Object[4];
                    objArr5[3] = getmessageversion;
                    objArr5[i12] = getmessageversion;
                    objArr5[c12] = Integer.valueOf(sDKReferenceNumber2);
                    objArr5[0] = getmessageversion;
                    Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(1513246698);
                    if (sDKTransactionID4 == null) {
                        byte b16 = (byte) 0;
                        byte b17 = b16;
                        c3 = c12;
                        sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(2386 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (Process.myTid() >> 22), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 18, -2040903174, false, $$c(b16, b17, b17), new Class[]{Object.class, cls, Object.class, Object.class});
                    } else {
                        c3 = c12;
                    }
                    int iIntValue2 = ((Integer) ((Method) sDKTransactionID4).invoke(null, objArr5)).intValue();
                    getmessageversion.getDeviceData = getmessageversion.AuthenticationRequestParameters;
                    getmessageversion.AuthenticationRequestParameters = iIntValue2;
                    i28++;
                    c12 = c3;
                }
                i14 = 16;
            }
            char c15 = c12;
            int i35 = getmessageversion.getDeviceData;
            int i36 = getmessageversion.AuthenticationRequestParameters;
            getmessageversion.getDeviceData = i36;
            getmessageversion.AuthenticationRequestParameters = i35;
            i14 = 16;
            int i37 = i35 ^ iArr5[16];
            getmessageversion.AuthenticationRequestParameters = i37;
            int i38 = i36 ^ iArr5[17];
            getmessageversion.getDeviceData = i38;
            cArr4[0] = (char) (i38 >>> 16);
            cArr4[c15] = (char) i38;
            cArr4[i12] = (char) (i37 >>> 16);
            cArr4[3] = (char) i37;
            atd.bb.getMessageVersion.getSDKTransactionID(iArr5);
            int i39 = getmessageversion.getSDKAppID;
            cArr3[i39 * 2] = cArr4[0];
            cArr3[(i39 * 2) + 1] = cArr4[c15];
            cArr3[(i39 * 2) + 2] = cArr4[i12];
            cArr3[(i39 * 2) + 3] = cArr4[3];
            Object[] objArr6 = new Object[i12];
            objArr6[c15] = getmessageversion;
            objArr6[0] = getmessageversion;
            Object sDKTransactionID5 = atd.e.ChallengeResult.getSDKTransactionID(35442447);
            if (sDKTransactionID5 == null) {
                byte b18 = (byte) 0;
                byte b19 = b18;
                sDKTransactionID5 = atd.e.ChallengeResult.getDeviceData(1861 - KeyEvent.normalizeMetaState(0), (char) TextUtils.getOffsetBefore("", 0), KeyEvent.getDeadChar(0, 0) + 40, -562771681, false, $$c(b18, b19, (byte) (b19 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) sDKTransactionID5).invoke(null, objArr6);
            c7 = 0;
            i12 = 2;
        }
        String str = new String(cArr3, 0, i11);
        int i41 = $11 + 37;
        $10 = i41 % 128;
        if (i41 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i42 = 93 / 0;
            objArr[0] = str;
        }
    }

    public static void getDeviceData() {
        getSDKAppID = new int[]{1892317393, 1077554419, 1241817792, 950543368, -553002248, 471223058, -460221325, -1496933293, -471892512, 985121944, 1691913931, -345844256, -848996428, 258790549, -818440129, 1883530144, 836031440, -179677911};
    }

    public static void init$0() {
        $$a = new byte[]{89, 27, 126, -16};
        $$b = 48;
    }

    @Override // com.adyen.threeds2.Warning
    @NotNull
    public final String getID() throws Throwable {
        Object obj;
        int i11 = getDeviceData + 55;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            Object[] objArr = new Object[1];
            a(new int[]{1166211332, 317777319}, TextUtils.indexOf("", "") * 5, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(new int[]{1166211332, 317777319}, 4 - TextUtils.indexOf("", ""), objArr2);
            obj = objArr2[0];
        }
        String strIntern = ((String) obj).intern();
        int i12 = AuthenticationRequestParameters + 43;
        getDeviceData = i12 % 128;
        if (i12 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.adyen.threeds2.Warning
    @NotNull
    public final String getMessage() throws Throwable {
        Object obj;
        int i11 = AuthenticationRequestParameters + 105;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0) {
            Object[] objArr = new Object[1];
            a(new int[]{-1091907472, -476016456, 1013106490, -505211855, 1506698053, -566934053, 1550875773, -1437987365, -116692319, -2112488214, -638454732, 1791332046, 1521051031, 1867506020, -234499040, -792353592, 1357158710, -1484904940, 947941043, 952381983, -475258685, -1214459048}, 34 / ((byte) KeyEvent.getModifierMetaStateMask()), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(new int[]{-1091907472, -476016456, 1013106490, -505211855, 1506698053, -566934053, 1550875773, -1437987365, -116692319, -2112488214, -638454732, 1791332046, 1521051031, 1867506020, -234499040, -792353592, 1357158710, -1484904940, 947941043, 952381983, -475258685, -1214459048}, ((byte) KeyEvent.getModifierMetaStateMask()) + 43, objArr2);
            obj = objArr2[0];
        }
        String strIntern = ((String) obj).intern();
        int i12 = AuthenticationRequestParameters + 31;
        getDeviceData = i12 % 128;
        if (i12 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.adyen.threeds2.Warning
    @NotNull
    public final Warning.Severity getSeverity() {
        int i11 = AuthenticationRequestParameters + 43;
        getDeviceData = i11 % 128;
        if (i11 % 2 == 0) {
            return Warning.Severity.HIGH;
        }
        Warning.Severity severity = Warning.Severity.LOW;
        throw null;
    }
}
