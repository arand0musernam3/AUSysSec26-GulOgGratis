package g3;

import com.braze.models.inappmessage.InAppMessageBase;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i4 implements z4.u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function0 f18804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f18805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f18806c;

    public i4(Function0 function0, Function2 function2, boolean z11) {
        this.f18804a = function0;
        this.f18805b = function2;
        this.f18806c = z11;
    }

    @Override // z4.u0
    public final z4.v0 c(final z4.w0 w0Var, List list, long j9) {
        Object obj;
        final z4.m1 m1VarD;
        z4.m1 m1VarD2;
        i4 i4Var = this;
        float fFloatValue = ((Number) i4Var.f18804a.invoke()).floatValue();
        float f11 = fFloatValue >= 0.0f ? fFloatValue : 0.0f;
        long jB = z5.a.b(j9, 0, 0, 0, 0, 10);
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            z4.t0 t0Var = (z4.t0) list.get(i11);
            if (Intrinsics.areEqual(z4.c0.j(t0Var), InAppMessageBase.ICON)) {
                final z4.m1 m1VarD3 = t0Var.D(jB);
                char c3 = 2;
                float f12 = 2;
                int iQ0 = w0Var.q0(j4.f18885d * f12) + m1VarD3.f47183a;
                int iB = j80.c.b(iQ0 * f11);
                int iQ02 = w0Var.q0(j4.f18886e * f12) + m1VarD3.f47184b;
                int size2 = list.size();
                int i12 = 0;
                while (i12 < size2) {
                    z4.t0 t0Var2 = (z4.t0) list.get(i12);
                    char c7 = c3;
                    final float f13 = f11;
                    if (Intrinsics.areEqual(z4.c0.j(t0Var2), "indicatorRipple")) {
                        if (!((iQ0 >= 0) & (iQ02 >= 0))) {
                            z5.i.a("width and height must be >= 0");
                        }
                        final z4.m1 m1VarD4 = t0Var2.D(z5.b.h(iQ0, iQ0, iQ02, iQ02));
                        int size3 = list.size();
                        int i13 = 0;
                        while (true) {
                            if (i13 >= size3) {
                                obj = null;
                                break;
                            }
                            obj = list.get(i13);
                            if (Intrinsics.areEqual(z4.c0.j((z4.t0) obj), "indicator")) {
                                break;
                            }
                            i13++;
                        }
                        z4.t0 t0Var3 = (z4.t0) obj;
                        if (t0Var3 != null) {
                            if (!((iB >= 0) & (iQ02 >= 0))) {
                                z5.i.a("width and height must be >= 0");
                            }
                            m1VarD = t0Var3.D(z5.b.h(iB, iB, iQ02, iQ02));
                        } else {
                            m1VarD = null;
                        }
                        Function2 function2 = i4Var.f18805b;
                        if (function2 != null) {
                            int size4 = list.size();
                            for (int i14 = 0; i14 < size4; i14++) {
                                z4.t0 t0Var4 = (z4.t0) list.get(i14);
                                if (Intrinsics.areEqual(z4.c0.j(t0Var4), AnnotatedPrivateKey.LABEL)) {
                                    m1VarD2 = t0Var4.D(jB);
                                }
                            }
                            throw b3.i.s("Collection contains no element matching the predicate.");
                        }
                        m1VarD2 = null;
                        if (function2 == null) {
                            final int iQ03 = z5.a.i(j9) == Integer.MAX_VALUE ? (w0Var.q0(j4.f18888g) * 2) + m1VarD3.f47183a : z5.a.i(j9);
                            final int iF = z5.b.f(w0Var.q0(j4.f18882a), j9);
                            final int i15 = (iQ03 - m1VarD3.f47183a) / 2;
                            final int i16 = (iF - m1VarD3.f47184b) / 2;
                            final int i17 = (iQ03 - m1VarD4.f47183a) / 2;
                            final int i18 = (iF - m1VarD4.f47184b) / 2;
                            return z4.w0.f(w0Var, iQ03, iF, new Function1() { // from class: g3.f4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    z4.l1 l1Var = (z4.l1) obj2;
                                    z4.m1 m1Var = m1VarD;
                                    if (m1Var != null) {
                                        z4.l1.o(l1Var, m1Var, (iQ03 - m1Var.f47183a) / 2, (iF - m1Var.f47184b) / 2);
                                    }
                                    z4.l1.o(l1Var, m1VarD3, i15, i16);
                                    z4.l1.o(l1Var, m1VarD4, i17, i18);
                                    return Unit.f26487a;
                                }
                            });
                        }
                        m1VarD2.getClass();
                        float f14 = m1VarD3.f47184b;
                        float f15 = j4.f18886e;
                        float fC0 = w0Var.c0(f15) + f14;
                        float f16 = j4.f18884c;
                        float fC02 = w0Var.c0(f16) + fC0 + m1VarD2.f47184b;
                        float fJ = (z5.a.j(j9) - fC02) / f12;
                        float fC03 = w0Var.c0(f15);
                        if (fJ < fC03) {
                            fJ = fC03;
                        }
                        float f17 = (fJ * f12) + fC02;
                        final boolean z11 = i4Var.f18806c;
                        final float f18 = (1 - f13) * ((z11 ? fJ : (f17 - m1VarD3.f47184b) / f12) - fJ);
                        final float fC04 = w0Var.c0(f16) + w0Var.c0(f15) + m1VarD3.f47184b + fJ;
                        final int iQ04 = z5.a.i(j9) == Integer.MAX_VALUE ? (w0Var.q0(j4.f18888g) * 2) + m1VarD3.f47183a : z5.a.i(j9);
                        final int i19 = (iQ04 - m1VarD2.f47183a) / 2;
                        final int i21 = (iQ04 - m1VarD3.f47183a) / 2;
                        final int i22 = (iQ04 - m1VarD4.f47183a) / 2;
                        final float fC05 = fJ - w0Var.c0(f15);
                        final z4.m1 m1Var = m1VarD2;
                        final z4.m1 m1Var2 = m1VarD;
                        final float f19 = fJ;
                        return z4.w0.f(w0Var, iQ04, j80.c.b(f17), new Function1() { // from class: g3.e4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                z4.l1 l1Var = (z4.l1) obj2;
                                z4.m1 m1Var3 = m1Var2;
                                float f20 = f18;
                                float f21 = f19;
                                if (m1Var3 != null) {
                                    z4.l1.o(l1Var, m1Var3, (iQ04 - m1Var3.f47183a) / 2, j80.c.b((f21 - w0Var.q0(j4.f18886e)) + f20));
                                }
                                if (z11 || f13 != 0.0f) {
                                    z4.l1.o(l1Var, m1Var, i19, j80.c.b(fC04 + f20));
                                }
                                z4.l1.o(l1Var, m1VarD3, i21, j80.c.b(f21 + f20));
                                z4.l1.o(l1Var, m1VarD4, i22, j80.c.b(fC05 + f20));
                                return Unit.f26487a;
                            }
                        });
                    }
                    i12++;
                    i4Var = this;
                    c3 = c7;
                    f11 = f13;
                }
                throw b3.i.s("Collection contains no element matching the predicate.");
            }
            i11++;
            i4Var = this;
        }
        throw b3.i.s("Collection contains no element matching the predicate.");
    }
}
