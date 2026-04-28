package androidx.credentials.playservices;

import androidx.credentials.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController;
import androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Executor f2916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n7.l f2917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f2918d;

    public /* synthetic */ k(Executor executor, n7.l lVar, Ref.ObjectRef objectRef, int i11) {
        this.f2915a = i11;
        this.f2916b = executor;
        this.f2917c = lVar;
        this.f2918d = objectRef;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f2915a) {
            case 0:
                return CredentialProviderPlayServicesImpl.onClearCredential$lambda$14$lambda$13(this.f2916b, this.f2917c, this.f2918d);
            case 1:
                return CredentialProviderCreateRestoreCredentialController.invokePlayServices$lambda$8$lambda$7(this.f2916b, this.f2917c, this.f2918d);
            default:
                return CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$8$lambda$7(this.f2916b, this.f2917c, this.f2918d);
        }
    }
}
