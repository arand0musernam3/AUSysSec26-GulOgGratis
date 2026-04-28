package atd.q;

import android.app.Application;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\n¨\u0006\f"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/packagemanager/GetSystemAvailableFeatures;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$IntValue;", "getDeviceParameterResult--tjUSDw", "()I", "getDeviceParameterResult", "Landroid/app/Application;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKTransactionID extends DeviceParameter {
    private static int BuildConfig = 1;
    private static int getDeviceData = 0;
    private static int getSDKAppID = 0;
    private static int getSDKReferenceNumber = 1;
    private static int getSDKTransactionID;

    @NotNull
    private final Application AuthenticationRequestParameters;

    static {
        AuthenticationRequestParameters();
        View.MeasureSpec.getSize(0);
        ExpandableListView.getPackedPositionChild(0L);
        ViewConfiguration.getTapTimeout();
        new C0014getSDKTransactionID((byte) 0);
        int i11 = getSDKAppID + 29;
        BuildConfig = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public getSDKTransactionID(@NotNull Application application) {
        application.getClass();
        this.AuthenticationRequestParameters = application;
    }

    public static void AuthenticationRequestParameters() {
        getDeviceData = 711855196;
    }

    private int getSDKTransactionID() {
        getSDKReferenceNumber = (getSDKTransactionID + 107) % 128;
        int iM151constructorimpl = DeviceParameterResult.Success.IntValue.m151constructorimpl(this.AuthenticationRequestParameters.getPackageManager().getSystemAvailableFeatures().length);
        getSDKReferenceNumber = (getSDKTransactionID + 111) % 128;
        return iM151constructorimpl;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getSDKReferenceNumber() {
        int i11 = getSDKReferenceNumber + 51;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 != 0) {
            DeviceParameterResult.Success.IntValue.m150boximpl(getSDKTransactionID());
            throw null;
        }
        DeviceParameterResult.Success.IntValue intValueM150boximpl = DeviceParameterResult.Success.IntValue.m150boximpl(getSDKTransactionID());
        int i12 = getSDKReferenceNumber + 113;
        getSDKTransactionID = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 97 / 0;
        }
        return intValueM150boximpl;
    }

    /* JADX INFO: renamed from: atd.q.getSDKTransactionID$getSDKTransactionID, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/packagemanager/GetSystemAvailableFeatures$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C0014getSDKTransactionID {
        public static int AuthenticationRequestParameters;
        public static int getDeviceData;

        private C0014getSDKTransactionID() {
        }

        public static int getDeviceData() {
            int i11 = getDeviceData;
            int i12 = i11 % 7701263;
            getDeviceData = i11 + 1;
            if (i12 != 0) {
                return AuthenticationRequestParameters;
            }
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            AuthenticationRequestParameters = iElapsedRealtime;
            return iElapsedRealtime;
        }

        public /* synthetic */ C0014getSDKTransactionID(byte b8) {
            this();
        }
    }
}
