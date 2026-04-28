package atd.ag;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import atd.bb.ChallengeResultKt;
import i4.a;
import java.lang.reflect.Method;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getMessageVersion {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int ChallengeResult;
    public static final getDeviceData getDeviceData;
    private static int getMessageVersion;
    public static final getSDKAppID getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static char getSDKReferenceNumber;
    public static final getSDKTransactionID getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r5, int r6, int r7) {
        /*
            int r7 = r7 * 4
            int r0 = r7 + 1
            int r6 = 122 - r6
            int r5 = r5 * 2
            int r5 = r5 + 4
            byte[] r1 = atd.ag.getMessageVersion.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r4 = r7
            r3 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L20:
            int r3 = r3 + 1
            r4 = r1[r5]
        L24:
            int r6 = r6 + r4
            int r5 = r5 + 1
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ag.getMessageVersion.$$c(byte, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getMessageVersion = 0;
        ChallengeResult = 1;
        BuildConfig = 0;
        getSDKEphemeralPublicKey = 1;
        getSDKTransactionID();
        getSDKAppID = new getSDKReferenceNumber();
        getSDKTransactionID = new AuthenticationRequestParameters();
        getDeviceData = new ChallengeResult();
        getMessageVersion = (ChallengeResult + 15) % 128;
    }

    private static void a(String str, int i11, byte b8, Object[] objArr) throws Throwable {
        int i12;
        char c3;
        int i13;
        char c7;
        char c8;
        char c11;
        int i14;
        int i15;
        char[] charArray = str != null ? str.toCharArray() : str;
        ChallengeResultKt challengeResultKt = new ChallengeResultKt();
        char[] cArr = AuthenticationRequestParameters;
        Class cls = Integer.TYPE;
        int i16 = -317146529;
        int i17 = 0;
        int i18 = 1;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i19 = 0;
            while (i19 < length) {
                $11 = ($10 + 73) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i19])};
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(i16);
                    if (sDKTransactionID == null) {
                        int iCombineMeasuredStates = View.combineMeasuredStates(i17, i17) + 2158;
                        char cResolveSize = (char) View.resolveSize(i17, i17);
                        int iResolveSize = View.resolveSize(i17, i17) + 36;
                        int i21 = $$b;
                        i15 = i16;
                        byte b11 = (byte) (i21 - 1);
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData(iCombineMeasuredStates, cResolveSize, iResolveSize, 829471823, false, $$c(b11, (byte) (b11 | 57), (byte) (i21 - 1)), new Class[]{cls});
                    } else {
                        i15 = i16;
                    }
                    cArr2[i19] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    i19++;
                    i16 = i15;
                    i17 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        int i22 = i16;
        Object[] objArr3 = {Integer.valueOf(getSDKReferenceNumber)};
        Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(i22);
        char c12 = '\b';
        if (sDKTransactionID2 == null) {
            int iIndexOf = 2158 - TextUtils.indexOf("", "");
            char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
            int maxKeyCode = 36 - (KeyEvent.getMaxKeyCode() >> 16);
            int i23 = $$b;
            byte b12 = (byte) (i23 - 1);
            sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(iIndexOf, touchSlop, maxKeyCode, 829471823, false, $$c(b12, (byte) (b12 | 57), (byte) (i23 - 1)), new Class[]{cls});
        }
        char cCharValue = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
        char[] cArr3 = new char[i11];
        if (i11 % 2 != 0) {
            i12 = i11 - 1;
            cArr3[i12] = (char) (charArray[i12] - b8);
            $10 = ($11 + 73) % 128;
        } else {
            i12 = i11;
        }
        if (i12 > 1) {
            int i24 = $11 + 75;
            $10 = i24 % 128;
            char c13 = 2;
            if (i24 % 2 != 0) {
                challengeResultKt.getSDKReferenceNumber = 1;
            } else {
                challengeResultKt.getSDKReferenceNumber = 0;
            }
            while (true) {
                int i25 = challengeResultKt.getSDKReferenceNumber;
                if (i25 >= i12) {
                    break;
                }
                char c14 = charArray[i25];
                challengeResultKt.getDeviceData = c14;
                char c15 = charArray[i25 + 1];
                challengeResultKt.getSDKAppID = c15;
                if (c14 == c15) {
                    cArr3[i25] = (char) (c14 - b8);
                    cArr3[i25 + 1] = (char) (c15 - b8);
                    i14 = i18;
                    c3 = c12;
                    c7 = c13;
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = challengeResultKt;
                    objArr4[11] = Integer.valueOf(cCharValue);
                    objArr4[10] = challengeResultKt;
                    objArr4[9] = challengeResultKt;
                    objArr4[c12] = Integer.valueOf(cCharValue);
                    objArr4[7] = challengeResultKt;
                    objArr4[6] = challengeResultKt;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = challengeResultKt;
                    objArr4[3] = challengeResultKt;
                    objArr4[c13] = Integer.valueOf(cCharValue);
                    objArr4[i18] = challengeResultKt;
                    c3 = c12;
                    objArr4[0] = challengeResultKt;
                    Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(835518319);
                    if (sDKTransactionID3 == null) {
                        c7 = c13;
                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 1258;
                        c8 = '\n';
                        char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 34414);
                        int offsetBefore2 = TextUtils.getOffsetBefore("", 0) + 41;
                        int i26 = $$b;
                        c11 = '\t';
                        byte b13 = (byte) (i26 - 1);
                        i13 = i18;
                        String str$$c = $$c(b13, (byte) (b13 | 55), (byte) (i26 - 1));
                        Class cls2 = Integer.TYPE;
                        sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(offsetBefore, minimumFlingVelocity, offsetBefore2, -307955329, false, str$$c, new Class[]{Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class});
                    } else {
                        i13 = i18;
                        c7 = c13;
                        c8 = '\n';
                        c11 = '\t';
                    }
                    int iIntValue = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                    int i27 = challengeResultKt.ChallengeResultCancelled;
                    if (iIntValue == i27) {
                        Object[] objArr5 = new Object[11];
                        objArr5[c8] = challengeResultKt;
                        objArr5[c11] = Integer.valueOf(cCharValue);
                        objArr5[c3] = challengeResultKt;
                        objArr5[7] = Integer.valueOf(cCharValue);
                        objArr5[6] = Integer.valueOf(cCharValue);
                        objArr5[5] = challengeResultKt;
                        objArr5[4] = challengeResultKt;
                        objArr5[3] = Integer.valueOf(cCharValue);
                        objArr5[c7] = Integer.valueOf(cCharValue);
                        objArr5[i13] = challengeResultKt;
                        objArr5[0] = challengeResultKt;
                        Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(-758961112);
                        if (sDKTransactionID4 == null) {
                            int touchSlop2 = 2223 - (ViewConfiguration.getTouchSlop() >> 8);
                            char cKeyCodeFromString = (char) (53070 - KeyEvent.keyCodeFromString(""));
                            int gidForName = Process.getGidForName("") + 22;
                            byte b14 = (byte) ($$b - 1);
                            byte b15 = b14;
                            String str$$c2 = $$c(b14, b15, b15);
                            Class cls3 = Integer.TYPE;
                            sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(touchSlop2, cKeyCodeFromString, gidForName, 246098488, false, str$$c2, new Class[]{Object.class, Object.class, cls3, cls3, Object.class, Object.class, cls3, cls3, Object.class, cls3, Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) sDKTransactionID4).invoke(null, objArr5)).intValue();
                        int i28 = (challengeResultKt.getSDKTransactionID * cCharValue) + challengeResultKt.ChallengeResultCancelled;
                        int i29 = challengeResultKt.getSDKReferenceNumber;
                        cArr3[i29] = cArr[iIntValue2];
                        cArr3[i29 + 1] = cArr[i28];
                        i14 = i13;
                    } else {
                        int i31 = challengeResultKt.AuthenticationRequestParameters;
                        int i32 = challengeResultKt.getSDKTransactionID;
                        int i33 = challengeResultKt.getMessageVersion;
                        if (i31 == i32) {
                            i14 = i13;
                            int iC = k.c(i33, cCharValue, i14, cCharValue);
                            challengeResultKt.getMessageVersion = iC;
                            int iC2 = k.c(i27, cCharValue, i14, cCharValue);
                            challengeResultKt.ChallengeResultCancelled = iC2;
                            int i34 = (i32 * cCharValue) + iC2;
                            int i35 = challengeResultKt.getSDKReferenceNumber;
                            cArr3[i35] = cArr[(i31 * cCharValue) + iC];
                            cArr3[i35 + i14] = cArr[i34];
                        } else {
                            i14 = i13;
                            int i36 = (i31 * cCharValue) + i27;
                            int i37 = challengeResultKt.getSDKReferenceNumber;
                            cArr3[i37] = cArr[i36];
                            cArr3[i37 + i14] = cArr[(i32 * cCharValue) + i33];
                        }
                    }
                }
                challengeResultKt.getSDKReferenceNumber += 2;
                c12 = c3;
                i18 = i14;
                c13 = c7;
            }
        }
        for (int i38 = 0; i38 < i11; i38++) {
            cArr3[i38] = (char) (cArr3[i38] ^ 13722);
        }
        objArr[0] = new String(cArr3);
    }

    public static BuildConfig getDeviceData(String str) throws Throwable {
        int i11 = getSDKEphemeralPublicKey + 71;
        BuildConfig = i11 % 128;
        if (i11 % 2 != 0) {
            getSDKAppID.AuthenticationRequestParameters().equals(str);
            throw null;
        }
        getSDKAppID getsdkappid = getSDKAppID;
        if (getsdkappid.AuthenticationRequestParameters().equals(str)) {
            BuildConfig = (getSDKEphemeralPublicKey + 37) % 128;
            return getsdkappid;
        }
        getSDKTransactionID getsdktransactionid = getSDKTransactionID;
        if (getsdktransactionid.AuthenticationRequestParameters().equals(str)) {
            return getsdktransactionid;
        }
        getDeviceData getdevicedata = getDeviceData;
        if (getdevicedata.AuthenticationRequestParameters().equals(str)) {
            getSDKEphemeralPublicKey = (BuildConfig + 37) % 128;
            return getdevicedata;
        }
        Object[] objArr = new Object[1];
        a("\u0018\u0000\u0007\r㙜㙜\t\u0016\u0013\f\u0014\u0006\t\u0016\n\u0005\u0002\u0018\u000e\u0010\u0001\u0014\u0006\n\u0012\u000e\t\u0016\u0002\u000f\u0000\u0011\t\u0000\n\u0010\u000b\u0004", 39 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (byte) (113 - TextUtils.lastIndexOf("", '0', 0, 0)), objArr);
        a.f(((String) objArr[0]).intern());
        return null;
    }

    public static void getSDKTransactionID() {
        AuthenticationRequestParameters = new char[]{30895, 30952, 30894, 30886, 30888, 30950, 30885, 30889, 30901, 30902, 30880, 30887, 30899, 30881, 30883, 30891, 30884, 30898, 31580, 30890, 30867, 30882, 30896, 31581, 30900};
        getSDKReferenceNumber = (char) 19801;
    }

    public static void init$0() {
        $$a = new byte[]{41, 118, 37, -24};
        $$b = 1;
    }
}
