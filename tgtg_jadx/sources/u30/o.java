package u30;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f40707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f40708b;

    public o(Class cls, Class cls2) {
        this.f40707a = cls;
        this.f40708b = cls2;
    }

    public static o a(Class cls) {
        return new o(n.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f40708b.equals(oVar.f40708b)) {
            return this.f40707a.equals(oVar.f40707a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f40707a.hashCode() + (this.f40708b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f40708b;
        Class cls2 = this.f40707a;
        if (cls2 == n.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
