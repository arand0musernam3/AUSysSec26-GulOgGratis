package q1;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 implements Collection, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35796a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f35797b;

    public n1() {
        int i11 = e1.f35748a;
        this.f35797b = new p0(6);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f35796a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((p0) this.f35797b).b(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f35796a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.f35796a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ((p0) this.f35797b).c();
                return;
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f35796a) {
            case 0:
                return ((f1) this.f35797b).c(obj);
            default:
                return ((p0) this.f35797b).a(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f35796a) {
            case 0:
                collection.getClass();
                Collection collection2 = collection;
                if (!collection2.isEmpty()) {
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        if (!((f1) this.f35797b).c(it.next())) {
                            break;
                        }
                    }
                    break;
                }
                break;
            default:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!((p0) this.f35797b).a(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.f35796a) {
            case 0:
                return ((f1) this.f35797b).e();
            default:
                return ((p0) this.f35797b).f35743g == 0;
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f35796a) {
            case 0:
                return o80.l.a(new o3.g(this, null, 3));
            default:
                p0 p0Var = (p0) this.f35797b;
                p0Var.getClass();
                return new r0(new s0(p0Var));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f35796a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((p0) this.f35797b).g(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f35796a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((p0) this.f35797b).g(collection);
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.f35796a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f35796a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((p0) this.f35797b).i(collection);
        }
    }

    @Override // java.util.Collection
    public final int size() {
        switch (this.f35796a) {
            case 0:
                return ((f1) this.f35797b).f35756e;
            default:
                return ((p0) this.f35797b).f35743g;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f35796a) {
            case 0:
                objArr.getClass();
                break;
        }
        return CollectionToArray.toArray(this, objArr);
    }

    public n1(f1 f1Var) {
        f1Var.getClass();
        this.f35797b = f1Var;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.f35796a) {
        }
        return CollectionToArray.toArray(this);
    }
}
