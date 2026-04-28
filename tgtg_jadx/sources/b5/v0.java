package b5;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v0 extends u0 implements z4.t0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s1 f6007p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LinkedHashMap f6009r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public z4.v0 f6011t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final q1.n0 f6012u;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f6008q = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z4.s0 f6010s = new z4.s0(this);

    public v0(s1 s1Var) {
        this.f6007p = s1Var;
        q1.n0 n0Var = q1.a1.f35713a;
        this.f6012u = new q1.n0();
    }

    public static final void S0(v0 v0Var, z4.v0 v0Var2) {
        LinkedHashMap linkedHashMap;
        if (v0Var2 != null) {
            v0Var.o0((((long) v0Var2.getHeight()) & 4294967295L) | (((long) v0Var2.b()) << 32));
        } else {
            v0Var.o0(0L);
        }
        if (!Intrinsics.areEqual(v0Var.f6011t, v0Var2) && v0Var2 != null && ((((linkedHashMap = v0Var.f6009r) != null && !linkedHashMap.isEmpty()) || !v0Var2.c().isEmpty()) && !Intrinsics.areEqual(v0Var2.c(), v0Var.f6009r))) {
            z0 z0Var = v0Var.f6007p.f5966p.H.f5943q;
            z0Var.getClass();
            z0Var.f6031s.f();
            LinkedHashMap linkedHashMap2 = v0Var.f6009r;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                v0Var.f6009r = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(v0Var2.c());
        }
        v0Var.f6011t = v0Var2;
    }

    @Override // b5.u0
    public final u0 E0() {
        s1 s1Var = this.f6007p.f5967q;
        if (s1Var != null) {
            return s1Var.b1();
        }
        return null;
    }

    @Override // b5.u0
    public final z4.z F0() {
        return this.f6010s;
    }

    @Override // z4.m1, z4.t
    public final Object G() {
        return this.f6007p.G();
    }

    @Override // b5.u0
    public final boolean H0() {
        return this.f6011t != null;
    }

    @Override // b5.u0
    public final m0 I0() {
        return this.f6007p.f5966p;
    }

    @Override // b5.u0
    public final z4.v0 L0() {
        z4.v0 v0Var = this.f6011t;
        if (v0Var != null) {
            return v0Var;
        }
        throw b3.i.D("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // b5.u0
    public final u0 M0() {
        s1 s1Var = this.f6007p.f5968r;
        if (s1Var != null) {
            return s1Var.b1();
        }
        return null;
    }

    @Override // b5.u0
    public final long N0() {
        return this.f6008q;
    }

    @Override // b5.u0
    public final void R0() {
        h0(this.f6008q, 0.0f, null);
    }

    public void T0() {
        L0().a();
    }

    public final void U0(long j9) {
        if (!z5.j.b(this.f6008q, j9)) {
            this.f6008q = j9;
            s1 s1Var = this.f6007p;
            z0 z0Var = s1Var.f5966p.H.f5943q;
            if (z0Var != null) {
                z0Var.C0();
            }
            u0.P0(s1Var);
        }
        if (this.f5997k) {
            return;
        }
        C0(L0());
    }

    public final long V0(v0 v0Var, boolean z11) {
        long jD = 0;
        v0 v0VarB1 = this;
        while (!Intrinsics.areEqual(v0VarB1, v0Var)) {
            if (!v0VarB1.f5995i || !z11) {
                jD = z5.j.d(jD, v0VarB1.f6008q);
            }
            s1 s1Var = v0VarB1.f6007p.f5968r;
            s1Var.getClass();
            v0VarB1 = s1Var.b1();
            v0VarB1.getClass();
        }
        return jD;
    }

    @Override // z5.c
    public final float X() {
        return this.f6007p.X();
    }

    @Override // b5.u0, z4.u
    public final boolean Z() {
        return true;
    }

    @Override // z5.c
    public final float a() {
        return this.f6007p.a();
    }

    @Override // z4.u
    public final z5.m getLayoutDirection() {
        return this.f6007p.f5966p.A;
    }

    @Override // z4.m1
    public final void h0(long j9, float f11, Function1 function1) {
        U0(j9);
        if (this.f5996j) {
            return;
        }
        T0();
    }
}
