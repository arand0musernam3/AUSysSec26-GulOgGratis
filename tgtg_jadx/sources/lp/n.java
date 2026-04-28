package lp;

import com.app.tgtg.R;
import d2.h2;
import d2.i2;
import d2.m2;
import d2.n1;
import g3.d9;
import g3.q4;
import g3.r9;
import g3.z4;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m2.c1;
import m2.d1;
import m3.b1;
import m3.c3;
import m5.u0;
import o30.f0;
import y00.i4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f28075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f28076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f28077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f28078f;

    public /* synthetic */ n(b1 b1Var, b1 b1Var2, b1 b1Var3, g4.l lVar, boolean z11) {
        this.f28073a = 1;
        this.f28074b = b1Var;
        this.f28076d = b1Var2;
        this.f28077e = b1Var3;
        this.f28078f = lVar;
        this.f28075c = z11;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11 = this.f28073a;
        b4.q qVar = b4.q.f5711a;
        m3.f fVar = m3.m.f29332a;
        Object obj4 = this.f28074b;
        Object obj5 = this.f28078f;
        Object obj6 = this.f28077e;
        Object obj7 = this.f28076d;
        switch (i11) {
            case 0:
                c3 c3Var = (c3) obj7;
                Function0 function0 = (Function0) obj6;
                ep.d0 d0Var = (ep.d0) obj5;
                b1 b1Var = (b1) obj4;
                m3.n nVar = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((f2.d) obj).getClass();
                boolean z11 = (iIntValue & 17) != 16;
                int i12 = iIntValue & 1;
                m3.s sVar = (m3.s) nVar;
                if (!sVar.R(i12, z11)) {
                    sVar.U();
                } else if (this.f28075c) {
                    sVar.a0(-1600519680);
                    sVar.q(false);
                } else {
                    sVar.a0(-1602110569);
                    b4.t tVarD = m2.d(d2.c.A(qVar, lv.t.f28255i, lv.t.f28253g), 1.0f);
                    String strU = f0.U(sVar, R.string.fridge_recipe_list_generate_more);
                    lv.q qVar2 = lv.q.REGULAR;
                    lv.e eVar = lv.e.MEDIUM;
                    boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
                    Integer numValueOf = Integer.valueOf(R.drawable.auto_renew_icon);
                    boolean zF = sVar.f(c3Var) | sVar.f(function0) | sVar.h(d0Var);
                    Object objM = sVar.M();
                    if (zF || objM == fVar) {
                        objM = new androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.c(12, c3Var, function0, d0Var, b1Var);
                        sVar.k0(objM);
                    }
                    v0.n.n(tVarD, strU, null, qVar2, eVar, zBooleanValue, false, null, numValueOf, (Function0) objM, sVar, 27654, 196);
                    sVar.q(false);
                }
                break;
            case 1:
                b1 b1Var2 = (b1) obj4;
                b1 b1Var3 = (b1) obj7;
                b1 b1Var4 = (b1) obj6;
                g4.l lVar = (g4.l) obj5;
                m3.n nVar2 = (m3.n) obj2;
                ((Integer) obj3).getClass();
                ((s1.z) obj).getClass();
                b4.q qVar3 = b4.q.f5711a;
                b4.t tVarA = s1.b0.a(d2.c.D(m2.d(qVar3, 1.0f), 0.0f, lv.t.f28253g, 0.0f, 0.0f, 13), null, 3);
                d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, nVar2, 0);
                m3.s sVar2 = (m3.s) nVar2;
                int iHashCode = Long.hashCode(sVar2.T);
                u3.i iVarL = sVar2.l();
                b4.t tVarC = b4.a.c(tVarA, nVar2);
                b5.j.R.getClass();
                b5.h hVar = b5.i.f5839b;
                sVar2.e0();
                if (sVar2.S) {
                    sVar2.k(hVar);
                } else {
                    sVar2.n0();
                }
                b5.g gVar = b5.i.f5843f;
                m3.i.C(yVarA, gVar, nVar2);
                b5.g gVar2 = b5.i.f5842e;
                m3.i.C(iVarL, gVar2, nVar2);
                Integer numValueOf2 = Integer.valueOf(iHashCode);
                b5.g gVar3 = b5.i.f5844g;
                m3.i.v(nVar2, numValueOf2, gVar3);
                b5.d dVar = b5.i.f5845h;
                m3.i.z(nVar2, dVar);
                b5.g gVar4 = b5.i.f5841d;
                m3.i.C(tVarC, gVar4, nVar2);
                b4.t tVarT = m2.t(m2.d(qVar3, 1.0f), 3);
                i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, nVar2, 48);
                int iHashCode2 = Long.hashCode(sVar2.T);
                u3.i iVarL2 = sVar2.l();
                b4.t tVarC2 = b4.a.c(tVarT, nVar2);
                sVar2.e0();
                if (sVar2.S) {
                    sVar2.k(hVar);
                } else {
                    sVar2.n0();
                }
                m3.i.C(i2VarA, gVar, nVar2);
                m3.i.C(iVarL2, gVar2, nVar2);
                m3.i.v(nVar2, Integer.valueOf(iHashCode2), gVar3);
                m3.i.z(nVar2, dVar);
                m3.i.C(tVarC2, gVar4, nVar2);
                String str = (String) b1Var3.getValue();
                i4 i4Var = new i4(2);
                if (1.0f <= 0.0d) {
                    e2.a.a("invalid weight; must be greater than zero");
                }
                n1 n1Var = new n1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                u0 u0Var = lv.v.f28274n;
                u0 u0VarA = u0.a(u0Var, 0L, b0.a0.C(16), null, null, 0L, null, 0, 0L, null, null, 16777213);
                q4 q4Var = q4.f19349a;
                long j9 = lv.s.G;
                long j11 = lv.s.F;
                long j12 = lv.s.f28231k;
                d9 d9VarD = q4.d(0L, j9, j11, j11, j12, 0L, 0L, nVar2, 2147452927);
                float f11 = 8;
                l2.f fVarB = l2.g.b(f11);
                d1 d1Var = new d1(4, 6, 115);
                boolean zH = sVar2.h(lVar);
                Object objM2 = sVar2.M();
                if (zH || objM2 == fVar) {
                    objM2 = new li.h(lVar, 2);
                    sVar2.k0(objM2);
                }
                Function1 function1 = (Function1) objM2;
                c1 c1Var = new c1(function1, function1, function1, function1, function1, function1);
                boolean z12 = ((Boolean) b1Var2.getValue()).booleanValue() && ((CharSequence) b1Var3.getValue()).length() == 0;
                boolean zF2 = sVar2.f(b1Var2) | sVar2.f(b1Var3);
                Object objM3 = sVar2.M();
                if (zF2 || objM3 == fVar) {
                    objM3 = new co.g(b1Var2, b1Var3, 2);
                    sVar2.k0(objM3);
                }
                boolean z13 = this.f28075c;
                z4.a(str, (Function1) objM3, n1Var, z13, false, u0VarA, null, null, null, null, z12, i4Var, d1Var, c1Var, false, 1, 0, fVarB, d9VarD, nVar2, 0, 100859904, 1712080);
                String str2 = (String) b1Var4.getValue();
                if (3.0f <= 0.0d) {
                    e2.a.a("invalid weight; must be greater than zero");
                }
                n1 n1Var2 = new n1(3.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 3.0f, true);
                float f12 = lv.t.f28251e;
                b4.t tVarD2 = d2.c.D(n1Var2, f12, 0.0f, 0.0f, 0.0f, 14);
                u0 u0VarA2 = u0.a(u0Var, 0L, b0.a0.C(16), null, null, 0L, null, 0, 0L, null, null, 16777213);
                d9 d9VarD2 = q4.d(0L, j9, j11, j11, j12, 0L, 0L, nVar2, 2147452927);
                l2.f fVarB2 = l2.g.b(f11);
                d1 d1Var2 = new d1(3, 7, 115);
                boolean zH2 = sVar2.h(lVar);
                Object objM4 = sVar2.M();
                if (zH2 || objM4 == fVar) {
                    objM4 = new li.h(lVar, 3);
                    sVar2.k0(objM4);
                }
                Function1 function12 = (Function1) objM4;
                c1 c1Var2 = new c1(function12, function12, function12, function12, function12, function12);
                boolean z14 = ((Boolean) b1Var2.getValue()).booleanValue() && ((CharSequence) b1Var4.getValue()).length() == 0;
                boolean zF3 = sVar2.f(b1Var2) | sVar2.f(b1Var4);
                Object objM5 = sVar2.M();
                if (zF3 || objM5 == fVar) {
                    objM5 = new co.g(b1Var2, b1Var4, 3);
                    sVar2.k0(objM5);
                }
                z4.a(str2, (Function1) objM5, tVarD2, z13, false, u0VarA2, null, ni.g.f30899c, null, null, z14, null, d1Var2, c1Var2, false, 1, 0, fVarB2, d9VarD2, nVar2, 12582912, 100859904, 1728336);
                sVar2.q(true);
                if (((Boolean) b1Var2.getValue()).booleanValue()) {
                    sVar2.a0(-108255046);
                    r9.d(f0.U(nVar2, (((CharSequence) b1Var3.getValue()).length() == 0 && ((CharSequence) b1Var4.getValue()).length() == 0) ? R.string.charity_notifications_error_both : ((CharSequence) b1Var3.getValue()).length() == 0 ? R.string.charity_notifications_error_code : R.string.charity_notifications_error_phone), d2.c.D(qVar3, 0.0f, f12, 0.0f, 0.0f, 13), j12, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28276p, nVar2, 432, 12582912, 131064);
                    sVar2.q(false);
                } else {
                    sVar2.a0(-107473319);
                    sVar2.q(false);
                }
                sVar2.q(true);
                break;
            case 2:
                pm.y yVar = (pm.y) obj7;
                Function1 function13 = (Function1) obj6;
                Function1 function14 = (Function1) obj5;
                Function1 function15 = (Function1) obj4;
                m3.n nVar3 = (m3.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((f2.d) obj).getClass();
                m3.s sVar3 = (m3.s) nVar3;
                if (sVar3.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    List list = yVar != null ? yVar.f35566b : null;
                    list.getClass();
                    boolean zF4 = sVar3.f(function13);
                    Object objM6 = sVar3.M();
                    if (zF4 || objM6 == fVar) {
                        objM6 = new gn.n(function13, 3);
                        sVar3.k0(objM6);
                    }
                    Function1 function16 = (Function1) objM6;
                    boolean zF5 = sVar3.f(function14);
                    Object objM7 = sVar3.M();
                    if (zF5 || objM7 == fVar) {
                        objM7 = new gn.n(function14, 4);
                        sVar3.k0(objM7);
                    }
                    pm.a.e(list, this.f28075c, function16, (Function1) objM7, function15, sVar3, 0);
                    d2.c.f(m2.m(qVar, lv.t.f28253g), sVar3);
                } else {
                    sVar3.U();
                }
                break;
            default:
                vj.c cVar = (vj.c) obj7;
                Function0 function02 = (Function0) obj6;
                Function2 function2 = (Function2) obj5;
                Function0 function03 = (Function0) obj4;
                m3.n nVar4 = (m3.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((d2.z) obj).getClass();
                m3.s sVar4 = (m3.s) nVar4;
                if (sVar4.R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    yj.a.f(this.f28075c, cVar, function02, function2, function03, sVar4, 0);
                } else {
                    sVar4.U();
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ n(pm.y yVar, boolean z11, Function1 function1, Function1 function12, Function1 function13) {
        this.f28073a = 2;
        this.f28076d = yVar;
        this.f28075c = z11;
        this.f28077e = function1;
        this.f28078f = function12;
        this.f28074b = function13;
    }

    public /* synthetic */ n(boolean z11, Object obj, Function0 function0, Object obj2, Object obj3, int i11) {
        this.f28073a = i11;
        this.f28075c = z11;
        this.f28076d = obj;
        this.f28077e = function0;
        this.f28078f = obj2;
        this.f28074b = obj3;
    }
}
