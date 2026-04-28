package g3;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j8 implements z4.u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u70.f f18909b;

    public /* synthetic */ j8(u70.f fVar, int i11) {
        this.f18908a = i11;
        this.f18909b = fVar;
    }

    @Override // z4.u0
    public final z4.v0 c(final z4.w0 w0Var, List list, long j9) {
        final z4.m1 m1VarD;
        switch (this.f18908a) {
            case 0:
                final z4.m1 m1Var = null;
                if (((Function2) this.f18909b) != null) {
                    int size = list.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        z4.t0 t0Var = (z4.t0) list.get(i11);
                        if (Intrinsics.areEqual(z4.c0.j(t0Var), TextBundle.TEXT_ENTRY)) {
                            m1VarD = t0Var.D(z5.a.b(j9, 0, 0, 0, 0, 11));
                        }
                    }
                    throw b3.i.s("Collection contains no element matching the predicate.");
                }
                m1VarD = null;
                final int iMax = Math.max(m1VarD != null ? m1VarD.f47183a : 0, 0);
                final int iMax2 = Math.max(w0Var.q0(k8.f18977a), w0Var.j0(k8.f18981e) + 0 + (m1VarD != null ? m1VarD.f47184b : 0));
                final Integer numValueOf = m1VarD != null ? Integer.valueOf(m1VarD.b0(z4.d.f47100a)) : null;
                final Integer numValueOf2 = m1VarD != null ? Integer.valueOf(m1VarD.b0(z4.d.f47101b)) : null;
                return z4.w0.f(w0Var, iMax, iMax2, new Function1() { // from class: g3.i8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        z4.l1 l1Var = (z4.l1) obj;
                        z4.m1 m1Var2 = m1VarD;
                        z4.m1 m1Var3 = m1Var;
                        int i12 = iMax2;
                        if (m1Var2 != null && m1Var3 != null) {
                            Integer num = numValueOf;
                            num.getClass();
                            int iIntValue = num.intValue();
                            Integer num2 = numValueOf2;
                            num2.getClass();
                            int iIntValue2 = num2.intValue();
                            float f11 = iIntValue == iIntValue2 ? k8.f18979c : k8.f18980d;
                            z4.w0 w0Var2 = w0Var;
                            int iQ0 = w0Var2.q0(l3.n0.f27058b) + w0Var2.q0(f11);
                            int iJ0 = (w0Var2.j0(k8.f18981e) + m1Var3.f47184b) - iIntValue;
                            int i13 = m1Var2.f47183a;
                            int i14 = iMax;
                            int i15 = (i12 - iIntValue2) - iQ0;
                            z4.l1.o(l1Var, m1Var2, (i14 - i13) / 2, i15);
                            z4.l1.o(l1Var, m1Var3, (i14 - m1Var3.f47183a) / 2, i15 - iJ0);
                        } else if (m1Var2 != null) {
                            float f12 = k8.f18977a;
                            z4.l1.o(l1Var, m1Var2, 0, (i12 - m1Var2.f47184b) / 2);
                        } else if (m1Var3 != null) {
                            float f13 = k8.f18977a;
                            z4.l1.o(l1Var, m1Var3, 0, (i12 - m1Var3.f47184b) / 2);
                        }
                        return Unit.f26487a;
                    }
                });
            default:
                return z4.w0.f(w0Var, z5.a.i(j9), z5.a.h(j9), new hb0.o(28, list, this));
        }
    }
}
