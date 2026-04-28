package atd.n;

import android.os.Build;
import android.os.SystemClock;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.y;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/Supported64BitAbis;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSupported64BitAbis.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Supported64BitAbis.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/build/Supported64BitAbis\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,20:1\n1#2:21\n*E\n"})
public final class completed extends DeviceParameter {
    private static char[] AuthenticationRequestParameters = null;
    private static int ChallengeResult = 0;
    private static int ChallengeResultCancelled = 1;
    private static int getDeviceData = 0;
    private static boolean getSDKAppID = false;
    private static int getSDKEphemeralPublicKey = 1;
    private static int getSDKReferenceNumber;
    private static boolean getSDKTransactionID;

    static {
        getSDKTransactionID();
        SystemClock.uptimeMillis();
        new getSDKAppID((byte) 0);
        int i11 = ChallengeResult + 55;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 64 / 0;
        }
    }

    public static void getSDKTransactionID() {
        AuthenticationRequestParameters = new char[]{21848, 21803, 21804};
        getSDKReferenceNumber = 1286296859;
        getSDKAppID = true;
        getSDKTransactionID = true;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() {
        List listT;
        String[] strArr = Build.SUPPORTED_64_BIT_ABIS;
        if (strArr != null && (listT = y.T(strArr)) != null) {
            getSDKEphemeralPublicKey = (getDeviceData + 121) % 128;
            return DeviceParameterResult.Success.StringsListValue.m171boximpl(DeviceParameterResult.Success.StringsListValue.m172constructorimpl(listT));
        }
        DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        getDeviceData = (getSDKEphemeralPublicKey + 29) % 128;
        return failure;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/Supported64BitAbis$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKAppID {
        private getSDKAppID() {
        }

        public /* synthetic */ getSDKAppID(byte b8) {
            this();
        }
    }
}
