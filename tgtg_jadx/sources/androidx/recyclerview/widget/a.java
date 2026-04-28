package androidx.recyclerview.widget;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f3652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3653d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            int i11 = this.f3650a;
            if (i11 != aVar.f3650a) {
                return false;
            }
            if (i11 != 8 || Math.abs(this.f3653d - this.f3651b) != 1 || this.f3653d != aVar.f3651b || this.f3651b != aVar.f3653d) {
                if (this.f3653d != aVar.f3653d || this.f3651b != aVar.f3651b) {
                    return false;
                }
                Object obj2 = this.f3652c;
                Object obj3 = aVar.f3652c;
                if (obj2 != null) {
                    if (!obj2.equals(obj3)) {
                        return false;
                    }
                } else if (obj3 != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f3650a * 31) + this.f3651b) * 31) + this.f3653d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[");
        int i11 = this.f3650a;
        sb2.append(i11 != 1 ? i11 != 2 ? i11 != 4 ? i11 != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb2.append(",s:");
        sb2.append(this.f3651b);
        sb2.append("c:");
        sb2.append(this.f3653d);
        sb2.append(",p:");
        sb2.append(this.f3652c);
        sb2.append("]");
        return sb2.toString();
    }
}
