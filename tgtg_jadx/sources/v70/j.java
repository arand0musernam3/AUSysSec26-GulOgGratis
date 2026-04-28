package v70;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f42055a;

    public j(i iVar) {
        this.f42055a = iVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        ((Map.Entry) obj).getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.collections.o
    public final int b() {
        return this.f42055a.f42051i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f42055a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return this.f42055a.f(collection);
    }

    @Override // v70.a
    public final boolean d(Map.Entry entry) {
        entry.getClass();
        i iVar = this.f42055a;
        iVar.getClass();
        int iH = iVar.h(entry.getKey());
        if (iH < 0) {
            return false;
        }
        Object[] objArr = iVar.f42044b;
        objArr.getClass();
        return Intrinsics.areEqual(objArr[iH], entry.getValue());
    }

    @Override // v70.a
    public final boolean e(Map.Entry entry) {
        entry.getClass();
        i iVar = this.f42055a;
        iVar.getClass();
        entry.getClass();
        iVar.d();
        int iH = iVar.h(entry.getKey());
        if (iH < 0) {
            return false;
        }
        Object[] objArr = iVar.f42044b;
        objArr.getClass();
        if (!Intrinsics.areEqual(objArr[iH], entry.getValue())) {
            return false;
        }
        iVar.l(iH);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f42055a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        i iVar = this.f42055a;
        iVar.getClass();
        return new g(iVar, 0);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        this.f42055a.d();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        this.f42055a.d();
        return super.retainAll(collection);
    }
}
