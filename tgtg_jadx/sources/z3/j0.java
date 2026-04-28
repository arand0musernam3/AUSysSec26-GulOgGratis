package z3;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.s0;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.markers.KMutableList;
import m3.s1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements List, KMutableList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f47021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f47023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f47024d;

    public j0(r rVar, int i11, int i12) {
        this.f47021a = rVar;
        this.f47022b = i11;
        this.f47023c = s.d(rVar);
        this.f47024d = i12 - i11;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        b();
        int i11 = this.f47022b + this.f47024d;
        r rVar = this.f47021a;
        rVar.add(i11, obj);
        this.f47024d++;
        this.f47023c = s.d(rVar);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i11, Collection collection) {
        b();
        int i12 = i11 + this.f47022b;
        r rVar = this.f47021a;
        boolean zAddAll = rVar.addAll(i12, collection);
        if (zAddAll) {
            this.f47024d = collection.size() + this.f47024d;
            this.f47023c = s.d(rVar);
        }
        return zAddAll;
    }

    public final void b() {
        if (s.d(this.f47021a) == this.f47023c) {
            return;
        }
        org.bouncycastle.jce.provider.a.o();
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.f47024d > 0) {
            b();
            int i11 = this.f47024d;
            int i12 = this.f47022b;
            r rVar = this.f47021a;
            rVar.g(i12, i11 + i12);
            this.f47024d = 0;
            this.f47023c = s.d(rVar);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        b();
        s.a(i11, this.f47024d);
        return this.f47021a.get(this.f47022b + i11);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        int i11 = this.f47024d;
        int i12 = this.f47022b;
        Iterator it = n80.p.j(i12, i11 + i12).iterator();
        while (((n80.h) it).f30715c) {
            int iNextInt = ((s0) it).nextInt();
            if (Intrinsics.areEqual(obj, this.f47021a.get(iNextInt))) {
                return iNextInt - i12;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f47024d == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        int i11 = this.f47024d;
        int i12 = this.f47022b;
        for (int i13 = (i11 + i12) - 1; i13 >= i12; i13--) {
            if (Intrinsics.areEqual(obj, this.f47021a.get(i13))) {
                return i13 - i12;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i11) {
        b();
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = i11 - 1;
        return new i0(intRef, this);
    }

    @Override // java.util.List
    public final Object remove(int i11) {
        b();
        int i12 = this.f47022b + i11;
        r rVar = this.f47021a;
        Object objRemove = rVar.remove(i12);
        this.f47024d--;
        this.f47023c = s.d(rVar);
        return objRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z11 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z11) {
                    z11 = true;
                }
            }
            return z11;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i11;
        q3.c cVar;
        g gVarJ;
        boolean zB;
        b();
        r rVar = this.f47021a;
        int i12 = this.f47022b;
        int i13 = this.f47024d + i12;
        int size = rVar.size();
        do {
            synchronized (s.f47056a) {
                a0 a0Var = rVar.f47055a;
                a0Var.getClass();
                a0 a0Var2 = (a0) l.h(a0Var);
                i11 = a0Var2.f46972d;
                cVar = a0Var2.f46971c;
            }
            cVar.getClass();
            q3.f fVarH = cVar.h();
            fVarH.subList(i12, i13).retainAll(collection);
            q3.c cVarE = fVarH.e();
            if (Intrinsics.areEqual(cVarE, cVar)) {
                break;
            }
            a0 a0Var3 = rVar.f47055a;
            a0Var3.getClass();
            synchronized (l.f47038c) {
                gVarJ = l.j();
                zB = s.b((a0) l.w(a0Var3, rVar, gVarJ), i11, cVarE, true);
            }
            l.n(gVarJ, rVar);
        } while (!zB);
        int size2 = size - rVar.size();
        if (size2 > 0) {
            this.f47023c = s.d(this.f47021a);
            this.f47024d -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i11, Object obj) {
        s.a(i11, this.f47024d);
        b();
        int i12 = i11 + this.f47022b;
        r rVar = this.f47021a;
        Object obj2 = rVar.set(i12, obj);
        this.f47023c = s.d(rVar);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f47024d;
    }

    @Override // java.util.List
    public final List subList(int i11, int i12) {
        if (i11 < 0 || i11 > i12 || i12 > this.f47024d) {
            s1.a("fromIndex or toIndex are out of bounds");
        }
        b();
        int i13 = this.f47022b;
        return new j0(this.f47021a, i11 + i13, i12 + i13);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return CollectionToArray.toArray(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List
    public final void add(int i11, Object obj) {
        b();
        int i12 = this.f47022b + i11;
        r rVar = this.f47021a;
        rVar.add(i12, obj);
        this.f47024d++;
        this.f47023c = s.d(rVar);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f47024d, collection);
    }
}
