package al;

import com.app.tgtg.feature.login.LoginActivity;
import com.app.tgtg.feature.login.SplashActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SplashActivity f1588b;

    public /* synthetic */ q(SplashActivity splashActivity, int i11) {
        this.f1587a = i11;
        this.f1588b = splashActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i11 = this.f1587a;
        SplashActivity splashActivity = this.f1588b;
        switch (i11) {
            case 0:
                int i12 = SplashActivity.l;
                splashActivity.a0().f1529i.f16080a.a(LoginActivity.f9032j);
                break;
            case 1:
                int i13 = SplashActivity.l;
                splashActivity.b0();
                break;
            default:
                int i14 = SplashActivity.l;
                splashActivity.b0();
                break;
        }
        return Unit.f26487a;
    }
}
