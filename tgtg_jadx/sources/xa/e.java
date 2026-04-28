package xa;

import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import com.braze.support.WebContentUtils;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f44213c;

    public e(String str, d dVar) {
        if (str.isEmpty() || str.charAt(0) != '/') {
            i4.a.f("Path should start with a slash '/'.");
            throw null;
        }
        if (!str.endsWith(ExpiryDateInput.SEPARATOR)) {
            i4.a.f("Path should end with a slash '/'");
            throw null;
        }
        this.f44211a = WebContentUtils.ASSET_LOADER_DUMMY_DOMAIN;
        this.f44212b = str;
        this.f44213c = dVar;
    }
}
