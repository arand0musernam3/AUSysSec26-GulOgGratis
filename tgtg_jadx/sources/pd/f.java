package pd;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f34669b;

    public f(ConnectivityManager connectivityManager) {
        this.f34669b = connectivityManager;
    }

    @Override // pd.e
    public final boolean b() {
        ConnectivityManager connectivityManager = this.f34669b;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }
}
