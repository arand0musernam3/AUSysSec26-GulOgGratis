package androidx.credentials.playservices;

import androidx.credentials.playservices.controllers.ResponseUtils;
import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Executor f2809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n7.l f2810c;

    public /* synthetic */ a(Executor executor, n7.l lVar, int i11) {
        this.f2808a = i11;
        this.f2809b = executor;
        this.f2810c = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f2808a) {
            case 0:
                return CredentialProviderPlayServicesImpl.onGetCredential$lambda$1(this.f2809b, this.f2810c);
            case 1:
                return CredentialProviderPlayServicesImpl.onClearCredential$lambda$17$lambda$16(this.f2809b, this.f2810c);
            case 2:
                return CredentialProviderPlayServicesImpl.onGetCredential$lambda$3(this.f2809b, this.f2810c);
            case 3:
                return CredentialProviderPlayServicesImpl.onClearCredential$lambda$10$lambda$9(this.f2809b, this.f2810c);
            case 4:
                return CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$22$lambda$21(this.f2809b, this.f2810c);
            case 5:
                return CredentialProviderPlayServicesImpl.onClearCredential$lambda$7(this.f2809b, this.f2810c);
            case 6:
                return CreatePublicKeyCredentialController.invokePlayServices$lambda$8$lambda$7(this.f2809b, this.f2810c);
            case 7:
                return CreatePublicKeyCredentialController.invokePlayServices$lambda$8$lambda$1(this.f2809b, this.f2810c);
            case 8:
                return GetCredentialController.invokePlayServices$lambda$2$lambda$1(this.f2809b, this.f2810c);
            default:
                return ResponseUtils.Companion.handleGetCredentialResponse$lambda$4(this.f2809b, this.f2810c);
        }
    }
}
