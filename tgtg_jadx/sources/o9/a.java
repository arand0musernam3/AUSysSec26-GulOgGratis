package o9;

import b4.q;
import com.app.tgtg.R;
import com.app.tgtg.model.local.SnackBarTypeKt;
import com.tgtg.componentlibrary.component.chip.type.selectionchip.variant.ComposableSingletons$AvatarSelectionChipKt;
import d2.h2;
import d2.i2;
import d2.j2;
import d2.m2;
import d2.p;
import d2.w;
import d2.y;
import d2.z;
import g3.d7;
import g3.l7;
import g3.m5;
import g3.p3;
import g3.r9;
import g3.s0;
import i4.g0;
import i4.o;
import i80.n;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lv.t;
import lv.v;
import m3.m;
import m3.s;
import m5.u0;
import o00.x0;
import o30.f0;
import org.bouncycastle.iana.AEADAlgorithm;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import s1.d0;
import s1.d1;
import t1.b1;
import t1.v1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32134a;

    public /* synthetic */ a(int i11) {
        this.f32134a = i11;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        d7 d7Var = (d7) obj;
        m3.n nVar = (m3.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        d7Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((s) nVar).f(d7Var) ? 4 : 2;
        }
        s sVar = (s) nVar;
        if (sVar.R(iIntValue & 1, (iIntValue & 19) != 18)) {
            l7.b(d2.c.A(q.f5711a, t.f28251e, t.f28253g), null, null, null, 0L, 0L, 0L, 0L, u3.e.e(291888687, sVar, new ti.b(d7Var, 1)), sVar, 805306374, 510);
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11 = this.f32134a;
        x70.c cVar = null;
        q qVar = q.f5711a;
        switch (i11) {
            case 0:
                Function2 function2 = (Function2) obj;
                m3.n nVar = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((s) nVar).h(function2) ? 4 : 2;
                }
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 19) != 18)) {
                    function2.invoke(sVar, Integer.valueOf(iIntValue & 14));
                } else {
                    sVar.U();
                }
                return Unit.f26487a;
            case 1:
                m3.n nVar2 = (m3.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((f2.d) obj).getClass();
                s sVar2 = (s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    float f11 = t.f28253g;
                    q qVar2 = q.f5711a;
                    d2.c.f(m2.e(qVar2, f11), sVar2);
                    r9.d(f0.U(sVar2, R.string.partner_stores_screen_subtitle), d2.c.D(qVar2, 0.0f, 0.0f, 0.0f, t.f28254h, 7), lv.s.C, 0L, null, 0L, null, new x5.k(5), 0L, 0, false, 0, 0, null, v.f28274n, sVar2, 432, 12582912, 130040);
                } else {
                    sVar2.U();
                }
                return Unit.f26487a;
            case 2:
                m3.n nVar3 = (m3.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((f2.d) obj).getClass();
                s sVar3 = (s) nVar3;
                if (sVar3.R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    d2.c.f(m2.e(qVar, t.f28253g), sVar3);
                } else {
                    sVar3.U();
                }
                return Unit.f26487a;
            case 3:
                m3.n nVar4 = (m3.n) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((j2) obj).getClass();
                s sVar4 = (s) nVar4;
                if (sVar4.R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    r9.d(f0.U(sVar4, R.string.profile_page_avatar_picker_cta), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0.a(v.f28281u, lv.s.f28217b, 0L, null, null, 0L, null, 3, 0L, null, null, 16744446), sVar4, 0, 0, 131070);
                } else {
                    sVar4.U();
                }
                return Unit.f26487a;
            case 4:
                m3.n nVar5 = (m3.n) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((j2) obj).getClass();
                s sVar5 = (s) nVar5;
                if (sVar5.R(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    r9.d(f0.U(sVar5, R.string.orderview_delegate_accept_invitation_cta_accept), null, lv.s.J, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, v.f28281u, sVar5, MLKEMEngine.KyberPolyBytes, 12582912, 130042);
                } else {
                    sVar5.U();
                }
                return Unit.f26487a;
            case 5:
                m3.n nVar6 = (m3.n) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((z) obj).getClass();
                s sVar6 = (s) nVar6;
                if (sVar6.R(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    b4.i iVar = b4.d.f5695n;
                    d2.e eVar = d2.i.f13805e;
                    b4.t tVarD = m2.d(qVar, 1.0f);
                    y yVarA = w.a(eVar, iVar, sVar6, 54);
                    int iHashCode = Long.hashCode(sVar6.T);
                    u3.i iVarL = sVar6.l();
                    b4.t tVarC = b4.a.c(tVarD, sVar6);
                    b5.j.R.getClass();
                    b5.h hVar = b5.i.f5839b;
                    sVar6.e0();
                    if (sVar6.S) {
                        sVar6.k(hVar);
                    } else {
                        sVar6.n0();
                    }
                    m3.i.C(yVarA, b5.i.f5843f, sVar6);
                    m3.i.C(iVarL, b5.i.f5842e, sVar6);
                    m3.i.v(sVar6, Integer.valueOf(iHashCode), b5.i.f5844g);
                    m3.i.z(sVar6, b5.i.f5845h);
                    m3.i.C(tVarC, b5.i.f5841d, sVar6);
                    float f12 = 16;
                    r9.d(r8.k.f(f12, R.string.orderview_delegate_a_friend_is_collecting, qVar, sVar6, sVar6), null, lv.s.f28217b, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, v.f28275o, sVar6, MLKEMEngine.KyberPolyBytes, 12582912, 130042);
                    d2.c.f(m2.m(qVar, 8), sVar6);
                    v1.n.d(x0.z(R.drawable.app_someone_else_collects, sVar6, 0), null, null, null, null, 0.0f, null, sVar6, 56, 124);
                    b3.i.y(qVar, f12, sVar6, true);
                } else {
                    sVar6.U();
                }
                return Unit.f26487a;
            case 6:
                m3.n nVar7 = (m3.n) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((z) obj).getClass();
                s sVar7 = (s) nVar7;
                if (sVar7.R(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    r9.d(f0.U(sVar7, R.string.orderview_delegate_refunded_as_collecting_user), d2.c.z(qVar, 16), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, sVar7, 48, 0, 262140);
                } else {
                    sVar7.U();
                }
                return Unit.f26487a;
            case 7:
                m3.n nVar8 = (m3.n) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((z) obj).getClass();
                s sVar8 = (s) nVar8;
                if (sVar8.R(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    r9.d(f0.U(sVar8, R.string.orderview_delegate_cancelled_as_collecting_user), d2.c.z(qVar, 16), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, sVar8, 48, 0, 262140);
                } else {
                    sVar8.U();
                }
                return Unit.f26487a;
            case 8:
                m3.n nVar9 = (m3.n) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((z) obj).getClass();
                s sVar9 = (s) nVar9;
                if (sVar9.R(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    r9.d(f0.U(sVar9, R.string.orderview_delegate_not_collected_as_collecting_user), d2.c.z(qVar, 16), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, sVar9, 48, 0, 262140);
                } else {
                    sVar9.U();
                }
                return Unit.f26487a;
            case 9:
                m3.n nVar10 = (m3.n) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((z) obj).getClass();
                s sVar10 = (s) nVar10;
                if (sVar10.R(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    float f13 = 16;
                    b4.t tVarZ = d2.c.z(qVar, f13);
                    i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar10, 48);
                    int iHashCode2 = Long.hashCode(sVar10.T);
                    u3.i iVarL2 = sVar10.l();
                    b4.t tVarC2 = b4.a.c(tVarZ, sVar10);
                    b5.j.R.getClass();
                    b5.h hVar2 = b5.i.f5839b;
                    sVar10.e0();
                    if (sVar10.S) {
                        sVar10.k(hVar2);
                    } else {
                        sVar10.n0();
                    }
                    m3.i.C(i2VarA, b5.i.f5843f, sVar10);
                    m3.i.C(iVarL2, b5.i.f5842e, sVar10);
                    m3.i.v(sVar10, Integer.valueOf(iHashCode2), b5.i.f5844g);
                    m3.i.z(sVar10, b5.i.f5845h);
                    m3.i.C(tVarC2, b5.i.f5841d, sVar10);
                    v1.n.d(x0.z(R.drawable.icon_cancel_fill, sVar10, 0), null, null, null, null, 0.0f, null, sVar10, 56, 124);
                    d2.c.f(m2.q(qVar, f13), sVar10);
                    r9.d(f0.U(sVar10, R.string.orderview_delegate_disable_invitation_popup), null, lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28274n, sVar10, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                    d2.c.f(m2.q(qVar, f13), sVar10);
                    sVar10.q(true);
                } else {
                    sVar10.U();
                }
                return Unit.f26487a;
            case 10:
                m3.n nVar11 = (m3.n) obj2;
                ((Integer) obj3).getClass();
                ((s1.z) obj).getClass();
                float f14 = 16;
                s0.b(m2.d(d2.c.D(q.f5711a, f14, 0.0f, f14, f14, 2), 1.0f), l2.g.b(12), s0.p(lv.s.J, nVar11, 6), s0.q(4, 0.0f, 0.0f, 0.0f, 62), null, oo.a.f32731g, nVar11, 196614, 16);
                return Unit.f26487a;
            case 11:
                m3.n nVar12 = (m3.n) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((z) obj).getClass();
                s sVar11 = (s) nVar12;
                if (sVar11.R(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    float f15 = 16;
                    b4.t tVarZ2 = d2.c.z(qVar, f15);
                    i2 i2VarA2 = h2.a(d2.i.f13801a, b4.d.f5693k, sVar11, 48);
                    int iHashCode3 = Long.hashCode(sVar11.T);
                    u3.i iVarL3 = sVar11.l();
                    b4.t tVarC3 = b4.a.c(tVarZ2, sVar11);
                    b5.j.R.getClass();
                    b5.h hVar3 = b5.i.f5839b;
                    sVar11.e0();
                    if (sVar11.S) {
                        sVar11.k(hVar3);
                    } else {
                        sVar11.n0();
                    }
                    m3.i.C(i2VarA2, b5.i.f5843f, sVar11);
                    m3.i.C(iVarL3, b5.i.f5842e, sVar11);
                    m3.i.v(sVar11, Integer.valueOf(iHashCode3), b5.i.f5844g);
                    m3.i.z(sVar11, b5.i.f5845h);
                    m3.i.C(tVarC3, b5.i.f5841d, sVar11);
                    v1.n.d(x0.z(R.drawable.invitation_regretted, sVar11, 0), null, null, null, null, 0.0f, null, sVar11, 56, 124);
                    d2.c.f(m2.q(qVar, f15), sVar11);
                    r9.d(f0.U(sVar11, R.string.main_delegate_collection_invitation_sent_back), null, lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28274n, sVar11, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                    d2.c.f(m2.q(qVar, f15), sVar11);
                    sVar11.q(true);
                } else {
                    sVar11.U();
                }
                return Unit.f26487a;
            case 12:
                m3.n nVar13 = (m3.n) obj2;
                ((Integer) obj3).getClass();
                ((s1.z) obj).getClass();
                float f16 = 16;
                s0.b(m2.d(d2.c.D(q.f5711a, f16, 0.0f, f16, 32, 2), 1.0f), l2.g.b(12), s0.p(lv.s.J, nVar13, 6), s0.q(4, 0.0f, 0.0f, 0.0f, 62), null, oo.a.f32733i, nVar13, 196614, 16);
                return Unit.f26487a;
            case 13:
                m3.n nVar14 = (m3.n) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((z) obj).getClass();
                s sVar12 = (s) nVar14;
                if (sVar12.R(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    q qVar3 = q.f5711a;
                    b4.t tVarZ3 = d2.c.z(m2.t(m2.d(qVar3, 1.0f), 3), t.f28254h);
                    y yVarA2 = w.a(d2.i.f13803c, b4.d.f5694m, sVar12, 0);
                    int iHashCode4 = Long.hashCode(sVar12.T);
                    u3.i iVarL4 = sVar12.l();
                    b4.t tVarC4 = b4.a.c(tVarZ3, sVar12);
                    b5.j.R.getClass();
                    b5.h hVar4 = b5.i.f5839b;
                    sVar12.e0();
                    if (sVar12.S) {
                        sVar12.k(hVar4);
                    } else {
                        sVar12.n0();
                    }
                    m3.i.C(yVarA2, b5.i.f5843f, sVar12);
                    m3.i.C(iVarL4, b5.i.f5842e, sVar12);
                    m3.i.v(sVar12, Integer.valueOf(iHashCode4), b5.i.f5844g);
                    m3.i.z(sVar12, b5.i.f5845h);
                    m3.i.C(tVarC4, b5.i.f5841d, sVar12);
                    b4.t tVarU = m2.u(qVar3, null, 3);
                    b4.i iVar2 = b4.d.f5695n;
                    b4.t tVarF = b3.i.f(iVar2, tVarU);
                    String strU = f0.U(sVar12, R.string.special_reward_screen_empty_state_title);
                    u0 u0Var = v.f28271j;
                    long j9 = lv.s.D;
                    r9.d(strU, tVarF, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar12, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
                    v1.n.d(x0.z(R.drawable.gfx_special_reward_box, sVar12, 0), "No Rewards", b3.i.f(iVar2, d2.c.D(qVar3, 0.0f, t.f28253g, 0.0f, 0.0f, 13)), null, null, 0.0f, new o(j9, 5), sVar12, 1572920, 56);
                    sVar12.q(true);
                } else {
                    sVar12.U();
                }
                return Unit.f26487a;
            case 14:
                m3.n nVar15 = (m3.n) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((z) obj).getClass();
                s sVar13 = (s) nVar15;
                if (sVar13.R(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    b4.t tVarT = m2.t(m2.d(qVar, 1.0f), 3);
                    float f17 = t.f28253g;
                    b4.t tVarZ4 = d2.c.z(tVarT, f17);
                    y yVarA3 = w.a(d2.i.f13803c, b4.d.f5694m, sVar13, 0);
                    int iHashCode5 = Long.hashCode(sVar13.T);
                    u3.i iVarL5 = sVar13.l();
                    b4.t tVarC5 = b4.a.c(tVarZ4, sVar13);
                    b5.j.R.getClass();
                    b5.h hVar5 = b5.i.f5839b;
                    sVar13.e0();
                    if (sVar13.S) {
                        sVar13.k(hVar5);
                    } else {
                        sVar13.n0();
                    }
                    m3.i.C(yVarA3, b5.i.f5843f, sVar13);
                    m3.i.C(iVarL5, b5.i.f5842e, sVar13);
                    m3.i.v(sVar13, Integer.valueOf(iHashCode5), b5.i.f5844g);
                    m3.i.z(sVar13, b5.i.f5845h);
                    m3.i.C(tVarC5, b5.i.f5841d, sVar13);
                    r9.d(f0.U(sVar13, R.string.special_reward_screen_InfoBox_Title), null, lv.s.C, 0L, null, 0L, null, new x5.k(5), 0L, 0, false, 0, 0, null, v.f28272k, sVar13, MLKEMEngine.KyberPolyBytes, 12582912, 130042);
                    d2.c.f(m2.e(qVar, f17), sVar13);
                    os.a.g(R.drawable.gfx_special_rewards_gifts, R.string.special_reward_screen_InfoBox_Item_1, sVar13, MLKEMEngine.KyberPolyBytes);
                    d2.c.f(m2.e(qVar, f17), sVar13);
                    os.a.g(R.drawable.gfx_special_rewards_bakery, R.string.special_reward_screen_InfoBox_Item_2, sVar13, MLKEMEngine.KyberPolyBytes);
                    d2.c.f(m2.e(qVar, f17), sVar13);
                    os.a.g(R.drawable.gfx_special_rewards_gavel, R.string.special_reward_screen_InfoBox_Item_3, sVar13, MLKEMEngine.KyberPolyBytes);
                    d2.c.f(m2.e(qVar, f17), sVar13);
                    os.a.g(R.drawable.gfx_special_rewards_timer, R.string.special_reward_screen_InfoBox_Item_4, sVar13, MLKEMEngine.KyberPolyBytes);
                    sVar13.q(true);
                } else {
                    sVar13.U();
                }
                return Unit.f26487a;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                b4.t tVar = (b4.t) obj;
                m3.n nVar16 = (m3.n) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ComposableSingletons$AvatarSelectionChipKt composableSingletons$AvatarSelectionChipKt = ComposableSingletons$AvatarSelectionChipKt.INSTANCE;
                tVar.getClass();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= ((s) nVar16).f(tVar) ? 4 : 2;
                }
                s sVar14 = (s) nVar16;
                if (sVar14.R(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    g3.i2.a(x0.z(R.drawable.illustration, sVar14, 0), null, tVar, 0L, sVar14, 56 | ((iIntValue14 << 6) & 896), 8);
                } else {
                    sVar14.U();
                }
                return Unit.f26487a;
            case 16:
                m3.n nVar17 = (m3.n) obj2;
                ((Integer) obj3).getClass();
                ((s1.z) obj).getClass();
                b4.t tVarD2 = m2.d(m2.b(qVar, 0.0f, 400, 1), 1.0f);
                y yVarA4 = w.a(d2.i.f13805e, b4.d.f5695n, nVar17, 54);
                s sVar15 = (s) nVar17;
                int iHashCode6 = Long.hashCode(sVar15.T);
                u3.i iVarL6 = sVar15.l();
                b4.t tVarC6 = b4.a.c(tVarD2, nVar17);
                b5.j.R.getClass();
                b5.h hVar6 = b5.i.f5839b;
                sVar15.e0();
                if (sVar15.S) {
                    sVar15.k(hVar6);
                } else {
                    sVar15.n0();
                }
                m3.i.C(yVarA4, b5.i.f5843f, nVar17);
                m3.i.C(iVarL6, b5.i.f5842e, nVar17);
                m3.i.v(nVar17, Integer.valueOf(iHashCode6), b5.i.f5844g);
                m3.i.z(nVar17, b5.i.f5845h);
                m3.i.C(tVarC6, b5.i.f5841d, nVar17);
                v1.n.d(x0.z(R.drawable.invitation_success, nVar17, 0), null, null, null, null, 0.0f, null, nVar17, 56, 124);
                d2.c.f(m2.m(qVar, 40), nVar17);
                r9.d(f0.U(nVar17, R.string.orderview_delegate_accept_invitation_accepted), null, lv.s.f28217b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28270i, nVar17, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                sVar15.q(true);
                return Unit.f26487a;
            case 17:
                m3.n nVar18 = (m3.n) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((j2) obj).getClass();
                s sVar16 = (s) nVar18;
                if (sVar16.R(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    r9.d(f0.U(sVar16, R.string.orderview_delegate_accept_invitation_cta_accept), null, lv.s.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28281u, sVar16, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                } else {
                    sVar16.U();
                }
                return Unit.f26487a;
            case 18:
                m3.n nVar19 = (m3.n) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((j2) obj).getClass();
                s sVar17 = (s) nVar19;
                if (sVar17.R(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    r9.d(f0.U(sVar17, R.string.orderview_delegate_disable_invitation_cta_btn), null, lv.s.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28281u, sVar17, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                } else {
                    sVar17.U();
                }
                return Unit.f26487a;
            case 19:
                m3.n nVar20 = (m3.n) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((j2) obj).getClass();
                s sVar18 = (s) nVar20;
                if (sVar18.R(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    r9.d(f0.U(sVar18, R.string.orderview_delegate_send_invitation_bottomsheet_send_back_btn), null, lv.s.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28281u, sVar18, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                } else {
                    sVar18.U();
                }
                return Unit.f26487a;
            case 20:
                m3.n nVar21 = (m3.n) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ((f2.d) obj).getClass();
                s sVar19 = (s) nVar21;
                if (sVar19.R(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    os.a.c(sVar19, 0);
                } else {
                    sVar19.U();
                }
                return Unit.f26487a;
            case 21:
                m3.n nVar22 = (m3.n) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ((f2.d) obj).getClass();
                s sVar20 = (s) nVar22;
                if (sVar20.R(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    d2.c.f(m2.e(qVar, t.f28253g), sVar20);
                    os.a.f(sVar20, 0);
                } else {
                    sVar20.U();
                }
                return Unit.f26487a;
            case 22:
                m3.n nVar23 = (m3.n) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                ((f2.d) obj).getClass();
                s sVar21 = (s) nVar23;
                if (sVar21.R(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    os.a.c(sVar21, 0);
                } else {
                    sVar21.U();
                }
                return Unit.f26487a;
            case 23:
                m3.n nVar24 = (m3.n) obj2;
                ((Integer) obj3).getClass();
                ((s1.z) obj).getClass();
                v1.n.d(x0.z(2131230974, nVar24, 0), "CharityBag", m2.t(m2.d(qVar, 1.0f), 3), null, z4.l.f47169d, 0.0f, null, nVar24, 25016, 104);
                return Unit.f26487a;
            case 24:
                d7 d7Var = (d7) obj;
                m3.n nVar25 = (m3.n) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                d7Var.getClass();
                if ((iIntValue21 & 6) == 0) {
                    iIntValue21 |= ((s) nVar25).f(d7Var) ? 4 : 2;
                }
                s sVar22 = (s) nVar25;
                if (sVar22.R(iIntValue21 & 1, (iIntValue21 & 19) != 18)) {
                    cg.j.l(null, SnackBarTypeKt.getSnackBarInfo(d7Var.f18461a.f18537a), sVar22, 0, 1);
                } else {
                    sVar22.U();
                }
                return Unit.f26487a;
            case 25:
                ((Integer) obj3).getClass();
                ((s1.z) obj).getClass();
                s sVar23 = (s) ((m3.n) obj2);
                Object objM = sVar23.M();
                m3.f fVar = m.f29332a;
                if (objM == fVar) {
                    long j11 = lv.s.U;
                    b1 b1Var = d1.f38569a;
                    objM = new t1.b(new i4.v(j11), (v1) d0.f38568a.invoke(i4.v.f(j11)), null, 12);
                    sVar23.k0(objM);
                }
                t1.b bVar = (t1.b) objM;
                Unit unit = Unit.f26487a;
                boolean zH = sVar23.h(bVar);
                Object objM2 = sVar23.M();
                if (zH || objM2 == fVar) {
                    objM2 = new p3(bVar, cVar, i);
                    sVar23.k0(objM2);
                }
                m3.i.h(unit, (Function2) objM2, sVar23);
                p.a(v1.n.j(m2.c(m2.d(qVar, 1.0f), 1.0f), ((i4.v) bVar.d()).f23317a, g0.f23254b), sVar23, 0);
                return unit;
            case 26:
                m3.n nVar26 = (m3.n) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                ((f2.d) obj).getClass();
                s sVar24 = (s) nVar26;
                if (sVar24.R(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    b4.t tVarB = d2.c.B(m2.d(qVar, 1.0f), 0.0f, 30, 1);
                    z4.u0 u0VarD = p.d(b4.d.f5687e, false);
                    int iHashCode7 = Long.hashCode(sVar24.T);
                    u3.i iVarL7 = sVar24.l();
                    b4.t tVarC7 = b4.a.c(tVarB, sVar24);
                    b5.j.R.getClass();
                    b5.h hVar7 = b5.i.f5839b;
                    sVar24.e0();
                    if (sVar24.S) {
                        sVar24.k(hVar7);
                    } else {
                        sVar24.n0();
                    }
                    m3.i.C(u0VarD, b5.i.f5843f, sVar24);
                    m3.i.C(iVarL7, b5.i.f5842e, sVar24);
                    m3.i.v(sVar24, Integer.valueOf(iHashCode7), b5.i.f5844g);
                    m3.i.z(sVar24, b5.i.f5845h);
                    m3.i.C(tVarC7, b5.i.f5841d, sVar24);
                    m5.a(null, 0L, 0.0f, 0L, 0, 0.0f, sVar24, 0, 63);
                    sVar24.q(true);
                } else {
                    sVar24.U();
                }
                return Unit.f26487a;
            case 27:
                m3.n nVar27 = (m3.n) obj2;
                ((Integer) obj3).getClass();
                ((s1.z) obj).getClass();
                g3.i2.a(x0.z(R.drawable.ic_check_mark_icon, nVar27, 0), "chip icon", d2.c.D(m2.m(qVar, 20), 0.0f, 0.0f, t.f28249c, 0.0f, 11), lv.s.J, nVar27, 3512, 0);
                return Unit.f26487a;
            case 28:
                return a(obj, obj2, obj3);
            default:
                m3.n nVar28 = (m3.n) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                ((j2) obj).getClass();
                s sVar25 = (s) nVar28;
                if (sVar25.R(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    r9.d(f0.U(sVar25, R.string.post_purchase_add_continue), null, lv.s.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28281u, sVar25, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                } else {
                    sVar25.U();
                }
                return Unit.f26487a;
        }
    }
}
