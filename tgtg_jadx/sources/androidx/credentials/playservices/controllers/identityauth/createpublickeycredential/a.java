package androidx.credentials.playservices.controllers.identityauth.createpublickeycredential;

import androidx.credentials.exceptions.CreateCredentialException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController f2830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CreateCredentialException f2831c;

    public /* synthetic */ a(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, CreateCredentialException createCredentialException, int i11) {
        this.f2829a = i11;
        this.f2830b = credentialProviderCreatePublicKeyCredentialController;
        this.f2831c = createCredentialException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2829a) {
            case 0:
                CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$10$lambda$9$lambda$8(this.f2830b, this.f2831c);
                break;
            case 1:
                CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$16$lambda$15(this.f2830b, this.f2831c);
                break;
            default:
                CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$13$lambda$12(this.f2830b, this.f2831c);
                break;
        }
    }
}
