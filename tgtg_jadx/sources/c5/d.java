package c5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static d f7152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x5.j f7153e = x5.j.Rtl;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final x5.j f7154f = x5.j.Ltr;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m5.q0 f7155c;

    @Override // c5.b
    public final int[] g(int i11) {
        int iD;
        if (l().length() > 0 && i11 < l().length()) {
            m5.q0 q0Var = this.f7155c;
            x5.j jVar = f7153e;
            if (i11 < 0) {
                if (q0Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    q0Var = null;
                }
                iD = q0Var.f29618b.d(0);
            } else {
                if (q0Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    q0Var = null;
                }
                int iD2 = q0Var.f29618b.d(i11);
                iD = z(iD2, jVar) == i11 ? iD2 : iD2 + 1;
            }
            m5.q0 q0Var2 = this.f7155c;
            if (q0Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                q0Var2 = null;
            }
            if (iD < q0Var2.f29618b.f29628f) {
                return k(z(iD, jVar), z(iD, f7154f) + 1);
            }
        }
        return null;
    }

    @Override // c5.b
    public final int[] t(int i11) {
        int iD;
        if (l().length() > 0 && i11 > 0) {
            int length = l().length();
            m5.q0 q0Var = this.f7155c;
            x5.j jVar = f7154f;
            if (i11 > length) {
                if (q0Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    q0Var = null;
                }
                iD = q0Var.f29618b.d(l().length());
            } else {
                if (q0Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    q0Var = null;
                }
                int iD2 = q0Var.f29618b.d(i11);
                iD = z(iD2, jVar) + 1 == i11 ? iD2 : iD2 - 1;
            }
            if (iD >= 0) {
                return k(z(iD, f7153e), z(iD, jVar) + 1);
            }
        }
        return null;
    }

    public final int z(int i11, x5.j jVar) {
        m5.q0 q0Var = this.f7155c;
        m5.q0 q0Var2 = null;
        if (q0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            q0Var = null;
        }
        int i12 = q0Var.i(i11);
        m5.q0 q0Var3 = this.f7155c;
        if (q0Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            q0Var3 = null;
        }
        x5.j jVarJ = q0Var3.j(i12);
        m5.q0 q0Var4 = this.f7155c;
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
