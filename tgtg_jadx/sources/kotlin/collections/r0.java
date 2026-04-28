package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class r0 implements Iterator, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26535a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f26536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26537c;

    public r0(o80.b bVar) {
        this.f26536b = bVar.f32104a.iterator();
        this.f26537c = bVar.f32105b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f26535a) {
            case 0:
                return this.f26536b.hasNext();
        }
        while (true) {
            int i11 = this.f26537c;
            it = this.f26536b;
            if (i11 > 0 && it.hasNext()) {
                it.next();
                this.f26537c--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f26535a) {
            case 0:
                int i11 = this.f26537c;
                this.f26537c = i11 + 1;
                if (i11 >= 0) {
                    return new IndexedValue(i11, this.f26536b.next());
                }
                d0.n();
                throw null;
        }
        while (true) {
            int i12 = this.f26537c;
            it = this.f26536b;
            if (i12 > 0 && it.hasNext()) {
                it.next();
                this.f26537c--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f26535a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public r0(Iterator it) {
        it.getClass();
        this.f26536b = it;
    }
}
