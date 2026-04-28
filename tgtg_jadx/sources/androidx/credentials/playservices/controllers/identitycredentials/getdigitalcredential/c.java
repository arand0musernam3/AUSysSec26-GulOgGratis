package androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential;

import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.playservices.controllers.ResponseUtils;
import n7.l;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f2887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GetCredentialException f2888c;

    public /* synthetic */ c(l lVar, GetCredentialException getCredentialException, int i11) {
        this.f2886a = i11;
        this.f2887b = lVar;
        this.f2888c = getCredentialException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2886a) {
            case 0:
                this.f2887b.a(this.f2888c);
                break;
            case 1:
                ResponseUtils.Companion.handleGetCredentialResponse$lambda$8$lambda$7(this.f2887b, this.f2888c);
                break;
            default:
                this.f2887b.a(this.f2888c);
                break;
        }
    }
}
