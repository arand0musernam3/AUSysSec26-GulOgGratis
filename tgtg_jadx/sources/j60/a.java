package j60;

import b4.q;
import b5.h;
import b5.j;
import com.app.tgtg.R;
import com.tgtg.componentlibrary.component.chip.ComposableSingletons$DemoPantryChipKt;
import com.tgtg.componentlibrary.component.chip.model.ChipSemanticsKt;
import com.tgtg.componentlibrary.component.chip.type.choicechip.ComposableSingletons$DemoChoiceChipKt;
import com.tgtg.componentlibrary.component.chip.type.choicechip.ComposableSingletons$PantryChoiceChipKt;
import com.tgtg.componentlibrary.component.chip.type.choicechip.DemoChoiceChipKt;
import com.tgtg.componentlibrary.component.chip.type.choicechip.PantryChoiceChipKt;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.m2;
import d2.p;
import d2.w;
import d2.y;
import d40.t1;
import g3.i2;
import g3.r9;
import g3.x7;
import j60.a;
import java.util.ArrayList;
import k3.t;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import lv.v;
import m2.y1;
import m3.f;
import m3.i;
import m3.n;
import m3.s;
import m5.i0;
import m5.u0;
import o00.x0;
import o30.f0;
import org.bouncycastle.iana.AEADAlgorithm;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;
import p4.e;
import p4.h0;
import p4.k;
import p4.x;
import p4.z;
import u3.d;
import x5.l;
import x60.m;
import z1.h2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24745a;

    public /* synthetic */ a(int i11) {
        this.f24745a = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f24745a;
        q qVar = q.f5711a;
        switch (i11) {
            case 0:
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryChipKt composableSingletons$DemoPantryChipKt = ComposableSingletons$DemoPantryChipKt.INSTANCE;
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    r9.d("Avatar", null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, sVar, 6, 0, 262142);
                } else {
                    sVar.U();
                }
                return Unit.f26487a;
            case 1:
                n nVar2 = (n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                s sVar2 = (s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    r9.d(f0.U(sVar2, R.string.badges_page_header), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0.a(v.f28272k, lv.s.C, 0L, null, null, 0L, null, 3, 0L, null, null, 16744446), sVar2, 0, 0, 131070);
                } else {
                    sVar2.U();
                }
                return Unit.f26487a;
            case 2:
                n nVar3 = (n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                s sVar3 = (s) nVar3;
                if (sVar3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.system_icon_arrow_back_neutral_80, sVar3, 0), null, null, lv.s.f28217b, sVar3, 3128, 4);
                } else {
                    sVar3.U();
                }
                return Unit.f26487a;
            case 3:
                n nVar4 = (n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                s sVar4 = (s) nVar4;
                if (sVar4.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.system_icon_info, sVar4, 0), null, null, lv.s.f28217b, sVar4, 3128, 4);
                } else {
                    sVar4.U();
                }
                return Unit.f26487a;
            case 4:
                return (Float) ((t) obj2).f25869a.d();
            case 5:
                n nVar5 = (n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                s sVar5 = (s) nVar5;
                if (sVar5.R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.ic_close, sVar5, 0), null, null, 0L, sVar5, 56, 12);
                } else {
                    sVar5.U();
                }
                return Unit.f26487a;
            case 6:
                ((Integer) obj2).getClass();
                a.a.q((n) obj, i.F(1));
                return Unit.f26487a;
            case 7:
                n nVar6 = (n) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoChoiceChipKt composableSingletons$DemoChoiceChipKt = new Object() { // from class: com.tgtg.componentlibrary.component.chip.type.choicechip.ComposableSingletons$DemoChoiceChipKt

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final d f13081a = new d(new a(7), false, 1944948006);

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public static final d f13082b = new d(new a(8), false, 274681008);

                    @NotNull
                    public final Function2<n, Integer, Unit> getLambda$1944948006$app_release() {
                        return f13081a;
                    }

                    @NotNull
                    public final Function2<n, Integer, Unit> getLambda$274681008$app_release() {
                        return f13082b;
                    }
                };
                s sVar6 = (s) nVar6;
                if (sVar6.R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    DemoChoiceChipKt.DemoChoiceChip(sVar6, 0);
                } else {
                    sVar6.U();
                }
                return Unit.f26487a;
            case 8:
                n nVar7 = (n) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoChoiceChipKt composableSingletons$DemoChoiceChipKt2 = new Object() { // from class: com.tgtg.componentlibrary.component.chip.type.choicechip.ComposableSingletons$DemoChoiceChipKt

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final d f13081a = new d(new a(7), false, 1944948006);

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public static final d f13082b = new d(new a(8), false, 274681008);

                    @NotNull
                    public final Function2<n, Integer, Unit> getLambda$1944948006$app_release() {
                        return f13081a;
                    }

                    @NotNull
                    public final Function2<n, Integer, Unit> getLambda$274681008$app_release() {
                        return f13082b;
                    }
                };
                s sVar7 = (s) nVar7;
                if (sVar7.R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    DemoChoiceChipKt.DemoChoiceChip(sVar7, 0);
                } else {
                    sVar7.U();
                }
                return Unit.f26487a;
            case 9:
                n nVar8 = (n) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                ComposableSingletons$PantryChoiceChipKt composableSingletons$PantryChoiceChipKt = ComposableSingletons$PantryChoiceChipKt.INSTANCE;
                s sVar8 = (s) nVar8;
                if (sVar8.R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    m mVar = (m) sVar8.j(PantryThemeKt.getLocalPantrySpacing());
                    b4.t tVarZ = d2.c.z(qVar, mVar.f44015k);
                    d2.b bVar = d2.i.f13801a;
                    y yVarA = w.a(d2.i.g(mVar.l), b4.d.f5694m, sVar8, 0);
                    int iHashCode = Long.hashCode(sVar8.T);
                    u3.i iVarL = sVar8.l();
                    b4.t tVarC = b4.a.c(tVarZ, sVar8);
                    j.R.getClass();
                    h hVar = b5.i.f5839b;
                    sVar8.e0();
                    if (sVar8.S) {
                        sVar8.k(hVar);
                    } else {
                        sVar8.n0();
                    }
                    i.C(yVarA, b5.i.f5843f, sVar8);
                    i.C(iVarL, b5.i.f5842e, sVar8);
                    i.v(sVar8, Integer.valueOf(iHashCode), b5.i.f5844g);
                    i.z(sVar8, b5.i.f5845h);
                    i.C(tVarC, b5.i.f5841d, sVar8);
                    Object objM = sVar8.M();
                    f fVar = m3.m.f29332a;
                    if (objM == fVar) {
                        objM = new jq.a(14);
                        sVar8.k0(objM);
                    }
                    PantryChoiceChipKt.PantryChoiceChip(ChipSemanticsKt.CHIP_STATE_DESCRIPTION_SELECTED, true, (Function0) objM, null, null, false, false, sVar8, 438, 120);
                    Object objM2 = sVar8.M();
                    if (objM2 == fVar) {
                        objM2 = new jq.a(15);
                        sVar8.k0(objM2);
                    }
                    PantryChoiceChipKt.PantryChoiceChip("Not Selected", false, (Function0) objM2, null, null, false, false, sVar8, 438, 120);
                    sVar8.q(true);
                } else {
                    sVar8.U();
                }
                return Unit.f26487a;
            case 10:
                n nVar9 = (n) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                s sVar9 = (s) nVar9;
                if (sVar9.R(1 & iIntValue9, (iIntValue9 & 3) != 2)) {
                    p.a(m2.m(qVar, x7.f19777a), sVar9, 0);
                } else {
                    sVar9.U();
                }
                return Unit.f26487a;
            case 11:
                n nVar10 = (n) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                s sVar10 = (s) nVar10;
                if (sVar10.R(1 & iIntValue10, (iIntValue10 & 3) != 2)) {
                    p.a(m2.m(qVar, x7.f19777a), sVar10, 0);
                } else {
                    sVar10.U();
                }
                return Unit.f26487a;
            case 12:
                n nVar11 = (n) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                s sVar11 = (s) nVar11;
                if (sVar11.R(1 & iIntValue11, (iIntValue11 & 3) != 2)) {
                    p.a(m2.m(qVar, x7.f19777a), sVar11, 0);
                } else {
                    sVar11.U();
                }
                return Unit.f26487a;
            case 13:
                n nVar12 = (n) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                s sVar12 = (s) nVar12;
                if (sVar12.R(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    r9.d(f0.U(sVar12, R.string.charity_notifications_settings_phone), null, lv.s.E, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28274n, sVar12, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                } else {
                    sVar12.U();
                }
                return Unit.f26487a;
            case 14:
                n nVar13 = (n) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                s sVar13 = (s) nVar13;
                if (sVar13.R(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.system_icon_close_neutral_80, sVar13, 0), f0.U(sVar13, R.string.voice_over_close), null, 0L, sVar13, 8, 12);
                } else {
                    sVar13.U();
                }
                return Unit.f26487a;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                n nVar14 = (n) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                s sVar14 = (s) nVar14;
                if (sVar14.R(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    qm.b.a(sVar14, 0);
                } else {
                    sVar14.U();
                }
                return Unit.f26487a;
            case 16:
                n nVar15 = (n) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                s sVar15 = (s) nVar15;
                if (sVar15.R(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.gallery_icon, sVar15, 0), "Open gallery", null, i4.v.f23315h, sVar15, 3128, 4);
                } else {
                    sVar15.U();
                }
                return Unit.f26487a;
            case 17:
                n nVar16 = (n) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                s sVar16 = (s) nVar16;
                if (sVar16.R(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.checkmark_round_white, sVar16, 0), "Check", null, i4.v.f23315h, sVar16, 3128, 4);
                } else {
                    sVar16.U();
                }
                return Unit.f26487a;
            case 18:
                n nVar17 = (n) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                s sVar17 = (s) nVar17;
                if (sVar17.R(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.share_recipe, sVar17, 0), null, null, i4.v.f23315h, sVar17, 3128, 4);
                } else {
                    sVar17.U();
                }
                return Unit.f26487a;
            case 19:
                n nVar18 = (n) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                s sVar18 = (s) nVar18;
                if (sVar18.R(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.ic_close24, sVar18, 0), null, null, lv.s.D, sVar18, 3128, 4);
                } else {
                    sVar18.U();
                }
                return Unit.f26487a;
            case 20:
                n nVar19 = (n) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                s sVar19 = (s) nVar19;
                if (sVar19.R(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.custom_camera_delete, sVar19, 0), null, null, i4.v.f23315h, sVar19, 3128, 4);
                } else {
                    sVar19.U();
                }
                return Unit.f26487a;
            case 21:
                n nVar20 = (n) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                s sVar20 = (s) nVar20;
                if (sVar20.R(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.flash_transparent_icon, sVar20, 0), null, null, i4.v.f23315h, sVar20, 3128, 4);
                } else {
                    sVar20.U();
                }
                return Unit.f26487a;
            case 22:
                n nVar21 = (n) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                s sVar21 = (s) nVar21;
                if (sVar21.R(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    p4.f fVarB = t1.f14360a;
                    if (fVarB == null) {
                        e eVar = new e("Filled.History", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        n0 n0Var = h0.f34349a;
                        i4.x0 x0Var = new i4.x0(i4.v.f23309b);
                        n1.c cVar = new n1.c();
                        cVar.e(13.0f, 3.0f);
                        cVar.b(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
                        cVar.c(1.0f, 12.0f);
                        cVar.d(3.89f, 3.89f);
                        cVar.d(0.07f, 0.14f);
                        cVar.c(9.0f, 12.0f);
                        cVar.c(6.0f, 12.0f);
                        cVar.b(0.0f, -3.87f, 3.13f, -7.0f, 7.0f, -7.0f);
                        x xVar = new x(7.0f, 3.13f, 7.0f, 7.0f);
                        ArrayList arrayList = cVar.f30272a;
                        arrayList.add(xVar);
                        arrayList.add(new x(-3.13f, 7.0f, -7.0f, 7.0f));
                        cVar.b(-1.93f, 0.0f, -3.68f, -0.79f, -4.94f, -2.06f);
                        cVar.d(-1.42f, 1.42f);
                        arrayList.add(new k(8.27f, 19.99f, 10.51f, 21.0f, 13.0f, 21.0f));
                        cVar.b(4.97f, 0.0f, 9.0f, -4.03f, 9.0f, -9.0f);
                        arrayList.add(new x(-4.03f, -9.0f, -9.0f, -9.0f));
                        cVar.a();
                        cVar.e(12.0f, 8.0f);
                        arrayList.add(new z(5.0f));
                        cVar.d(4.28f, 2.54f);
                        cVar.d(0.72f, -1.21f);
                        cVar.d(-3.5f, -2.08f);
                        cVar.c(13.5f, 8.0f);
                        cVar.c(12.0f, 8.0f);
                        cVar.a();
                        e.a(eVar, arrayList, x0Var);
                        fVarB = eVar.b();
                        t1.f14360a = fVarB;
                    }
                    i2.b(fVarB, null, null, lv.s.C, sVar21, 3120, 4);
                } else {
                    sVar21.U();
                }
                return Unit.f26487a;
            case 23:
                ((Integer) obj2).getClass();
                ls.a.c((n) obj, i.F(1));
                return Unit.f26487a;
            case 24:
                y1 y1Var = (y1) obj2;
                return d0.h(Float.valueOf(y1Var.f29139a.h()), Boolean.valueOf(((h2) y1Var.f29144f.getValue()) == h2.Vertical));
            case 25:
                n nVar22 = (n) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                s sVar22 = (s) nVar22;
                if (!sVar22.R(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    sVar22.U();
                }
                return Unit.f26487a;
            case 26:
                n nVar23 = (n) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                s sVar23 = (s) nVar23;
                if (!sVar23.R(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    sVar23.U();
                }
                return Unit.f26487a;
            case 27:
                m5.h hVar2 = (m5.h) obj2;
                return d0.d(hVar2.f29538b, i0.a(hVar2.f29537a, i0.f29542a, (y3.a) obj));
            case 28:
                return Integer.valueOf(((l) obj2).f43856a);
            default:
                x5.p pVar = (x5.p) obj2;
                return d0.d(Float.valueOf(pVar.f43860a), Float.valueOf(pVar.f43861b));
        }
    }

    public /* synthetic */ a(int i11, int i12) {
        this.f24745a = i12;
    }
}
