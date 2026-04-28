package androidx.credentials.playservices.controllers.identityauth.getsigninintent;

import androidx.credentials.exceptions.GetCredentialException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CredentialProviderGetSignInIntentController f2847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GetCredentialException f2848c;

    public /* synthetic */ b(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, GetCredentialException getCredentialException, int i11) {
        this.f2846a = i11;
        this.f2847b = credentialProviderGetSignInIntentController;
        this.f2848c = getCredentialException;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f2846a) {
            case 0:
                return CredentialProviderGetSignInIntentController.handleResponse$lambda$17(this.f2847b, this.f2848c);
            default:
                return CredentialProviderGetSignInIntentController.invokePlayServices$lambda$8$lambda$7(this.f2847b, this.f2848c);
        }
    }
}
