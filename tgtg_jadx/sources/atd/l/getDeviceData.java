package atd.l;

import android.os.Build;
import android.os.SystemClock;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.app.tgtg.model.local.AppConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/version/Incremental;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$StringValue;", "getDeviceParameterResult-GaL_DrQ", "()Ljava/lang/String;", "getDeviceParameterResult", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getDeviceData extends DeviceParameter {
    private static char[] AuthenticationRequestParameters = null;
    private static int ChallengeResult = 1;
    private static char getDeviceData = 0;
    private static int getSDKAppID = 0;
    private static int getSDKReferenceNumber = 1;
    private static int getSDKTransactionID;

    static {
        getSDKAppID();
        SystemClock.elapsedRealtime();
        SystemClock.elapsedRealtimeNanos();
        new C0010getDeviceData((byte) 0);
        int i11 = getSDKTransactionID + 69;
        ChallengeResult = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 62 / 0;
        }
    }

    @NotNull
    private static String AuthenticationRequestParameters() {
        getSDKAppID = (getSDKReferenceNumber + AppConstants.RESULT_CODE_ORDER_CANCELLED) % 128;
        String str = Build.VERSION.INCREMENTAL;
        str.getClass();
        String strM165constructorimpl = DeviceParameterResult.Success.StringValue.m165constructorimpl(str);
        int i11 = getSDKAppID + 53;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            return strM165constructorimpl;
        }
        throw null;
    }

    public static void getSDKAppID() {
        AuthenticationRequestParameters = new char[]{30967, 30855, 30966, 30960};
        getDeviceData = (char) 19806;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getSDKReferenceNumber() {
        getSDKReferenceNumber = (getSDKAppID + 13) % 128;
        DeviceParameterResult.Success.StringValue stringValueM164boximpl = DeviceParameterResult.Success.StringValue.m164boximpl(AuthenticationRequestParameters());
        getSDKAppID = (getSDKReferenceNumber + 33) % 128;
        return stringValueM164boximpl;
    }

    /* JADX INFO: renamed from: atd.l.getDeviceData$getDeviceData, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/version/Incremental$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C0010getDeviceData {
        private C0010getDeviceData() {
        }

        public /* synthetic */ C0010getDeviceData(byte b8) {
            this();
        }
    }
}
