package v70;

import c50.w;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends kotlin.collections.m implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f42027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f42029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f42030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f42031e;

    public c(Object[] objArr, int i11, int i12, c cVar, e eVar) {
        objArr.getClass();
        eVar.getClass();
        this.f42027a = objArr;
        this.f42028b = i11;
        this.f42029c = i12;
        this.f42030d = cVar;
        this.f42031e = eVar;
        ((AbstractList) this).modCount = ((AbstractList) eVar).modCount;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f42031e.f42036c) {
            return new l(0, this);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        j();
        i();
        kotlin.collections.c cVar = kotlin.collections.f.f26505a;
        int i12 = this.f42029c;
        cVar.getClass();
        kotlin.collections.c.c(i11, i12);
        h(this.f42028b + i11, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i11, Collection collection) {
        collection.getClass();
        j();
        i();
        kotlin.collections.c cVar = kotlin.collections.f.f26505a;
        int i12 = this.f42029c;
        cVar.getClass();
        kotlin.collections.c.c(i11, i12);
        int size = collection.size();
        g(this.f42028b + i11, collection, size);
        return size > 0;
    }

    @Override // kotlin.collections.m
    public final int b() {
        i();
        return this.f42029c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        j();
        i();
        m(this.f42028b, this.f42029c);
    }

    @Override // kotlin.collections.m
    public final Object d(int i11) {
        j();
        i();
        kotlin.collections.c cVar = kotlin.collections.f.f26505a;
        int i12 = this.f42029c;
        cVar.getClass();
        kotlin.collections.c.b(i11, i12);
        return l(this.f42028b + i11);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        i();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f42027a;
            int i11 = this.f42029c;
            if (i11 == list.size()) {
                for (int i12 = 0; i12 < i11; i12++) {
                    if (Intrinsics.areEqual(objArr[this.f42028b + i12], list.get(i12))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void g(int i11, Collection collection, int i12) {
        ((AbstractList) this).modCount++;
        e eVar = this.f42031e;
        c cVar = this.f42030d;
        if (cVar != null) {
            cVar.g(i11, collection, i12);
        } else {
            e eVar2 = e.f42033e;
            eVar.g(i11, collection, i12);
        }
        this.f42027a = eVar.f42034a;
        this.f42029c += i12;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        i();
        kotlin.collections.c cVar = kotlin.collections.f.f26505a;
        int i12 = this.f42029c;
        cVar.getClass();
        kotlin.collections.c.b(i11, i12);
        return this.f42027a[this.f42028b + i11];
    }

    public final void h(int i11, Object obj) {
        ((AbstractList) this).modCount++;
        e eVar = this.f42031e;
        c cVar = this.f42030d;
        if (cVar != null) {
            cVar.h(i11, obj);
        } else {
            e eVar2 = e.f42033e;
            eVar.h(i11, obj);
        }
        this.f42027a = eVar.f42034a;
        this.f42029c++;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        i();
        Object[] objArr = this.f42027a;
        int i11 = this.f42029c;
        int iHashCode = 1;
        for (int i12 = 0; i12 < i11; i12++) {
            Object obj = objArr[this.f42028b + i12];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final void i() {
        if (((AbstractList) this.f42031e).modCount == ((AbstractList) this).modCount) {
            return;
        }
        org.bouncycastle.jce.provider.a.o();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        i();
        for (int i11 = 0; i11 < this.f42029c; i11++) {
            if (Intrinsics.areEqual(this.f42027a[this.f42028b + i11], obj)) {
                return i11;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        i();
        return this.f42029c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j() {
        if (this.f42031e.f42036c) {
            w.d();
        }
    }

    public final Object l(int i11) {
        Object objL;
        ((AbstractList) this).modCount++;
        c cVar = this.f42030d;
        if (cVar != null) {
            objL = cVar.l(i11);
        } else {
            e eVar = e.f42033e;
            objL = this.f42031e.l(i11);
        }
        this.f42029c--;
        return objL;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        i();
        for (int i11 = this.f42029c - 1; i11 >= 0; i11--) {
            if (Intrinsics.areEqual(this.f42027a[this.f42028b + i11], obj)) {
                return i11;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i11) {
        i();
        kotlin.collections.c cVar = kotlin.collections.f.f26505a;
        int i12 = this.f42029c;
        cVar.getClass();
        kotlin.collections.c.c(i11, i12);
        return new b(this, i11);
    }

    public final void m(int i11, int i12) {
        if (i12 > 0) {
            ((AbstractList) this).modCount++;
        }
        c cVar = this.f42030d;
        if (cVar != null) {
            cVar.m(i11, i12);
        } else {
            e eVar = e.f42033e;
            this.f42031e.m(i11, i12);
        }
        this.f42029c -= i12;
    }

    public final int n(int i11, int i12, Collection collection, boolean z11) {
        int iN;
        c cVar = this.f42030d;
        if (cVar != null) {
            iN = cVar.n(i11, i12, collection, z11);
        } else {
            e eVar = e.f42033e;
            iN = this.f42031e.n(i11, i12, collection, z11);
        }
        if (iN > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f42029c -= iN;
        return iN;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        j();
        i();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            d(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        j();
        i();
        return n(this.f42028b, this.f42029c, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        j();
        i();
        return n(this.f42028b, this.f42029c, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        j();
        i();
        kotlin.collections.c cVar = kotlin.collections.f.f26505a;
        int i12 = this.f42029c;
        cVar.getClass();
        kotlin.collections.c.b(i11, i12);
        Object[] objArr = this.f42027a;
        int i13 = this.f42028b + i11;
        Object obj2 = objArr[i13];
        objArr[i13] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i11, int i12) {
        kotlin.collections.c cVar = kotlin.collections.f.f26505a;
        int i13 = this.f42029c;
        cVar.getClass();
        kotlin.collections.c.d(i11, i12, i13);
        return new c(this.f42027a, this.f42028b + i11, i12 - i11, this, this.f42031e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        i();
        int length = objArr.length;
        int i11 = this.f42029c;
        Object[] objArr2 = this.f42027a;
        int i12 = this.f42028b;
        if (length < i11) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i12, i11 + i12, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        x.d(0, i12, i11 + i12, objArr2, objArr);
        int i13 = this.f42029c;
        if (i13 < objArr.length) {
            objArr[i13] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        i();
        return bx.o.H(this.f42027a, this.f42028b, this.f42029c, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        j();
        i();
        h(this.f42028b + this.f42029c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        j();
        i();
        int size = collection.size();
        g(this.f42028b + this.f42029c, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        i();
        Object[] objArr = this.f42027a;
        int i11 = this.f42029c;
        int i12 = this.f42028b;
        return x.l(objArr, i12, i11 + i12);
    }
}
