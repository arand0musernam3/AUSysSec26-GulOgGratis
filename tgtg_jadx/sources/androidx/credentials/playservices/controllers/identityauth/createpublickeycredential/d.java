package androidx.credentials.playservices.controllers.identityauth.createpublickeycredential;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController f2839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f2840c;

    public /* synthetic */ d(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Throwable th2, int i11) {
        this.f2838a = i11;
        this.f2839b = credentialProviderCreatePublicKeyCredentialController;
        this.f2840c = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2838a) {
            case 0:
                CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$22$lambda$21(this.f2839b, this.f2840c);
                break;
            default:
                CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$3$lambda$2(this.f2839b, this.f2840c);
                break;
        }
    }
}
