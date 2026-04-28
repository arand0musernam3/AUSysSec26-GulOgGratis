package atd.w;

import android.app.Application;
import android.graphics.Color;
import android.os.SystemClock;
import android.view.KeyEvent;
import com.adyen.threeds2.internal.deviceinfo.parameter.DefaultPermissionChecker;
import com.adyen.threeds2.internal.deviceinfo.parameter.PermissionChecker;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/PhoneCount;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/TelephonyDeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "permissionChecker", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPhoneCount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneCount.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/telephony/PhoneCount\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,40:1\n1#2:41\n*E\n"})
public final class cancelled extends InitializeResultSuccess {
    private static int AuthenticationRequestParameters = 0;
    private static int getDeviceData = 0;
    private static int getSDKAppID = 1;
    private static int getSDKReferenceNumber = 0;
    private static int getSDKTransactionID = 1;

    static {
        getSDKTransactionID();
        SystemClock.elapsedRealtime();
        KeyEvent.normalizeMetaState(0);
        Color.red(0);
        new getSDKAppID((byte) 0);
        AuthenticationRequestParameters = (getSDKTransactionID + 49) % 128;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private cancelled(@NotNull Application application, @NotNull PermissionChecker permissionChecker) {
        super(application, permissionChecker);
        application.getClass();
        permissionChecker.getClass();
    }

    public static void getSDKTransactionID() {
        getSDKReferenceNumber = 711855285;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024 A[PHI: r0
      0x0024: PHI (r0v17 android.telephony.TelephonyManager) = (r0v16 android.telephony.TelephonyManager), (r0v20 android.telephony.TelephonyManager) binds: [B:10:0x0022, B:7:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult getSDKReferenceNumber() {
        /*
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            r2 = 0
            if (r0 < r1) goto L2f
            int r0 = atd.w.cancelled.getDeviceData
            int r0 = r0 + 87
            int r1 = r0 % 128
            atd.w.cancelled.getSDKAppID = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L1e
            android.telephony.TelephonyManager r0 = r4.ChallengeResult()
            r1 = 55
            int r1 = r1 / 0
            if (r0 == 0) goto L2d
            goto L24
        L1e:
            android.telephony.TelephonyManager r0 = r4.ChallengeResult()
            if (r0 == 0) goto L2d
        L24:
            int r0 = r0.getActiveModemCount()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L3d
        L2d:
            r0 = r2
            goto L3d
        L2f:
            android.telephony.TelephonyManager r0 = r4.ChallengeResult()
            if (r0 == 0) goto L2d
            int r0 = r0.getPhoneCount()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L3d:
            if (r0 == 0) goto L6d
            int r1 = r0.intValue()
            if (r1 < 0) goto L56
            r3 = 6
            if (r1 >= r3) goto L56
            int r1 = atd.w.cancelled.getSDKAppID
            int r1 = r1 + 15
            int r3 = r1 % 128
            atd.w.cancelled.getDeviceData = r3
            int r1 = r1 % 2
            if (r1 == 0) goto L55
            goto L56
        L55:
            r2 = r0
        L56:
            if (r2 == 0) goto L6d
            int r0 = atd.w.cancelled.getSDKAppID
            int r0 = r0 + 71
            int r0 = r0 % 128
            atd.w.cancelled.getDeviceData = r0
            int r0 = r2.intValue()
            int r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.IntValue.m151constructorimpl(r0)
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$IntValue r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.IntValue.m150boximpl(r0)
            return r0
        L6d:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.w.cancelled.getSDKReferenceNumber():com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/PhoneCount$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "MINIMUM", "", "MAXIMUM", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKAppID {
        private getSDKAppID() {
        }

        public /* synthetic */ getSDKAppID(byte b8) {
            this();
        }
    }

    public /* synthetic */ cancelled(Application application) {
        this(application, new DefaultPermissionChecker(application));
    }
}
