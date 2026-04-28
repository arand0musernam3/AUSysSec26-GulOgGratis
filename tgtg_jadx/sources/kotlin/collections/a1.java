package kotlin.collections;

import java.util.ListIterator;
import kotlin.jvm.internal.markers.KMutableListIterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class a1 implements ListIterator, KMutableListIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ListIterator f26490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f26491b;

    public a1(b1 b1Var, int i11) {
        this.f26491b = b1Var;
        this.f26490a = b1Var.f26492a.listIterator(j0.A(i11, b1Var));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        ListIterator listIterator = this.f26490a;
        listIterator.add(obj);
        listIterator.previous();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f26490a.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f26490a.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f26490a.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return (this.f26491b.size() - 1) - this.f26490a.previousIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f26490a.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return (this.f26491b.size() - 1) - this.f26490a.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.f26490a.remove();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f26490a.set(obj);
    }
}
