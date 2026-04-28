package atd.w;

import android.app.Application;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/HasIccCard;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/TelephonyDeviceParameter;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHasIccCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HasIccCard.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/telephony/HasIccCard\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,18:1\n1#2:19\n*E\n"})
public final class getSDKTransactionID extends InitializeResultSuccess {
    private static int AuthenticationRequestParameters = 1;
    private static int getDeviceData = 0;
    private static int getSDKAppID = 1;
    private static int[] getSDKReferenceNumber;
    private static int getSDKTransactionID;

    static {
        getSDKTransactionID();
        ViewConfiguration.getGlobalActionKeyTimeout();
        new C0016getSDKTransactionID((byte) 0);
        int i11 = getDeviceData + 41;
        getSDKAppID = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getSDKTransactionID(@NotNull Application application) {
        super(application);
        application.getClass();
    }

    public static void getSDKTransactionID() {
        getSDKReferenceNumber = new int[]{-1730266534, 2055384938, -1461212630, -841683413, 1834122459, 1463975006, -228017045, -143132904, 2012120394, -977052667, -1836442147, 751191198, 2023206708, 1355901587, -550887253, 99775932, 1281187798, 1263373731};
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() {
        TelephonyManager telephonyManagerChallengeResult = ChallengeResult();
        if (telephonyManagerChallengeResult == null) {
            DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
            getSDKTransactionID = (AuthenticationRequestParameters + 47) % 128;
            return failure;
        }
        DeviceParameterResult.Success.BooleanValue booleanValueM129boximpl = DeviceParameterResult.Success.BooleanValue.m129boximpl(DeviceParameterResult.Success.BooleanValue.m130constructorimpl(telephonyManagerChallengeResult.hasIccCard()));
        int i11 = getSDKTransactionID + 81;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return booleanValueM129boximpl;
        }
        throw null;
    }

    /* JADX INFO: renamed from: atd.w.getSDKTransactionID$getSDKTransactionID, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/HasIccCard$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C0016getSDKTransactionID {
        public static int getDeviceData;
        public static int getSDKReferenceNumber;

        private C0016getSDKTransactionID() {
        }

        public static int getSDKTransactionID() {
            int i11 = getSDKReferenceNumber;
            int i12 = i11 % 8086654;
            getSDKReferenceNumber = i11 + 1;
            if (i12 != 0) {
                return getDeviceData;
            }
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            getDeviceData = elapsedCpuTime;
            return elapsedCpuTime;
        }

        public /* synthetic */ C0016getSDKTransactionID(byte b8) {
            this();
        }
    }
}
