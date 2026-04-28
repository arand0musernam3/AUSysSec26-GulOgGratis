package k30;

import java.util.ListIterator;
import m0.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends j00.g implements ListIterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f25885d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, int i11) {
        super(1);
        int size = hVar.size();
        na0.a.c0(i11, size);
        this.f25883b = size;
        this.f25884c = i11;
        this.f25885d = hVar;
    }

    public final Object a(int i11) {
        return this.f25885d.get(i11);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f25884c < this.f25883b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f25884c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            i1.c();
            return null;
        }
        int i11 = this.f25884c;
        this.f25884c = i11 + 1;
        return a(i11);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f25884c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            i1.c();
            return null;
        }
        int i11 = this.f25884c - 1;
        this.f25884c = i11;
        return a(i11);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f25884c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
