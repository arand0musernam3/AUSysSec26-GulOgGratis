package androidx.credentials.playservices;

import androidx.credentials.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController;
import androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Executor f2901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n7.l f2902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Exception f2903d;

    public /* synthetic */ g(Exception exc, Executor executor, n7.l lVar) {
        this.f2900a = 0;
        this.f2903d = exc;
        this.f2901b = executor;
        this.f2902c = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f2900a) {
            case 0:
                return CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25(this.f2903d, this.f2901b, this.f2902c);
            case 1:
                return CreateDigitalCredentialController.invokePlayServices$lambda$13$lambda$12(this.f2901b, this.f2902c, this.f2903d);
            case 2:
                return CredentialProviderCreateRestoreCredentialController.invokePlayServices$lambda$4$lambda$3(this.f2901b, this.f2902c, this.f2903d);
            default:
                return CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$4$lambda$3(this.f2901b, this.f2902c, this.f2903d);
        }
    }

    public /* synthetic */ g(Executor executor, n7.l lVar, Exception exc, int i11) {
        this.f2900a = i11;
        this.f2901b = executor;
        this.f2902c = lVar;
        this.f2903d = exc;
    }
}
