package androidx.credentials.playservices;

import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements d10.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CancellationSignal f2911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Executor f2912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n7.l f2913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2914e;

    public /* synthetic */ j(Object obj, CancellationSignal cancellationSignal, Executor executor, n7.l lVar, int i11) {
        this.f2910a = i11;
        this.f2914e = obj;
        this.f2911b = cancellationSignal;
        this.f2912c = executor;
        this.f2913d = lVar;
    }

    @Override // d10.d
    public final void onFailure(Exception exc) {
        switch (this.f2910a) {
            case 0:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27((CredentialProviderPlayServicesImpl) this.f2914e, this.f2911b, this.f2912c, this.f2913d, exc);
                break;
            default:
                CredentialProviderGetDigitalCredentialController.invokePlayServices$lambda$4((CredentialProviderGetDigitalCredentialController) this.f2914e, this.f2911b, this.f2912c, this.f2913d, exc);
                break;
        }
    }
}
