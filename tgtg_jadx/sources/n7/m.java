package n7;

import android.os.Bundle;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f30676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f30677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f30678c;

    public m(Bundle bundle, Bundle bundle2, Set set) {
        set.getClass();
        this.f30676a = bundle;
        this.f30677b = bundle2;
        this.f30678c = set;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", true);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", true);
        bundle.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 2000);
        bundle2.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 2000);
    }
}
