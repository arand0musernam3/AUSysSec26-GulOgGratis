package q1;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements Map, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1 f35733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f35734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f35735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n1 f35736d;

    public d0(f1 f1Var) {
        f1Var.getClass();
        this.f35733a = f1Var;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f35733a.b(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f35733a.c(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        g gVar = this.f35734b;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this.f35733a, 0);
        this.f35734b = gVar2;
        return gVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d0.class != obj.getClass()) {
            return false;
        }
        return Intrinsics.areEqual(this.f35733a, ((d0) obj).f35733a);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f35733a.d(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f35733a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f35733a.e();
    }

    @Override // java.util.Map
    public final Set keySet() {
        g gVar = this.f35735c;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this.f35733a, 1);
        this.f35735c = gVar2;
        return gVar2;
    }

    @Override // java.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f35733a.f35756e;
    }

    public final String toString() {
        return this.f35733a.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        n1 n1Var = this.f35736d;
        if (n1Var != null) {
            return n1Var;
        }
        n1 n1Var2 = new n1(this.f35733a);
        this.f35736d = n1Var2;
        return n1Var2;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
