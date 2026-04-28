package n9;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import m3.n;
import m3.s;
import m3.w1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f30741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f30742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f30743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u3.d f30744d;

    public e(Object obj, Object obj2, Map map, u3.d dVar) {
        this.f30741a = obj;
        this.f30742b = obj2;
        this.f30743c = map;
        this.f30744d = dVar;
    }

    public final void a(n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(295512821);
        int i12 = (sVar.f(this) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            this.f30744d.invoke(this.f30741a, sVar, 0);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new d(this, i11);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.f30741a, eVar.f30741a) && Intrinsics.areEqual(this.f30742b, eVar.f30742b) && Intrinsics.areEqual(this.f30743c, eVar.f30743c) && this.f30744d == eVar.f30744d;
    }

    public final int hashCode() {
        return (this.f30744d.hashCode() * 31) + (this.f30743c.hashCode() * 31) + (this.f30742b.hashCode() * 31) + (this.f30741a.hashCode() * 31);
    }

    public final String toString() {
        return "NavEntry(key=" + this.f30741a + ", contentKey=" + this.f30742b + ", metadata=" + this.f30743c + ", content=" + this.f30744d + ')';
    }

    public e(e eVar, u3.d dVar) {
        this(eVar.f30741a, eVar.f30742b, eVar.f30743c, dVar);
    }
}
