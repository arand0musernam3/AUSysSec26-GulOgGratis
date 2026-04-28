package b5;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1 f5796b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(f1 f1Var, int i11) {
        super(0);
        this.f5795a = i11;
        this.f5796b = f1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        z4.l1 placementScope;
        switch (this.f5795a) {
            case 0:
                f1 f1Var = this.f5796b;
                q0 q0Var = f1Var.f5799f;
                q0Var.f5936i = 0;
                o3.e eVarA = q0Var.f5928a.A();
                Object[] objArr = eVarA.f31830a;
                int i11 = eVarA.f31832c;
                for (int i12 = 0; i12 < i11; i12++) {
                    f1 f1Var2 = ((m0) objArr[i12]).H.f5942p;
                    f1Var2.f5801h = f1Var2.f5802i;
                    f1Var2.f5802i = Integer.MAX_VALUE;
                    f1Var2.f5813u = false;
                    if (f1Var2.l == j0.InLayoutBlock) {
                        f1Var2.l = j0.NotUsed;
                    }
                }
                f1Var.Q(d.f5778i);
                if (f1Var.j().f5997k) {
                    o3.b bVar = (o3.b) q0Var.f5928a.n();
                    int i13 = ((o3.e) bVar.f31822b).f31832c;
                    for (int i14 = 0; i14 < i13; i14++) {
                        ((m0) bVar.get(i14)).G.f5858d.f5997k = true;
                    }
                }
                f1Var.j().L0().a();
                if (f1Var.j().f5997k) {
                    o3.b bVar2 = (o3.b) q0Var.f5928a.n();
                    int i15 = ((o3.e) bVar2.f31822b).f31832c;
                    for (int i16 = 0; i16 < i15; i16++) {
                        ((m0) bVar2.get(i16)).G.f5858d.f5997k = false;
                    }
                }
                m0 m0Var = q0Var.f5928a;
                o3.e eVarA2 = m0Var.A();
                Object[] objArr2 = eVarA2.f31830a;
                int i17 = eVarA2.f31832c;
                for (int i18 = 0; i18 < i17; i18++) {
                    m0 m0Var2 = (m0) objArr2[i18];
                    q0 q0Var2 = m0Var2.H;
                    if (q0Var2.f5942p.f5801h != m0Var2.x()) {
                        m0Var.P();
                        m0Var.D();
                        if (m0Var2.x() == Integer.MAX_VALUE) {
                            if (q0Var2.f5930c || o.l(m0Var2)) {
                                z0 z0Var = q0Var2.f5943q;
                                z0Var.getClass();
                                z0Var.v0(false);
                            }
                            q0Var2.f5942p.y0();
                        }
                    }
                }
                f1Var.Q(d.f5779j);
                break;
            case 1:
                f1 f1Var3 = this.f5796b;
                f1Var3.f5799f.a().D(f1Var3.C);
                break;
            default:
                f1 f1Var4 = this.f5796b;
                q0 q0Var3 = f1Var4.f5799f;
                s1 s1Var = q0Var3.a().f5968r;
                if (s1Var == null || (placementScope = s1Var.l) == null) {
                    placementScope = ((c5.y) p0.a(q0Var3.f5928a)).getPlacementScope();
                }
                Function1 function1 = f1Var4.H;
                l4.b bVar3 = f1Var4.I;
                if (bVar3 != null) {
                    s1 s1VarA = q0Var3.a();
                    long j9 = f1Var4.J;
                    float f11 = f1Var4.K;
                    placementScope.getClass();
                    z4.l1.b(placementScope, s1VarA);
                    s1VarA.l0(z5.j.d(j9, s1VarA.f47187e), f11, bVar3);
                } else if (function1 == null) {
                    s1 s1VarA2 = q0Var3.a();
                    long j11 = f1Var4.J;
                    float f12 = f1Var4.K;
                    placementScope.getClass();
                    z4.l1.b(placementScope, s1VarA2);
                    s1VarA2.h0(z5.j.d(j11, s1VarA2.f47187e), f12, null);
                } else {
                    s1 s1VarA3 = q0Var3.a();
                    long j12 = f1Var4.J;
                    float f13 = f1Var4.K;
                    placementScope.getClass();
                    z4.l1.b(placementScope, s1VarA3);
                    s1VarA3.h0(z5.j.d(j12, s1VarA3.f47187e), f13, function1);
                }
                break;
        }
        return Unit.f26487a;
    }
}
