package mb;

import android.net.ConnectivityManager;
import h2.a0;
import ib.x;
import qb.o;
import y80.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements nb.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConnectivityManager f29908a;

    public e(ConnectivityManager connectivityManager) {
        connectivityManager.getClass();
        this.f29908a = connectivityManager;
    }

    @Override // nb.d
    public final boolean a(o oVar) {
        return (oVar.f36837j.a() == null && oVar.f36837j.f23711a == x.NOT_REQUIRED) ? false : true;
    }

    @Override // nb.d
    public final y80.c b(ib.e eVar) {
        eVar.getClass();
        return r.f(new a0(eVar, this, (x70.c) null, 22));
    }
}
