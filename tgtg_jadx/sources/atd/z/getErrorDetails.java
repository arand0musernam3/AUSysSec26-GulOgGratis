package atd.z;

import android.app.Application;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Process;
import android.view.KeyEvent;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/TlsV13Supported;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/WifiDeviceParameter;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTlsV13Supported.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TlsV13Supported.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/wifi/TlsV13Supported\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"})
public final class getErrorDetails extends getErrorCode {
    private static int AuthenticationRequestParameters = 0;
    private static long getDeviceData = 0;
    private static int getSDKAppID = 1;
    private static int getSDKReferenceNumber = 0;
    private static int getSDKTransactionID = 1;

    static {
        getSDKTransactionID();
        KeyEvent.keyCodeFromString("");
        new getSDKAppID((byte) 0);
        getSDKTransactionID = (AuthenticationRequestParameters + 53) % 128;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getErrorDetails(@NotNull Application application) {
        super(application);
        application.getClass();
    }

    public static void getSDKTransactionID() {
        getDeviceData = 1736896959537223556L;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() {
        int i11 = getSDKReferenceNumber + 121;
        getSDKAppID = i11 % 128;
        if (i11 % 2 != 0 ? Build.VERSION.SDK_INT < 34 : Build.VERSION.SDK_INT < 45) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.UNSUPPORTED_OR_DEPRECATED);
        }
        getSDKReferenceNumber = (getSDKAppID + 23) % 128;
        WifiManager wifiManagerChallengeResult = ChallengeResult();
        if (wifiManagerChallengeResult == null) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
        DeviceParameterResult.Success.BooleanValue booleanValueM129boximpl = DeviceParameterResult.Success.BooleanValue.m129boximpl(DeviceParameterResult.Success.BooleanValue.m130constructorimpl(wifiManagerChallengeResult.isTlsV13Supported()));
        int i12 = getSDKReferenceNumber + 13;
        getSDKAppID = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 29 / 0;
        }
        return booleanValueM129boximpl;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/TlsV13Supported$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKAppID {
        public static int getSDKReferenceNumber;
        public static int getSDKTransactionID;

        private getSDKAppID() {
        }

        public static int AuthenticationRequestParameters() {
            int i11 = getSDKTransactionID;
            int i12 = i11 % 5328066;
            getSDKTransactionID = i11 + 1;
            if (i12 != 0) {
                return getSDKReferenceNumber;
            }
            int iMyUid = Process.myUid();
            getSDKReferenceNumber = iMyUid;
            return iMyUid;
        }

        public /* synthetic */ getSDKAppID(byte b8) {
            this();
        }
    }
}
