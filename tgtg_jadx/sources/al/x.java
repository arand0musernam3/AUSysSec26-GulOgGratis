package al;

import android.net.Uri;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class x implements DeepLinkListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f1597a;

    public x(c0 c0Var) {
        this.f1597a = c0Var;
    }

    @Override // com.appsflyer.deeplink.DeepLinkListener
    public final void onDeepLinking(DeepLinkResult deepLinkResult) {
        deepLinkResult.getClass();
        if (w.$EnumSwitchMapping$0[deepLinkResult.getStatus().ordinal()] != 1) {
            sa0.a.f38953a.f("OneLink DeepLink not found", new Object[0]);
            return;
        }
        String deepLinkValue = deepLinkResult.getDeepLink().getDeepLinkValue();
        if (deepLinkValue != null) {
            qj.m mVarA = qj.d.a(Uri.parse(deepLinkValue));
            boolean z11 = mVarA instanceof qj.q;
            c0 c0Var = this.f1597a;
            if (!z11) {
                c0Var.f1532m = mVarA;
                return;
            }
            ft.c.M(((qj.q) mVarA).f37132a);
            cv.i iVar = cv.i.ACTION_INSTALL_APP_C2C;
            iVar.getClass();
            c0Var.f1525e.c(iVar, null);
        }
    }
}
