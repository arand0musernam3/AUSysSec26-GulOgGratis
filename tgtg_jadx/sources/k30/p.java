package k30;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class p extends m implements NavigableSet, Iterable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f25916f = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Comparator f25917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient p f25918e;

    public p(Comparator comparator) {
        this.f25917d = comparator;
    }

    public static e0 n(Comparator comparator) {
        return v.f25925a.equals(comparator) ? e0.f25894h : new e0(x.f25926e, comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.f25917d;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        p pVarN = this.f25918e;
        if (pVarN == null) {
            e0 e0Var = (e0) this;
            Comparator comparatorReverseOrder = Collections.reverseOrder(e0Var.f25917d);
            pVarN = e0Var.isEmpty() ? n(comparatorReverseOrder) : new e0(e0Var.f25895g.o(), comparatorReverseOrder);
            this.f25918e = pVarN;
            pVarN.f25918e = this;
        }
        return pVarN;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z11) {
        obj.getClass();
        e0 e0Var = (e0) this;
        return e0Var.p(0, e0Var.q(obj, z11));
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final e0 subSet(Object obj, boolean z11, Object obj2, boolean z12) {
        obj.getClass();
        obj2.getClass();
        na0.a.Y(this.f25917d.compare(obj, obj2) <= 0);
        e0 e0Var = (e0) this;
        e0 e0VarP = e0Var.p(e0Var.r(obj, z11), e0Var.f25895g.size());
        return e0VarP.p(0, e0VarP.q(obj2, z12));
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        e0 e0Var = (e0) this;
        return e0Var.p(e0Var.r(obj, true), e0Var.f25895g.size());
    }

    @Override // k30.m, k30.b
    public Object writeReplace() {
        return new o(this.f25917d, toArray(b.f25875a));
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        e0 e0Var = (e0) this;
        return e0Var.p(0, e0Var.q(obj, false));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z11) {
        obj.getClass();
        e0 e0Var = (e0) this;
        return e0Var.p(e0Var.r(obj, z11), e0Var.f25895g.size());
    }
}
