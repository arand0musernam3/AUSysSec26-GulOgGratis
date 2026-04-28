package g9;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i0 f20122b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f20123c = null;

    public h(int i11) {
        this.f20121a = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f20121a != hVar.f20121a || !Intrinsics.areEqual(this.f20122b, hVar.f20122b)) {
            return false;
        }
        Bundle bundle = this.f20123c;
        Bundle bundle2 = hVar.f20123c;
        if (Intrinsics.areEqual(bundle, bundle2)) {
            return true;
        }
        return (bundle == null || bundle2 == null || !wd.a.m(bundle, bundle2)) ? false : true;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f20121a) * 31;
        i0 i0Var = this.f20122b;
        int iHashCode2 = iHashCode + (i0Var != null ? i0Var.hashCode() : 0);
        Bundle bundle = this.f20123c;
        if (bundle != null) {
            return wd.a.n(bundle) + (iHashCode2 * 31);
        }
        return iHashCode2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(h.class.getSimpleName());
        sb2.append("(0x");
        sb2.append(Integer.toHexString(this.f20121a));
        sb2.append(")");
        if (this.f20122b != null) {
            sb2.append(" navOptions=");
            sb2.append(this.f20122b);
        }
        return sb2.toString();
    }
}
