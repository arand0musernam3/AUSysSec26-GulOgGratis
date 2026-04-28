package m40;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f29509b;

    public b(String str, Map map) {
        this.f29508a = str;
        this.f29509b = map;
    }

    public static b a(String str) {
        return new b(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f29508a.equals(bVar.f29508a) && this.f29509b.equals(bVar.f29509b);
    }

    public final int hashCode() {
        return this.f29509b.hashCode() + (this.f29508a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f29508a + ", properties=" + this.f29509b.values() + "}";
    }
}
