package androidx.credentials.playservices.controllers.identityauth.createpublickeycredential;

import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController f2833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ JSONException f2834c;

    public /* synthetic */ b(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, JSONException jSONException, int i11) {
        this.f2832a = i11;
        this.f2833b = credentialProviderCreatePublicKeyCredentialController;
        this.f2834c = jSONException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2832a) {
            case 0:
                CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$1$lambda$0(this.f2833b, this.f2834c);
                break;
            default:
                CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$20$lambda$19(this.f2833b, this.f2834c);
                break;
        }
    }
}
