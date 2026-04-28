package atd.n;

import a40.d0;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.app.tgtg.model.local.AppConstants;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import w.a0;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/SocManufacturer;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeResultTimeout extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$h = null;
    private static final int $$i = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int getDeviceData;
    private static char[] getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static int getSDKReferenceNumber;
    private static long getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$j(short r5, int r6, int r7) {
        /*
            int r7 = 106 - r7
            int r6 = r6 * 4
            int r6 = 3 - r6
            int r5 = r5 * 4
            int r0 = r5 + 1
            byte[] r1 = atd.n.ChallengeResultTimeout.$$h
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r4 = r5
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L22:
            r4 = r1[r6]
            int r3 = r3 + 1
        L26:
            int r7 = r7 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.n.ChallengeResultTimeout.$$j(short, int, int):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        getDeviceData = 0;
        getSDKEphemeralPublicKey = 1;
        AuthenticationRequestParameters = 0;
        getSDKReferenceNumber = 1;
        AuthenticationRequestParameters();
        MotionEvent.axisFromString("");
        ViewConfiguration.getKeyRepeatTimeout();
        ViewConfiguration.getMaximumDrawingCacheSize();
        new getDeviceData((byte) 0);
        getDeviceData = (getSDKEphemeralPublicKey + 31) % 128;
    }

    public static void AuthenticationRequestParameters() {
        getSDKAppID = new char[]{62575, 56767, 42964, 35297, 21277, 9532, 3920, 53561, 47769, 36010, 22166, 14536, 515, 54318, 48712, 32890, 27027, 13186, 1484, 61420, 45313, 39726, 62571, 56765, 42961, 35299, 21249, 9520, 3920, 53573, 47763, 36024, 22228, 14575, 531, 54320, 48729, 62564, 56752, 42950, 35314, 21340, 9529, 3925, 53625, 47761, 36087, 22251, 14562, 521, 54313, 48729, 32882, 10596, 182, 31446, 21758, 36357, 63551, 53827, 3181, 26557, 20923, 35784, 58864, 57146, 2353, 25435, 23929, 62543, 56800, 42885, 35239};
        getSDKTransactionID = 7494593641744293329L;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(short r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 + 4
            byte[] r0 = atd.n.ChallengeResultTimeout.$$a
            int r6 = r6 * 3
            int r6 = 103 - r6
            int r7 = r7 * 2
            int r1 = r7 + 11
            byte[] r1 = new byte[r1]
            int r7 = r7 + 10
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r5 = r5 + 1
            if (r3 != r7) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r5]
        L2a:
            int r6 = r6 + r4
            int r6 = r6 + 4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.n.ChallengeResultTimeout.b(short, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(char r25, int r26, int r27, java.lang.Object[] r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.n.ChallengeResultTimeout.c(char, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 6
            int r7 = r7 + 97
            byte[] r0 = atd.n.ChallengeResultTimeout.$$d
            int r8 = r8 * 24
            int r1 = r8 + 19
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            int r8 = r8 + 18
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r6 = r6 + 1
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2e:
            int r6 = r6 + r3
            r3 = r7
            r7 = r6
            r6 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.n.ChallengeResultTimeout.d(short, byte, short, java.lang.Object[]):void");
    }

    public static void init$0() {
        $$a = new byte[]{76, -58, -49, 5, -6, 11, -37, -19, 3, 3, 15, -3, -5, 9, -17, 5, -15, -2, -27, 35, -12, -15, -1, 9, -6, 11, -37, -19, 3, 5, 26, -21, 9, 1, -22, -2, 13, -15, 2, -5, -41, -9, -6, 11, -37, -19, 3, -14, 43, -4, -43, -9};
        $$b = AppConstants.CONTACT_US_REQUEST_FILE;
    }

    public static void init$1() {
        $$d = new byte[]{9, -55, 81, 14, 19, -16, -54, 73, -73, 27, 37, -5, 11, -11, -8, 11, -3, 17, -21, -19, 19, 14, 2, -9, 8, -46, 27, 8, 3, 9, -3, -13, -65, 67, -2, 15, -48, 33, 17, -13, -6, 2, -33, 29, 19, -19, -2, 15, -33, -15, 7, 9, 30, -17, 13, 5, -18, 2, 17, -11, 6, -1, -37, -5};
        $$e = 103;
    }

    public static void init$2() {
        $$h = new byte[]{40, 74, -99, -21};
        $$i = 16;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() throws Throwable {
        int i11;
        char c3;
        long j9;
        char c7;
        char c8;
        int i12;
        Object[] objArr;
        Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(1968903402);
        if (sDKTransactionID == null) {
            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1120;
            char cIndexOf = (char) (58600 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
            int iGreen = Color.green(0) + 33;
            byte b8 = $$a[22];
            Object[] objArr2 = new Object[1];
            b(b8, (byte) (b8 + 1), r1[3], objArr2);
            sDKTransactionID = atd.e.ChallengeResult.getDeviceData(doubleTapTimeout, cIndexOf, iGreen, -1456270598, false, (String) objArr2[0], null);
        }
        long j11 = ((Field) sDKTransactionID).getLong(null);
        Object[] objArr3 = new Object[1];
        c((char) ExpandableListView.getPackedPositionType(0L), KeyEvent.keyCodeFromString("") + 22, TextUtils.indexOf("", ""), objArr3);
        Class<?> cls = Class.forName(((String) objArr3[0]).intern());
        Object[] objArr4 = new Object[1];
        c((char) (ViewConfiguration.getPressedStateDuration() >> 16), 14 - TextUtils.lastIndexOf("", '0', 0), 22 - (Process.myTid() >> 22), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod(((String) objArr4[0]).intern(), null).invoke(null, null)).longValue();
        Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(-735185873);
        if (sDKTransactionID2 == null) {
            int mode = 1120 - View.MeasureSpec.getMode(0);
            i11 = -735185873;
            char capsMode = (char) (58601 - TextUtils.getCapsMode("", 0, 0));
            int iLastIndexOf = 32 - TextUtils.lastIndexOf("", '0');
            byte[] bArr = $$a;
            c3 = '!';
            j9 = 0;
            c7 = '1';
            Object[] objArr5 = new Object[1];
            b((byte) (-bArr[7]), (byte) (bArr[33] - 1), (byte) (-bArr[49]), objArr5);
            sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(mode, capsMode, iLastIndexOf, 138801727, false, (String) objArr5[0], null);
        } else {
            i11 = -735185873;
            c3 = '!';
            j9 = 0;
            c7 = '1';
        }
        if (j11 == ((jLongValue - ((((Field) sDKTransactionID2).getLong(null) << 53) >>> 53)) >> 11)) {
            AuthenticationRequestParameters = (getSDKReferenceNumber + 81) % 128;
            Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(169081906);
            if (sDKTransactionID3 == null) {
                int i13 = 1121 - (Process.getElapsedCpuTime() > j9 ? 1 : (Process.getElapsedCpuTime() == j9 ? 0 : -1));
                char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 58601);
                int scrollBarSize2 = 33 - (ViewConfiguration.getScrollBarSize() >> 8);
                byte[] bArr2 = $$a;
                byte b11 = (byte) (-bArr2[6]);
                byte b12 = (byte) (bArr2[c3] - 1);
                Object[] objArr6 = new Object[1];
                b(b11, b12, b12, objArr6);
                sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(i13, scrollBarSize, scrollBarSize2, -696518110, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) sDKTransactionID3).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[]{i}, new int[1]};
            int i14 = ((int[]) objArr7[0])[0];
            int i15 = ((int[]) objArr7[2])[0];
            String[] strArr = (String[]) objArr7[1];
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i16 = ~iFreeMemory;
            int iA = l1.a((~(iFreeMemory | 119704528)) | 139207682 | (~(i16 | (-69239489))), 369, (((~((-119704529) | i16)) | 189672722) * (-369)) + (((258912210 | i16) * (-369)) - 1494534492), -2094233802);
            int i17 = iA ^ (iA << 13);
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr[3])[0] = i18 ^ (i18 << 5);
            c8 = 3;
            i12 = 0;
        } else {
            Object[] objArr8 = new Object[1];
            c((char) (MotionEvent.axisFromString("") + 1), KeyEvent.getDeadChar(0, 0) + 16, TextUtils.getTrimmedLength("") + 37, objArr8);
            Class<?> cls2 = Class.forName(((String) objArr8[0]).intern());
            Object[] objArr9 = new Object[1];
            c((char) (56579 - View.MeasureSpec.getMode(0)), View.MeasureSpec.getSize(0) + 16, 54 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr9);
            try {
                Object[] objArr10 = {Integer.valueOf(((Integer) cls2.getMethod(((String) objArr9[0]).intern(), Object.class).invoke(null, this)).intValue()), 0, -2094233802};
                Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(-925790228);
                if (sDKTransactionID4 == null) {
                    int i19 = (Process.getElapsedCpuTime() > j9 ? 1 : (Process.getElapsedCpuTime() == j9 ? 0 : -1)) + 1119;
                    char minimumFlingVelocity = (char) (58601 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                    int iBlue = Color.blue(0) + 33;
                    byte b13 = $$a[22];
                    Object[] objArr11 = new Object[1];
                    b(b13, (byte) (b13 + 1), r11[3], objArr11);
                    String str = (String) objArr11[0];
                    Class cls3 = Integer.TYPE;
                    sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(i19, minimumFlingVelocity, iBlue, 347703804, false, str, new Class[]{cls3, cls3, cls3});
                }
                Object[] objArr12 = (Object[]) ((Method) sDKTransactionID4).invoke(null, objArr10);
                Object sDKTransactionID5 = atd.e.ChallengeResult.getSDKTransactionID(169081906);
                if (sDKTransactionID5 == null) {
                    int mirror = 1168 - AndroidCharacter.getMirror('0');
                    char c11 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 58601);
                    int tapTimeout = 33 - (ViewConfiguration.getTapTimeout() >> 16);
                    byte[] bArr3 = $$a;
                    byte b14 = (byte) (-bArr3[6]);
                    byte b15 = (byte) (bArr3[c3] - 1);
                    Object[] objArr13 = new Object[1];
                    b(b14, b15, b15, objArr13);
                    sDKTransactionID5 = atd.e.ChallengeResult.getDeviceData(mirror, c11, tapTimeout, -696518110, false, (String) objArr13[0], null);
                }
                ((Field) sDKTransactionID5).set(null, objArr12);
                try {
                    Object[] objArr14 = new Object[1];
                    c((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 23 - (SystemClock.elapsedRealtime() > j9 ? 1 : (SystemClock.elapsedRealtime() == j9 ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) + 1, objArr14);
                    Class<?> cls4 = Class.forName(((String) objArr14[0]).intern());
                    Object[] objArr15 = new Object[1];
                    c((char) TextUtils.indexOf("", ""), 15 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 22 - Color.red(0), objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod(((String) objArr15[0]).intern(), null).invoke(null, null)).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object sDKTransactionID6 = atd.e.ChallengeResult.getSDKTransactionID(i11);
                    if (sDKTransactionID6 == null) {
                        int i21 = 1121 - (SystemClock.elapsedRealtime() > j9 ? 1 : (SystemClock.elapsedRealtime() == j9 ? 0 : -1));
                        char capsMode2 = (char) (TextUtils.getCapsMode("", 0, 0) + 58601);
                        int fadingEdgeLength = 33 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        byte[] bArr4 = $$a;
                        c8 = 3;
                        i12 = 0;
                        Object[] objArr16 = new Object[1];
                        b((byte) (-bArr4[7]), (byte) (bArr4[c3] - 1), (byte) (-bArr4[c7]), objArr16);
                        sDKTransactionID6 = atd.e.ChallengeResult.getDeviceData(i21, capsMode2, fadingEdgeLength, 138801727, false, (String) objArr16[0], null);
                    } else {
                        c8 = 3;
                        i12 = 0;
                    }
                    ((Field) sDKTransactionID6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 11);
                    Object sDKTransactionID7 = atd.e.ChallengeResult.getSDKTransactionID(1968903402);
                    if (sDKTransactionID7 == null) {
                        int mode2 = View.MeasureSpec.getMode(i12) + 1120;
                        char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 58601);
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 34;
                        byte b16 = $$a[22];
                        Object[] objArr17 = new Object[1];
                        b(b16, (byte) (b16 + 1), r3[c8], objArr17);
                        sDKTransactionID7 = atd.e.ChallengeResult.getDeviceData(mode2, maxKeyCode, iIndexOf, -1456270598, false, (String) objArr17[i12], null);
                    }
                    ((Field) sDKTransactionID7).set(null, lValueOf2);
                    objArr = objArr12;
                } catch (Exception unused) {
                    d0.c();
                    return null;
                }
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        }
        int i22 = ((int[]) objArr[2])[i12];
        int i23 = ((int[]) objArr[i12])[i12];
        if (i23 == i22) {
            Object[] objArr18 = new Object[4];
            int[] iArr = new int[1];
            objArr18[i12] = iArr;
            int[] iArr2 = new int[1];
            objArr18[2] = iArr2;
            objArr18[c8] = new int[1];
            int i24 = ((int[]) objArr[c8])[i12];
            int i25 = ((int[]) objArr[i12])[i12];
            int i26 = ((int[]) objArr[2])[i12];
            String[] strArr2 = (String[]) objArr[1];
            iArr[i12] = i25;
            iArr2[i12] = i26;
            objArr18[1] = strArr2;
            int iA2 = a0.a();
            int iD = a0.D(~((~iA2) | (-310444041)), -948, (((~(209082343 | iA2)) | (-518459595)) * (-948)) + 2089354682, -1410227956, i24);
            int i27 = iD ^ (iD << 13);
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr18[c8])[i12] = i28 ^ (i28 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[1];
            if (strArr3 != null) {
                for (int i29 = i12; i29 < strArr3.length; i29++) {
                    AuthenticationRequestParameters = (getSDKReferenceNumber + 45) % 128;
                    arrayList.add(strArr3[i29]);
                }
            }
            long j12 = ((long) (i22 ^ i23)) ^ (-7160214264915951616L);
            try {
                Object[] objArr19 = new Object[2];
                objArr19[1] = -1667117295L;
                objArr19[i12] = Long.valueOf(j12);
                byte[] bArr5 = $$d;
                byte b17 = bArr5[61];
                byte b18 = b17;
                Object[] objArr20 = new Object[1];
                d(b18, (byte) (b18 + 1), (byte) (-b17), objArr20);
                Class<?> cls5 = Class.forName((String) objArr20[i12]);
                byte b19 = (byte) (-bArr5[61]);
                Object[] objArr21 = new Object[1];
                d((byte) 41, b19, (byte) (b19 - 1), objArr21);
                String str2 = (String) objArr21[i12];
                Class cls6 = Long.TYPE;
                cls5.getMethod(str2, cls6, cls6).invoke(null, objArr19);
                Object[] objArr22 = new Object[4];
                int[] iArr3 = new int[1];
                objArr22[i12] = iArr3;
                int[] iArr4 = new int[1];
                objArr22[2] = iArr4;
                objArr22[c8] = new int[1];
                int i31 = ((int[]) objArr[c8])[i12];
                int i32 = ((int[]) objArr[i12])[i12];
                int i33 = ((int[]) objArr[2])[i12];
                String[] strArr4 = (String[]) objArr[1];
                iArr3[i12] = i32;
                iArr4[i12] = i33;
                objArr22[1] = strArr4;
                int iIdentityHashCode = System.identityHashCode(this);
                int i34 = ~iIdentityHashCode;
                int iA3 = l1.a((~(iIdentityHashCode | (-158197444))) | (-151179808) | (~(i34 | 158197443)), 45, (((~((-151179808) | iIdentityHashCode)) | (-158332640)) * (-45)) + (((~((-151179808) | i34)) | 158197443) * (-90)) + 1346451612, i31);
                int i35 = iA3 ^ (iA3 << 13);
                int i36 = i35 ^ (i35 >>> 17);
                ((int[]) objArr22[c8])[i12] = i36 ^ (i36 << 5);
            } catch (Throwable th3) {
                Throwable cause2 = th3.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th3;
            }
        }
        if (Build.VERSION.SDK_INT < 31) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.UNSUPPORTED_OR_DEPRECATED);
        }
        String str3 = Build.SOC_MANUFACTURER;
        str3.getClass();
        return DeviceParameterResult.Success.StringValue.m164boximpl(DeviceParameterResult.Success.StringValue.m165constructorimpl(str3));
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/SocManufacturer$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        public static int getSDKReferenceNumber;
        public static int getSDKTransactionID;

        private getDeviceData() {
        }

        public static int getDeviceData() {
            int i11 = getSDKReferenceNumber;
            int i12 = i11 % 9992330;
            getSDKReferenceNumber = i11 + 1;
            if (i12 != 0) {
                return getSDKTransactionID;
            }
            int iMyPid = Process.myPid();
            getSDKTransactionID = iMyPid;
            return iMyPid;
        }

        public /* synthetic */ getDeviceData(byte b8) {
            this();
        }
    }
}
