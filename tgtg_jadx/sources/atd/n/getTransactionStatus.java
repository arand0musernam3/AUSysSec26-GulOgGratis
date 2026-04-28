package atd.n;

import android.os.Build;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/SocModel;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getTransactionStatus extends DeviceParameter {
    private static long AuthenticationRequestParameters = 0;
    private static int ChallengeResultCancelled = 0;
    private static int getDeviceData = 0;
    private static int getMessageVersion = 1;
    private static int getSDKAppID = 1;
    private static int getSDKReferenceNumber;
    private static char getSDKTransactionID;

    static {
        getSDKAppID();
        ViewConfiguration.getScrollBarFadeDuration();
        TextUtils.indexOf("", "", 0);
        new getSDKReferenceNumber((byte) 0);
        int i11 = getMessageVersion + 41;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public static void getSDKAppID() {
        AuthenticationRequestParameters = 1905653906042338631L;
        getSDKReferenceNumber = -2038612665;
        getSDKTransactionID = (char) 40157;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() {
        int i11 = getSDKAppID + 49;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0 || Build.VERSION.SDK_INT >= 31) {
            String str = Build.SOC_MODEL;
            str.getClass();
            return DeviceParameterResult.Success.StringValue.m164boximpl(DeviceParameterResult.Success.StringValue.m165constructorimpl(str));
        }
        DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.UNSUPPORTED_OR_DEPRECATED);
        int i12 = getSDKAppID + 17;
        getDeviceData = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 0 / 0;
        }
        return failure;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/SocModel$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKReferenceNumber {
        private getSDKReferenceNumber() {
        }

        public /* synthetic */ getSDKReferenceNumber(byte b8) {
            this();
        }
    }
}
