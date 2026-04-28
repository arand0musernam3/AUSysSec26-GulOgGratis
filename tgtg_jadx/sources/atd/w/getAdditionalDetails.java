package atd.w;

import android.app.Application;
import android.telephony.TelephonyManager;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/MmsUaProfUrl;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/TelephonyDeviceParameter;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMmsUaProfUrl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MmsUaProfUrl.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/telephony/MmsUaProfUrl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,18:1\n1#2:19\n*E\n"})
public final class getAdditionalDetails extends InitializeResultSuccess {
    private static int AuthenticationRequestParameters = 1;
    private static int getDeviceData = 0;
    private static int getSDKAppID = 0;
    private static int getSDKReferenceNumber = 1;
    private static char[] getSDKTransactionID;

    static {
        getSDKAppID();
        new getDeviceData((byte) 0);
        int i11 = getSDKReferenceNumber + 107;
        getSDKAppID = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getAdditionalDetails(@NotNull Application application) {
        super(application);
        application.getClass();
    }

    public static void getSDKAppID() {
        getSDKTransactionID = new char[]{63442, 63293, 63269, 63266};
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() {
        String mmsUAProfUrl;
        getDeviceData = (AuthenticationRequestParameters + 21) % 128;
        TelephonyManager telephonyManagerChallengeResult = ChallengeResult();
        if (telephonyManagerChallengeResult == null || (mmsUAProfUrl = telephonyManagerChallengeResult.getMmsUAProfUrl()) == null) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
        int i11 = AuthenticationRequestParameters + 71;
        getDeviceData = i11 % 128;
        int i12 = i11 % 2;
        String strM165constructorimpl = DeviceParameterResult.Success.StringValue.m165constructorimpl(mmsUAProfUrl);
        if (i12 != 0) {
            DeviceParameterResult.Success.StringValue.m164boximpl(strM165constructorimpl);
            throw null;
        }
        DeviceParameterResult.Success.StringValue stringValueM164boximpl = DeviceParameterResult.Success.StringValue.m164boximpl(strM165constructorimpl);
        int i13 = AuthenticationRequestParameters + 65;
        getDeviceData = i13 % 128;
        if (i13 % 2 == 0) {
            return stringValueM164boximpl;
        }
        throw null;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/MmsUaProfUrl$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        private getDeviceData() {
        }

        public /* synthetic */ getDeviceData(byte b8) {
            this();
        }
    }
}
