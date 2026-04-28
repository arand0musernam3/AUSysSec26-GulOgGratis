package m5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f29517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f29518b;

    public b0(boolean z11) {
        this(null, new z(z11));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return Intrinsics.areEqual(this.f29518b, b0Var.f29518b) && Intrinsics.areEqual(this.f29517a, b0Var.f29517a);
    }

    public final int hashCode() {
        a0 a0Var = this.f29517a;
        int iHashCode = (a0Var != null ? a0Var.hashCode() : 0) * 31;
        z zVar = this.f29518b;
        return iHashCode + (zVar != null ? zVar.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f29517a + ", paragraphSyle=" + this.f29518b + ')';
    }

    public b0(a0 a0Var, z zVar) {
        this.f29517a = a0Var;
        this.f29518b = zVar;
    }
}
