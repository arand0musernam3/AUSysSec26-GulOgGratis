package g3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f3.b f19413b;

    public r5(long j9, f3.b bVar) {
        this.f19412a = j9;
        this.f19413b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5)) {
            return false;
        }
        r5 r5Var = (r5) obj;
        return i4.v.c(this.f19412a, r5Var.f19412a) && Intrinsics.areEqual(this.f19413b, r5Var.f19413b);
    }

    public final int hashCode() {
        int i11 = i4.v.f23316i;
        u70.b0 b0Var = u70.c0.f40833b;
        int iHashCode = Long.hashCode(this.f19412a) * 31;
        f3.b bVar = this.f19413b;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RippleConfiguration(color=");
        r8.k.x(this.f19412a, ", rippleAlpha=", sb2);
        sb2.append(this.f19413b);
        sb2.append(')');
        return sb2.toString();
    }
}
