package k30;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h extends b implements List, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f25901b = new d(x.f25926e, 0);

    public static x j(int i11, Object[] objArr) {
        return i11 == 0 ? x.f25926e : new x(objArr, i11);
    }

    public static h l(Iterable iterable) {
        if (iterable instanceof Collection) {
            return m((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return x.f25926e;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            Object[] objArr = {next};
            m0.c.T(1, objArr);
            return j(1, objArr);
        }
        c cVar = new c(4);
        cVar.a(next);
        while (it.hasNext()) {
            cVar.a(it.next());
        }
        return cVar.e();
    }

    public static h m(Collection collection) {
        if (!(collection instanceof b)) {
            Object[] array = collection.toArray();
            m0.c.T(array.length, array);
            return j(array.length, array);
        }
        h hVarB = ((b) collection).b();
        if (!hVarB.h()) {
            return hVarB;
        }
        Object[] array2 = hVarB.toArray(b.f25875a);
        return j(array2.length, array2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.List
    public final void add(int i11, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i11, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // k30.b
    public int c(Object[] objArr) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i11] = get(i11);
        }
        return size;
    }

    @Override // k30.b, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && lx.u.B(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i11 = 0; i11 < size; i11++) {
                        if (lx.u.B(get(i11), list.get(i11))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i11 = 1;
        for (int i12 = 0; i12 < size; i12++) {
            i11 = ~(~(get(i12).hashCode() + (i11 * 31)));
        }
        return i11;
    }

    @Override // k30.b
    /* JADX INFO: renamed from: i */
    public final j00.g iterator() {
        return listIterator(0);
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (obj.equals(get(i11))) {
                return i11;
            }
        }
        return -1;
    }

    @Override // k30.b, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final d listIterator(int i11) {
        na0.a.c0(i11, size());
        return isEmpty() ? f25901b : new d(this, i11);
    }

    public h o() {
        return size() <= 1 ? this : new e(this);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public h subList(int i11, int i12) {
        na0.a.d0(i11, i12, size());
        int i13 = i12 - i11;
        return i13 == size() ? this : i13 == 0 ? x.f25926e : new g(this, i11, i13);
    }

    @Override // java.util.List
    public final Object remove(int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i11, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // k30.b
    public Object writeReplace() {
        return new f(toArray(b.f25875a));
    }

    @Override // k30.b
    public final h b() {
        return this;
    }
}
