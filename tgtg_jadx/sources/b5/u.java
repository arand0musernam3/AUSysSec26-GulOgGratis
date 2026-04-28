package b5;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements List, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f5990c;

    public u(v vVar, int i11, int i12) {
        this.f5990c = vVar;
        this.f5988a = i11;
        this.f5989b = i12;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i11, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i11, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof b4.s) && indexOf((b4.s) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((b4.s) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        Object objB = this.f5990c.f6004a.b(i11 + this.f5988a);
        objB.getClass();
        return (b4.s) objB;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof b4.s)) {
            return -1;
        }
        b4.s sVar = (b4.s) obj;
        int i11 = this.f5988a;
        int i12 = this.f5989b;
        if (i11 > i12) {
            return -1;
        }
        int i13 = i11;
        while (!Intrinsics.areEqual(this.f5990c.f6004a.b(i13), sVar)) {
            if (i13 == i12) {
                return -1;
            }
            i13++;
        }
        return i13 - i11;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i11 = this.f5988a;
        return new t(this.f5990c, i11, i11, this.f5989b);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof b4.s)) {
            return -1;
        }
        b4.s sVar = (b4.s) obj;
        int i11 = this.f5989b;
        int i12 = this.f5988a;
        if (i12 > i11) {
            return -1;
        }
        while (!Intrinsics.areEqual(this.f5990c.f6004a.b(i11), sVar)) {
            if (i11 == i12) {
                return -1;
            }
            i11--;
        }
        return i11 - i12;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i11) {
        int i12 = this.f5988a;
        int i13 = this.f5989b;
        return new t(this.f5990c, i11 + i12, i12, i13);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f5989b - this.f5988a;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i11, int i12) {
        int i13 = this.f5988a;
        return new u(this.f5990c, i11 + i13, i13 + i12);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return CollectionToArray.toArray(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        int i11 = this.f5988a;
        return new t(this.f5990c, i11, i11, this.f5989b);
    }
}
