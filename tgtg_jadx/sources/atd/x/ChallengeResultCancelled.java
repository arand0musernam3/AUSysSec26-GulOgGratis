package atd.x;

import android.app.Application;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/DefaultPackageManager;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/PackageManager;", "application", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "getApplication", "()Landroid/app/Application;", "canRequestPackageInstalls", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeResultCancelled implements ChallengeResultTimeout {
    private static int getSDKAppID = 1;
    private static int getSDKReferenceNumber;

    @NotNull
    private final Application AuthenticationRequestParameters;

    public ChallengeResultCancelled(@NotNull Application application) {
        application.getClass();
        this.AuthenticationRequestParameters = application;
    }

    @Override // atd.x.ChallengeResultTimeout
    public final boolean getSDKAppID() {
        int i11 = getSDKAppID;
        getSDKReferenceNumber = (((i11 | 31) << 1) - (i11 ^ 31)) % 128;
        boolean zCanRequestPackageInstalls = this.AuthenticationRequestParameters.getPackageManager().canRequestPackageInstalls();
        int i12 = getSDKAppID + 35;
        getSDKReferenceNumber = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 63 / 0;
        }
        return zCanRequestPackageInstalls;
    }
}
