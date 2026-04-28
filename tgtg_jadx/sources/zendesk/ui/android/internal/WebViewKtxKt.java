package zendesk.ui.android.internal;

import android.webkit.WebSettings;
import android.webkit.WebView;
import kotlin.Metadata;
import o30.f0;
import org.jetbrains.annotations.NotNull;
import xa.c;
import ya.b;
import ya.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"setupContentTheming", "", "Landroid/webkit/WebView;", "zendesk.ui_ui-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class WebViewKtxKt {
    public static final void setupContentTheming(@NotNull WebView webView) {
        webView.getClass();
        if ((webView.getResources().getConfiguration().uiMode & 48) == 32) {
            if (f0.F("ALGORITHMIC_DARKENING")) {
                WebSettings settings = webView.getSettings();
                if (!k.f45796d.b()) {
                    throw k.a();
                }
                c.a(settings).d();
                return;
            }
            if (f0.F("FORCE_DARK")) {
                WebSettings settings2 = webView.getSettings();
                b bVar = k.f45798f;
                if (bVar.a()) {
                    b6.a.v(settings2);
                } else {
                    if (!bVar.b()) {
                        throw k.a();
                    }
                    c.a(settings2).e();
                }
            }
        }
    }
}
