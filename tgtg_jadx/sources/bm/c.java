package bm;

import b4.q;
import b4.t;
import com.app.tgtg.R;
import d2.h2;
import d2.i2;
import d2.j2;
import d2.m2;
import d2.u;
import d2.w;
import d2.y;
import d2.z;
import g3.j5;
import g3.r9;
import g3.s0;
import i4.g0;
import i4.k0;
import j5.r;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.StringCompanionObject;
import lv.v;
import m3.s;
import m5.u0;
import o00.x0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import v1.b1;
import v1.e1;
import w.a0;
import z4.m1;
import z4.t0;
import z4.w0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f6353b;

    public /* synthetic */ c(int i11, Function0 function0) {
        this.f6352a = i11;
        this.f6353b = function0;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z11;
        int i11 = this.f6352a;
        b2.l lVar = null;
        u uVar = u.f13938a;
        m3.f fVar = m3.m.f29332a;
        q qVar = q.f5711a;
        Function0 function0 = this.f6353b;
        switch (i11) {
            case 0:
                m3.n nVar = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((z) obj).getClass();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    t tVarR = v1.n.r(m2.d(qVar, 1.0f), v1.n.q(sVar), true);
                    y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
                    int iHashCode = Long.hashCode(sVar.T);
                    u3.i iVarL = sVar.l();
                    t tVarC = b4.a.c(tVarR, sVar);
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
                    float f11 = lv.t.f28255i;
                    float f12 = lv.t.f28253g;
                    v1.n.d(x0.z(R.drawable.ic_close24, sVar, 0), "CloseButton", b3.i.f(b4.d.f5696o, b4.a.a(d2.c.A(qVar, f12, f11), c5.m2.f7291a, new f(0, function0))), null, null, 0.0f, null, sVar, 56, 120);
                    r9.d(f0.U(sVar, R.string.login_charity_did_not_receive_email_title), d2.c.B(m2.t(m2.d(qVar, 1.0f), 3), f12, 0.0f, 2), lv.s.f28215a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28264c, sVar, 432, 12582912, 131064);
                    r9.d(f0.U(sVar, R.string.login_charity_did_not_receive_email_text), d2.c.A(m2.t(m2.d(qVar, 1.0f), 3), f12, lv.t.f28254h), lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28274n, sVar, 432, 12582912, 131064);
                    sVar.q(true);
                } else {
                    sVar.U();
                }
                break;
            case 1:
                w0 w0Var = (w0) obj;
                t0 t0Var = (t0) obj2;
                z5.a aVar = (z5.a) obj3;
                float f13 = ((z5.f) function0.invoke()).f47277a;
                m1 m1VarD = t0Var.D(z5.a.b(aVar.f47271a, 0, 0, z5.b.f(!z5.f.c(f13, Float.NaN) ? w0Var.q0(f13) : 0, aVar.f47271a), 0, 11));
                break;
            case 2:
                m3.n nVar2 = (m3.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((j2) obj).getClass();
                s sVar2 = (s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean zF = sVar2.f(function0);
                    Object objM = sVar2.M();
                    if (zF || objM == fVar) {
                        objM = new j5(21, function0);
                        sVar2.k0(objM);
                    }
                    s0.h((Function0) objM, null, false, null, null, null, jh.f.f25265f, sVar2, 1572864, 62);
                } else {
                    sVar2.U();
                }
                break;
            case 3:
                m3.n nVar3 = (m3.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((f2.d) obj).getClass();
                s sVar3 = (s) nVar3;
                if (sVar3.R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    t tVarU = m2.u(d2.c.z(qVar, lv.t.f28253g), null, 3);
                    boolean zF2 = sVar3.f(function0);
                    Object objM2 = sVar3.M();
                    if (zF2 || objM2 == fVar) {
                        objM2 = new oo.z(14, function0);
                        sVar3.k0(objM2);
                    }
                    t tVarC2 = androidx.compose.foundation.b.c(tVarU, false, null, null, (Function0) objM2, 15);
                    i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar3, 48);
                    int iHashCode2 = Long.hashCode(sVar3.T);
                    u3.i iVarL2 = sVar3.l();
                    t tVarC3 = b4.a.c(tVarC2, sVar3);
                    b5.j.R.getClass();
                    b5.h hVar2 = b5.i.f5839b;
                    sVar3.e0();
                    if (sVar3.S) {
                        sVar3.k(hVar2);
                    } else {
                        sVar3.n0();
                    }
                    m3.i.C(i2VarA, b5.i.f5843f, sVar3);
                    m3.i.C(iVarL2, b5.i.f5842e, sVar3);
                    m3.i.v(sVar3, Integer.valueOf(iHashCode2), b5.i.f5844g);
                    m3.i.z(sVar3, b5.i.f5845h);
                    m3.i.C(tVarC3, b5.i.f5841d, sVar3);
                    String strU = f0.U(sVar3, R.string.special_reward_screen_expired_rewards_cta);
                    u0 u0Var = v.f28281u;
                    long j9 = lv.s.D;
                    r9.d(strU, null, j9, 0L, null, 0L, x5.l.f43854c, new x5.k(3), 0L, 0, false, 0, 0, null, u0Var, sVar3, 805306752, 12582912, 129530);
                    g3.i2.a(x0.z(R.drawable.system_icon_chevron_right_neutral_80, sVar3, 0), null, b3.i.g(b4.d.f5692j, m2.m(qVar, 24)), j9, sVar3, 3128, 0);
                    sVar3.q(true);
                } else {
                    sVar3.U();
                }
                break;
            case 4:
                ((Integer) obj3).getClass();
                s sVar4 = (s) ((m3.n) obj2);
                sVar4.a0(-756081143);
                e1 e1Var = (e1) sVar4.j(b1.f41690a);
                if (e1Var != null) {
                    sVar4.a0(-1604682242);
                    z11 = false;
                    sVar4.q(false);
                } else {
                    z11 = false;
                    sVar4.a0(-1604549624);
                    Object objM3 = sVar4.M();
                    if (objM3 == fVar) {
                        objM3 = a0.g(sVar4);
                    }
                    lVar = (b2.l) objM3;
                    sVar4.q(false);
                }
                t tVarA = androidx.compose.foundation.b.a(q.f5711a, lVar, e1Var, true, null, null, this.f6353b);
                sVar4.q(z11);
                break;
            case 5:
                m3.n nVar4 = (m3.n) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((z) obj).getClass();
                s sVar5 = (s) nVar4;
                if (sVar5.R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    t tVarT = m2.t(m2.d(qVar, 1.0f), 3);
                    z4.u0 u0VarD = d2.p.d(b4.d.f5683a, false);
                    int iHashCode3 = Long.hashCode(sVar5.T);
                    u3.i iVarL3 = sVar5.l();
                    t tVarC4 = b4.a.c(tVarT, sVar5);
                    b5.j.R.getClass();
                    b5.h hVar3 = b5.i.f5839b;
                    sVar5.e0();
                    if (sVar5.S) {
                        sVar5.k(hVar3);
                    } else {
                        sVar5.n0();
                    }
                    b5.g gVar = b5.i.f5843f;
                    m3.i.C(u0VarD, gVar, sVar5);
                    b5.g gVar2 = b5.i.f5842e;
                    m3.i.C(iVarL3, gVar2, sVar5);
                    Integer numValueOf = Integer.valueOf(iHashCode3);
                    b5.g gVar3 = b5.i.f5844g;
                    m3.i.v(sVar5, numValueOf, gVar3);
                    b5.d dVar = b5.i.f5845h;
                    m3.i.z(sVar5, dVar);
                    b5.g gVar4 = b5.i.f5841d;
                    m3.i.C(tVarC4, gVar4, sVar5);
                    float f14 = lv.t.f28254h;
                    v1.n.d(x0.z(R.drawable.system_icon_close_neutral_80, sVar5, 0), null, b4.a.a(uVar.a(d2.c.z(qVar, f14), b4.d.f5685c), c5.m2.f7291a, new on.l(21, function0)), null, null, 0.0f, null, sVar5, 56, 120);
                    t tVarZ = d2.c.z(m2.t(m2.d(qVar, 1.0f), 3), f14);
                    y yVarA2 = w.a(d2.i.f13803c, b4.d.f5694m, sVar5, 0);
                    int iHashCode4 = Long.hashCode(sVar5.T);
                    u3.i iVarL4 = sVar5.l();
                    t tVarC5 = b4.a.c(tVarZ, sVar5);
                    sVar5.e0();
                    if (sVar5.S) {
                        sVar5.k(hVar3);
                    } else {
                        sVar5.n0();
                    }
                    m3.i.C(yVarA2, gVar, sVar5);
                    m3.i.C(iVarL4, gVar2, sVar5);
                    a0.y(iHashCode4, sVar5, gVar3, sVar5, dVar);
                    m3.i.C(tVarC5, gVar4, sVar5);
                    t tVarD = m2.d(qVar, 1.0f);
                    String strU2 = f0.U(sVar5, R.string.co2e_info_popup_title);
                    u0 u0Var2 = v.f28271j;
                    long j11 = lv.s.C;
                    r9.d(strU2, tVarD, j11, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, u0Var2, sVar5, 432, 12582912, 130040);
                    r9.d(f0.U(sVar5, R.string.co2e_info_popup_message), d2.c.D(m2.d(qVar, 1.0f), 0.0f, lv.t.f28253g, 0.0f, 0.0f, 13), j11, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, v.f28274n, sVar5, 432, 12582912, 130040);
                    v1.n.d(x0.z(R.drawable.gfx_blonk_logo, sVar5, 0), null, new d2.w0(b4.d.f5695n), null, null, 0.0f, null, sVar5, 56, 120);
                    sVar5.q(true);
                    sVar5.q(true);
                } else {
                    sVar5.U();
                }
                break;
            case 6:
                m3.n nVar5 = (m3.n) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((z) obj).getClass();
                s sVar6 = (s) nVar5;
                if (sVar6.R(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    q qVar2 = q.f5711a;
                    t tVarA2 = b4.a.a(m2.t(m2.d(qVar2, 1.0f), 3), c5.m2.f7291a, new on.l(26, function0));
                    b4.k kVar = b4.d.f5683a;
                    z4.u0 u0VarD2 = d2.p.d(kVar, false);
                    int iHashCode5 = Long.hashCode(sVar6.T);
                    u3.i iVarL5 = sVar6.l();
                    t tVarC6 = b4.a.c(tVarA2, sVar6);
                    b5.j.R.getClass();
                    b5.h hVar4 = b5.i.f5839b;
                    sVar6.e0();
                    if (sVar6.S) {
                        sVar6.k(hVar4);
                    } else {
                        sVar6.n0();
                    }
                    b5.g gVar5 = b5.i.f5843f;
                    m3.i.C(u0VarD2, gVar5, sVar6);
                    b5.g gVar6 = b5.i.f5842e;
                    m3.i.C(iVarL5, gVar6, sVar6);
                    Integer numValueOf2 = Integer.valueOf(iHashCode5);
                    b5.g gVar7 = b5.i.f5844g;
                    m3.i.v(sVar6, numValueOf2, gVar7);
                    b5.d dVar2 = b5.i.f5845h;
                    m3.i.z(sVar6, dVar2);
                    b5.g gVar8 = b5.i.f5841d;
                    m3.i.C(tVarC6, gVar8, sVar6);
                    t tVarZ2 = d2.c.z(v1.n.i(v1.n.j(m2.t(m2.d(qVar2, 1.0f), 3), lv.s.A, g0.f23254b), new k0(d0.h(new i4.v(lv.s.Y), new i4.v(lv.s.Z)), 0L, (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L)), 0.0f, 6), lv.t.f28253g);
                    z4.u0 u0VarD3 = d2.p.d(kVar, false);
                    int iHashCode6 = Long.hashCode(sVar6.T);
                    u3.i iVarL6 = sVar6.l();
                    t tVarC7 = b4.a.c(tVarZ2, sVar6);
                    sVar6.e0();
                    if (sVar6.S) {
                        sVar6.k(hVar4);
                    } else {
                        sVar6.n0();
                    }
                    m3.i.C(u0VarD3, gVar5, sVar6);
                    m3.i.C(iVarL6, gVar6, sVar6);
                    a0.y(iHashCode6, sVar6, gVar7, sVar6, dVar2);
                    m3.i.C(tVarC7, gVar8, sVar6);
                    cg.j.n(uVar.a(qVar2, b4.d.f5685c), f0.U(sVar6, R.string.favorites_promo_tag), f0.U(sVar6, R.string.favorites_promo_tag_voice_over), 0L, 0L, sVar6, 0, 24);
                    t tVarD2 = m2.d(qVar2, 1.0f);
                    y yVarA3 = w.a(d2.i.f13803c, b4.d.f5694m, sVar6, 0);
                    int iHashCode7 = Long.hashCode(sVar6.T);
                    u3.i iVarL7 = sVar6.l();
                    t tVarC8 = b4.a.c(tVarD2, sVar6);
                    sVar6.e0();
                    if (sVar6.S) {
                        sVar6.k(hVar4);
                    } else {
                        sVar6.n0();
                    }
                    m3.i.C(yVarA3, gVar5, sVar6);
                    m3.i.C(iVarL7, gVar6, sVar6);
                    a0.y(iHashCode7, sVar6, gVar7, sVar6, dVar2);
                    m3.i.C(tVarC8, gVar8, sVar6);
                    Object objM4 = sVar6.M();
                    if (objM4 == fVar) {
                        objM4 = new w2.g0(23);
                        sVar6.k0(objM4);
                    }
                    t tVarC9 = r.c(qVar2, false, (Function1) objM4);
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String str = String.format(f0.U(sVar6, R.string.favorites_promo_header), Arrays.copyOf(new Object[]{""}, 1));
                    u0 u0Var3 = v.f28264c;
                    long j12 = lv.s.f28215a;
                    r9.d(str, tVarC9, j12, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var3, sVar6, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
                    r9.d(f0.U(sVar6, R.string.favorites_promo_body), qVar2, j12, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28274n, sVar6, 432, 12582912, 131064);
                    sVar6.q(true);
                    sVar6.q(true);
                    t tVarA3 = uVar.a(d2.c.z(qVar2, lv.t.f28251e), b4.d.f5691i);
                    z4.u0 u0VarD4 = d2.p.d(kVar, false);
                    int iHashCode8 = Long.hashCode(sVar6.T);
                    u3.i iVarL8 = sVar6.l();
                    t tVarC10 = b4.a.c(tVarA3, sVar6);
                    sVar6.e0();
                    if (sVar6.S) {
                        sVar6.k(hVar4);
                    } else {
                        sVar6.n0();
                    }
                    m3.i.C(u0VarD4, gVar5, sVar6);
                    m3.i.C(iVarL8, gVar6, sVar6);
                    a0.y(iHashCode8, sVar6, gVar7, sVar6, dVar2);
                    m3.i.C(tVarC10, gVar8, sVar6);
                    v1.n.d(x0.z(R.drawable.ic_arrow_back, sVar6, 0), null, f4.g.i(m2.m(qVar2, 25), 180.0f), null, null, 0.0f, new i4.o(lv.s.f28217b, 5), sVar6, 1573304, 56);
                    sVar6.q(true);
                    sVar6.q(true);
                } else {
                    sVar6.U();
                }
                break;
            default:
                m3.n nVar6 = (m3.n) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((z) obj).getClass();
                s sVar7 = (s) nVar6;
                if (sVar7.R(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    t tVarT2 = m2.t(m2.d(qVar, 1.0f), 3);
                    y yVarA4 = w.a(d2.i.f13803c, b4.d.f5694m, sVar7, 0);
                    int iHashCode9 = Long.hashCode(sVar7.T);
                    u3.i iVarL9 = sVar7.l();
                    t tVarC11 = b4.a.c(tVarT2, sVar7);
                    b5.j.R.getClass();
                    b5.h hVar5 = b5.i.f5839b;
                    sVar7.e0();
                    if (sVar7.S) {
                        sVar7.k(hVar5);
                    } else {
                        sVar7.n0();
                    }
                    m3.i.C(yVarA4, b5.i.f5843f, sVar7);
                    m3.i.C(iVarL9, b5.i.f5842e, sVar7);
                    m3.i.v(sVar7, Integer.valueOf(iHashCode9), b5.i.f5844g);
                    m3.i.z(sVar7, b5.i.f5845h);
                    m3.i.C(tVarC11, b5.i.f5841d, sVar7);
                    float f15 = lv.t.f28255i;
                    float f16 = lv.t.f28253g;
                    v1.n.d(x0.z(R.drawable.ic_close24, sVar7, 0), "CloseButton", b3.i.f(b4.d.f5696o, b4.a.a(d2.c.A(qVar, f16, f15), c5.m2.f7291a, new on.l(28, function0))), null, null, 0.0f, null, sVar7, 56, 120);
                    t tVarB = d2.c.B(m2.d(qVar, 1.0f), f16, 0.0f, 2);
                    String upperCase = f0.U(sVar7, R.string.login_charity_email_helper_title).toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    r9.d(upperCase, tVarB, lv.s.f28215a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28264c, sVar7, 432, 12582912, 131064);
                    float f17 = lv.t.f28254h;
                    d2.c.f(m2.e(qVar, f17), sVar7);
                    r9.d(f0.U(sVar7, R.string.login_charity_email_helper_text), d2.c.B(m2.d(qVar, 1.0f), f16, 0.0f, 2), lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28274n, sVar7, 432, 12582912, 131064);
                    d2.c.f(m2.e(qVar, f17), sVar7);
                    sVar7.q(true);
                } else {
                    sVar7.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}
