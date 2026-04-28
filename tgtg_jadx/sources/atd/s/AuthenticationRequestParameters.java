package atd.s;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import atd.bb.getMessageVersion;
import atd.e.ChallengeResult;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/environment/GetExternalStorageState;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$StringValue;", "getDeviceParameterResult-GaL_DrQ", "()Ljava/lang/String;", "getDeviceParameterResult", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AuthenticationRequestParameters extends DeviceParameter {
    private static int AuthenticationRequestParameters = 1;
    private static int getDeviceData = 0;
    private static int getSDKAppID = 0;
    private static int getSDKReferenceNumber = 1;
    private static long getSDKTransactionID;

    static {
        getSDKAppID();
        Color.argb(0, 0, 0, 0);
        new getDeviceData((byte) 0);
        int i11 = getDeviceData + 53;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @NotNull
    private static String AuthenticationRequestParameters() {
        AuthenticationRequestParameters = (getSDKAppID + 69) % 128;
        String externalStorageState = Environment.getExternalStorageState();
        externalStorageState.getClass();
        String strM165constructorimpl = DeviceParameterResult.Success.StringValue.m165constructorimpl(externalStorageState);
        getSDKAppID = (AuthenticationRequestParameters + 95) % 128;
        return strM165constructorimpl;
    }

    public static void getSDKAppID() {
        getSDKTransactionID = -7762551450975226827L;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getSDKReferenceNumber() {
        AuthenticationRequestParameters = (getSDKAppID + 17) % 128;
        DeviceParameterResult.Success.StringValue stringValueM164boximpl = DeviceParameterResult.Success.StringValue.m164boximpl(AuthenticationRequestParameters());
        AuthenticationRequestParameters = (getSDKAppID + 107) % 128;
        return stringValueM164boximpl;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/environment/GetExternalStorageState$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10;
        private static int $11;
        private static int AuthenticationRequestParameters;
        private static int[] getDeviceData;
        private static int getSDKReferenceNumber;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$e(int r6, byte r7, int r8) {
            /*
                byte[] r0 = atd.s.AuthenticationRequestParameters.getDeviceData.$$c
                int r7 = r7 * 4
                int r7 = 4 - r7
                int r8 = r8 * 2
                int r1 = r8 + 1
                int r6 = r6 + 112
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r0
                r4 = r2
                r0 = r7
                goto L2a
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r6
                r1[r3] = r4
                if (r3 != r8) goto L21
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L21:
                int r3 = r3 + 1
                r4 = r0[r7]
                r5 = r0
                r0 = r7
                r7 = r4
                r4 = r3
                r3 = r5
            L2a:
                int r6 = r6 + r7
                int r7 = r0 + 1
                r0 = r3
                r3 = r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.s.AuthenticationRequestParameters.getDeviceData.$$e(int, byte, int):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            AuthenticationRequestParameters = 0;
            getSDKReferenceNumber = 1;
            getDeviceData = new int[]{6216340, 1433497753, -1884825534, 184953979, 90674532, 1412155565, 1582724700, -856477931, -206550929, -893057166, -880033634, 821275683, 1033745469, 652034059, -2139756276, 772393683, 515158146, 473951162};
        }

        private getDeviceData() {
        }

        private static void a(int[] iArr, int i11, Object[] objArr) throws Throwable {
            int i12;
            char c3;
            char[] cArr;
            int[] iArr2;
            int i13;
            int i14;
            getMessageVersion getmessageversion = new getMessageVersion();
            char[] cArr2 = new char[4];
            int i15 = 2;
            char[] cArr3 = new char[iArr.length * 2];
            int[] iArr3 = getDeviceData;
            int i16 = -1667528016;
            Class cls = Integer.TYPE;
            int i17 = 16;
            int i18 = 0;
            if (iArr3 != null) {
                $10 = ($11 + 109) % 128;
                int length = iArr3.length;
                int[] iArr4 = new int[length];
                int i19 = 0;
                while (i19 < length) {
                    $10 = ($11 + 41) % 128;
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i19])};
                        Object sDKTransactionID = ChallengeResult.getSDKTransactionID(i16);
                        if (sDKTransactionID == null) {
                            i13 = i16;
                            i14 = i17;
                            byte b8 = (byte) i15;
                            byte b11 = (byte) (b8 - 2);
                            sDKTransactionID = ChallengeResult.getDeviceData(2222 - ImageFormat.getBitsPerPixel(i18), (char) ((Process.myTid() >> 22) + 53070), 21 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1089703072, false, $$e(b8, b11, b11), new Class[]{cls});
                        } else {
                            i13 = i16;
                            i14 = i17;
                        }
                        iArr4[i19] = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
                        i19++;
                        i16 = i13;
                        i17 = i14;
                        i15 = 2;
                        i18 = 0;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                iArr3 = iArr4;
            }
            int i21 = i16;
            int i22 = i17;
            int length2 = iArr3.length;
            int[] iArr5 = new int[length2];
            int[] iArr6 = getDeviceData;
            if (iArr6 != null) {
                int length3 = iArr6.length;
                int[] iArr7 = new int[length3];
                int i23 = 0;
                while (i23 < length3) {
                    Object[] objArr3 = {Integer.valueOf(iArr6[i23])};
                    Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(i21);
                    if (sDKTransactionID2 == null) {
                        cArr = cArr2;
                        byte b12 = (byte) 2;
                        byte b13 = (byte) (b12 - 2);
                        iArr2 = iArr6;
                        sDKTransactionID2 = ChallengeResult.getDeviceData(2222 - TextUtils.lastIndexOf("", '0', 0, 0), (char) ((KeyEvent.getMaxKeyCode() >> 16) + 53070), MotionEvent.axisFromString("") + 22, 1089703072, false, $$e(b12, b13, b13), new Class[]{cls});
                    } else {
                        cArr = cArr2;
                        iArr2 = iArr6;
                    }
                    iArr7[i23] = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
                    i23++;
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
                int i24 = getmessageversion.getSDKAppID;
                if (i24 >= iArr.length) {
                    objArr[0] = new String(cArr3, 0, i11);
                    return;
                }
                int i25 = iArr[i24];
                char c8 = (char) (i25 >> 16);
                cArr4[c7] = c8;
                char c11 = (char) i25;
                char c12 = 1;
                cArr4[1] = c11;
                char c13 = (char) (iArr[i24 + 1] >> 16);
                cArr4[2] = c13;
                char c14 = (char) iArr[i24 + 1];
                cArr4[3] = c14;
                getmessageversion.getDeviceData = (c8 << 16) + c11;
                getmessageversion.AuthenticationRequestParameters = (c13 << 16) + c14;
                getMessageVersion.getSDKTransactionID(iArr5);
                int i26 = 0;
                while (true) {
                    i12 = getmessageversion.getDeviceData;
                    if (i26 >= i22) {
                        break;
                    }
                    int i27 = i12 ^ iArr5[i26];
                    getmessageversion.getDeviceData = i27;
                    int sDKReferenceNumber = getMessageVersion.getSDKReferenceNumber(i27);
                    Object[] objArr4 = new Object[4];
                    objArr4[3] = getmessageversion;
                    objArr4[2] = getmessageversion;
                    objArr4[c12] = Integer.valueOf(sDKReferenceNumber);
                    objArr4[0] = getmessageversion;
                    Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(1513246698);
                    if (sDKTransactionID3 == null) {
                        byte b14 = (byte) 0;
                        byte b15 = b14;
                        c3 = c12;
                        sDKTransactionID3 = ChallengeResult.getDeviceData(2386 - TextUtils.getCapsMode("", 0, 0), (char) ((Process.getThreadPriority(0) + 20) >> 6), 19 - Drawable.resolveOpacity(0, 0), -2040903174, false, $$e(b14, b15, b15), new Class[]{Object.class, cls, Object.class, Object.class});
                    } else {
                        c3 = c12;
                    }
                    int iIntValue = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                    getmessageversion.getDeviceData = getmessageversion.AuthenticationRequestParameters;
                    getmessageversion.AuthenticationRequestParameters = iIntValue;
                    i26++;
                    c12 = c3;
                    i22 = 16;
                }
                char c15 = c12;
                int i28 = getmessageversion.AuthenticationRequestParameters;
                getmessageversion.getDeviceData = i28;
                getmessageversion.AuthenticationRequestParameters = i12;
                int i29 = i12 ^ iArr5[16];
                getmessageversion.AuthenticationRequestParameters = i29;
                int i31 = i28 ^ iArr5[17];
                getmessageversion.getDeviceData = i31;
                cArr4[0] = (char) (i31 >>> 16);
                cArr4[c15] = (char) i31;
                cArr4[2] = (char) (i29 >>> 16);
                cArr4[3] = (char) i29;
                getMessageVersion.getSDKTransactionID(iArr5);
                int i32 = getmessageversion.getSDKAppID;
                cArr3[i32 * 2] = cArr4[0];
                cArr3[(i32 * 2) + 1] = cArr4[c15];
                cArr3[(i32 * 2) + 2] = cArr4[2];
                cArr3[(i32 * 2) + 3] = cArr4[3];
                Object[] objArr5 = new Object[2];
                objArr5[c15] = getmessageversion;
                objArr5[0] = getmessageversion;
                Object sDKTransactionID4 = ChallengeResult.getSDKTransactionID(35442447);
                if (sDKTransactionID4 == null) {
                    i22 = 16;
                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 1861;
                    char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int iResolveSizeAndState = 40 - View.resolveSizeAndState(0, 0, 0);
                    byte b16 = (byte) (3 & $$d);
                    byte b17 = (byte) (b16 - 1);
                    sDKTransactionID4 = ChallengeResult.getDeviceData(maxKeyCode, maximumDrawingCacheSize, iResolveSizeAndState, -562771681, false, $$e(b16, b17, b17), new Class[]{Object.class, Object.class});
                } else {
                    i22 = 16;
                }
                ((Method) sDKTransactionID4).invoke(null, objArr5);
                c7 = 0;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void b(byte r6, int r7, byte r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 + 4
                int r0 = 19 - r6
                byte[] r1 = atd.s.AuthenticationRequestParameters.getDeviceData.$$a
                int r8 = 104 - r8
                byte[] r0 = new byte[r0]
                int r6 = 18 - r6
                r2 = 0
                if (r1 != 0) goto L14
                r8 = r7
                r3 = r1
                r4 = r2
                r1 = r6
                goto L2d
            L14:
                r3 = r2
            L15:
                byte r4 = (byte) r8
                r0[r3] = r4
                int r7 = r7 + 1
                int r4 = r3 + 1
                if (r3 != r6) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L26:
                r3 = r1[r7]
                r5 = r8
                r8 = r7
                r7 = r3
                r3 = r1
                r1 = r5
            L2d:
                int r7 = -r7
                int r1 = r1 + r7
                int r7 = r1 + (-2)
                r1 = r8
                r8 = r7
                r7 = r1
                r1 = r3
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.s.AuthenticationRequestParameters.getDeviceData.b(byte, int, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v34 */
        /* JADX WARN: Type inference failed for: r12v10 */
        /* JADX WARN: Type inference failed for: r12v11, types: [int] */
        /* JADX WARN: Type inference failed for: r12v12 */
        /* JADX WARN: Type inference failed for: r12v13, types: [int] */
        /* JADX WARN: Type inference failed for: r14v10 */
        /* JADX WARN: Type inference failed for: r14v11 */
        /* JADX WARN: Type inference failed for: r14v12 */
        /* JADX WARN: Type inference failed for: r14v16, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r14v18 */
        /* JADX WARN: Type inference failed for: r14v19 */
        /* JADX WARN: Type inference failed for: r14v23 */
        /* JADX WARN: Type inference failed for: r14v28 */
        /* JADX WARN: Type inference failed for: r14v29 */
        /* JADX WARN: Type inference failed for: r14v30 */
        /* JADX WARN: Type inference failed for: r14v31 */
        /* JADX WARN: Type inference failed for: r14v32 */
        /* JADX WARN: Type inference failed for: r14v33 */
        /* JADX WARN: Type inference failed for: r14v34 */
        /* JADX WARN: Type inference failed for: r14v35 */
        /* JADX WARN: Type inference failed for: r14v36 */
        /* JADX WARN: Type inference failed for: r14v37 */
        /* JADX WARN: Type inference failed for: r14v38 */
        /* JADX WARN: Type inference failed for: r14v39 */
        /* JADX WARN: Type inference failed for: r14v4 */
        /* JADX WARN: Type inference failed for: r14v5 */
        /* JADX WARN: Type inference failed for: r14v6 */
        /* JADX WARN: Type inference failed for: r14v7 */
        /* JADX WARN: Type inference failed for: r14v8 */
        /* JADX WARN: Type inference failed for: r14v9 */
        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] getSDKAppID(android.content.Context r32, int r33, int r34, int r35) {
            /*
                Method dump skipped, instruction units count: 1680
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.s.AuthenticationRequestParameters.getDeviceData.getSDKAppID(android.content.Context, int, int, int):java.lang.Object[]");
        }

        public static void init$0() {
            $$a = new byte[]{26, 112, 0, -80, 0, -17, 31, 13, -9, 8, -49, -2, 37, 3, 0, -17, 31, 13, -9, -11, -32, 15, -15, -7, 16, -4, -19, 9, -8, -1, 35, 3, -3, 3, -3, 50};
            $$b = 184;
        }

        public static void init$1() {
            $$c = new byte[]{47, 95, 67, 92};
            $$d = 149;
        }

        public /* synthetic */ getDeviceData(byte b8) {
            this();
        }
    }
}
