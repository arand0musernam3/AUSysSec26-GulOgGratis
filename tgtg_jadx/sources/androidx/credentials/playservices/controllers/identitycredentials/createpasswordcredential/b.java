package androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CreatePasswordCredentialController f2858b;

    public /* synthetic */ b(CreatePasswordCredentialController createPasswordCredentialController, int i11) {
        this.f2857a = i11;
        this.f2858b = createPasswordCredentialController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2857a) {
            case 0:
                CreatePasswordCredentialController.invokePlayServices$lambda$2$lambda$1$lambda$0(this.f2858b);
                break;
            default:
                CreatePasswordCredentialController.handleResponse$lambda$9$lambda$8(this.f2858b);
                break;
        }
    }
}
