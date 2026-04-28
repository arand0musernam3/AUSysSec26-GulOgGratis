package androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential;

import androidx.credentials.exceptions.CreateCredentialException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CreateDigitalCredentialController f2852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CreateCredentialException f2853c;

    public /* synthetic */ a(CreateDigitalCredentialController createDigitalCredentialController, CreateCredentialException createCredentialException, int i11) {
        this.f2851a = i11;
        this.f2852b = createDigitalCredentialController;
        this.f2853c = createCredentialException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2851a) {
            case 0:
                CreateDigitalCredentialController.handleResponse$lambda$2$lambda$1(this.f2852b, this.f2853c);
                break;
            default:
                CreateDigitalCredentialController.handleResponse$lambda$6$lambda$5(this.f2852b, this.f2853c);
                break;
        }
    }
}
