package k30;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import m0.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e0 extends p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e0 f25894h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient h f25895g;

    static {
        d dVar = h.f25901b;
        f25894h = new e0(x.f25926e, v.f25925a);
    }

    public e0(h hVar, Comparator comparator) {
        super(comparator);
        this.f25895g = hVar;
    }

    @Override // k30.m, k30.b
    public final h b() {
        return this.f25895g;
    }

    @Override // k30.b
    public final int c(Object[] objArr) {
        return this.f25895g.c(objArr);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iR = r(obj, true);
        h hVar = this.f25895g;
        if (iR == hVar.size()) {
            return null;
        }
        return hVar.get(iR);
    }

    @Override // k30.b, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f25895g, obj, this.f25917d) >= 0) {
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
        if (collection instanceof u) {
            collection = ((u) collection).f();
        }
        Comparator comparator = this.f25917d;
        if (!nx.d.w(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        j00.g it = iterator();
        Iterator it2 = collection.iterator();
        d dVar = (d) it;
        if (!dVar.hasNext()) {
            return false;
        }
        Object next = it2.next();
        Object next2 = dVar.next();
        while (true) {
            try {
                int iCompare = comparator.compare(next2, next);
                if (iCompare < 0) {
                    if (!dVar.hasNext()) {
                        return false;
                    }
                    next2 = dVar.next();
                } else if (iCompare == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (iCompare > 0) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
    }

    @Override // k30.b
    public final Object[] d() {
        return this.f25895g.d();
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.f25895g.o().listIterator(0);
    }

    @Override // k30.b
    public final int e() {
        return this.f25895g.e();
    }

    @Override // k30.m, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.f25895g.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        Comparator comparator = this.f25917d;
        if (!nx.d.w(comparator, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            j00.g it2 = iterator();
            do {
                d dVar = (d) it2;
                if (!dVar.hasNext()) {
                    return true;
                }
                next = dVar.next();
                next2 = it.next();
                if (next2 == null) {
                    return false;
                }
            } while (comparator.compare(next, next2) == 0);
            return false;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.f25895g.get(0);
        }
        i1.c();
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int iQ = q(obj, true) - 1;
        if (iQ == -1) {
            return null;
        }
        return this.f25895g.get(iQ);
    }

    @Override // k30.b
    public final int g() {
        return this.f25895g.g();
    }

    @Override // k30.b
    public final boolean h() {
        return this.f25895g.h();
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int iR = r(obj, false);
        h hVar = this.f25895g;
        if (iR == hVar.size()) {
            return null;
        }
        return hVar.get(iR);
    }

    @Override // k30.b
    /* JADX INFO: renamed from: i */
    public final j00.g iterator() {
        return this.f25895g.listIterator(0);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            i1.c();
            return null;
        }
        return this.f25895g.get(r0.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int iQ = q(obj, false) - 1;
        if (iQ == -1) {
            return null;
        }
        return this.f25895g.get(iQ);
    }

    public final e0 p(int i11, int i12) {
        h hVar = this.f25895g;
        if (i11 == 0 && i12 == hVar.size()) {
            return this;
        }
        Comparator comparator = this.f25917d;
        return i11 < i12 ? new e0(hVar.subList(i11, i12), comparator) : p.n(comparator);
    }

    public final int q(Object obj, boolean z11) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f25895g, obj, this.f25917d);
        return iBinarySearch >= 0 ? z11 ? iBinarySearch + 1 : iBinarySearch : ~iBinarySearch;
    }

    public final int r(Object obj, boolean z11) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f25895g, obj, this.f25917d);
        return iBinarySearch >= 0 ? z11 ? iBinarySearch : iBinarySearch + 1 : ~iBinarySearch;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f25895g.size();
    }

    @Override // k30.p, k30.m, k30.b
    public Object writeReplace() {
        return super.writeReplace();
    }
}
