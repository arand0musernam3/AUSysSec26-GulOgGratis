package s1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import t1.n1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f38638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y0 f38639c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(x0 x0Var, y0 y0Var, int i11) {
        super(1);
        this.f38637a = i11;
        this.f38638b = x0Var;
        this.f38639c = y0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        t1.x xVar;
        t1.x xVar2;
        t1.x xVar3;
        t1.x xVar4;
        switch (this.f38637a) {
            case 0:
                n1 n1Var = (n1) obj;
                h0 h0Var = h0.PreEnter;
                h0 h0Var2 = h0.Visible;
                if (n1Var.b(h0Var, h0Var2)) {
                    z0 z0Var = this.f38638b.f38730a.f38641a;
                    return (z0Var == null || (xVar2 = z0Var.f38735b) == null) ? r0.f38670b : xVar2;
                }
                if (!n1Var.b(h0Var2, h0.PostExit)) {
                    return r0.f38670b;
                }
                z0 z0Var2 = this.f38639c.f38733a.f38641a;
                return (z0Var2 == null || (xVar = z0Var2.f38735b) == null) ? r0.f38670b : xVar;
            case 1:
                int i11 = l0.$EnumSwitchMapping$0[((h0) obj).ordinal()];
                float f11 = 1.0f;
                if (i11 != 1) {
                    if (i11 == 2) {
                        z0 z0Var3 = this.f38638b.f38730a.f38641a;
                        if (z0Var3 != null) {
                            f11 = z0Var3.f38734a;
                        }
                    } else {
                        if (i11 != 3) {
                            e40.a.f();
                            return null;
                        }
                        z0 z0Var4 = this.f38639c.f38733a.f38641a;
                        if (z0Var4 != null) {
                            f11 = z0Var4.f38734a;
                        }
                    }
                }
                return Float.valueOf(f11);
            case 2:
                n1 n1Var2 = (n1) obj;
                h0 h0Var3 = h0.PreEnter;
                h0 h0Var4 = h0.Visible;
                if (n1Var2.b(h0Var3, h0Var4)) {
                    c1 c1Var = this.f38638b.f38730a.f38644d;
                    return (c1Var == null || (xVar4 = c1Var.f38558c) == null) ? r0.f38670b : xVar4;
                }
                if (!n1Var2.b(h0Var4, h0.PostExit)) {
                    return r0.f38670b;
                }
                c1 c1Var2 = this.f38639c.f38733a.f38644d;
                return (c1Var2 == null || (xVar3 = c1Var2.f38558c) == null) ? r0.f38670b : xVar3;
            default:
                int i12 = m0.$EnumSwitchMapping$0[((h0) obj).ordinal()];
                float f12 = 1.0f;
                if (i12 != 1) {
                    if (i12 == 2) {
                        c1 c1Var3 = this.f38638b.f38730a.f38644d;
                        if (c1Var3 != null) {
                            f12 = c1Var3.f38556a;
                        }
                    } else {
                        if (i12 != 3) {
                            e40.a.f();
                            return null;
                        }
                        c1 c1Var4 = this.f38639c.f38733a.f38644d;
                        if (c1Var4 != null) {
                            f12 = c1Var4.f38556a;
                        }
                    }
                }
                return Float.valueOf(f12);
        }
    }
}
