package androidx.credentials.playservices;

import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements d10.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CancellationSignal f2815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Executor f2816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n7.l f2817d;

    public /* synthetic */ c(CancellationSignal cancellationSignal, Executor executor, n7.l lVar, int i11) {
        this.f2814a = i11;
        this.f2815b = cancellationSignal;
        this.f2816c = executor;
        this.f2817d = lVar;
    }

    @Override // d10.d
    public final void onFailure(Exception exc) {
        switch (this.f2814a) {
            case 0:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$14(this.f2815b, this.f2816c, this.f2817d, exc);
                break;
            default:
                CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$8(this.f2815b, this.f2816c, this.f2817d, exc);
                break;
        }
    }
}
