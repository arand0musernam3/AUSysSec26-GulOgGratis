package al;

import com.app.tgtg.feature.login.SplashActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SplashActivity f1592b;

    public /* synthetic */ s(SplashActivity splashActivity, int i11) {
        this.f1591a = i11;
        this.f1592b = splashActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f1591a) {
            case 0:
                return this.f1592b.getDefaultViewModelProviderFactory();
            case 1:
                return this.f1592b.getViewModelStore();
            default:
                return this.f1592b.getDefaultViewModelCreationExtras();
        }
    }
}
