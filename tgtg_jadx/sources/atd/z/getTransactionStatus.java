package atd.z;

import android.app.Application;
import android.graphics.Color;
import android.net.wifi.WifiManager;
import android.os.Process;
import android.view.KeyEvent;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DefaultPermissionChecker;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.adyen.threeds2.internal.deviceinfo.parameter.PermissionChecker;
import java.lang.reflect.Method;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/IsScanAlwaysAvailable;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/WifiDeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "permissionChecker", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIsScanAlwaysAvailable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IsScanAlwaysAvailable.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/wifi/IsScanAlwaysAvailable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
public final class getTransactionStatus extends getErrorCode {
    private static int AuthenticationRequestParameters = 0;
    private static int ChallengeResult = 1;
    private static int ChallengeResultCancelled = 1;
    private static int getDeviceData;
    private static boolean getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static char[] getSDKReferenceNumber;
    private static boolean getSDKTransactionID;

    static {
        getSDKTransactionID();
        KeyEvent.keyCodeFromString("");
        new getSDKAppID((byte) 0);
        int i11 = getSDKEphemeralPublicKey + 93;
        ChallengeResult = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private getTransactionStatus(@NotNull Application application, @NotNull PermissionChecker permissionChecker) {
        super(application, permissionChecker);
        application.getClass();
        permissionChecker.getClass();
    }

    public static void getSDKTransactionID() {
        getSDKReferenceNumber = new char[]{21802, 21813, 21816, 21820};
        getDeviceData = 1286296805;
        getSDKTransactionID = true;
        getSDKAppID = true;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() {
        ChallengeResultCancelled = (AuthenticationRequestParameters + 115) % 128;
        if (!getSDKEphemeralPublicKey()) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.MISSING_PERMISSION);
        }
        WifiManager wifiManagerChallengeResult = ChallengeResult();
        if (wifiManagerChallengeResult == null) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
        int i11 = ChallengeResultCancelled + 53;
        AuthenticationRequestParameters = i11 % 128;
        int i12 = i11 % 2;
        boolean zM130constructorimpl = DeviceParameterResult.Success.BooleanValue.m130constructorimpl(wifiManagerChallengeResult.isScanAlwaysAvailable());
        if (i12 == 0) {
            return DeviceParameterResult.Success.BooleanValue.m129boximpl(zM130constructorimpl);
        }
        DeviceParameterResult.Success.BooleanValue.m129boximpl(zM130constructorimpl);
        throw null;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/IsScanAlwaysAvailable$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKAppID {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10;
        private static int $11;
        private static long AuthenticationRequestParameters;
        private static char[] getSDKAppID;
        private static int getSDKReferenceNumber;
        private static int getSDKTransactionID;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$e(short r5, int r6, int r7) {
            /*
                int r6 = r6 * 2
                int r6 = 4 - r6
                int r5 = r5 + 103
                int r7 = r7 * 4
                int r7 = 1 - r7
                byte[] r0 = atd.z.getTransactionStatus.getSDKAppID.$$c
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L15
                r4 = r6
                r5 = r7
                r3 = r2
                goto L25
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r5
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r7) goto L23
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                return r5
            L23:
                r4 = r0[r6]
            L25:
                int r6 = r6 + 1
                int r5 = r5 + r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.z.getTransactionStatus.getSDKAppID.$$e(short, int, int):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getSDKTransactionID = 0;
            getSDKReferenceNumber = 1;
            getSDKAppID = new char[]{58141, 32057, 57178};
            AuthenticationRequestParameters = -205859192858777041L;
        }

        private getSDKAppID() {
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(int r7, byte r8, short r9, java.lang.Object[] r10) {
            /*
                int r9 = r9 * 25
                int r9 = r9 + 4
                byte[] r0 = atd.z.getTransactionStatus.getSDKAppID.$$a
                int r8 = r8 * 15
                int r8 = r8 + 11
                int r7 = r7 * 6
                int r7 = r7 + 97
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r0
                r5 = r2
                r0 = r9
                goto L2d
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r7
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r8) goto L27
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L27:
                r3 = r0[r9]
                r6 = r0
                r0 = r9
                r9 = r3
                r3 = r6
            L2d:
                int r7 = r7 + r9
                int r7 = r7 + (-5)
                int r9 = r0 + 1
                r0 = r3
                r3 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.z.getTransactionStatus.getSDKAppID.a(int, byte, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x018f  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0190  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void b(int r27, char r28, int r29, java.lang.Object[] r30) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 429
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.z.getTransactionStatus.getSDKAppID.b(int, char, int, java.lang.Object[]):void");
        }

        public static void getDeviceData(long j9, long j11) throws Throwable {
            int i11 = getSDKTransactionID + 35;
            getSDKReferenceNumber = i11 % 128;
            if (i11 % 2 == 0) {
                byte b8 = $$a[28];
                byte b11 = b8;
                Object[] objArr = new Object[1];
                a(b11, (byte) (b11 + 1), b8, objArr);
                a0.B(null, (String) objArr[0], "AuthenticationRequestParameters");
                throw null;
            }
            byte[] bArr = $$a;
            byte b12 = bArr[28];
            byte b13 = b12;
            Object[] objArr2 = new Object[1];
            a(b13, (byte) (b13 + 1), b12, objArr2);
            a0.B(null, (String) objArr2[0], "AuthenticationRequestParameters");
            getSDKReferenceNumber = (getSDKTransactionID + 113) % 128;
            try {
                byte b14 = bArr[28];
                byte b15 = b14;
                Object[] objArr3 = new Object[1];
                a(b15, (byte) (b15 + 1), b14, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                byte b16 = (byte) ($$b & 5);
                byte b17 = bArr[28];
                Object[] objArr4 = new Object[1];
                a(b16, b17, (byte) (b17 + 1), objArr4);
                Method method = cls.getMethod((String) objArr4[0], null);
                method.setAccessible(true);
                Object objInvoke = method.invoke(null, null);
                Object[] objArr5 = {atd.as.getSDKEphemeralPublicKey.class.getField("getDeviceData").get(null)};
                Object[] objArr6 = new Object[1];
                b(ExpandableListView.getPackedPositionGroup(0L), (char) (6002 - Color.blue(0)), 3 - (Process.myTid() >> 22), objArr6);
                Method method2 = Set.class.getMethod(((String) objArr6[0]).intern(), Object.class);
                method2.setAccessible(true);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }

        public static void init$0() {
            $$a = new byte[]{59, 114, 103, -78, 24, -11, -49, 56, 22, -63, 62, 3, 20, -28, -10, 12, 14, 35, -12, 18, 10, -13, 7, 22, -6, 11, 4, -32, 0, 3, 20, -28, -10, 12, -5, 52, 5, -34, 0};
            $$b = 75;
        }

        public static void init$1() {
            $$c = new byte[]{62, -80, -102, 31};
            $$d = 220;
        }

        public /* synthetic */ getSDKAppID(byte b8) {
            this();
        }
    }

    public /* synthetic */ getTransactionStatus(Application application) {
        this(application, new DefaultPermissionChecker(application));
    }
}
