package px;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CountDownLatch f35634a = new CountDownLatch(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IBinder f35635b;

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        componentName.getClass();
        this.f35634a.countDown();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        componentName.getClass();
        iBinder.getClass();
        this.f35635b = iBinder;
        this.f35634a.countDown();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        componentName.getClass();
    }
}
