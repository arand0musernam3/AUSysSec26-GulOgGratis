package atd.n;

import android.os.Build;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/Bootloader;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$StringValue;", "getDeviceParameterResult-GaL_DrQ", "()Ljava/lang/String;", "getDeviceParameterResult", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKTransactionID extends DeviceParameter {
    private static int AuthenticationRequestParameters = 0;
    private static int getDeviceData = 0;
    private static int getSDKAppID = 1;
    private static int getSDKReferenceNumber = 1;
    private static long getSDKTransactionID;

    static {
        getSDKTransactionID();
        ViewConfiguration.getMinimumFlingVelocity();
        new getSDKAppID((byte) 0);
        getSDKAppID = (getDeviceData + 63) % 128;
    }

    @NotNull
    private static String getSDKAppID() {
        int i11 = AuthenticationRequestParameters + 5;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            String str = Build.BOOTLOADER;
            str.getClass();
            return DeviceParameterResult.Success.StringValue.m165constructorimpl(str);
        }
        String str2 = Build.BOOTLOADER;
        str2.getClass();
        DeviceParameterResult.Success.StringValue.m165constructorimpl(str2);
        throw null;
    }

    public static void getSDKTransactionID() {
        getSDKTransactionID = -3763462876718700934L;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getSDKReferenceNumber() {
        AuthenticationRequestParameters = (getSDKReferenceNumber + 15) % 128;
        DeviceParameterResult.Success.StringValue stringValueM164boximpl = DeviceParameterResult.Success.StringValue.m164boximpl(getSDKAppID());
        AuthenticationRequestParameters = (getSDKReferenceNumber + 29) % 128;
        return stringValueM164boximpl;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/Bootloader$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKAppID {
        public static int getDeviceData;
        public static int getSDKReferenceNumber;

        private getSDKAppID() {
        }

        public static int getSDKAppID() {
            int i11 = getDeviceData;
            int i12 = i11 % 5866434;
            getDeviceData = i11 + 1;
            if (i12 != 0) {
                return getSDKReferenceNumber;
            }
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            getSDKReferenceNumber = iFreeMemory;
            return iFreeMemory;
        }

        public /* synthetic */ getSDKAppID(byte b8) {
            this();
        }
    }
}
