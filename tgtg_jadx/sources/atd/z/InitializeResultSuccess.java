package atd.z;

import android.graphics.Color;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/WifiMacAddress;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Failure;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Failure;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InitializeResultSuccess extends DeviceParameter {
    private static boolean AuthenticationRequestParameters = false;
    private static int BuildConfig = 1;
    private static int ChallengeResultCancelled = 0;
    private static int getDeviceData = 0;
    private static int getSDKAppID = 0;
    private static int getSDKEphemeralPublicKey = 1;
    private static char[] getSDKReferenceNumber;
    private static boolean getSDKTransactionID;

    static {
        getSDKAppID();
        ViewConfiguration.getGlobalActionKeyTimeout();
        new getSDKReferenceNumber((byte) 0);
        BuildConfig = (ChallengeResultCancelled + 117) % 128;
    }

    @NotNull
    private static DeviceParameterResult.Failure AuthenticationRequestParameters() {
        DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.UNSUPPORTED_OR_DEPRECATED);
        int i11 = getSDKAppID + 35;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 5 / 0;
        }
        return failure;
    }

    public static void getSDKAppID() {
        getSDKReferenceNumber = new char[]{21641, 21656, 21662, 21632};
        getDeviceData = 1286296648;
        AuthenticationRequestParameters = true;
        getSDKTransactionID = true;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getSDKReferenceNumber() {
        getSDKEphemeralPublicKey = (getSDKAppID + 61) % 128;
        DeviceParameterResult.Failure failureAuthenticationRequestParameters = AuthenticationRequestParameters();
        getSDKAppID = (getSDKEphemeralPublicKey + 47) % 128;
        return failureAuthenticationRequestParameters;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/WifiMacAddress$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKReferenceNumber {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10;
        private static int $11;
        private static int AuthenticationRequestParameters;
        private static int[] getDeviceData;
        private static int getSDKReferenceNumber;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$e(int r6, byte r7, short r8) {
            /*
                byte[] r0 = atd.z.InitializeResultSuccess.getSDKReferenceNumber.$$c
                int r7 = 114 - r7
                int r8 = r8 * 4
                int r1 = r8 + 1
                int r6 = r6 * 3
                int r6 = 4 - r6
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L16
                r7 = r6
                r3 = r0
                r4 = r2
                r0 = r8
                goto L2b
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r7
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r8) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L24:
                r3 = r0[r6]
                r5 = r7
                r7 = r6
                r6 = r3
                r3 = r0
                r0 = r5
            L2b:
                int r6 = r6 + r0
                int r7 = r7 + 1
                r0 = r7
                r7 = r6
                r6 = r0
                r0 = r3
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.z.InitializeResultSuccess.getSDKReferenceNumber.$$e(int, byte, short):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            AuthenticationRequestParameters = 0;
            getSDKReferenceNumber = 1;
            getDeviceData = new int[]{1861438879, 1150208972, -32443084, 1420083726, 1948825026, -1159812740, -1900919605, -1499467320, -1470445048, -693099641, -452928064, 45735554, -1051391072, 2043114907, -2074680585, 2044526253, 50949285, -870575723};
        }

        private getSDKReferenceNumber() {
        }

        private static void a(int[] iArr, int i11, Object[] objArr) throws Throwable {
            int i12;
            char c3;
            char[] cArr;
            int[] iArr2;
            int length;
            int[] iArr3;
            int i13;
            int i14;
            int i15;
            atd.bb.getMessageVersion getmessageversion = new atd.bb.getMessageVersion();
            char[] cArr2 = new char[4];
            int i16 = 2;
            char[] cArr3 = new char[iArr.length * 2];
            int[] iArr4 = getDeviceData;
            int i17 = -1667528016;
            Class cls = Integer.TYPE;
            int i18 = 16;
            int i19 = 0;
            if (iArr4 != null) {
                int i21 = $11 + 107;
                $10 = i21 % 128;
                if (i21 % 2 != 0) {
                    length = iArr4.length;
                    iArr3 = new int[length];
                } else {
                    length = iArr4.length;
                    iArr3 = new int[length];
                }
                int i22 = 0;
                while (i22 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr4[i22])};
                        Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(i17);
                        if (sDKTransactionID == null) {
                            i14 = i17;
                            i13 = i16;
                            byte b8 = (byte) i19;
                            i15 = i18;
                            byte b11 = b8;
                            sDKTransactionID = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2222, (char) (53070 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 21 - ((Process.getThreadPriority(i19) + 20) >> 6), 1089703072, false, $$e(b8, b11, b11), new Class[]{cls});
                        } else {
                            i13 = i16;
                            i14 = i17;
                            i15 = i18;
                        }
                        iArr3[i22] = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
                        i22++;
                        i16 = i13;
                        i17 = i14;
                        i18 = i15;
                        i19 = 0;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                iArr4 = iArr3;
            }
            int i23 = i16;
            int i24 = i17;
            int i25 = i18;
            int length2 = iArr4.length;
            int[] iArr5 = new int[length2];
            int[] iArr6 = getDeviceData;
            if (iArr6 != null) {
                int length3 = iArr6.length;
                int[] iArr7 = new int[length3];
                int i26 = 0;
                while (i26 < length3) {
                    $11 = ($10 + 103) % 128;
                    Object[] objArr3 = {Integer.valueOf(iArr6[i26])};
                    Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(i24);
                    if (sDKTransactionID2 == null) {
                        cArr = cArr2;
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        iArr2 = iArr6;
                        sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(2222 - TextUtils.lastIndexOf("", '0', 0), (char) (53070 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 21 - ExpandableListView.getPackedPositionType(0L), 1089703072, false, $$e(b12, b13, b13), new Class[]{cls});
                    } else {
                        cArr = cArr2;
                        iArr2 = iArr6;
                    }
                    iArr7[i26] = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
                    i26++;
                    $11 = ($10 + 71) % 128;
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
                int i27 = getmessageversion.getSDKAppID;
                if (i27 >= iArr.length) {
                    objArr[0] = new String(cArr3, 0, i11);
                    return;
                }
                int i28 = iArr[i27];
                char c8 = (char) (i28 >> 16);
                cArr4[c7] = c8;
                char c11 = (char) i28;
                char c12 = 1;
                cArr4[1] = c11;
                char c13 = (char) (iArr[i27 + 1] >> 16);
                cArr4[i23] = c13;
                char c14 = (char) iArr[i27 + 1];
                cArr4[3] = c14;
                getmessageversion.getDeviceData = (c8 << 16) + c11;
                getmessageversion.AuthenticationRequestParameters = (c13 << 16) + c14;
                atd.bb.getMessageVersion.getSDKTransactionID(iArr5);
                int i29 = 0;
                while (true) {
                    i12 = getmessageversion.getDeviceData;
                    if (i29 >= i25) {
                        break;
                    }
                    int i31 = i12 ^ iArr5[i29];
                    getmessageversion.getDeviceData = i31;
                    int sDKReferenceNumber = atd.bb.getMessageVersion.getSDKReferenceNumber(i31);
                    Object[] objArr4 = new Object[4];
                    objArr4[3] = getmessageversion;
                    objArr4[i23] = getmessageversion;
                    objArr4[c12] = Integer.valueOf(sDKReferenceNumber);
                    objArr4[0] = getmessageversion;
                    Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(1513246698);
                    if (sDKTransactionID3 == null) {
                        byte b14 = (byte) 0;
                        byte b15 = (byte) (b14 + 2);
                        c3 = c12;
                        sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(2386 - Color.argb(0, 0, 0, 0), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 19 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -2040903174, false, $$e(b14, b15, (byte) (b15 - 2)), new Class[]{Object.class, cls, Object.class, Object.class});
                    } else {
                        c3 = c12;
                    }
                    int iIntValue = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                    getmessageversion.getDeviceData = getmessageversion.AuthenticationRequestParameters;
                    getmessageversion.AuthenticationRequestParameters = iIntValue;
                    i29++;
                    c12 = c3;
                    i25 = 16;
                }
                char c15 = c12;
                int i32 = getmessageversion.AuthenticationRequestParameters;
                getmessageversion.getDeviceData = i32;
                getmessageversion.AuthenticationRequestParameters = i12;
                int i33 = i12 ^ iArr5[16];
                getmessageversion.AuthenticationRequestParameters = i33;
                int i34 = i32 ^ iArr5[17];
                getmessageversion.getDeviceData = i34;
                cArr4[0] = (char) (i34 >>> 16);
                cArr4[c15] = (char) i34;
                cArr4[i23] = (char) (i33 >>> 16);
                cArr4[3] = (char) i33;
                atd.bb.getMessageVersion.getSDKTransactionID(iArr5);
                int i35 = getmessageversion.getSDKAppID;
                cArr3[i35 * 2] = cArr4[0];
                cArr3[(i35 * 2) + 1] = cArr4[c15];
                cArr3[(i35 * 2) + 2] = cArr4[i23];
                cArr3[(i35 * 2) + 3] = cArr4[3];
                int i36 = i23;
                Object[] objArr5 = new Object[i36];
                objArr5[c15] = getmessageversion;
                objArr5[0] = getmessageversion;
                Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(35442447);
                if (sDKTransactionID4 == null) {
                    i25 = 16;
                    byte b16 = (byte) 0;
                    byte b17 = (byte) (b16 + 1);
                    sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(TextUtils.indexOf("", "", 0, 0) + 1861, (char) TextUtils.indexOf("", "", 0, 0), (KeyEvent.getMaxKeyCode() >> 16) + 40, -562771681, false, $$e(b16, b17, (byte) (b17 - 1)), new Class[]{Object.class, Object.class});
                } else {
                    i25 = 16;
                }
                ((Method) sDKTransactionID4).invoke(null, objArr5);
                i23 = i36;
                c7 = 0;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0027). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void b(byte r7, int r8, int r9, java.lang.Object[] r10) {
            /*
                int r7 = r7 + 4
                byte[] r0 = atd.z.InitializeResultSuccess.getSDKReferenceNumber.$$a
                int r9 = 104 - r9
                int r8 = 19 - r8
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L11
                r3 = r0
                r5 = r2
                r0 = r8
                goto L27
            L11:
                r3 = r2
            L12:
                byte r4 = (byte) r9
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r8) goto L21
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L21:
                r3 = r0[r7]
                r6 = r0
                r0 = r9
                r9 = r3
                r3 = r6
            L27:
                int r9 = -r9
                int r0 = r0 + r9
                int r9 = r0 + (-2)
                int r7 = r7 + 1
                r0 = r3
                r3 = r5
                goto L12
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.z.InitializeResultSuccess.getSDKReferenceNumber.b(byte, int, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0320  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x03b7 A[Catch: all -> 0x03f8, TryCatch #3 {all -> 0x03f8, blocks: (B:51:0x03aa, B:53:0x03b7, B:56:0x0401), top: B:108:0x03aa, outer: #5 }] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x04ae  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x04b2  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x050d A[Catch: all -> 0x0554, TryCatch #2 {all -> 0x0554, blocks: (B:70:0x0500, B:72:0x050d, B:75:0x0556), top: B:106:0x0500, outer: #5 }] */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0597  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x0602  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0606  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.Object[] getDeviceData(android.content.Context r31, int r32, int r33, int r34) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1744
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.z.InitializeResultSuccess.getSDKReferenceNumber.getDeviceData(android.content.Context, int, int, int):java.lang.Object[]");
        }

        public static void init$0() {
            $$a = new byte[]{77, 37, -113, 18, 0, -17, 31, 13, -9, 8, -49, -2, 37, 3, 0, -17, 31, 13, -9, -11, -32, 15, -15, -7, 16, -4, -19, 9, -8, -1, 35, 3, -3, 3, -3, 50};
            $$b = 58;
        }

        public static void init$1() {
            $$c = new byte[]{13, 19, 98, -85};
            $$d = 59;
        }

        public /* synthetic */ getSDKReferenceNumber(byte b8) {
            this();
        }
    }
}
