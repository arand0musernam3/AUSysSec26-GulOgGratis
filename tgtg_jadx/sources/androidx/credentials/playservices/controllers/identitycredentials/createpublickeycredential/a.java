package androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential;

import androidx.credentials.exceptions.CreateCredentialException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CreatePublicKeyCredentialController f2862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CreateCredentialException f2863c;

    public /* synthetic */ a(CreatePublicKeyCredentialController createPublicKeyCredentialController, CreateCredentialException createCredentialException, int i11) {
        this.f2861a = i11;
        this.f2862b = createPublicKeyCredentialController;
        this.f2863c = createCredentialException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2861a) {
            case 0:
                CreatePublicKeyCredentialController.handleResponse$lambda$15$lambda$14(this.f2862b, this.f2863c);
                break;
            default:
                CreatePublicKeyCredentialController.handleResponse$lambda$21$lambda$20(this.f2862b, this.f2863c);
                break;
        }
    }
}
