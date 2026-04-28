package k00;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class l extends h implements List, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f25666b = new i(w.f25698e, 0);

    public static w j(int i11, Object[] objArr) {
        return i11 == 0 ? w.f25698e : new w(objArr, i11);
    }

    public static w l(Object[] objArr) {
        if (objArr.length == 0) {
            return w.f25698e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (objArr2[i11] == null) {
                c50.w.l(j4.s.f(i11, "at index "));
                return null;
            }
        }
        return j(length, objArr2);
    }

    @Override // java.util.List
    public final void add(int i11, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i11, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // k00.h
    public int b(Object[] objArr) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i11] = get(i11);
        }
        return size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // k00.h
    public final b0 e() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i11 = 0; i11 < size; i11++) {
                        if (a.h(get(i11), list.get(i11))) {
                        }
                    }
                    return true;
                }
                i iVarListIterator = listIterator(0);
                Iterator it = list.iterator();
                while (true) {
                    if (iVarListIterator.hasNext()) {
                        if (!it.hasNext() || !a.h(iVarListIterator.next(), it.next())) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public l h() {
        return size() <= 1 ? this : new j(this);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i11 = 0; i11 < size; i11++) {
            iHashCode = (iHashCode * 31) + get(i11).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public l subList(int i11, int i12) {
        a.m(i11, i12, size());
        int i13 = i12 - i11;
        return i13 == size() ? this : i13 == 0 ? w.f25698e : new k(this, i11, i13);
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
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

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final i listIterator(int i11) {
        int size = size();
        if (i11 >= 0 && i11 <= size) {
            return isEmpty() ? f25666b : new i(this, i11);
        }
        org.bouncycastle.jce.provider.a.v(a.n(i11, size, "index"));
        return null;
    }

    @Override // java.util.List
    public final Object remove(int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i11, Object obj) {
        throw new UnsupportedOperationException();
    }
}
