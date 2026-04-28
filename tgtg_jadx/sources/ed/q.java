package ed;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import y00.e0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f15942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f15943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public yc.e f15944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15946e = true;

    public q(pc.h hVar) {
        this.f15942a = new WeakReference(hVar);
    }

    public final synchronized void a() {
        try {
            pc.h hVar = (pc.h) this.f15942a.get();
            if (hVar == null) {
                b();
            } else if (this.f15944c == null) {
                yc.e eVarJ = hVar.f34658d.f15936b ? jf.e.j(hVar.f34655a, this, hVar.f34659e) : new e0(8);
                this.f15944c = eVarJ;
                this.f15946e = eVarJ.b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b() {
        try {
            if (this.f15945d) {
                return;
            }
            this.f15945d = true;
            Context context = this.f15943b;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            yc.e eVar = this.f15944c;
            if (eVar != null) {
                eVar.shutdown();
            }
            this.f15942a.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onConfigurationChanged(Configuration configuration) {
        if (((pc.h) this.f15942a.get()) == null) {
            b();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final synchronized void onTrimMemory(int i11) {
        try {
            pc.h hVar = (pc.h) this.f15942a.get();
            if (hVar != null) {
                o oVar = hVar.f34659e;
                if (oVar != null && oVar.getLevel() <= 2) {
                    oVar.log("NetworkObserver", 2, "trimMemory, level=" + i11, null);
                }
                xc.d dVar = (xc.d) hVar.f34657c.getValue();
                if (dVar != null) {
                    xc.e eVar = (xc.e) dVar;
                    eVar.f44225a.c(i11);
                    eVar.f44226b.c(i11);
                }
            } else {
                b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
