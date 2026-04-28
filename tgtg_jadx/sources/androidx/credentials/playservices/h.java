package androidx.credentials.playservices;

import androidx.credentials.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController;
import androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n7.l f2905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f2906c;

    public /* synthetic */ h(n7.l lVar, Ref.ObjectRef objectRef, int i11) {
        this.f2904a = i11;
        this.f2905b = lVar;
        this.f2906c = objectRef;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2904a) {
            case 0:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$14$lambda$13$lambda$12(this.f2905b, this.f2906c);
                break;
            case 1:
                CredentialProviderCreateRestoreCredentialController.invokePlayServices$lambda$8$lambda$7$lambda$6(this.f2905b, this.f2906c);
                break;
            default:
                CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$8$lambda$7$lambda$6(this.f2905b, this.f2906c);
                break;
        }
    }
}
