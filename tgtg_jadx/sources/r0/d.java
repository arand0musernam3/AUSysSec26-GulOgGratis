package r0;

import c50.w;
import m0.n0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f37446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f37447b;

    public d(n nVar, n0 n0Var) {
        if (nVar == null) {
            w.l("Null processingRequest");
            throw null;
        }
        this.f37446a = nVar;
        this.f37447b = n0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f37446a.equals(dVar.f37446a) && this.f37447b.equals(dVar.f37447b);
    }

    public final int hashCode() {
        return ((this.f37446a.hashCode() ^ 1000003) * 1000003) ^ this.f37447b.hashCode();
    }

    public final String toString() {
        return "InputPacket{processingRequest=" + this.f37446a + ", imageProxy=" + this.f37447b + "}";
    }
}
