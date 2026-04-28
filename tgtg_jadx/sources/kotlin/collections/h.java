package kotlin.collections;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements Iterator, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f26511b;

    public h(p4.g0 g0Var) {
        this.f26510a = 2;
        this.f26511b = g0Var.f34329j.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f26510a) {
        }
        return this.f26511b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f26510a) {
            case 0:
                return ((Map.Entry) this.f26511b.next()).getKey();
            case 1:
                return ((Map.Entry) this.f26511b.next()).getValue();
            default:
                return (p4.i0) this.f26511b.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f26510a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ h(Iterator it, int i11) {
        this.f26510a = i11;
        this.f26511b = it;
    }
}
