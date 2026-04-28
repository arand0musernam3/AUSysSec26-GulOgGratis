package gi;

import androidx.lifecycle.Lifecycle;
import b4.q;
import b4.t;
import b5.j;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.order.OrderChanges;
import com.app.tgtg.model.remote.order.OrderState;
import com.tgtg.componentlibrary.component.chip.model.ChipVariant;
import com.tgtg.componentlibrary.component.chip.type.filterchip.ComposableSingletons$DemoFilterChipKt;
import com.tgtg.componentlibrary.component.chip.type.selectionchip.ComposableSingletons$DemoSelectionChipKt;
import d2.m2;
import d2.u;
import d2.w;
import d2.y;
import g3.c6;
import g3.g6;
import g3.r9;
import g3.y6;
import h2.n0;
import i4.v0;
import i80.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import lv.s;
import lv.v;
import m3.b1;
import m3.i;
import m3.m;
import m5.u0;
import m90.z0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import s1.b0;
import s1.r0;
import s1.z;
import x5.k;
import z4.c0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f20465b;

    public /* synthetic */ b(b1 b1Var, int i11) {
        this.f20464a = i11;
        this.f20465b = b1Var;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Lifecycle.State state;
        int i11 = this.f20464a;
        m3.f fVar = m.f29332a;
        q qVar = q.f5711a;
        b1 b1Var = this.f20465b;
        switch (i11) {
            case 0:
                m3.n nVar = (m3.n) obj2;
                ((Integer) obj3).getClass();
                ((z) obj).getClass();
                t tVarA = d2.c.A(m2.d(qVar, 1.0f), lv.t.f28255i, lv.t.f28251e);
                String str = (String) b1Var.getValue();
                if (str == null) {
                    str = "";
                }
                r9.d(str, tVarA, s.f28215a, 0L, null, 0L, null, new k(3), 0L, 0, false, 0, 0, null, v.f28262a, nVar, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
                return Unit.f26487a;
            case 1:
                m3.n nVar2 = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((f2.d) obj).getClass();
                m3.s sVar = (m3.s) nVar2;
                if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    List list = (List) b1Var.getValue();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : list) {
                        if (((OrderChanges) obj4).getOrder().getState() != OrderState.CANCELLED) {
                            arrayList.add(obj4);
                        }
                    }
                    r9.d(f0.T(R.string.charity_home_title_reserved_donations, new Object[]{Integer.valueOf(arrayList.size())}, sVar), d2.c.D(d2.c.z(qVar, lv.t.f28253g), 0.0f, lv.t.f28254h, 0.0f, 0.0f, 13), s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28272k, sVar, 432, 12582912, 131064);
                } else {
                    sVar.U();
                }
                return Unit.f26487a;
            case 2:
                y6 y6Var = (y6) obj;
                m3.n nVar3 = (m3.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                y6Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((m3.s) nVar3).f(y6Var) ? 4 : 2;
                }
                m3.s sVar2 = (m3.s) nVar3;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    float f11 = c6.f18416a;
                    v0 v0VarA = c6.a(0, sVar2);
                    boolean z11 = ((ChipVariant) b1Var.getValue()) == ChipVariant.TextOnly;
                    Object objM = sVar2.M();
                    if (objM == fVar) {
                        objM = new n0(b1Var, 27);
                        sVar2.k0(objM);
                    }
                    Function0 function0 = (Function0) objM;
                    ComposableSingletons$DemoFilterChipKt composableSingletons$DemoFilterChipKt = ComposableSingletons$DemoFilterChipKt.INSTANCE;
                    Function2<m3.n, Integer, Unit> function2M789getLambda$1446280063$app_release = composableSingletons$DemoFilterChipKt.m789getLambda$1446280063$app_release();
                    Function2<m3.n, Integer, Unit> lambda$661774159$app_release = composableSingletons$DemoFilterChipKt.getLambda$661774159$app_release();
                    int i12 = (iIntValue2 & 14) | MLKEMEngine.KyberPolyBytes;
                    g6.a(y6Var, z11, function0, v0VarA, null, false, null, null, null, function2M789getLambda$1446280063$app_release, lambda$661774159$app_release, sVar2, i12);
                    v0 v0VarA2 = c6.a(1, sVar2);
                    boolean z12 = ((ChipVariant) b1Var.getValue()) == ChipVariant.Icon;
                    Object objM2 = sVar2.M();
                    if (objM2 == fVar) {
                        objM2 = new n0(b1Var, 28);
                        sVar2.k0(objM2);
                    }
                    g6.a(y6Var, z12, (Function0) objM2, v0VarA2, null, false, null, null, null, composableSingletons$DemoFilterChipKt.getLambda$574573418$app_release(), composableSingletons$DemoFilterChipKt.m794getLambda$809882952$app_release(), sVar2, i12);
                    v0 v0VarA3 = c6.a(2, sVar2);
                    boolean z13 = ((ChipVariant) b1Var.getValue()) == ChipVariant.Avatar;
                    Object objM3 = sVar2.M();
                    if (objM3 == fVar) {
                        objM3 = new n0(b1Var, 29);
                        sVar2.k0(objM3);
                    }
                    g6.a(y6Var, z13, (Function0) objM3, v0VarA3, null, false, null, null, null, composableSingletons$DemoFilterChipKt.getLambda$1059210249$app_release(), composableSingletons$DemoFilterChipKt.m792getLambda$325246121$app_release(), sVar2, i12);
                } else {
                    sVar2.U();
                }
                return Unit.f26487a;
            case 3:
                y6 y6Var2 = (y6) obj;
                m3.n nVar4 = (m3.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                y6Var2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((m3.s) nVar4).f(y6Var2) ? 4 : 2;
                }
                m3.s sVar3 = (m3.s) nVar4;
                if (sVar3.R(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    float f12 = c6.f18416a;
                    v0 v0VarA4 = c6.a(0, sVar3);
                    boolean z14 = ((ChipVariant) b1Var.getValue()) == ChipVariant.TextOnly;
                    Object objM4 = sVar3.M();
                    if (objM4 == fVar) {
                        objM4 = new ms.a(b1Var, 23);
                        sVar3.k0(objM4);
                    }
                    Function0 function02 = (Function0) objM4;
                    ComposableSingletons$DemoSelectionChipKt composableSingletons$DemoSelectionChipKt = ComposableSingletons$DemoSelectionChipKt.INSTANCE;
                    Function2<m3.n, Integer, Unit> lambda$1543708059$app_release = composableSingletons$DemoSelectionChipKt.getLambda$1543708059$app_release();
                    Function2<m3.n, Integer, Unit> lambda$1039862413$app_release = composableSingletons$DemoSelectionChipKt.getLambda$1039862413$app_release();
                    int i13 = (iIntValue3 & 14) | MLKEMEngine.KyberPolyBytes;
                    g6.a(y6Var2, z14, function02, v0VarA4, null, false, null, null, null, lambda$1543708059$app_release, lambda$1039862413$app_release, sVar3, i13);
                    v0 v0VarA5 = c6.a(1, sVar3);
                    boolean z15 = ((ChipVariant) b1Var.getValue()) == ChipVariant.Icon;
                    Object objM5 = sVar3.M();
                    if (objM5 == fVar) {
                        objM5 = new ms.a(b1Var, 24);
                        sVar3.k0(objM5);
                    }
                    g6.a(y6Var2, z15, (Function0) objM5, v0VarA5, null, false, null, null, null, composableSingletons$DemoSelectionChipKt.m805getLambda$649720622$app_release(), composableSingletons$DemoSelectionChipKt.getLambda$485918020$app_release(), sVar3, i13);
                    v0 v0VarA6 = c6.a(2, sVar3);
                    boolean z16 = ((ChipVariant) b1Var.getValue()) == ChipVariant.Avatar;
                    Object objM6 = sVar3.M();
                    if (objM6 == fVar) {
                        objM6 = new ms.a(b1Var, 25);
                        sVar3.k0(objM6);
                    }
                    g6.a(y6Var2, z16, (Function0) objM6, v0VarA6, null, false, null, null, null, composableSingletons$DemoSelectionChipKt.m800getLambda$103327981$app_release(), composableSingletons$DemoSelectionChipKt.getLambda$1032310661$app_release(), sVar3, i13);
                } else {
                    sVar3.U();
                }
                return Unit.f26487a;
            case 4:
                n9.e eVar = (n9.e) obj;
                m3.n nVar5 = (m3.n) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ((m3.s) nVar5).f(eVar) ? 4 : 2;
                }
                m3.s sVar4 = (m3.s) nVar5;
                if (sVar4.R(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    List list2 = (List) b1Var.getValue();
                    boolean z17 = (iIntValue4 & 14) == 4;
                    Object objM7 = sVar4.M();
                    if (z17 || objM7 == fVar) {
                        objM7 = new z0(eVar, 7);
                        sVar4.k0(objM7);
                    }
                    Function1 function1 = (Function1) objM7;
                    if (list2 instanceof RandomAccess) {
                        int size = list2.size();
                        for (int i14 = 0; i14 < size; i14++) {
                            if (((Boolean) function1.invoke(list2.get(i14))).booleanValue()) {
                                state = Lifecycle.State.RESUMED;
                            }
                        }
                        state = Lifecycle.State.CREATED;
                    } else {
                        if (list2 == null || !list2.isEmpty()) {
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                if (((Boolean) function1.invoke(it.next())).booleanValue()) {
                                    state = Lifecycle.State.RESUMED;
                                }
                            }
                        }
                        state = Lifecycle.State.CREATED;
                    }
                    i.a(w8.g.f43289a.a(w8.i.a(state, sVar4)), u3.e.e(-1713684244, sVar4, new n9.d(eVar, 2, (byte) 0)), sVar4, 56);
                } else {
                    sVar4.U();
                }
                return Unit.f26487a;
            case 5:
                m3.n nVar6 = (m3.n) obj2;
                ((Integer) obj3).getClass();
                ((z) obj).getClass();
                t tVarA2 = b0.a(u.f13938a.a(qVar, b4.d.f5687e), null, 3);
                y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, nVar6, 0);
                m3.s sVar5 = (m3.s) nVar6;
                int iHashCode = Long.hashCode(sVar5.T);
                u3.i iVarL = sVar5.l();
                t tVarC = b4.a.c(tVarA2, nVar6);
                j.R.getClass();
                b5.h hVar = b5.i.f5839b;
                sVar5.e0();
                if (sVar5.S) {
                    sVar5.k(hVar);
                } else {
                    sVar5.n0();
                }
                i.C(yVarA, b5.i.f5843f, nVar6);
                i.C(iVarL, b5.i.f5842e, nVar6);
                i.v(nVar6, Integer.valueOf(iHashCode), b5.i.f5844g);
                i.z(nVar6, b5.i.f5845h);
                i.C(tVarC, b5.i.f5841d, nVar6);
                float f13 = 16;
                t tVarB = d2.c.B(m2.d(qVar, 1.0f), f13, 0.0f, 2);
                String strU = f0.U(nVar6, R.string.charity_reservation_thank_you);
                u0 u0Var = v.f28267f;
                long j9 = s.f28217b;
                r9.d(strU, tVarB, j9, 0L, null, 0L, null, new k(3), 0L, 0, false, 0, 0, null, u0Var, nVar6, 432, 12582912, 130040);
                r9.d(f0.U(nVar6, R.string.charity_reservation_confirmation), d2.c.D(m2.d(qVar, 1.0f), f13, f13, f13, 0.0f, 8), j9, 0L, null, 0L, null, new k(3), 0L, 0, false, 0, 0, null, v.f28274n, nVar6, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
                s1.y.b(d2.z.f13980a, ((Boolean) b1Var.getValue()).booleanValue(), null, r0.d(t1.c.k(1000, 0, null, 6), 2), null, null, qi.b.f37058a, nVar6, 1575942, 26);
                sVar5.q(true);
                return Unit.f26487a;
            default:
                ((Integer) obj3).getClass();
                ((t) obj).getClass();
                m3.s sVar6 = (m3.s) ((m3.n) obj2);
                sVar6.a0(1166037731);
                boolean zD = sVar6.d(50) | sVar6.f(b1Var);
                Object objM8 = sVar6.M();
                if (zD || objM8 == fVar) {
                    objM8 = new sn.c(b1Var, 3);
                    sVar6.k0(objM8);
                }
                t tVarO = c0.o(qVar, (Function1) objM8);
                sVar6.q(false);
                return tVarO;
        }
    }
}
