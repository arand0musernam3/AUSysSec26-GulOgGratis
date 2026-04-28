package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparable f2946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f2947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c1 f2948c;

    public d1(c1 c1Var, Comparable comparable, Object obj) {
        this.f2948c = c1Var;
        this.f2946a = comparable;
        this.f2947b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f2946a.compareTo(((d1) obj).f2946a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f2946a;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f2947b;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f2946a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f2947b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f2946a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f2947b;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f2948c.b();
        Object obj2 = this.f2947b;
        this.f2947b = obj;
        return obj2;
    }

    public final String toString() {
        return this.f2946a + "=" + this.f2947b;
    }
}
