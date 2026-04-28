package c4;

import android.view.View;
import android.view.autofill.AutofillManager;
import android.webkit.SafeBrowsingResponse;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static void a(View view, AutofillManager autofillManager, int i11, boolean z11) {
        autofillManager.notifyViewVisibilityChanged(view, i11, z11);
    }

    public static void b(SafeBrowsingResponse safeBrowsingResponse) {
        safeBrowsingResponse.showInterstitial(true);
    }
}
