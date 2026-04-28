package androidx.credentials.playservices;

import androidx.credentials.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController;
import androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n7.l f2920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Exception f2921c;

    public /* synthetic */ l(n7.l lVar, Exception exc, int i11) {
        this.f2919a = i11;
        this.f2920b = lVar;
        this.f2921c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2919a) {
            case 0:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25$lambda$24(this.f2920b, this.f2921c);
                break;
            case 1:
                CreateDigitalCredentialController.invokePlayServices$lambda$13$lambda$12$lambda$11(this.f2920b, this.f2921c);
                break;
            case 2:
                CredentialProviderCreateRestoreCredentialController.invokePlayServices$lambda$4$lambda$3$lambda$2(this.f2920b, this.f2921c);
                break;
            default:
                CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$4$lambda$3$lambda$2(this.f2920b, this.f2921c);
                break;
        }
    }
}
