package r3;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends kotlin.collections.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f37597b;

    public /* synthetic */ i(Object obj, int i11) {
        this.f37596a = i11;
        this.f37597b = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f37596a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.f37596a) {
            case 1:
                collection.getClass();
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // kotlin.collections.l
    public final int b() {
        switch (this.f37596a) {
            case 0:
                return ((d) this.f37597b).d();
            default:
                return ((v70.i) this.f37597b).f42051i;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f37596a) {
            case 0:
                ((d) this.f37597b).clear();
                break;
            default:
                ((v70.i) this.f37597b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f37596a) {
            case 0:
                return ((d) this.f37597b).containsValue(obj);
            default:
                return ((v70.i) this.f37597b).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f37596a) {
            case 1:
                return ((v70.i) this.f37597b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f37596a) {
            case 0:
                d dVar = (d) this.f37597b;
                m[] mVarArr = new m[8];
                for (int i11 = 0; i11 < 8; i11++) {
                    mVarArr[i11] = new n(2);
                }
                return new h(dVar, mVarArr);
            default:
                v70.i iVar = (v70.i) this.f37597b;
                iVar.getClass();
                return new v70.g(iVar, 2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f37596a) {
            case 1:
                v70.i iVar = (v70.i) this.f37597b;
                iVar.d();
                int i11 = iVar.i(obj);
                if (i11 < 0) {
                    return false;
                }
                iVar.l(i11);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f37596a) {
            case 1:
                collection.getClass();
                ((v70.i) this.f37597b).d();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f37596a) {
            case 1:
                collection.getClass();
                ((v70.i) this.f37597b).d();
                break;
        }
        return super.retainAll(collection);
    }
}
