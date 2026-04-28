package cy;

import android.content.ComponentName;
import android.os.RemoteException;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends u.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static oz.m f13492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static t5.a f13493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ReentrantLock f13494d = new ReentrantLock();

    @Override // u.g
    public final void a(ComponentName componentName, oz.m mVar) {
        componentName.getClass();
        try {
            ((b.b) ((b.d) mVar.f33836b)).C();
        } catch (RemoteException unused) {
        }
        f13492b = mVar;
        android.support.v4.media.session.a.G();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        componentName.getClass();
    }
}
