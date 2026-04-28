package m00;

import java.util.ListIterator;
import m0.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o extends j00.g implements ListIterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f28688d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, int i11) {
        super(2);
        int size = qVar.size();
        if (i11 < 0 || i11 > size) {
            org.bouncycastle.jce.provider.a.v(xz.b.Q(i11, size, "index"));
            throw null;
        }
        this.f28686b = size;
        this.f28687c = i11;
        this.f28688d = qVar;
    }

    public final Object a(int i11) {
        return this.f28688d.get(i11);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f28687c < this.f28686b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f28687c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            i1.c();
            return null;
        }
        int i11 = this.f28687c;
        this.f28687c = i11 + 1;
        return a(i11);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f28687c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            i1.c();
            return null;
        }
        int i11 = this.f28687c - 1;
        this.f28687c = i11;
        return a(i11);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f28687c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
