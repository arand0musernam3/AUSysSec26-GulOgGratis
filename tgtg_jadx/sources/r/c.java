package r;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f37418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f37419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f37420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f37421d;

    public c(Object obj, Object obj2) {
        this.f37418a = obj;
        this.f37419b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f37418a.equals(cVar.f37418a) && this.f37419b.equals(cVar.f37419b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f37418a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f37419b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f37418a.hashCode() ^ this.f37419b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f37418a + "=" + this.f37419b;
    }
}
