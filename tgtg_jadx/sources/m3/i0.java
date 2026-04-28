package m3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends z3.e0 implements c3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f29301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v2 f29302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h0 f29303d = new h0(z3.l.j().g());

    public i0(Function0 function0, v2 v2Var) {
        this.f29301b = function0;
        this.f29302c = v2Var;
    }

    @Override // z3.d0
    public final z3.f0 b() {
        return this.f29303d;
    }

    @Override // z3.d0
    public final void e(z3.f0 f0Var) {
        f0Var.getClass();
        this.f29303d = (h0) f0Var;
    }

    @Override // m3.c3
    public final Object getValue() {
        Function1 function1E = z3.l.j().e();
        if (function1E != null) {
            function1E.invoke(this);
        }
        z3.g gVarJ = z3.l.j();
        return h((h0) z3.l.i(this.f29303d, gVarJ), gVarJ, true, this.f29301b).f29289f;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final m3.h0 h(m3.h0 r22, z3.g r23, boolean r24, kotlin.jvm.functions.Function0 r25) {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.i0.h(m3.h0, z3.g, boolean, kotlin.jvm.functions.Function0):m3.h0");
    }

    public final h0 i() {
        z3.g gVarJ = z3.l.j();
        return h((h0) z3.l.i(this.f29303d, gVarJ), gVarJ, false, this.f29301b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DerivedState(value=");
        h0 h0Var = (h0) z3.l.h(this.f29303d);
        sb2.append(h0Var.d(this, z3.l.j()) ? String.valueOf(h0Var.f29289f) : "<Not calculated>");
        sb2.append(")@");
        sb2.append(hashCode());
        return sb2.toString();
    }
}
