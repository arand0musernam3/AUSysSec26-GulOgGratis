package atd.v;

import android.app.Application;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebSettings;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.app.tgtg.model.local.AppConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\n¨\u0006\f"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/webview/WebViewUserAgent;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$StringValue;", "getDeviceParameterResult-GaL_DrQ", "()Ljava/lang/String;", "getDeviceParameterResult", "Landroid/app/Application;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKTransactionID extends DeviceParameter {
    private static int AuthenticationRequestParameters = 0;
    private static int BuildConfig = 1;
    private static int ChallengeResult = 0;
    private static int ChallengeResultCancelled = 1;
    private static int getMessageVersion;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;
    private static byte[] getSDKTransactionID;

    @NotNull
    private final Application getDeviceData;

    static {
        getSDKTransactionID();
        ViewConfiguration.getKeyRepeatTimeout();
        ViewConfiguration.getTapTimeout();
        ViewConfiguration.getLongPressTimeout();
        ViewConfiguration.getJumpTapTimeout();
        View.resolveSize(0, 0);
        new C0015getSDKTransactionID((byte) 0);
        ChallengeResult = (BuildConfig + 97) % 128;
    }

    public getSDKTransactionID(@NotNull Application application) {
        application.getClass();
        this.getDeviceData = application;
    }

    @NotNull
    private String AuthenticationRequestParameters() {
        int i11 = ChallengeResultCancelled + AppConstants.RESULT_CODE_ORDER_CANCELLED;
        getMessageVersion = i11 % 128;
        int i12 = i11 % 2;
        Application application = this.getDeviceData;
        if (i12 != 0) {
            String defaultUserAgent = WebSettings.getDefaultUserAgent(application);
            defaultUserAgent.getClass();
            DeviceParameterResult.Success.StringValue.m165constructorimpl(defaultUserAgent);
            throw null;
        }
        String defaultUserAgent2 = WebSettings.getDefaultUserAgent(application);
        defaultUserAgent2.getClass();
        String strM165constructorimpl = DeviceParameterResult.Success.StringValue.m165constructorimpl(defaultUserAgent2);
        getMessageVersion = (ChallengeResultCancelled + 33) % 128;
        return strM165constructorimpl;
    }

    public static void getSDKTransactionID() {
        getSDKReferenceNumber = 916809523;
        getSDKAppID = 829166691;
        AuthenticationRequestParameters = 1657723896;
        getSDKTransactionID = new byte[]{-9, -15, 3, 35};
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getSDKReferenceNumber() {
        getMessageVersion = (ChallengeResultCancelled + 91) % 128;
        DeviceParameterResult.Success.StringValue stringValueM164boximpl = DeviceParameterResult.Success.StringValue.m164boximpl(AuthenticationRequestParameters());
        ChallengeResultCancelled = (getMessageVersion + 113) % 128;
        return stringValueM164boximpl;
    }

    /* JADX INFO: renamed from: atd.v.getSDKTransactionID$getSDKTransactionID, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/webview/WebViewUserAgent$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C0015getSDKTransactionID {
        private C0015getSDKTransactionID() {
        }

        public /* synthetic */ C0015getSDKTransactionID(byte b8) {
            this();
        }
    }
}
