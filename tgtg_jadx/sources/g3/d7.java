package g3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e7 f18461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v80.l f18462b;

    public d7(e7 e7Var, v80.l lVar) {
        this.f18461a = e7Var;
        this.f18462b = lVar;
    }

    public final void a() {
        v80.l lVar = this.f18462b;
        if (lVar.g()) {
            u70.o oVar = u70.q.f40850b;
            lVar.resumeWith(m7.Dismissed);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d7.class != obj.getClass()) {
            return false;
        }
        d7 d7Var = (d7) obj;
        return Intrinsics.areEqual(this.f18461a, d7Var.f18461a) && Intrinsics.areEqual(this.f18462b, d7Var.f18462b);
    }

    public final int hashCode() {
        return this.f18462b.hashCode() + (this.f18461a.hashCode() * 31);
    }
}
