package tc;

import kotlin.jvm.internal.Intrinsics;
import qc.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f39950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qc.f f39952c;

    public n(b0 b0Var, String str, qc.f fVar) {
        this.f39950a = b0Var;
        this.f39951b = str;
        this.f39952c = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual(this.f39950a, nVar.f39950a) && Intrinsics.areEqual(this.f39951b, nVar.f39951b) && this.f39952c == nVar.f39952c;
    }

    public final int hashCode() {
        int iHashCode = this.f39950a.hashCode() * 31;
        String str = this.f39951b;
        return this.f39952c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
