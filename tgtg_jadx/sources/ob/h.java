package ob;

import android.content.Context;
import android.net.ConnectivityManager;
import ib.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConnectivityManager f32420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f32421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f32422h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final mb.d f32423i;

    public h(Context context, sb.a aVar) {
        super(context, aVar);
        Object systemService = this.f32414b.getSystemService("connectivity");
        systemService.getClass();
        this.f32420f = (ConnectivityManager) systemService;
        this.f32421g = new Object();
        this.f32423i = new mb.d(this, 1);
    }

    @Override // ob.e
    public final Object a() {
        return g.a(this.f32420f, this.f32422h);
    }

    @Override // ob.e
    public final void c() {
        try {
            w.d().a(g.f32419a, "Registering network callback");
            ConnectivityManager connectivityManager = this.f32420f;
            mb.d dVar = this.f32423i;
            connectivityManager.getClass();
            dVar.getClass();
            connectivityManager.registerDefaultNetworkCallback(dVar);
        } catch (IllegalArgumentException e5) {
            w.d().c(g.f32419a, "Received exception while registering network callback", e5);
        } catch (SecurityException e11) {
            w.d().c(g.f32419a, "Received exception while registering network callback", e11);
        }
    }

    @Override // ob.e
    public final void d() {
        try {
            w.d().a(g.f32419a, "Unregistering network callback");
            this.f32420f.unregisterNetworkCallback(this.f32423i);
        } catch (IllegalArgumentException e5) {
            w.d().c(g.f32419a, "Received exception while unregistering network callback", e5);
        } catch (SecurityException e11) {
            w.d().c(g.f32419a, "Received exception while unregistering network callback", e11);
        }
    }
}
