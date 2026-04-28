package k30;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class k implements Map, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient z f25907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient a0 f25908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient b0 f25909c;

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final m entrySet() {
        z zVar = this.f25907a;
        if (zVar != null) {
            return zVar;
        }
        c0 c0Var = (c0) this;
        z zVar2 = new z(c0Var, c0Var.f25881e, c0Var.f25882f);
        this.f25907a = zVar2;
        return zVar2;
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
        b0 b0Var = this.f25909c;
        if (b0Var == null) {
            c0 c0Var = (c0) this;
            b0 b0Var2 = new b0(c0Var.f25881e, 1, c0Var.f25882f);
            this.f25909c = b0Var2;
            b0Var = b0Var2;
        }
        return b0Var.contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
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
        return na0.a.q0(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((c0) this).size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        a0 a0Var = this.f25908b;
        if (a0Var != null) {
            return a0Var;
        }
        c0 c0Var = (c0) this;
        a0 a0Var2 = new a0(c0Var, new b0(c0Var.f25881e, 0, c0Var.f25882f));
        this.f25908b = a0Var2;
        return a0Var2;
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
        int i11 = ((c0) this).f25882f;
        ex.i.m(i11, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) i11) * 8, 1073741824L));
        sb2.append('{');
        j00.g it = ((z) entrySet()).iterator();
        boolean z11 = true;
        while (true) {
            d dVar = (d) it;
            if (!dVar.hasNext()) {
                sb2.append('}');
                return sb2.toString();
            }
            Map.Entry entry = (Map.Entry) dVar.next();
            if (!z11) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z11 = false;
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        b0 b0Var = this.f25909c;
        if (b0Var != null) {
            return b0Var;
        }
        c0 c0Var = (c0) this;
        b0 b0Var2 = new b0(c0Var.f25881e, 1, c0Var.f25882f);
        this.f25909c = b0Var2;
        return b0Var2;
    }

    public Object writeReplace() {
        return new j(this);
    }
}
