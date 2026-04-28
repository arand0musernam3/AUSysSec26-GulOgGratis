package u;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.braze.h2;
import oz.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f40618a;

    public abstract void a(ComponentName componentName, m mVar);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b.d dVar;
        if (this.f40618a == null) {
            h2.b("Custom Tabs Service connected before an applicationcontext has been provided.");
            return;
        }
        int i11 = b.c.f5035g;
        if (iBinder == null) {
            dVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b.d.f5036b);
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b.d)) {
                b.b bVar = new b.b();
                bVar.f5034g = iBinder;
                dVar = bVar;
            } else {
                dVar = (b.d) iInterfaceQueryLocalInterface;
            }
        }
        a(componentName, new m(28, dVar, componentName));
    }
}
