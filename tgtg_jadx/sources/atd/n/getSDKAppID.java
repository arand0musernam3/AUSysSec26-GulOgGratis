package atd.n;

import android.os.Build;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/Brand;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$StringValue;", "getDeviceParameterResult-GaL_DrQ", "()Ljava/lang/String;", "getDeviceParameterResult", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKAppID extends DeviceParameter {
    private static char AuthenticationRequestParameters = 0;
    private static int BuildConfig = 1;
    private static int ChallengeResultCancelled = 0;
    private static char getDeviceData = 0;
    private static int getMessageVersion = 1;
    private static char getSDKAppID;
    private static char getSDKReferenceNumber;
    private static int getSDKTransactionID;

    static {
        AuthenticationRequestParameters();
        ViewConfiguration.getScrollBarSize();
        new getSDKReferenceNumber((byte) 0);
        getMessageVersion = (ChallengeResultCancelled + 41) % 128;
    }

    public static void AuthenticationRequestParameters() {
        AuthenticationRequestParameters = (char) 51462;
        getSDKAppID = (char) 39625;
        getDeviceData = (char) 3187;
        getSDKReferenceNumber = (char) 43406;
    }

    @NotNull
    private static String getSDKAppID() {
        String strM165constructorimpl;
        int i11 = BuildConfig + 13;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 != 0) {
            String str = Build.BRAND;
            str.getClass();
            strM165constructorimpl = DeviceParameterResult.Success.StringValue.m165constructorimpl(str);
            int i12 = 23 / 0;
        } else {
            String str2 = Build.BRAND;
            str2.getClass();
            strM165constructorimpl = DeviceParameterResult.Success.StringValue.m165constructorimpl(str2);
        }
        BuildConfig = (getSDKTransactionID + 51) % 128;
        return strM165constructorimpl;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getSDKReferenceNumber() {
        int i11 = BuildConfig + 85;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            return DeviceParameterResult.Success.StringValue.m164boximpl(getSDKAppID());
        }
        int i12 = 91 / 0;
        return DeviceParameterResult.Success.StringValue.m164boximpl(getSDKAppID());
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/Brand$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKReferenceNumber {
        public static int getSDKAppID;
        public static int getSDKTransactionID;

        private getSDKReferenceNumber() {
        }

        public static int getDeviceData() {
            int i11 = getSDKTransactionID;
            int i12 = i11 % 8292493;
            getSDKTransactionID = i11 + 1;
            if (i12 != 0) {
                return getSDKAppID;
            }
            int i13 = (int) Runtime.getRuntime().totalMemory();
            getSDKAppID = i13;
            return i13;
        }

        public /* synthetic */ getSDKReferenceNumber(byte b8) {
            this();
        }
    }
}
