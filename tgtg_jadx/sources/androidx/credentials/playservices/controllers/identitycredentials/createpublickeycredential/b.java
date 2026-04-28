package androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CreatePublicKeyCredentialController f2865b;

    public /* synthetic */ b(CreatePublicKeyCredentialController createPublicKeyCredentialController, int i11) {
        this.f2864a = i11;
        this.f2865b = createPublicKeyCredentialController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2864a) {
            case 0:
                CreatePublicKeyCredentialController.handleResponse$lambda$17$lambda$16(this.f2865b);
                break;
            default:
                CreatePublicKeyCredentialController.invokePlayServices$lambda$8$lambda$3$lambda$2(this.f2865b);
                break;
        }
    }
}
