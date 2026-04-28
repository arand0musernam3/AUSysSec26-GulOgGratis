package cg;

import com.app.tgtg.R;
import d2.m2;
import g3.j5;
import g3.r9;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h0 implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f7987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f7988c;

    public /* synthetic */ h0(Function0 function0, Function0 function02, int i11) {
        this.f7986a = i11;
        this.f7987b = function0;
        this.f7988c = function02;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11 = this.f7986a;
        i4.r0 r0Var = i4.g0.f23254b;
        b4.q qVar = b4.q.f5711a;
        m3.f fVar = m3.m.f29332a;
        Function0 function0 = this.f7987b;
        Function0 function02 = this.f7988c;
        switch (i11) {
            case 0:
                m3.n nVar = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((d2.z) obj).getClass();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    float f11 = lv.t.f28253g;
                    b4.q qVar2 = b4.q.f5711a;
                    b4.t tVarZ = d2.c.z(qVar2, f11);
                    d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5695n, sVar, 48);
                    int iHashCode = Long.hashCode(sVar.T);
                    u3.i iVarL = sVar.l();
                    b4.t tVarC = b4.a.c(tVarZ, sVar);
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
                    String strU = o30.f0.U(sVar, R.string.notification_settings_prompt_for_email_dialog_header);
                    m5.u0 u0Var = lv.v.f28270i;
                    b4.t tVarZ2 = d2.c.z(m2.d(qVar2, 1.0f), f11);
                    long j9 = lv.s.C;
                    r9.d(strU, tVarZ2, j9, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, u0Var, sVar, 432, 12582912, 130040);
                    r9.d(o30.f0.U(sVar, R.string.notification_settings_prompt_for_email_dialog_body), d2.c.D(m2.d(qVar2, 1.0f), f11, 0.0f, f11, f11, 2), j9, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar, 432, 12582912, 130040);
                    b4.t tVarD = d2.c.D(qVar2, 0.0f, lv.t.f28251e, 0.0f, 0.0f, 13);
                    String strU2 = o30.f0.U(sVar, R.string.notification_settings_prompt_for_email_dialog_cta_positive);
                    boolean zF = sVar.f(function0);
                    Object objM = sVar.M();
                    if (zF || objM == fVar) {
                        objM = new ar.d(7, function0);
                        sVar.k0(objM);
                    }
                    v0.n.l(tVarD, strU2, null, null, null, false, false, null, null, (Function0) objM, sVar, 6, 508);
                    String strU3 = o30.f0.U(sVar, R.string.notification_settings_prompt_for_email_dialog_cta_negative);
                    boolean zF2 = sVar.f(function02);
                    Object objM2 = sVar.M();
                    if (zF2 || objM2 == fVar) {
                        objM2 = new ar.d(8, function02);
                        sVar.k0(objM2);
                    }
                    v0.n.o(qVar2, strU3, null, null, null, false, (Function0) objM2, sVar, 6, 0, 1020);
                    sVar.q(true);
                } else {
                    sVar.U();
                }
                break;
            case 1:
                m3.n nVar2 = (m3.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((d2.z) obj).getClass();
                m3.s sVar2 = (m3.s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    float f12 = lv.t.f28253g;
                    b4.q qVar3 = b4.q.f5711a;
                    b4.t tVarZ3 = d2.c.z(qVar3, f12);
                    d2.y yVarA2 = d2.w.a(d2.i.f13803c, b4.d.f5695n, sVar2, 48);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    u3.i iVarL2 = sVar2.l();
                    b4.t tVarC2 = b4.a.c(tVarZ3, sVar2);
                    b5.j.R.getClass();
                    b5.h hVar2 = b5.i.f5839b;
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(hVar2);
                    } else {
                        sVar2.n0();
                    }
                    m3.i.C(yVarA2, b5.i.f5843f, sVar2);
                    m3.i.C(iVarL2, b5.i.f5842e, sVar2);
                    m3.i.v(sVar2, Integer.valueOf(iHashCode2), b5.i.f5844g);
                    m3.i.z(sVar2, b5.i.f5845h);
                    m3.i.C(tVarC2, b5.i.f5841d, sVar2);
                    r9.d(o30.f0.U(sVar2, R.string.notification_settings_push_notifications_body), d2.c.z(m2.d(qVar3, 1.0f), f12), lv.s.C, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar2, 432, 12582912, 130040);
                    b4.t tVarD2 = d2.c.D(qVar3, 0.0f, lv.t.f28251e, 0.0f, 0.0f, 13);
                    String strU4 = o30.f0.U(sVar2, R.string.notification_settings_push_notifications_confirm_button);
                    boolean zF3 = sVar2.f(function0);
                    Object objM3 = sVar2.M();
                    if (zF3 || objM3 == fVar) {
                        objM3 = new ar.d(9, function0);
                        sVar2.k0(objM3);
                    }
                    v0.n.l(tVarD2, strU4, null, null, null, false, false, null, null, (Function0) objM3, sVar2, 6, 508);
                    String strU5 = o30.f0.U(sVar2, R.string.notification_settings_push_notifications_cancel_button);
                    boolean zF4 = sVar2.f(function02);
                    Object objM4 = sVar2.M();
                    if (zF4 || objM4 == fVar) {
                        objM4 = new ar.d(10, function02);
                        sVar2.k0(objM4);
                    }
                    v0.n.o(qVar3, strU5, null, null, null, false, (Function0) objM4, sVar2, 6, 0, 1020);
                    sVar2.q(true);
                } else {
                    sVar2.U();
                }
                break;
            case 2:
                m3.n nVar3 = (m3.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((d2.z) obj).getClass();
                m3.s sVar3 = (m3.s) nVar3;
                if (sVar3.R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    b4.t tVarT = m2.t(m2.d(qVar, 1.0f), 3);
                    d2.y yVarA3 = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar3, 0);
                    int iHashCode3 = Long.hashCode(sVar3.T);
                    u3.i iVarL3 = sVar3.l();
                    b4.t tVarC3 = b4.a.c(tVarT, sVar3);
                    b5.j.R.getClass();
                    b5.h hVar3 = b5.i.f5839b;
                    sVar3.e0();
                    if (sVar3.S) {
                        sVar3.k(hVar3);
                    } else {
                        sVar3.n0();
                    }
                    m3.i.C(yVarA3, b5.i.f5843f, sVar3);
                    m3.i.C(iVarL3, b5.i.f5842e, sVar3);
                    m3.i.v(sVar3, Integer.valueOf(iHashCode3), b5.i.f5844g);
                    m3.i.z(sVar3, b5.i.f5845h);
                    m3.i.C(tVarC3, b5.i.f5841d, sVar3);
                    float f13 = lv.t.f28255i;
                    float f14 = lv.t.f28253g;
                    v1.n.d(o00.x0.z(R.drawable.ic_close24, sVar3, 0), "CloseButton", b3.i.f(b4.d.f5696o, b4.a.a(d2.c.A(qVar, f14, f13), c5.m2.f7291a, new bm.f(11, function02))), null, null, 0.0f, null, sVar3, 56, 120);
                    r9.d(o30.f0.U(sVar3, R.string.charity_id_sheet_title), d2.c.B(m2.d(qVar, 1.0f), f14, 0.0f, 2), lv.s.f28215a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, m5.u0.a(lv.v.f28264c, 0L, b0.a0.C(28), null, null, 0L, null, 0, 0L, null, null, 16777213), sVar3, 432, 0, 131064);
                    float f15 = lv.t.f28254h;
                    d2.c.f(m2.e(qVar, f15), sVar3);
                    r9.d(o30.f0.U(sVar3, R.string.charity_id_sheet_description), d2.c.B(m2.d(qVar, 1.0f), f14, 0.0f, 2), lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar3, 432, 12582912, 131064);
                    d2.c.f(m2.e(qVar, lv.t.f28257k), sVar3);
                    v0.n.l(d2.c.B(m2.d(qVar, 1.0f), f14, 0.0f, 2), o30.f0.U(sVar3, R.string.charity_id_sheet_cta_contact_us), null, null, null, false, false, null, null, this.f7987b, sVar3, 6, 508);
                    d2.c.f(m2.e(qVar, f15), sVar3);
                    sVar3.q(true);
                } else {
                    sVar3.U();
                }
                break;
            case 3:
                m3.n nVar4 = (m3.n) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((d2.z) obj).getClass();
                m3.s sVar4 = (m3.s) nVar4;
                if (sVar4.R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    long j11 = lv.s.J;
                    b4.q qVar4 = b4.q.f5711a;
                    b4.t tVarJ = v1.n.j(qVar4, j11, r0Var);
                    d2.y yVarA4 = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar4, 0);
                    int iHashCode4 = Long.hashCode(sVar4.T);
                    u3.i iVarL4 = sVar4.l();
                    b4.t tVarC4 = b4.a.c(tVarJ, sVar4);
                    b5.j.R.getClass();
                    b5.h hVar4 = b5.i.f5839b;
                    sVar4.e0();
                    if (sVar4.S) {
                        sVar4.k(hVar4);
                    } else {
                        sVar4.n0();
                    }
                    m3.i.C(yVarA4, b5.i.f5843f, sVar4);
                    m3.i.C(iVarL4, b5.i.f5842e, sVar4);
                    m3.i.v(sVar4, Integer.valueOf(iHashCode4), b5.i.f5844g);
                    m3.i.z(sVar4, b5.i.f5845h);
                    m3.i.C(tVarC4, b5.i.f5841d, sVar4);
                    float f16 = 16;
                    b4.t tVarD3 = d2.c.D(qVar4, f16, 32, f16, 0.0f, 8);
                    String strU6 = o30.f0.U(sVar4, R.string.charity_item_allergens_popup_header);
                    m5.u0 u0Var2 = lv.v.f28271j;
                    long j12 = lv.s.C;
                    r9.d(strU6, tVarD3, j12, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var2, sVar4, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
                    float f17 = 24;
                    r9.d(o30.f0.U(sVar4, R.string.charity_item_allergens_popup_body), d2.c.D(qVar4, f16, f17, f16, 0.0f, 8), j12, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar4, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
                    g3.s0.g(d2.c.B(qVar4, 0.0f, f17, 1), 1, lv.s.I, sVar4, 438, 0);
                    b4.t tVarB = d2.c.B(m2.d(qVar4, 1.0f), f16, 0.0f, 2);
                    String strU7 = o30.f0.U(sVar4, R.string.charity_item_allergens_popup_continue);
                    Integer numValueOf = Integer.valueOf(R.drawable.ic_open_in_new);
                    boolean zF5 = sVar4.f(function0);
                    Object objM5 = sVar4.M();
                    if (zF5 || objM5 == fVar) {
                        objM5 = new j5(28, function0);
                        sVar4.k0(objM5);
                    }
                    v0.n.l(tVarB, strU7, null, null, null, false, false, null, numValueOf, (Function0) objM5, sVar4, 6, 252);
                    r9.d(o30.f0.U(sVar4, R.string.charity_item_pass_dialog_no), b4.a.a(d2.c.B(m2.d(qVar4, 1.0f), 0.0f, f16, 1), c5.m2.f7291a, new bm.f(20, function02)), lv.s.D, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28281u, sVar4, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
                    sVar4.q(true);
                } else {
                    sVar4.U();
                }
                break;
            case 4:
                m3.n nVar5 = (m3.n) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((d2.z) obj).getClass();
                m3.s sVar5 = (m3.s) nVar5;
                if (sVar5.R(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    long j13 = lv.s.J;
                    b4.q qVar5 = b4.q.f5711a;
                    b4.t tVarJ2 = v1.n.j(qVar5, j13, r0Var);
                    d2.y yVarA5 = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar5, 0);
                    int iHashCode5 = Long.hashCode(sVar5.T);
                    u3.i iVarL5 = sVar5.l();
                    b4.t tVarC5 = b4.a.c(tVarJ2, sVar5);
                    b5.j.R.getClass();
                    b5.h hVar5 = b5.i.f5839b;
                    sVar5.e0();
                    if (sVar5.S) {
                        sVar5.k(hVar5);
                    } else {
                        sVar5.n0();
                    }
                    m3.i.C(yVarA5, b5.i.f5843f, sVar5);
                    m3.i.C(iVarL5, b5.i.f5842e, sVar5);
                    m3.i.v(sVar5, Integer.valueOf(iHashCode5), b5.i.f5844g);
                    m3.i.z(sVar5, b5.i.f5845h);
                    m3.i.C(tVarC5, b5.i.f5841d, sVar5);
                    float f18 = 16;
                    b4.t tVarD4 = d2.c.D(qVar5, f18, 32, f18, 0.0f, 8);
                    String strU8 = o30.f0.U(sVar5, R.string.charity_item_pass_dialog_title);
                    m5.u0 u0Var3 = lv.v.f28271j;
                    long j14 = lv.s.C;
                    r9.d(strU8, tVarD4, j14, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var3, sVar5, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
                    float f19 = 24;
                    r9.d(o30.f0.U(sVar5, R.string.charity_item_pass_dialog_message), d2.c.D(qVar5, f18, f19, f18, 0.0f, 8), j14, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar5, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
                    g3.s0.g(d2.c.B(qVar5, 0.0f, f19, 1), 1, lv.s.I, sVar5, 438, 0);
                    b4.t tVarB2 = d2.c.B(m2.d(qVar5, 1.0f), f18, 0.0f, 2);
                    String strU9 = o30.f0.U(sVar5, R.string.charity_item_pass_dialog_yes);
                    boolean zF6 = sVar5.f(function0);
                    Object objM6 = sVar5.M();
                    if (zF6 || objM6 == fVar) {
                        objM6 = new j5(29, function0);
                        sVar5.k0(objM6);
                    }
                    v0.n.l(tVarB2, strU9, null, null, null, false, false, null, null, (Function0) objM6, sVar5, 6, 508);
                    r9.d(o30.f0.U(sVar5, R.string.charity_item_pass_dialog_no), b4.a.a(d2.c.B(m2.d(qVar5, 1.0f), 0.0f, f18, 1), c5.m2.f7291a, new bm.f(21, function02)), lv.s.D, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28281u, sVar5, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
                    sVar5.q(true);
                } else {
                    sVar5.U();
                }
                break;
            case 5:
                m3.n nVar6 = (m3.n) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((d2.z) obj).getClass();
                m3.s sVar6 = (m3.s) nVar6;
                if (sVar6.R(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    b4.t tVarZ4 = d2.c.z(m2.t(m2.d(qVar, 1.0f), 3), o30.e0.s(sVar6, R.dimen.spacing_3));
                    d2.y yVarA6 = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar6, 0);
                    int iHashCode6 = Long.hashCode(sVar6.T);
                    u3.i iVarL6 = sVar6.l();
                    b4.t tVarC6 = b4.a.c(tVarZ4, sVar6);
                    b5.j.R.getClass();
                    b5.h hVar6 = b5.i.f5839b;
                    sVar6.e0();
                    if (sVar6.S) {
                        sVar6.k(hVar6);
                    } else {
                        sVar6.n0();
                    }
                    m3.i.C(yVarA6, b5.i.f5843f, sVar6);
                    m3.i.C(iVarL6, b5.i.f5842e, sVar6);
                    m3.i.v(sVar6, Integer.valueOf(iHashCode6), b5.i.f5844g);
                    m3.i.z(sVar6, b5.i.f5845h);
                    m3.i.C(tVarC6, b5.i.f5841d, sVar6);
                    r9.d(o30.f0.U(sVar6, R.string.logout_alert_dialog_title), m2.d(qVar, 1.0f), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, m5.u0.a(lv.v.f28271j, lv.s.C, 0L, null, null, 0L, null, 3, 0L, null, null, 16744446), sVar6, 48, 0, 131068);
                    b4.t tVarD5 = m2.d(qVar, 1.0f);
                    float f20 = lv.t.f28254h;
                    float f21 = lv.t.f28255i;
                    b4.t tVarD6 = d2.c.D(tVarD5, f21, f20, f20, 0.0f, 8);
                    b4.i iVar = b4.d.f5695n;
                    b4.t tVarF = b3.i.f(iVar, tVarD6);
                    lv.q qVar6 = lv.q.DANGER;
                    String strU10 = o30.f0.U(sVar6, R.string.logout_alert_dialog_positive_btn_text);
                    boolean zF7 = sVar6.f(function0);
                    Object objM7 = sVar6.M();
                    if (zF7 || objM7 == fVar) {
                        objM7 = new rr.a(2, function0);
                        sVar6.k0(objM7);
                    }
                    v0.n.l(tVarF, strU10, null, qVar6, null, false, false, null, null, (Function0) objM7, sVar6, 3072, 500);
                    b4.t tVarF2 = b3.i.f(iVar, d2.c.B(m2.d(qVar, 1.0f), f21, 0.0f, 2));
                    lv.q qVar7 = lv.q.GREY;
                    String strU11 = o30.f0.U(sVar6, R.string.logout_alert_dialog_negative_btn_text);
                    boolean zF8 = sVar6.f(function02);
                    Object objM8 = sVar6.M();
                    if (zF8 || objM8 == fVar) {
                        objM8 = new rr.a(3, function02);
                        sVar6.k0(objM8);
                    }
                    v0.n.o(tVarF2, strU11, null, qVar7, null, false, (Function0) objM8, sVar6, 3072, 0, 1012);
                    sVar6.q(true);
                } else {
                    sVar6.U();
                }
                break;
            default:
                m3.n nVar7 = (m3.n) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((d2.z) obj).getClass();
                m3.s sVar7 = (m3.s) nVar7;
                if (sVar7.R(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    b4.t tVarD7 = d2.c.D(m2.u(qVar, null, 3), 0.0f, lv.t.f28257k, 0.0f, 0.0f, 13);
                    float f22 = lv.t.f28255i;
                    b4.t tVarB3 = d2.c.B(tVarD7, f22, 0.0f, 2);
                    String strU12 = o30.f0.U(sVar7, R.string.login_charity_store_login_title);
                    m5.u0 u0Var4 = lv.v.f28271j;
                    long j15 = lv.s.C;
                    r9.d(strU12, tVarB3, j15, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var4, sVar7, 432, 12582912, 131064);
                    r9.d(o30.f0.U(sVar7, R.string.login_charity_store_login_text), d2.c.B(d2.c.D(m2.u(qVar, null, 3), 0.0f, lv.t.f28254h, 0.0f, 0.0f, 13), f22, 0.0f, 2), j15, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar7, 432, 12582912, 131064);
                    g3.s0.g(d2.c.B(qVar, 0.0f, lv.t.f28256j, 1), 1, lv.s.H, sVar7, 438, 0);
                    v0.n.l(d2.c.B(m2.d(qVar, 1.0f), f22, 0.0f, 2), o30.f0.U(sVar7, R.string.login_charity_store_login_button), null, null, null, false, false, null, Integer.valueOf(R.drawable.ic_open_in_new), this.f7987b, sVar7, 6, 252);
                    r9.d(o30.f0.U(sVar7, R.string.login_charity_store_login_cancel), b4.a.a(d2.c.B(d2.c.B(m2.t(m2.d(qVar, 1.0f), 3), 0.0f, f22, 1), f22, 0.0f, 2), c5.m2.f7291a, new on.l(23, function02)), lv.s.D, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28281u, sVar7, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
                } else {
                    sVar7.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}
