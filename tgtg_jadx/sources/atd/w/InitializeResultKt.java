package atd.w;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DefaultPermissionChecker;
import com.adyen.threeds2.internal.deviceinfo.parameter.PermissionChecker;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0010B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\f0\f*\u00020\u000bH\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/VoiceMailAlphaTag;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/TelephonyDeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "permissionChecker", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Landroid/telephony/TelephonyManager;", "", "kotlin.jvm.PlatformType", "voiceMailAlphaTag", "(Landroid/telephony/TelephonyManager;)Ljava/lang/String;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVoiceMailAlphaTag.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VoiceMailAlphaTag.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/telephony/VoiceMailAlphaTag\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"})
public final class InitializeResultKt extends InitializeResultSuccess {
    private static int AuthenticationRequestParameters = 0;
    private static int ChallengeResultCancelled = 1;
    private static long getDeviceData = 0;
    private static int getSDKAppID = 1;
    private static int getSDKReferenceNumber;
    private static char[] getSDKTransactionID;

    static {
        getSDKTransactionID();
        ExpandableListView.getPackedPositionForChild(0, 0);
        SystemClock.currentThreadTimeMillis();
        ViewConfiguration.getTapTimeout();
        new AuthenticationRequestParameters((byte) 0);
        int i11 = ChallengeResultCancelled + 31;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private InitializeResultKt(@NotNull Application application, @NotNull PermissionChecker permissionChecker) {
        super(application, permissionChecker);
        application.getClass();
        permissionChecker.getClass();
    }

    public static void getSDKTransactionID() {
        getSDKTransactionID = new char[]{62543, 60978, 49191, 47635};
        getDeviceData = 511062860109311490L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (ChallengeResultCancelled() == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        return new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure(com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.MISSING_PERMISSION);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (ChallengeResultCancelled() == false) goto L11;
     */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult getSDKReferenceNumber() {
        /*
            r3 = this;
            boolean r0 = r3.getSDKEphemeralPublicKey()
            if (r0 != 0) goto L2b
            int r0 = atd.w.InitializeResultKt.getSDKReferenceNumber
            int r0 = r0 + 71
            int r1 = r0 % 128
            atd.w.InitializeResultKt.getSDKAppID = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L1d
            boolean r0 = r3.ChallengeResultCancelled()
            r1 = 62
            int r1 = r1 / 0
            if (r0 != 0) goto L2b
            goto L23
        L1d:
            boolean r0 = r3.ChallengeResultCancelled()
            if (r0 != 0) goto L2b
        L23:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.MISSING_PERMISSION
            r0.<init>(r1)
            return r0
        L2b:
            android.telephony.TelephonyManager r0 = r3.ChallengeResult()
            if (r0 == 0) goto L61
            int r1 = atd.w.InitializeResultKt.getSDKReferenceNumber
            int r1 = r1 + 95
            int r1 = r1 % 128
            atd.w.InitializeResultKt.getSDKAppID = r1
            java.lang.String r0 = getSDKTransactionID(r0)
            if (r0 == 0) goto L61
            int r1 = atd.w.InitializeResultKt.getSDKReferenceNumber
            int r1 = r1 + 45
            int r2 = r1 % 128
            atd.w.InitializeResultKt.getSDKAppID = r2
            int r1 = r1 % 2
            java.lang.String r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m165constructorimpl(r0)
            if (r1 == 0) goto L5c
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$StringValue r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m164boximpl(r0)
            int r1 = atd.w.InitializeResultKt.getSDKAppID
            int r1 = r1 + 49
            int r1 = r1 % 128
            atd.w.InitializeResultKt.getSDKReferenceNumber = r1
            return r0
        L5c:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m164boximpl(r0)
            r0 = 0
            throw r0
        L61:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.w.InitializeResultKt.getSDKReferenceNumber():com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/VoiceMailAlphaTag$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthenticationRequestParameters {
        private AuthenticationRequestParameters() {
        }

        public /* synthetic */ AuthenticationRequestParameters(byte b8) {
            this();
        }
    }

    public /* synthetic */ InitializeResultKt(Application application) {
        this(application, new DefaultPermissionChecker(application));
    }

    @SuppressLint({"MissingPermission"})
    private static String getSDKTransactionID(TelephonyManager telephonyManager) {
        getSDKAppID = (getSDKReferenceNumber + 65) % 128;
        String voiceMailAlphaTag = telephonyManager.getVoiceMailAlphaTag();
        getSDKAppID = (getSDKReferenceNumber + 107) % 128;
        return voiceMailAlphaTag;
    }
}
