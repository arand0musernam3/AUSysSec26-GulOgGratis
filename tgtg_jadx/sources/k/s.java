package k;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, androidx.appcompat.app.a aVar) {
        Objects.requireNonNull(aVar);
        d6.v vVar = new d6.v(aVar, 2);
        j4.d.c(obj).registerOnBackInvokedCallback(1000000, vVar);
        return vVar;
    }

    public static void c(Object obj, Object obj2) {
        j4.d.c(obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
