package atd.w;

import android.app.Application;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/SimOperatorName;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/TelephonyDeviceParameter;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSimOperatorName.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimOperatorName.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/telephony/SimOperatorName\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,19:1\n1#2:20\n*E\n"})
public final class getTransactionID extends InitializeResultSuccess {
    private static int[] AuthenticationRequestParameters = null;
    private static int getDeviceData = 0;
    private static int getSDKAppID = 1;
    private static int getSDKReferenceNumber = 0;
    private static int getSDKTransactionID = 1;

    static {
        getSDKAppID();
        TextUtils.indexOf("", "");
        new getDeviceData((byte) 0);
        getDeviceData = (getSDKTransactionID + 55) % 128;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getTransactionID(@NotNull Application application) {
        super(application);
        application.getClass();
    }

    public static void getSDKAppID() {
        AuthenticationRequestParameters = new int[]{-794777128, 322383858, 1695109053, 1106990424, 1707632383, 1864356985, 20245933, -1179384577, -1668792543, -1305205074, -1569448019, -2109899402, -1437127476, 396637500, -113525561, -1536913200, 1857829271, 1941807408};
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() {
        DeviceParameterResult failure;
        int i11;
        String simOperatorName;
        getSDKAppID = (getSDKReferenceNumber + 1) % 128;
        TelephonyManager telephonyManagerChallengeResult = ChallengeResult();
        if (telephonyManagerChallengeResult != null && (simOperatorName = telephonyManagerChallengeResult.getSimOperatorName()) != null) {
            failure = DeviceParameterResult.Success.StringValue.m164boximpl(DeviceParameterResult.Success.StringValue.m165constructorimpl(simOperatorName));
            int i12 = getSDKAppID + 33;
            getSDKReferenceNumber = i12 % 128;
            i11 = i12 % 2 != 0 ? 29 : 86;
            return failure;
        }
        failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        int i13 = getSDKAppID + 113;
        getSDKReferenceNumber = i13 % 128;
        if (i13 % 2 == 0) {
            return failure;
        }
        int i14 = i11 / 0;
        return failure;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/SimOperatorName$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        public static int getSDKAppID;
        public static int getSDKReferenceNumber;

        private getDeviceData() {
        }

        public static int getSDKAppID() {
            int i11 = getSDKAppID;
            int i12 = i11 % 6281047;
            getSDKAppID = i11 + 1;
            if (i12 != 0) {
                return getSDKReferenceNumber;
            }
            int iMyUid = Process.myUid();
            getSDKReferenceNumber = iMyUid;
            return iMyUid;
        }

        public /* synthetic */ getDeviceData(byte b8) {
            this();
        }
    }
}
