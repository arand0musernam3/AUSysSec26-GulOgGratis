package androidx.credentials.playservices.controllers.identityauth.createpublickeycredential;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController f2842b;

    public /* synthetic */ e(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, int i11) {
        this.f2841a = i11;
        this.f2842b = credentialProviderCreatePublicKeyCredentialController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2841a) {
            case 0:
                CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$6$lambda$5$lambda$4(this.f2842b);
                break;
            default:
                CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$14(this.f2842b);
                break;
        }
    }
}
