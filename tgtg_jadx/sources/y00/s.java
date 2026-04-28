package y00;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f45125a;

    public s(t tVar) {
        this.f45125a = tVar.f45137a.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f45125a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f45125a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
