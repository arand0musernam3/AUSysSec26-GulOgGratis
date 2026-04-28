package wi;

import com.app.tgtg.R;
import com.app.tgtg.model.remote.ParcelDeliveryOptionId;
import com.app.tgtg.model.remote.manufacturer.response.DeliveryOptionMethod;
import com.app.tgtg.model.remote.manufacturer.response.DeliveryOptionsLocal;
import com.app.tgtg.model.remote.payment.Price;
import d2.h2;
import d2.i2;
import d2.m2;
import d2.n1;
import d2.w;
import d2.y;
import g3.r9;
import g9.d0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import lv.t;
import lv.v;
import m3.w1;
import m5.u0;
import o00.x0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import w.a0;
import z4.c0;
import z4.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class p {
    /* JADX WARN: Removed duplicated region for block: B:58:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0188  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.util.ArrayList r20, com.app.tgtg.model.remote.manufacturer.response.DeliveryOptionsLocal r21, java.util.List r22, i80.n r23, g9.d0 r24, wi.e r25, int r26, m3.n r27, int r28) {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wi.p.a(java.util.ArrayList, com.app.tgtg.model.remote.manufacturer.response.DeliveryOptionsLocal, java.util.List, i80.n, g9.d0, wi.e, int, m3.n, int):void");
    }

    public static final void b(d dVar, int i11, m3.n nVar, int i12) {
        d dVar2;
        boolean z11;
        dVar.getClass();
        DeliveryOptionMethod deliveryOptionMethod = dVar.f43431b;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(2096177626);
        int i13 = i12 | (sVar.f(dVar) ? 4 : 2) | (sVar.d(i11) ? 32 : 16);
        if (sVar.R(i13 & 1, (i13 & 19) != 18)) {
            float f11 = t.f28254h;
            b4.q qVar = b4.q.f5711a;
            d2.c.f(m2.m(qVar, f11), sVar);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(qVar, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            DeliveryOptionMethod deliveryOptionMethod2 = DeliveryOptionMethod.HOME;
            String strU = f0.U(sVar, deliveryOptionMethod == deliveryOptionMethod2 ? R.string.mnu_checkout_overview_delivery_category_home : R.string.mnu_checkout_overview_mdo_pickup_title);
            u0 u0Var = v.f28279s;
            long j9 = lv.s.C;
            r9.d(strU, null, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
            sVar = sVar;
            b4.t tVarM = m2.m(qVar, t.f28251e);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            d2.c.f(tVarM.then(new n1(1.0f, true)), sVar);
            if ((deliveryOptionMethod == deliveryOptionMethod2 && i11 == 1) || deliveryOptionMethod == DeliveryOptionMethod.PICKUP_POINT) {
                sVar.a0(-954553493);
                dVar2 = dVar;
                Price price = dVar2.f43430a;
                if (price == null) {
                    sVar.a0(473612790);
                    sVar.q(false);
                    z11 = false;
                } else {
                    sVar.a0(473612791);
                    String strI = mv.d.i(price, 1);
                    if (price.getValue() == 0.0d) {
                        sVar.a0(177872070);
                        float f12 = 8;
                        z11 = false;
                        r9.d(f0.U(sVar, R.string.mnu_checkout_overview_free_delivery), d2.c.A(v1.n.j(qVar, lv.s.I, l2.g.b(f12)), f12, 4), j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28275o, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
                        sVar = sVar;
                        sVar.q(false);
                    } else {
                        z11 = false;
                        sVar.a0(178349687);
                        r9.d(strI, null, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28275o, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                        sVar = sVar;
                        sVar.q(false);
                    }
                    sVar.q(z11);
                }
                sVar.q(z11);
            } else {
                dVar2 = dVar;
                sVar.a0(474311748);
                sVar.q(false);
            }
            sVar.q(true);
        } else {
            dVar2 = dVar;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c60.c(dVar2, i11, i12);
        }
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [T, java.util.List] */
    public static final void c(DeliveryOptionsLocal deliveryOptionsLocal, String str, boolean z11, i80.n nVar, Function1 function1, m3.n nVar2, int i11) {
        nVar.getClass();
        function1.getClass();
        m3.s sVar = (m3.s) nVar2;
        sVar.c0(-1056876854);
        int i12 = i11 | (sVar.h(deliveryOptionsLocal) ? 4 : 2) | (sVar.f(str != null ? ParcelDeliveryOptionId.m221boximpl(str) : null) ? 32 : 16) | (sVar.g(z11) ? 256 : 128) | (sVar.h(nVar) ? NewHope.SENDB_BYTES : 1024) | (sVar.h(function1) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192);
        if (sVar.R(i12 & 1, (i12 & 9363) != 9362)) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Object objM = sVar.M();
            if (objM == m3.m.f29332a) {
                objM = new ArrayList();
                sVar.k0(objM);
            }
            objectRef.element = (List) objM;
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.q qVar = b4.q.f5711a;
            b4.t tVarC = b4.a.c(qVar, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(yVarA, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            d2.c.f(m2.m(qVar, t.f28256j), sVar);
            float f11 = t.f28253g;
            b4.t tVarB = d2.c.B(qVar, f11, 0.0f, 2);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarB, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            r9.d(f0.U(sVar, R.string.mnu_checkout_overview_mdo_list_title), null, lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.l, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
            b4.t tVarM = m2.m(qVar, t.f28251e);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            d2.c.f(tVarM.then(new n1(1.0f, true)), sVar);
            v1.n.d(x0.z(R.drawable.system_icon_close_neutral_80, sVar, 0), f0.U(sVar, R.string.voice_over_back), androidx.compose.foundation.b.c(qVar, false, null, null, new r7.a(function1, objectRef, 2), 15), null, null, 0.0f, null, sVar, 8, 120);
            sVar = sVar;
            sVar.q(true);
            int i13 = i12 << 3;
            d(deliveryOptionsLocal, str, (List) objectRef.element, z11, nVar, new d0(objectRef, 3), sVar, (i12 & 126) | (i13 & 7168) | (i13 & 57344));
            b3.i.y(qVar, f11, sVar, true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bg.d(deliveryOptionsLocal, str, z11, nVar, function1, i11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0121 A[LOOP:2: B:76:0x011b->B:78:0x0121, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00e7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final com.app.tgtg.model.remote.manufacturer.response.DeliveryOptionsLocal r23, final java.lang.String r24, final java.util.List r25, final boolean r26, i80.n r27, final g9.d0 r28, m3.n r29, int r30) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wi.p.d(com.app.tgtg.model.remote.manufacturer.response.DeliveryOptionsLocal, java.lang.String, java.util.List, boolean, i80.n, g9.d0, m3.n, int):void");
    }

    public static final boolean e(z zVar) {
        zVar.getClass();
        if (!zVar.n()) {
            return false;
        }
        int iU = (int) (zVar.u() & 4294967295L);
        int i11 = (iU * 80) / 100;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & zVar.S(0L)));
        float f11 = iU + fIntBitsToFloat;
        z zVarK = zVar.K();
        if (zVarK == null) {
            return false;
        }
        h4.c cVarV = c0.i(zVarK).v(zVarK, true);
        float f12 = i11;
        return cVarV.f21383d - fIntBitsToFloat > f12 && cVarV.f21381b < f11 - f12;
    }
}
