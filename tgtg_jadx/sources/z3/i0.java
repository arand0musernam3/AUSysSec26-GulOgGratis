package z3;

import java.util.ListIterator;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.markers.KMutableListIterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements ListIterator, KMutableListIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f47014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f47015b;

    public i0(Ref.IntRef intRef, j0 j0Var) {
        this.f47014a = intRef;
        this.f47015b = j0Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f47014a.element < this.f47015b.f47024d - 1;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f47014a.element >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        Ref.IntRef intRef = this.f47014a;
        int i11 = intRef.element + 1;
        j0 j0Var = this.f47015b;
        s.a(i11, j0Var.f47024d);
        intRef.element = i11;
        return j0Var.get(i11);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f47014a.element + 1;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        Ref.IntRef intRef = this.f47014a;
        int i11 = intRef.element;
        j0 j0Var = this.f47015b;
        s.a(i11, j0Var.f47024d);
        intRef.element = i11 - 1;
        return j0Var.get(i11);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f47014a.element;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }
}
