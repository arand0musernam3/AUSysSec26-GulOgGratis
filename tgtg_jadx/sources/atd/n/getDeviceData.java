package atd.n;

import android.os.Build;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.app.tgtg.model.local.AppConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/Device;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$StringValue;", "getDeviceParameterResult-GaL_DrQ", "()Ljava/lang/String;", "getDeviceParameterResult", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getDeviceData extends DeviceParameter {
    private static int AuthenticationRequestParameters = 1;
    private static int[] getDeviceData = null;
    private static int getSDKAppID = 1;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;

    static {
        getSDKTransactionID();
        ViewConfiguration.getMinimumFlingVelocity();
        new AuthenticationRequestParameters((byte) 0);
        getSDKTransactionID = (AuthenticationRequestParameters + AppConstants.RESULT_CODE_ORDER_CANCELLED) % 128;
    }

    @NotNull
    private static String AuthenticationRequestParameters() {
        int i11 = getSDKAppID + 83;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            String str = Build.DEVICE;
            str.getClass();
            DeviceParameterResult.Success.StringValue.m165constructorimpl(str);
            throw null;
        }
        String str2 = Build.DEVICE;
        str2.getClass();
        String strM165constructorimpl = DeviceParameterResult.Success.StringValue.m165constructorimpl(str2);
        int i12 = getSDKReferenceNumber + 15;
        getSDKAppID = i12 % 128;
        if (i12 % 2 != 0) {
            return strM165constructorimpl;
        }
        throw null;
    }

    public static void getSDKTransactionID() {
        getDeviceData = new int[]{-1714217140, 501632951, 1199105284, 1176426563, 1490430045, -1117475174, 2023132104, 1154911931, 454782822, -2128159107, -1186892559, 1596068558, 861026731, -781830127, 1640209748, -783473226, 1510952423, 569777599};
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getSDKReferenceNumber() {
        int i11 = getSDKReferenceNumber + 65;
        getSDKAppID = i11 % 128;
        if (i11 % 2 != 0) {
            return DeviceParameterResult.Success.StringValue.m164boximpl(AuthenticationRequestParameters());
        }
        DeviceParameterResult.Success.StringValue.m164boximpl(AuthenticationRequestParameters());
        throw null;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/Device$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthenticationRequestParameters {
        public static int AuthenticationRequestParameters;
        public static int getSDKTransactionID;

        private AuthenticationRequestParameters() {
        }

        public static int getSDKTransactionID() {
            int i11 = getSDKTransactionID;
            int i12 = i11 % 6079979;
            getSDKTransactionID = i11 + 1;
            if (i12 != 0) {
                return AuthenticationRequestParameters;
            }
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            AuthenticationRequestParameters = iMaxMemory;
            return iMaxMemory;
        }

        public /* synthetic */ AuthenticationRequestParameters(byte b8) {
            this();
        }
    }
}
