package c6;

import android.graphics.Canvas;
import androidx.compose.ui.node.Owner;
import b5.m0;
import com.braze.h2;
import g4.g0;
import i4.s0;
import i4.z0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import m3.c3;
import s1.c1;
import s1.h0;
import s1.l1;
import s1.n0;
import s1.x0;
import s1.y0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7689d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d0 d0Var, m0 m0Var, d0 d0Var2) {
        super(1);
        this.f7686a = 0;
        this.f7687b = d0Var;
        this.f7689d = m0Var;
        this.f7688c = d0Var2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zBooleanValue;
        z0 z0Var;
        switch (this.f7686a) {
            case 0:
                d0 d0Var = (d0) this.f7687b;
                m0 m0Var = (m0) this.f7689d;
                d0 d0Var2 = (d0) this.f7688c;
                i4.t tVarI = ((k4.d) obj).g0().i();
                if (d0Var.getView().getVisibility() != 8) {
                    d0Var.f7722y = true;
                    Owner owner = m0Var.f5878o;
                    c5.y yVar = owner instanceof c5.y ? (c5.y) owner : null;
                    if (yVar != null) {
                        Canvas canvasA = i4.d.a(tVarI);
                        yVar.getAndroidViewsHandler$ui().getClass();
                        d0Var2.draw(canvasA);
                    }
                    d0Var.f7722y = false;
                }
                return Unit.f26487a;
            case 1:
                g0 g0Var = (g0) obj;
                if (Intrinsics.areEqual(g0Var, (g0) this.f7687b)) {
                    zBooleanValue = false;
                } else {
                    if (Intrinsics.areEqual(g0Var, ((g4.p) this.f7688c).f19964c)) {
                        h2.b("Focus search landed at the root.");
                        return null;
                    }
                    zBooleanValue = ((Boolean) ((Function1) this.f7689d).invoke(g0Var)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            case 2:
                return new i3.a((z3.r) this.f7687b, this.f7688c, (s1.s) this.f7689d, 2);
            case 3:
                s0 s0Var = (s0) obj;
                c3 c3Var = (c3) this.f7688c;
                c3 c3Var2 = (c3) this.f7687b;
                s0Var.c(c3Var2 != null ? ((Number) c3Var2.getValue()).floatValue() : 1.0f);
                s0Var.o(c3Var != null ? ((Number) c3Var.getValue()).floatValue() : 1.0f);
                s0Var.p(c3Var != null ? ((Number) c3Var.getValue()).floatValue() : 1.0f);
                c3 c3Var3 = (c3) this.f7689d;
                s0Var.w(c3Var3 != null ? ((z0) c3Var3.getValue()).f23337a : z0.f23335b);
                return Unit.f26487a;
            default:
                l1 l1Var = ((x0) this.f7688c).f38730a;
                y0 y0Var = (y0) this.f7689d;
                int i11 = n0.$EnumSwitchMapping$0[((h0) obj).ordinal()];
                if (i11 != 1) {
                    z0Var = null;
                    if (i11 == 2) {
                        c1 c1Var = l1Var.f38644d;
                        if (c1Var != null) {
                            z0Var = new z0(c1Var.f38557b);
                        } else {
                            c1 c1Var2 = y0Var.f38733a.f38644d;
                            if (c1Var2 != null) {
                                z0Var = new z0(c1Var2.f38557b);
                            }
                        }
                    } else {
                        if (i11 != 3) {
                            e40.a.f();
                            return null;
                        }
                        c1 c1Var3 = y0Var.f38733a.f38644d;
                        if (c1Var3 != null) {
                            z0Var = new z0(c1Var3.f38557b);
                        } else {
                            c1 c1Var4 = l1Var.f38644d;
                            if (c1Var4 != null) {
                                z0Var = new z0(c1Var4.f38557b);
                            }
                        }
                    }
                } else {
                    z0Var = (z0) this.f7687b;
                }
                return new z0(z0Var != null ? z0Var.f23337a : z0.f23335b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, Object obj2, Object obj3, int i11) {
        super(1);
        this.f7686a = i11;
        this.f7687b = obj;
        this.f7688c = obj2;
        this.f7689d = obj3;
    }
}
