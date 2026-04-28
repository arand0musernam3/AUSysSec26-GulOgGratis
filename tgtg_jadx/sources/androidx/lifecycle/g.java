package androidx.lifecycle;

import com.braze.h2;
import v80.b2;
import zw.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends n0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public q2 f3445m;

    @Override // androidx.lifecycle.n0, androidx.lifecycle.k0
    public final void g() {
        super.g();
        q2 q2Var = this.f3445m;
        if (q2Var != null) {
            b2 b2Var = (b2) q2Var.f48338f;
            x70.c cVar = null;
            if (b2Var != null) {
                b2Var.a(null);
            }
            q2Var.f48338f = null;
            if (((b2) q2Var.f48337e) != null) {
                return;
            }
            q2Var.f48337e = v80.f0.B((a90.d) q2Var.f48335c, null, null, new a3.x(q2Var, cVar, 7), 3);
        }
    }

    @Override // androidx.lifecycle.n0, androidx.lifecycle.k0
    public final void h() {
        super.h();
        q2 q2Var = this.f3445m;
        if (q2Var != null) {
            if (((b2) q2Var.f48338f) != null) {
                h2.b("Cancel call cannot happen without a maybeRun");
                return;
            }
            a90.d dVar = (a90.d) q2Var.f48335c;
            c90.f fVar = v80.p0.f42144a;
            q2Var.f48338f = v80.f0.B(dVar, a90.p.f1044a.f43295e, null, new a3.b2(q2Var, null, 2), 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit l(z70.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.lifecycle.f
            if (r0 == 0) goto L13
            r0 = r5
            androidx.lifecycle.f r0 = (androidx.lifecycle.f) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            androidx.lifecycle.f r0 = new androidx.lifecycle.f
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f3431j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r0 = r0.l
            if (r0 == 0) goto L23
            r1 = 1
            if (r0 != r1) goto L27
        L23:
            ba0.g.M(r5)
            goto L2e
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L2e:
            kotlin.Unit r5 = kotlin.Unit.f26487a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.g.l(z70.c):kotlin.Unit");
    }
}
