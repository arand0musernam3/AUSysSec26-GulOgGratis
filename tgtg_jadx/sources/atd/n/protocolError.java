package atd.n;

import android.graphics.Color;
import android.os.Build;
import android.text.TextUtils;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/User;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$StringValue;", "getDeviceParameterResult-GaL_DrQ", "()Ljava/lang/String;", "getDeviceParameterResult", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class protocolError extends DeviceParameter {
    private static int AuthenticationRequestParameters = 0;
    private static int BuildConfig = 1;
    private static int getDeviceData = 0;
    private static int getMessageVersion = 0;
    private static int getSDKAppID = 0;
    private static int getSDKEphemeralPublicKey = 1;
    private static byte[] getSDKReferenceNumber;
    private static int getSDKTransactionID;

    static {
        AuthenticationRequestParameters();
        TextUtils.indexOf("", "");
        TextUtils.getCapsMode("", 0, 0);
        Color.red(0);
        TextUtils.getOffsetAfter("", 0);
        Color.alpha(0);
        new getSDKTransactionID((byte) 0);
        int i11 = getSDKEphemeralPublicKey + 3;
        getMessageVersion = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 15 / 0;
        }
    }

    public static void AuthenticationRequestParameters() {
        AuthenticationRequestParameters = 222655293;
        getSDKAppID = 829166713;
        getSDKTransactionID = 1906128311;
        getSDKReferenceNumber = new byte[]{-123, -124, -78, 35};
    }

    @NotNull
    private static String getSDKTransactionID() {
        int i11 = BuildConfig + 79;
        getDeviceData = i11 % 128;
        if (i11 % 2 == 0) {
            String str = Build.USER;
            str.getClass();
            return DeviceParameterResult.Success.StringValue.m165constructorimpl(str);
        }
        String str2 = Build.USER;
        str2.getClass();
        int i12 = 56 / 0;
        return DeviceParameterResult.Success.StringValue.m165constructorimpl(str2);
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getSDKReferenceNumber() {
        BuildConfig = (getDeviceData + 43) % 128;
        DeviceParameterResult.Success.StringValue stringValueM164boximpl = DeviceParameterResult.Success.StringValue.m164boximpl(getSDKTransactionID());
        int i11 = getDeviceData + 51;
        BuildConfig = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 34 / 0;
        }
        return stringValueM164boximpl;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/User$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKTransactionID {
        private getSDKTransactionID() {
        }

        public /* synthetic */ getSDKTransactionID(byte b8) {
            this();
        }
    }
}
