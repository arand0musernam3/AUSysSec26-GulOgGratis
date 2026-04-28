package r7;

import androidx.credentials.playservices.controllers.ResponseUtils;
import androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;
import n7.l;
import n7.t;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Executor f37750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f37751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f37752d;

    public /* synthetic */ c(Executor executor, l lVar, t tVar, int i11) {
        this.f37749a = i11;
        this.f37750b = executor;
        this.f37751c = lVar;
        this.f37752d = tVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f37749a) {
            case 0:
                return ResponseUtils.Companion.handleGetCredentialResponse$lambda$6(this.f37750b, this.f37751c, this.f37752d);
            default:
                return CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$4$lambda$1(this.f37750b, this.f37751c, this.f37752d);
        }
    }
}
