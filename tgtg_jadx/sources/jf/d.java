package jf;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import ax.f0;
import jd.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f0 f25133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConnectivityManager f25134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f25135c;

    public d(ConnectivityManager connectivityManager, f fVar) {
        this.f25134b = connectivityManager;
        this.f25135c = fVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        network.getClass();
        NetworkCapabilities networkCapabilities = this.f25134b.getNetworkCapabilities(network);
        a50.c cVar = (a50.c) this.f25135c.f24983b;
        boolean z11 = true;
        if (networkCapabilities != null) {
            boolean zHasCapability = networkCapabilities.hasCapability(16);
            if (!networkCapabilities.hasCapability(12) || !zHasCapability) {
                z11 = false;
            }
        }
        network.getClass();
        f0 f0Var = new f0();
        f0Var.f4906c = network;
        f0Var.f4907d = cVar;
        f0Var.f4904a = z11;
        f0Var.f4905b = false;
        f0Var.e();
        this.f25133a = f0Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z11) {
        network.getClass();
        f0 f0Var = this.f25133a;
        if (f0Var != null) {
            f0.g(f0Var, network, false, z11, 2);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        f0 f0Var = this.f25133a;
        if (f0Var != null) {
            f0.g(f0Var, network, networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16), false, 4);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        f0 f0Var = this.f25133a;
        if (f0Var != null) {
            f0.g(f0Var, network, false, false, 4);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        ye.b bVar = (ye.b) ((a50.c) this.f25135c.f24983b).f822b;
        bVar.f().b("AndroidNetworkListener, onNetworkUnavailable.");
        bVar.f45852a.f45901q = Boolean.TRUE;
    }
}
