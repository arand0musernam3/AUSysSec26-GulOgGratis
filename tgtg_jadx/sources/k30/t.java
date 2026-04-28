package k30;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class t extends AbstractList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25924a;

    public t(List list) {
        list.getClass();
        this.f25924a = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        this.f25924a.add(b(i11), obj);
    }

    public final int b(int i11) {
        int size = this.f25924a.size();
        na0.a.c0(i11, size);
        return size - i11;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f25924a.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        List list = this.f25924a;
        int size = list.size();
        na0.a.Z(i11, size);
        return list.get((size - 1) - i11);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i11) {
        return new s(this, this.f25924a.listIterator(b(i11)));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i11) {
        List list = this.f25924a;
        int size = list.size();
        na0.a.Z(i11, size);
        return list.remove((size - 1) - i11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i11, int i12) {
        subList(i11, i12).clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        List list = this.f25924a;
        int size = list.size();
        na0.a.Z(i11, size);
        return list.set((size - 1) - i11, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25924a.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i11, int i12) {
        List list = this.f25924a;
        na0.a.d0(i11, i12, list.size());
        return lx.u.L(list.subList(b(i12), b(i11)));
    }
}
