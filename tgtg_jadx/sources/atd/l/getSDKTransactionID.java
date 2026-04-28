package atd.l;

import android.os.Build;
import android.text.TextUtils;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/version/SdkInt;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$IntValue;", "getDeviceParameterResult--tjUSDw", "()I", "getDeviceParameterResult", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKTransactionID extends DeviceParameter {
    private static int AuthenticationRequestParameters = 0;
    private static int getDeviceData = 1;
    private static int getSDKAppID = 1;
    private static int getSDKReferenceNumber;
    private static int[] getSDKTransactionID;

    static {
        getSDKAppID();
        TextUtils.indexOf((CharSequence) "", '0');
        new getDeviceData((byte) 0);
        getDeviceData = (getSDKReferenceNumber + 29) % 128;
    }

    public static void getSDKAppID() {
        getSDKTransactionID = new int[]{1866077315, -78893750, -1286643136, 959715082, 735766247, 1870779903, -718212420, -1094103413, 172837761, 38002239, -1112082518, -602871040, -334445752, -944424571, -942876575, -2099549016, 420480754, 755296992};
    }

    private static int getSDKTransactionID() {
        int i11 = getSDKAppID + 23;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            return DeviceParameterResult.Success.IntValue.m151constructorimpl(Build.VERSION.SDK_INT);
        }
        DeviceParameterResult.Success.IntValue.m151constructorimpl(Build.VERSION.SDK_INT);
        throw null;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getSDKReferenceNumber() {
        getSDKAppID = (AuthenticationRequestParameters + 69) % 128;
        DeviceParameterResult.Success.IntValue intValueM150boximpl = DeviceParameterResult.Success.IntValue.m150boximpl(getSDKTransactionID());
        getSDKAppID = (AuthenticationRequestParameters + 5) % 128;
        return intValueM150boximpl;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/version/SdkInt$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        private getDeviceData() {
        }

        public /* synthetic */ getDeviceData(byte b8) {
            this();
        }
    }
}
