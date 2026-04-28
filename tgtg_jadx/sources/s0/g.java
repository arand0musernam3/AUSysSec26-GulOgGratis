package s0;

import android.hardware.camera2.CaptureRequest;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f38330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f38331c;

    public g(String str, Class cls, CaptureRequest.Key key) {
        this.f38329a = str;
        if (cls == null) {
            c50.w.l("Null valueClass");
            throw null;
        }
        this.f38330b = cls;
        this.f38331c = key;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!this.f38329a.equals(gVar.f38329a) || !this.f38330b.equals(gVar.f38330b)) {
            return false;
        }
        Object obj2 = gVar.f38331c;
        Object obj3 = this.f38331c;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        int iHashCode = (((this.f38329a.hashCode() ^ 1000003) * 1000003) ^ this.f38330b.hashCode()) * 1000003;
        Object obj = this.f38331c;
        return iHashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "Option{id=" + this.f38329a + ", valueClass=" + this.f38330b + ", token=" + this.f38331c + "}";
    }
}
