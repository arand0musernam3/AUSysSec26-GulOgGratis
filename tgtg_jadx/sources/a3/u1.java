package a3;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.app.tgtg.R;
import com.app.tgtg.model.local.GenericErrors;
import com.app.tgtg.model.remote.payment.BasicSavedPaymentMethod;
import com.app.tgtg.model.remote.payment.SavedBancontactCard;
import com.app.tgtg.model.remote.payment.SavedCreditCard;
import com.app.tgtg.model.remote.payment.SavedEdenred;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u1 implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f584c;

    public /* synthetic */ u1(int i11, Object obj, Object obj2) {
        this.f582a = i11;
        this.f583b = obj;
        this.f584c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r35, java.lang.Object r36, java.lang.Object r37) {
        /*
            Method dump skipped, instruction units count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.u1.a(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        Function1 function1 = (Function1) this.f584c;
        String str = (String) this.f583b;
        m3.n nVar = (m3.n) obj2;
        ((Integer) obj3).getClass();
        ((s1.z) obj).getClass();
        d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, nVar, 0);
        m3.s sVar = (m3.s) nVar;
        int iHashCode = Long.hashCode(sVar.T);
        u3.i iVarL = sVar.l();
        b4.q qVar = b4.q.f5711a;
        b4.t tVarC = b4.a.c(qVar, nVar);
        b5.j.R.getClass();
        b5.h hVar = b5.i.f5839b;
        sVar.e0();
        if (sVar.S) {
            sVar.k(hVar);
        } else {
            sVar.n0();
        }
        m3.i.C(yVarA, b5.i.f5843f, nVar);
        m3.i.C(iVarL, b5.i.f5842e, nVar);
        m3.i.v(nVar, Integer.valueOf(iHashCode), b5.i.f5844g);
        m3.i.z(nVar, b5.i.f5845h);
        m3.i.C(tVarC, b5.i.f5841d, nVar);
        b4.t tVarJ = c5.d2.j(qVar, "SmileyReport");
        boolean zF = sVar.f(function1) | sVar.f(str);
        Object objM = sVar.M();
        if (zF || objM == m3.m.f29332a) {
            objM = new iq.e(function1, str, 2);
            sVar.k0(objM);
        }
        ki.j.k(6, tVarJ, (Function0) objM, nVar);
        g3.s0.g(c5.d2.j(qVar, "SmileyReportDivider"), 1, lv.s.H, nVar, 438, 0);
        sVar.q(true);
        return Unit.f26487a;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        hk.c cVar = (hk.c) this.f583b;
        ek.q qVar = (ek.q) this.f584c;
        d2.z1 z1Var = (d2.z1) obj;
        m3.n nVar = (m3.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        z1Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((m3.s) nVar).f(z1Var) ? 4 : 2;
        }
        m3.s sVar = (m3.s) nVar;
        if (sVar.R(iIntValue & 1, (iIntValue & 19) != 18)) {
            b4.t tVarThen = v1.n.j(b4.q.f5711a, lv.s.J, i4.g0.f23254b).then(d2.m2.f13850c);
            boolean zH = sVar.h(cVar) | sVar.h(qVar);
            Object objM = sVar.M();
            if (zH || objM == m3.m.f29332a) {
                objM = new hb0.o(19, cVar, qVar);
                sVar.k0(objM);
            }
            ox.h.c(tVarThen, null, z1Var, null, null, null, false, null, (Function1) objM, sVar, ((iIntValue << 6) & 896) | 6, 506);
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        List list = (List) this.f584c;
        Function0 function0 = (Function0) this.f583b;
        m3.n nVar = (m3.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((f2.d) obj).getClass();
        m3.s sVar = (m3.s) nVar;
        if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
            d2.c.f(d2.m2.e(b4.q.f5711a, lv.t.f28256j), sVar);
            if (list.isEmpty()) {
                sVar.a0(-1593451564);
                Object objM = sVar.M();
                m3.f fVar = m3.m.f29332a;
                if (objM == fVar) {
                    objM = new jq.a(23);
                    sVar.k0(objM);
                }
                GenericErrors.NoRecipeSaved noRecipeSaved = new GenericErrors.NoRecipeSaved((Function0) objM);
                boolean zF = sVar.f(function0);
                Object objM2 = sVar.M();
                if (zF || objM2 == fVar) {
                    objM2 = new ki.a(16, function0);
                    sVar.k0(objM2);
                }
                cg.o.a(noRecipeSaved, (Function0) objM2, null, sVar, 0, 4);
                sVar.q(false);
            } else {
                sVar.a0(-1593265130);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        int i11;
        int i12;
        BasicSavedPaymentMethod basicSavedPaymentMethod = (BasicSavedPaymentMethod) this.f584c;
        Function0 function0 = (Function0) this.f583b;
        m3.n nVar = (m3.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((d2.z) obj).getClass();
        m3.s sVar = (m3.s) nVar;
        if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
            boolean z11 = basicSavedPaymentMethod instanceof SavedCreditCard;
            if (z11) {
                i11 = 2131231573;
            } else if (basicSavedPaymentMethod instanceof SavedBancontactCard) {
                i11 = 2131231557;
            } else {
                if (!(basicSavedPaymentMethod instanceof SavedEdenred)) {
                    e40.a.f();
                    return null;
                }
                i11 = R.drawable.icon_edenred;
            }
            b4.q qVar = b4.q.f5711a;
            b4.t tVarD = d2.m2.d(d2.c.z(qVar, 12), 1.0f);
            b4.j jVar = b4.d.f5693k;
            d2.b bVar = d2.i.f13801a;
            d2.i2 i2VarA = d2.h2.a(bVar, jVar, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarD, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(i2VarA, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            v1.n.d(o00.x0.z(i11, sVar, 0), null, null, null, null, 0.0f, null, sVar, 56, 124);
            d2.c.f(d2.m2.m(qVar, 8), sVar);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            d2.n1 n1Var = new d2.n1(1.0f, true);
            d2.i2 i2VarA2 = d2.h2.a(bVar, jVar, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(n1Var, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA2, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            if (z11 || (basicSavedPaymentMethod instanceof SavedBancontactCard)) {
                i12 = 0;
                sVar.a0(-2012202466);
                ls.a.d(basicSavedPaymentMethod, sVar, 0);
                sVar.q(false);
            } else {
                if (!(basicSavedPaymentMethod instanceof SavedEdenred)) {
                    throw e0.f.v(sVar, -2012204866, false);
                }
                sVar.a0(-2012200389);
                i12 = 0;
                ls.a.e((SavedEdenred) basicSavedPaymentMethod, sVar, 0);
                sVar.q(false);
            }
            sVar.q(true);
            n4.b bVarZ = o00.x0.z(R.drawable.system_icon_delete, sVar, i12);
            String strU = o30.f0.U(sVar, R.string.voice_over_payment_card_delete_card);
            j5.j jVar2 = new j5.j(i12);
            boolean zF = sVar.f(function0);
            Object objM = sVar.M();
            if (zF || objM == m3.m.f29332a) {
                objM = new ki.a(22, function0);
                sVar.k0(objM);
            }
            v1.n.d(bVarZ, strU, androidx.compose.foundation.b.c(qVar, false, null, jVar2, (Function0) objM, 11), null, null, 0.0f, null, sVar, 8, 120);
            sVar.q(true);
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        Function1 function1 = (Function1) this.f584c;
        b2.l lVar = (b2.l) this.f583b;
        ((Integer) obj3).getClass();
        m3.s sVar = (m3.s) ((m3.n) obj2);
        sVar.a0(-102778667);
        Object objM = sVar.M();
        m3.f fVar = m3.m.f29332a;
        if (objM == fVar) {
            objM = m3.i.o(kotlin.coroutines.g.f26549a, sVar);
            sVar.k0(objM);
        }
        v80.b0 b0Var = (v80.b0) objM;
        Object objM2 = sVar.M();
        if (objM2 == fVar) {
            objM2 = m3.i.w(null);
            sVar.k0(objM2);
        }
        m3.b1 b1Var = (m3.b1) objM2;
        m3.b1 b1VarB = m3.i.B(function1, sVar);
        boolean zF = sVar.f(lVar);
        Object objM3 = sVar.M();
        if (zF || objM3 == fVar) {
            objM3 = new hb0.o(29, b1Var, lVar);
            sVar.k0(objM3);
        }
        m3.i.d(lVar, (Function1) objM3, sVar);
        boolean zH = sVar.h(b0Var) | sVar.f(lVar) | sVar.f(b1VarB);
        Object objM4 = sVar.M();
        if (zH || objM4 == fVar) {
            objM4 = new m2.u1(b0Var, b1Var, lVar, b1VarB);
            sVar.k0(objM4);
        }
        b4.t tVarA = w4.h0.a(b4.q.f5711a, lVar, (PointerInputEventHandler) objM4);
        sVar.q(false);
        return tVarA;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        Map map = (Map) this.f583b;
        com.google.firebase.messaging.a0 a0Var = (com.google.firebase.messaging.a0) this.f584c;
        int iIntValue = ((Integer) obj).intValue();
        String str = (String) obj2;
        g9.q0 q0Var = (g9.q0) obj3;
        str.getClass();
        q0Var.getClass();
        Object obj4 = map.get(str);
        obj4.getClass();
        List list = (List) obj4;
        int i11 = m9.h.$EnumSwitchMapping$0[(((q0Var instanceof g9.e) || ((KSerializer) a0Var.f12780c).getDescriptor().i(iIntValue)) ? m9.g.QUERY : m9.g.PATH).ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                e40.a.f();
                return null;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a0Var.v(str, (String) it.next());
            }
        } else {
            if (list.size() != 1) {
                StringBuilder sbS = e0.f.s("Expected one value for argument ", str, ", found ");
                sbS.append(list.size());
                sbS.append("values instead.");
                throw new IllegalArgumentException(sbS.toString().toString());
            }
            a0Var.f12781d = ((String) a0Var.f12781d) + '/' + ((String) CollectionsKt.O(list));
        }
        return Unit.f26487a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        m3.c3 c3Var = (m3.c3) this.f583b;
        m3.c3 c3Var2 = (m3.c3) this.f584c;
        d2.z1 z1Var = (d2.z1) obj;
        m3.n nVar = (m3.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        z1Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((m3.s) nVar).f(z1Var) ? 4 : 2;
        }
        m3.s sVar = (m3.s) nVar;
        if (!sVar.R(iIntValue & 1, (iIntValue & 19) != 18)) {
            sVar.U();
        } else if (((Boolean) c3Var.getValue()).booleanValue()) {
            j4.s.y(386227625, 0, sVar, sVar, false);
        } else if (((List) c3Var2.getValue()).isEmpty()) {
            sVar.a0(386306272);
            ii.l.e(R.drawable.ic_partners_store_empty_state, R.string.partner_stores_empty_state_text, 0, d2.c.y(d2.m2.f13850c, z1Var), sVar);
            sVar.q(false);
        } else {
            sVar.a0(386609421);
            oi.a.c((List) c3Var2.getValue(), d2.c.y(d2.m2.f13850c, z1Var), sVar, 0);
            sVar.q(false);
        }
        return Unit.f26487a;
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x08bb  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x08c0  */
    @Override // i80.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r56, java.lang.Object r57, java.lang.Object r58) {
        /*
            Method dump skipped, instruction units count: 3360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.u1.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ u1(Object obj, Object obj2, boolean z11, int i11) {
        this.f582a = i11;
        this.f584c = obj;
        this.f583b = obj2;
    }
}
