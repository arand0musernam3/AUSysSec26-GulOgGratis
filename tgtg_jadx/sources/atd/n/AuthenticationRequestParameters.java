package atd.n;

import android.os.Build;
import android.os.SystemClock;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/Board;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$StringValue;", "getDeviceParameterResult-GaL_DrQ", "()Ljava/lang/String;", "getDeviceParameterResult", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AuthenticationRequestParameters extends DeviceParameter {
    private static char AuthenticationRequestParameters = 0;
    private static int BuildConfig = 1;
    private static char getDeviceData = 0;
    private static int getMessageVersion = 0;
    private static char getSDKAppID = 0;
    private static int getSDKEphemeralPublicKey = 1;
    private static char getSDKReferenceNumber;
    private static int getSDKTransactionID;

    static {
        getSDKTransactionID();
        SystemClock.uptimeMillis();
        new getDeviceData((byte) 0);
        int i11 = getMessageVersion + 97;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @NotNull
    private static String AuthenticationRequestParameters() {
        BuildConfig = (getSDKTransactionID + 55) % 128;
        String str = Build.BOARD;
        str.getClass();
        String strM165constructorimpl = DeviceParameterResult.Success.StringValue.m165constructorimpl(str);
        int i11 = BuildConfig + 11;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            return strM165constructorimpl;
        }
        throw null;
    }

    public static void getSDKTransactionID() {
        getSDKReferenceNumber = (char) 34281;
        AuthenticationRequestParameters = (char) 35930;
        getSDKAppID = (char) 2162;
        getDeviceData = (char) 3643;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getSDKReferenceNumber() {
        BuildConfig = (getSDKTransactionID + 45) % 128;
        DeviceParameterResult.Success.StringValue stringValueM164boximpl = DeviceParameterResult.Success.StringValue.m164boximpl(AuthenticationRequestParameters());
        getSDKTransactionID = (BuildConfig + 53) % 128;
        return stringValueM164boximpl;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/Board$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        public static int AuthenticationRequestParameters;
        public static int getDeviceData;

        private getDeviceData() {
        }

        public static int getSDKReferenceNumber() {
            int i11 = getDeviceData;
            int i12 = i11 % 5878329;
            getDeviceData = i11 + 1;
            if (i12 != 0) {
                return AuthenticationRequestParameters;
            }
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            AuthenticationRequestParameters = iMaxMemory;
            return iMaxMemory;
        }

        public /* synthetic */ getDeviceData(byte b8) {
            this();
        }
    }
}
