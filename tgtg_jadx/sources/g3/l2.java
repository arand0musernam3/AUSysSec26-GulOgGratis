package g3;

import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l2 extends b5.n implements b5.k {
    public final t1.b A;
    public final f4.b B;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f18998q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f18999r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public b2.k f19000s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f19001t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f19002u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f19003v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public v80.b2 f19004w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public d9 f19005x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public t1.b f19006y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public i4.v0 f19007z;

    public l2(boolean z11, boolean z12, b2.k kVar, d9 d9Var, i4.v0 v0Var) {
        float f11 = g9.f18695e;
        float f12 = g9.f18694d;
        this.f18998q = z11;
        this.f18999r = z12;
        this.f19000s = kVar;
        this.f19001t = f11;
        this.f19002u = f12;
        this.f19005x = d9Var;
        this.f19007z = v0Var;
        this.A = new t1.b(new z5.f((this.f19003v && z11) ? f11 : f12), t1.c.l, null, 12);
        f4.b bVar = new f4.b(new f4.c(), new c50.p(this, 27));
        L0(bVar);
        this.B = bVar;
    }

    public static final Object O0(l2 l2Var, z70.i iVar) {
        l2Var.f19003v = false;
        Object objCollect = l2Var.f19000s.a().collect(new a3.w1(4, new ArrayList(), l2Var), iVar);
        return objCollect == y70.a.COROUTINE_SUSPENDED ? objCollect : Unit.f26487a;
    }

    public final void P0() {
        v80.f0.B(getCoroutineScope(), null, null, new k2(this, null, 0), 3);
        v80.f0.B(getCoroutineScope(), null, null, new k2(this, null, 1), 3);
    }

    @Override // b4.s
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // b4.s
    public final void onAttach() {
        this.f19004w = v80.f0.B(getCoroutineScope(), null, null, new k2(this, null, 2), 3);
        if (this.f19006y == null) {
            d9 d9VarD = this.f19005x;
            if (d9VarD == null) {
                g9 g9Var = g9.f18691a;
                d9VarD = g9.d((p0) b5.o.e(this, r0.f19375a), (a3.t3) b5.o.e(this, a3.u3.f588a));
            }
            long jC = d9VarD.c(this.f18998q, this.f18999r, this.f19003v);
            this.f19006y = new t1.b(new i4.v(jC), (t1.v1) s1.d0.f38568a.invoke(i4.v.f(jC)), null, 12);
        }
    }
}
