package androidx.recyclerview.widget;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g f3747h = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f3748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w2.z f3749b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f3752e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3754g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f3751d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f3753f = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f3750c = f3747h;

    public h(c cVar, w2.z zVar) {
        this.f3748a = cVar;
        this.f3749b = zVar;
    }

    public final void a(List list, Runnable runnable) {
        for (f fVar : this.f3751d) {
            ((a1) fVar).f3656a.onCurrentListChanged(list, this.f3753f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void b(List list, Runnable runnable) {
        int i11 = this.f3754g + 1;
        this.f3754g = i11;
        List list2 = this.f3752e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List list3 = this.f3753f;
        c cVar = this.f3748a;
        if (list == null) {
            int size = list2.size();
            this.f3752e = null;
            this.f3753f = Collections.EMPTY_LIST;
            cVar.c(0, size);
            a(list3, runnable);
            return;
        }
        if (list2 != null) {
            ((Executor) this.f3749b.f43083b).execute(new androidx.fragment.app.g2(this, list2, list, i11, runnable));
            return;
        }
        this.f3752e = list;
        this.f3753f = Collections.unmodifiableList(list);
        cVar.b(0, list.size());
        a(list3, runnable);
    }
}
