package atd.w;

import android.app.Application;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.view.Gravity;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.app.tgtg.model.local.AppConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/SimCarrierId;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/TelephonyDeviceParameter;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSimCarrierId.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimCarrierId.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/telephony/SimCarrierId\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
public final class timedout extends InitializeResultSuccess {
    private static int AuthenticationRequestParameters = 0;
    private static int BuildConfig = 1;
    private static int getDeviceData = 0;
    private static char[] getSDKAppID = null;
    private static int getSDKReferenceNumber = 1;
    private static char getSDKTransactionID;

    static {
        getSDKTransactionID();
        Gravity.getAbsoluteGravity(0, 0);
        ExpandableListView.getPackedPositionGroup(0L);
        new getSDKAppID((byte) 0);
        int i11 = BuildConfig + AppConstants.RESULT_CODE_ORDER_CANCELLED;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 63 / 0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public timedout(@NotNull Application application) {
        super(application);
        application.getClass();
    }

    public static void getSDKTransactionID() {
        getSDKAppID = new char[]{30855, 30965, 30974, 30967};
        getSDKTransactionID = (char) 19806;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() {
        getSDKReferenceNumber = (AuthenticationRequestParameters + 87) % 128;
        if (Build.VERSION.SDK_INT < 28) {
            DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.UNSUPPORTED_OR_DEPRECATED);
            AuthenticationRequestParameters = (getSDKReferenceNumber + 69) % 128;
            return failure;
        }
        TelephonyManager telephonyManagerChallengeResult = ChallengeResult();
        if (telephonyManagerChallengeResult == null) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
        AuthenticationRequestParameters = (getSDKReferenceNumber + 105) % 128;
        return DeviceParameterResult.Success.IntValue.m150boximpl(DeviceParameterResult.Success.IntValue.m151constructorimpl(telephonyManagerChallengeResult.getSimCarrierId()));
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/SimCarrierId$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKAppID {
        private getSDKAppID() {
        }

        public /* synthetic */ getSDKAppID(byte b8) {
            this();
        }
    }
}
