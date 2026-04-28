package u;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import oz.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f40617b;

    public b(Context context) {
        this.f40617b = context;
    }

    @Override // u.g
    public final void a(ComponentName componentName, m mVar) {
        try {
            ((b.b) ((b.d) mVar.f33836b)).C();
        } catch (RemoteException unused) {
        }
        this.f40617b.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
