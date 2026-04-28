package mb;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import ib.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f29914a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f29915b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f29916c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static NetworkCapabilities f29917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f29918e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Boolean f29919f;

    public static boolean a(NetworkRequest networkRequest, NetworkCapabilities networkCapabilities) {
        Boolean bool = f29919f;
        bool.getClass();
        return !bool.booleanValue() && networkRequest.canBeSatisfiedBy(networkCapabilities);
    }

    public static void b() {
        ArrayList<Pair> arrayList = new ArrayList();
        synchronized (f29915b) {
            try {
                if (f29918e && f29919f != null) {
                    for (Map.Entry entry : f29916c.entrySet()) {
                        Function1 function1 = (Function1) entry.getKey();
                        NetworkRequest networkRequest = (NetworkRequest) entry.getValue();
                        h hVar = f29914a;
                        NetworkCapabilities networkCapabilities = f29917d;
                        hVar.getClass();
                        arrayList.add(new Pair(function1, a(networkRequest, networkCapabilities) ? a.f29903a : new b(7)));
                    }
                    for (Pair pair : arrayList) {
                        ((Function1) pair.f26485a).invoke((c) pair.f26486b);
                    }
                    return;
                }
                w.d().a(i.f29920a, "Not dispatching constraint state yet: isBlocked=" + f29919f + ", capabilitiesInitialized=" + f29918e);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z11) {
        network.getClass();
        w.d().a(i.f29920a, "NetworkRequestConstraintController onBlockedStatusChanged callback " + z11);
        synchronized (f29915b) {
            if (Intrinsics.areEqual(f29919f, Boolean.valueOf(z11))) {
                return;
            }
            f29919f = Boolean.valueOf(z11);
            b();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        w.d().a(i.f29920a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (f29915b) {
            f29917d = networkCapabilities;
            f29918e = true;
        }
        b();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        w.d().a(i.f29920a, "NetworkRequestConstraintController onLost callback");
        synchronized (f29915b) {
            f29917d = null;
            Iterator it = f29916c.keySet().iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(new b(7));
            }
        }
    }
}
