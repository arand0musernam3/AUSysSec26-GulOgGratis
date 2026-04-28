package r3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends kotlin.collections.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f37594b;

    public /* synthetic */ f(Object obj, int i11) {
        this.f37593a = i11;
        this.f37594b = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f37593a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        switch (this.f37593a) {
            case 2:
                collection.getClass();
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // kotlin.collections.o
    public final int b() {
        switch (this.f37593a) {
            case 0:
                return ((d) this.f37594b).d();
            case 1:
                return ((d) this.f37594b).d();
            default:
                return ((v70.i) this.f37594b).f42051i;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f37593a) {
            case 0:
                ((d) this.f37594b).clear();
                break;
            case 1:
                ((d) this.f37594b).clear();
                break;
            default:
                ((v70.i) this.f37594b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f37593a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                d dVar = (d) this.f37594b;
                Object obj2 = dVar.get(entry.getKey());
                return obj2 != null ? Intrinsics.areEqual(obj2, entry.getValue()) : entry.getValue() == null && dVar.containsKey(entry.getKey());
            case 1:
                return ((d) this.f37594b).containsKey(obj);
            default:
                return ((v70.i) this.f37594b).containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        switch (this.f37593a) {
            case 2:
                return ((v70.i) this.f37594b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f37593a) {
            case 0:
                return new g((d) this.f37594b);
            case 1:
                d dVar = (d) this.f37594b;
                m[] mVarArr = new m[8];
                for (int i11 = 0; i11 < 8; i11++) {
                    mVarArr[i11] = new n(1);
                }
                return new h(dVar, mVarArr);
            default:
                v70.i iVar = (v70.i) this.f37594b;
                iVar.getClass();
                return new v70.g(iVar, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f37593a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return ((d) this.f37594b).remove(entry.getKey(), entry.getValue());
            case 1:
                d dVar = (d) this.f37594b;
                if (!dVar.containsKey(obj)) {
                    return false;
                }
                dVar.remove(obj);
                return true;
            default:
                v70.i iVar = (v70.i) this.f37594b;
                iVar.d();
                int iH = iVar.h(obj);
                if (iH < 0) {
                    return false;
                }
                iVar.l(iH);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        switch (this.f37593a) {
            case 2:
                collection.getClass();
                ((v70.i) this.f37594b).d();
                return super.removeAll(collection);
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        switch (this.f37593a) {
            case 2:
                collection.getClass();
                ((v70.i) this.f37594b).d();
                break;
        }
        return super.retainAll(collection);
    }
}
