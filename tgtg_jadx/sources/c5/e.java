package c5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static e f7173e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final x5.j f7174f = x5.j.Rtl;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final x5.j f7175g = x5.j.Ltr;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m5.q0 f7176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j5.t f7177d;

    @Override // c5.b
    public final int[] g(int i11) {
        int iE;
        m5.q0 q0Var = null;
        if (l().length() > 0 && i11 < l().length()) {
            try {
                j5.t tVar = this.f7177d;
                if (tVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("node");
                    tVar = null;
                }
                h4.c cVarG = tVar.g();
                int iRound = Math.round(cVarG.f21383d - cVarG.f21381b);
                if (i11 <= 0) {
                    i11 = 0;
                }
                m5.q0 q0Var2 = this.f7176c;
                if (q0Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    q0Var2 = null;
                }
                int iD = q0Var2.f29618b.d(i11);
                m5.q0 q0Var3 = this.f7176c;
                if (q0Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    q0Var3 = null;
                }
                float f11 = q0Var3.f29618b.f(iD) + iRound;
                m5.q0 q0Var4 = this.f7176c;
                if (q0Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    q0Var4 = null;
                }
                m5.q0 q0Var5 = this.f7176c;
                if (q0Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    q0Var5 = null;
                }
                float f12 = q0Var4.f29618b.f(q0Var5.f29618b.f29628f - 1);
                m5.q0 q0Var6 = this.f7176c;
                if (f11 < f12) {
                    if (q0Var6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    } else {
                        q0Var = q0Var6;
                    }
                    iE = q0Var.f29618b.e(f11);
                } else {
                    if (q0Var6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    } else {
                        q0Var = q0Var6;
                    }
                    iE = q0Var.f29618b.f29628f;
                }
                return k(i11, z(iE - 1, f7175g) + 1);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // c5.b
    public final int[] t(int i11) {
        int iE;
        m5.q0 q0Var = null;
        if (l().length() > 0 && i11 > 0) {
            try {
                j5.t tVar = this.f7177d;
                if (tVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("node");
                    tVar = null;
                }
                h4.c cVarG = tVar.g();
                int iRound = Math.round(cVarG.f21383d - cVarG.f21381b);
                int length = l().length();
                if (length <= i11) {
                    i11 = length;
                }
                m5.q0 q0Var2 = this.f7176c;
                if (q0Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    q0Var2 = null;
                }
                int iD = q0Var2.f29618b.d(i11);
                m5.q0 q0Var3 = this.f7176c;
                if (q0Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    q0Var3 = null;
                }
                float f11 = q0Var3.f29618b.f(iD) - iRound;
                if (f11 > 0.0f) {
                    m5.q0 q0Var4 = this.f7176c;
                    if (q0Var4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    } else {
                        q0Var = q0Var4;
                    }
                    iE = q0Var.f29618b.e(f11);
                } else {
                    iE = 0;
                }
                if (i11 == l().length() && iE < iD) {
                    iE++;
                }
                return k(z(iE, f7174f), i11);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    public final int z(int i11, x5.j jVar) {
        m5.q0 q0Var = this.f7176c;
        m5.q0 q0Var2 = null;
        if (q0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            q0Var = null;
        }
        int i12 = q0Var.i(i11);
        m5.q0 q0Var3 = this.f7176c;
        if (q0Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            q0Var3 = null;
        }
        x5.j jVarJ = q0Var3.j(i12);
        m5.q0 q0Var4 = this.f7176c;
        if (jVar != jVarJ) {
            if (q0Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            } else {
                q0Var2 = q0Var4;
            }
            return q0Var2.i(i11);
        }
        if (q0Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
        } else {
            q0Var2 = q0Var4;
        }
        return m5.q0.f(q0Var2, i11) - 1;
    }
}
