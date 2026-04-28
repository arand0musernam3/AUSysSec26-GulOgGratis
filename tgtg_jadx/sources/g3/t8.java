package g3;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t8 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u3.d f19534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u3.d f19535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u3.d f19536d;

    public /* synthetic */ t8(u3.d dVar, u3.d dVar2, u3.d dVar3, int i11) {
        this.f19533a = i11;
        this.f19534b = dVar;
        this.f19535c = dVar2;
        this.f19536d = dVar3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19533a) {
            case 0:
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    b4.t tVarD = d2.m2.d(b4.q.f5711a, 1.0f);
                    u3.d dVar = this.f19534b;
                    boolean zF = sVar.f(dVar);
                    u3.d dVar2 = this.f19535c;
                    boolean zF2 = zF | sVar.f(dVar2);
                    u3.d dVar3 = this.f19536d;
                    boolean zF3 = zF2 | sVar.f(dVar3);
                    Object objM = sVar.M();
                    if (zF3 || objM == m3.m.f29332a) {
                        objM = new t8(dVar, dVar2, dVar3, 1);
                        sVar.k0(objM);
                    }
                    z4.c0.b(tVarD, (Function2) objM, sVar, 6, 0);
                } else {
                    sVar.U();
                }
                return Unit.f26487a;
            default:
                final z4.z1 z1Var = (z4.z1) obj;
                final z5.a aVar = (z5.a) obj2;
                final int i11 = z5.a.i(aVar.f47271a);
                List listI = z1Var.i(c9.Tabs, this.f19534b);
                int size = listI.size();
                final Ref.IntRef intRef = new Ref.IntRef();
                if (size > 0) {
                    intRef.element = i11 / size;
                }
                Integer numValueOf = 0;
                int size2 = listI.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    numValueOf = Integer.valueOf(Math.max(((z4.t0) listI.get(i12)).b(intRef.element), numValueOf.intValue()));
                }
                final int iIntValue2 = numValueOf.intValue();
                final ArrayList arrayList = new ArrayList(listI.size());
                int size3 = listI.size();
                for (int i13 = 0; i13 < size3; i13++) {
                    z4.t0 t0Var = (z4.t0) listI.get(i13);
                    int i14 = intRef.element;
                    arrayList.add(t0Var.D(z5.a.a(i14, i14, iIntValue2, iIntValue2)));
                }
                final ArrayList arrayList2 = new ArrayList(size);
                for (int i15 = 0; i15 < size; i15++) {
                    arrayList2.add(new l8(z1Var.O(intRef.element) * i15, z1Var.O(intRef.element), ((z5.f) w70.b.c(new z5.f(z1Var.O(Math.min(((z4.t0) listI.get(i15)).y(iIntValue2), intRef.element)) - (k8.f18978b * 2)), new z5.f(24))).f47277a));
                }
                final u3.d dVar4 = this.f19535c;
                final u3.d dVar5 = this.f19536d;
                return z4.w0.f(z1Var, i11, iIntValue2, new Function1() { // from class: g3.q8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        int i16;
                        z4.l1 l1Var = (z4.l1) obj3;
                        ArrayList arrayList3 = arrayList;
                        int size4 = arrayList3.size();
                        for (int i17 = 0; i17 < size4; i17++) {
                            z4.l1.o(l1Var, (z4.m1) arrayList3.get(i17), intRef.element * i17, 0);
                        }
                        c9 c9Var = c9.Divider;
                        z4.z1 z1Var2 = z1Var;
                        List listI2 = z1Var2.i(c9Var, dVar4);
                        int size5 = listI2.size();
                        int i18 = 0;
                        while (true) {
                            i16 = iIntValue2;
                            if (i18 >= size5) {
                                break;
                            }
                            z4.m1 m1VarD = ((z4.t0) listI2.get(i18)).D(z5.a.b(aVar.f47271a, 0, 0, 0, 0, 11));
                            z4.l1.o(l1Var, m1VarD, 0, i16 - m1VarD.f47184b);
                            i18++;
                        }
                        List listI3 = z1Var2.i(c9.Indicator, new u3.d(new a3.u2(27, (i80.n) dVar5, (Object) arrayList2), true, 1918742627));
                        int size6 = listI3.size();
                        for (int i19 = 0; i19 < size6; i19++) {
                            z4.t0 t0Var2 = (z4.t0) listI3.get(i19);
                            int i21 = i11;
                            if (!((i21 >= 0) & (i16 >= 0))) {
                                z5.i.a("width and height must be >= 0");
                            }
                            z4.l1.o(l1Var, t0Var2.D(z5.b.h(i21, i21, i16, i16)), 0, 0);
                        }
                        return Unit.f26487a;
                    }
                });
        }
    }
}
