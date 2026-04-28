package s1;

import kotlin.jvm.functions.Function0;
import t1.m1;
import t1.q1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends d2.j1 {
    public final v0 A;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public q1 f38716p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public m1 f38717q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public m1 f38718r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public m1 f38719s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public x0 f38720t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public y0 f38721u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Function0 f38722v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public j0 f38723w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f38724x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public b4.f f38725y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final v0 f38726z;

    public w0(q1 q1Var, m1 m1Var, m1 m1Var2, m1 m1Var3, x0 x0Var, y0 y0Var, Function0 function0, j0 j0Var) {
        super(1);
        this.f38716p = q1Var;
        this.f38717q = m1Var;
        this.f38718r = m1Var2;
        this.f38719s = m1Var3;
        this.f38720t = x0Var;
        this.f38721u = y0Var;
        this.f38722v = function0;
        this.f38723w = j0Var;
        this.f38724x = b0.f38528a;
        z5.b.b(0, 0, 15);
        this.f38726z = new v0(this, 0);
        this.A = new v0(this, 1);
    }

    public final b4.f N0() {
        b4.f fVar;
        b4.f fVar2;
        if (this.f38716p.f().b(h0.PreEnter, h0.Visible)) {
            c0 c0Var = this.f38720t.f38730a.f38643c;
            if (c0Var != null && (fVar2 = c0Var.f38553a) != null) {
                return fVar2;
            }
            c0 c0Var2 = this.f38721u.f38733a.f38643c;
            if (c0Var2 != null) {
                return c0Var2.f38553a;
            }
            return null;
        }
        c0 c0Var3 = this.f38721u.f38733a.f38643c;
        if (c0Var3 != null && (fVar = c0Var3.f38553a) != null) {
            return fVar;
        }
        c0 c0Var4 = this.f38720t.f38730a.f38643c;
        if (c0Var4 != null) {
            return c0Var4.f38553a;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    @Override // d2.j1, b5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final z4.v0 mo58measure3p2s80s(z4.w0 r23, z4.t0 r24, long r25) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.w0.mo58measure3p2s80s(z4.w0, z4.t0, long):z4.v0");
    }

    @Override // b4.s
    public final void onAttach() {
        this.f38724x = b0.f38528a;
    }
}
