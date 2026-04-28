package androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CreatePasswordCredentialController f2860b;

    public /* synthetic */ c(CreatePasswordCredentialController createPasswordCredentialController, int i11) {
        this.f2859a = i11;
        this.f2860b = createPasswordCredentialController;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f2859a) {
            case 0:
                return CreatePasswordCredentialController.invokePlayServices$lambda$2$lambda$1(this.f2860b);
            default:
                return CreatePasswordCredentialController.handleResponse$lambda$9(this.f2860b);
        }
    }
}
