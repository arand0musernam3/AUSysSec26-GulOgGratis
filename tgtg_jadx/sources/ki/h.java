package ki;

import a3.l3;
import androidx.lifecycle.n1;
import b0.z;
import b4.k;
import b4.q;
import b4.t;
import bx.o;
import cg.q0;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.mapService.response.MapFilters;
import com.app.tgtg.model.remote.order.Changes;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.profile.ProfileCO2Saved;
import com.app.tgtg.model.remote.profile.response.ProfileFeature;
import com.app.tgtg.model.remote.profile.response.ProfileScreenResponse;
import com.tgtg.componentlibrary.component.chip.model.ChipGeometry;
import com.tgtg.componentlibrary.component.chip.model.ChipState;
import d2.m2;
import d2.p;
import d2.w;
import d2.y;
import ep.d0;
import g3.i2;
import gj.c0;
import i4.v;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import lp.r;
import m2.g0;
import m3.b1;
import m3.m;
import m3.n;
import m3.s;
import mn.l;
import nn.u;
import o00.x0;
import o30.f0;
import org.bouncycastle.iana.AEADAlgorithm;
import s1.r0;
import t1.x;
import w.a0;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f26402d;

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, int i11) {
        this.f26399a = i11;
        this.f26401c = obj;
        this.f26402d = obj2;
        this.f26400b = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z11;
        b1 b1Var;
        x xVar;
        int i11 = this.f26399a;
        m3.f fVar = m.f29332a;
        Object obj3 = this.f26400b;
        Object obj4 = this.f26402d;
        Object obj5 = this.f26401c;
        switch (i11) {
            case 0:
                ((Integer) obj2).getClass();
                j.j((i) obj5, (Function1) obj4, (Function0) obj3, (n) obj, m3.i.F(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                li.a.b((t) obj5, (li.g) obj4, (Function0) obj3, (n) obj, m3.i.F(1));
                break;
            case 2:
                lm.i iVar = (lm.i) obj5;
                n1 n1Var = iVar.f27920i;
                MapFilters mapFilters = (MapFilters) obj4;
                List list = (List) obj3;
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ej.d.a(mapFilters, list, (c0) m3.i.n(((ej.c) n1Var.getValue()).f16044b, sVar, 0).getValue(), ((ej.c) n1Var.getValue()).f16045c, ((Boolean) iVar.f27929s.getValue()).booleanValue(), sVar, 0);
                } else {
                    sVar.U();
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                lp.d.b((n4.b) obj5, (String) obj4, (String) obj3, (n) obj, m3.i.F(9));
                break;
            case 4:
                ((Integer) obj2).getClass();
                r.j((d0) obj5, (Function1) obj4, (Function1) obj3, (n) obj, m3.i.F(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                g0.k((t) obj5, (l3) obj4, (u3.d) obj3, (n) obj, m3.i.F(385));
                break;
            case 6:
                ChipGeometry chipGeometry = (ChipGeometry) obj5;
                ChipState chipState = (ChipState) obj4;
                String str = (String) obj3;
                n nVar2 = (n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                s sVar2 = (s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    z5.f fVarM775getCloseIconSizelTKBWiU = chipGeometry.m775getCloseIconSizelTKBWiU();
                    if (fVarM775getCloseIconSizelTKBWiU == null) {
                        sVar2.a0(-25301428);
                        sVar2.q(false);
                    } else {
                        sVar2.a0(-25301427);
                        float f11 = fVarM775getCloseIconSizelTKBWiU.f47277a;
                        if (chipState.isSelected()) {
                            sVar2.a0(-654296265);
                            float fM780getGapD9Ej5fM = chipGeometry.m780getGapD9Ej5fM();
                            q qVar = q.f5711a;
                            d2.c.f(m2.m(qVar, fM780getGapD9Ej5fM), sVar2);
                            z11 = false;
                            i2.a(x0.z(R.drawable.close, sVar2, 0), e0.f.k("Remove ", str), m2.m(qVar, f11), 0L, sVar2, 8, 8);
                            sVar2.q(false);
                        } else {
                            z11 = false;
                            sVar2.a0(-653952227);
                            sVar2.q(false);
                        }
                        sVar2.q(z11);
                    }
                } else {
                    sVar2.U();
                }
                break;
            case 7:
                ((Integer) obj2).getClass();
                ((ng.d) obj5).q((String) obj3, (Function1) obj4, (n) obj, m3.i.F(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                a.a.n((u3.d) obj5, (u) obj4, (nn.c) obj3, (n) obj, m3.i.F(55));
                break;
            case 9:
                ((Integer) obj2).getClass();
                nn.q.h((ProfileFeature) obj5, (l) obj3, (Function1) obj4, (n) obj, m3.i.F(1));
                break;
            case 10:
                kn.d dVar = (kn.d) obj5;
                boolean z12 = dVar.f26473a;
                b1 b1Var2 = (b1) obj4;
                kn.d dVar2 = (kn.d) obj3;
                n nVar3 = (n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                s sVar3 = (s) nVar3;
                if (sVar3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    t tVarA = b4.a.a(v1.n.j(m2.f13850c, v.b(z12 ? 0.5f : 0.0f, lv.s.C), i4.g0.f23254b), c5.m2.f7291a, new go.s(dVar, 3));
                    k kVar = b4.d.f5683a;
                    u0 u0VarD = p.d(kVar, false);
                    int iHashCode = Long.hashCode(sVar3.T);
                    u3.i iVarL = sVar3.l();
                    t tVarC = b4.a.c(tVarA, sVar3);
                    b5.j.R.getClass();
                    b5.h hVar = b5.i.f5839b;
                    sVar3.e0();
                    if (sVar3.S) {
                        sVar3.k(hVar);
                    } else {
                        sVar3.n0();
                    }
                    b5.g gVar = b5.i.f5843f;
                    m3.i.C(u0VarD, gVar, sVar3);
                    b5.g gVar2 = b5.i.f5842e;
                    m3.i.C(iVarL, gVar2, sVar3);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    b5.g gVar3 = b5.i.f5844g;
                    m3.i.v(sVar3, numValueOf, gVar3);
                    b5.d dVar3 = b5.i.f5845h;
                    m3.i.z(sVar3, dVar3);
                    b5.g gVar4 = b5.i.f5841d;
                    m3.i.C(tVarC, gVar4, sVar3);
                    q qVar2 = q.f5711a;
                    t tVarU = m2.u(qVar2, null, 3);
                    k kVar2 = b4.d.f5685c;
                    d2.u uVar = d2.u.f13938a;
                    t tVarA2 = uVar.a(tVarU, kVar2);
                    y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar3, 0);
                    int iHashCode2 = Long.hashCode(sVar3.T);
                    u3.i iVarL2 = sVar3.l();
                    t tVarC2 = b4.a.c(tVarA2, sVar3);
                    sVar3.e0();
                    if (sVar3.S) {
                        sVar3.k(hVar);
                    } else {
                        sVar3.n0();
                    }
                    m3.i.C(yVarA, gVar, sVar3);
                    m3.i.C(iVarL2, gVar2, sVar3);
                    a0.y(iHashCode2, sVar3, gVar3, sVar3, dVar3);
                    m3.i.C(tVarC2, gVar4, sVar3);
                    if (z12) {
                        sVar3.a0(-1695114223);
                        t tVarF = b3.i.f(b4.d.f5696o, v1.n.j(m2.m(d2.c.D(qVar2, 0.0f, lv.t.f28252f, lv.t.f28251e, 0.0f, 9), 40), lv.s.J, l2.g.f26790a));
                        u0 u0VarD2 = p.d(kVar, false);
                        int iHashCode3 = Long.hashCode(sVar3.T);
                        u3.i iVarL3 = sVar3.l();
                        t tVarC3 = b4.a.c(tVarF, sVar3);
                        sVar3.e0();
                        if (sVar3.S) {
                            sVar3.k(hVar);
                        } else {
                            sVar3.n0();
                        }
                        m3.i.C(u0VarD2, gVar, sVar3);
                        m3.i.C(iVarL3, gVar2, sVar3);
                        a0.y(iHashCode3, sVar3, gVar3, sVar3, dVar3);
                        m3.i.C(tVarC3, gVar4, sVar3);
                        v1.n.d(x0.z(R.drawable.system_icon_settings_primary_30, sVar3, 0), f0.U(sVar3, R.string.profile_voice_over_open_manage_account), uVar.a(qVar2, b4.d.f5687e), null, null, 0.0f, null, sVar3, 8, 120);
                        sVar3.q(true);
                        sVar3.q(false);
                    } else {
                        sVar3.a0(-1694126315);
                        sVar3.q(false);
                    }
                    Unit unit = Unit.f26487a;
                    Object objM = sVar3.M();
                    if (objM == fVar) {
                        b1Var = b1Var2;
                        xVar = null;
                        objM = new q0(b1Var, 0 == true ? 1 : 0, 5);
                        sVar3.k0(objM);
                    } else {
                        b1Var = b1Var2;
                        xVar = null;
                    }
                    m3.i.h(unit, (Function2) objM, sVar3);
                    s1.y.d(((Boolean) b1Var.getValue()).booleanValue(), null, r0.d(xVar, 1), null, null, u3.e.e(171746453, sVar3, new nn.t(dVar2, 0)), sVar3, 196992, 26);
                    sVar3.q(true);
                    sVar3.q(true);
                } else {
                    sVar3.U();
                }
                break;
            case 11:
                ((Integer) obj2).getClass();
                b0.a0.b((Changes) obj5, (Function0) obj3, (Function1) obj4, (n) obj, m3.i.F(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                bx.k.k((no.j) obj5, (Function0) obj3, (Function0) obj4, (n) obj, m3.i.F(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                b0.a0.g(m3.i.F(1), (t) obj5, (String) obj3, (Function1) obj4, (n) obj);
                break;
            case 14:
                ((Integer) obj2).getClass();
                oi.a.b((List) obj5, (Function0) obj3, (t) obj4, (n) obj, m3.i.F(1));
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                ((Integer) obj2).getClass();
                oo.a.H((t) obj5, (BasicItem) obj3, (Function1) obj4, (n) obj, m3.i.F(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                os.a.b((t) obj5, (Integer) obj4, (Function0) obj3, (n) obj, m3.i.F(7));
                break;
            case 17:
                ((Integer) obj2).getClass();
                ph.g.a((lh.c0) obj5, (jd.f) obj4, (String) obj3, (n) obj, m3.i.F(1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                ph.g.e((t) obj5, (jd.f) obj4, (qh.a) obj3, (n) obj, m3.i.F(1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                po.c.j((BasicItem) obj5, (Function1) obj4, (Function0) obj3, (n) obj, m3.i.F(385));
                break;
            case 20:
                ((Integer) obj2).getClass();
                o.i((List) obj5, (List) obj3, (Function1) obj4, (n) obj, m3.i.F(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                qk.j.b((String) obj5, (Set) obj4, (u3.d) obj3, (n) obj, m3.i.F(391));
                break;
            case 22:
                ((Integer) obj2).getClass();
                a.a.k((al.h) obj5, (Function0) obj3, (t) obj4, (n) obj, m3.i.F(1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                ba0.g.e((t) obj5, (ProfileCO2Saved) obj4, (Function0) obj3, (n) obj, m3.i.F(1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                bx.k.g((ProfileScreenResponse) obj5, (Function0) obj3, (Function0) obj4, (n) obj, m3.i.F(1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                o.x((t) obj5, (Price) obj4, (Function0) obj3, (n) obj, m3.i.F(1));
                break;
            case 26:
                t tVar = (t) obj5;
                b1 b1Var3 = (b1) obj4;
                u3.d dVar4 = (u3.d) obj3;
                n nVar4 = (n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                s sVar4 = (s) nVar4;
                if (sVar4.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    Object objM2 = sVar4.M();
                    if (objM2 == fVar) {
                        objM2 = new li.c(b1Var3, 24);
                        sVar4.k0(objM2);
                    }
                    t tVarO = z4.c0.o(tVar, (Function1) objM2);
                    u0 u0VarD3 = p.d(b4.d.f5683a, true);
                    int iHashCode4 = Long.hashCode(sVar4.T);
                    u3.i iVarL4 = sVar4.l();
                    t tVarC4 = b4.a.c(tVarO, sVar4);
                    b5.j.R.getClass();
                    b5.h hVar2 = b5.i.f5839b;
                    sVar4.e0();
                    if (sVar4.S) {
                        sVar4.k(hVar2);
                    } else {
                        sVar4.n0();
                    }
                    m3.i.C(u0VarD3, b5.i.f5843f, sVar4);
                    m3.i.C(iVarL4, b5.i.f5842e, sVar4);
                    m3.i.v(sVar4, Integer.valueOf(iHashCode4), b5.i.f5844g);
                    m3.i.z(sVar4, b5.i.f5845h);
                    m3.i.C(tVarC4, b5.i.f5841d, sVar4);
                    r8.k.w(0, dVar4, sVar4, true);
                } else {
                    sVar4.U();
                }
                break;
            case 27:
                ((Integer) obj2).getClass();
                z.i((t) obj5, (hr.i) obj4, (ub.a) obj3, (n) obj, m3.i.F(1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                rk.e.A((nk.q0) obj5, (m1.a) obj4, (rk.d) obj3, (n) obj, m3.i.F(1));
                break;
            default:
                ((Integer) obj2).getClass();
                rk.e.F((nk.q0) obj5, (m1.a) obj4, (t) obj3, (n) obj, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, int i11, int i12) {
        this.f26399a = i12;
        this.f26401c = obj;
        this.f26402d = obj2;
        this.f26400b = obj3;
    }

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, boolean z11, int i11, int i12) {
        this.f26399a = i12;
        this.f26401c = obj;
        this.f26400b = obj2;
        this.f26402d = obj3;
    }
}
