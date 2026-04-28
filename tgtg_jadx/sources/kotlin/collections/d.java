package kotlin.collections;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends k90.f implements ListIterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f26495d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, int i11) {
        super(fVar, 1);
        this.f26495d = fVar;
        c cVar = f.f26505a;
        int iB = fVar.b();
        cVar.getClass();
        c.c(i11, iB);
        this.f26234b = i11;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f26234b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f26234b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            m0.i1.c();
            return null;
        }
        int i11 = this.f26234b - 1;
        this.f26234b = i11;
        return this.f26495d.get(i11);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f26234b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
