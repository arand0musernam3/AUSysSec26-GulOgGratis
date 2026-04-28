package atd.m;

import android.app.Application;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/displaymetrics/Xdpi;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/displaymetrics/DisplayMetricsDeviceParameter;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$FloatValue;", "getDeviceParameterResult-Ffr52qI", "()F", "getDeviceParameterResult", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKReferenceNumber extends getSDKAppID {
    private static int AuthenticationRequestParameters = 0;
    private static int ChallengeResult = 1;
    private static int ChallengeResultCancelled = 1;
    private static int getDeviceData;
    private static int getMessageVersion;
    private static int getSDKAppID;
    private static byte[] getSDKReferenceNumber;
    private static int getSDKTransactionID;

    static {
        getSDKTransactionID();
        TextUtils.indexOf((CharSequence) "", '0');
        TypedValue.complexToFloat(0);
        Drawable.resolveOpacity(0, 0);
        MotionEvent.axisFromString("");
        SystemClock.uptimeMillis();
        new AuthenticationRequestParameters((byte) 0);
        getMessageVersion = (ChallengeResultCancelled + 109) % 128;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getSDKReferenceNumber(@NotNull Application application) {
        super(application);
        application.getClass();
    }

    private float AuthenticationRequestParameters() {
        AuthenticationRequestParameters = (ChallengeResult + 55) % 128;
        float fM144constructorimpl = DeviceParameterResult.Success.FloatValue.m144constructorimpl(getSDKAppID().xdpi);
        ChallengeResult = (AuthenticationRequestParameters + 23) % 128;
        return fM144constructorimpl;
    }

    public static void getSDKTransactionID() {
        getSDKAppID = 1174428442;
        getDeviceData = 829166719;
        getSDKTransactionID = -1836163875;
        getSDKReferenceNumber = new byte[]{9, 8, 122, 35};
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getSDKReferenceNumber() {
        int i11 = AuthenticationRequestParameters + 113;
        ChallengeResult = i11 % 128;
        if (i11 % 2 == 0) {
            DeviceParameterResult.Success.FloatValue.m143boximpl(AuthenticationRequestParameters());
            throw null;
        }
        DeviceParameterResult.Success.FloatValue floatValueM143boximpl = DeviceParameterResult.Success.FloatValue.m143boximpl(AuthenticationRequestParameters());
        int i12 = ChallengeResult + 93;
        AuthenticationRequestParameters = i12 % 128;
        if (i12 % 2 == 0) {
            return floatValueM143boximpl;
        }
        throw null;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/displaymetrics/Xdpi$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthenticationRequestParameters {
        private AuthenticationRequestParameters() {
        }

        public /* synthetic */ AuthenticationRequestParameters(byte b8) {
            this();
        }
    }
}
