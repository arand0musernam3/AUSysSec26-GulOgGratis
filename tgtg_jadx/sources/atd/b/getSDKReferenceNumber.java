package atd.b;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import atd.bb.ChallengeResultKt;
import com.app.tgtg.model.local.AppConstants;
import java.lang.reflect.Method;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class getSDKReferenceNumber extends getDeviceData<String> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char getDeviceData;
    private static char[] getSDKAppID;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, byte r7, int r8) {
        /*
            int r7 = r7 + 4
            int r6 = r6 + 65
            int r8 = r8 * 4
            int r0 = r8 + 1
            byte[] r1 = atd.b.getSDKReferenceNumber.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r1
            r4 = r2
            r1 = r7
            r7 = r8
            goto L2c
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L22:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r5
        L2c:
            int r6 = -r6
            int r6 = r6 + r7
            r7 = r1
            r1 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.b.getSDKReferenceNumber.$$c(byte, byte, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKReferenceNumber = 0;
        getSDKTransactionID = 1;
        getSDKAppID = new char[]{19807, 30881, 30898, 30888, 30885, 19800, 30887, 30900, 19806, 30851, 30850, 19805, 30894, 30883, 30911, 30890};
        getDeviceData = (char) 19800;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public getSDKReferenceNumber(String str) throws Throwable {
        Object[] objArr = new Object[1];
        a("\b\u0000\u0007\u000e\f\u000e\u0000\u0002\u000e\t\n\u0006\u0005\n\u0000\u0003\u0006\u000f", Color.argb(0, 0, 0, 0) + 18, (byte) (7 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr);
        super(((String) objArr[0]).intern(), str);
    }

    private static void a(String str, int i11, byte b8, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12;
        int i13;
        int i14;
        char c3;
        char c7;
        int i15;
        char c8;
        int i16;
        int i17;
        char c11 = 2;
        if (str != null) {
            int i18 = $10 + 35;
            $11 = i18 % 128;
            if (i18 % 2 == 0) {
                str.toCharArray();
                throw null;
            }
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        ChallengeResultKt challengeResultKt = new ChallengeResultKt();
        char[] cArr2 = getSDKAppID;
        Class cls = Integer.TYPE;
        int i19 = -317146529;
        int i21 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i22 = 0;
            while (i22 < length) {
                int i23 = $10 + AppConstants.RESULT_CODE_ORDER_CANCELLED;
                char c12 = c11;
                $11 = i23 % 128;
                if (i23 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i22])};
                        Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(i19);
                        if (sDKTransactionID == null) {
                            byte b11 = (byte) 0;
                            i17 = i19;
                            byte b12 = (byte) (b11 - 1);
                            sDKTransactionID = atd.e.ChallengeResult.getDeviceData(View.getDefaultSize(0, 0) + 2158, (char) (Process.myTid() >> 22), Color.red(0) + 36, 829471823, false, $$c(b11, b12, (byte) (b12 + 1)), new Class[]{cls});
                        } else {
                            i17 = i19;
                        }
                        cArr3[i22] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    i17 = i19;
                    Object[] objArr3 = {Integer.valueOf(cArr2[i22])};
                    Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(i17);
                    if (sDKTransactionID2 == null) {
                        byte b13 = (byte) 0;
                        byte b14 = (byte) (b13 - 1);
                        sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(Drawable.resolveOpacity(0, 0) + 2158, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 37 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 829471823, false, $$c(b13, b14, (byte) (b14 + 1)), new Class[]{cls});
                    }
                    cArr3[i22] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
                    i22++;
                }
                i19 = i17;
                c11 = c12;
            }
            cArr2 = cArr3;
        }
        char c13 = c11;
        int i24 = i19;
        Object[] objArr4 = {Integer.valueOf(getDeviceData)};
        Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(i24);
        char c14 = '0';
        int i25 = 1;
        if (sDKTransactionID3 == null) {
            byte b15 = (byte) 0;
            byte b16 = (byte) (b15 - 1);
            sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(2158 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 37 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 829471823, false, $$c(b15, b16, (byte) (b16 + 1)), new Class[]{cls});
        }
        char cCharValue = ((Character) ((Method) sDKTransactionID3).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i11];
        if (i11 % 2 != 0) {
            int i26 = $10 + 41;
            $11 = i26 % 128;
            if (i26 % 2 == 0) {
                i12 = i11 + 76;
                cArr4[i12] = (char) (cArr[i12] << b8);
            } else {
                i12 = i11 - 1;
                cArr4[i12] = (char) (cArr[i12] - b8);
            }
        } else {
            i12 = i11;
        }
        int i27 = 11;
        if (i12 > 1) {
            challengeResultKt.getSDKReferenceNumber = 0;
            while (true) {
                int i28 = challengeResultKt.getSDKReferenceNumber;
                if (i28 >= i12) {
                    break;
                }
                char c15 = cArr[i28];
                challengeResultKt.getDeviceData = c15;
                char c16 = cArr[i28 + 1];
                challengeResultKt.getSDKAppID = c16;
                if (c15 == c16) {
                    cArr4[i28] = (char) (c15 - b8);
                    cArr4[i28 + 1] = (char) (c16 - b8);
                    c8 = c14;
                    i16 = i25;
                    i14 = i21;
                    i15 = i27;
                } else {
                    Object[] objArr5 = new Object[13];
                    objArr5[12] = challengeResultKt;
                    objArr5[i27] = Integer.valueOf(cCharValue);
                    objArr5[10] = challengeResultKt;
                    objArr5[9] = challengeResultKt;
                    objArr5[8] = Integer.valueOf(cCharValue);
                    objArr5[7] = challengeResultKt;
                    objArr5[6] = challengeResultKt;
                    objArr5[5] = Integer.valueOf(cCharValue);
                    objArr5[4] = challengeResultKt;
                    objArr5[3] = challengeResultKt;
                    objArr5[c13] = Integer.valueOf(cCharValue);
                    objArr5[i25] = challengeResultKt;
                    objArr5[i21] = challengeResultKt;
                    Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(835518319);
                    if (sDKTransactionID4 == null) {
                        c3 = '\n';
                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1258;
                        i14 = i21;
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", c14, i21) + 34415);
                        int windowTouchSlop = 41 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        c7 = '\t';
                        byte b17 = (byte) ($$b & 15);
                        i13 = i25;
                        byte b18 = (byte) (b17 - 3);
                        String str$$c = $$c(b17, b18, (byte) (b18 + 1));
                        Class cls2 = Integer.TYPE;
                        sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(doubleTapTimeout, cLastIndexOf, windowTouchSlop, -307955329, false, str$$c, new Class[]{Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class});
                    } else {
                        i13 = i25;
                        i14 = i21;
                        c3 = '\n';
                        c7 = '\t';
                    }
                    int iIntValue = ((Integer) ((Method) sDKTransactionID4).invoke(null, objArr5)).intValue();
                    int i29 = challengeResultKt.ChallengeResultCancelled;
                    if (iIntValue == i29) {
                        Object[] objArr6 = new Object[i27];
                        objArr6[c3] = challengeResultKt;
                        objArr6[c7] = Integer.valueOf(cCharValue);
                        objArr6[8] = challengeResultKt;
                        objArr6[7] = Integer.valueOf(cCharValue);
                        objArr6[6] = Integer.valueOf(cCharValue);
                        objArr6[5] = challengeResultKt;
                        objArr6[4] = challengeResultKt;
                        objArr6[3] = Integer.valueOf(cCharValue);
                        objArr6[c13] = Integer.valueOf(cCharValue);
                        objArr6[i13] = challengeResultKt;
                        objArr6[i14] = challengeResultKt;
                        Object sDKTransactionID5 = atd.e.ChallengeResult.getSDKTransactionID(-758961112);
                        if (sDKTransactionID5 == null) {
                            int gidForName = Process.getGidForName("") + 2224;
                            char c17 = (char) ((TypedValue.complexToFloat(i14) > 0.0f ? 1 : (TypedValue.complexToFloat(i14) == 0.0f ? 0 : -1)) + 53070);
                            c8 = '0';
                            int iIndexOf = 20 - TextUtils.indexOf((CharSequence) "", '0');
                            byte b19 = (byte) (-1);
                            i15 = i27;
                            String str$$c2 = $$c((byte) 57, b19, (byte) (b19 + 1));
                            Class cls3 = Integer.TYPE;
                            sDKTransactionID5 = atd.e.ChallengeResult.getDeviceData(gidForName, c17, iIndexOf, 246098488, false, str$$c2, new Class[]{Object.class, Object.class, cls3, cls3, Object.class, Object.class, cls3, cls3, Object.class, cls3, Object.class});
                        } else {
                            i15 = i27;
                            c8 = '0';
                        }
                        int iIntValue2 = ((Integer) ((Method) sDKTransactionID5).invoke(null, objArr6)).intValue();
                        int i31 = (challengeResultKt.getSDKTransactionID * cCharValue) + challengeResultKt.ChallengeResultCancelled;
                        int i32 = challengeResultKt.getSDKReferenceNumber;
                        cArr4[i32] = cArr2[iIntValue2];
                        cArr4[i32 + 1] = cArr2[i31];
                        i16 = i13;
                    } else {
                        i15 = i27;
                        c8 = '0';
                        int i33 = challengeResultKt.AuthenticationRequestParameters;
                        int i34 = challengeResultKt.getSDKTransactionID;
                        int i35 = challengeResultKt.getMessageVersion;
                        if (i33 == i34) {
                            i16 = i13;
                            int iC = k.c(i35, cCharValue, i16, cCharValue);
                            challengeResultKt.getMessageVersion = iC;
                            int iC2 = k.c(i29, cCharValue, i16, cCharValue);
                            challengeResultKt.ChallengeResultCancelled = iC2;
                            int i36 = (i34 * cCharValue) + iC2;
                            int i37 = challengeResultKt.getSDKReferenceNumber;
                            cArr4[i37] = cArr2[(i33 * cCharValue) + iC];
                            cArr4[i37 + i16] = cArr2[i36];
                        } else {
                            i16 = i13;
                            int i38 = (i33 * cCharValue) + i29;
                            int i39 = challengeResultKt.getSDKReferenceNumber;
                            cArr4[i39] = cArr2[i38];
                            cArr4[i39 + i16] = cArr2[(i34 * cCharValue) + i35];
                        }
                    }
                }
                challengeResultKt.getSDKReferenceNumber += 2;
                i27 = i15;
                c14 = c8;
                i25 = i16;
                i21 = i14;
            }
        }
        int i41 = i21;
        int i42 = i41;
        while (i42 < i11) {
            int i43 = $10 + 11;
            $11 = i43 % 128;
            if (i43 % 2 == 0) {
                cArr4[i42] = (char) (cArr4[i42] ^ 31443);
                i42 += 104;
            } else {
                cArr4[i42] = (char) (cArr4[i42] ^ 13722);
                i42++;
            }
        }
        objArr[i41] = new String(cArr4);
    }

    private static boolean getSDKTransactionID(String str) {
        int i11 = getSDKReferenceNumber + 3;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            TextUtils.isEmpty(str);
            throw null;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        int i12 = getSDKReferenceNumber + 15;
        getSDKTransactionID = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 82 / 0;
        }
        return false;
    }

    public static void init$0() {
        $$a = new byte[]{40, 74, -99, -21};
        $$b = 162;
    }

    @Override // atd.b.getDeviceData
    public final /* synthetic */ boolean getSDKReferenceNumber(String str) {
        getSDKTransactionID = (getSDKReferenceNumber + 13) % 128;
        boolean sDKTransactionID = getSDKTransactionID(str);
        int i11 = getSDKReferenceNumber + 11;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 1 / 0;
        }
        return sDKTransactionID;
    }
}
