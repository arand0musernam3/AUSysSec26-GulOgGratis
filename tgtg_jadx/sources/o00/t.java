package o00;

import com.google.android.gms.internal.measurement.cg;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t extends j00.g implements ListIterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f31743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f31744d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v vVar, int i11) {
        super(3);
        int size = vVar.size();
        cg.A(i11, size);
        this.f31742b = size;
        this.f31743c = i11;
        this.f31744d = vVar;
    }

    public final Object a(int i11) {
        return this.f31744d.get(i11);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f31743c < this.f31742b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f31743c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            m0.i1.c();
            return null;
        }
        int i11 = this.f31743c;
        this.f31743c = i11 + 1;
        return a(i11);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f31743c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            m0.i1.c();
            return null;
        }
        int i11 = this.f31743c - 1;
        this.f31743c = i11;
        return a(i11);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f31743c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
