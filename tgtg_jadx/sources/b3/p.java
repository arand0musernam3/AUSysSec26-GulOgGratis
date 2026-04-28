package b3;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import z4.c0;
import z4.m1;
import z4.t0;
import z4.u0;
import z4.v0;
import z4.w0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements u0 {
    @Override // z4.u0
    public final v0 c(w0 w0Var, List list, long j9) {
        int iQ0;
        int iMax;
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            t0 t0Var = (t0) list.get(i12);
            if (Intrinsics.areEqual(c0.j(t0Var), "action")) {
                long j11 = j9;
                m1 m1VarD = t0Var.D(j11);
                int i13 = (z5.a.i(j11) - m1VarD.f47183a) - w0Var.q0(s.f5636e);
                int iK = z5.a.k(j11);
                int i14 = i13 < iK ? iK : i13;
                int size2 = list.size();
                int i15 = 0;
                while (i15 < size2) {
                    t0 t0Var2 = (t0) list.get(i15);
                    if (Intrinsics.areEqual(c0.j(t0Var2), TextBundle.TEXT_ENTRY)) {
                        m1 m1VarD2 = t0Var2.D(z5.a.b(j11, 0, i14, 0, 0, 9));
                        z4.o oVar = z4.d.f47100a;
                        int iB0 = m1VarD2.b0(oVar);
                        int iB02 = m1VarD2.b0(z4.d.f47101b);
                        boolean z11 = true;
                        boolean z12 = (iB0 == Integer.MIN_VALUE || iB02 == Integer.MIN_VALUE) ? false : true;
                        if (iB0 != iB02 && z12) {
                            z11 = false;
                        }
                        int i16 = z5.a.i(j9) - m1VarD.f47183a;
                        if (z11) {
                            iMax = Math.max(w0Var.q0(s.f5637f), m1VarD.f47184b);
                            iQ0 = (iMax - m1VarD2.f47184b) / 2;
                            int iB03 = m1VarD.b0(oVar);
                            if (iB03 != Integer.MIN_VALUE) {
                                i11 = (iB0 + iQ0) - iB03;
                            }
                        } else {
                            iQ0 = w0Var.q0(s.f5632a) - iB0;
                            iMax = Math.max(w0Var.q0(s.f5638g), m1VarD2.f47184b + iQ0);
                            i11 = (iMax - m1VarD.f47184b) / 2;
                        }
                        return w0.f(w0Var, z5.a.i(j9), iMax, new o(m1VarD2, iQ0, m1VarD, i16, i11));
                    }
                    i15++;
                    j11 = j9;
                }
                throw i.s("Collection contains no element matching the predicate.");
            }
        }
        throw i.s("Collection contains no element matching the predicate.");
    }
}
