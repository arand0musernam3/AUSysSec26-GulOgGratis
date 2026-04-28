package j00;

import bx.o;
import java.util.ListIterator;
import m0.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends g implements ListIterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f24351d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, int i11) {
        super(0);
        int size = eVar.size();
        if (i11 < 0 || i11 > size) {
            org.bouncycastle.jce.provider.a.v(o.V(i11, size, "index"));
            throw null;
        }
        this.f24349b = size;
        this.f24350c = i11;
        this.f24351d = eVar;
    }

    public final Object a(int i11) {
        return this.f24351d.get(i11);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f24350c < this.f24349b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f24350c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            i1.c();
            return null;
        }
        int i11 = this.f24350c;
        this.f24350c = i11 + 1;
        return a(i11);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f24350c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            i1.c();
            return null;
        }
        int i11 = this.f24350c - 1;
        this.f24350c = i11;
        return a(i11);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f24350c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
