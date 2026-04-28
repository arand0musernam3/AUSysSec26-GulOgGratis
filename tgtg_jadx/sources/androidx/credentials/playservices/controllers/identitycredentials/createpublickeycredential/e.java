package androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CreatePublicKeyCredentialController f2875b;

    public /* synthetic */ e(CreatePublicKeyCredentialController createPublicKeyCredentialController, int i11) {
        this.f2874a = i11;
        this.f2875b = createPublicKeyCredentialController;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f2874a) {
            case 0:
                return CreatePublicKeyCredentialController.handleResponse$lambda$17(this.f2875b);
            default:
                return CreatePublicKeyCredentialController.invokePlayServices$lambda$8$lambda$3(this.f2875b);
        }
    }
}
