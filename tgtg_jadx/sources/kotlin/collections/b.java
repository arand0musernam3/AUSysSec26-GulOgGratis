package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements Iterator, KMappedMarker {

    @Nullable
    private Object nextValue;
    private int state;

    public abstract void computeNext();

    public final void done() {
        this.state = 2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i11 = this.state;
        if (i11 == 0) {
            this.state = 3;
            computeNext();
            return this.state == 1;
        }
        if (i11 == 1) {
            return true;
        }
        if (i11 == 2) {
            return false;
        }
        i4.a.f("hasNext called when the iterator is in the FAILED state.");
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        int i11 = this.state;
        if (i11 == 1) {
            this.state = 0;
            return this.nextValue;
        }
        if (i11 != 2) {
            this.state = 3;
            computeNext();
            if (this.state == 1) {
                this.state = 0;
                return this.nextValue;
            }
        }
        m0.i1.c();
        return null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setNext(Object obj) {
        this.nextValue = obj;
        this.state = 1;
    }
}
