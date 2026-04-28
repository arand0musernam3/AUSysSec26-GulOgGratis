package k30;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f25898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f25899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f25900e;

    public g(h hVar, int i11, int i12) {
        this.f25900e = hVar;
        this.f25898c = i11;
        this.f25899d = i12;
    }

    @Override // k30.b
    public final Object[] d() {
        return this.f25900e.d();
    }

    @Override // k30.b
    public final int e() {
        return this.f25900e.g() + this.f25898c + this.f25899d;
    }

    @Override // k30.b
    public final int g() {
        return this.f25900e.g() + this.f25898c;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        na0.a.Z(i11, this.f25899d);
        return this.f25900e.get(i11 + this.f25898c);
    }

    @Override // k30.b
    public final boolean h() {
        return true;
    }

    @Override // k30.h, k30.b, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // k30.h, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // k30.h, java.util.List
    /* JADX INFO: renamed from: p */
    public final h subList(int i11, int i12) {
        na0.a.d0(i11, i12, this.f25899d);
        int i13 = this.f25898c;
        return this.f25900e.subList(i11 + i13, i12 + i13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25899d;
    }

    @Override // k30.h, k30.b
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // k30.h, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i11) {
        return listIterator(i11);
    }
}
