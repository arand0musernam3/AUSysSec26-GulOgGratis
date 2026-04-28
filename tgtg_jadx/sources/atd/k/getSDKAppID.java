package atd.k;

import android.app.Application;
import android.media.AudioTrack;
import android.view.KeyEvent;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\n¨\u0006\f"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/AppId;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$StringValue;", "getDeviceParameterResult-GaL_DrQ", "()Ljava/lang/String;", "getDeviceParameterResult", "Landroid/app/Application;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKAppID extends DeviceParameter {
    private static int AuthenticationRequestParameters = 1;
    private static int BuildConfig = 1;
    private static int ChallengeResultCancelled;
    private static int getDeviceData;
    private static char[] getSDKAppID;
    private static char getSDKReferenceNumber;

    @NotNull
    private final Application getSDKTransactionID;

    static {
        AuthenticationRequestParameters();
        KeyEvent.getDeadChar(0, 0);
        AudioTrack.getMaxVolume();
        new C0009getSDKAppID((byte) 0);
        BuildConfig = (ChallengeResultCancelled + 113) % 128;
    }

    public getSDKAppID(@NotNull Application application) {
        application.getClass();
        this.getSDKTransactionID = application;
    }

    public static void AuthenticationRequestParameters() {
        getSDKAppID = new char[]{30853, 30966, 30962, 30967};
        getSDKReferenceNumber = (char) 19806;
    }

    @NotNull
    private String getSDKAppID() throws Throwable {
        Application application = this.getSDKTransactionID;
        atd.an.getSDKReferenceNumber sDKTransactionID = atd.an.getSDKReferenceNumber.getSDKTransactionID();
        sDKTransactionID.getClass();
        String strM165constructorimpl = DeviceParameterResult.Success.StringValue.m165constructorimpl(new atd.e.getDeviceData(application, sDKTransactionID).getSDKReferenceNumber());
        AuthenticationRequestParameters = (getDeviceData + 61) % 128;
        return strM165constructorimpl;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getSDKReferenceNumber() {
        getDeviceData = (AuthenticationRequestParameters + 11) % 128;
        DeviceParameterResult.Success.StringValue stringValueM164boximpl = DeviceParameterResult.Success.StringValue.m164boximpl(getSDKAppID());
        int i11 = AuthenticationRequestParameters + 37;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 11 / 0;
        }
        return stringValueM164boximpl;
    }

    /* JADX INFO: renamed from: atd.k.getSDKAppID$getSDKAppID, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/AppId$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C0009getSDKAppID {
        private C0009getSDKAppID() {
        }

        public /* synthetic */ C0009getSDKAppID(byte b8) {
            this();
        }
    }
}
