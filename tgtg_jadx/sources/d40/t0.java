package d40;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f14357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x1 f14358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14359e;

    public t0(String str, String str2, List list, x1 x1Var, int i11) {
        this.f14355a = str;
        this.f14356b = str2;
        this.f14357c = list;
        this.f14358d = x1Var;
        this.f14359e = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            t0 t0Var = (t0) ((x1) obj);
            if (this.f14355a.equals(t0Var.f14355a)) {
                String str = t0Var.f14356b;
                String str2 = this.f14356b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.f14357c.equals(t0Var.f14357c)) {
                        x1 x1Var = t0Var.f14358d;
                        x1 x1Var2 = this.f14358d;
                        if (x1Var2 != null ? x1Var2.equals(x1Var) : x1Var == null) {
                            if (this.f14359e == t0Var.f14359e) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f14355a.hashCode() ^ 1000003) * 1000003;
        String str = this.f14356b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f14357c.hashCode()) * 1000003;
        x1 x1Var = this.f14358d;
        return ((iHashCode2 ^ (x1Var != null ? x1Var.hashCode() : 0)) * 1000003) ^ this.f14359e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Exception{type=");
        sb2.append(this.f14355a);
        sb2.append(", reason=");
        sb2.append(this.f14356b);
        sb2.append(", frames=");
        sb2.append(this.f14357c);
        sb2.append(", causedBy=");
        sb2.append(this.f14358d);
        sb2.append(", overflowCount=");
        return r8.k.i(this.f14359e, "}", sb2);
    }
}
