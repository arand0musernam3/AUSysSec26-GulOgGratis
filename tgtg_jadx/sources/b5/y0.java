package b5;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z0 f6018b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(z0 z0Var, int i11) {
        super(0);
        this.f6017a = i11;
        this.f6018b = z0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        v0 v0VarB1;
        switch (this.f6017a) {
            case 0:
                z0 z0Var = this.f6018b;
                q0 q0Var = z0Var.f6019f;
                q0Var.f5935h = 0;
                o3.e eVarA = q0Var.f5928a.A();
                Object[] objArr = eVarA.f31830a;
                int i11 = eVarA.f31832c;
                for (int i12 = 0; i12 < i11; i12++) {
                    z0 z0Var2 = ((m0) objArr[i12]).H.f5943q;
                    z0Var2.getClass();
                    z0Var2.f6021h = z0Var2.f6022i;
                    z0Var2.f6022i = Integer.MAX_VALUE;
                    if (z0Var2.f6023j == j0.InLayoutBlock) {
                        z0Var2.f6023j = j0.NotUsed;
                    }
                }
                z0Var.Q(d.f5775f);
                w wVar = z0Var.j().Z;
                if (wVar != null) {
                    boolean z11 = wVar.f5997k;
                    o3.b bVar = (o3.b) q0Var.f5928a.n();
                    int i13 = ((o3.e) bVar.f31822b).f31832c;
                    for (int i14 = 0; i14 < i13; i14++) {
                        v0 v0VarB12 = ((m0) bVar.get(i14)).G.f5858d.b1();
                        if (v0VarB12 != null) {
                            v0VarB12.f5997k = z11;
                        }
                    }
                }
                w wVar2 = z0Var.j().Z;
                wVar2.getClass();
                wVar2.L0().a();
                if (z0Var.j().Z != null) {
                    o3.b bVar2 = (o3.b) q0Var.f5928a.n();
                    int i15 = ((o3.e) bVar2.f31822b).f31832c;
                    for (int i16 = 0; i16 < i15; i16++) {
                        v0 v0VarB13 = ((m0) bVar2.get(i16)).G.f5858d.b1();
                        if (v0VarB13 != null) {
                            v0VarB13.f5997k = false;
                        }
                    }
                }
                o3.e eVarA2 = q0Var.f5928a.A();
                Object[] objArr2 = eVarA2.f31830a;
                int i17 = eVarA2.f31832c;
                for (int i18 = 0; i18 < i17; i18++) {
                    z0 z0Var3 = ((m0) objArr2[i18]).H.f5943q;
                    z0Var3.getClass();
                    int i19 = z0Var3.f6021h;
                    int i21 = z0Var3.f6022i;
                    if (i19 != i21 && i21 == Integer.MAX_VALUE) {
                        z0Var3.v0(true);
                    }
                }
                z0Var.Q(d.f5776g);
                break;
            case 1:
                z0 z0Var4 = this.f6018b;
                q0 q0Var2 = z0Var4.f6019f;
                z4.l1 placementScope = null;
                if (o.l(q0Var2.f5928a) || q0Var2.f5930c) {
                    s1 s1Var = q0Var2.a().f5968r;
                    if (s1Var != null) {
                        placementScope = s1Var.l;
                    }
                } else {
                    s1 s1Var2 = q0Var2.a().f5968r;
                    if (s1Var2 != null && (v0VarB1 = s1Var2.b1()) != null) {
                        placementScope = v0VarB1.l;
                    }
                }
                if (placementScope == null) {
                    placementScope = ((c5.y) p0.a(q0Var2.f5928a)).getPlacementScope();
                }
                v0 v0VarB14 = q0Var2.a().b1();
                v0VarB14.getClass();
                z4.l1.n(placementScope, v0VarB14, z0Var4.f6027o);
                break;
            default:
                z0 z0Var5 = this.f6018b;
                v0 v0VarB15 = z0Var5.f6019f.a().b1();
                v0VarB15.getClass();
                v0VarB15.D(z0Var5.f6038z);
                break;
        }
        return Unit.f26487a;
    }
}
