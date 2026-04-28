package xa;

import android.os.Build;
import android.util.Log;
import android.webkit.WebSettings;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import ya.h;
import ya.l;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static x0.e a(WebSettings webSettings) {
        try {
            return new x0.e((WebSettingsBoundaryInterface) na0.a.W(WebSettingsBoundaryInterface.class, l.f45800a.f45802a.convertSettings(webSettings)), 6);
        } catch (ClassCastException e5) {
            if (Build.VERSION.SDK_INT != 30 || !"android.webkit.WebSettingsWrapper".equals(webSettings.getClass().getCanonicalName())) {
                throw e5;
            }
            Log.e("WebSettingsCompat", "Error converting WebSettings to Chrome implementation. All AndroidX method calls on this WebSettings instance will be no-op calls. See https://crbug.com/388824130 for more info.", e5);
            return new h(null, 6);
        }
    }
}
