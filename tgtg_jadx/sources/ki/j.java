package ki;

import android.content.Context;
import android.widget.Toast;
import b4.k;
import b4.q;
import b4.t;
import bn.c0;
import bn.z;
import c5.d2;
import c5.f1;
import c5.v0;
import c5.x1;
import cg.g0;
import cg.k0;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.item.StoreInformation;
import com.app.tgtg.model.remote.item.StoreLocation;
import com.app.tgtg.model.remote.item.response.CharityItem;
import com.app.tgtg.model.remote.user.response.charity.Product;
import com.app.tgtg.model.remote.user.response.charity.ProductChangelog;
import com.app.tgtg.model.remote.user.response.charity.ProductStatus;
import d2.b2;
import d2.h2;
import d2.i1;
import d2.i2;
import d2.m2;
import d2.n1;
import d2.p;
import d2.w;
import d2.y;
import d6.a0;
import g3.o;
import g3.r9;
import g3.s0;
import i4.r0;
import ii.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KFunction;
import lv.v;
import m3.b1;
import m3.d3;
import m3.n;
import m3.s;
import m3.w1;
import m5.u0;
import o00.x0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import s1.b0;
import x5.l;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u3.d f26413a = new u3.d(new m(8), false, -1734410751);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u3.d f26414b = new u3.d(new m(9), false, 810428739);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f26415c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f26416d = 0;

    /* JADX WARN: Removed duplicated region for block: B:159:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0434  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(b4.t r40, final com.app.tgtg.model.remote.item.response.CharityItem r41, kotlin.jvm.functions.Function1 r42, final kotlin.jvm.functions.Function1 r43, final kotlin.jvm.functions.Function1 r44, final kotlin.jvm.functions.Function0 r45, final kotlin.jvm.functions.Function1 r46, kotlin.jvm.functions.Function0 r47, kotlin.jvm.functions.Function0 r48, m3.n r49, int r50) {
        /*
            Method dump skipped, instruction units count: 1187
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ki.j.a(b4.t, com.app.tgtg.model.remote.item.response.CharityItem, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, m3.n, int):void");
    }

    public static final boolean b(b1 b1Var) {
        return ((Boolean) b1Var.getValue()).booleanValue();
    }

    public static final void c(Function0 function0, Function0 function02, n nVar, int i11) {
        function0.getClass();
        function02.getClass();
        s sVar = (s) nVar;
        sVar.c0(-499763892);
        int i12 = (sVar.h(function0) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            Object objM = sVar.M();
            if (objM == m3.m.f29332a) {
                objM = new jq.a(6);
                sVar.k0(objM);
            }
            ex.i.b((Function0) objM, new a0(true, true, false), u3.e.e(-745817309, sVar, new g0(function0, function02, 6)), sVar, 438, 0);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new g0(function0, function02, i11, 7);
        }
    }

    public static final void d(Function0 function0, Function0 function02, n nVar, int i11) {
        function0.getClass();
        function02.getClass();
        s sVar = (s) nVar;
        sVar.c0(-1088402366);
        int i12 = (sVar.h(function0) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            Object objM = sVar.M();
            if (objM == m3.m.f29332a) {
                objM = new jq.a(7);
                sVar.k0(objM);
            }
            ex.i.b((Function0) objM, new a0(true, true, false), u3.e.e(-925346407, sVar, new g0(function0, function02, 8)), sVar, 438, 0);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new g0(function0, function02, i11, 9);
        }
    }

    public static final void e(t tVar, String str, String str2, String str3, boolean z11, n nVar, int i11, int i12) {
        String str4;
        int i13;
        String str5;
        int i14;
        t tVarH;
        String str6;
        str.getClass();
        str2.getClass();
        s sVar = (s) nVar;
        sVar.c0(794976868);
        int i15 = i11 | (sVar.f(str) ? 32 : 16) | (sVar.f(str2) ? 256 : 128);
        int i16 = i12 & 8;
        if (i16 != 0) {
            i13 = i15 | 3072;
            str4 = str3;
        } else {
            str4 = str3;
            i13 = i15 | (sVar.f(str4) ? NewHope.SENDB_BYTES : 1024);
        }
        if (sVar.R(i13 & 1, (i13 & 9363) != 9362)) {
            if (i16 != 0) {
                str4 = null;
            }
            Object objM = sVar.M();
            if (objM == m3.m.f29332a) {
                objM = e0.f.w(z11, sVar);
            }
            b1 b1Var = (b1) objM;
            f1 f1Var = (f1) sVar.j(x1.f7425r);
            t tVarA = b0.a(m2.u(m2.d(d2.c.A(tVar, 16, 24), 1.0f), null, 3), null, 3);
            d2.d dVar = d2.i.f13803c;
            String str7 = str4;
            b4.i iVar = b4.d.f5694m;
            y yVarA = w.a(dVar, iVar, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarA, sVar);
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
            b5.d dVar2 = b5.i.f5845h;
            m3.i.z(sVar, dVar2);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            q qVar = q.f5711a;
            int i17 = i13;
            t tVarD = m2.d(m2.t(qVar, 3), 1.0f);
            k0 k0Var = new k0(b1Var, 1);
            c5.s sVar2 = c5.m2.f7291a;
            t tVarA2 = b4.a.a(tVarD, sVar2, k0Var);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = b4.a.c(tVarA2, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar2);
            m3.i.C(tVarC2, gVar4, sVar);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            t tVarT = m2.t(new n1(1.0f, true), 3);
            u0 u0Var = v.f28272k;
            long j9 = lv.s.C;
            r9.d(str, tVarT, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, ((i17 >> 3) & 14) | MLKEMEngine.KyberPolyBytes, 12582912, 131064);
            v1.n.d(x0.z(((Boolean) b1Var.getValue()).booleanValue() ? R.drawable.ic_minus : R.drawable.ic_plus, sVar, 0), "IcExpand", null, null, null, 0.0f, null, sVar, 56, 124);
            sVar.q(true);
            float f11 = lv.t.f28251e;
            t tVarD2 = m2.d(d2.c.D(qVar, 0.0f, f11, 0.0f, 0.0f, 13), 1.0f);
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                i14 = 3;
                tVarH = m2.t(qVar, 3);
            } else {
                i14 = 3;
                tVarH = m2.h(qVar, 0);
            }
            t tVarA3 = b0.a(tVarD2.then(tVarH), null, i14);
            y yVarA2 = w.a(dVar, iVar, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            t tVarC3 = b4.a.c(tVarA3, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA2, gVar, sVar);
            m3.i.C(iVarL3, gVar2, sVar);
            w.a0.y(iHashCode3, sVar, gVar3, sVar, dVar2);
            m3.i.C(tVarC3, gVar4, sVar);
            r9.d(str2, m2.t(m2.d(qVar, 1.0f), i14), j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28274n, sVar, ((i17 >> 6) & 14) | 432, 12582912, 131064);
            sVar = sVar;
            if (str7 == null) {
                sVar.a0(-233071553);
                sVar.q(false);
                str6 = str7;
            } else {
                sVar.a0(-233071552);
                str6 = str7;
                r9.d(f0.U(sVar, R.string.charity_item_allergens_website), b4.a.a(d2.c.D(m2.d(qVar, 1.0f), 0.0f, f11, 0.0f, 0.0f, 13), sVar2, new c0(8, f1Var, str7)), lv.s.f28217b, 0L, null, 0L, l.f43854c, null, 0L, 0, false, 0, 0, null, v.f28283w, sVar, 805306752, 12582912, 130552);
                sVar = sVar;
                sVar.q(false);
            }
            sVar.q(true);
            sVar.q(true);
            str5 = str6;
        } else {
            sVar.U();
            str5 = str4;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new eg.b(tVar, str, str2, str5, z11, i11, i12);
        }
    }

    public static final void f(t tVar, List list, ArrayList arrayList, Function0 function0, n nVar, int i11) {
        boolean z11;
        int i12;
        float f11;
        boolean z12;
        Function0 function02 = function0;
        b4.i iVar = b4.d.f5694m;
        list.getClass();
        function02.getClass();
        s sVar = (s) nVar;
        sVar.c0(1607640565);
        int i13 = i11 | (sVar.h(list) ? 32 : 16) | (sVar.h(arrayList) ? 256 : 128) | (sVar.h(function02) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i13 & 1, (i13 & 1171) != 1170)) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                ProductChangelog changelog = ((Product) next).getChangelog();
                if ((changelog != null ? changelog.getStatus() : null) != ProductStatus.REMOVED) {
                    arrayList2.add(next);
                }
            }
            boolean z13 = arrayList2.size() > 5;
            t tVarJ = d2.j(m2.u(m2.d(d2.c.D(tVar, 0.0f, lv.t.f28256j, 0.0f, 0.0f, 13), 1.0f), null, 3), "InventoryColumn");
            y yVarA = w.a(d2.i.f13803c, iVar, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarJ, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            float f12 = lv.t.f28253g;
            q qVar = q.f5711a;
            t tVarT = m2.t(m2.d(d2.c.B(qVar, f12, 0.0f, 2), 1.0f), 3);
            Iterator it2 = arrayList2.iterator();
            long quantity = 0;
            while (it2.hasNext()) {
                quantity = ((Product) it2.next()).getQuantity() + quantity;
            }
            r9.d(f0.T(R.string.charity_item_donation_inventory, new Object[]{Long.valueOf(quantity)}, sVar), tVarT, lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28272k, sVar, 432, 12582912, 131064);
            sVar = sVar;
            if (arrayList.isEmpty()) {
                z11 = true;
                i12 = 2;
                f11 = 0.0f;
                sVar.a0(-1218517373);
                sVar.q(false);
            } else {
                sVar.a0(-1218857567);
                t tVarD = m2.d(qVar, 1.0f);
                float f13 = lv.t.f28253g;
                i12 = 2;
                f11 = 0.0f;
                t tVarB = d2.c.B(d2.c.D(tVarD, 0.0f, f13, 0.0f, 0.0f, 13), f13, 0.0f, 2);
                z11 = true;
                ji.i.b(tVarB, arrayList, !arrayList2.isEmpty(), sVar, ((i13 >> 3) & 112) | 6);
                sVar.q(false);
            }
            t tVarQ = d2.c.q(d2.c.D(d2.c.B(qVar, lv.t.f28253g, f11, i12), 0.0f, lv.t.f28251e, 0.0f, 0.0f, 13), i1.Max);
            z4.u0 u0VarD = p.d(b4.d.f5683a, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = b4.a.c(tVarQ, sVar);
            b5.j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(u0VarD, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL2, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode2);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC2, gVar4, sVar);
            y yVarA2 = w.a(d2.i.f13803c, iVar, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            t tVarC3 = b4.a.c(qVar, sVar);
            sVar.e0();
            boolean z14 = z11;
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA2, gVar, sVar);
            m3.i.C(iVarL3, gVar2, sVar);
            w.a0.y(iHashCode3, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC3, gVar4, sVar);
            List listM0 = CollectionsKt.m0(arrayList2, 5);
            sVar.a0(-219721671);
            int i14 = 0;
            for (Object obj : listM0) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    d0.n();
                    throw null;
                }
                ji.i.c(d2.j(qVar, "CharityInventoryItem" + i14), (Product) obj, sVar, 0);
                if (i14 < listM0.size() - 1) {
                    sVar.a0(-646293724);
                    s0.g(d2.j(qVar, "HorizontalDivider" + i14), z14 ? 1.0f : 0.0f, lv.s.H, sVar, 432, 0);
                    sVar.q(false);
                } else {
                    sVar.a0(-646029449);
                    sVar.q(false);
                }
                i14 = i15;
                z14 = true;
            }
            boolean z15 = z14;
            e0.f.D(sVar, false, z15, z15);
            if (z13) {
                sVar.a0(-1217576709);
                t tVarA = d2.c.A(m2.d(qVar, 1.0f), lv.t.f28253g, lv.t.f28251e);
                String strU = f0.U(sVar, R.string.charity_item_full_inventory);
                boolean z16 = (i13 & 7168) == 2048 ? z15 : false;
                Object objM = sVar.M();
                if (z16 || objM == m3.m.f29332a) {
                    function02 = function0;
                    objM = new a(0, function02);
                    sVar.k0(objM);
                } else {
                    function02 = function0;
                }
                z12 = z15;
                v0.n.n(tVarA, strU, null, null, null, false, false, null, null, (Function0) objM, sVar, 0, 508);
                sVar = sVar;
                sVar.q(false);
            } else {
                function02 = function0;
                z12 = z15;
                sVar.a0(-1217169245);
                sVar.q(false);
            }
            sVar.q(z12);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.p(tVar, list, i11, arrayList, function02, 23);
        }
    }

    public static final void g(t tVar, String str, String str2, String str3, Function0 function0, Function0 function02, n nVar, int i11) {
        t tVar2;
        str.getClass();
        function0.getClass();
        function02.getClass();
        s sVar = (s) nVar;
        sVar.c0(1323622628);
        int i12 = i11 | (sVar.f(str) ? 32 : 16) | (sVar.f(str2) ? 256 : 128) | (sVar.f(str3) ? NewHope.SENDB_BYTES : 1024) | (sVar.h(function0) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar.h(function02) ? 131072 : 65536);
        if (sVar.R(i12 & 1, (74899 & i12) != 74898)) {
            tVar2 = tVar;
            t tVarD = m2.d(tVar2, 1.0f);
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarD, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            h(null, f0.U(sVar, R.string.charity_item_time), str, "PickupTime", null, sVar, ((i12 << 3) & 896) | 3072, 17);
            h(null, f0.U(sVar, R.string.charity_item_location), str2, "AddressRow", function0, sVar, (i12 & 896) | 3072 | (i12 & 57344), 1);
            if (str3 != null) {
                sVar.a0(892495438);
                int i13 = i12 >> 3;
                h(null, f0.U(sVar, R.string.charity_item_phone_number), str3, "PhoneNumberRow", function02, sVar, (i13 & 896) | 3072 | (i13 & 57344), 1);
                sVar.q(false);
            } else {
                sVar.a0(892766440);
                sVar.q(false);
            }
            sVar.q(true);
        } else {
            tVar2 = tVar;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new z(tVar2, str, str2, str3, function0, function02, i11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(b4.t r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, kotlin.jvm.functions.Function0 r39, m3.n r40, int r41, int r42) {
        /*
            Method dump skipped, instruction units count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ki.j.h(b4.t, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, m3.n, int, int):void");
    }

    public static final void i(t tVar, Function0 function0, Function0 function02, n nVar, int i11) {
        t tVar2;
        boolean z11;
        function0.getClass();
        function02.getClass();
        s sVar = (s) nVar;
        sVar.c0(-1590605463);
        int i12 = i11 | 6 | (sVar.h(function0) ? 32 : 16) | (sVar.h(function02) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            long j9 = lv.s.J;
            r0 r0Var = i4.g0.f23254b;
            q qVar = q.f5711a;
            t tVarZ = d2.c.z(d2.c.t(m2.t(m2.d(v1.n.j(qVar, j9, r0Var), 1.0f), 3)), lv.t.f28253g);
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarZ, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            t tVarD = m2.d(qVar, 1.0f);
            String strU = f0.U(sVar, R.string.charity_item_reserve);
            boolean z12 = (i12 & 112) == 32;
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (z12 || objM == fVar) {
                z11 = true;
                objM = new a(1, function0);
                sVar.k0(objM);
            } else {
                z11 = true;
            }
            v0.n.l(tVarD, strU, null, null, null, false, false, null, null, (Function0) objM, sVar, 6, 508);
            t tVarH = m2.h(m2.d(d2.c.D(qVar, 0.0f, lv.t.f28251e, 0.0f, 0.0f, 13), 1.0f), 40);
            b2 b2Var = g3.p.f19253a;
            o oVarA = g3.p.a(j9, lv.s.f28217b, 0L, 0L, sVar, 12);
            boolean z13 = (i12 & 896) == 256;
            Object objM2 = sVar.M();
            if (z13 || objM2 == fVar) {
                objM2 = new a(2, function02);
                sVar.k0(objM2);
            }
            s0.a((Function0) objM2, tVarH, false, null, oVarA, null, null, null, null, f26414b, sVar, 805306416, 492);
            sVar.q(true);
            tVar2 = qVar;
        } else {
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new dm.f(tVar2, function0, function02, i11, 1);
        }
    }

    public static final void j(final i iVar, Function1 function1, Function0 function0, n nVar, int i11) {
        s sVar;
        CharityItem charityItem;
        CharityItem charityItem2;
        iVar.getClass();
        function1.getClass();
        function0.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(1055876470);
        int i12 = i11 | (sVar2.h(iVar) ? 4 : 2) | (sVar2.h(function1) ? 32 : 16) | (sVar2.h(function0) ? 256 : 128);
        final int i13 = 1;
        final int i14 = 0;
        if (sVar2.R(i12 & 1, (i12 & 147) != 146)) {
            d3 d3Var = v0.f7390b;
            Context context = (Context) sVar2.j(d3Var);
            boolean zBooleanValue = ((Boolean) m3.i.n(iVar.f26411k, sVar2, 0).getValue()).booleanValue();
            CharityItem charityItem3 = (CharityItem) m3.i.n(iVar.f26409i, sVar2, 0).getValue();
            if (((Boolean) m3.i.n(iVar.f26412m, sVar2, 0).getValue()) != null) {
                sVar2.a0(-724165889);
                Toast.makeText((Context) sVar2.j(d3Var), f0.U(sVar2, R.string.item_view_error_on_load_store), 0).show();
                sVar2.q(false);
            } else if (zBooleanValue && charityItem3 == null) {
                sVar2.a0(-723911162);
                k kVar = b4.d.f5687e;
                d2.g0 g0Var = m2.f13850c;
                z4.u0 u0VarD = p.d(kVar, false);
                int iHashCode = Long.hashCode(sVar2.T);
                u3.i iVarL = sVar2.l();
                t tVarC = b4.a.c(g0Var, sVar2);
                b5.j.R.getClass();
                b5.h hVar = b5.i.f5839b;
                sVar2.e0();
                if (sVar2.S) {
                    sVar2.k(hVar);
                } else {
                    sVar2.n0();
                }
                m3.i.C(u0VarD, b5.i.f5843f, sVar2);
                m3.i.C(iVarL, b5.i.f5842e, sVar2);
                m3.i.v(sVar2, Integer.valueOf(iHashCode), b5.i.f5844g);
                m3.i.z(sVar2, b5.i.f5845h);
                m3.i.C(tVarC, b5.i.f5841d, sVar2);
                cg.j.o(sVar2, 0);
                sVar2.q(true);
                sVar2.q(false);
            } else if (charityItem3 != null) {
                sVar2.a0(-723653056);
                t tVarJ = d2.j(m2.f13850c, "CharityItem");
                boolean zH = sVar2.h(iVar) | ((i12 & 896) == 256) | sVar2.h(charityItem3) | sVar2.h(context);
                Object objM = sVar2.M();
                m3.f fVar = m3.m.f29332a;
                if (zH || objM == fVar) {
                    charityItem = charityItem3;
                    b0.x1 x1Var = new b0.x1(13, iVar, charityItem, context, function0);
                    sVar2.k0(x1Var);
                    objM = x1Var;
                } else {
                    charityItem = charityItem3;
                }
                Function1 function12 = (Function1) objM;
                boolean zH2 = sVar2.h(iVar);
                Object objM2 = sVar2.M();
                if (zH2 || objM2 == fVar) {
                    objM2 = new Function1() { // from class: ki.g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i14) {
                                case 0:
                                    StoreInformation storeInformation = (StoreInformation) obj;
                                    storeInformation.getClass();
                                    StoreLocation storeLocation = storeInformation.getStoreLocation();
                                    LatLngInfo latLngInfo = storeLocation.getLatLngInfo();
                                    if (storeLocation.getAddress().getStreetAddress() != null && latLngInfo != null) {
                                        iVar.f26406f.f44310a.a(new f70.m(latLngInfo.getLatitude(), latLngInfo.getLongitude()));
                                    }
                                    break;
                                default:
                                    at.c0.c(iVar.f26407g, (String) obj, null, null, false, 30);
                                    break;
                            }
                            return Unit.f26487a;
                        }
                    };
                    sVar2.k0(objM2);
                }
                Function1 function13 = (Function1) objM2;
                boolean zH3 = sVar2.h(iVar);
                Object objM3 = sVar2.M();
                if (zH3 || objM3 == fVar) {
                    charityItem2 = charityItem;
                    al.d dVar = new al.d(1, iVar, i.class, "openPhoneDialer", "openPhoneDialer(Ljava/lang/String;)V", 0, 14);
                    sVar2.k0(dVar);
                    objM3 = dVar;
                } else {
                    charityItem2 = charityItem;
                }
                Function1 function14 = (Function1) ((KFunction) objM3);
                boolean zH4 = ((i12 & 112) == 32) | sVar2.h(charityItem2);
                Object objM4 = sVar2.M();
                if (zH4 || objM4 == fVar) {
                    objM4 = new c(function1, charityItem2, i13);
                    sVar2.k0(objM4);
                }
                Function0 function02 = (Function0) objM4;
                boolean zH5 = sVar2.h(iVar);
                Object objM5 = sVar2.M();
                if (zH5 || objM5 == fVar) {
                    objM5 = new Function1() { // from class: ki.g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i13) {
                                case 0:
                                    StoreInformation storeInformation = (StoreInformation) obj;
                                    storeInformation.getClass();
                                    StoreLocation storeLocation = storeInformation.getStoreLocation();
                                    LatLngInfo latLngInfo = storeLocation.getLatLngInfo();
                                    if (storeLocation.getAddress().getStreetAddress() != null && latLngInfo != null) {
                                        iVar.f26406f.f44310a.a(new f70.m(latLngInfo.getLatitude(), latLngInfo.getLongitude()));
                                    }
                                    break;
                                default:
                                    at.c0.c(iVar.f26407g, (String) obj, null, null, false, 30);
                                    break;
                            }
                            return Unit.f26487a;
                        }
                    };
                    sVar2.k0(objM5);
                }
                Function1 function15 = (Function1) objM5;
                boolean zH6 = sVar2.h(iVar);
                Object objM6 = sVar2.M();
                if (zH6 || objM6 == fVar) {
                    objM6 = new jt.g(iVar, 8);
                    sVar2.k0(objM6);
                }
                a(tVarJ, charityItem2, function12, function13, function14, function02, function15, (Function0) objM6, function0, sVar2, ((i12 << 18) & 234881024) | 6);
                sVar = sVar2;
                if (zBooleanValue) {
                    j4.s.y(-721756352, 0, sVar, sVar, false);
                } else {
                    sVar.a0(-721714068);
                    sVar.q(false);
                }
                sVar.q(false);
            } else {
                sVar = sVar2;
                sVar.a0(-721698196);
                sVar.q(false);
            }
            sVar = sVar2;
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new h(iVar, function1, function0, i11, 0);
        }
    }

    public static final void k(int i11, t tVar, Function0 function0, n nVar) {
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(-1948283147);
        int i12 = i11 | (sVar.h(function0) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            t tVarThen = tVar.then(m2.f13850c);
            boolean z11 = (i12 & 112) == 32;
            Object objM = sVar.M();
            if (z11 || objM == m3.m.f29332a) {
                objM = new a(4, function0);
                sVar.k0(objM);
            }
            t tVarJ = d2.j(androidx.compose.foundation.b.c(tVarThen, false, null, null, (Function0) objM, 15), "SmileyReport");
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarJ, sVar);
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
            float f11 = 16;
            q qVar = q.f5711a;
            t tVarD = d2.c.D(qVar, f11, 0.0f, 0.0f, 0.0f, 14);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            r9.d(f0.U(sVar, R.string.charity_item_smiley_report), b3.i.e(1.0f, tVarD, true), lv.s.f28217b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28275o, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
            sVar = sVar;
            float f12 = 32;
            float f13 = 24;
            v1.n.d(x0.z(R.drawable.ic_open_in_new, sVar, 0), "IconOpenInNew", m2.h(m2.l(d2.c.D(qVar, 0.0f, f12, f11, f12, 1), f13), f13), null, null, 0.0f, null, sVar, 56, 120);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new dm.g(tVar, function0, i11, 2);
        }
    }

    public static final void l(int i11, t tVar, Function0 function0, n nVar) {
        t tVar2;
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(498403093);
        int i12 = i11 | 6;
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(function0) ? 32 : 16;
        }
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            q qVar = q.f5711a;
            t tVarD = m2.d(qVar, 1.0f);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5692j, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarD, sVar);
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
            float f11 = 40;
            t tVarB = f4.g.b(m2.h(m2.l(d2.c.z(d2.c.E(qVar), 16), f11), f11), l2.g.f26790a);
            boolean z11 = (i12 & 112) == 32;
            Object objM = sVar.M();
            if (z11 || objM == m3.m.f29332a) {
                objM = new a(5, function0);
                sVar.k0(objM);
            }
            t tVarC2 = androidx.compose.foundation.b.c(tVarB, false, null, null, (Function0) objM, 15);
            z4.u0 u0VarD = p.d(b4.d.f5687e, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC3 = b4.a.c(tVarC2, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC3, gVar4, sVar);
            float f12 = 24;
            v1.n.d(x0.z(R.drawable.ic_arrow_back, sVar, 0), "ArrowBack", m2.h(m2.l(qVar, f12), f12), null, null, 0.0f, null, sVar, 440, 120);
            sVar.q(true);
            sVar.q(true);
            tVar2 = qVar;
        } else {
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new hj.a(tVar2, function0, i11, 1, (byte) 0);
        }
    }

    public static final void m(int i11, boolean z11, u3.d dVar, n nVar, int i12) {
        boolean z12;
        u3.d dVar2;
        s sVar = (s) nVar;
        sVar.c0(2112745498);
        int i13 = (sVar.g(z11) ? 32 : 16) | i12;
        if (sVar.R(i13 & 1, (i13 & 147) != 146)) {
            t1.b1 b1VarJ = t1.c.j(0.5f, 75.0f, null, 4);
            Object objM = sVar.M();
            if (objM == m3.m.f29332a) {
                objM = new f2.y(i11, 3);
                sVar.k0(objM);
            }
            z12 = z11;
            dVar2 = dVar;
            s1.y.d(z12, null, s1.r0.m((Function1) objM, b1VarJ).a(s1.r0.d(t1.c.j(0.0f, 100.0f, null, 5), 2)), null, null, dVar2, sVar, ((i13 >> 3) & 14) | 196608, 26);
        } else {
            z12 = z11;
            dVar2 = dVar;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new hg.b(i11, z12, dVar2, i12);
        }
    }
}
