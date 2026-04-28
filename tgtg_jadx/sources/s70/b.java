package s70;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import k30.b0;
import k30.c0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements Map {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f38898a;

    public b(c0 c0Var) {
        this.f38898a = c0Var;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj instanceof Class) {
            return this.f38898a.containsKey(((Class) obj).getName());
        }
        i4.a.f("Key must be a class");
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f38898a.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of entrySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj instanceof Class) {
            return this.f38898a.get(((Class) obj).getName());
        }
        i4.a.f("Key must be a class");
        return null;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f38898a.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of keySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f38898a.f25882f;
    }

    @Override // java.util.Map
    public final Collection values() {
        c0 c0Var = this.f38898a;
        b0 b0Var = c0Var.f25909c;
        if (b0Var != null) {
            return b0Var;
        }
        b0 b0Var2 = new b0(c0Var.f25881e, 1, c0Var.f25882f);
        c0Var.f25909c = b0Var2;
        return b0Var2;
    }
}
