package h2;

import z1.h2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends b4.s implements b5.c0, z4.i, z4.f {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final r f21226s = new r();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public v f21227o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public o f21228p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f21229q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public h2 f21230r;

    public final boolean L0(n nVar, int i11) {
        if (i11 == 5 || i11 == 6) {
            if (this.f21230r == h2.Horizontal) {
                return false;
            }
        } else if (i11 == 3 || i11 == 4) {
            if (this.f21230r == h2.Vertical) {
                return false;
            }
        } else if (i11 != 1 && i11 != 2) {
            com.braze.h2.b("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        if (M0(i11)) {
            if (nVar.f21181b >= this.f21227o.a() - 1) {
                return false;
            }
        } else if (nVar.f21180a <= 0) {
            return false;
        }
        return true;
    }

    public final boolean M0(int i11) {
        if (i11 == 1) {
            return false;
        }
        if (i11 != 2) {
            if (i11 == 5) {
                return this.f21229q;
            }
            if (i11 == 6) {
                if (this.f21229q) {
                    return false;
                }
            } else if (i11 == 3) {
                int i12 = s.$EnumSwitchMapping$0[b5.m.g(this).A.ordinal()];
                if (i12 == 1) {
                    return this.f21229q;
                }
                if (i12 != 2) {
                    e40.a.f();
                    return false;
                }
                if (this.f21229q) {
                    return false;
                }
            } else {
                if (i11 != 4) {
                    com.braze.h2.b("Lazy list does not support beyond bounds layout for the specified direction");
                    return false;
                }
                int i13 = s.$EnumSwitchMapping$0[b5.m.g(this).A.ordinal()];
                if (i13 != 1) {
                    if (i13 == 2) {
                        return this.f21229q;
                    }
                    e40.a.f();
                    return false;
                }
                if (this.f21229q) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // b5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final z4.v0 mo58measure3p2s80s(z4.w0 w0Var, z4.t0 t0Var, long j9) {
        z4.m1 m1VarD = t0Var.D(j9);
        return z4.w0.f(w0Var, m1VarD.f47183a, m1VarD.f47184b, new d2.k(m1VarD, 9));
    }
}
