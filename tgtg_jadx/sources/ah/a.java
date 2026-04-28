package ah;

import com.app.tgtg.feature.authentication.ui.AuthenticationActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AuthenticationActivity f1454b;

    public /* synthetic */ a(AuthenticationActivity authenticationActivity, int i11) {
        this.f1453a = i11;
        this.f1454b = authenticationActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f1453a) {
            case 0:
                return this.f1454b.getDefaultViewModelProviderFactory();
            case 1:
                return this.f1454b.getViewModelStore();
            default:
                return this.f1454b.getDefaultViewModelCreationExtras();
        }
    }
}
