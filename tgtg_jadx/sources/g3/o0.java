package g3;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements z4.u0 {
    @Override // z4.u0
    public final int a(z4.u uVar, List list, int i11) {
        int size = list.size();
        int iY = 0;
        for (int i12 = 0; i12 < size; i12++) {
            iY += ((z4.t) list.get(i12)).y(i11);
        }
        return iY;
    }

    @Override // z4.u0
    public final int b(z4.u uVar, List list, int i11) {
        int size = list.size();
        int iW = 0;
        for (int i12 = 0; i12 < size; i12++) {
            iW += ((z4.t) list.get(i12)).w(i11);
        }
        return iW;
    }

    @Override // z4.u0
    public final z4.v0 c(z4.w0 w0Var, List list, long j9) {
        Object obj;
        Object obj2;
        int size = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i11);
            if (Intrinsics.areEqual(z4.c0.j((z4.t0) obj), "leadingIcon")) {
                break;
            }
            i11++;
        }
        z4.t0 t0Var = (z4.t0) obj;
        final z4.m1 m1VarD = t0Var != null ? t0Var.D(z5.a.b(j9, 0, 0, 0, 0, 10)) : null;
        int i12 = m1VarD != null ? m1VarD.f47183a : 0;
        final int i13 = m1VarD != null ? m1VarD.f47184b : 0;
        int size2 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i14);
            if (Intrinsics.areEqual(z4.c0.j((z4.t0) obj2), "trailingIcon")) {
                break;
            }
            i14++;
        }
        z4.t0 t0Var2 = (z4.t0) obj2;
        final z4.m1 m1VarD2 = t0Var2 != null ? t0Var2.D(z5.a.b(j9, 0, 0, 0, 0, 10)) : null;
        int i15 = m1VarD2 != null ? m1VarD2.f47183a : 0;
        final int i16 = m1VarD2 != null ? m1VarD2.f47184b : 0;
        int size3 = list.size();
        int i17 = 0;
        while (i17 < size3) {
            z4.t0 t0Var3 = (z4.t0) list.get(i17);
            if (Intrinsics.areEqual(z4.c0.j(t0Var3), AnnotatedPrivateKey.LABEL)) {
                final z4.m1 m1VarD3 = t0Var3.D(z5.b.j(-(i12 + i15), 0, 2, j9));
                int i18 = m1VarD3.f47183a + i12 + i15;
                final int iMax = Math.max(i13, Math.max(m1VarD3.f47184b, i16));
                final int i19 = i12;
                return z4.w0.f(w0Var, i18, iMax, new Function1() { // from class: g3.n0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        z4.l1 l1Var = (z4.l1) obj3;
                        z4.m1 m1Var = m1VarD;
                        int i21 = iMax;
                        if (m1Var != null) {
                            z4.l1.o(l1Var, m1Var, 0, e0.f.a(1, 0.0f, (i21 - i13) / 2.0f));
                        }
                        z4.m1 m1Var2 = m1VarD3;
                        int i22 = i19;
                        z4.l1.o(l1Var, m1Var2, i22, 0);
                        z4.m1 m1Var3 = m1VarD2;
                        if (m1Var3 != null) {
                            z4.l1.o(l1Var, m1Var3, i22 + m1Var2.f47183a, e0.f.a(1, 0.0f, (i21 - i16) / 2.0f));
                        }
                        return Unit.f26487a;
                    }
                });
            }
            i17++;
            i12 = i12;
            i13 = i13;
        }
        throw b3.i.s("Collection contains no element matching the predicate.");
    }

    @Override // z4.u0
    public final int d(z4.u uVar, List list, int i11) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((z4.t) list.get(0)).b(i11));
            int i12 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((z4.t) list.get(i12)).b(i11));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i12 == size) {
                        break;
                    }
                    i12++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // z4.u0
    public final int e(z4.u uVar, List list, int i11) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((z4.t) list.get(0)).V(i11));
            int i12 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((z4.t) list.get(i12)).V(i11));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i12 == size) {
                        break;
                    }
                    i12++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
