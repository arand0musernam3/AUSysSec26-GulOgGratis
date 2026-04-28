package z1;

import kotlin.text.CharsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j2.f f46759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v80.l f46760b;

    public x(j2.f fVar, v80.l lVar) {
        this.f46759a = fVar;
        this.f46760b = lVar;
    }

    public final String toString() {
        v80.l lVar = this.f46760b;
        v80.a0 a0Var = (v80.a0) lVar.f42119e.get(v80.a0.f42067b);
        String str = a0Var != null ? a0Var.f42068a : null;
        StringBuilder sb2 = new StringBuilder("Request@");
        String string = Integer.toString(hashCode(), CharsKt.checkRadix(16));
        string.getClass();
        sb2.append(string);
        sb2.append(str != null ? w.a0.p("[", str, "](") : "(");
        sb2.append("currentBounds()=");
        sb2.append(this.f46759a.invoke());
        sb2.append(", continuation=");
        sb2.append(lVar);
        sb2.append(')');
        return sb2.toString();
    }
}
