package atd.z;

import android.app.Application;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DefaultPermissionChecker;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.adyen.threeds2.internal.deviceinfo.parameter.PermissionChecker;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000eB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/PasspointProviderFriendlyName;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/WifiDeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "permissionChecker", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/PasspointProvider;", "passpointProvider", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/PasspointProvider;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/PasspointProvider;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPasspointProviderFriendlyName.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PasspointProviderFriendlyName.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/wifi/PasspointProviderFriendlyName\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,35:1\n1#2:36\n*E\n"})
public final class ChallengeStatusReceiver extends getErrorCode {
    private static byte[] AuthenticationRequestParameters = null;
    private static int ChallengeResult = 1;
    private static int ChallengeResultCancelled = 0;
    private static int getDeviceData = 0;
    private static int getMessageVersion = 1;
    private static int getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static int getSDKTransactionID;

    @NotNull
    private final completed getSDKReferenceNumber;

    static {
        AuthenticationRequestParameters();
        KeyEvent.getModifierMetaStateMask();
        View.MeasureSpec.getMode(0);
        ViewConfiguration.getWindowTouchSlop();
        ViewConfiguration.getTapTimeout();
        ViewConfiguration.getLongPressTimeout();
        new getDeviceData((byte) 0);
        int i11 = ChallengeResultCancelled + 5;
        getMessageVersion = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 22 / 0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private ChallengeStatusReceiver(@NotNull Application application, @NotNull PermissionChecker permissionChecker, @NotNull completed completedVar) {
        super(application, permissionChecker);
        application.getClass();
        permissionChecker.getClass();
        completedVar.getClass();
        this.getSDKReferenceNumber = completedVar;
    }

    public static void AuthenticationRequestParameters() {
        getSDKAppID = 1239395837;
        getSDKTransactionID = 829166619;
        getDeviceData = 1679535863;
        AuthenticationRequestParameters = new byte[]{-17, 39, 32, -45};
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() {
        int i11 = getSDKEphemeralPublicKey + 63;
        ChallengeResult = i11 % 128;
        if (i11 % 2 != 0 ? Build.VERSION.SDK_INT < 29 : Build.VERSION.SDK_INT < 54) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.UNSUPPORTED_OR_DEPRECATED);
        }
        if (!getSDKEphemeralPublicKey()) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.MISSING_PERMISSION);
        }
        String strAuthenticationRequestParameters = this.getSDKReferenceNumber.AuthenticationRequestParameters();
        if (strAuthenticationRequestParameters == null) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
        int i12 = ChallengeResult + 41;
        getSDKEphemeralPublicKey = i12 % 128;
        int i13 = i12 % 2;
        DeviceParameterResult.Success.StringValue stringValueM164boximpl = DeviceParameterResult.Success.StringValue.m164boximpl(DeviceParameterResult.Success.StringValue.m165constructorimpl(strAuthenticationRequestParameters));
        if (i13 != 0) {
            int i14 = 59 / 0;
        }
        return stringValueM164boximpl;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/PasspointProviderFriendlyName$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        private getDeviceData() {
        }

        public /* synthetic */ getDeviceData(byte b8) {
            this();
        }
    }

    public /* synthetic */ ChallengeStatusReceiver(Application application) {
        this(application, new DefaultPermissionChecker(application), new CompletionEvent(application));
    }
}
