package k00;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import m0.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class y extends r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final y f25711g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient l f25712f;

    static {
        i iVar = l.f25666b;
        f25711g = new y(w.f25698e, u.f25693b);
    }

    public y(l lVar, Comparator comparator) {
        super(comparator);
        this.f25712f = lVar;
    }

    @Override // k00.h
    public final int b(Object[] objArr) {
        return this.f25712f.b(objArr);
    }

    @Override // k00.h
    public final int c() {
        return this.f25712f.c();
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iQ = q(obj, true);
        l lVar = this.f25712f;
        if (iQ == lVar.size()) {
            return null;
        }
        return lVar.get(iQ);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f25712f, obj, this.f25685d) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof t) {
            collection = ((t) collection).a();
        }
        Comparator comparator = this.f25685d;
        if (!a.i(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        i iVarListIterator = this.f25712f.listIterator(0);
        Iterator it = collection.iterator();
        if (iVarListIterator.hasNext()) {
            Object next = it.next();
            Object next2 = iVarListIterator.next();
            while (true) {
                try {
                    int iCompare = comparator.compare(next2, next);
                    if (iCompare >= 0) {
                        if (iCompare != 0) {
                            break;
                        }
                        if (!it.hasNext()) {
                            return true;
                        }
                        next = it.next();
                    } else {
                        if (!iVarListIterator.hasNext()) {
                            break;
                        }
                        next2 = iVarListIterator.next();
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        }
        return false;
    }

    @Override // k00.h
    public final int d() {
        return this.f25712f.d();
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.f25712f.h().listIterator(0);
    }

    @Override // k00.h
    public final b0 e() {
        return this.f25712f.listIterator(0);
    }

    @Override // k00.n, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            l lVar = this.f25712f;
            if (lVar.size() == set.size()) {
                if (isEmpty()) {
                    return true;
                }
                Comparator comparator = this.f25685d;
                if (!a.i(comparator, set)) {
                    return containsAll(set);
                }
                Iterator it = set.iterator();
                try {
                    i iVarListIterator = lVar.listIterator(0);
                    while (iVarListIterator.hasNext()) {
                        Object next = iVarListIterator.next();
                        Object next2 = it.next();
                        if (next2 == null || comparator.compare(next, next2) != 0) {
                        }
                    }
                    return true;
                } catch (ClassCastException | NoSuchElementException unused) {
                }
            }
        }
        return false;
    }

    @Override // k00.r, java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.f25712f.get(0);
        }
        i1.c();
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int iP = p(obj, true) - 1;
        if (iP == -1) {
            return null;
        }
        return this.f25712f.get(iP);
    }

    @Override // k00.h
    public final Object[] g() {
        return this.f25712f.g();
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int iQ = q(obj, false);
        l lVar = this.f25712f;
        if (iQ == lVar.size()) {
            return null;
        }
        return lVar.get(iQ);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* synthetic */ Iterator iterator() {
        return this.f25712f.listIterator(0);
    }

    @Override // k00.n
    public final l j() {
        return this.f25712f;
    }

    @Override // k00.r, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            i1.c();
            return null;
        }
        return this.f25712f.get(r0.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int iP = p(obj, false) - 1;
        if (iP == -1) {
            return null;
        }
        return this.f25712f.get(iP);
    }

    public final int p(Object obj, boolean z11) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f25712f, obj, this.f25685d);
        return iBinarySearch >= 0 ? z11 ? iBinarySearch + 1 : iBinarySearch : ~iBinarySearch;
    }

    public final int q(Object obj, boolean z11) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f25712f, obj, this.f25685d);
        return iBinarySearch >= 0 ? z11 ? iBinarySearch : iBinarySearch + 1 : ~iBinarySearch;
    }

    public final y r(int i11, int i12) {
        l lVar = this.f25712f;
        if (i11 == 0) {
            if (i12 == lVar.size()) {
                return this;
            }
            i11 = 0;
        }
        Comparator comparator = this.f25685d;
        return i11 < i12 ? new y(lVar.subList(i11, i12), comparator) : r.o(comparator);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f25712f.size();
    }
}
