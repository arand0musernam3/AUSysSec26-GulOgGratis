package androidx.credentials.playservices;

import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController;
import java.util.concurrent.Executor;
import n7.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements d10.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2892a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n7.l f2893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Executor f2894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CancellationSignal f2895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2897f;

    public /* synthetic */ e(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, n7.a aVar, CancellationSignal cancellationSignal, Executor executor, n7.l lVar) {
        this.f2896e = credentialProviderPlayServicesImpl;
        this.f2897f = aVar;
        this.f2895d = cancellationSignal;
        this.f2894c = executor;
        this.f2893b = lVar;
    }

    @Override // d10.d
    public final void onFailure(Exception exc) {
        switch (this.f2892a) {
            case 0:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$19((CredentialProviderPlayServicesImpl) this.f2896e, (n7.a) this.f2897f, this.f2895d, this.f2894c, this.f2893b, exc);
                break;
            default:
                GetCredentialController.invokePlayServices$lambda$4((s) this.f2896e, (GetCredentialController) this.f2897f, this.f2893b, this.f2894c, this.f2895d, exc);
                break;
        }
    }

    public /* synthetic */ e(s sVar, GetCredentialController getCredentialController, n7.l lVar, Executor executor, CancellationSignal cancellationSignal) {
        this.f2896e = sVar;
        this.f2897f = getCredentialController;
        this.f2893b = lVar;
        this.f2894c = executor;
        this.f2895d = cancellationSignal;
    }
}
