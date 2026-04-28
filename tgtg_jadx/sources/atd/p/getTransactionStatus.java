package atd.p;

import android.app.Application;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/UsbMassStorageEnabled;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUsbMassStorageEnabled.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UsbMassStorageEnabled.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/UsbMassStorageEnabled\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"})
public final class getTransactionStatus extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static long getDeviceData;
    private static int getMessageVersion;
    private static int getSDKAppID;
    private static int getSDKTransactionID;

    @NotNull
    private final atd.t.getSDKReferenceNumber getSDKReferenceNumber;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(byte r6, byte r7, byte r8) {
        /*
            byte[] r0 = atd.p.getTransactionStatus.$$a
            int r8 = r8 * 3
            int r1 = 1 - r8
            int r6 = r6 * 2
            int r6 = r6 + 97
            int r7 = r7 * 2
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L1a
            r6 = r8
            r3 = r0
            r4 = r2
            r0 = r7
            goto L2f
        L1a:
            r3 = r2
        L1b:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L26:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r0
            r0 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2f:
            int r6 = r6 + r7
            int r7 = r0 + 1
            r0 = r3
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.p.getTransactionStatus.$$d(byte, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKTransactionID = 0;
        getMessageVersion = 1;
        AuthenticationRequestParameters = 0;
        getSDKAppID = 1;
        getSDKAppID();
        ViewConfiguration.getEdgeSlop();
        new AuthenticationRequestParameters((byte) 0);
        int i11 = getSDKTransactionID + 39;
        getMessageVersion = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 38 / 0;
        }
    }

    private getTransactionStatus(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.getSDKReferenceNumber = getsdkreferencenumber;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(java.lang.String r22, int r23, java.lang.Object[] r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.p.getTransactionStatus.b(java.lang.String, int, java.lang.Object[]):void");
    }

    public static void getSDKAppID() {
        getDeviceData = 4265768242246200286L;
    }

    public static void init$0() {
        $$a = new byte[]{28, -116, 103, -92};
        $$b = 157;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x004f A[PHI: r0
      0x004f: PHI (r0v11 java.lang.String) = (r0v10 java.lang.String), (r0v22 java.lang.String) binds: [B:8:0x004d, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult getSDKReferenceNumber() throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = atd.p.getTransactionStatus.AuthenticationRequestParameters
            int r0 = r0 + 13
            int r1 = r0 % 128
            atd.p.getTransactionStatus.getSDKAppID = r1
            int r0 = r0 % 2
            atd.t.getSDKReferenceNumber r1 = r6.getSDKReferenceNumber
            java.lang.String r2 = "㉃䄺풪栔ﾧ猬蚿ᨼꦑ㴲내쐬宰\uef24抣\uf622֙餼Ⲷꀺ㞸䬱\udeb9刻"
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L32
            int r0 = android.os.Process.getThreadPriority(r4)
            int r0 = r0 % 37
            int r0 = r0 >>> 64
            r5 = 11623(0x2d67, float:1.6287E-41)
            int r0 = r5 << r0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            b(r2, r0, r4)
            r0 = r4[r3]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String r0 = r1.AuthenticationRequestParameters(r0)
            if (r0 == 0) goto L62
            goto L4f
        L32:
            int r0 = android.os.Process.getThreadPriority(r3)
            int r0 = r0 + 20
            int r0 = r0 >> 6
            int r0 = 29567 - r0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            b(r2, r0, r4)
            r0 = r4[r3]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String r0 = r1.AuthenticationRequestParameters(r0)
            if (r0 == 0) goto L62
        L4f:
            java.lang.Boolean r0 = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKAppID.getSDKTransactionID(r0)
            if (r0 == 0) goto L62
            int r1 = atd.p.getTransactionStatus.getSDKAppID
            int r1 = r1 + 121
            int r1 = r1 % 128
            atd.p.getTransactionStatus.AuthenticationRequestParameters = r1
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$BooleanValue r0 = w.a0.h(r0)
            return r0
        L62:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.p.getTransactionStatus.getSDKReferenceNumber():com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/UsbMassStorageEnabled$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthenticationRequestParameters {
        private AuthenticationRequestParameters() {
        }

        public /* synthetic */ AuthenticationRequestParameters(byte b8) {
            this();
        }
    }

    public /* synthetic */ getTransactionStatus(Application application) {
        this(application, new atd.t.getSDKAppID(application));
    }
}
