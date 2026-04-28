package m5;

import com.app.tgtg.R;
import com.tgtg.componentlibrary.component.avatar.model.AvatarSize;
import com.tgtg.componentlibrary.component.avatar.variant.PantryAvatarIllustrationKt;
import com.tgtg.componentlibrary.component.chip.type.filterchip.ComposableSingletons$DemoFilterChipKt;
import com.tgtg.componentlibrary.component.chip.type.filterchip.ComposableSingletons$PantryFilterChipKt;
import com.tgtg.componentlibrary.component.chip.type.filterchip.DemoFilterChipKt;
import com.tgtg.componentlibrary.component.chip.type.filterchip.variant.AvatarFilterChipKt;
import com.tgtg.componentlibrary.component.chip.type.filterchip.variant.ComposableSingletons$AvatarFilterChipKt;
import com.tgtg.componentlibrary.component.chip.type.filterchip.variant.ComposableSingletons$IconFilterChipKt;
import com.tgtg.componentlibrary.component.chip.type.filterchip.variant.ComposableSingletons$TextOnlyFilterChipKt;
import com.tgtg.componentlibrary.component.chip.type.filterchip.variant.IconFilterChipKt;
import com.tgtg.componentlibrary.component.chip.type.filterchip.variant.TextOnlyFilterChipKt;
import com.tgtg.componentlibrary.component.chip.type.selectionchip.ComposableSingletons$DemoSelectionChipKt;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.m2;
import g3.i2;
import g3.r9;
import g3.x7;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m3.n;
import m5.j0;
import org.bouncycastle.iana.AEADAlgorithm;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;
import u3.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29567a;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f29567a;
        m3.f fVar = m3.m.f29332a;
        b4.q qVar = b4.q.f5711a;
        switch (i11) {
            case 0:
                break;
            case 1:
                x5.s sVar = (x5.s) obj2;
                break;
            case 2:
                break;
            case 3:
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ComposableSingletons$DemoFilterChipKt composableSingletons$DemoFilterChipKt = ComposableSingletons$DemoFilterChipKt.INSTANCE;
                m3.s sVar2 = (m3.s) nVar;
                if (sVar2.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i2.a(o00.x0.z(R.drawable.check, sVar2, 0), null, null, 0L, sVar2, 56, 12);
                } else {
                    sVar2.U();
                }
                break;
            case 4:
                m3.n nVar2 = (m3.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoFilterChipKt composableSingletons$DemoFilterChipKt2 = ComposableSingletons$DemoFilterChipKt.INSTANCE;
                m3.s sVar3 = (m3.s) nVar2;
                if (!sVar3.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    sVar3.U();
                }
                break;
            case 5:
                m3.n nVar3 = (m3.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoFilterChipKt composableSingletons$DemoFilterChipKt3 = ComposableSingletons$DemoFilterChipKt.INSTANCE;
                m3.s sVar4 = (m3.s) nVar3;
                if (sVar4.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    r9.d("Text Only", null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, sVar4, 6, 0, 262142);
                } else {
                    sVar4.U();
                }
                break;
            case 6:
                m3.n nVar4 = (m3.n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoFilterChipKt composableSingletons$DemoFilterChipKt4 = ComposableSingletons$DemoFilterChipKt.INSTANCE;
                m3.s sVar5 = (m3.s) nVar4;
                if (!sVar5.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    sVar5.U();
                }
                break;
            case 7:
                m3.n nVar5 = (m3.n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoFilterChipKt composableSingletons$DemoFilterChipKt5 = ComposableSingletons$DemoFilterChipKt.INSTANCE;
                m3.s sVar6 = (m3.s) nVar5;
                if (sVar6.R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    r9.d("Icon", null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, sVar6, 6, 0, 262142);
                } else {
                    sVar6.U();
                }
                break;
            case 8:
                m3.n nVar6 = (m3.n) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoFilterChipKt composableSingletons$DemoFilterChipKt6 = ComposableSingletons$DemoFilterChipKt.INSTANCE;
                m3.s sVar7 = (m3.s) nVar6;
                if (!sVar7.R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    sVar7.U();
                }
                break;
            case 9:
                m3.n nVar7 = (m3.n) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoFilterChipKt composableSingletons$DemoFilterChipKt7 = ComposableSingletons$DemoFilterChipKt.INSTANCE;
                m3.s sVar8 = (m3.s) nVar7;
                if (sVar8.R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    r9.d("Avatar", null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, sVar8, 6, 0, 262142);
                } else {
                    sVar8.U();
                }
                break;
            case 10:
                m3.n nVar8 = (m3.n) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoFilterChipKt composableSingletons$DemoFilterChipKt8 = ComposableSingletons$DemoFilterChipKt.INSTANCE;
                m3.s sVar9 = (m3.s) nVar8;
                if (sVar9.R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    DemoFilterChipKt.DemoFilterChip(sVar9, 0);
                } else {
                    sVar9.U();
                }
                break;
            case 11:
                m3.n nVar9 = (m3.n) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoFilterChipKt composableSingletons$DemoFilterChipKt9 = ComposableSingletons$DemoFilterChipKt.INSTANCE;
                m3.s sVar10 = (m3.s) nVar9;
                if (sVar10.R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    DemoFilterChipKt.DemoFilterChip(sVar10, 0);
                } else {
                    sVar10.U();
                }
                break;
            case 12:
                m3.n nVar10 = (m3.n) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoFilterChipKt composableSingletons$DemoFilterChipKt10 = ComposableSingletons$DemoFilterChipKt.INSTANCE;
                m3.s sVar11 = (m3.s) nVar10;
                if (sVar11.R(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    PantryAvatarIllustrationKt.PantryAvatarIllustration(ComposableSingletons$DemoFilterChipKt.f13086b, null, "Illustration", AvatarSize.Small, sVar11, 3462, 2);
                } else {
                    sVar11.U();
                }
                break;
            case 13:
                m3.n nVar11 = (m3.n) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoFilterChipKt composableSingletons$DemoFilterChipKt11 = ComposableSingletons$DemoFilterChipKt.INSTANCE;
                m3.s sVar12 = (m3.s) nVar11;
                if (sVar12.R(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    i2.a(o00.x0.z(R.drawable.check, sVar12, 0), null, null, 0L, sVar12, 56, 12);
                } else {
                    sVar12.U();
                }
                break;
            case 14:
                m3.n nVar12 = (m3.n) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoFilterChipKt composableSingletons$DemoFilterChipKt12 = ComposableSingletons$DemoFilterChipKt.INSTANCE;
                m3.s sVar13 = (m3.s) nVar12;
                if (sVar13.R(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    PantryAvatarIllustrationKt.PantryAvatarIllustration(ComposableSingletons$DemoFilterChipKt.f13089e, null, "Illustration", AvatarSize.Small, sVar13, 3462, 2);
                } else {
                    sVar13.U();
                }
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                m3.n nVar13 = (m3.n) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                ComposableSingletons$PantryFilterChipKt composableSingletons$PantryFilterChipKt = new Object() { // from class: com.tgtg.componentlibrary.component.chip.type.filterchip.ComposableSingletons$PantryFilterChipKt

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final d f13098a = new d(new j0(15, 0), false, 1331138918);

                    @NotNull
                    public final Function2<n, Integer, Unit> getLambda$1331138918$app_release() {
                        return f13098a;
                    }
                };
                m3.s sVar14 = (m3.s) nVar13;
                if (sVar14.R(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x60.m mVar = (x60.m) sVar14.j(PantryThemeKt.getLocalPantrySpacing());
                    b4.t tVarZ = d2.c.z(qVar, mVar.f44015k);
                    d2.b bVar = d2.i.f13801a;
                    d2.y yVarA = d2.w.a(d2.i.g(mVar.l), b4.d.f5694m, sVar14, 0);
                    int iHashCode = Long.hashCode(sVar14.T);
                    u3.i iVarL = sVar14.l();
                    b4.t tVarC = b4.a.c(tVarZ, sVar14);
                    b5.j.R.getClass();
                    b5.h hVar = b5.i.f5839b;
                    sVar14.e0();
                    if (sVar14.S) {
                        sVar14.k(hVar);
                    } else {
                        sVar14.n0();
                    }
                    m3.i.C(yVarA, b5.i.f5843f, sVar14);
                    m3.i.C(iVarL, b5.i.f5842e, sVar14);
                    m3.i.v(sVar14, Integer.valueOf(iHashCode), b5.i.f5844g);
                    m3.i.z(sVar14, b5.i.f5845h);
                    m3.i.C(tVarC, b5.i.f5841d, sVar14);
                    TextOnlyFilterChipKt.PreviewTextOnlyFilterChip(sVar14, 0);
                    IconFilterChipKt.PreviewIconFilterChip(sVar14, 0);
                    AvatarFilterChipKt.PreviewAvatarFilterChip(sVar14, 0);
                    sVar14.q(true);
                } else {
                    sVar14.U();
                }
                break;
            case 16:
                m3.n nVar14 = (m3.n) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                m3.s sVar15 = (m3.s) nVar14;
                if (sVar15.R(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    nn.q.k(null, sVar15, 0);
                } else {
                    sVar15.U();
                }
                break;
            case 17:
                m3.n nVar15 = (m3.n) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                ComposableSingletons$AvatarFilterChipKt composableSingletons$AvatarFilterChipKt = ComposableSingletons$AvatarFilterChipKt.INSTANCE;
                m3.s sVar16 = (m3.s) nVar15;
                if (sVar16.R(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    PantryAvatarIllustrationKt.PantryAvatarIllustration(ComposableSingletons$AvatarFilterChipKt.f13100a, null, "Illustration", AvatarSize.Small, sVar16, 3462, 2);
                } else {
                    sVar16.U();
                }
                break;
            case 18:
                m3.n nVar16 = (m3.n) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                ComposableSingletons$AvatarFilterChipKt composableSingletons$AvatarFilterChipKt2 = ComposableSingletons$AvatarFilterChipKt.INSTANCE;
                m3.s sVar17 = (m3.s) nVar16;
                if (sVar17.R(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    x60.m mVar2 = (x60.m) sVar17.j(PantryThemeKt.getLocalPantrySpacing());
                    b4.t tVarZ2 = d2.c.z(qVar, mVar2.f44015k);
                    d2.b bVar2 = d2.i.f13801a;
                    d2.y yVarA2 = d2.w.a(d2.i.g(mVar2.l), b4.d.f5694m, sVar17, 0);
                    int iHashCode2 = Long.hashCode(sVar17.T);
                    u3.i iVarL2 = sVar17.l();
                    b4.t tVarC2 = b4.a.c(tVarZ2, sVar17);
                    b5.j.R.getClass();
                    b5.h hVar2 = b5.i.f5839b;
                    sVar17.e0();
                    if (sVar17.S) {
                        sVar17.k(hVar2);
                    } else {
                        sVar17.n0();
                    }
                    m3.i.C(yVarA2, b5.i.f5843f, sVar17);
                    m3.i.C(iVarL2, b5.i.f5842e, sVar17);
                    m3.i.v(sVar17, Integer.valueOf(iHashCode2), b5.i.f5844g);
                    m3.i.z(sVar17, b5.i.f5845h);
                    m3.i.C(tVarC2, b5.i.f5841d, sVar17);
                    Object objM = sVar17.M();
                    if (objM == fVar) {
                        objM = new mw.e(27);
                        sVar17.k0(objM);
                    }
                    AvatarFilterChipKt.AvatarFilterChip("Avatar Filter Chip", false, (Function0) objM, null, null, false, false, ComposableSingletons$AvatarFilterChipKt.f13101b, sVar17, 12583350, 120);
                    sVar17.q(true);
                } else {
                    sVar17.U();
                }
                break;
            case 19:
                m3.n nVar17 = (m3.n) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                ComposableSingletons$IconFilterChipKt composableSingletons$IconFilterChipKt = ComposableSingletons$IconFilterChipKt.INSTANCE;
                m3.s sVar18 = (m3.s) nVar17;
                if (sVar18.R(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    i2.a(o00.x0.z(R.drawable.check, sVar18, 0), null, null, 0L, sVar18, 56, 12);
                } else {
                    sVar18.U();
                }
                break;
            case 20:
                m3.n nVar18 = (m3.n) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                ComposableSingletons$IconFilterChipKt composableSingletons$IconFilterChipKt2 = ComposableSingletons$IconFilterChipKt.INSTANCE;
                m3.s sVar19 = (m3.s) nVar18;
                if (sVar19.R(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    x60.m mVar3 = (x60.m) sVar19.j(PantryThemeKt.getLocalPantrySpacing());
                    b4.t tVarZ3 = d2.c.z(qVar, mVar3.f44015k);
                    d2.b bVar3 = d2.i.f13801a;
                    d2.y yVarA3 = d2.w.a(d2.i.g(mVar3.l), b4.d.f5694m, sVar19, 0);
                    int iHashCode3 = Long.hashCode(sVar19.T);
                    u3.i iVarL3 = sVar19.l();
                    b4.t tVarC3 = b4.a.c(tVarZ3, sVar19);
                    b5.j.R.getClass();
                    b5.h hVar3 = b5.i.f5839b;
                    sVar19.e0();
                    if (sVar19.S) {
                        sVar19.k(hVar3);
                    } else {
                        sVar19.n0();
                    }
                    m3.i.C(yVarA3, b5.i.f5843f, sVar19);
                    m3.i.C(iVarL3, b5.i.f5842e, sVar19);
                    m3.i.v(sVar19, Integer.valueOf(iHashCode3), b5.i.f5844g);
                    m3.i.z(sVar19, b5.i.f5845h);
                    m3.i.C(tVarC3, b5.i.f5841d, sVar19);
                    Object objM2 = sVar19.M();
                    if (objM2 == fVar) {
                        objM2 = new mw.e(28);
                        sVar19.k0(objM2);
                    }
                    IconFilterChipKt.IconFilterChip("Icon Filter Chip", false, (Function0) objM2, null, null, false, false, ComposableSingletons$IconFilterChipKt.f13103a, sVar19, 12583350, 120);
                    sVar19.q(true);
                } else {
                    sVar19.U();
                }
                break;
            case 21:
                m3.n nVar19 = (m3.n) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                ComposableSingletons$TextOnlyFilterChipKt composableSingletons$TextOnlyFilterChipKt = ComposableSingletons$TextOnlyFilterChipKt.INSTANCE;
                m3.s sVar20 = (m3.s) nVar19;
                if (sVar20.R(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    x60.m mVar4 = (x60.m) sVar20.j(PantryThemeKt.getLocalPantrySpacing());
                    b4.t tVarZ4 = d2.c.z(qVar, mVar4.f44015k);
                    d2.b bVar4 = d2.i.f13801a;
                    d2.y yVarA4 = d2.w.a(d2.i.g(mVar4.l), b4.d.f5694m, sVar20, 0);
                    int iHashCode4 = Long.hashCode(sVar20.T);
                    u3.i iVarL4 = sVar20.l();
                    b4.t tVarC4 = b4.a.c(tVarZ4, sVar20);
                    b5.j.R.getClass();
                    b5.h hVar4 = b5.i.f5839b;
                    sVar20.e0();
                    if (sVar20.S) {
                        sVar20.k(hVar4);
                    } else {
                        sVar20.n0();
                    }
                    m3.i.C(yVarA4, b5.i.f5843f, sVar20);
                    m3.i.C(iVarL4, b5.i.f5842e, sVar20);
                    m3.i.v(sVar20, Integer.valueOf(iHashCode4), b5.i.f5844g);
                    m3.i.z(sVar20, b5.i.f5845h);
                    m3.i.C(tVarC4, b5.i.f5841d, sVar20);
                    Object objM3 = sVar20.M();
                    if (objM3 == fVar) {
                        objM3 = new mw.e(29);
                        sVar20.k0(objM3);
                    }
                    TextOnlyFilterChipKt.TextOnlyFilterChip("Text Only Filter Chip", false, (Function0) objM3, null, null, false, false, null, sVar20, 438, 248);
                    sVar20.q(true);
                } else {
                    sVar20.U();
                }
                break;
            case 22:
                m3.n nVar20 = (m3.n) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                m3.s sVar21 = (m3.s) nVar20;
                if (sVar21.R(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    d2.p.a(m2.m(qVar, x7.f19777a), sVar21, 0);
                } else {
                    sVar21.U();
                }
                break;
            case 23:
                m3.n nVar21 = (m3.n) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                m3.s sVar22 = (m3.s) nVar21;
                if (sVar22.R(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    d2.p.a(m2.m(qVar, x7.f19777a), sVar22, 0);
                } else {
                    sVar22.U();
                }
                break;
            case 24:
                m3.n nVar22 = (m3.n) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                m3.s sVar23 = (m3.s) nVar22;
                if (sVar23.R(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    r9.d(o30.f0.U(sVar23, R.string.charity_notifications_phone), null, lv.s.E, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar23, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                } else {
                    sVar23.U();
                }
                break;
            case 25:
                ((Integer) obj2).getClass();
                nv.b.a((m3.n) obj, m3.i.F(1));
                break;
            case 26:
                m3.n nVar23 = (m3.n) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoSelectionChipKt composableSingletons$DemoSelectionChipKt = ComposableSingletons$DemoSelectionChipKt.INSTANCE;
                m3.s sVar24 = (m3.s) nVar23;
                if (sVar24.R(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    i2.a(o00.x0.z(R.drawable.check, sVar24, 0), null, null, 0L, sVar24, 56, 12);
                } else {
                    sVar24.U();
                }
                break;
            case 27:
                m3.n nVar24 = (m3.n) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoSelectionChipKt composableSingletons$DemoSelectionChipKt2 = ComposableSingletons$DemoSelectionChipKt.INSTANCE;
                m3.s sVar25 = (m3.s) nVar24;
                if (!sVar25.R(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    sVar25.U();
                }
                break;
            case 28:
                m3.n nVar25 = (m3.n) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoSelectionChipKt composableSingletons$DemoSelectionChipKt3 = ComposableSingletons$DemoSelectionChipKt.INSTANCE;
                m3.s sVar26 = (m3.s) nVar25;
                if (sVar26.R(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    r9.d("Text Only", null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, sVar26, 6, 0, 262142);
                } else {
                    sVar26.U();
                }
                break;
            default:
                m3.n nVar26 = (m3.n) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoSelectionChipKt composableSingletons$DemoSelectionChipKt4 = ComposableSingletons$DemoSelectionChipKt.INSTANCE;
                m3.s sVar27 = (m3.s) nVar26;
                if (!sVar27.R(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    sVar27.U();
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ j0(int i11, byte b8) {
        this.f29567a = i11;
    }
}
