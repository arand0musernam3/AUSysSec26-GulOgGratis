package k00;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class m implements Map, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map.Entry[] f25668b = new Map.Entry[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient n f25669a;

    @Override // java.util.Map
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final n entrySet() {
        n pVar = this.f25669a;
        if (pVar == null) {
            q qVar = (q) this;
            pVar = qVar.isEmpty() ? x.f25704j : new p(qVar);
            this.f25669a = pVar;
        }
        return pVar;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return ((q) this).f25680d.contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return ((q) this).entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return a.b(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((q) this).size() == 0;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        q qVar = (q) this;
        int size = qVar.size();
        if (size < 0) {
            i4.a.f(j4.s.f(size, "size cannot be negative but was: "));
            return null;
        }
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb2.append('{');
        boolean z11 = true;
        for (Map.Entry entry : qVar.entrySet()) {
            if (!z11) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z11 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }
}
