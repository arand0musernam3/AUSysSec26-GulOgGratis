package ll;

import android.os.Build;
import ao.g3;
import at.c0;
import com.app.tgtg.R;
import com.app.tgtg.feature.login.optin.OptInActivity;
import f70.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OptInActivity f27889b;

    public /* synthetic */ b(OptInActivity optInActivity, int i11) {
        this.f27888a = i11;
        this.f27889b = optInActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i11 = this.f27888a;
        OptInActivity optInActivity = this.f27889b;
        switch (i11) {
            case 0:
                int i12 = OptInActivity.f9058k;
                optInActivity.a0().f27894c.f16080a.a(k.f17493a);
                break;
            case 1:
                int i13 = OptInActivity.f9058k;
                g gVarA0 = optInActivity.a0();
                boolean zAreEqual = Intrinsics.areEqual(gVarA0.f27898g, "newsletter");
                g3 g3Var = gVarA0.f27892a;
                if (zAreEqual) {
                    g3Var.m().setWantsNewsletter(true);
                    ft.c.W(System.currentTimeMillis());
                    gVarA0.e(Boolean.TRUE, null);
                    gVarA0.b();
                } else {
                    g3Var.m().setWantsPushNotifications(true);
                    ft.c.b0(System.currentTimeMillis());
                    Boolean bool = Boolean.TRUE;
                    gVarA0.e(null, bool);
                    if (gVarA0.f27902k || Build.VERSION.SDK_INT < 33) {
                        gVarA0.b();
                    } else {
                        gVarA0.f27900i = true;
                        gVarA0.f27897f.k(bool);
                    }
                }
                break;
            case 2:
                int i14 = OptInActivity.f9058k;
                optInActivity.a0().d();
                break;
            default:
                int i15 = OptInActivity.f9058k;
                g gVarA02 = optInActivity.a0();
                String privacyUrl = optInActivity.a0().f27892a.n().getPrivacyUrl();
                if (privacyUrl == null) {
                    privacyUrl = "https://www.toogoodtogo.com";
                }
                String strConcat = privacyUrl.concat("?webview=1");
                ct.a aVar = ct.a.PRIVACY;
                gVarA02.getClass();
                aVar.getClass();
                c0.c(gVarA02.f27895d, strConcat, aVar, Integer.valueOf(R.string.webview_privacy_title), false, 24);
                break;
        }
        return Unit.f26487a;
    }
}
