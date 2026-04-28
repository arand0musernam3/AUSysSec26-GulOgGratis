package z3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u3.a f46996a = new u3.a(0);

    public final boolean f(int i11) {
        return (i11 & this.f46996a.get()) != 0;
    }

    public final void g(int i11) {
        u3.a aVar;
        int i12;
        do {
            aVar = this.f46996a;
            i12 = aVar.get();
            if ((i12 & i11) != 0) {
                return;
            }
        } while (!aVar.compareAndSet(i12, i12 | i11));
    }
}
