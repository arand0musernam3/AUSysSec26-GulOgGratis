package g9;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f20149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f20151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f20152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f20153e;

    public j(q0 q0Var, boolean z11, Object obj, boolean z12, boolean z13) {
        if (!q0Var.f20211a && z11) {
            i4.a.i(q0Var.b().concat(" does not allow nullable values"));
            throw null;
        }
        if (!z11 && z12 && obj == null) {
            e40.a.h("Argument with type ", q0Var.b(), " has null value but is not nullable.");
            throw null;
        }
        this.f20149a = q0Var;
        this.f20150b = z11;
        this.f20153e = obj;
        this.f20151c = z12 || z13;
        this.f20152d = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f20150b != jVar.f20150b || this.f20151c != jVar.f20151c || !Intrinsics.areEqual(this.f20149a, jVar.f20149a)) {
            return false;
        }
        Object obj2 = jVar.f20153e;
        Object obj3 = this.f20153e;
        return obj3 != null ? Intrinsics.areEqual(obj3, obj2) : obj2 == null;
    }

    public final int hashCode() {
        int iHashCode = ((((this.f20149a.hashCode() * 31) + (this.f20150b ? 1 : 0)) * 31) + (this.f20151c ? 1 : 0)) * 31;
        Object obj = this.f20153e;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Reflection.getOrCreateKotlinClass(j.class).getSimpleName());
        sb2.append(" Type: " + this.f20149a);
        sb2.append(" Nullable: " + this.f20150b);
        if (this.f20151c) {
            sb2.append(" DefaultValue: " + this.f20153e);
        }
        return sb2.toString();
    }
}
