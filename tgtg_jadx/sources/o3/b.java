package o3;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.d0;
import kotlin.collections.x;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;
import q1.c1;
import q1.o0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements List, KMutableList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f31822b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f31821a = i11;
        this.f31822b = obj;
    }

    @Override // java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        switch (this.f31821a) {
            case 0:
                ((e) this.f31822b).a(i11, obj);
                return;
            default:
                o0 o0Var = (o0) this.f31822b;
                if (i11 < 0 || i11 > (i12 = o0Var.f35722b)) {
                    o0Var.o(i11);
                    throw null;
                }
                int i13 = i12 + 1;
                Object[] objArr = o0Var.f35721a;
                if (objArr.length < i13) {
                    o0Var.n(i13, objArr);
                }
                Object[] objArr2 = o0Var.f35721a;
                int i14 = o0Var.f35722b;
                if (i11 != i14) {
                    x.d(i11 + 1, i11, i14, objArr2, objArr2);
                }
                objArr2[i11] = obj;
                o0Var.f35722b++;
                return;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i11, Collection collection) {
        switch (this.f31821a) {
            case 0:
                return ((e) this.f31822b).e(i11, collection);
            default:
                collection.getClass();
                o0 o0Var = (o0) this.f31822b;
                if (i11 < 0 || i11 > o0Var.f35722b) {
                    o0Var.o(i11);
                    throw null;
                }
                int i12 = 0;
                if (collection.isEmpty()) {
                    return false;
                }
                int size = collection.size() + o0Var.f35722b;
                Object[] objArr = o0Var.f35721a;
                if (objArr.length < size) {
                    o0Var.n(size, objArr);
                }
                Object[] objArr2 = o0Var.f35721a;
                if (i11 != o0Var.f35722b) {
                    x.d(collection.size() + i11, i11, o0Var.f35722b, objArr2, objArr2);
                }
                for (Object obj : collection) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        d0.n();
                        throw null;
                    }
                    objArr2[i12 + i11] = obj;
                    i12 = i13;
                }
                o0Var.f35722b = collection.size() + o0Var.f35722b;
                return true;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        switch (this.f31821a) {
            case 0:
                ((e) this.f31822b).g();
                break;
            default:
                ((o0) this.f31822b).j();
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f31821a) {
            case 0:
                return ((e) this.f31822b).h(obj);
            default:
                return ((o0) this.f31822b).c(obj) >= 0;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f31821a) {
            case 0:
                e eVar = (e) this.f31822b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!eVar.h(it.next())) {
                        break;
                    }
                }
                break;
            default:
                collection.getClass();
                o0 o0Var = (o0) this.f31822b;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (o0Var.c(it2.next()) < 0) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        switch (this.f31821a) {
            case 0:
                f.a(i11, this);
                return ((e) this.f31822b).f31830a[i11];
            default:
                c1.a(i11, this);
                return ((o0) this.f31822b).b(i11);
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.f31821a) {
            case 0:
                return ((e) this.f31822b).i(obj);
            default:
                return ((o0) this.f31822b).c(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f31821a) {
            case 0:
                return ((e) this.f31822b).f31832c == 0;
            default:
                return ((o0) this.f31822b).d();
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f31821a) {
            case 0:
                return new d(this, 0, 0);
            default:
                return new d(this, 0, 1);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i11;
        switch (this.f31821a) {
            case 0:
                e eVar = (e) this.f31822b;
                Object[] objArr = eVar.f31830a;
                for (int i12 = eVar.f31832c - 1; i12 >= 0; i12--) {
                    if (Intrinsics.areEqual(obj, objArr[i12])) {
                        return i12;
                    }
                }
                return -1;
            default:
                o0 o0Var = (o0) this.f31822b;
                Object[] objArr2 = o0Var.f35721a;
                int i13 = o0Var.f35722b;
                if (obj == null) {
                    i11 = i13 - 1;
                    while (-1 < i11) {
                        if (objArr2[i11] != null) {
                            i11--;
                        }
                    }
                    return -1;
                }
                i11 = i13 - 1;
                while (-1 < i11) {
                    if (!obj.equals(objArr2[i11])) {
                        i11--;
                    }
                }
                return -1;
                return i11;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.f31821a) {
            case 0:
                return new d(this, 0, 0);
            default:
                return new d(this, 0, 1);
        }
    }

    @Override // java.util.List
    public final Object remove(int i11) {
        switch (this.f31821a) {
            case 0:
                f.a(i11, this);
                return ((e) this.f31822b).l(i11);
            default:
                c1.a(i11, this);
                return ((o0) this.f31822b).l(i11);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f31821a) {
            case 0:
                e eVar = (e) this.f31822b;
                if (!collection.isEmpty()) {
                    int i11 = eVar.f31832c;
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        eVar.j(it.next());
                    }
                    if (i11 != eVar.f31832c) {
                    }
                }
                break;
            default:
                collection.getClass();
                o0 o0Var = (o0) this.f31822b;
                int i12 = o0Var.f35722b;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    o0Var.k(it2.next());
                }
                if (i12 != o0Var.f35722b) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f31821a) {
            case 0:
                e eVar = (e) this.f31822b;
                int i11 = eVar.f31832c;
                for (int i12 = i11 - 1; -1 < i12; i12--) {
                    if (!collection.contains(eVar.f31830a[i12])) {
                        eVar.l(i12);
                    }
                }
                if (i11 != eVar.f31832c) {
                }
                break;
            default:
                collection.getClass();
                o0 o0Var = (o0) this.f31822b;
                int i13 = o0Var.f35722b;
                Object[] objArr = o0Var.f35721a;
                for (int i14 = i13 - 1; -1 < i14; i14--) {
                    if (!collection.contains(objArr[i14])) {
                        o0Var.l(i14);
                    }
                }
                if (i13 != o0Var.f35722b) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.List
    public final Object set(int i11, Object obj) {
        switch (this.f31821a) {
            case 0:
                f.a(i11, this);
                Object[] objArr = ((e) this.f31822b).f31830a;
                Object obj2 = objArr[i11];
                objArr[i11] = obj;
                return obj2;
            default:
                c1.a(i11, this);
                o0 o0Var = (o0) this.f31822b;
                if (i11 < 0 || i11 >= o0Var.f35722b) {
                    o0Var.f(i11);
                    throw null;
                }
                Object[] objArr2 = o0Var.f35721a;
                Object obj3 = objArr2[i11];
                objArr2[i11] = obj;
                return obj3;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        switch (this.f31821a) {
            case 0:
                return ((e) this.f31822b).f31832c;
            default:
                return ((o0) this.f31822b).f35722b;
        }
    }

    @Override // java.util.List
    public final List subList(int i11, int i12) {
        switch (this.f31821a) {
            case 0:
                f.b(this, i11, i12);
                return new c(this, i11, i12, 0);
            default:
                c1.b(this, i11, i12);
                return new c(this, i11, i12, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f31821a) {
            case 0:
                break;
            default:
                objArr.getClass();
                break;
        }
        return CollectionToArray.toArray(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.f31821a) {
        }
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i11) {
        switch (this.f31821a) {
            case 0:
                return new d(this, i11, 0);
            default:
                return new d(this, i11, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f31821a) {
            case 0:
                return ((e) this.f31822b).j(obj);
            default:
                return ((o0) this.f31822b).k(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f31821a) {
            case 0:
                ((e) this.f31822b).b(obj);
                break;
            default:
                ((o0) this.f31822b).g(obj);
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f31821a) {
            case 0:
                e eVar = (e) this.f31822b;
                return eVar.e(eVar.f31832c, collection);
            default:
                collection.getClass();
                o0 o0Var = (o0) this.f31822b;
                int i11 = o0Var.f35722b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    o0Var.g(it.next());
                }
                return i11 != o0Var.f35722b;
        }
    }
}
