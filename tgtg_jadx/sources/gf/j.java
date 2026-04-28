package gf;

import aa.l0;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import dn.k;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements qf.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qf.c f20430a = qf.c.Before;

    @Override // qf.d
    public final void a(ye.b bVar) {
        bVar.getClass();
        bVar.f().b("Installing AndroidNetworkConnectivityPlugin, offline feature should be supported.");
        Context context = bVar.f45852a.f45887b;
        f0.B(bVar.f45854c, bVar.f45857f, null, new l0(bVar, new k(context, bVar.f()), (x70.c) null, 24), 2);
        a50.c cVar = new a50.c(bVar, 21);
        kf.b bVarF = bVar.f();
        jd.f fVar = new jd.f(context, bVarF, cVar);
        context.getClass();
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
            bVarF.b("ACCESS_NETWORK_STATE permission not granted, skipping network listener setup");
            return;
        }
        try {
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), new jf.d(connectivityManager, fVar));
        } catch (Throwable th2) {
            bVarF.d("Error starting network listener: " + th2.getMessage());
        }
    }

    @Override // qf.d
    public final qf.c getType() {
        return this.f20430a;
    }
}
