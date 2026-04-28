package tp;

import b4.q;
import b5.j;
import com.app.tgtg.R;
import com.app.tgtg.model.local.SnackBarTypeKt;
import d2.h2;
import d2.i2;
import d2.j2;
import d2.m2;
import d2.p;
import g3.d7;
import g3.r9;
import g3.s0;
import i4.g0;
import i80.n;
import kotlin.Unit;
import lv.t;
import lv.v;
import m3.s;
import o00.x0;
import o30.f0;
import org.bouncycastle.iana.AEADAlgorithm;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import s1.z;
import x5.k;
import zendesk.core.ui.android.internal.model.MessageSourceType;
import zendesk.ui.android.conversation.actionbutton.ActionButtonRendering;
import zendesk.ui.android.conversation.imagecell.ImageCellRendering;
import zendesk.ui.android.conversation.textcell.TextCellRendering;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40373a;

    public /* synthetic */ a(int i11) {
        this.f40373a = i11;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11 = this.f40373a;
        q qVar = q.f5711a;
        switch (i11) {
            case 0:
                m3.n nVar = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((f2.d) obj).getClass();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    r9.d(f0.U(sVar, R.string.station_picker_saved_stations), d2.c.D(m2.d(qVar, 1.0f), 0.0f, t.f28254h, 0.0f, 0.0f, 13), lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.l, sVar, 432, 12582912, 131064);
                    d2.c.f(m2.e(qVar, 8), sVar);
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
                    r9.d(f0.U(sVar2, R.string.station_picker_select_a_line), d2.c.D(m2.d(qVar, 1.0f), 0.0f, t.f28254h, 0.0f, 0.0f, 13), lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.l, sVar2, 432, 12582912, 131064);
                    d2.c.f(m2.e(qVar, 8), sVar2);
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
                    r9.d(f0.U(sVar3, R.string.station_picker_select_a_line_info), d2.c.B(m2.d(qVar, 1.0f), 0.0f, t.f28253g, 1), lv.s.D, 0L, null, 0L, null, new k(3), 0L, 0, false, 0, 0, null, v.f28276p, sVar3, 432, 12582912, 130040);
                } else {
                    sVar3.U();
                }
                return Unit.f26487a;
            case 3:
                m3.n nVar4 = (m3.n) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((f2.d) obj).getClass();
                s sVar4 = (s) nVar4;
                if (sVar4.R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    d2.c.f(m2.e(qVar, 8), sVar4);
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
                    r9.d(f0.U(sVar5, R.string.post_purchase_add_continue), null, lv.s.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28281u, sVar5, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                } else {
                    sVar5.U();
                }
                return Unit.f26487a;
            case 5:
                m3.n nVar6 = (m3.n) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((f2.d) obj).getClass();
                s sVar6 = (s) nVar6;
                if (sVar6.R(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    rs.k.o(true, null, sVar6, 6);
                } else {
                    sVar6.U();
                }
                return Unit.f26487a;
            case 6:
                m3.n nVar7 = (m3.n) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((f2.d) obj).getClass();
                s sVar7 = (s) nVar7;
                if (sVar7.R(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    os.a.h(sVar7, 0);
                } else {
                    sVar7.U();
                }
                return Unit.f26487a;
            case 7:
                m3.n nVar8 = (m3.n) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((j2) obj).getClass();
                s sVar8 = (s) nVar8;
                if (sVar8.R(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    v1.n.d(x0.z(2131231295, sVar8, 0), "", null, null, null, 0.0f, null, sVar8, 56, 124);
                } else {
                    sVar8.U();
                }
                return Unit.f26487a;
            case 8:
                m3.n nVar9 = (m3.n) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((j2) obj).getClass();
                s sVar9 = (s) nVar9;
                if (sVar9.R(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    r9.d(f0.U(sVar9, R.string.post_purchase_add_continue), null, lv.s.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28281u, sVar9, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                } else {
                    sVar9.U();
                }
                return Unit.f26487a;
            case 9:
                m3.n nVar10 = (m3.n) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((j2) obj).getClass();
                s sVar10 = (s) nVar10;
                if (sVar10.R(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    b4.t tVarD = m2.d(qVar, 1.0f);
                    float f11 = t.f28253g;
                    b4.t tVarD2 = d2.c.D(tVarD, f11, 0.0f, f11, 0.0f, 10);
                    i2 i2VarA = h2.a(d2.i.f13805e, b4.d.f5693k, sVar10, 54);
                    int iHashCode = Long.hashCode(sVar10.T);
                    u3.i iVarL = sVar10.l();
                    b4.t tVarC = b4.a.c(tVarD2, sVar10);
                    j.R.getClass();
                    b5.h hVar = b5.i.f5839b;
                    sVar10.e0();
                    if (sVar10.S) {
                        sVar10.k(hVar);
                    } else {
                        sVar10.n0();
                    }
                    m3.i.C(i2VarA, b5.i.f5843f, sVar10);
                    m3.i.C(iVarL, b5.i.f5842e, sVar10);
                    m3.i.v(sVar10, Integer.valueOf(iHashCode), b5.i.f5844g);
                    m3.i.z(sVar10, b5.i.f5845h);
                    m3.i.C(tVarC, b5.i.f5841d, sVar10);
                    v1.n.d(x0.z(R.drawable.ic_add, sVar10, 0), f0.U(sVar10, R.string.voice_over_back), null, null, null, 0.0f, null, sVar10, 8, 124);
                    r9.d(r8.k.f(t.f28251e, R.string.checkout_overview_parcel_button_add_address, qVar, sVar10, sVar10), null, lv.s.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28281u, sVar10, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                    sVar10.q(true);
                } else {
                    sVar10.U();
                }
                return Unit.f26487a;
            case 10:
                m3.n nVar11 = (m3.n) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((j2) obj).getClass();
                s sVar11 = (s) nVar11;
                if (sVar11.R(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    r9.d(f0.U(sVar11, R.string.allergens_popup_positive_button), null, lv.s.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28281u, sVar11, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                } else {
                    sVar11.U();
                }
                return Unit.f26487a;
            case 11:
                y1.c cVar = (y1.c) obj;
                m3.n nVar12 = (m3.n) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= ((s) nVar12).f(cVar) ? 4 : 2;
                }
                s sVar12 = (s) nVar12;
                if (sVar12.R(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    p.a(v1.n.j(m2.e(m2.d(d2.c.B(qVar, 0.0f, y1.f.l, 1), 1.0f), y1.f.f45365k), cVar.f45346c, g0.f23254b), sVar12, 0);
                } else {
                    sVar12.U();
                }
                return Unit.f26487a;
            case 12:
                d7 d7Var = (d7) obj;
                m3.n nVar13 = (m3.n) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                d7Var.getClass();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= ((s) nVar13).f(d7Var) ? 4 : 2;
                }
                s sVar13 = (s) nVar13;
                if (sVar13.R(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    vi.c.d(d7Var, sVar13, iIntValue13 & 14);
                } else {
                    sVar13.U();
                }
                return Unit.f26487a;
            case 13:
                ((Integer) obj3).intValue();
                ((z) obj).getClass();
                vi.c.r((m3.n) obj2, 0);
                return Unit.f26487a;
            case 14:
                m3.n nVar14 = (m3.n) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((f2.d) obj).getClass();
                s sVar14 = (s) nVar14;
                if (sVar14.R(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    s0.o(d2.c.B(qVar, t.f28253g, 0.0f, 2), 0.0f, lv.s.K, sVar14, 390, 2);
                } else {
                    sVar14.U();
                }
                return Unit.f26487a;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                d7 d7Var2 = (d7) obj;
                m3.n nVar15 = (m3.n) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                d7Var2.getClass();
                if ((iIntValue15 & 6) == 0) {
                    iIntValue15 |= ((s) nVar15).f(d7Var2) ? 4 : 2;
                }
                s sVar15 = (s) nVar15;
                if (sVar15.R(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                    cg.j.l(d2.c.D(q.f5711a, 0.0f, 0.0f, 0.0f, t.l, 7), SnackBarTypeKt.getSnackBarInfo(d7Var2.f18461a.f18537a), sVar15, 6, 0);
                } else {
                    sVar15.U();
                }
                return Unit.f26487a;
            case 16:
                m3.n nVar16 = (m3.n) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((f2.d) obj).getClass();
                s sVar16 = (s) nVar16;
                if (sVar16.R(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    d2.c.f(m2.e(qVar, t.l), sVar16);
                } else {
                    sVar16.U();
                }
                return Unit.f26487a;
            case 17:
                m3.n nVar17 = (m3.n) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((f2.d) obj).getClass();
                s sVar17 = (s) nVar17;
                if (sVar17.R(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    r9.d(f0.U(sVar17, R.string.login_charity_country_title), d2.c.B(m2.u(qVar, null, 3), t.f28253g, 0.0f, 2), lv.s.f28215a, 0L, null, 0L, null, new k(3), 0L, 0, false, 0, 0, null, v.f28264c, sVar17, 432, 12582912, 130040);
                } else {
                    sVar17.U();
                }
                return Unit.f26487a;
            case 18:
                m3.n nVar18 = (m3.n) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ((f2.d) obj).getClass();
                s sVar18 = (s) nVar18;
                if (sVar18.R(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    r9.d(f0.U(sVar18, R.string.login_charity_country_text), d2.c.D(d2.c.B(m2.u(qVar, null, 3), t.f28253g, 0.0f, 2), 0.0f, t.f28252f, 0.0f, t.f28256j, 5), lv.s.C, 0L, null, 0L, null, new k(3), 0L, 0, false, 0, 0, null, v.f28274n, sVar18, 432, 12582912, 130040);
                } else {
                    sVar18.U();
                }
                return Unit.f26487a;
            case 19:
                return ActionButtonRendering.Builder.onActionButtonClicked$lambda$0((String) obj, (String) obj2, (MessageSourceType) obj3);
            case 20:
                return ImageCellRendering.Builder.onActionButtonClicked$lambda$0((String) obj, (String) obj2, (MessageSourceType) obj3);
            default:
                return TextCellRendering.Builder.onActionButtonClicked$lambda$1((String) obj, (String) obj2, (MessageSourceType) obj3);
        }
    }
}
