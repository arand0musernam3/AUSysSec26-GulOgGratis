package atd.p;

import android.app.Application;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/WaitForDebugger;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWaitForDebugger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WaitForDebugger.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/WaitForDebugger\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"})
public final class ChallengeResultKt extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int getDeviceData;
    private static int getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static int getSDKReferenceNumber;
    private static long getSDKTransactionID;

    @NotNull
    private final atd.t.getSDKReferenceNumber AuthenticationRequestParameters;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(int r6, short r7, byte r8) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 97
            byte[] r0 = atd.p.ChallengeResultKt.$$a
            int r6 = r6 * 4
            int r1 = r6 + 1
            int r8 = r8 * 4
            int r8 = 3 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r0
            r4 = r2
            r0 = r8
            goto L2e
        L17:
            r3 = r2
        L18:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r3 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r0
            r0 = r5
        L2e:
            int r7 = r7 + r8
            r8 = r0
            r0 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.p.ChallengeResultKt.$$d(int, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKAppID = 0;
        getSDKEphemeralPublicKey = 1;
        getSDKReferenceNumber = 0;
        getDeviceData = 1;
        AuthenticationRequestParameters();
        ViewConfiguration.getDoubleTapTimeout();
        new getSDKAppID((byte) 0);
        getSDKEphemeralPublicKey = (getSDKAppID + 87) % 128;
    }

    private ChallengeResultKt(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.AuthenticationRequestParameters = getsdkreferencenumber;
    }

    public static void AuthenticationRequestParameters() {
        getSDKTransactionID = 3955645987404109905L;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(java.lang.String r24, int r25, java.lang.Object[] r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.p.ChallengeResultKt.b(java.lang.String, int, java.lang.Object[]):void");
    }

    public static void init$0() {
        $$a = new byte[]{121, 73, 61, -82};
        $$b = 229;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        if (r0 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
    
        r0 = w.a0.h(r0);
        atd.p.ChallengeResultKt.getDeviceData = (atd.p.ChallengeResultKt.getSDKReferenceNumber + 31) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0035, code lost:
    
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
            r5 = this;
            atd.t.getSDKReferenceNumber r0 = r5.AuthenticationRequestParameters
            r1 = 0
            int r2 = android.view.View.MeasureSpec.getMode(r1)
            r3 = 64091(0xfa5b, float:8.981E-41)
            int r3 = r3 - r2
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = "쇎㮃㕦⻜⢊∘ῴᦶጾ೮ْ2綈睁焤檉摻"
            b(r4, r3, r2)
            r2 = r2[r1]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.intern()
            java.lang.String r0 = r0.AuthenticationRequestParameters(r2)
            r2 = 35
            if (r0 == 0) goto L4b
            int r3 = atd.p.ChallengeResultKt.getDeviceData
            int r3 = r3 + 125
            int r4 = r3 % 128
            atd.p.ChallengeResultKt.getSDKReferenceNumber = r4
            int r3 = r3 % 2
            if (r3 == 0) goto L38
            java.lang.Boolean r0 = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKAppID.getSDKTransactionID(r0)
            int r1 = r2 / 0
            if (r0 == 0) goto L4b
            goto L3e
        L38:
            java.lang.Boolean r0 = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKAppID.getSDKTransactionID(r0)
            if (r0 == 0) goto L4b
        L3e:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$BooleanValue r0 = w.a0.h(r0)
            int r1 = atd.p.ChallengeResultKt.getSDKReferenceNumber
            int r1 = r1 + 31
            int r1 = r1 % 128
            atd.p.ChallengeResultKt.getDeviceData = r1
            return r0
        L4b:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r0.<init>(r1)
            int r1 = atd.p.ChallengeResultKt.getDeviceData
            int r1 = r1 + r2
            int r2 = r1 % 128
            atd.p.ChallengeResultKt.getSDKReferenceNumber = r2
            int r1 = r1 % 2
            if (r1 != 0) goto L5e
            return r0
        L5e:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.p.ChallengeResultKt.getSDKReferenceNumber():com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/WaitForDebugger$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKAppID {
        private getSDKAppID() {
        }

        public /* synthetic */ getSDKAppID(byte b8) {
            this();
        }
    }

    public /* synthetic */ ChallengeResultKt(Application application) {
        this(application, new atd.t.getSDKAppID(application));
    }
}
