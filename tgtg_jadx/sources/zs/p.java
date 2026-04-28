package zs;

import android.app.Activity;
import android.webkit.JavascriptInterface;
import androidx.fragment.app.o0;
import com.app.tgtg.feature.tabprofile.storelogin.ui.StoreLoginActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f48105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zendesk.ui.android.conversation.textcell.c f48106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yl.e f48107c;

    public p(o0 o0Var, zendesk.ui.android.conversation.textcell.c cVar, yl.e eVar) {
        o0Var.getClass();
        this.f48105a = o0Var;
        this.f48106b = cVar;
        this.f48107c = eVar;
    }

    @JavascriptInterface
    public final void onboarding(@NotNull String str) {
        str.getClass();
        if (!Intrinsics.areEqual(str, "ONBOARDING_COMPLETED")) {
            Intrinsics.areEqual(str, "ONBOARDING_FAILED");
            return;
        }
        Activity activity = this.f48105a;
        activity.getClass();
        ft.c.J(!ft.c.C());
        ((StoreLoginActivity) activity).setResult(-1);
        this.f48106b.invoke();
    }

    @JavascriptInterface
    public final void requestDirectAppLoginToken(@NotNull String str) {
        str.getClass();
        if (Intrinsics.areEqual(str, "REQUEST_DIRECT_APP_LOGIN_TOKEN")) {
            this.f48107c.invoke();
        }
    }
}
