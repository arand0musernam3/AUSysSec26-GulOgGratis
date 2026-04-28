package wi;

import android.content.Context;
import b4.t;
import cg.v0;
import cj.e0;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.ParcelDeliveryOptionId;
import com.app.tgtg.model.remote.item.BasicItemInformation;
import com.app.tgtg.model.remote.item.Picture;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.manufacturer.response.BasketResponse;
import com.app.tgtg.model.remote.manufacturer.response.DeliveryOptionsLocal;
import com.app.tgtg.model.remote.user.requests.UserAddress;
import d2.h2;
import d2.i2;
import d2.m2;
import d2.n1;
import d2.w;
import d2.y;
import d2.z;
import g3.j1;
import g3.r9;
import g3.v3;
import g3.w6;
import i4.g0;
import jb.u;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import lv.v;
import m2.d1;
import m3.b1;
import m3.w1;
import mv.r0;
import o00.x0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import w.a0;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u3.d f43426a = new u3.d(new tp.a(9), false, 1571489642);

    public static final void a(jg.c cVar, UserAddress userAddress, boolean z11, Function0 function0, m3.n nVar, int i11) {
        int i12;
        boolean z12;
        String strJ;
        cVar.getClass();
        userAddress.getClass();
        function0.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(424369681);
        if ((i11 & 6) == 0) {
            i12 = (sVar.d(cVar.ordinal()) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(userAddress) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.g(z11) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(function0) ? NewHope.SENDB_BYTES : 1024;
        }
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            b4.q qVar = b4.q.f5711a;
            t tVarZ = z11 ? qVar : d2.c.z(qVar, lv.t.f28252f);
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
            t tVarD = m2.d(qVar, 1.0f);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = b4.a.c(tVarD, sVar);
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
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            n1 n1Var = new n1(1.0f, true);
            if (z11) {
                z12 = false;
                strJ = b3.i.j(-1688769345, R.string.checkout_basket_title_delivery_address, sVar, sVar, false);
            } else {
                z12 = false;
                strJ = b3.i.j(-1688655730, R.string.mnu_checkout_address_section_header_delivery_address_v2, sVar, sVar, false);
            }
            boolean z13 = z12;
            r9.d(strJ, n1Var, z11 ? lv.s.C : lv.s.D, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, z11 ? v.f28272k : v.f28276p, sVar, 0, 0, 131064);
            sVar = sVar;
            n4.b bVarZ = x0.z(R.drawable.ic_edit, sVar, z13 ? 1 : 0);
            String strU = f0.U(sVar, R.string.mnu_accessibility_checkout_change_delivery_address);
            char c3 = (i12 & 7168) == 2048 ? (char) 1 : z13 ? 1 : 0;
            Object objM = sVar.M();
            if (c3 != 0 || objM == m3.m.f29332a) {
                objM = new vm.r(10, function0);
                sVar.k0(objM);
            }
            v1.n.d(bVarZ, strU, androidx.compose.foundation.b.c(qVar, false, null, null, (Function0) objM, 15), null, null, 0.0f, null, sVar, 8, 120);
            sVar.q(true);
            float f11 = lv.t.f28251e;
            d2.c.f(m2.m(qVar, f11), sVar);
            b(userAddress, cVar, sVar, ((i12 << 3) & 112) | ((i12 >> 3) & 14));
            d2.c.f(m2.m(qVar, f11), sVar);
            String phone = userAddress.getPhone();
            if (phone == null) {
                sVar.a0(-839182034);
                sVar.q(z13);
            } else {
                sVar.a0(-839182033);
                String phoneCountryCode = userAddress.getPhoneCountryCode();
                if (phoneCountryCode == null) {
                    sVar.a0(-531604904);
                    sVar.q(z13);
                } else {
                    sVar.a0(-531604903);
                    r9.d("+" + phoneCountryCode + " " + phone, null, lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28274n, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                    sVar = sVar;
                    sVar.q(z13);
                }
                b3.i.y(qVar, lv.t.f28248b, sVar, z13);
            }
            String email = userAddress.getEmail();
            if (email == null) {
                sVar.a0(-838818435);
                sVar.q(z13);
            } else {
                sVar.a0(-838818434);
                m3.s sVar2 = sVar;
                r9.d(email, null, lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28274n, sVar2, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                sVar = sVar2;
                sVar.q(z13);
            }
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.m(cVar, userAddress, z11, function0, i11, 11);
        }
    }

    public static final void b(UserAddress userAddress, jg.c cVar, m3.n nVar, int i11) {
        int i12;
        cVar.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1110967300);
        if ((i11 & 6) == 0) {
            i12 = i11 | (sVar.f(userAddress) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.d(cVar.ordinal()) ? 32 : 16;
        }
        int i13 = i12;
        if (sVar.R(i13 & 1, (i13 & 19) != 18)) {
            String name = userAddress != null ? userAddress.getName() : null;
            if (name == null) {
                sVar.a0(-191042469);
                sVar.q(false);
            } else {
                sVar.a0(-191042468);
                r9.d(name, null, lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28274n, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                sVar = sVar;
                b3.i.y(b4.q.f5711a, lv.t.f28248b, sVar, false);
            }
            i(userAddress, cVar, sVar, i13 & 126);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new f(userAddress, cVar, i11, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(jg.c r31, com.app.tgtg.model.remote.user.requests.UserAddress r32, kotlin.jvm.functions.Function0 r33, boolean r34, kotlin.jvm.functions.Function0 r35, m3.n r36, int r37, int r38) {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wi.a.c(jg.c, com.app.tgtg.model.remote.user.requests.UserAddress, kotlin.jvm.functions.Function0, boolean, kotlin.jvm.functions.Function0, m3.n, int, int):void");
    }

    public static final void d(String str, String str2, m3.n nVar, int i11) {
        int i12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1477314871);
        int i13 = (sVar.f(str) ? 4 : 2) | i11 | (sVar.f(str2) ? 32 : 16);
        if (sVar.R(i13 & 1, (i13 & 19) != 18)) {
            b4.q qVar = b4.q.f5711a;
            t tVarD = m2.d(qVar, 1.0f);
            float f11 = 1;
            long j9 = lv.s.H;
            float f12 = 4;
            t tVarZ = d2.c.z(v1.n.k(tVarD, f11, j9, l2.g.b(8)), f12);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5692j, sVar, 0);
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
            m3.i.C(i2VarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            gd.o.c(str, null, v1.n.k(f4.g.b(m2.m(qVar, 64), l2.g.b(f12)), f11, j9, l2.g.b(f12)), x0.z(R.drawable.gfx_tgtg_logo_green_small, sVar, 0), null, null, z4.l.f47166a, 0.0f, null, sVar, (i13 & 14) | 4144, 6, 31728);
            float f13 = lv.t.f28253g;
            i12 = 4;
            r9.d(str2 == null ? "" : str2, b3.i.g(b4.d.f5693k, d2.c.D(qVar, f13, 0.0f, f13, 0.0f, 10)), lv.s.C, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, v.f28276p, sVar, MLKEMEngine.KyberPolyBytes, 12607872, 110584);
            sVar = sVar;
            sVar.q(true);
        } else {
            i12 = 4;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new v0(str, str2, i11, i12);
        }
    }

    public static final void e(int i11, m3.n nVar, int i12) {
        m3.s sVar;
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(1342131724);
        int i13 = (sVar2.d(i11) ? 4 : 2) | i12;
        if (sVar2.R(i13 & 1, (i13 & 3) != 2)) {
            sVar = sVar2;
            r9.d(f0.U(sVar2, i11), null, lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28279s, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new on.j(i11, i12, 17);
        }
    }

    public static final void f(m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(634454232);
        if (sVar.R(i11 & 1, i11 != 0)) {
            float f11 = lv.t.f28253g;
            b4.q qVar = b4.q.f5711a;
            d2.c.f(m2.m(qVar, f11), sVar);
            long j9 = lv.s.f28244y;
            float f12 = lv.t.f28252f;
            t tVarZ = d2.c.z(v1.n.j(v1.n.k(m2.d(d2.c.B(qVar, f11, 0.0f, 2), 1.0f), 1, j9, l2.g.b(f12)), lv.s.f28237r, l2.g.b(f12)), f11);
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
            t tVarD = m2.d(qVar, 1.0f);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = b4.a.c(tVarD, sVar);
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
            t tVarM = m2.m(qVar, 20);
            n4.b bVarZ = x0.z(R.drawable.system_icon_info, sVar, 0);
            long j11 = lv.s.C;
            v1.n.d(bVarZ, null, tVarM, null, null, 0.0f, new i4.o(j11, 5), sVar, 1573304, 56);
            float f13 = lv.t.f28251e;
            r9.d(r8.k.f(f13, R.string.mnu_checkout_address_postal_validation_info_title, qVar, sVar, sVar), null, j11, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28273m, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
            sVar.q(true);
            r9.d(f0.U(sVar, R.string.catering_checkout_address_country_warning_uk), d2.c.D(m2.d(qVar, 1.0f), 0.0f, f13, 0.0f, 0.0f, 13), j11, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28276p, sVar, 432, 12582912, 131064);
            sVar = sVar;
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new u60.a(i11, 17);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean, int] */
    public static final void g(cj.q qVar, e0 e0Var, String str, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function2 function2, m3.n nVar, int i11) {
        int i12;
        e0 e0Var2;
        m3.s sVar;
        boolean z11;
        float f11;
        b4.i iVar;
        m3.s sVar2;
        m3.s sVar3;
        BasketResponse basketResponse;
        ?? r12;
        m3.s sVar4;
        boolean z12;
        m3.s sVar5;
        m3.s sVar6;
        qVar.getClass();
        e0Var.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        function04.getClass();
        function2.getClass();
        m3.s sVar7 = (m3.s) nVar;
        sVar7.c0(2146385111);
        if ((i11 & 6) == 0) {
            i12 = (sVar7.h(qVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar7.h(e0Var) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar7.f(str != null ? ParcelDeliveryOptionId.m221boximpl(str) : null) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar7.h(function0) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar7.h(function02) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar7.h(function03) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar7.h(function04) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= sVar7.h(function2) ? 8388608 : 4194304;
        }
        if (sVar7.R(i12 & 1, (4793491 & i12) != 4793490)) {
            b1 b1VarN = m3.i.n(e0Var.l, sVar7, 0);
            b1 b1VarN2 = m3.i.n(e0Var.f8223n, sVar7, 0);
            b1 b1VarN3 = m3.i.n(e0Var.f8212b0, sVar7, 0);
            b4.i iVar2 = b4.d.f5694m;
            d2.d dVar = d2.i.f13803c;
            y yVarA = w.a(dVar, iVar2, sVar7, 48);
            int iHashCode = Long.hashCode(sVar7.T);
            u3.i iVarL = sVar7.l();
            b4.q qVar2 = b4.q.f5711a;
            t tVarC = b4.a.c(qVar2, sVar7);
            b5.j.R.getClass();
            Function0 function05 = b5.i.f5839b;
            sVar7.e0();
            if (sVar7.S) {
                sVar7.k(function05);
            } else {
                sVar7.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(yVarA, gVar, sVar7);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar7);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar7, numValueOf, gVar3);
            b5.d dVar2 = b5.i.f5845h;
            m3.i.z(sVar7, dVar2);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar7);
            String strU = f0.U(sVar7, R.string.checkout_overview_parcel_header);
            int i13 = i12;
            boolean z13 = (i12 & 7168) == 2048;
            Object objM = sVar7.M();
            if (z13 || objM == m3.m.f29332a) {
                objM = new vm.r(6, function0);
                sVar7.k0(objM);
            }
            cg.j.s(strU, null, 0L, 0L, (Function0) objM, null, null, null, sVar7, 0, 238);
            float f12 = lv.t.f28253g;
            t tVarD = d2.c.D(qVar2, f12, 0.0f, f12, 0.0f, 10);
            b4.k kVar = b4.d.f5683a;
            u0 u0VarD = d2.p.d(kVar, false);
            int iHashCode2 = Long.hashCode(sVar7.T);
            u3.i iVarL2 = sVar7.l();
            t tVarC2 = b4.a.c(tVarD, sVar7);
            sVar7.e0();
            if (sVar7.S) {
                sVar7.k(function05);
            } else {
                sVar7.n0();
            }
            m3.i.C(u0VarD, gVar, sVar7);
            m3.i.C(iVarL2, gVar2, sVar7);
            a0.y(iHashCode2, sVar7, gVar3, sVar7, dVar2);
            m3.i.C(tVarC2, gVar4, sVar7);
            y yVarA2 = w.a(dVar, iVar2, sVar7, 48);
            int iHashCode3 = Long.hashCode(sVar7.T);
            u3.i iVarL3 = sVar7.l();
            t tVarC3 = b4.a.c(qVar2, sVar7);
            sVar7.e0();
            if (sVar7.S) {
                sVar7.k(function05);
            } else {
                sVar7.n0();
            }
            m3.i.C(yVarA2, gVar, sVar7);
            m3.i.C(iVarL3, gVar2, sVar7);
            a0.y(iHashCode3, sVar7, gVar3, sVar7, dVar2);
            m3.i.C(tVarC3, gVar4, sVar7);
            b4.q qVar3 = qVar2;
            c(w0.e.A(qVar.i()), (UserAddress) b1VarN.getValue(), function03, true, function02, sVar7, ((i13 >> 9) & 896) | 3072 | (i13 & 57344), 0);
            m3.s sVar8 = sVar7;
            sVar8.q(true);
            sVar8.q(true);
            float f13 = lv.t.f28254h;
            d2.c.f(m2.m(qVar3, f13), sVar8);
            if (((UserAddress) b1VarN.getValue()) == null) {
                sVar8.a0(-1154216075);
                z11 = false;
                sVar8.q(false);
                f11 = f12;
                iVar = iVar2;
                sVar3 = sVar8;
            } else {
                z11 = false;
                sVar8.a0(-1154216074);
                DeliveryOptionsLocal deliveryOptionsLocal = (DeliveryOptionsLocal) b1VarN2.getValue();
                if (deliveryOptionsLocal == null) {
                    sVar8.a0(-2088630333);
                    sVar8.q(false);
                    f11 = f12;
                    iVar = iVar2;
                    sVar2 = sVar8;
                } else {
                    sVar8.a0(-2088630332);
                    k(lv.s.H, 0.0f, sVar8, 6, 2);
                    d2.c.f(m2.m(qVar3, f12), sVar8);
                    t tVarB = d2.c.B(qVar3, f12, 0.0f, 2);
                    u0 u0VarD2 = d2.p.d(kVar, false);
                    int iHashCode4 = Long.hashCode(sVar8.T);
                    u3.i iVarL4 = sVar8.l();
                    t tVarC4 = b4.a.c(tVarB, sVar8);
                    sVar8.e0();
                    if (sVar8.S) {
                        sVar8.k(function05);
                    } else {
                        sVar8.n0();
                    }
                    m3.i.C(u0VarD2, gVar, sVar8);
                    m3.i.C(iVarL4, gVar2, sVar8);
                    a0.y(iHashCode4, sVar8, gVar3, sVar8, dVar2);
                    m3.i.C(tVarC4, gVar4, sVar8);
                    y yVarA3 = w.a(dVar, iVar2, sVar8, 48);
                    int iHashCode5 = Long.hashCode(sVar8.T);
                    u3.i iVarL5 = sVar8.l();
                    t tVarC5 = b4.a.c(qVar3, sVar8);
                    sVar8.e0();
                    f11 = f12;
                    if (sVar8.S) {
                        sVar8.k(function05);
                    } else {
                        sVar8.n0();
                    }
                    m3.i.C(yVarA3, gVar, sVar8);
                    m3.i.C(iVarL5, gVar2, sVar8);
                    a0.y(iHashCode5, sVar8, gVar3, sVar8, dVar2);
                    m3.i.C(tVarC5, gVar4, sVar8);
                    d2.c.f(m2.m(qVar3, f13), sVar8);
                    e(R.string.checkout_basket_title_delivery_method, sVar8, 0);
                    d2.c.f(m2.m(qVar3, lv.t.f28251e), sVar8);
                    ParcelDeliveryOptionId parcelDeliveryOptionId = (ParcelDeliveryOptionId) b1VarN3.getValue();
                    int i14 = i13 >> 6;
                    iVar = iVar2;
                    m.b(deliveryOptionsLocal, str, parcelDeliveryOptionId != null ? parcelDeliveryOptionId.m229unboximpl() : null, true, function04, function2, sVar8, ((i13 >> 3) & 112) | 3072 | (i14 & 57344) | (i14 & 458752));
                    m3.s sVar9 = sVar8;
                    sVar9.q(true);
                    sVar9.q(true);
                    d2.c.f(m2.m(qVar3, f13), sVar9);
                    z11 = false;
                    sVar9.q(false);
                    sVar2 = sVar9;
                }
                sVar2.q(z11);
                sVar3 = sVar2;
            }
            e0Var2 = e0Var;
            BasketResponse basketResponse2 = (BasketResponse) e0Var2.f8209a.a("BASKET_RESPONSE");
            if (basketResponse2 == null) {
                sVar3.a0(-1152871450);
                sVar3.q(z11);
                sVar6 = sVar3;
            } else {
                sVar3.a0(-1152871449);
                if (((DeliveryOptionsLocal) b1VarN2.getValue()) == null) {
                    sVar3.a0(1876943386);
                    String estimatedDelivery = basketResponse2.getEstimatedDelivery();
                    if (estimatedDelivery == null) {
                        sVar3.a0(-1944297177);
                        sVar3.q(false);
                        basketResponse = basketResponse2;
                        z12 = false;
                        sVar5 = sVar3;
                    } else {
                        sVar3.a0(-1944297176);
                        t tVarD2 = d2.c.D(qVar3, f11, 0.0f, f11, 0.0f, 10);
                        u0 u0VarD3 = d2.p.d(kVar, false);
                        int iHashCode6 = Long.hashCode(sVar3.T);
                        u3.i iVarL6 = sVar3.l();
                        t tVarC6 = b4.a.c(tVarD2, sVar3);
                        sVar3.e0();
                        if (sVar3.S) {
                            sVar3.k(function05);
                        } else {
                            sVar3.n0();
                        }
                        m3.i.C(u0VarD3, gVar, sVar3);
                        m3.i.C(iVarL6, gVar2, sVar3);
                        a0.y(iHashCode6, sVar3, gVar3, sVar3, dVar2);
                        m3.i.C(tVarC6, gVar4, sVar3);
                        y yVarA4 = w.a(dVar, iVar, sVar3, 0);
                        int iHashCode7 = Long.hashCode(sVar3.T);
                        u3.i iVarL7 = sVar3.l();
                        t tVarC7 = b4.a.c(qVar3, sVar3);
                        sVar3.e0();
                        if (sVar3.S) {
                            sVar3.k(function05);
                        } else {
                            sVar3.n0();
                        }
                        m3.i.C(yVarA4, gVar, sVar3);
                        m3.i.C(iVarL7, gVar2, sVar3);
                        a0.y(iHashCode7, sVar3, gVar3, sVar3, dVar2);
                        m3.i.C(tVarC7, gVar4, sVar3);
                        m3.s sVar10 = sVar3;
                        qVar3 = qVar3;
                        basketResponse = basketResponse2;
                        r9.d(f0.U(sVar3, R.string.checkout_overview_parcel_title_delivery_time), null, lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28279s, sVar10, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                        d2.c.f(m2.m(qVar3, lv.t.f28251e), sVar10);
                        r9.d(f0.T(R.string.mnu_details_delivery_time, new Object[]{estimatedDelivery}, sVar10), null, lv.s.D, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28274n, sVar10, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                        m3.s sVar11 = sVar10;
                        d2.c.f(m2.m(qVar3, f11), sVar11);
                        sVar11.q(true);
                        sVar11.q(true);
                        z12 = false;
                        sVar11.q(false);
                        sVar5 = sVar11;
                    }
                    sVar5.q(z12);
                    r12 = z12;
                    sVar4 = sVar5;
                } else {
                    basketResponse = basketResponse2;
                    r12 = 0;
                    sVar3.a0(-1943178138);
                    sVar3.q(false);
                    sVar4 = sVar3;
                }
                k(lv.s.H, 0.0f, sVar4, 6, 2);
                d2.c.f(m2.m(qVar3, lv.t.f28251e), sVar4);
                u.b(basketResponse, sVar4, r12);
                sVar4.q(r12);
                sVar6 = sVar4;
            }
            sVar6.q(true);
            sVar = sVar6;
        } else {
            e0Var2 = e0Var;
            sVar7.U();
            sVar = sVar7;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new gn.r(qVar, e0Var2, str, function0, function02, function03, function04, function2, i11);
        }
    }

    public static final void h(cj.q qVar, jg.c cVar, UserAddress userAddress, Function0 function0, Function0 function02, Function0 function03, m3.n nVar, int i11) {
        int i12;
        String strI;
        BasicItemInformation information;
        Picture coverPicture;
        qVar.getClass();
        cVar.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1169697835);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(qVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.d(cVar.ordinal()) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.f(userAddress) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(function0) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(function02) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.h(function03) ? 131072 : 65536;
        }
        if (sVar.R(i12 & 1, (74899 & i12) != 74898)) {
            if (qVar.f8334b0) {
                sVar.a0(1398805381);
                sVar.q(false);
                strI = "";
            } else {
                sVar.a0(1398830708);
                Context context = (Context) sVar.j(c5.v0.f7390b);
                BasicItem basicItemF = qVar.f();
                basicItemF.getClass();
                strI = r0.i(context, basicItemF);
                sVar.q(false);
            }
            b4.i iVar = b4.d.f5694m;
            d2.d dVar = d2.i.f13803c;
            y yVarA = w.a(dVar, iVar, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.q qVar2 = b4.q.f5711a;
            t tVarC = b4.a.c(qVar2, sVar);
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
            String strU = f0.U(sVar, R.string.checkout_overview_parcel_header);
            int i13 = i12;
            boolean z11 = (i12 & 7168) == 2048;
            Object objM = sVar.M();
            if (z11 || objM == m3.m.f29332a) {
                objM = new vm.r(9, function0);
                sVar.k0(objM);
            }
            String str = strI;
            cg.j.s(strU, null, 0L, 0L, (Function0) objM, null, null, null, sVar, 0, 238);
            sVar = sVar;
            float f11 = lv.t.f28253g;
            t tVarD = d2.c.D(qVar2, f11, 0.0f, f11, 0.0f, 10);
            u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = b4.a.c(tVarD, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar2);
            m3.i.C(tVarC2, gVar4, sVar);
            y yVarA2 = w.a(dVar, iVar, sVar, 48);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            t tVarC3 = b4.a.c(qVar2, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA2, gVar, sVar);
            m3.i.C(iVarL3, gVar2, sVar);
            a0.y(iHashCode3, sVar, gVar3, sVar, dVar2);
            m3.i.C(tVarC3, gVar4, sVar);
            BasicItem basicItemF2 = qVar.f();
            d((basicItemF2 == null || (information = basicItemF2.getInformation()) == null || (coverPicture = information.getCoverPicture()) == null) ? null : coverPicture.getCurrentUrl(), str, sVar, 0);
            d2.c.f(m2.m(qVar2, lv.t.f28254h), sVar);
            e(R.string.mnu_checkout_overview_parcel_title_deliver_to, sVar, 0);
            c(cVar, userAddress, function03, false, function02, sVar, ((i13 >> 3) & 126) | ((i13 >> 9) & 896) | (i13 & 57344), 8);
            e0.f.D(sVar, true, true, true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.a0(qVar, cVar, userAddress, function0, function02, function03, i11, 13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0294  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(com.app.tgtg.model.remote.user.requests.UserAddress r42, jg.c r43, m3.n r44, int r45) {
        /*
            Method dump skipped, instruction units count: 803
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wi.a.i(com.app.tgtg.model.remote.user.requests.UserAddress, jg.c, m3.n, int):void");
    }

    public static final void j(final w6 w6Var, final e0 e0Var, final float f11, final Function0 function0, final Function1 function1, final String str, m3.n nVar, final int i11) {
        m3.s sVar;
        w6Var.getClass();
        e0Var.getClass();
        function0.getClass();
        function1.getClass();
        str.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(2032021134);
        int i12 = i11 | (sVar2.f(w6Var) ? 4 : 2) | (sVar2.h(e0Var) ? 32 : 16) | (sVar2.c(f11) ? 256 : 128) | (sVar2.h(function0) ? NewHope.SENDB_BYTES : 1024) | (sVar2.h(function1) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar2.f(str) ? 131072 : 65536);
        if (sVar2.R(i12 & 1, (74899 & i12) != 74898)) {
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(new r5.y(6, 0L, ""));
                sVar2.k0(objM);
            }
            final b1 b1Var = (b1) objM;
            Object objM2 = sVar2.M();
            if (objM2 == fVar) {
                objM2 = a0.g(sVar2);
            }
            final b2.l lVar = (b2.l) objM2;
            Unit unit = Unit.f26487a;
            boolean zH = sVar2.h(e0Var);
            Object objM3 = sVar2.M();
            if (zH || objM3 == fVar) {
                objM3 = new s(e0Var, null, 0);
                sVar2.k0(objM3);
            }
            m3.i.h(unit, (Function2) objM3, sVar2);
            float f12 = lv.t.f28252f;
            sVar = sVar2;
            v3.a(function0, null, w6Var, 0.0f, false, l2.g.c(f12, f12, 0.0f, 0.0f, 12), lv.s.J, 0L, 0.0f, 0L, null, null, null, u3.e.e(-287063060, sVar2, new i80.n() { // from class: wi.q
                @Override // i80.n
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    m3.n nVar2 = (m3.n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((z) obj).getClass();
                    m3.s sVar3 = (m3.s) nVar2;
                    if (sVar3.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                        float f13 = lv.t.f28253g;
                        b4.q qVar = b4.q.f5711a;
                        t tVarC = d2.c.C(qVar, f13, f13, f13, f11);
                        d2.d dVar = d2.i.f13803c;
                        b4.i iVar = b4.d.f5694m;
                        y yVarA = w.a(dVar, iVar, sVar3, 0);
                        int iHashCode = Long.hashCode(sVar3.T);
                        u3.i iVarL = sVar3.l();
                        t tVarC2 = b4.a.c(tVarC, sVar3);
                        b5.j.R.getClass();
                        b5.h hVar = b5.i.f5839b;
                        sVar3.e0();
                        if (sVar3.S) {
                            sVar3.k(hVar);
                        } else {
                            sVar3.n0();
                        }
                        b5.g gVar = b5.i.f5843f;
                        m3.i.C(yVarA, gVar, sVar3);
                        b5.g gVar2 = b5.i.f5842e;
                        m3.i.C(iVarL, gVar2, sVar3);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        b5.g gVar3 = b5.i.f5844g;
                        m3.i.v(sVar3, numValueOf, gVar3);
                        b5.d dVar2 = b5.i.f5845h;
                        m3.i.z(sVar3, dVar2);
                        b5.g gVar4 = b5.i.f5841d;
                        m3.i.C(tVarC2, gVar4, sVar3);
                        t tVarD = m2.d(qVar, 1.0f);
                        u0 u0VarD = d2.p.d(b4.d.f5683a, false);
                        int iHashCode2 = Long.hashCode(sVar3.T);
                        u3.i iVarL2 = sVar3.l();
                        t tVarC3 = b4.a.c(tVarD, sVar3);
                        sVar3.e0();
                        if (sVar3.S) {
                            sVar3.k(hVar);
                        } else {
                            sVar3.n0();
                        }
                        m3.i.C(u0VarD, gVar, sVar3);
                        m3.i.C(iVarL2, gVar2, sVar3);
                        a0.y(iHashCode2, sVar3, gVar3, sVar3, dVar2);
                        m3.i.C(tVarC3, gVar4, sVar3);
                        b4.k kVar = b4.d.f5687e;
                        d2.u uVar = d2.u.f13938a;
                        t tVarA = uVar.a(qVar, kVar);
                        String strU = f0.U(sVar3, R.string.mnu_checkout_address_postal_validation_sheet_title);
                        m5.u0 u0Var = v.f28286z;
                        long j9 = lv.s.C;
                        r9.d(strU, tVarA, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar3, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
                        t tVarD2 = d2.c.D(uVar.a(qVar, b4.d.f5688f), f13, 0.0f, 0.0f, 0.0f, 14);
                        j5.j jVar = new j5.j(0);
                        Function0 function02 = function0;
                        boolean zF = sVar3.f(function02);
                        Object objM4 = sVar3.M();
                        m3.f fVar2 = m3.m.f29332a;
                        if (zF || objM4 == fVar2) {
                            objM4 = new vm.r(12, function02);
                            sVar3.k0(objM4);
                        }
                        v1.n.d(x0.z(R.drawable.system_icon_close_neutral_80, sVar3, 0), f0.U(sVar3, R.string.voice_over_close), androidx.compose.foundation.b.c(tVarD2, false, null, jVar, (Function0) objM4, 11), null, null, 0.0f, null, sVar3, 8, 120);
                        sVar3.q(true);
                        d2.c.f(m2.m(qVar, f13), sVar3);
                        String strU2 = f0.U(sVar3, R.string.mnu_checkout_address_postal_validation_sheet_label);
                        m5.u0 u0Var2 = v.f28276p;
                        r9.d(strU2, null, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var2, sVar3, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                        d2.c.f(m2.m(qVar, lv.t.f28249c), sVar3);
                        b1 b1Var2 = b1Var;
                        r5.y yVar = (r5.y) b1Var2.getValue();
                        t tVarE = m2.e(m2.d(v1.n.j(qVar, lv.s.J, g0.f23254b), 1.0f), 40);
                        d1 d1Var = new d1(0, 7, 117);
                        m5.u0 u0VarA = m5.u0.a(v.f28274n, j9, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214);
                        String str2 = str;
                        boolean zF2 = sVar3.f(str2);
                        Object objM5 = sVar3.M();
                        if (zF2 || objM5 == fVar2) {
                            objM5 = new ry.b(27, str2, b1Var2);
                            sVar3.k0(objM5);
                        }
                        m2.t.b(yVar, (Function1) objM5, tVarE, false, u0VarA, d1Var, null, true, 0, 0, null, null, null, u3.e.e(624976793, sVar3, new oo.s(11, lVar, b1Var2)), sVar3, 102236544);
                        t tVarB = d2.c.B(m2.d(qVar, 1.0f), 0.0f, f13, 1);
                        int length = ((r5.y) b1Var2.getValue()).f37714a.f29538b.length();
                        boolean z11 = 5 <= length && length < 9;
                        String strU3 = f0.U(sVar3, R.string.mnu_checkout_address_postal_validation_sheet_cta);
                        Function1 function12 = function1;
                        boolean zF3 = sVar3.f(function12);
                        Object objM6 = sVar3.M();
                        if (zF3 || objM6 == fVar2) {
                            objM6 = new bm.k(function12, b1Var2, 4);
                            sVar3.k0(objM6);
                        }
                        v0.n.l(tVarB, strU3, null, null, null, z11, false, null, null, (Function0) objM6, sVar3, 6, 476);
                        long j11 = lv.s.f28240u;
                        float f14 = lv.t.f28252f;
                        t tVarZ = d2.c.z(v1.n.j(v1.n.k(m2.d(qVar, 1.0f), 1, j11, l2.g.b(f14)), lv.s.f28242w, l2.g.b(f14)), f13);
                        y yVarA2 = w.a(dVar, iVar, sVar3, 0);
                        int iHashCode3 = Long.hashCode(sVar3.T);
                        u3.i iVarL3 = sVar3.l();
                        t tVarC4 = b4.a.c(tVarZ, sVar3);
                        sVar3.e0();
                        if (sVar3.S) {
                            sVar3.k(hVar);
                        } else {
                            sVar3.n0();
                        }
                        m3.i.C(yVarA2, gVar, sVar3);
                        m3.i.C(iVarL3, gVar2, sVar3);
                        a0.y(iHashCode3, sVar3, gVar3, sVar3, dVar2);
                        m3.i.C(tVarC4, gVar4, sVar3);
                        t tVarD3 = m2.d(qVar, 1.0f);
                        i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar3, 48);
                        int iHashCode4 = Long.hashCode(sVar3.T);
                        u3.i iVarL4 = sVar3.l();
                        t tVarC5 = b4.a.c(tVarD3, sVar3);
                        sVar3.e0();
                        if (sVar3.S) {
                            sVar3.k(hVar);
                        } else {
                            sVar3.n0();
                        }
                        m3.i.C(i2VarA, gVar, sVar3);
                        m3.i.C(iVarL4, gVar2, sVar3);
                        a0.y(iHashCode4, sVar3, gVar3, sVar3, dVar2);
                        m3.i.C(tVarC5, gVar4, sVar3);
                        t tVarM = m2.m(qVar, 20);
                        n4.b bVarZ = x0.z(R.drawable.system_icon_help_center, sVar3, 0);
                        long j12 = lv.s.f28238s;
                        v1.n.d(bVarZ, null, tVarM, null, null, 0.0f, new i4.o(j12, 5), sVar3, 1573304, 56);
                        float f15 = lv.t.f28251e;
                        r9.d(r8.k.f(f15, R.string.mnu_checkout_address_postal_validation_sheet_info_title, qVar, sVar3, sVar3), null, j12, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28273m, sVar3, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                        sVar3.q(true);
                        r9.d(f0.U(sVar3, R.string.mnu_checkout_address_postal_validation_sheet_info_description), d2.c.D(m2.d(qVar, 1.0f), 0.0f, f15, 0.0f, 0.0f, 13), j12, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var2, sVar3, 432, 12582912, 131064);
                        sVar3.q(true);
                        sVar3.q(true);
                        d2.c.f(m2.m(qVar, f13), sVar3);
                    } else {
                        sVar3.U();
                    }
                    return Unit.f26487a;
                }
            }), sVar, ((i12 >> 9) & 14) | 1572864 | ((i12 << 6) & 896), 3078, 7066);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2(e0Var, f11, function0, function1, str, i11) { // from class: wi.r

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ e0 f43492b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ float f43493c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ Function0 f43494d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ Function1 f43495e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ String f43496f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iF = m3.i.F(1);
                    a.j(this.f43491a, this.f43492b, this.f43493c, this.f43494d, this.f43495e, this.f43496f, (m3.n) obj, iF);
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final void k(final long j9, float f11, m3.n nVar, final int i11, final int i12) {
        int i13;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1957400113);
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 = i11 | 48;
        } else if ((i11 & 48) == 0) {
            i13 = (sVar.c(f11) ? 32 : 16) | i11;
        } else {
            i13 = i11;
        }
        if (sVar.R(i13 & 1, (i13 & 19) != 18)) {
            if (i14 != 0) {
                f11 = 2;
            }
            t tVarD = m2.d(m2.t(b4.q.f5711a, 3), 1.0f);
            boolean z11 = (i13 & 112) == 32;
            Object objM = sVar.M();
            if (z11 || objM == m3.m.f29332a) {
                objM = new j1(f11, j9);
                sVar.k0(objM);
            }
            d2.c.f(f4.g.d(tVarD, (Function1) objM), sVar);
        } else {
            sVar.U();
        }
        final float f12 = f11;
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2() { // from class: wi.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a.k(j9, f12, (m3.n) obj, m3.i.F(i11 | 1), i12);
                    return Unit.f26487a;
                }
            };
        }
    }
}
