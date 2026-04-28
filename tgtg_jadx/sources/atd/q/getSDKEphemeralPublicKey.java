package atd.q;

import android.app.Application;
import android.view.View;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\n¨\u0006\f"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/packagemanager/IsSafeMode;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$BooleanValue;", "getDeviceParameterResult-f40dxT0", "()Z", "getDeviceParameterResult", "Landroid/app/Application;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKEphemeralPublicKey extends DeviceParameter {
    private static char[] AuthenticationRequestParameters = null;
    private static int ChallengeResult = 0;
    private static int getMessageVersion = 1;
    private static int getSDKAppID = 0;
    private static int getSDKReferenceNumber = 1;
    private static long getSDKTransactionID;

    @NotNull
    private final Application getDeviceData;

    static {
        getSDKAppID();
        ViewConfiguration.getJumpTapTimeout();
        ViewConfiguration.getScrollDefaultDelay();
        View.resolveSize(0, 0);
        new getSDKTransactionID((byte) 0);
        int i11 = getMessageVersion + 5;
        ChallengeResult = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 92 / 0;
        }
    }

    public getSDKEphemeralPublicKey(@NotNull Application application) {
        application.getClass();
        this.getDeviceData = application;
    }

    public static void getSDKAppID() {
        AuthenticationRequestParameters = new char[]{10866, 42945, 12679, 33614};
        getSDKTransactionID = -1325971788906071603L;
    }

    private boolean getSDKTransactionID() {
        getSDKReferenceNumber = (getSDKAppID + 45) % 128;
        boolean zM130constructorimpl = DeviceParameterResult.Success.BooleanValue.m130constructorimpl(this.getDeviceData.getPackageManager().isSafeMode());
        int i11 = getSDKAppID + 9;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            return zM130constructorimpl;
        }
        throw null;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getSDKReferenceNumber() {
        getSDKReferenceNumber = (getSDKAppID + 81) % 128;
        DeviceParameterResult.Success.BooleanValue booleanValueM129boximpl = DeviceParameterResult.Success.BooleanValue.m129boximpl(getSDKTransactionID());
        getSDKAppID = (getSDKReferenceNumber + 49) % 128;
        return booleanValueM129boximpl;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/packagemanager/IsSafeMode$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKTransactionID {
        public static int getSDKReferenceNumber;
        public static int getSDKTransactionID;

        private getSDKTransactionID() {
        }

        public static int getSDKAppID() {
            int i11 = getSDKReferenceNumber;
            int i12 = i11 % 8556205;
            getSDKReferenceNumber = i11 + 1;
            if (i12 != 0) {
                return getSDKTransactionID;
            }
            int iA = a0.a();
            getSDKTransactionID = iA;
            return iA;
        }

        public /* synthetic */ getSDKTransactionID(byte b8) {
            this();
        }
    }
}
