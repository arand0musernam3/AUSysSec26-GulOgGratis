package xi;

import b4.k;
import b4.q;
import b4.t;
import b5.h;
import b5.j;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.item.response.ItemType;
import com.app.tgtg.model.remote.order.response.CreateOrderResponse;
import com.google.android.gms.internal.measurement.cg;
import d2.b2;
import d2.m2;
import d2.n1;
import d2.p;
import d2.u;
import d2.w;
import d2.y;
import g3.o;
import g3.r9;
import g3.s0;
import i4.g0;
import i4.r0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import lv.v;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import o00.x0;
import o30.e0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import u3.i;
import vm.r;
import w.a0;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f {
    /* JADX WARN: Type inference failed for: r0v9, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v13, types: [T, java.lang.String] */
    public static final void a(CreateOrderResponse.CreateOrderState createOrderState, ItemType itemType, Function0 function0, n nVar, int i11) {
        String strU;
        String strU2;
        itemType.getClass();
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(1522810929);
        int i12 = i11 | (sVar.d(createOrderState == null ? -1 : createOrderState.ordinal()) ? 4 : 2) | (sVar.d(itemType.ordinal()) ? 32 : 16) | (sVar.h(function0) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = f0.U(sVar, R.string.profile_email_dialog_confirmation);
            switch (createOrderState != null ? e.$EnumSwitchMapping$1[createOrderState.ordinal()] : -1) {
                case 1:
                    sVar.a0(-1678823814);
                    strU = f0.U(sVar, R.string.reservation_error_title_user_blocked);
                    strU2 = f0.U(sVar, R.string.reservation_error_description_user_blocked);
                    sVar.q(false);
                    break;
                case 2:
                    sVar.a0(-1678578232);
                    objectRef.element = f0.U(sVar, R.string.reservation_error_btn_sale_closed);
                    strU = f0.U(sVar, R.string.reservation_error_title_sale_closed);
                    strU2 = f0.U(sVar, R.string.reservation_error_description_sale_closed);
                    sVar.q(false);
                    break;
                case 3:
                    sVar.a0(-1678235279);
                    if (e.$EnumSwitchMapping$0[itemType.ordinal()] == 1) {
                        sVar.a0(-1678185958);
                        strU = f0.U(sVar, R.string.reservation_error_title_sold_out_parcels);
                        strU2 = f0.U(sVar, R.string.reservation_error_description_sold_out_parcels);
                        sVar.q(false);
                    } else {
                        sVar.a0(-1677948374);
                        strU = f0.U(sVar, R.string.reservation_error_title_sold_out);
                        strU2 = f0.U(sVar, R.string.reservation_error_description_sold_out);
                        sVar.q(false);
                    }
                    sVar.q(false);
                    break;
                case 4:
                    sVar.a0(-1677655052);
                    strU = f0.U(sVar, R.string.reservation_error_title_over_user_limit);
                    strU2 = f0.U(sVar, R.string.reservation_error_description_over_user_limit);
                    sVar.q(false);
                    break;
                case 5:
                    sVar.a0(-1677398930);
                    strU = f0.U(sVar, R.string.reservation_error_title_insufficient_stock);
                    strU2 = f0.U(sVar, R.string.reservation_error_description_insufficient_stock);
                    sVar.q(false);
                    break;
                case 6:
                    sVar.a0(-1677146280);
                    strU = f0.U(sVar, R.string.reservation_error_title_unknown_state);
                    strU2 = f0.U(sVar, R.string.reservation_error_description_unknown_state);
                    sVar.q(false);
                    break;
                case 7:
                    sVar.a0(-1676896234);
                    strU = f0.U(sVar, R.string.reservation_error_title_unknown_state);
                    strU2 = f0.U(sVar, R.string.reservation_error_description_tax_server_down);
                    sVar.q(false);
                    break;
                case 8:
                    sVar.a0(-1676644204);
                    strU = f0.U(sVar, R.string.reservation_error_title_unknown_state);
                    strU2 = f0.U(sVar, R.string.reservation_error_description_tax_address_issue);
                    sVar.q(false);
                    break;
                default:
                    sVar.a0(-1676438984);
                    strU = f0.U(sVar, R.string.reservation_error_title_unknown_state);
                    strU2 = f0.U(sVar, R.string.reservation_error_description_unknown_state);
                    sVar.q(false);
                    break;
            }
            String str = strU2;
            long j9 = lv.s.J;
            r0 r0Var = g0.f23254b;
            q qVar = q.f5711a;
            t tVarJ = v1.n.j(qVar, j9, r0Var);
            k kVar = b4.d.f5683a;
            u0 u0VarD = p.d(kVar, false);
            int iHashCode = Long.hashCode(sVar.T);
            i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarJ, sVar);
            j.R.getClass();
            h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(u0VarD, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            float f11 = lv.t.f28253g;
            float f12 = lv.t.f28254h;
            t tVarC2 = d2.c.C(qVar, f11, f12, f11, f12);
            String str2 = strU;
            y yVarA = w.a(d2.i.f13803c, b4.d.f5695n, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            i iVarL2 = sVar.l();
            t tVarC3 = b4.a.c(tVarC2, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC3, gVar4, sVar);
            le.p pVarD = e0.D(new le.q("sad_smiley_blob.json"), sVar, 6);
            le.h hVarJ = cg.j((he.k) pVarD.getValue(), false, false, 0.0f, Integer.MAX_VALUE, sVar, 958);
            t tVarC4 = m2.c(m2.d(qVar, 1.0f), 0.5f);
            u0 u0VarD2 = p.d(kVar, false);
            int iHashCode3 = Long.hashCode(sVar.T);
            i iVarL3 = sVar.l();
            t tVarC5 = b4.a.c(tVarC4, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD2, gVar, sVar);
            m3.i.C(iVarL3, gVar2, sVar);
            a0.y(iHashCode3, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC5, gVar4, sVar);
            t tVarThen = d2.c.z(qVar, lv.t.f28257k).then(m2.f13850c);
            k kVar2 = b4.d.f5687e;
            u uVar = u.f13938a;
            t tVarA = uVar.a(tVarThen, kVar2);
            he.k kVar3 = (he.k) pVarD.getValue();
            boolean zF = sVar.f(hVarJ);
            Object objM = sVar.M();
            m3.f fVar = m.f29332a;
            if (zF || objM == fVar) {
                objM = new cg.f(hVarJ, 5);
                sVar.k0(objM);
            }
            x0.g(kVar3, (Function0) objM, tVarA, false, false, false, false, null, false, null, null, false, false, null, null, false, sVar, 0, 0, 131064);
            r9.d(str2, d2.c.B(uVar.a(qVar, b4.d.f5690h), f12, 0.0f, 2), lv.s.f28231k, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, v.f28270i, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
            sVar.q(true);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            r9.d(str, d2.c.D(new n1(1.0f, true), f12, f11, f12, 0.0f, 8), lv.s.C, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, v.f28274n, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
            t tVarD = m2.d(qVar, 1.0f);
            l2.f fVarA = l2.g.a(100);
            b2 b2Var = g3.p.f19253a;
            o oVarA = g3.p.a(lv.s.f28217b, 0L, 0L, 0L, sVar, 14);
            boolean z11 = (i12 & 896) == 256;
            Object objM2 = sVar.M();
            if (z11 || objM2 == fVar) {
                objM2 = new r(15, function0);
                sVar.k0(objM2);
            }
            s0.a((Function0) objM2, tVarD, false, fVarA, oVarA, null, null, null, null, u3.e.e(-952053307, sVar, new tq.c(objectRef, 8)), sVar, 805306416, 484);
            sVar = sVar;
            sVar.q(true);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new rs.b(createOrderState, itemType, function0, i11, 14);
        }
    }
}
