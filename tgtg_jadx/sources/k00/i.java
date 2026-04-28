package k00;

import java.util.ListIterator;
import m0.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends b0 implements ListIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f25656c;

    public i(l lVar, int i11) {
        int size = lVar.size();
        if (i11 < 0 || i11 > size) {
            org.bouncycastle.jce.provider.a.v(a.n(i11, size, "index"));
            throw null;
        }
        this.f25654a = size;
        this.f25655b = i11;
        this.f25656c = lVar;
    }

    public final Object a(int i11) {
        return this.f25656c.get(i11);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f25655b < this.f25654a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f25655b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            i1.c();
            return null;
        }
        int i11 = this.f25655b;
        this.f25655b = i11 + 1;
        return a(i11);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f25655b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            i1.c();
            return null;
        }
        int i11 = this.f25655b - 1;
        this.f25655b = i11;
        return a(i11);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f25655b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
