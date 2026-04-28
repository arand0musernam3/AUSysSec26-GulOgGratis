package h7;

import androidx.core.view.MenuProvider;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f21614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f21615b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f21616c = new HashMap();

    public r(Runnable runnable) {
        this.f21614a = runnable;
    }

    public final void a(MenuProvider menuProvider) {
        this.f21615b.remove(menuProvider);
        q qVar = (q) this.f21616c.remove(menuProvider);
        if (qVar != null) {
            qVar.f21609a.d(qVar.f21610b);
            qVar.f21610b = null;
        }
        this.f21614a.run();
    }
}
