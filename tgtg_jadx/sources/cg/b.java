package cg;

import c5.f3;
import com.app.tgtg.R;
import com.app.tgtg.feature.main.fragments.browse.map.bottomSheet.MapBottomSheet;
import com.app.tgtg.model.local.AppConstants;
import d2.h2;
import d2.i2;
import d2.j2;
import d2.m2;
import g3.d9;
import g3.g9;
import g3.m5;
import g3.q4;
import g3.r9;
import g3.z4;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m2.d1;
import m3.c3;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f7927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f7928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f7931f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f7932g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f7933h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f7934i;

    public /* synthetic */ b(go.a aVar, Function0 function0, Function0 function02, Function0 function03, Function0 function04, boolean z11, List list, boolean z12) {
        this.f7926a = 3;
        this.f7929d = aVar;
        this.f7934i = function0;
        this.f7930e = function02;
        this.f7931f = function03;
        this.f7932g = function04;
        this.f7927b = z11;
        this.f7933h = list;
        this.f7928c = z12;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        m3.s sVar;
        boolean z11;
        int i11 = this.f7926a;
        m3.f fVar = m3.m.f29332a;
        boolean z12 = this.f7928c;
        Object obj4 = this.f7932g;
        Object obj5 = this.f7931f;
        Object obj6 = this.f7933h;
        Object obj7 = this.f7930e;
        Object obj8 = this.f7929d;
        Object obj9 = this.f7934i;
        switch (i11) {
            case 0:
                v2.h hVar = (v2.h) obj8;
                f3 f3Var = (f3) obj7;
                g4.l lVar = (g4.l) obj5;
                v80.b0 b0Var = (v80.b0) obj4;
                Function1 function1 = (Function1) obj6;
                Function0 function0 = (Function0) obj9;
                m3.n nVar = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((d2.z) obj).getClass();
                m3.s sVar2 = (m3.s) nVar;
                if (sVar2.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    b4.q qVar = b4.q.f5711a;
                    float f11 = 16;
                    b4.t tVarZ = d2.c.z(m2.d(qVar, 1.0f), f11);
                    d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5695n, sVar2, 48);
                    int iHashCode = Long.hashCode(sVar2.T);
                    u3.i iVarL = sVar2.l();
                    b4.t tVarC = b4.a.c(tVarZ, sVar2);
                    b5.j.R.getClass();
                    b5.h hVar2 = b5.i.f5839b;
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(hVar2);
                    } else {
                        sVar2.n0();
                    }
                    b5.g gVar = b5.i.f5843f;
                    m3.i.C(yVarA, gVar, sVar2);
                    b5.g gVar2 = b5.i.f5842e;
                    m3.i.C(iVarL, gVar2, sVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    b5.g gVar3 = b5.i.f5844g;
                    m3.i.v(sVar2, numValueOf, gVar3);
                    b5.d dVar = b5.i.f5845h;
                    m3.i.z(sVar2, dVar);
                    b5.g gVar4 = b5.i.f5841d;
                    m3.i.C(tVarC, gVar4, sVar2);
                    d2.c.f(m2.e(qVar, lv.t.f28251e), sVar2);
                    b4.t tVarD = m2.d(qVar, 1.0f);
                    z4.u0 u0VarD = d2.p.d(b4.d.f5683a, false);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    u3.i iVarL2 = sVar2.l();
                    b4.t tVarC2 = b4.a.c(tVarD, sVar2);
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(hVar2);
                    } else {
                        sVar2.n0();
                    }
                    m3.i.C(u0VarD, gVar, sVar2);
                    m3.i.C(iVarL2, gVar2, sVar2);
                    w.a0.y(iHashCode2, sVar2, gVar3, sVar2, dVar);
                    m3.i.C(tVarC2, gVar4, sVar2);
                    b4.t tVarB = d2.c.B(d2.u.f13938a.a(qVar, b4.d.f5688f), f11, 0.0f, 2);
                    j5.j jVar = new j5.j(0);
                    boolean zF = sVar2.f(function0);
                    Object objM = sVar2.M();
                    if (zF || objM == fVar) {
                        objM = new ar.d(4, function0);
                        sVar2.k0(objM);
                    }
                    v1.n.d(o00.x0.z(R.drawable.system_icon_close_neutral_80, sVar2, 0), o30.f0.U(sVar2, R.string.voice_over_close), androidx.compose.foundation.b.c(tVarB, false, null, jVar, (Function0) objM, 11), null, null, 0.0f, null, sVar2, 8, 120);
                    sVar2.q(true);
                    r9.d(o30.f0.U(sVar2, R.string.email_add_email_title), d2.c.D(qVar, 0.0f, 0.0f, 0.0f, f11, 7), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28271j, sVar2, 48, 12582912, 131068);
                    String strU = o30.f0.U(sVar2, R.string.email_add_email_description);
                    m5.u0 u0Var = lv.v.f28276p;
                    long j9 = lv.s.E;
                    r9.d(strU, d2.c.D(qVar, 0.0f, 0.0f, 0.0f, f11, 7), j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar2, 432, 12582912, 131064);
                    m5.u0 u0Var2 = lv.v.f28274n;
                    q4 q4Var = q4.f19349a;
                    long j11 = lv.s.f28217b;
                    d9 d9VarD = q4.d(j11, j11, j9, 0L, 0L, j11, j9, sVar2, 2122311423);
                    v2.e eVar = v2.e.f41932b;
                    d1 d1Var = new d1(6, 0, AppConstants.RESULT_CODE_ORDER_CANCELLED);
                    b4.t tVarD2 = d2.c.D(m2.d(qVar, 1.0f), 0.0f, 0.0f, 0.0f, 24, 7);
                    u3.d dVar2 = j.f7994b;
                    boolean z13 = this.f7927b;
                    z4.b(hVar, tVarD2, false, u0Var2, null, dVar2, z13, d1Var, eVar, null, null, d9VarD, null, sVar2, 1597488);
                    s1.y.b(d2.z.f13980a, z13, null, null, null, null, j.f7995c, sVar2, 1572870, 30);
                    b4.t tVarD3 = m2.d(qVar, 1.0f);
                    boolean z14 = z12 && hVar.b().f41928c.length() > 0;
                    boolean zF2 = sVar2.f(f3Var) | sVar2.h(lVar) | sVar2.h(b0Var) | sVar2.f(function1) | sVar2.f(hVar);
                    Object objM2 = sVar2.M();
                    if (zF2 || objM2 == fVar) {
                        d dVar3 = new d(f3Var, lVar, b0Var, function1, hVar, 0);
                        sVar2.k0(dVar3);
                        objM2 = dVar3;
                    }
                    v0.n.l(tVarD3, "Continue", null, null, null, z14, false, null, null, (Function0) objM2, sVar2, 54, 476);
                    d2.c.f(m2.e(qVar, f11), sVar2);
                    sVar2.q(true);
                } else {
                    sVar2.U();
                }
                break;
            case 1:
                w2.z zVar = (w2.z) obj8;
                Integer num = (Integer) obj7;
                String str = (String) obj5;
                String str2 = (String) obj4;
                Integer num2 = (Integer) obj6;
                c3 c3Var = (c3) obj9;
                m3.n nVar2 = (m3.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((j2) obj).getClass();
                m3.s sVar3 = (m3.s) nVar2;
                if (sVar3.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    d2.b bVar = d2.i.f13801a;
                    lv.d dVar4 = (lv.d) zVar.f43083b;
                    i2 i2VarA = h2.a(d2.i.g(dVar4.f28181d), b4.d.f5693k, sVar3, 48);
                    int iHashCode3 = Long.hashCode(sVar3.T);
                    u3.i iVarL3 = sVar3.l();
                    b4.q qVar2 = b4.q.f5711a;
                    b4.t tVarC3 = b4.a.c(qVar2, sVar3);
                    b5.j.R.getClass();
                    b5.h hVar3 = b5.i.f5839b;
                    sVar3.e0();
                    if (sVar3.S) {
                        sVar3.k(hVar3);
                    } else {
                        sVar3.n0();
                    }
                    m3.i.C(i2VarA, b5.i.f5843f, sVar3);
                    m3.i.C(iVarL3, b5.i.f5842e, sVar3);
                    m3.i.v(sVar3, Integer.valueOf(iHashCode3), b5.i.f5844g);
                    m3.i.z(sVar3, b5.i.f5845h);
                    m3.i.C(tVarC3, b5.i.f5841d, sVar3);
                    if (this.f7927b) {
                        sVar3.a0(-2056919669);
                        m5.a(m2.m(qVar2, dVar4.f28182e), v0.n.y((ib.j0) zVar.f43084c, ((Boolean) c3Var.getValue()).booleanValue(), z12, true, sVar3).f19194b, 2, 0L, 0, 0.0f, sVar3, MLKEMEngine.KyberPolyBytes, 56);
                        sVar = sVar3;
                        sVar.q(false);
                    } else {
                        sVar = sVar3;
                        sVar.a0(-2056577863);
                        if (num == null) {
                            sVar.a0(-2056565123);
                            sVar.q(false);
                        } else {
                            sVar.a0(-2056565122);
                            v0.n.a(num.intValue(), zVar, sVar, 0);
                            sVar.q(false);
                        }
                        boolean zF3 = sVar.f(str) | sVar.f(str2);
                        Object objM3 = sVar.M();
                        if (zF3 || objM3 == fVar) {
                            objM3 = new x0(str, str2, 5);
                            sVar.k0(objM3);
                        }
                        r9.d(str2, j5.r.c(qVar2, false, (Function1) objM3), 0L, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 1, 0, null, dVar4.f28178a, sVar, 0, 24576, 113660);
                        if (num2 == null) {
                            sVar.a0(-2056006627);
                            z11 = false;
                            sVar.q(false);
                        } else {
                            z11 = false;
                            sVar.a0(-2056006626);
                            v0.n.a(num2.intValue(), zVar, sVar, 0);
                            sVar.q(false);
                        }
                        sVar.q(z11);
                    }
                    sVar.q(true);
                } else {
                    sVar3.U();
                }
                break;
            case 2:
                String str3 = (String) obj8;
                r5.g0 g0Var = (r5.g0) obj7;
                b2.l lVar2 = (b2.l) obj5;
                Function2 function2 = (Function2) obj4;
                i4.v0 v0Var = (i4.v0) obj6;
                d9 d9Var = (d9) obj9;
                Function2 function22 = (Function2) obj;
                m3.n nVar3 = (m3.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((m3.s) nVar3).h(function22) ? 4 : 2;
                }
                m3.s sVar4 = (m3.s) nVar3;
                if (sVar4.R(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    g9.f18691a.b(str3, function22, this.f7927b, this.f7928c, g0Var, lVar2, null, null, null, function2, v0Var, d9Var, null, null, sVar4, (iIntValue3 << 3) & 112, 100663296, 196608);
                } else {
                    sVar4.U();
                }
                break;
            case 3:
                go.a aVar = (go.a) obj8;
                Function0 function02 = (Function0) obj9;
                Function0 function03 = (Function0) obj7;
                Function0 function04 = (Function0) obj5;
                Function0 function05 = (Function0) obj4;
                List list = (List) obj6;
                m3.n nVar4 = (m3.n) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((d2.z) obj).getClass();
                m3.s sVar5 = (m3.s) nVar4;
                if (sVar5.R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    bx.o.d(aVar, function02, function03, function04, function05, this.f7927b, list, this.f7928c, sVar5, 0, 0);
                } else {
                    sVar5.U();
                }
                break;
            default:
                m3.n nVar5 = (m3.n) obj2;
                ((Integer) obj3).getClass();
                int i12 = MapBottomSheet.f9095y;
                ((s1.z) obj).getClass();
                pm.a.f(null, (Function0) obj9, this.f7927b, u3.e.e(386586662, nVar5, new cn.w((List) obj8, (MapBottomSheet) obj7, this.f7928c, (Function1) obj6, (Function1) obj5, (Function1) obj4)), nVar5, 3072);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ b(Object obj, boolean z11, boolean z12, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i11) {
        this.f7926a = i11;
        this.f7929d = obj;
        this.f7927b = z11;
        this.f7928c = z12;
        this.f7930e = obj2;
        this.f7931f = obj3;
        this.f7932g = obj4;
        this.f7933h = obj5;
        this.f7934i = obj6;
    }

    public /* synthetic */ b(Function0 function0, boolean z11, List list, MapBottomSheet mapBottomSheet, boolean z12, Function1 function1, Function1 function12, Function1 function13) {
        this.f7926a = 4;
        this.f7934i = function0;
        this.f7927b = z11;
        this.f7929d = list;
        this.f7930e = mapBottomSheet;
        this.f7928c = z12;
        this.f7933h = function1;
        this.f7931f = function12;
        this.f7932g = function13;
    }
}
