package v70;

import c50.w;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.collections.x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends kotlin.collections.m implements List, RandomAccess, Serializable, KMutableList {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final d f42032d = new d(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f42033e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f42034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f42035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f42036c;

    static {
        e eVar = new e(0);
        eVar.f42036c = true;
        f42033e = eVar;
    }

    public e(int i11) {
        if (i11 >= 0) {
            this.f42034a = new Object[i11];
        } else {
            i4.a.f("capacity must be non-negative.");
            throw null;
        }
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f42036c) {
            return new l(0, this);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        i();
        kotlin.collections.c cVar = kotlin.collections.f.f26505a;
        int i12 = this.f42035b;
        cVar.getClass();
        kotlin.collections.c.c(i11, i12);
        ((AbstractList) this).modCount++;
        j(i11, 1);
        this.f42034a[i11] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i11, Collection collection) {
        collection.getClass();
        i();
        kotlin.collections.c cVar = kotlin.collections.f.f26505a;
        int i12 = this.f42035b;
        cVar.getClass();
        kotlin.collections.c.c(i11, i12);
        int size = collection.size();
        g(i11, collection, size);
        return size > 0;
    }

    @Override // kotlin.collections.m
    public final int b() {
        return this.f42035b;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        i();
        m(0, this.f42035b);
    }

    @Override // kotlin.collections.m
    public final Object d(int i11) {
        i();
        kotlin.collections.c cVar = kotlin.collections.f.f26505a;
        int i12 = this.f42035b;
        cVar.getClass();
        kotlin.collections.c.b(i11, i12);
        return l(i11);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f42034a;
            int i11 = this.f42035b;
            if (i11 == list.size()) {
                for (int i12 = 0; i12 < i11; i12++) {
                    if (Intrinsics.areEqual(objArr[i12], list.get(i12))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void g(int i11, Collection collection, int i12) {
        ((AbstractList) this).modCount++;
        j(i11, i12);
        Iterator it = collection.iterator();
        for (int i13 = 0; i13 < i12; i13++) {
            this.f42034a[i11 + i13] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        kotlin.collections.c cVar = kotlin.collections.f.f26505a;
        int i12 = this.f42035b;
        cVar.getClass();
        kotlin.collections.c.b(i11, i12);
        return this.f42034a[i11];
    }

    public final void h(int i11, Object obj) {
        ((AbstractList) this).modCount++;
        j(i11, 1);
        this.f42034a[i11] = obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f42034a;
        int i11 = this.f42035b;
        int iHashCode = 1;
        for (int i12 = 0; i12 < i11; i12++) {
            Object obj = objArr[i12];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final void i() {
        if (this.f42036c) {
            w.d();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i11 = 0; i11 < this.f42035b; i11++) {
            if (Intrinsics.areEqual(this.f42034a[i11], obj)) {
                return i11;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f42035b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i11, int i12) {
        int i13 = this.f42035b + i12;
        if (i13 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f42034a;
        if (i13 > objArr.length) {
            kotlin.collections.c cVar = kotlin.collections.f.f26505a;
            int length = objArr.length;
            cVar.getClass();
            int iE = kotlin.collections.c.e(length, i13);
            Object[] objArr2 = this.f42034a;
            objArr2.getClass();
            this.f42034a = Arrays.copyOf(objArr2, iE);
        }
        Object[] objArr3 = this.f42034a;
        x.d(i11 + i12, i11, this.f42035b, objArr3, objArr3);
        this.f42035b += i12;
    }

    public final Object l(int i11) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f42034a;
        Object obj = objArr[i11];
        x.d(i11, i11 + 1, this.f42035b, objArr, objArr);
        Object[] objArr2 = this.f42034a;
        int i12 = this.f42035b - 1;
        objArr2.getClass();
        objArr2[i12] = null;
        this.f42035b--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i11 = this.f42035b - 1; i11 >= 0; i11--) {
            if (Intrinsics.areEqual(this.f42034a[i11], obj)) {
                return i11;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i11) {
        kotlin.collections.c cVar = kotlin.collections.f.f26505a;
        int i12 = this.f42035b;
        cVar.getClass();
        kotlin.collections.c.c(i11, i12);
        return new b(this, i11);
    }

    public final void m(int i11, int i12) {
        if (i12 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f42034a;
        x.d(i11, i11 + i12, this.f42035b, objArr, objArr);
        Object[] objArr2 = this.f42034a;
        int i13 = this.f42035b;
        bx.o.N(objArr2, i13 - i12, i13);
        this.f42035b -= i12;
    }

    public final int n(int i11, int i12, Collection collection, boolean z11) {
        Object[] objArr;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            objArr = this.f42034a;
            if (i13 >= i12) {
                break;
            }
            int i15 = i11 + i13;
            if (collection.contains(objArr[i15]) == z11) {
                Object[] objArr2 = this.f42034a;
                i13++;
                objArr2[i14 + i11] = objArr2[i15];
                i14++;
            } else {
                i13++;
            }
        }
        int i16 = i12 - i14;
        x.d(i11 + i14, i12 + i11, this.f42035b, objArr, objArr);
        Object[] objArr3 = this.f42034a;
        int i17 = this.f42035b;
        bx.o.N(objArr3, i17 - i16, i17);
        if (i16 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f42035b -= i16;
        return i16;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
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
        i();
        return n(0, this.f42035b, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        i();
        return n(0, this.f42035b, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        i();
        kotlin.collections.c cVar = kotlin.collections.f.f26505a;
        int i12 = this.f42035b;
        cVar.getClass();
        kotlin.collections.c.b(i11, i12);
        Object[] objArr = this.f42034a;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i11, int i12) {
        kotlin.collections.c cVar = kotlin.collections.f.f26505a;
        int i13 = this.f42035b;
        cVar.getClass();
        kotlin.collections.c.d(i11, i12, i13);
        return new c(this.f42034a, i11, i12 - i11, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i11 = this.f42035b;
        Object[] objArr2 = this.f42034a;
        if (length < i11) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, 0, i11, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        x.d(0, 0, i11, objArr2, objArr);
        int i12 = this.f42035b;
        if (i12 < objArr.length) {
            objArr[i12] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return bx.o.H(this.f42034a, 0, this.f42035b, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public /* synthetic */ e(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 10 : i11);
    }

    public e() {
        this(0, 1, null);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        i();
        int i11 = this.f42035b;
        ((AbstractList) this).modCount++;
        j(i11, 1);
        this.f42034a[i11] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        i();
        int size = collection.size();
        g(this.f42035b, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return x.l(this.f42034a, 0, this.f42035b);
    }
}
