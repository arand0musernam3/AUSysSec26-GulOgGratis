package atd.z;

import android.app.Application;
import android.graphics.Color;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Process;
import com.adyen.threeds2.internal.deviceinfo.parameter.DefaultPermissionChecker;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.adyen.threeds2.internal.deviceinfo.parameter.PermissionChecker;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/Bssid;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/WifiDeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "permissionChecker", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBssid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Bssid.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/wifi/Bssid\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
public final class getDeviceData extends getErrorCode {
    private static char AuthenticationRequestParameters = 0;
    private static int BuildConfig = 0;
    private static int ChallengeResult = 1;
    private static int getDeviceData = 0;
    private static int getSDKAppID = 0;
    private static int getSDKReferenceNumber = 1;
    private static long getSDKTransactionID;

    static {
        AuthenticationRequestParameters();
        Process.getThreadPriority(0);
        Color.rgb(0, 0, 0);
        new C0018getDeviceData((byte) 0);
        BuildConfig = (ChallengeResult + 1) % 128;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private getDeviceData(@NotNull Application application, @NotNull PermissionChecker permissionChecker) {
        super(application, permissionChecker);
        application.getClass();
        permissionChecker.getClass();
    }

    public static void AuthenticationRequestParameters() {
        getSDKTransactionID = 1905653906042338631L;
        getSDKAppID = -2038612665;
        AuthenticationRequestParameters = (char) 54333;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() throws Throwable {
        WifiInfo connectionInfo;
        int i11 = getSDKReferenceNumber + 47;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0) {
            getSDKEphemeralPublicKey();
            throw null;
        }
        if (!getSDKEphemeralPublicKey()) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.MISSING_PERMISSION);
        }
        WifiManager wifiManagerChallengeResult = ChallengeResult();
        if (wifiManagerChallengeResult != null && (connectionInfo = wifiManagerChallengeResult.getConnectionInfo()) != null) {
            getDeviceData = (getSDKReferenceNumber + 11) % 128;
            String bssid = connectionInfo.getBSSID();
            if (bssid != null) {
                int i12 = getDeviceData + 61;
                getSDKReferenceNumber = i12 % 128;
                int i13 = i12 % 2;
                String strM165constructorimpl = DeviceParameterResult.Success.StringValue.m165constructorimpl(bssid);
                if (i13 != 0) {
                    return DeviceParameterResult.Success.StringValue.m164boximpl(strM165constructorimpl);
                }
                DeviceParameterResult.Success.StringValue.m164boximpl(strM165constructorimpl);
                throw null;
            }
        }
        DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        getSDKReferenceNumber = (getDeviceData + 87) % 128;
        return failure;
    }

    /* JADX INFO: renamed from: atd.z.getDeviceData$getDeviceData, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/Bssid$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C0018getDeviceData {
        private C0018getDeviceData() {
        }

        public /* synthetic */ C0018getDeviceData(byte b8) {
            this();
        }
    }

    public /* synthetic */ getDeviceData(Application application) {
        this(application, new DefaultPermissionChecker(application));
    }
}
