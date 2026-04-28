package ne;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f30817d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f30818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f30820c;

    public a(Drawable.Callback callback, String str, Map map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f30819b = str;
        } else {
            this.f30819b = str.concat(ExpiryDateInput.SEPARATOR);
        }
        this.f30820c = map;
        if (callback instanceof View) {
            this.f30818a = ((View) callback).getContext().getApplicationContext();
        } else {
            this.f30818a = null;
        }
    }
}
