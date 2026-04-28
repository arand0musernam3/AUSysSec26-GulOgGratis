package s60;

import b4.t;
import b5.j;
import com.app.tgtg.R;
import com.tgtg.componentlibrary.component.avatar.PantryAvatarKt;
import com.tgtg.componentlibrary.component.avatar.model.AvatarVariant;
import com.tgtg.componentlibrary.component.badgelabel.variant.AccentPantryBadgeLabelKt;
import com.tgtg.componentlibrary.component.iconbutton.variant.SubtlePantryIconButtonKt;
import com.tgtg.componentlibrary.component.pageheader.ComposableSingletons$DemoPantryPageHeaderKt;
import com.tgtg.componentlibrary.component.pageheader.ComposableSingletons$PantryPageHeaderDoc_figmaKt;
import com.tgtg.componentlibrary.component.pageheader.ComposableSingletons$PantryPageHeaderKt;
import com.tgtg.componentlibrary.component.pageheader.DemoPantryPageHeaderKt;
import com.tgtg.componentlibrary.component.pageheader.PantryPageHeaderKt;
import com.tgtg.componentlibrary.component.pageheader.model.PageHeaderState;
import com.tgtg.componentlibrary.component.pageheader.variant.GlobalPantryPageHeaderKt;
import com.tgtg.componentlibrary.component.pageheader.variant.ModalPantryPageHeaderKt;
import com.tgtg.componentlibrary.component.pageheader.variant.PagePantryPageHeaderKt;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.i;
import d2.m2;
import d2.w;
import d2.y;
import g3.b9;
import g3.i2;
import g3.k8;
import g3.r9;
import g3.s0;
import i4.g0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m3.f;
import m3.m;
import m3.n;
import m3.s;
import o00.x0;
import org.bouncycastle.iana.AEADAlgorithm;
import x60.h;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38859a;

    public /* synthetic */ a(int i11) {
        this.f38859a = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f38859a;
        f fVar = m.f29332a;
        int i12 = 1;
        switch (i11) {
            case 0:
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryPageHeaderKt composableSingletons$DemoPantryPageHeaderKt = ComposableSingletons$DemoPantryPageHeaderKt.INSTANCE;
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    PantryAvatarKt.PantryAvatar(null, null, "JM", null, AvatarVariant.Text, null, sVar, 24960, 43);
                } else {
                    sVar.U();
                }
                break;
            case 1:
                n nVar2 = (n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryPageHeaderKt composableSingletons$DemoPantryPageHeaderKt2 = ComposableSingletons$DemoPantryPageHeaderKt.INSTANCE;
                s sVar2 = (s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    DemoPantryPageHeaderKt.a(R.drawable.plus, sVar2, 0);
                } else {
                    sVar2.U();
                }
                break;
            case 2:
                n nVar3 = (n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryPageHeaderKt composableSingletons$DemoPantryPageHeaderKt3 = ComposableSingletons$DemoPantryPageHeaderKt.INSTANCE;
                s sVar3 = (s) nVar3;
                if (sVar3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    r9.d("Tab 1", null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, sVar3, 6, 0, 262142);
                } else {
                    sVar3.U();
                }
                break;
            case 3:
                n nVar4 = (n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryPageHeaderKt composableSingletons$DemoPantryPageHeaderKt4 = ComposableSingletons$DemoPantryPageHeaderKt.INSTANCE;
                s sVar4 = (s) nVar4;
                if (sVar4.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    r9.d("Tab 2", null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, sVar4, 6, 0, 262142);
                } else {
                    sVar4.U();
                }
                break;
            case 4:
                n nVar5 = (n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryPageHeaderKt composableSingletons$DemoPantryPageHeaderKt5 = ComposableSingletons$DemoPantryPageHeaderKt.INSTANCE;
                s sVar5 = (s) nVar5;
                if (sVar5.R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    Object objM = sVar5.M();
                    if (objM == fVar) {
                        objM = new b(z ? 1 : 0);
                        sVar5.k0(objM);
                    }
                    k8.b(true, (Function0) objM, null, false, ComposableSingletons$DemoPantryPageHeaderKt.f13190k, 0L, 0L, sVar5, 24630, 492);
                    Object objM2 = sVar5.M();
                    if (objM2 == fVar) {
                        objM2 = new b(i12);
                        sVar5.k0(objM2);
                    }
                    k8.b(false, (Function0) objM2, null, false, ComposableSingletons$DemoPantryPageHeaderKt.l, 0L, 0L, sVar5, 24630, 492);
                } else {
                    sVar5.U();
                }
                break;
            case 5:
                n nVar6 = (n) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryPageHeaderKt composableSingletons$DemoPantryPageHeaderKt6 = ComposableSingletons$DemoPantryPageHeaderKt.INSTANCE;
                s sVar6 = (s) nVar6;
                if (sVar6.R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    b9.b(null, 0L, 0L, null, null, ComposableSingletons$DemoPantryPageHeaderKt.f13191m, sVar6, 1572870);
                } else {
                    sVar6.U();
                }
                break;
            case 6:
                n nVar7 = (n) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryPageHeaderKt composableSingletons$DemoPantryPageHeaderKt7 = ComposableSingletons$DemoPantryPageHeaderKt.INSTANCE;
                s sVar7 = (s) nVar7;
                if (sVar7.R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    DemoPantryPageHeaderKt.a(R.drawable.close, sVar7, 0);
                } else {
                    sVar7.U();
                }
                break;
            case 7:
                n nVar8 = (n) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryPageHeaderKt composableSingletons$DemoPantryPageHeaderKt8 = ComposableSingletons$DemoPantryPageHeaderKt.INSTANCE;
                s sVar8 = (s) nVar8;
                if (sVar8.R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    AccentPantryBadgeLabelKt.MediumAccentPantryBadgeLabel("Earn 100 DKK", null, null, null, null, sVar8, 6, 30);
                } else {
                    sVar8.U();
                }
                break;
            case 8:
                n nVar9 = (n) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryPageHeaderKt composableSingletons$DemoPantryPageHeaderKt9 = ComposableSingletons$DemoPantryPageHeaderKt.INSTANCE;
                s sVar9 = (s) nVar9;
                if (sVar9.R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    DemoPantryPageHeaderKt.a(R.drawable.arrow_left, sVar9, 0);
                } else {
                    sVar9.U();
                }
                break;
            case 9:
                n nVar10 = (n) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryPageHeaderKt composableSingletons$DemoPantryPageHeaderKt10 = ComposableSingletons$DemoPantryPageHeaderKt.INSTANCE;
                s sVar10 = (s) nVar10;
                if (sVar10.R(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x60.m mVar = (x60.m) sVar10.j(PantryThemeKt.getLocalPantrySpacing());
                    t tVarB = d2.c.B(v1.n.r(v1.n.j(m2.f13850c, ((h) sVar10.j(PantryThemeKt.getLocalPantryColor())).f43905a, g0.f23254b), v1.n.q(sVar10), true), 0.0f, mVar.f44015k, 1);
                    d2.b bVar = i.f13801a;
                    y yVarA = w.a(i.g(mVar.f44015k), b4.d.f5694m, sVar10, 0);
                    int iHashCode = Long.hashCode(sVar10.T);
                    u3.i iVarL = sVar10.l();
                    t tVarC = b4.a.c(tVarB, sVar10);
                    j.R.getClass();
                    b5.h hVar = b5.i.f5839b;
                    sVar10.e0();
                    if (sVar10.S) {
                        sVar10.k(hVar);
                    } else {
                        sVar10.n0();
                    }
                    m3.i.C(yVarA, b5.i.f5843f, sVar10);
                    m3.i.C(iVarL, b5.i.f5842e, sVar10);
                    m3.i.v(sVar10, Integer.valueOf(iHashCode), b5.i.f5844g);
                    m3.i.z(sVar10, b5.i.f5845h);
                    m3.i.C(tVarC, b5.i.f5841d, sVar10);
                    int i13 = 6;
                    DemoPantryPageHeaderKt.b("Global - Full", sVar10, 6);
                    PageHeaderState pageHeaderState = PageHeaderState.Full;
                    GlobalPantryPageHeaderKt.GlobalPantryPageHeader("Title", pageHeaderState, null, "Supporting Text", ComposableSingletons$DemoPantryPageHeaderKt.f13180a, ComposableSingletons$DemoPantryPageHeaderKt.f13181b, ComposableSingletons$DemoPantryPageHeaderKt.f13182c, ComposableSingletons$DemoPantryPageHeaderKt.f13183d, ComposableSingletons$DemoPantryPageHeaderKt.f13187h, sVar10, 115043382, 4);
                    s0.g(null, 0.0f, 0L, sVar10, 0, 7);
                    DemoPantryPageHeaderKt.b("Global - Collapsed", sVar10, 6);
                    PageHeaderState pageHeaderState2 = PageHeaderState.Collapsed;
                    GlobalPantryPageHeaderKt.GlobalPantryPageHeader("Title", pageHeaderState2, null, "Supporting Text", ComposableSingletons$DemoPantryPageHeaderKt.f13188i, ComposableSingletons$DemoPantryPageHeaderKt.f13189j, null, null, ComposableSingletons$DemoPantryPageHeaderKt.f13192n, sVar10, 100887606, 196);
                    s0.g(null, 0.0f, 0L, sVar10, 0, 7);
                    DemoPantryPageHeaderKt.b("Page - Full", sVar10, 6);
                    Object objM3 = sVar10.M();
                    if (objM3 == fVar) {
                        objM3 = new b(4);
                        sVar10.k0(objM3);
                    }
                    PagePantryPageHeaderKt.PagePantryPageHeader("Title", pageHeaderState, (Function0) objM3, null, "Supporting Text", PantryPageHeaderKt.BACK_CONTENT_DESCRIPTION, ComposableSingletons$DemoPantryPageHeaderKt.f13193o, null, ComposableSingletons$DemoPantryPageHeaderKt.f13194p, null, sVar10, 102457782, 648);
                    s0.g(null, 0.0f, 0L, sVar10, 0, 7);
                    DemoPantryPageHeaderKt.b("Page - Collapsed", sVar10, 6);
                    Object objM4 = sVar10.M();
                    if (objM4 == fVar) {
                        objM4 = new b(5);
                        sVar10.k0(objM4);
                    }
                    PagePantryPageHeaderKt.PagePantryPageHeader("Title", pageHeaderState2, (Function0) objM4, null, null, null, null, null, null, null, sVar10, 438, 1016);
                    s0.g(null, 0.0f, 0L, sVar10, 0, 7);
                    DemoPantryPageHeaderKt.b("Modal - Full", sVar10, 6);
                    Object objM5 = sVar10.M();
                    if (objM5 == fVar) {
                        objM5 = new b(i13);
                        sVar10.k0(objM5);
                    }
                    ModalPantryPageHeaderKt.ModalPantryPageHeader("Title", pageHeaderState, (Function0) objM5, null, ComposableSingletons$DemoPantryPageHeaderKt.f13195q, "Supporting Text", PantryPageHeaderKt.CLOSE_CONTENT_DESCRIPTION, sVar10, 1794486, 8);
                    s0.g(null, 0.0f, 0L, sVar10, 0, 7);
                    DemoPantryPageHeaderKt.b("Modal - Collapsed", sVar10, 6);
                    Object objM6 = sVar10.M();
                    if (objM6 == fVar) {
                        objM6 = new b(7);
                        sVar10.k0(objM6);
                    }
                    ModalPantryPageHeaderKt.ModalPantryPageHeader("Title", pageHeaderState2, (Function0) objM6, null, null, null, null, sVar10, 438, 120);
                    sVar10.q(true);
                } else {
                    sVar10.U();
                }
                break;
            case 10:
                n nVar11 = (n) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryPageHeaderKt composableSingletons$DemoPantryPageHeaderKt11 = ComposableSingletons$DemoPantryPageHeaderKt.INSTANCE;
                s sVar11 = (s) nVar11;
                if (sVar11.R(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    DemoPantryPageHeaderKt.a(R.drawable.close, sVar11, 0);
                } else {
                    sVar11.U();
                }
                break;
            case 11:
                n nVar12 = (n) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                ComposableSingletons$PantryPageHeaderDoc_figmaKt composableSingletons$PantryPageHeaderDoc_figmaKt = ComposableSingletons$PantryPageHeaderDoc_figmaKt.INSTANCE;
                s sVar12 = (s) nVar12;
                if (sVar12.R(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    PantryAvatarKt.PantryAvatar(null, null, "JM", null, AvatarVariant.Text, null, sVar12, 24960, 43);
                } else {
                    sVar12.U();
                }
                break;
            case 12:
                n nVar13 = (n) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                ComposableSingletons$PantryPageHeaderDoc_figmaKt composableSingletons$PantryPageHeaderDoc_figmaKt2 = ComposableSingletons$PantryPageHeaderDoc_figmaKt.INSTANCE;
                s sVar13 = (s) nVar13;
                if (sVar13.R(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    AccentPantryBadgeLabelKt.MediumAccentPantryBadgeLabel("Earn 100 DKK", null, null, null, null, sVar13, 6, 30);
                } else {
                    sVar13.U();
                }
                break;
            case 13:
                n nVar14 = (n) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                ComposableSingletons$PantryPageHeaderDoc_figmaKt composableSingletons$PantryPageHeaderDoc_figmaKt3 = ComposableSingletons$PantryPageHeaderDoc_figmaKt.INSTANCE;
                s sVar14 = (s) nVar14;
                if (sVar14.R(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    r9.d("Tab 1", null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, sVar14, 6, 0, 262142);
                } else {
                    sVar14.U();
                }
                break;
            case 14:
                n nVar15 = (n) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                ComposableSingletons$PantryPageHeaderDoc_figmaKt composableSingletons$PantryPageHeaderDoc_figmaKt4 = ComposableSingletons$PantryPageHeaderDoc_figmaKt.INSTANCE;
                s sVar15 = (s) nVar15;
                if (sVar15.R(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    r9.d("Tab 2", null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, sVar15, 6, 0, 262142);
                } else {
                    sVar15.U();
                }
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                n nVar16 = (n) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                ComposableSingletons$PantryPageHeaderDoc_figmaKt composableSingletons$PantryPageHeaderDoc_figmaKt5 = ComposableSingletons$PantryPageHeaderDoc_figmaKt.INSTANCE;
                s sVar16 = (s) nVar16;
                if (sVar16.R(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    Object objM7 = sVar16.M();
                    if (objM7 == fVar) {
                        objM7 = new b(9);
                        sVar16.k0(objM7);
                    }
                    k8.b(true, (Function0) objM7, null, false, ComposableSingletons$PantryPageHeaderDoc_figmaKt.f13203g, 0L, 0L, sVar16, 24630, 492);
                    Object objM8 = sVar16.M();
                    if (objM8 == fVar) {
                        objM8 = new b(10);
                        sVar16.k0(objM8);
                    }
                    k8.b(false, (Function0) objM8, null, false, ComposableSingletons$PantryPageHeaderDoc_figmaKt.f13204h, 0L, 0L, sVar16, 24630, 492);
                } else {
                    sVar16.U();
                }
                break;
            case 16:
                n nVar17 = (n) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                ComposableSingletons$PantryPageHeaderDoc_figmaKt composableSingletons$PantryPageHeaderDoc_figmaKt6 = ComposableSingletons$PantryPageHeaderDoc_figmaKt.INSTANCE;
                s sVar17 = (s) nVar17;
                if (sVar17.R(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    b9.b(null, 0L, 0L, null, null, ComposableSingletons$PantryPageHeaderDoc_figmaKt.f13205i, sVar17, 1572870);
                } else {
                    sVar17.U();
                }
                break;
            case 17:
                n nVar18 = (n) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                ComposableSingletons$PantryPageHeaderDoc_figmaKt composableSingletons$PantryPageHeaderDoc_figmaKt7 = ComposableSingletons$PantryPageHeaderDoc_figmaKt.INSTANCE;
                s sVar18 = (s) nVar18;
                if (sVar18.R(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.close, sVar18, 0), null, null, 0L, sVar18, 56, 12);
                } else {
                    sVar18.U();
                }
                break;
            case 18:
                n nVar19 = (n) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                ComposableSingletons$PantryPageHeaderDoc_figmaKt composableSingletons$PantryPageHeaderDoc_figmaKt8 = ComposableSingletons$PantryPageHeaderDoc_figmaKt.INSTANCE;
                s sVar19 = (s) nVar19;
                if (sVar19.R(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    Object objM9 = sVar19.M();
                    if (objM9 == fVar) {
                        objM9 = new b(8);
                        sVar19.k0(objM9);
                    }
                    SubtlePantryIconButtonKt.MediumSubtlePantryIconButton((Function0) objM9, null, null, false, false, ComposableSingletons$PantryPageHeaderDoc_figmaKt.f13207k, sVar19, 196614, 30);
                } else {
                    sVar19.U();
                }
                break;
            case 19:
                n nVar20 = (n) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                ComposableSingletons$PantryPageHeaderDoc_figmaKt composableSingletons$PantryPageHeaderDoc_figmaKt9 = ComposableSingletons$PantryPageHeaderDoc_figmaKt.INSTANCE;
                s sVar20 = (s) nVar20;
                if (sVar20.R(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    AccentPantryBadgeLabelKt.MediumAccentPantryBadgeLabel("Earn 100 DKK", null, null, null, null, sVar20, 6, 30);
                } else {
                    sVar20.U();
                }
                break;
            case 20:
                n nVar21 = (n) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                ComposableSingletons$PantryPageHeaderDoc_figmaKt composableSingletons$PantryPageHeaderDoc_figmaKt10 = ComposableSingletons$PantryPageHeaderDoc_figmaKt.INSTANCE;
                s sVar21 = (s) nVar21;
                if (sVar21.R(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.arrow_left, sVar21, 0), null, null, 0L, sVar21, 56, 12);
                } else {
                    sVar21.U();
                }
                break;
            case 21:
                n nVar22 = (n) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                ComposableSingletons$PantryPageHeaderDoc_figmaKt composableSingletons$PantryPageHeaderDoc_figmaKt11 = ComposableSingletons$PantryPageHeaderDoc_figmaKt.INSTANCE;
                s sVar22 = (s) nVar22;
                if (sVar22.R(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    Object objM10 = sVar22.M();
                    if (objM10 == fVar) {
                        objM10 = new b(13);
                        sVar22.k0(objM10);
                    }
                    SubtlePantryIconButtonKt.MediumSubtlePantryIconButton((Function0) objM10, null, PantryPageHeaderKt.BACK_CONTENT_DESCRIPTION, false, false, ComposableSingletons$PantryPageHeaderDoc_figmaKt.f13209n, sVar22, 196998, 26);
                } else {
                    sVar22.U();
                }
                break;
            case 22:
                n nVar23 = (n) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                ComposableSingletons$PantryPageHeaderDoc_figmaKt composableSingletons$PantryPageHeaderDoc_figmaKt12 = ComposableSingletons$PantryPageHeaderDoc_figmaKt.INSTANCE;
                s sVar23 = (s) nVar23;
                if (sVar23.R(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.close, sVar23, 0), null, null, 0L, sVar23, 56, 12);
                } else {
                    sVar23.U();
                }
                break;
            case 23:
                n nVar24 = (n) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                ComposableSingletons$PantryPageHeaderDoc_figmaKt composableSingletons$PantryPageHeaderDoc_figmaKt13 = ComposableSingletons$PantryPageHeaderDoc_figmaKt.INSTANCE;
                s sVar24 = (s) nVar24;
                if (sVar24.R(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    Object objM11 = sVar24.M();
                    if (objM11 == fVar) {
                        objM11 = new b(11);
                        sVar24.k0(objM11);
                    }
                    SubtlePantryIconButtonKt.MediumSubtlePantryIconButton((Function0) objM11, null, null, false, false, ComposableSingletons$PantryPageHeaderDoc_figmaKt.f13198b, sVar24, 196614, 30);
                } else {
                    sVar24.U();
                }
                break;
            case 24:
                n nVar25 = (n) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                ComposableSingletons$PantryPageHeaderDoc_figmaKt composableSingletons$PantryPageHeaderDoc_figmaKt14 = ComposableSingletons$PantryPageHeaderDoc_figmaKt.INSTANCE;
                s sVar25 = (s) nVar25;
                if (sVar25.R(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.plus, sVar25, 0), null, null, 0L, sVar25, 56, 12);
                } else {
                    sVar25.U();
                }
                break;
            case 25:
                n nVar26 = (n) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                ComposableSingletons$PantryPageHeaderDoc_figmaKt composableSingletons$PantryPageHeaderDoc_figmaKt15 = ComposableSingletons$PantryPageHeaderDoc_figmaKt.INSTANCE;
                s sVar26 = (s) nVar26;
                if (sVar26.R(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    Object objM12 = sVar26.M();
                    if (objM12 == fVar) {
                        objM12 = new b(12);
                        sVar26.k0(objM12);
                    }
                    SubtlePantryIconButtonKt.MediumSubtlePantryIconButton((Function0) objM12, null, null, false, false, ComposableSingletons$PantryPageHeaderDoc_figmaKt.f13200d, sVar26, 196614, 30);
                } else {
                    sVar26.U();
                }
                break;
            case 26:
                n nVar27 = (n) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                ComposableSingletons$PantryPageHeaderKt composableSingletons$PantryPageHeaderKt = ComposableSingletons$PantryPageHeaderKt.INSTANCE;
                s sVar27 = (s) nVar27;
                if (sVar27.R(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.arrow_left, sVar27, 0), null, null, 0L, sVar27, 56, 12);
                } else {
                    sVar27.U();
                }
                break;
            case 27:
                n nVar28 = (n) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                ComposableSingletons$PantryPageHeaderKt composableSingletons$PantryPageHeaderKt2 = ComposableSingletons$PantryPageHeaderKt.INSTANCE;
                s sVar28 = (s) nVar28;
                if (sVar28.R(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.close, sVar28, 0), null, null, 0L, sVar28, 56, 12);
                } else {
                    sVar28.U();
                }
                break;
            case 28:
                n nVar29 = (n) obj;
                int iIntValue29 = ((Integer) obj2).intValue();
                ComposableSingletons$PantryPageHeaderKt composableSingletons$PantryPageHeaderKt3 = ComposableSingletons$PantryPageHeaderKt.INSTANCE;
                s sVar29 = (s) nVar29;
                if (sVar29.R(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    PantryAvatarKt.PantryAvatar(null, null, "JM", null, AvatarVariant.Text, null, sVar29, 24960, 43);
                } else {
                    sVar29.U();
                }
                break;
            default:
                n nVar30 = (n) obj;
                int iIntValue30 = ((Integer) obj2).intValue();
                ComposableSingletons$PantryPageHeaderKt composableSingletons$PantryPageHeaderKt4 = ComposableSingletons$PantryPageHeaderKt.INSTANCE;
                s sVar30 = (s) nVar30;
                if (sVar30.R(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.close, sVar30, 0), null, null, 0L, sVar30, 56, 12);
                } else {
                    sVar30.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}
