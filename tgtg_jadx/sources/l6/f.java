package l6;

import f6.t;
import java.util.HashMap;
import n6.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends k6.g {
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public float I0;
    public float J0;
    public float K0;
    public float L0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public n6.j f27399n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public HashMap f27400o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public HashMap f27401p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public HashMap f27402q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f27403r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f27404s0;
    public int t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f27405u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f27406v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f27407w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f27408x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f27409y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f27410z0;

    public f(t tVar, k6.l lVar) {
        super(tVar, lVar);
        this.f27403r0 = 0;
        this.f27404s0 = -1;
        this.t0 = -1;
        this.f27405u0 = -1;
        this.f27406v0 = -1;
        this.f27407w0 = -1;
        this.f27408x0 = -1;
        this.f27409y0 = 2;
        this.f27410z0 = 2;
        this.A0 = 0;
        this.B0 = 0;
        this.C0 = 0;
        this.D0 = 0;
        this.E0 = 0;
        this.F0 = 0;
        this.G0 = -1;
        this.H0 = 0;
        this.I0 = 0.5f;
        this.J0 = 0.5f;
        this.K0 = 0.5f;
        this.L0 = 0.5f;
        if (lVar == k6.l.VERTICAL_FLOW) {
            this.H0 = 1;
        }
    }

    @Override // k6.g, k6.b, k6.h
    public final void apply() {
        s();
        a(this.f27399n0);
        n6.j jVar = this.f27399n0;
        jVar.f30641a1 = this.H0;
        jVar.Y0 = this.f27403r0;
        int i11 = this.G0;
        if (i11 != -1) {
            jVar.Z0 = i11;
        }
        int i12 = this.C0;
        if (i12 != 0) {
            jVar.B0 = i12;
        }
        int i13 = this.E0;
        if (i13 != 0) {
            jVar.f30657x0 = i13;
        }
        int i14 = this.D0;
        if (i14 != 0) {
            jVar.C0 = i14;
        }
        int i15 = this.F0;
        if (i15 != 0) {
            jVar.f30658y0 = i15;
        }
        int i16 = this.B0;
        if (i16 != 0) {
            jVar.U0 = i16;
        }
        int i17 = this.A0;
        if (i17 != 0) {
            jVar.V0 = i17;
        }
        float f11 = this.f26007h;
        if (f11 != 0.5f) {
            jVar.O0 = f11;
        }
        float f12 = this.K0;
        if (f12 != 0.5f) {
            jVar.Q0 = f12;
        }
        float f13 = this.L0;
        if (f13 != 0.5f) {
            jVar.S0 = f13;
        }
        float f14 = this.f26009i;
        if (f14 != 0.5f) {
            jVar.P0 = f14;
        }
        float f15 = this.I0;
        if (f15 != 0.5f) {
            jVar.R0 = f15;
        }
        float f16 = this.J0;
        if (f16 != 0.5f) {
            jVar.T0 = f16;
        }
        int i18 = this.f27410z0;
        if (i18 != 2) {
            jVar.W0 = i18;
        }
        int i19 = this.f27409y0;
        if (i19 != 2) {
            jVar.X0 = i19;
        }
        int i21 = this.f27404s0;
        if (i21 != -1) {
            jVar.J0 = i21;
        }
        int i22 = this.t0;
        if (i22 != -1) {
            jVar.L0 = i22;
        }
        int i23 = this.f27405u0;
        if (i23 != -1) {
            jVar.N0 = i23;
        }
        int i24 = this.f27406v0;
        if (i24 != -1) {
            jVar.I0 = i24;
        }
        int i25 = this.f27407w0;
        if (i25 != -1) {
            jVar.K0 = i25;
        }
        int i26 = this.f27408x0;
        if (i26 != -1) {
            jVar.M0 = i26;
        }
        r();
    }

    @Override // k6.g
    public final m s() {
        if (this.f27399n0 == null) {
            this.f27399n0 = new n6.j();
        }
        return this.f27399n0;
    }
}
