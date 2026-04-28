package o70;

import android.os.Looper;
import com.braze.h2;
import java.util.HashSet;
import java.util.Iterator;
import v0.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f32048a = new HashSet();

    public final void a() {
        if (n.f41633d == null) {
            n.f41633d = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() != n.f41633d) {
            h2.b("Must be called on the Main thread.");
            return;
        }
        Iterator it = this.f32048a.iterator();
        if (it.hasNext()) {
            throw e0.f.e(it);
        }
    }
}
