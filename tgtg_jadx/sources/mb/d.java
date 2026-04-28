package mb;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import ib.w;
import kotlin.jvm.internal.Intrinsics;
import m2.c2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f29905c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f29907b;

    public d(c2 c2Var) {
        this.f29906a = 0;
        this.f29907b = c2Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.f29906a) {
            case 2:
                t5.a.d((t5.a) this.f29907b, network, true);
                break;
            default:
                super.onAvailable(network);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onBlockedStatusChanged(Network network, boolean z11) {
        switch (this.f29906a) {
            case 1:
                network.getClass();
                if (Intrinsics.areEqual(network, ((ob.h) this.f29907b).f32420f.getActiveNetwork())) {
                    w.d().a(ob.g.f32419a, "Network blocked status changed: " + z11);
                    ob.h hVar = (ob.h) this.f29907b;
                    Object objA = hVar.f32417e;
                    if (objA == null) {
                        objA = hVar.a();
                    }
                    f fVar = (f) objA;
                    ob.h hVar2 = (ob.h) this.f29907b;
                    synchronized (hVar2.f32421g) {
                        if (hVar2.f32422h == z11) {
                            return;
                        }
                        hVar2.f32422h = z11;
                        ((ob.h) this.f29907b).b(new f(fVar.f29909a, fVar.f29910b, fVar.f29911c, fVar.f29912d, z11));
                        return;
                    }
                }
                return;
            default:
                super.onBlockedStatusChanged(network, z11);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.f29906a) {
            case 0:
                network.getClass();
                networkCapabilities.getClass();
                w.d().a(i.f29920a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
                ((c2) this.f29907b).invoke(a.f29903a);
                break;
            case 1:
                network.getClass();
                networkCapabilities.getClass();
                w.d().a(ob.g.f32419a, "Network capabilities changed: " + networkCapabilities);
                ob.h hVar = (ob.h) this.f29907b;
                hVar.b(ob.g.a(hVar.f32420f, hVar.f32422h));
                break;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.f29906a) {
            case 0:
                network.getClass();
                w.d().a(i.f29920a, "NetworkRequestConstraintController onLost callback");
                ((c2) this.f29907b).invoke(new b(7));
                break;
            case 1:
                network.getClass();
                w.d().a(ob.g.f32419a, "Network connection lost");
                ((ob.h) this.f29907b).b(new f(false, false, false, false, false));
                break;
            default:
                t5.a.d((t5.a) this.f29907b, network, false);
                break;
        }
    }

    public /* synthetic */ d(Object obj, int i11) {
        this.f29906a = i11;
        this.f29907b = obj;
    }
}
