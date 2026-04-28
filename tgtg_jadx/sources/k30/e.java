package k30;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient h f25893c;

    public e(h hVar) {
        this.f25893c = hVar;
    }

    @Override // k30.h, k30.b, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f25893c.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i11) {
        h hVar = this.f25893c;
        na0.a.Z(i11, hVar.size());
        return hVar.get((hVar.size() - 1) - i11);
    }

    @Override // k30.b
    public final boolean h() {
        return this.f25893c.h();
    }

    @Override // k30.h, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.f25893c.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (r0.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // k30.h, k30.b, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // k30.h, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.f25893c.indexOf(obj);
        if (iIndexOf >= 0) {
            return (r0.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // k30.h, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // k30.h
    public final h o() {
        return this.f25893c;
    }

    @Override // k30.h, java.util.List
    /* JADX INFO: renamed from: p */
    public final h subList(int i11, int i12) {
        h hVar = this.f25893c;
        na0.a.d0(i11, i12, hVar.size());
        return hVar.subList(hVar.size() - i12, hVar.size() - i11).o();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25893c.size();
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
