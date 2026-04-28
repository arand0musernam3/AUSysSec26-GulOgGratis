package ll;

import com.app.tgtg.feature.login.optin.OptInActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OptInActivity f27891b;

    public /* synthetic */ c(OptInActivity optInActivity, int i11) {
        this.f27890a = i11;
        this.f27891b = optInActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f27890a) {
            case 0:
                return this.f27891b.getDefaultViewModelProviderFactory();
            case 1:
                return this.f27891b.getViewModelStore();
            default:
                return this.f27891b.getDefaultViewModelCreationExtras();
        }
    }
}
