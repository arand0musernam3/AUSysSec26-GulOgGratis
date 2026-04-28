package nb;

import mn.g;
import y80.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ob.e f30799a;

    public b(ob.e eVar) {
        eVar.getClass();
        this.f30799a = eVar;
    }

    @Override // nb.d
    public final y80.c b(ib.e eVar) {
        eVar.getClass();
        return r.f(new g(this, null, 4));
    }

    public abstract int c();

    public abstract boolean d(Object obj);
}
