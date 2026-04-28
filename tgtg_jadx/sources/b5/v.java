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
public final class v implements List, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1.o0 f6004a = new q1.o0(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1.j0 f6005b = new q1.j0(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6006c = -1;

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

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        org.bouncycastle.jce.provider.a.v("Index must be between 0 and size");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b() {
        /*
            r7 = this;
            r0 = 2139095040(0x7f800000, float:Infinity)
            r1 = 0
            long r0 = b5.o.a(r0, r1, r1)
            int r2 = r7.f6006c
            int r2 = r2 + 1
            q1.o0 r3 = r7.f6004a
            int r3 = r3.f35722b
            int r3 = r3 + (-1)
            if (r2 > r3) goto L46
        L13:
            q1.j0 r4 = r7.f6005b
            if (r2 < 0) goto L3c
            int r5 = r4.f35832b
            if (r2 >= r5) goto L3f
            long[] r4 = r4.f35831a
            r5 = r4[r2]
            int r4 = b5.o.d(r5, r0)
            if (r4 >= 0) goto L26
            r0 = r5
        L26:
            float r4 = b5.o.g(r0)
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L36
            boolean r4 = b5.o.j(r0)
            if (r4 == 0) goto L36
            goto L3b
        L36:
            if (r2 == r3) goto L3b
            int r2 = r2 + 1
            goto L13
        L3b:
            return r0
        L3c:
            r4.getClass()
        L3f:
            java.lang.String r0 = "Index must be between 0 and size"
            org.bouncycastle.jce.provider.a.v(r0)
            r0 = 0
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.v.b():long");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f6006c = -1;
        this.f6004a.j();
        this.f6005b.f35832b = 0;
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

    public final void d(int i11, int i12) {
        if (i11 >= i12) {
            return;
        }
        this.f6004a.m(i11, i12);
        q1.j0 j0Var = this.f6005b;
        if (i11 >= 0) {
            int i13 = j0Var.f35832b;
            if (i11 <= i13 && i12 >= 0 && i12 <= i13) {
                if (i12 < i11) {
                    i4.a.f("The end index must be < start index");
                    return;
                } else {
                    if (i12 != i11) {
                        if (i12 < i13) {
                            long[] jArr = j0Var.f35831a;
                            kotlin.collections.x.g(i11, jArr, i12, jArr, i13);
                        }
                        j0Var.f35832b -= i12 - i11;
                        return;
                    }
                    return;
                }
            }
        } else {
            j0Var.getClass();
        }
        org.bouncycastle.jce.provider.a.v("Index must be between 0 and size");
    }

    @Override // java.util.List
    public final Object get(int i11) {
        Object objB = this.f6004a.b(i11);
        objB.getClass();
        return (b4.s) objB;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof b4.s)) {
            return -1;
        }
        b4.s sVar = (b4.s) obj;
        int size = size() - 1;
        if (size >= 0) {
            int i11 = 0;
            while (!Intrinsics.areEqual(this.f6004a.b(i11), sVar)) {
                if (i11 != size) {
                    i11++;
                }
            }
            return i11;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f6004a.d();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new t(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof b4.s)) {
            return -1;
        }
        b4.s sVar = (b4.s) obj;
        for (int size = size() - 1; -1 < size; size--) {
            if (Intrinsics.areEqual(this.f6004a.b(size), sVar)) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new t(this, 0, 7);
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
        return this.f6004a.f35722b;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i11, int i12) {
        return new u(this, i11, i12);
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

    @Override // java.util.List
    public final ListIterator listIterator(int i11) {
        return new t(this, i11, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
