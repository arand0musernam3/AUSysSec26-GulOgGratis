package androidx.credentials.playservices.controllers.identityauth.getsigninintent;

import androidx.credentials.exceptions.GetCredentialException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CredentialProviderGetSignInIntentController f2844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GetCredentialException f2845c;

    public /* synthetic */ a(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, GetCredentialException getCredentialException, int i11) {
        this.f2843a = i11;
        this.f2844b = credentialProviderGetSignInIntentController;
        this.f2845c = getCredentialException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2843a) {
            case 0:
                CredentialProviderGetSignInIntentController.handleResponse$lambda$17$lambda$16(this.f2844b, this.f2845c);
                break;
            case 1:
                CredentialProviderGetSignInIntentController.handleResponse$lambda$11$lambda$10(this.f2844b, this.f2845c);
                break;
            default:
                CredentialProviderGetSignInIntentController.invokePlayServices$lambda$8$lambda$7$lambda$6(this.f2844b, this.f2845c);
                break;
        }
    }
}
