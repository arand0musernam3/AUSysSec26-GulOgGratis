package androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential;

import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.playservices.controllers.ResponseUtils;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;
import n7.l;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Executor f2883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f2884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ GetCredentialException f2885d;

    public /* synthetic */ b(Executor executor, l lVar, GetCredentialException getCredentialException, int i11) {
        this.f2882a = i11;
        this.f2883b = executor;
        this.f2884c = lVar;
        this.f2885d = getCredentialException;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f2882a) {
            case 0:
                return CredentialProviderGetDigitalCredentialController.invokePlayServices$lambda$4$lambda$3(this.f2883b, this.f2884c, this.f2885d);
            default:
                return ResponseUtils.Companion.handleGetCredentialResponse$lambda$8(this.f2883b, this.f2884c, this.f2885d);
        }
    }
}
