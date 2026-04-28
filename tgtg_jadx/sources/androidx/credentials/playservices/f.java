package androidx.credentials.playservices;

import androidx.credentials.playservices.controllers.ResponseUtils;
import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.signalcredentialstate.SignalCredentialStateController;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n7.l f2899b;

    public /* synthetic */ f(n7.l lVar, int i11) {
        this.f2898a = i11;
        this.f2899b = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2898a) {
            case 0:
                CredentialProviderPlayServicesImpl.onGetCredential$lambda$1$lambda$0(this.f2899b);
                break;
            case 1:
                this.f2899b.onResult(null);
                break;
            case 2:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$7$lambda$6(this.f2899b);
                break;
            case 3:
                this.f2899b.onResult(null);
                break;
            case 4:
                this.f2899b.onResult(null);
                break;
            case 5:
                CredentialProviderPlayServicesImpl.onCreateCredential$lambda$5$lambda$4(this.f2899b);
                break;
            case 6:
                CredentialProviderPlayServicesImpl.onGetCredential$lambda$3$lambda$2(this.f2899b);
                break;
            case 7:
                CreatePublicKeyCredentialController.invokePlayServices$lambda$8$lambda$7$lambda$6(this.f2899b);
                break;
            case 8:
                CreatePublicKeyCredentialController.invokePlayServices$lambda$8$lambda$1$lambda$0(this.f2899b);
                break;
            case 9:
                GetCredentialController.invokePlayServices$lambda$2$lambda$1$lambda$0(this.f2899b);
                break;
            case 10:
                ResponseUtils.Companion.handleGetCredentialResponse$lambda$4$lambda$3(this.f2899b);
                break;
            default:
                SignalCredentialStateController.invokePlayServices$lambda$2$lambda$0(this.f2899b);
                break;
        }
    }
}
