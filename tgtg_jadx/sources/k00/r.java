package k00;

import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class r extends n implements NavigableSet, Iterable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Comparator f25685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient r f25686e;

    public r(Comparator comparator) {
        this.f25685d = comparator;
    }

    public static y o(Comparator comparator) {
        if (u.f25693b.equals(comparator)) {
            return y.f25711g;
        }
        i iVar = l.f25666b;
        return new y(w.f25698e, comparator);
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.f25685d;
    }

    @Override // java.util.SortedSet
    public abstract Object first();

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        y yVar = (y) this;
        return yVar.r(0, yVar.p(obj, false));
    }

    @Override // java.util.SortedSet
    public abstract Object last();

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final r descendingSet() {
        r rVarO = this.f25686e;
        if (rVarO == null) {
            y yVar = (y) this;
            Comparator comparatorReverseOrder = Collections.reverseOrder(yVar.f25685d);
            rVarO = yVar.isEmpty() ? o(comparatorReverseOrder) : new y(yVar.f25712f.h(), comparatorReverseOrder);
            this.f25686e = rVarO;
            rVarO.f25686e = this;
        }
        return rVarO;
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final y subSet(Object obj, boolean z11, Object obj2, boolean z12) {
        obj.getClass();
        obj2.getClass();
        if (this.f25685d.compare(obj, obj2) > 0) {
            i4.a.h();
            return null;
        }
        y yVar = (y) this;
        y yVarR = yVar.r(yVar.q(obj, z11), yVar.f25712f.size());
        return yVarR.r(0, yVarR.p(obj2, z12));
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        y yVar = (y) this;
        return yVar.r(yVar.q(obj, true), yVar.f25712f.size());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z11) {
        obj.getClass();
        y yVar = (y) this;
        return yVar.r(0, yVar.p(obj, z11));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z11) {
        obj.getClass();
        y yVar = (y) this;
        return yVar.r(yVar.q(obj, z11), yVar.f25712f.size());
    }
}
