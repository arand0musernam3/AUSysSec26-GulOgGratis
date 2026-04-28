package androidx.credentials.playservices.controllers.identityauth.beginsignin;

import androidx.credentials.exceptions.GetCredentialException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CredentialProviderBeginSignInController f2821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GetCredentialException f2822c;

    public /* synthetic */ b(CredentialProviderBeginSignInController credentialProviderBeginSignInController, GetCredentialException getCredentialException, int i11) {
        this.f2820a = i11;
        this.f2821b = credentialProviderBeginSignInController;
        this.f2822c = getCredentialException;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f2820a) {
            case 0:
                return CredentialProviderBeginSignInController.handleResponse$lambda$15(this.f2821b, this.f2822c);
            default:
                return CredentialProviderBeginSignInController.invokePlayServices$lambda$6$lambda$5(this.f2821b, this.f2822c);
        }
    }
}
