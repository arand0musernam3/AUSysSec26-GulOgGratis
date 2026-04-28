package b5;

import java.util.ListIterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements ListIterator, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f5980d;

    public t(v vVar, int i11, int i12) {
        this(vVar, (i12 & 1) != 0 ? 0 : i11, 0, vVar.f6004a.f35722b);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f5977a < this.f5979c;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f5977a > this.f5978b;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        q1.o0 o0Var = this.f5980d.f6004a;
        int i11 = this.f5977a;
        this.f5977a = i11 + 1;
        Object objB = o0Var.b(i11);
        objB.getClass();
        return (b4.s) objB;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f5977a - this.f5978b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        q1.o0 o0Var = this.f5980d.f6004a;
        int i11 = this.f5977a - 1;
        this.f5977a = i11;
        Object objB = o0Var.b(i11);
        objB.getClass();
        return (b4.s) objB;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return (this.f5977a - this.f5978b) - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public t(v vVar, int i11, int i12, int i13) {
        this.f5980d = vVar;
        this.f5977a = i11;
        this.f5978b = i12;
        this.f5979c = i13;
    }
}
