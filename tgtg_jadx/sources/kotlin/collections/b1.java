package kotlin.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class b1 extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f26492a;

    public b1(ArrayList arrayList) {
        this.f26492a = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        this.f26492a.add(j0.A(i11, this), obj);
    }

    @Override // kotlin.collections.m
    public final int b() {
        return this.f26492a.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f26492a.clear();
    }

    @Override // kotlin.collections.m
    public final Object d(int i11) {
        return this.f26492a.remove(j0.z(i11, this));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        return this.f26492a.get(j0.z(i11, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new a1(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new a1(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        return this.f26492a.set(j0.z(i11, this), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i11) {
        return new a1(this, i11);
    }
}
