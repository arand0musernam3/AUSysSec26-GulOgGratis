package androidx.credentials.playservices.controllers.identityauth.beginsignin;

import androidx.credentials.exceptions.GetCredentialException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CredentialProviderBeginSignInController f2824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GetCredentialException f2825c;

    public /* synthetic */ c(CredentialProviderBeginSignInController credentialProviderBeginSignInController, GetCredentialException getCredentialException, int i11) {
        this.f2823a = i11;
        this.f2824b = credentialProviderBeginSignInController;
        this.f2825c = getCredentialException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2823a) {
            case 0:
                CredentialProviderBeginSignInController.handleResponse$lambda$15$lambda$14(this.f2824b, this.f2825c);
                break;
            case 1:
                CredentialProviderBeginSignInController.handleResponse$lambda$9$lambda$8(this.f2824b, this.f2825c);
                break;
            default:
                CredentialProviderBeginSignInController.invokePlayServices$lambda$6$lambda$5$lambda$4(this.f2824b, this.f2825c);
                break;
        }
    }
}
