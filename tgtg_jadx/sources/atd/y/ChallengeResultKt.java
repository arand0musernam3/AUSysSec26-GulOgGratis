package atd.y;

import android.app.Application;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.braze.Constants;
import java.lang.reflect.Method;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.LocalizedMessage;
import org.jetbrains.annotations.NotNull;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/TextAutoReplace;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextAutoReplace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextAutoReplace.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/TextAutoReplace\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"})
public final class ChallengeResultKt extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int ChallengeResult;
    private static char getDeviceData;
    private static int getSDKEphemeralPublicKey;
    private static char[] getSDKReferenceNumber;
    private static int getSDKTransactionID;

    @NotNull
    private final atd.t.getSDKReferenceNumber getSDKAppID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(byte r6, byte r7, short r8) {
        /*
            int r6 = r6 + 4
            int r7 = r7 * 3
            int r0 = 1 - r7
            int r8 = 122 - r8
            byte[] r1 = atd.y.ChallengeResultKt.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L16
            r8 = r6
            r3 = r1
            r4 = r2
            r1 = r7
            goto L2d
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r6 = r6 + 1
            int r4 = r3 + 1
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L26:
            r3 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r1
            r1 = r5
        L2d:
            int r6 = -r6
            int r6 = r6 + r1
            r1 = r8
            r8 = r6
            r6 = r1
            r1 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.y.ChallengeResultKt.$$d(byte, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKEphemeralPublicKey = 0;
        ChallengeResult = 1;
        AuthenticationRequestParameters = 0;
        getSDKTransactionID = 1;
        getSDKAppID();
        Process.myTid();
        ViewConfiguration.getGlobalActionKeyTimeout();
        new getSDKAppID((byte) 0);
        int i11 = getSDKEphemeralPublicKey + 15;
        ChallengeResult = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private ChallengeResultKt(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.getSDKAppID = getsdkreferencenumber;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(int r47, byte r48, java.lang.String r49, java.lang.Object[] r50) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.y.ChallengeResultKt.b(int, byte, java.lang.String, java.lang.Object[]):void");
    }

    public static void getSDKAppID() {
        getSDKReferenceNumber = new char[]{30967, 30898, 30962, 30887, 30873, 30883, 30902, 30974, 30961, 30899, 30855, 30890, 30900, 30885, 30960, 30889};
        getDeviceData = (char) 19800;
    }

    public static void init$0() {
        $$a = new byte[]{65, 100, 30, 30};
        $$b = 73;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
    
        if (r0 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        atd.y.ChallengeResultKt.AuthenticationRequestParameters = (atd.y.ChallengeResultKt.getSDKTransactionID + 23) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0052, code lost:
    
        return w.a0.h(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003d, code lost:
    
        if (r0 != null) goto L11;
     */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult getSDKReferenceNumber() throws java.lang.Throwable {
        /*
            r6 = this;
            atd.t.getSDKReferenceNumber r0 = r6.getSDKAppID
            r1 = 0
            int r2 = android.graphics.Color.rgb(r1, r1, r1)
            r3 = 16777228(0x100000c, float:2.350992E-38)
            int r2 = r2 + r3
            java.lang.String r3 = ""
            int r3 = android.text.TextUtils.getTrimmedLength(r3)
            int r3 = 70 - r3
            byte r3 = (byte) r3
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "\u0001\u000b\u0003\r\b\u0000\u0006\u0007\u000f\u0007\u0001\t"
            b(r2, r3, r5, r4)
            r2 = r4[r1]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.intern()
            java.lang.String r0 = r0.AuthenticationRequestParameters(r2)
            if (r0 == 0) goto L53
            int r2 = atd.y.ChallengeResultKt.AuthenticationRequestParameters
            int r2 = r2 + 61
            int r3 = r2 % 128
            atd.y.ChallengeResultKt.getSDKTransactionID = r3
            int r2 = r2 % 2
            if (r2 != 0) goto L40
            java.lang.Boolean r0 = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKAppID.getSDKTransactionID(r0)
            r2 = 91
            int r2 = r2 / r1
            if (r0 == 0) goto L53
            goto L46
        L40:
            java.lang.Boolean r0 = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKAppID.getSDKTransactionID(r0)
            if (r0 == 0) goto L53
        L46:
            int r1 = atd.y.ChallengeResultKt.getSDKTransactionID
            int r1 = r1 + 23
            int r1 = r1 % 128
            atd.y.ChallengeResultKt.AuthenticationRequestParameters = r1
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$BooleanValue r0 = w.a0.h(r0)
            return r0
        L53:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.y.ChallengeResultKt.getSDKReferenceNumber():com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/TextAutoReplace$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKAppID {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10;
        private static int $11;
        private static int AuthenticationRequestParameters;
        private static boolean getDeviceData;
        private static boolean getSDKAppID;
        private static int getSDKEphemeralPublicKey;
        private static char[] getSDKReferenceNumber;
        private static int getSDKTransactionID;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$e(int r6, int r7, short r8) {
            /*
                int r8 = r8 * 2
                int r8 = r8 + 1
                byte[] r0 = atd.y.ChallengeResultKt.getSDKAppID.$$c
                int r6 = r6 + 4
                int r7 = r7 * 4
                int r7 = r7 + 111
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r7
                r7 = r8
                r4 = r2
                goto L27
            L15:
                r3 = r2
            L16:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                if (r4 != r8) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L23:
                int r6 = r6 + 1
                r3 = r0[r6]
            L27:
                int r7 = r7 + r3
                r3 = r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.y.ChallengeResultKt.getSDKAppID.$$e(int, int, short):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getSDKTransactionID = 0;
            getSDKEphemeralPublicKey = 1;
            getSDKReferenceNumber = new char[]{21656, 21663};
            AuthenticationRequestParameters = 1286296635;
            getSDKAppID = true;
            getDeviceData = true;
        }

        private getSDKAppID() {
        }

        public static void AuthenticationRequestParameters(long j9, long j11) throws Throwable {
            getSDKTransactionID = (getSDKEphemeralPublicKey + 49) % 128;
            byte[] bArr = $$a;
            byte b8 = bArr[28];
            byte b11 = (byte) (b8 + 1);
            byte b12 = b8;
            Object[] objArr = new Object[1];
            a(b11, b12, (byte) (b12 + 1), objArr);
            a0.B(null, (String) objArr[0], "AuthenticationRequestParameters");
            getSDKTransactionID = (getSDKEphemeralPublicKey + 1) % 128;
            try {
                byte b13 = bArr[28];
                byte b14 = (byte) (b13 + 1);
                byte b15 = b13;
                Object[] objArr2 = new Object[1];
                a(b14, b15, (byte) (b15 + 1), objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                byte b16 = bArr[28];
                byte b17 = b16;
                Object[] objArr3 = new Object[1];
                a(b17, (byte) (b17 + 1), b16, objArr3);
                Method method = cls.getMethod((String) objArr3[0], null);
                method.setAccessible(true);
                Object objInvoke = method.invoke(null, null);
                Object[] objArr4 = {atd.as.getSDKEphemeralPublicKey.class.getField("getDeviceData").get(null)};
                Object[] objArr5 = new Object[1];
                b(128 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), null, null, "\u0082\u0082\u0081", objArr5);
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

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(byte r7, byte r8, int r9, java.lang.Object[] r10) {
            /*
                int r7 = r7 * 6
                int r7 = 103 - r7
                int r8 = r8 * 25
                int r8 = r8 + 4
                byte[] r0 = atd.y.ChallengeResultKt.getSDKAppID.$$a
                int r9 = r9 * 15
                int r9 = r9 + 11
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L17
                r7 = r8
                r3 = r9
                r5 = r2
                goto L2c
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r7
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r9) goto L27
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L27:
                r3 = r0[r8]
                r6 = r8
                r8 = r7
                r7 = r6
            L2c:
                int r3 = -r3
                int r8 = r8 + r3
                int r7 = r7 + 1
                int r8 = r8 + (-5)
                r3 = r8
                r8 = r7
                r7 = r3
                r3 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.y.ChallengeResultKt.getSDKAppID.a(byte, byte, int, java.lang.Object[]):void");
        }

        private static void b(int i11, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
            char[] charArray;
            int i12;
            char[] cArr;
            int i13;
            int i14;
            String str3 = str2;
            Object bytes = str3;
            if (str3 != null) {
                $10 = ($11 + 25) % 128;
                bytes = str3.getBytes(LocalizedMessage.DEFAULT_ENCODING);
            }
            byte[] bArr = (byte[]) bytes;
            if (str != null) {
                charArray = str.toCharArray();
                $11 = ($10 + 103) % 128;
            } else {
                charArray = str;
            }
            char[] cArr2 = charArray;
            atd.bb.ChallengeResultTimeout challengeResultTimeout = new atd.bb.ChallengeResultTimeout();
            char[] cArr3 = getSDKReferenceNumber;
            Class cls = Integer.TYPE;
            char c3 = '0';
            int i15 = -1;
            int i16 = 0;
            if (cArr3 != null) {
                int length = cArr3.length;
                char[] cArr4 = new char[length];
                int i17 = 0;
                while (i17 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i17])};
                        Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(887083134);
                        if (sDKTransactionID == null) {
                            byte b8 = (byte) i15;
                            i14 = i15;
                            byte b11 = (byte) (b8 + 1);
                            sDKTransactionID = atd.e.ChallengeResult.getDeviceData(2554 - TextUtils.lastIndexOf("", c3), (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(i16) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i16) == 0.0d ? 0 : -1)) + 48598), 31 - (ViewConfiguration.getWindowTouchSlop() >> 8), -390605202, false, $$e(b8, b11, b11), new Class[]{cls});
                        } else {
                            i14 = i15;
                        }
                        cArr4[i17] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                        i17++;
                        i15 = i14;
                        c3 = '0';
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
            int i18 = i15;
            Object[] objArr3 = {Integer.valueOf(AuthenticationRequestParameters)};
            Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(-1144184369);
            long j9 = 0;
            if (sDKTransactionID2 == null) {
                sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(TextUtils.getCapsMode("", 0, 0) + 147, (char) ((-1) - Process.getGidForName("")), 33 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1738876895, false, Constants.BRAZE_PUSH_TITLE_KEY, new Class[]{cls});
            }
            int iIntValue = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
            int i19 = 1124287645;
            if (getDeviceData) {
                int i21 = $11 + 71;
                $10 = i21 % 128;
                if (i21 % 2 != 0) {
                    int length2 = bArr.length;
                    challengeResultTimeout.AuthenticationRequestParameters = length2;
                    cArr = new char[length2];
                    i12 = 0;
                } else {
                    i12 = 0;
                    int length3 = bArr.length;
                    challengeResultTimeout.AuthenticationRequestParameters = length3;
                    cArr = new char[length3];
                }
                challengeResultTimeout.getSDKAppID = i12;
                while (true) {
                    int i22 = challengeResultTimeout.getSDKAppID;
                    int i23 = challengeResultTimeout.AuthenticationRequestParameters;
                    if (i22 >= i23) {
                        objArr[0] = new String(cArr);
                        return;
                    }
                    cArr[i22] = (char) (cArr3[bArr[(i23 - 1) - i22] + i11] - iIntValue);
                    Object[] objArr4 = {challengeResultTimeout, challengeResultTimeout};
                    Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(i19);
                    if (sDKTransactionID3 == null) {
                        i13 = i19;
                        byte b12 = (byte) i18;
                        byte b13 = (byte) (-b12);
                        sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(1698 - (Process.getElapsedCpuTime() > j9 ? 1 : (Process.getElapsedCpuTime() == j9 ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 29 - (ViewConfiguration.getTapTimeout() >> 16), -1620360563, false, $$e(b12, b13, (byte) (b13 - 1)), new Class[]{Object.class, Object.class});
                    } else {
                        i13 = i19;
                    }
                    ((Method) sDKTransactionID3).invoke(null, objArr4);
                    i19 = i13;
                    j9 = 0;
                    i18 = -1;
                }
            } else if (getSDKAppID) {
                int length4 = cArr2.length;
                challengeResultTimeout.AuthenticationRequestParameters = length4;
                char[] cArr5 = new char[length4];
                challengeResultTimeout.getSDKAppID = 0;
                while (true) {
                    int i24 = challengeResultTimeout.getSDKAppID;
                    int i25 = challengeResultTimeout.AuthenticationRequestParameters;
                    if (i24 >= i25) {
                        objArr[0] = new String(cArr5);
                        return;
                    }
                    cArr5[i24] = (char) (cArr3[cArr2[(i25 - 1) - i24] - i11] - iIntValue);
                    Object[] objArr5 = {challengeResultTimeout, challengeResultTimeout};
                    Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(1124287645);
                    if (sDKTransactionID4 == null) {
                        byte b14 = (byte) (-1);
                        byte b15 = (byte) (-b14);
                        sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1696, (char) TextUtils.indexOf("", ""), 29 - (ViewConfiguration.getLongPressTimeout() >> 16), -1620360563, false, $$e(b14, b15, (byte) (b15 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) sDKTransactionID4).invoke(null, objArr5);
                }
            } else {
                int length5 = iArr.length;
                challengeResultTimeout.AuthenticationRequestParameters = length5;
                char[] cArr6 = new char[length5];
                challengeResultTimeout.getSDKAppID = 0;
                while (true) {
                    int i26 = challengeResultTimeout.getSDKAppID;
                    int i27 = challengeResultTimeout.AuthenticationRequestParameters;
                    if (i26 >= i27) {
                        objArr[0] = new String(cArr6);
                        return;
                    }
                    int i28 = $10 + 49;
                    $11 = i28 % 128;
                    if (i28 % 2 == 0) {
                        cArr6[i26] = (char) (cArr3[iArr[(i27 % 0) / i26] + i11] >> iIntValue);
                    } else {
                        cArr6[i26] = (char) (cArr3[iArr[(i27 - 1) - i26] - i11] - iIntValue);
                        i26++;
                    }
                    challengeResultTimeout.getSDKAppID = i26;
                }
            }
        }

        public static void init$0() {
            $$a = new byte[]{79, 112, 3, 57, -24, 11, 49, -56, -22, 63, -62, -3, -20, 28, 10, -12, -14, -35, 12, -18, -10, 13, -7, -22, 6, -11, -4, 32, 0, -3, -20, 28, 10, -12, 5, -52, -5, 34, 0};
            $$b = 160;
        }

        public static void init$1() {
            $$c = new byte[]{64, 105, 71, -25};
            $$d = 152;
        }

        public /* synthetic */ getSDKAppID(byte b8) {
            this();
        }
    }

    public /* synthetic */ ChallengeResultKt(Application application) {
        this(application, new atd.t.AuthenticationRequestParameters(application));
    }
}
