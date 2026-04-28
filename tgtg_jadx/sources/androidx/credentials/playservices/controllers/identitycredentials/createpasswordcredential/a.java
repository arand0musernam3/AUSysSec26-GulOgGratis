package androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential;

import androidx.credentials.exceptions.CreateCredentialException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CreatePasswordCredentialController f2855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CreateCredentialException f2856c;

    public /* synthetic */ a(CreatePasswordCredentialController createPasswordCredentialController, CreateCredentialException createCredentialException, int i11) {
        this.f2854a = i11;
        this.f2855b = createPasswordCredentialController;
        this.f2856c = createCredentialException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2854a) {
            case 0:
                CreatePasswordCredentialController.handleResponse$lambda$7$lambda$6(this.f2855b, this.f2856c);
                break;
            default:
                CreatePasswordCredentialController.handleResponse$lambda$13$lambda$12(this.f2855b, this.f2856c);
                break;
        }
    }
}
