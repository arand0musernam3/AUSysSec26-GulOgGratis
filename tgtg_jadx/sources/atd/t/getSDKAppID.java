package atd.t;

import android.app.Application;
import android.provider.Settings;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/GlobalSettings;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "application", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "get", "", "setting", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKAppID implements getSDKReferenceNumber {
    private static int AuthenticationRequestParameters = 1;
    private static int getSDKAppID;

    @NotNull
    private final Application getDeviceData;

    public getSDKAppID(@NotNull Application application) {
        application.getClass();
        this.getDeviceData = application;
    }

    @Override // atd.t.getSDKReferenceNumber
    @Nullable
    public final String AuthenticationRequestParameters(@NotNull String str) {
        getSDKAppID = (AuthenticationRequestParameters + 25) % 128;
        str.getClass();
        String string = Settings.Global.getString(this.getDeviceData.getContentResolver(), str);
        int i11 = getSDKAppID;
        AuthenticationRequestParameters = a0.d(((i11 ^ 113) | (i11 & 113)) << 1, ~(-(((~i11) & 113) | (i11 & (-114)))), 1, 128);
        return string;
    }
}
