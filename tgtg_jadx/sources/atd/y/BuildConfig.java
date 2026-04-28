package atd.y;

import android.app.Application;
import android.os.Process;
import android.view.View;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/ModeRingerStreamsAffected;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nModeRingerStreamsAffected.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModeRingerStreamsAffected.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/ModeRingerStreamsAffected\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"})
public final class BuildConfig extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int ChallengeResult;
    private static int ChallengeResultCancelled;
    private static long getDeviceData;
    private static char getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static int getSDKTransactionID;

    @NotNull
    private final atd.t.getSDKReferenceNumber getSDKReferenceNumber;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(int r5, int r6, byte r7) {
        /*
            int r6 = r6 * 3
            int r6 = 4 - r6
            int r7 = r7 * 3
            int r0 = r7 + 1
            byte[] r1 = atd.y.BuildConfig.$$a
            int r5 = 119 - r5
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r5 = r6
            r4 = r7
            r3 = r2
            goto L2a
        L15:
            r3 = r6
            r6 = r5
            r5 = r3
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L24:
            int r3 = r3 + 1
            int r5 = r5 + 1
            r4 = r1[r5]
        L2a:
            int r6 = r6 + r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.y.BuildConfig.$$d(int, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKEphemeralPublicKey = 0;
        ChallengeResult = 1;
        AuthenticationRequestParameters = 0;
        ChallengeResultCancelled = 1;
        AuthenticationRequestParameters();
        View.combineMeasuredStates(0, 0);
        View.MeasureSpec.getSize(0);
        new AuthenticationRequestParameters((byte) 0);
        int i11 = ChallengeResult + 113;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    private BuildConfig(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.getSDKReferenceNumber = getsdkreferencenumber;
    }

    public static void AuthenticationRequestParameters() {
        getDeviceData = 1905653906042338631L;
        getSDKTransactionID = -2038612665;
        getSDKAppID = (char) 12765;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(int r30, java.lang.String r31, java.lang.String r32, char r33, java.lang.String r34, java.lang.Object[] r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.y.BuildConfig.b(int, java.lang.String, java.lang.String, char, java.lang.String, java.lang.Object[]):void");
    }

    public static void init$0() {
        $$a = new byte[]{0, ByteCompanionObject.MIN_VALUE, -126, 96, -85};
        $$b = 221;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0063 A[PHI: r0
      0x0063: PHI (r0v11 java.lang.String) = (r0v10 java.lang.String), (r0v24 java.lang.String) binds: [B:8:0x0061, B:5:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult getSDKReferenceNumber() throws java.lang.Throwable {
        /*
            r11 = this;
            int r0 = atd.y.BuildConfig.ChallengeResultCancelled
            int r0 = r0 + 5
            int r1 = r0 % 128
            atd.y.BuildConfig.AuthenticationRequestParameters = r1
            int r0 = r0 % 2
            atd.t.getSDKReferenceNumber r1 = r11.getSDKReferenceNumber
            r2 = 0
            r3 = 1
            r4 = 32773(0x8005, float:4.5925E-41)
            if (r0 == 0) goto L3c
            int r0 = android.view.ViewConfiguration.getEdgeSlop()
            int r5 = r0 + (-69)
            int r0 = android.os.Process.myPid()
            int r0 = r0 % 78
            int r0 = r4 << r0
            char r8 = (char) r0
            java.lang.Object[] r10 = new java.lang.Object[r3]
            java.lang.String r6 = "\ue5d2틟׀톀"
            java.lang.String r7 = "숮⺥᫉\ue6d7沥靵웄撀턑骬ំ睢긕\u218f\ueec1蕇ﮋ᪲禐鑕窞䡰蟔\udaf9߲帪댚긨"
            java.lang.String r9 = "\u0000\u0000\u0000\u0000"
            b(r5, r6, r7, r8, r9, r10)
            r0 = r10[r2]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String r0 = r1.AuthenticationRequestParameters(r0)
            if (r0 == 0) goto L7e
            goto L63
        L3c:
            int r0 = android.view.ViewConfiguration.getEdgeSlop()
            int r5 = r0 >> 16
            int r0 = android.os.Process.myPid()
            int r0 = r0 >> 22
            int r0 = r0 + r4
            char r8 = (char) r0
            java.lang.Object[] r10 = new java.lang.Object[r3]
            java.lang.String r6 = "\ue5d2틟׀톀"
            java.lang.String r7 = "숮⺥᫉\ue6d7沥靵웄撀턑骬ំ睢긕\u218f\ueec1蕇ﮋ᪲禐鑕窞䡰蟔\udaf9߲帪댚긨"
            java.lang.String r9 = "\u0000\u0000\u0000\u0000"
            b(r5, r6, r7, r8, r9, r10)
            r0 = r10[r2]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String r0 = r1.AuthenticationRequestParameters(r0)
            if (r0 == 0) goto L7e
        L63:
            int r1 = atd.y.BuildConfig.ChallengeResultCancelled
            int r1 = r1 + 83
            int r1 = r1 % 128
            atd.y.BuildConfig.AuthenticationRequestParameters = r1
            java.lang.Integer r0 = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKAppID.getSDKReferenceNumber(r0)
            if (r0 == 0) goto L7e
            int r0 = r0.intValue()
            int r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.IntValue.m151constructorimpl(r0)
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$IntValue r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.IntValue.m150boximpl(r0)
            return r0
        L7e:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.y.BuildConfig.getSDKReferenceNumber():com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/ModeRingerStreamsAffected$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthenticationRequestParameters {
        public static int AuthenticationRequestParameters;
        public static int getDeviceData;

        private AuthenticationRequestParameters() {
        }

        public static int getSDKReferenceNumber() {
            int i11 = getDeviceData;
            int i12 = i11 % 8765676;
            getDeviceData = i11 + 1;
            if (i12 != 0) {
                return AuthenticationRequestParameters;
            }
            int iMyPid = Process.myPid();
            AuthenticationRequestParameters = iMyPid;
            return iMyPid;
        }

        public /* synthetic */ AuthenticationRequestParameters(byte b8) {
            this();
        }
    }

    public /* synthetic */ BuildConfig(Application application) {
        this(application, new atd.t.AuthenticationRequestParameters(application));
    }
}
