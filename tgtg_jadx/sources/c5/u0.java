package c5;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h5.d f7385a;

    public u0(h5.d dVar) {
        this.f7385a = dVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        h5.d dVar = this.f7385a;
        synchronized (dVar) {
            dVar.f21418a.c();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        h5.d dVar = this.f7385a;
        synchronized (dVar) {
            dVar.f21418a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i11) {
        h5.d dVar = this.f7385a;
        synchronized (dVar) {
            dVar.f21418a.c();
        }
    }
}
