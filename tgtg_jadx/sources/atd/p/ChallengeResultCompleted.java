package atd.p;

import android.app.Application;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/StayOnWhilePluggedIn;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStayOnWhilePluggedIn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StayOnWhilePluggedIn.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/StayOnWhilePluggedIn\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1#2:34\n*E\n"})
public final class ChallengeResultCompleted extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;

    @NotNull
    private final atd.t.getSDKReferenceNumber getDeviceData;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(int r6, short r7, int r8) {
        /*
            byte[] r0 = atd.p.ChallengeResultCompleted.$$a
            int r8 = r8 * 2
            int r1 = r8 + 1
            int r6 = r6 * 2
            int r6 = r6 + 4
            int r7 = r7 * 2
            int r7 = 100 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2d
        L17:
            r3 = r7
            r7 = r6
            r6 = r3
            r3 = r2
        L1b:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L28:
            r3 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L2d:
            int r6 = r6 + 1
            int r7 = r7 + r3
            r3 = r7
            r7 = r6
            r6 = r3
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.p.ChallengeResultCompleted.$$d(int, short, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKAppID = 0;
        BuildConfig = 1;
        getSDKReferenceNumber = 0;
        AuthenticationRequestParameters = 1;
        getSDKTransactionID();
        ViewConfiguration.getDoubleTapTimeout();
        TextUtils.indexOf((CharSequence) "", '0', 0);
        KeyEvent.getDeadChar(0, 0);
        new getDeviceData((byte) 0);
        int i11 = getSDKAppID + 55;
        BuildConfig = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private ChallengeResultCompleted(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.getDeviceData = getsdkreferencenumber;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(int r27, int r28, java.lang.String r29, int r30, boolean r31, java.lang.Object[] r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.p.ChallengeResultCompleted.b(int, int, java.lang.String, int, boolean, java.lang.Object[]):void");
    }

    public static void getSDKTransactionID() {
        getSDKTransactionID = 711855322;
    }

    public static void init$0() {
        $$a = new byte[]{18, 16, -71, -48};
        $$b = 53;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0071 A[PHI: r0
      0x0071: PHI (r0v12 java.lang.String) = (r0v11 java.lang.String), (r0v30 java.lang.String) binds: [B:8:0x006f, B:5:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult getSDKReferenceNumber() throws java.lang.Throwable {
        /*
            r12 = this;
            int r0 = atd.p.ChallengeResultCompleted.AuthenticationRequestParameters
            int r0 = r0 + 13
            int r1 = r0 % 128
            atd.p.ChallengeResultCompleted.getSDKReferenceNumber = r1
            int r0 = r0 % 2
            atd.t.getSDKReferenceNumber r1 = r12.getDeviceData
            r2 = 15
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L45
            int r0 = android.view.ViewConfiguration.getMaximumDrawingCacheSize()
            int r0 = r0 << 32
            r5 = 58
            int r6 = r5 % r0
            r0 = 28773(0x7065, float:4.032E-41)
            int r5 = android.view.View.resolveSizeAndState(r4, r3, r4)
            int r7 = r0 / r5
            int r0 = android.view.ViewConfiguration.getTapTimeout()
            int r0 = r0 * 63
            r5 = 68
            int r9 = r5 >> r0
            java.lang.Object[] r11 = new java.lang.Object[r3]
            java.lang.String r8 = "\ufffe\uffff\u0002\ufffb\ufff5\u0006\u0002\u000b��\ufffb\ufffa\ufff5\uffff\u0004\t\n\ufff7\u000f\ufff5\u0005\u0004\ufff5\r"
            r10 = 0
            b(r6, r7, r8, r9, r10, r11)
            r0 = r11[r4]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String r0 = r1.AuthenticationRequestParameters(r0)
            if (r0 == 0) goto Lb2
            goto L71
        L45:
            int r0 = android.view.ViewConfiguration.getMaximumDrawingCacheSize()
            int r0 = r0 >> 24
            int r5 = r0 + 15
            int r0 = android.view.View.resolveSizeAndState(r4, r4, r4)
            int r6 = 135 - r0
            int r0 = android.view.ViewConfiguration.getTapTimeout()
            int r0 = r0 >> 16
            int r8 = 24 - r0
            java.lang.Object[] r10 = new java.lang.Object[r3]
            java.lang.String r7 = "\ufffe\uffff\u0002\ufffb\ufff5\u0006\u0002\u000b��\ufffb\ufffa\ufff5\uffff\u0004\t\n\ufff7\u000f\ufff5\u0005\u0004\ufff5\r"
            r9 = 0
            b(r5, r6, r7, r8, r9, r10)
            r0 = r10[r4]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String r0 = r1.AuthenticationRequestParameters(r0)
            if (r0 == 0) goto Lb2
        L71:
            java.lang.Integer r0 = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKAppID.getSDKReferenceNumber(r0)
            if (r0 == 0) goto Lb2
            int r1 = r0.intValue()
            r3 = 0
            if (r1 > r2) goto L8a
            int r1 = atd.p.ChallengeResultCompleted.getSDKReferenceNumber
            int r1 = r1 + 45
            int r2 = r1 % 128
            atd.p.ChallengeResultCompleted.AuthenticationRequestParameters = r2
            int r1 = r1 % 2
            if (r1 != 0) goto L8b
        L8a:
            r0 = r3
        L8b:
            if (r0 == 0) goto Lb2
            int r1 = atd.p.ChallengeResultCompleted.AuthenticationRequestParameters
            int r1 = r1 + 83
            int r2 = r1 % 128
            atd.p.ChallengeResultCompleted.getSDKReferenceNumber = r2
            int r1 = r1 % 2
            if (r1 != 0) goto La6
            int r0 = r0.intValue()
            int r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.IntValue.m151constructorimpl(r0)
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$IntValue r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.IntValue.m150boximpl(r0)
            return r0
        La6:
            int r0 = r0.intValue()
            int r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.IntValue.m151constructorimpl(r0)
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.IntValue.m150boximpl(r0)
            throw r3
        Lb2:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.p.ChallengeResultCompleted.getSDKReferenceNumber():com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/StayOnWhilePluggedIn$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "MAXIMUM", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        private getDeviceData() {
        }

        public /* synthetic */ getDeviceData(byte b8) {
            this();
        }
    }

    public /* synthetic */ ChallengeResultCompleted(Application application) {
        this(application, new atd.t.getSDKAppID(application));
    }
}
