package atd.x;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.adyen.threeds2.internal.deviceinfo.parameter.PermissionChecker;
import com.adyen.threeds2.internal.deviceinfo.parameter.PermissionRequestedChecker;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0012B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/InstallNonMarketApps;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/PackageManager;", "packageManager", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "permissionChecker", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/PackageManager;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/PackageManager;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInstallNonMarketApps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InstallNonMarketApps.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/InstallNonMarketApps\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n1#2:42\n*E\n"})
public final class ChallengeResultCompleted extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int ChallengeResult;
    private static int ChallengeResultCancelled;
    private static char[] getDeviceData;
    private static int getSDKEphemeralPublicKey;

    @NotNull
    private final PermissionChecker getSDKAppID;

    @NotNull
    private final ChallengeResultTimeout getSDKReferenceNumber;

    @NotNull
    private final atd.t.getSDKReferenceNumber getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(int r5, byte r6, byte r7) {
        /*
            int r7 = 106 - r7
            byte[] r0 = atd.x.ChallengeResultCompleted.$$a
            int r5 = r5 * 2
            int r5 = r5 + 1
            int r6 = r6 * 3
            int r6 = 3 - r6
            byte[] r1 = new byte[r5]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r7
            r3 = r2
            r7 = r5
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            int r6 = r6 + 1
            if (r3 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L25:
            r4 = r0[r6]
        L27:
            int r7 = r7 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.x.ChallengeResultCompleted.$$d(int, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKEphemeralPublicKey = 0;
        ChallengeResult = 1;
        ChallengeResultCancelled = 0;
        BuildConfig = 1;
        AuthenticationRequestParameters();
        SystemClock.uptimeMillis();
        MotionEvent.axisFromString("");
        Process.getThreadPriority(0);
        new getSDKReferenceNumber((byte) 0);
        ChallengeResult = (getSDKEphemeralPublicKey + 107) % 128;
    }

    private ChallengeResultCompleted(@NotNull Application application, @NotNull ChallengeResultTimeout challengeResultTimeout, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber, @NotNull PermissionChecker permissionChecker) {
        application.getClass();
        challengeResultTimeout.getClass();
        getsdkreferencenumber.getClass();
        permissionChecker.getClass();
        this.getSDKReferenceNumber = challengeResultTimeout;
        this.getSDKTransactionID = getsdkreferencenumber;
        this.getSDKAppID = permissionChecker;
    }

    public static void AuthenticationRequestParameters() {
        getDeviceData = new char[]{1907, 41322, 19285, 62772, 40707, 14816, 58306, 36247, 14212, 53371, 31320, 9231, 52767, 26877, 4812, 48307, 26271, 144, 43353, 21313, 64818, 42780, 16893, 26032, 50081, 10633, 38905, 64966, 23342, 33025, 61229, 21841, 45754, 6287, 18166, 44240, 2596, 28678, 56954, 1118, 25153, 52195, 12729, 40908, 50678, 8976, 35110, 63314, 23915, 47746, 57522, 20183, 46308, 4609, 30770, 42589, 3139, 27250, 54171, 14760, 26564, 52718, 11010, 37158, 65370, 9582, 50539, 25348, 35105, 14150};
        AuthenticationRequestParameters = -9049182091640614384L;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(char r26, int r27, int r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.x.ChallengeResultCompleted.b(char, int, int, java.lang.Object[]):void");
    }

    public static void init$0() {
        $$a = new byte[]{65, 100, 30, 30};
        $$b = 145;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() throws Throwable {
        Boolean sDKTransactionID;
        int i11 = ChallengeResultCancelled + 115;
        BuildConfig = i11 % 128;
        if (i11 % 2 == 0 && Build.VERSION.SDK_INT < 48) {
            atd.t.getSDKReferenceNumber getsdkreferencenumber = this.getSDKTransactionID;
            Object[] objArr = new Object[1];
            b((char) (62228 - (Process.myTid() >> 22)), 23 - (Process.myTid() >> 22), ExpandableListView.getPackedPositionGroup(0L), objArr);
            String strAuthenticationRequestParameters = getsdkreferencenumber.AuthenticationRequestParameters(((String) objArr[0]).intern());
            if (strAuthenticationRequestParameters == null || (sDKTransactionID = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKAppID.getSDKTransactionID(strAuthenticationRequestParameters)) == null) {
                return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
            }
            int i12 = ChallengeResultCancelled + 27;
            BuildConfig = i12 % 128;
            if (i12 % 2 != 0) {
                return a0.h(sDKTransactionID);
            }
            int i13 = 55 / 0;
            return a0.h(sDKTransactionID);
        }
        PermissionChecker permissionChecker = this.getSDKAppID;
        Object[] objArr2 = new Object[1];
        b((char) (37344 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getTouchSlop() >> 8) + 43, 24 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr2);
        if (!permissionChecker.getSDKAppID(((String) objArr2[0]).intern())) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.MISSING_PERMISSION);
        }
        int i14 = ChallengeResultCancelled + 9;
        BuildConfig = i14 % 128;
        int i15 = i14 % 2;
        ChallengeResultTimeout challengeResultTimeout = this.getSDKReferenceNumber;
        if (i15 != 0) {
            return DeviceParameterResult.Success.BooleanValue.m129boximpl(DeviceParameterResult.Success.BooleanValue.m130constructorimpl(challengeResultTimeout.getSDKAppID()));
        }
        DeviceParameterResult.Success.BooleanValue booleanValueM129boximpl = DeviceParameterResult.Success.BooleanValue.m129boximpl(DeviceParameterResult.Success.BooleanValue.m130constructorimpl(challengeResultTimeout.getSDKAppID()));
        int i16 = 21 / 0;
        return booleanValueM129boximpl;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/InstallNonMarketApps$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKReferenceNumber {
        private getSDKReferenceNumber() {
        }

        public /* synthetic */ getSDKReferenceNumber(byte b8) {
            this();
        }
    }

    public /* synthetic */ ChallengeResultCompleted(Application application) {
        this(application, new ChallengeResultCancelled(application), new atd.t.getSDKTransactionID(application), new PermissionRequestedChecker(application));
    }
}
