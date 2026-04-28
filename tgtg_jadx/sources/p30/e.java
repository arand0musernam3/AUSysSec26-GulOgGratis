package p30;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements qz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference f34218a = new AtomicReference();

    @Override // qz.b
    public final void a(boolean z11) {
        synchronized (g.f34221k) {
            try {
                for (g gVar : new ArrayList(g.l.values())) {
                    if (gVar.f34226e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = gVar.f34230i.iterator();
                        while (it.hasNext()) {
                            g gVar2 = ((d) it.next()).f34217a;
                            if (!z11) {
                                ((r40.c) gVar2.f34229h.get()).b();
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
