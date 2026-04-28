package androidx.credentials.playservices.controllers.identityauth.createpassword;

import androidx.credentials.exceptions.CreateCredentialException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CredentialProviderCreatePasswordController f2827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CreateCredentialException f2828c;

    public /* synthetic */ a(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, CreateCredentialException createCredentialException, int i11) {
        this.f2826a = i11;
        this.f2827b = credentialProviderCreatePasswordController;
        this.f2828c = createCredentialException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2826a) {
            case 0:
                CredentialProviderCreatePasswordController.invokePlayServices$lambda$6$lambda$5$lambda$4(this.f2827b, this.f2828c);
                break;
            default:
                CredentialProviderCreatePasswordController.handleResponse$lambda$9$lambda$8(this.f2827b, this.f2828c);
                break;
        }
    }
}
