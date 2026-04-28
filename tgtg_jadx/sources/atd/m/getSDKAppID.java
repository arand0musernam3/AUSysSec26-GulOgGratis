package atd.m;

import android.app.Application;
import android.util.DisplayMetrics;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/displaymetrics/DisplayMetricsDeviceParameter;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "application", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "displayMetrics", "Landroid/util/DisplayMetrics;", "getDisplayMetrics", "()Landroid/util/DisplayMetrics;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class getSDKAppID extends DeviceParameter {
    private static int getDeviceData = 1;
    private static int getSDKTransactionID;

    @NotNull
    private final Application getSDKReferenceNumber;

    public getSDKAppID(@NotNull Application application) {
        application.getClass();
        this.getSDKReferenceNumber = application;
    }

    @NotNull
    public final DisplayMetrics getSDKAppID() {
        int i11 = getSDKTransactionID;
        int i12 = i11 ^ 119;
        int i13 = ((i11 & 119) | i12) << 1;
        int i14 = -i12;
        int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
        getDeviceData = i15 % 128;
        int i16 = i15 % 2;
        DisplayMetrics displayMetrics = this.getSDKReferenceNumber.getResources().getDisplayMetrics();
        displayMetrics.getClass();
        if (i16 == 0) {
            throw null;
        }
        int i17 = getSDKTransactionID;
        getDeviceData = (((i17 | 75) << 1) - (i17 ^ 75)) % 128;
        return displayMetrics;
    }
}
