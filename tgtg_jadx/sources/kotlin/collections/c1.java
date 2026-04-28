package kotlin.collections;

import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class c1 implements ListIterator, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ListIterator f26493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1 f26494b;

    public c1(d1 d1Var, int i11) {
        this.f26494b = d1Var;
        this.f26493a = ((List) d1Var.f26497c).listIterator(j0.A(i11, d1Var));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f26493a.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f26493a.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f26493a.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return (this.f26494b.size() - 1) - this.f26493a.previousIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f26493a.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return (this.f26494b.size() - 1) - this.f26493a.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
