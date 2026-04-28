package k30;

import java.util.ListIterator;
import m0.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s implements ListIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f25921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ListIterator f25922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f25923c;

    public s(t tVar, ListIterator listIterator) {
        this.f25922b = listIterator;
        this.f25923c = tVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        ListIterator listIterator = this.f25922b;
        listIterator.add(obj);
        listIterator.previous();
        this.f25921a = false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f25922b.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f25922b.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        ListIterator listIterator = this.f25922b;
        if (listIterator.hasPrevious()) {
            this.f25921a = true;
            return listIterator.previous();
        }
        i1.c();
        return null;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f25923c.b(this.f25922b.nextIndex());
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        ListIterator listIterator = this.f25922b;
        if (listIterator.hasNext()) {
            this.f25921a = true;
            return listIterator.next();
        }
        i1.c();
        return null;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return nextIndex() - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        na0.a.e0("no calls to next() since the last call to remove()", this.f25921a);
        this.f25922b.remove();
        this.f25921a = false;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        if (this.f25921a) {
            this.f25922b.set(obj);
        } else {
            qc.y.e();
        }
    }
}
