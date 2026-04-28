package cg;

import com.app.tgtg.R;
import com.google.android.gms.internal.measurement.cg;
import d2.m2;
import g3.j5;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f8160b;

    public /* synthetic */ z(int i11, int i12, Function0 function0) {
        this.f8159a = i12;
        this.f8160b = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f8159a;
        m3.f fVar = m3.m.f29332a;
        Function0 function0 = this.f8160b;
        switch (i11) {
            case 0:
                ((Integer) obj2).getClass();
                j.e(function0, (m3.n) obj, m3.i.F(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                dq.j.d(function0, (m3.n) obj, m3.i.F(1));
                break;
            case 2:
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zF = sVar.f(function0);
                    Object objM = sVar.M();
                    if (zF || objM == fVar) {
                        objM = new j5(20, function0);
                        sVar.k0(objM);
                    }
                    g3.s0.h((Function0) objM, null, false, null, null, null, jh.f.f25264e, sVar, 1572864, 62);
                } else {
                    sVar.U();
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                jk.d.d(function0, (m3.n) obj, m3.i.F(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                jk.d.f(function0, (m3.n) obj, m3.i.F(1));
                break;
            case 5:
                m3.n nVar2 = (m3.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                m3.s sVar2 = (m3.s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    String strU = o30.f0.U(sVar2, R.string.notification_settings_toolbar_title);
                    boolean zF2 = sVar2.f(function0);
                    Object objM2 = sVar2.M();
                    if (zF2 || objM2 == fVar) {
                        objM2 = new j5(26, function0);
                        sVar2.k0(objM2);
                    }
                    j.s(strU, null, 0L, 0L, (Function0) objM2, null, null, null, sVar2, 0, 238);
                } else {
                    sVar2.U();
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                lp.d.k(function0, (m3.n) obj, m3.i.F(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                bx.k.e(function0, (m3.n) obj, m3.i.F(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                bx.k.d(function0, (m3.n) obj, m3.i.F(1));
                break;
            case 9:
                m3.n nVar3 = (m3.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                m3.s sVar3 = (m3.s) nVar3;
                if (sVar3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    String strU2 = o30.f0.U(sVar3, R.string.profile_settings_header);
                    boolean zF3 = sVar3.f(function0);
                    Object objM3 = sVar3.M();
                    if (zF3 || objM3 == fVar) {
                        objM3 = new ki.a(26, function0);
                        sVar3.k0(objM3);
                    }
                    j.s(strU2, null, 0L, 0L, (Function0) objM3, null, null, null, sVar3, 0, 238);
                } else {
                    sVar3.U();
                }
                break;
            case 10:
                ((Integer) obj2).getClass();
                ba0.g.b(function0, (m3.n) obj, m3.i.F(1));
                break;
            case 11:
                m3.n nVar4 = (m3.n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                m3.s sVar4 = (m3.s) nVar4;
                if (sVar4.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    j.s(o30.f0.U(sVar4, R.string.partner_stores_screen_title), null, 0L, 0L, this.f8160b, null, null, null, sVar4, 0, 238);
                } else {
                    sVar4.U();
                }
                break;
            case 12:
                ((Integer) obj2).getClass();
                oo.a.z(function0, (m3.n) obj, m3.i.F(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                oo.a.A(function0, (m3.n) obj, m3.i.F(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                oo.a.e(function0, (m3.n) obj, m3.i.F(1));
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                m3.n nVar5 = (m3.n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                m3.s sVar5 = (m3.s) nVar5;
                if (sVar5.R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    n4.b bVarZ = o00.x0.z(R.drawable.system_icon_close_neutral_80, sVar5, 0);
                    String strU3 = o30.f0.U(sVar5, R.string.voice_over_close);
                    boolean zF4 = sVar5.f(function0);
                    Object objM4 = sVar5.M();
                    if (zF4 || objM4 == fVar) {
                        objM4 = new nn.m(18, function0);
                        sVar5.k0(objM4);
                    }
                    v1.n.d(bVarZ, strU3, androidx.compose.foundation.b.c(b4.q.f5711a, false, null, null, (Function0) objM4, 15), null, null, 0.0f, null, sVar5, 8, 120);
                } else {
                    sVar5.U();
                }
                break;
            case 16:
                ((Integer) obj2).getClass();
                oo.a.v(function0, (m3.n) obj, m3.i.F(1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                oo.a.j(function0, (m3.n) obj, m3.i.F(1));
                break;
            case 18:
                m3.n nVar6 = (m3.n) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                m3.s sVar6 = (m3.s) nVar6;
                if (sVar6.R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    String strU4 = o30.f0.U(sVar6, R.string.special_rewards_list_screen_header);
                    boolean zF5 = sVar6.f(function0);
                    Object objM5 = sVar6.M();
                    if (zF5 || objM5 == fVar) {
                        objM5 = new oo.z(13, function0);
                        sVar6.k0(objM5);
                    }
                    j.s(strU4, null, 0L, 0L, (Function0) objM5, null, null, null, sVar6, 0, 238);
                } else {
                    sVar6.U();
                }
                break;
            case 19:
                m3.n nVar7 = (m3.n) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                m3.s sVar7 = (m3.s) nVar7;
                if (sVar7.R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    String strU5 = o30.f0.U(sVar7, R.string.special_rewards_redeemed_and_expired_screen_header);
                    boolean zF6 = sVar7.f(function0);
                    Object objM6 = sVar7.M();
                    if (zF6 || objM6 == fVar) {
                        objM6 = new oo.z(15, function0);
                        sVar7.k0(objM6);
                    }
                    j.s(strU5, null, 0L, 0L, (Function0) objM6, null, null, null, sVar7, 0, 238);
                } else {
                    sVar7.U();
                }
                break;
            case 20:
                m3.n nVar8 = (m3.n) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                m3.s sVar8 = (m3.s) nVar8;
                if (sVar8.R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    String strU6 = o30.f0.U(sVar8, R.string.me_menu_tab_title_settings_account_details);
                    boolean zF7 = sVar8.f(function0);
                    Object objM7 = sVar8.M();
                    if (zF7 || objM7 == fVar) {
                        objM7 = new oo.z(23, function0);
                        sVar8.k0(objM7);
                    }
                    j.s(strU6, null, 0L, 0L, (Function0) objM7, null, null, null, sVar8, 0, 238);
                } else {
                    sVar8.U();
                }
                break;
            case 21:
                ((Integer) obj2).getClass();
                rk.e.m(function0, (m3.n) obj, m3.i.F(1));
                break;
            case 22:
                m3.n nVar9 = (m3.n) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                m3.s sVar9 = (m3.s) nVar9;
                if (!sVar9.R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    sVar9.U();
                } else if (function0 == null) {
                    sVar9.a0(-1588993451);
                    sVar9.q(false);
                } else {
                    sVar9.a0(-1588993450);
                    v1.n.d(o00.x0.z(R.drawable.system_icon_chevron_right_neutral_80, sVar9, 0), null, null, null, null, 0.0f, null, sVar9, 56, 124);
                    sVar9.q(false);
                }
                break;
            case 23:
                m3.n nVar10 = (m3.n) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                m3.s sVar10 = (m3.s) nVar10;
                if (!sVar10.R(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    sVar10.U();
                } else if (function0 == null) {
                    sVar10.a0(1156056489);
                    sVar10.q(false);
                } else {
                    sVar10.a0(1156056490);
                    v1.n.d(o00.x0.z(R.drawable.system_icon_chevron_right_neutral_80, sVar10, 0), null, null, null, null, 0.0f, null, sVar10, 56, 124);
                    sVar10.q(false);
                }
                break;
            case 24:
                m3.n nVar11 = (m3.n) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                m3.s sVar11 = (m3.s) nVar11;
                if (sVar11.R(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    String strU7 = o30.f0.U(sVar11, R.string.charity_collection_days_title);
                    boolean zF8 = sVar11.f(function0);
                    Object objM8 = sVar11.M();
                    if (zF8 || objM8 == fVar) {
                        objM8 = new rr.a(16, function0);
                        sVar11.k0(objM8);
                    }
                    j.s(strU7, null, 0L, 0L, (Function0) objM8, null, null, null, sVar11, 0, 238);
                } else {
                    sVar11.U();
                }
                break;
            case 25:
                ((Integer) obj2).getClass();
                us.a.r(function0, (m3.n) obj, m3.i.F(1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                o00.h0.d(function0, (m3.n) obj, m3.i.F(1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                o00.h0.b(function0, (m3.n) obj, m3.i.F(1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                cg.g(function0, (m3.n) obj, m3.i.F(1));
                break;
            default:
                m3.n nVar12 = (m3.n) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                m3.s sVar12 = (m3.s) nVar12;
                if (sVar12.R(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    b4.t tVarT = m2.t(m2.d(b4.q.f5711a, 1.0f), 3);
                    float f11 = lv.t.f28254h;
                    g3.s0.b(d2.c.C(tVarT, f11, f11, f11, lv.t.f28249c), l2.g.b(16), g3.s0.p(lv.s.J, sVar12, 6), g3.s0.q(2, 0.0f, 0.0f, 0.0f, 62), null, u3.e.e(-1937740269, sVar12, new bm.c(5, function0)), sVar12, 196614, 16);
                } else {
                    sVar12.U();
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ z(int i11, Function0 function0) {
        this.f8159a = i11;
        this.f8160b = function0;
    }
}
