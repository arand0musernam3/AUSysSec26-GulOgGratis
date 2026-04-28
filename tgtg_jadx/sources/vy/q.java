package vy;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q extends c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f42601a;

    public q(Integer num) {
        this.f42601a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        Integer num = this.f42601a;
        q qVar = (q) ((c0) obj);
        return num == null ? qVar.f42601a == null : num.equals(qVar.f42601a);
    }

    public final int hashCode() {
        Integer num = this.f42601a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return b3.i.m(new StringBuilder("ExternalPRequestContext{originAssociatedProductId="), this.f42601a, "}");
    }
}
