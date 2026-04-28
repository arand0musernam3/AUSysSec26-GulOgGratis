package m1;

import android.os.Build;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Surface f28705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hi.d f28706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r80.a f28707c = w.b.p(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f28708d;

    public i(Surface surface, l1.d dVar, hi.d dVar2) {
        this.f28705a = surface;
        this.f28706b = dVar2;
        a aVar = Build.VERSION.SDK_INT >= 30 ? new a(new b70.c(1)) : new a(new f());
        ((b) aVar.f28697a).c();
        this.f28708d = aVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        ((b) this.f28708d.f28697a).close();
        r80.a aVar = this.f28707c;
        aVar.getClass();
        if (r80.a.f37778b.getAndSet(aVar, 1) == 1) {
            return;
        }
        this.f28706b.invoke();
    }

    public final void finalize() throws Exception {
        ((b) this.f28708d.f28697a).a();
        close();
    }
}
