package atd.m;

import android.app.Application;
import android.media.AudioTrack;
import android.view.View;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/displaymetrics/Density;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/displaymetrics/DisplayMetricsDeviceParameter;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$FloatValue;", "getDeviceParameterResult-Ffr52qI", "()F", "getDeviceParameterResult", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AuthenticationRequestParameters extends getSDKAppID {
    private static int AuthenticationRequestParameters = 0;
    private static char[] getDeviceData = null;
    private static int getMessageVersion = 1;
    private static char getSDKAppID = 0;
    private static int getSDKReferenceNumber = 0;
    private static int getSDKTransactionID = 1;

    static {
        AuthenticationRequestParameters();
        View.MeasureSpec.getMode(0);
        AudioTrack.getMaxVolume();
        new getDeviceData((byte) 0);
        AuthenticationRequestParameters = (getMessageVersion + 35) % 128;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthenticationRequestParameters(@NotNull Application application) {
        super(application);
        application.getClass();
    }

    public static void AuthenticationRequestParameters() {
        getDeviceData = new char[]{30967, 30855, 30960, 30965};
        getSDKAppID = (char) 19806;
    }

    private float getSDKTransactionID() {
        float fM144constructorimpl;
        int i11 = getSDKReferenceNumber + 69;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            fM144constructorimpl = DeviceParameterResult.Success.FloatValue.m144constructorimpl(getSDKAppID().density);
            int i12 = 73 / 0;
        } else {
            fM144constructorimpl = DeviceParameterResult.Success.FloatValue.m144constructorimpl(getSDKAppID().density);
        }
        getSDKReferenceNumber = (getSDKTransactionID + 17) % 128;
        return fM144constructorimpl;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getSDKReferenceNumber() {
        int i11 = getSDKTransactionID + 73;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            return DeviceParameterResult.Success.FloatValue.m143boximpl(getSDKTransactionID());
        }
        DeviceParameterResult.Success.FloatValue.m143boximpl(getSDKTransactionID());
        throw null;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/displaymetrics/Density$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        private getDeviceData() {
        }

        public /* synthetic */ getDeviceData(byte b8) {
            this();
        }
    }
}
