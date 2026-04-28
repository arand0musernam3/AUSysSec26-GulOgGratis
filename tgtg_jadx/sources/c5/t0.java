package c5;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Configuration f7380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h5.c f7381b;

    public t0(Configuration configuration, h5.c cVar) {
        this.f7380a = configuration;
        this.f7381b = cVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.f7380a;
        int iUpdateFrom = configuration2.updateFrom(configuration);
        Iterator it = this.f7381b.f21417a.entrySet().iterator();
        while (it.hasNext()) {
            h5.a aVar = (h5.a) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (aVar == null || Configuration.needNewResources(iUpdateFrom, aVar.f21414b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f7381b.f21417a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i11) {
        this.f7381b.f21417a.clear();
    }
}
