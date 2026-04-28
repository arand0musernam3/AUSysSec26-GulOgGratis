package s60;

import b4.q;
import b4.t;
import b5.h;
import b5.j;
import com.app.tgtg.R;
import com.tgtg.componentlibrary.component.avatar.PantryAvatarKt;
import com.tgtg.componentlibrary.component.avatar.model.AvatarVariant;
import com.tgtg.componentlibrary.component.badgelabel.variant.AccentPantryBadgeLabelKt;
import com.tgtg.componentlibrary.component.iconbutton.variant.SubtlePantryIconButtonKt;
import com.tgtg.componentlibrary.component.pageheader.ComposableSingletons$PantryPageHeaderKt;
import com.tgtg.componentlibrary.component.pageheader.PantryPageHeaderKt;
import com.tgtg.componentlibrary.component.pageheader.model.PageHeaderState;
import com.tgtg.componentlibrary.component.pageheader.model.PageHeaderVariant;
import com.tgtg.componentlibrary.component.pageheader.variant.ComposableSingletons$GlobalPantryPageHeaderKt;
import com.tgtg.componentlibrary.component.pageheader.variant.ComposableSingletons$ModalPantryPageHeaderKt;
import com.tgtg.componentlibrary.component.pageheader.variant.ComposableSingletons$PagePantryPageHeaderKt;
import com.tgtg.componentlibrary.component.pageheader.variant.GlobalPantryPageHeaderKt;
import com.tgtg.componentlibrary.component.pageheader.variant.ModalPantryPageHeaderKt;
import com.tgtg.componentlibrary.component.pageheader.variant.PagePantryPageHeaderKt;
import com.tgtg.componentlibrary.component.radiobutton.ComposableSingletons$DemoPantryRadioButtonKt;
import com.tgtg.componentlibrary.component.radiobutton.PantryRadioButtonKt;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.i;
import d2.w;
import d2.y;
import g3.b0;
import g3.b9;
import g3.i2;
import g3.k8;
import g3.r9;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import lv.v;
import m3.b1;
import m3.f;
import m3.m;
import m3.n;
import m3.s;
import m5.u0;
import o00.x0;
import o30.f0;
import org.bouncycastle.iana.AEADAlgorithm;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import sr.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38861a;

    public /* synthetic */ c(int i11) {
        this.f38861a = 23;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f38861a;
        int i12 = 16;
        int i13 = 15;
        int i14 = 18;
        int i15 = 17;
        q qVar = q.f5711a;
        f fVar = m.f29332a;
        switch (i11) {
            case 0:
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ComposableSingletons$PantryPageHeaderKt composableSingletons$PantryPageHeaderKt = ComposableSingletons$PantryPageHeaderKt.INSTANCE;
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objM = sVar.M();
                    if (objM == fVar) {
                        objM = new b(20);
                        sVar.k0(objM);
                    }
                    SubtlePantryIconButtonKt.MediumSubtlePantryIconButton((Function0) objM, null, null, false, false, ComposableSingletons$PantryPageHeaderKt.f13214d, sVar, 196614, 30);
                } else {
                    sVar.U();
                }
                break;
            case 1:
                n nVar2 = (n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ComposableSingletons$PantryPageHeaderKt composableSingletons$PantryPageHeaderKt2 = ComposableSingletons$PantryPageHeaderKt.INSTANCE;
                s sVar2 = (s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.plus, sVar2, 0), null, null, 0L, sVar2, 56, 12);
                } else {
                    sVar2.U();
                }
                break;
            case 2:
                n nVar3 = (n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ComposableSingletons$PantryPageHeaderKt composableSingletons$PantryPageHeaderKt3 = ComposableSingletons$PantryPageHeaderKt.INSTANCE;
                s sVar3 = (s) nVar3;
                if (sVar3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    Object objM2 = sVar3.M();
                    if (objM2 == fVar) {
                        objM2 = new b(21);
                        sVar3.k0(objM2);
                    }
                    SubtlePantryIconButtonKt.MediumSubtlePantryIconButton((Function0) objM2, null, null, false, false, ComposableSingletons$PantryPageHeaderKt.f13216f, sVar3, 196614, 30);
                } else {
                    sVar3.U();
                }
                break;
            case 3:
                n nVar4 = (n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                ComposableSingletons$PantryPageHeaderKt composableSingletons$PantryPageHeaderKt4 = ComposableSingletons$PantryPageHeaderKt.INSTANCE;
                s sVar4 = (s) nVar4;
                if (sVar4.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    AccentPantryBadgeLabelKt.MediumAccentPantryBadgeLabel("Earn 100 DKK", null, null, null, null, sVar4, 6, 30);
                } else {
                    sVar4.U();
                }
                break;
            case 4:
                n nVar5 = (n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                ComposableSingletons$PantryPageHeaderKt composableSingletons$PantryPageHeaderKt5 = ComposableSingletons$PantryPageHeaderKt.INSTANCE;
                s sVar5 = (s) nVar5;
                if (sVar5.R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    r9.d("Tab 1", null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, sVar5, 6, 0, 262142);
                } else {
                    sVar5.U();
                }
                break;
            case 5:
                n nVar6 = (n) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                ComposableSingletons$PantryPageHeaderKt composableSingletons$PantryPageHeaderKt6 = ComposableSingletons$PantryPageHeaderKt.INSTANCE;
                s sVar6 = (s) nVar6;
                if (sVar6.R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    r9.d("Tab 2", null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, sVar6, 6, 0, 262142);
                } else {
                    sVar6.U();
                }
                break;
            case 6:
                n nVar7 = (n) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                ComposableSingletons$PantryPageHeaderKt composableSingletons$PantryPageHeaderKt7 = ComposableSingletons$PantryPageHeaderKt.INSTANCE;
                s sVar7 = (s) nVar7;
                if (sVar7.R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    Object objM3 = sVar7.M();
                    if (objM3 == fVar) {
                        objM3 = new b(i13);
                        sVar7.k0(objM3);
                    }
                    k8.b(true, (Function0) objM3, null, false, ComposableSingletons$PantryPageHeaderKt.f13219i, 0L, 0L, sVar7, 24630, 492);
                    Object objM4 = sVar7.M();
                    if (objM4 == fVar) {
                        objM4 = new b(i12);
                        sVar7.k0(objM4);
                    }
                    k8.b(false, (Function0) objM4, null, false, ComposableSingletons$PantryPageHeaderKt.f13220j, 0L, 0L, sVar7, 24630, 492);
                } else {
                    sVar7.U();
                }
                break;
            case 7:
                n nVar8 = (n) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                ComposableSingletons$PantryPageHeaderKt composableSingletons$PantryPageHeaderKt8 = ComposableSingletons$PantryPageHeaderKt.INSTANCE;
                s sVar8 = (s) nVar8;
                if (sVar8.R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    b9.b(null, 0L, 0L, null, null, ComposableSingletons$PantryPageHeaderKt.f13221k, sVar8, 1572870);
                } else {
                    sVar8.U();
                }
                break;
            case 8:
                n nVar9 = (n) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                ComposableSingletons$PantryPageHeaderKt composableSingletons$PantryPageHeaderKt9 = ComposableSingletons$PantryPageHeaderKt.INSTANCE;
                s sVar9 = (s) nVar9;
                if (sVar9.R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    PageHeaderVariant pageHeaderVariant = PageHeaderVariant.Page;
                    PageHeaderState pageHeaderState = PageHeaderState.Full;
                    Object objM5 = sVar9.M();
                    if (objM5 == fVar) {
                        objM5 = new b(14);
                        sVar9.k0(objM5);
                    }
                    PantryPageHeaderKt.PantryPageHeader("Title", pageHeaderVariant, pageHeaderState, null, "Supporting text", (Function0) objM5, null, ComposableSingletons$PantryPageHeaderKt.f13213c, null, null, ComposableSingletons$PantryPageHeaderKt.f13215e, ComposableSingletons$PantryPageHeaderKt.f13217g, ComposableSingletons$PantryPageHeaderKt.f13218h, ComposableSingletons$PantryPageHeaderKt.l, sVar9, 12804534, 3510, 840);
                } else {
                    sVar9.U();
                }
                break;
            case 9:
                n nVar10 = (n) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                ComposableSingletons$PantryPageHeaderKt composableSingletons$PantryPageHeaderKt10 = ComposableSingletons$PantryPageHeaderKt.INSTANCE;
                s sVar10 = (s) nVar10;
                if (sVar10.R(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    PantryAvatarKt.PantryAvatar(null, null, "JM", null, AvatarVariant.Text, null, sVar10, 24960, 43);
                } else {
                    sVar10.U();
                }
                break;
            case 10:
                n nVar11 = (n) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                ComposableSingletons$PantryPageHeaderKt composableSingletons$PantryPageHeaderKt11 = ComposableSingletons$PantryPageHeaderKt.INSTANCE;
                s sVar11 = (s) nVar11;
                if (sVar11.R(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    r9.d("Tab 1", null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, sVar11, 6, 0, 262142);
                } else {
                    sVar11.U();
                }
                break;
            case 11:
                n nVar12 = (n) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                ComposableSingletons$PantryPageHeaderKt composableSingletons$PantryPageHeaderKt12 = ComposableSingletons$PantryPageHeaderKt.INSTANCE;
                s sVar12 = (s) nVar12;
                if (sVar12.R(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    r9.d("Tab 2", null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, sVar12, 6, 0, 262142);
                } else {
                    sVar12.U();
                }
                break;
            case 12:
                n nVar13 = (n) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                ComposableSingletons$PantryPageHeaderKt composableSingletons$PantryPageHeaderKt13 = ComposableSingletons$PantryPageHeaderKt.INSTANCE;
                s sVar13 = (s) nVar13;
                if (sVar13.R(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    Object objM6 = sVar13.M();
                    if (objM6 == fVar) {
                        objM6 = new b(i14);
                        sVar13.k0(objM6);
                    }
                    k8.b(true, (Function0) objM6, null, false, ComposableSingletons$PantryPageHeaderKt.f13224o, 0L, 0L, sVar13, 24630, 492);
                    Object objM7 = sVar13.M();
                    if (objM7 == fVar) {
                        objM7 = new b(19);
                        sVar13.k0(objM7);
                    }
                    k8.b(false, (Function0) objM7, null, false, ComposableSingletons$PantryPageHeaderKt.f13225p, 0L, 0L, sVar13, 24630, 492);
                } else {
                    sVar13.U();
                }
                break;
            case 13:
                n nVar14 = (n) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                ComposableSingletons$PantryPageHeaderKt composableSingletons$PantryPageHeaderKt14 = ComposableSingletons$PantryPageHeaderKt.INSTANCE;
                s sVar14 = (s) nVar14;
                if (sVar14.R(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    b9.b(null, 0L, 0L, null, null, ComposableSingletons$PantryPageHeaderKt.f13226q, sVar14, 1572870);
                } else {
                    sVar14.U();
                }
                break;
            case 14:
                n nVar15 = (n) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                ComposableSingletons$PantryPageHeaderKt composableSingletons$PantryPageHeaderKt15 = ComposableSingletons$PantryPageHeaderKt.INSTANCE;
                s sVar15 = (s) nVar15;
                if (sVar15.R(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    PageHeaderVariant pageHeaderVariant2 = PageHeaderVariant.Page;
                    PageHeaderState pageHeaderState2 = PageHeaderState.Collapsed;
                    Object objM8 = sVar15.M();
                    if (objM8 == fVar) {
                        objM8 = new b(i15);
                        sVar15.k0(objM8);
                    }
                    PantryPageHeaderKt.PantryPageHeader("Title", pageHeaderVariant2, pageHeaderState2, null, "Supporting text", (Function0) objM8, null, ComposableSingletons$PantryPageHeaderKt.f13223n, null, null, null, null, null, ComposableSingletons$PantryPageHeaderKt.f13227r, sVar15, 12804534, 3072, 8008);
                } else {
                    sVar15.U();
                }
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                n nVar16 = (n) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                s sVar16 = (s) nVar16;
                if (!sVar16.R(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    sVar16.U();
                }
                break;
            case 16:
                n nVar17 = (n) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                ComposableSingletons$GlobalPantryPageHeaderKt composableSingletons$GlobalPantryPageHeaderKt = ComposableSingletons$GlobalPantryPageHeaderKt.INSTANCE;
                s sVar17 = (s) nVar17;
                if (sVar17.R(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    PantryAvatarKt.PantryAvatar(null, null, "JM", null, AvatarVariant.Text, null, sVar17, 24960, 43);
                } else {
                    sVar17.U();
                }
                break;
            case 17:
                n nVar18 = (n) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                ComposableSingletons$GlobalPantryPageHeaderKt composableSingletons$GlobalPantryPageHeaderKt2 = ComposableSingletons$GlobalPantryPageHeaderKt.INSTANCE;
                s sVar18 = (s) nVar18;
                if (sVar18.R(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    PantryAvatarKt.PantryAvatar(null, null, "JM", null, AvatarVariant.Text, null, sVar18, 24960, 43);
                } else {
                    sVar18.U();
                }
                break;
            case 18:
                n nVar19 = (n) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                ComposableSingletons$GlobalPantryPageHeaderKt composableSingletons$GlobalPantryPageHeaderKt3 = ComposableSingletons$GlobalPantryPageHeaderKt.INSTANCE;
                s sVar19 = (s) nVar19;
                if (sVar19.R(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    x60.m mVar = (x60.m) sVar19.j(PantryThemeKt.getLocalPantrySpacing());
                    t tVarZ = d2.c.z(qVar, mVar.f44015k);
                    d2.b bVar = i.f13801a;
                    y yVarA = w.a(i.g(mVar.l), b4.d.f5694m, sVar19, 0);
                    int iHashCode = Long.hashCode(sVar19.T);
                    u3.i iVarL = sVar19.l();
                    t tVarC = b4.a.c(tVarZ, sVar19);
                    j.R.getClass();
                    h hVar = b5.i.f5839b;
                    sVar19.e0();
                    if (sVar19.S) {
                        sVar19.k(hVar);
                    } else {
                        sVar19.n0();
                    }
                    m3.i.C(yVarA, b5.i.f5843f, sVar19);
                    m3.i.C(iVarL, b5.i.f5842e, sVar19);
                    m3.i.v(sVar19, Integer.valueOf(iHashCode), b5.i.f5844g);
                    m3.i.z(sVar19, b5.i.f5845h);
                    m3.i.C(tVarC, b5.i.f5841d, sVar19);
                    GlobalPantryPageHeaderKt.GlobalPantryPageHeader("Title", PageHeaderState.Full, null, null, ComposableSingletons$GlobalPantryPageHeaderKt.f13243a, null, null, null, null, sVar19, 24630, 492);
                    GlobalPantryPageHeaderKt.GlobalPantryPageHeader("Title", PageHeaderState.Collapsed, null, null, ComposableSingletons$GlobalPantryPageHeaderKt.f13244b, null, null, null, null, sVar19, 24630, 492);
                    sVar19.q(true);
                } else {
                    sVar19.U();
                }
                break;
            case 19:
                n nVar20 = (n) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                ComposableSingletons$ModalPantryPageHeaderKt composableSingletons$ModalPantryPageHeaderKt = ComposableSingletons$ModalPantryPageHeaderKt.INSTANCE;
                s sVar20 = (s) nVar20;
                if (sVar20.R(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    x60.m mVar2 = (x60.m) sVar20.j(PantryThemeKt.getLocalPantrySpacing());
                    t tVarZ2 = d2.c.z(qVar, mVar2.f44015k);
                    d2.b bVar2 = i.f13801a;
                    y yVarA2 = w.a(i.g(mVar2.l), b4.d.f5694m, sVar20, 0);
                    int iHashCode2 = Long.hashCode(sVar20.T);
                    u3.i iVarL2 = sVar20.l();
                    t tVarC2 = b4.a.c(tVarZ2, sVar20);
                    j.R.getClass();
                    h hVar2 = b5.i.f5839b;
                    sVar20.e0();
                    if (sVar20.S) {
                        sVar20.k(hVar2);
                    } else {
                        sVar20.n0();
                    }
                    m3.i.C(yVarA2, b5.i.f5843f, sVar20);
                    m3.i.C(iVarL2, b5.i.f5842e, sVar20);
                    m3.i.v(sVar20, Integer.valueOf(iHashCode2), b5.i.f5844g);
                    m3.i.z(sVar20, b5.i.f5845h);
                    m3.i.C(tVarC2, b5.i.f5841d, sVar20);
                    PageHeaderState pageHeaderState3 = PageHeaderState.Full;
                    Object objM9 = sVar20.M();
                    if (objM9 == fVar) {
                        objM9 = new r(i13);
                        sVar20.k0(objM9);
                    }
                    ModalPantryPageHeaderKt.ModalPantryPageHeader("Title", pageHeaderState3, (Function0) objM9, null, null, null, null, sVar20, 438, 120);
                    PageHeaderState pageHeaderState4 = PageHeaderState.Collapsed;
                    Object objM10 = sVar20.M();
                    if (objM10 == fVar) {
                        objM10 = new r(i12);
                        sVar20.k0(objM10);
                    }
                    ModalPantryPageHeaderKt.ModalPantryPageHeader("Title", pageHeaderState4, (Function0) objM10, null, null, null, null, sVar20, 438, 120);
                    sVar20.q(true);
                } else {
                    sVar20.U();
                }
                break;
            case 20:
                n nVar21 = (n) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                ComposableSingletons$PagePantryPageHeaderKt composableSingletons$PagePantryPageHeaderKt = ComposableSingletons$PagePantryPageHeaderKt.INSTANCE;
                s sVar21 = (s) nVar21;
                if (sVar21.R(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    x60.m mVar3 = (x60.m) sVar21.j(PantryThemeKt.getLocalPantrySpacing());
                    t tVarZ3 = d2.c.z(qVar, mVar3.f44015k);
                    d2.b bVar3 = i.f13801a;
                    y yVarA3 = w.a(i.g(mVar3.l), b4.d.f5694m, sVar21, 0);
                    int iHashCode3 = Long.hashCode(sVar21.T);
                    u3.i iVarL3 = sVar21.l();
                    t tVarC3 = b4.a.c(tVarZ3, sVar21);
                    j.R.getClass();
                    h hVar3 = b5.i.f5839b;
                    sVar21.e0();
                    if (sVar21.S) {
                        sVar21.k(hVar3);
                    } else {
                        sVar21.n0();
                    }
                    m3.i.C(yVarA3, b5.i.f5843f, sVar21);
                    m3.i.C(iVarL3, b5.i.f5842e, sVar21);
                    m3.i.v(sVar21, Integer.valueOf(iHashCode3), b5.i.f5844g);
                    m3.i.z(sVar21, b5.i.f5845h);
                    m3.i.C(tVarC3, b5.i.f5841d, sVar21);
                    PageHeaderState pageHeaderState5 = PageHeaderState.Full;
                    Object objM11 = sVar21.M();
                    if (objM11 == fVar) {
                        objM11 = new r(i15);
                        sVar21.k0(objM11);
                    }
                    PagePantryPageHeaderKt.PagePantryPageHeader("Title", pageHeaderState5, (Function0) objM11, null, null, null, null, null, null, null, sVar21, 438, 1016);
                    PageHeaderState pageHeaderState6 = PageHeaderState.Collapsed;
                    Object objM12 = sVar21.M();
                    if (objM12 == fVar) {
                        objM12 = new r(i14);
                        sVar21.k0(objM12);
                    }
                    PagePantryPageHeaderKt.PagePantryPageHeader("Title", pageHeaderState6, (Function0) objM12, null, null, null, null, null, null, null, sVar21, 438, 1016);
                    sVar21.q(true);
                } else {
                    sVar21.U();
                }
                break;
            case 21:
                n nVar22 = (n) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                s sVar22 = (s) nVar22;
                if (!sVar22.R(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    sVar22.U();
                }
                break;
            case 22:
                n nVar23 = (n) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                s sVar23 = (s) nVar23;
                if (!sVar23.R(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    sVar23.U();
                }
                break;
            case 23:
                ((Integer) obj2).getClass();
                x0.d((n) obj, m3.i.F(1));
                break;
            case 24:
                n nVar24 = (n) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                s sVar24 = (s) nVar24;
                if (sVar24.R(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    r9.d(f0.U(sVar24, R.string.post_purchase_add_email_hint_text), null, lv.s.E, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28274n, sVar24, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                } else {
                    sVar24.U();
                }
                break;
            case 25:
                n nVar25 = (n) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                s sVar25 = (s) nVar25;
                if (sVar25.R(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    r9.d(f0.U(sVar25, R.string.station_picker_search_by_hint), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0.a(v.f28274n, lv.s.E, 0L, null, null, 0L, null, 3, 0L, null, null, 16744446), sVar25, 0, 0, 131070);
                } else {
                    sVar25.U();
                }
                break;
            case 26:
                n nVar26 = (n) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                s sVar26 = (s) nVar26;
                if (sVar26.R(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    v1.n.d(x0.z(R.drawable.system_icon_search_neutral_60, sVar26, 0), null, null, null, null, 0.0f, null, sVar26, 56, 124);
                } else {
                    sVar26.U();
                }
                break;
            case 27:
                n nVar27 = (n) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryRadioButtonKt composableSingletons$DemoPantryRadioButtonKt = ComposableSingletons$DemoPantryRadioButtonKt.INSTANCE;
                s sVar27 = (s) nVar27;
                if (sVar27.R(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    Object objM13 = sVar27.M();
                    if (objM13 == fVar) {
                        objM13 = m3.i.w(Boolean.TRUE);
                        sVar27.k0(objM13);
                    }
                    b1 b1Var = (b1) objM13;
                    boolean zBooleanValue = ((Boolean) b1Var.component1()).booleanValue();
                    Function1 function1Component2 = b1Var.component2();
                    boolean zF = sVar27.f(function1Component2) | sVar27.g(zBooleanValue);
                    Object objM14 = sVar27.M();
                    if (zF || objM14 == fVar) {
                        objM14 = new b0(function1Component2, zBooleanValue, 13);
                        sVar27.k0(objM14);
                    }
                    PantryRadioButtonKt.PantryRadioButton(zBooleanValue, (Function0) objM14, null, true, sVar27, 3072, 4);
                } else {
                    sVar27.U();
                }
                break;
            case 28:
                n nVar28 = (n) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryRadioButtonKt composableSingletons$DemoPantryRadioButtonKt2 = ComposableSingletons$DemoPantryRadioButtonKt.INSTANCE;
                s sVar28 = (s) nVar28;
                if (sVar28.R(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    Object objM15 = sVar28.M();
                    if (objM15 == fVar) {
                        objM15 = m3.i.w(Boolean.FALSE);
                        sVar28.k0(objM15);
                    }
                    b1 b1Var2 = (b1) objM15;
                    boolean zBooleanValue2 = ((Boolean) b1Var2.component1()).booleanValue();
                    Function1 function1Component22 = b1Var2.component2();
                    boolean zF2 = sVar28.f(function1Component22) | sVar28.g(zBooleanValue2);
                    Object objM16 = sVar28.M();
                    if (zF2 || objM16 == fVar) {
                        objM16 = new b0(function1Component22, zBooleanValue2, 12);
                        sVar28.k0(objM16);
                    }
                    PantryRadioButtonKt.PantryRadioButton(zBooleanValue2, (Function0) objM16, null, true, sVar28, 3072, 4);
                } else {
                    sVar28.U();
                }
                break;
            default:
                n nVar29 = (n) obj;
                int iIntValue29 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryRadioButtonKt composableSingletons$DemoPantryRadioButtonKt3 = ComposableSingletons$DemoPantryRadioButtonKt.INSTANCE;
                s sVar29 = (s) nVar29;
                if (sVar29.R(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    Object objM17 = sVar29.M();
                    if (objM17 == fVar) {
                        objM17 = new tr.e(22);
                        sVar29.k0(objM17);
                    }
                    PantryRadioButtonKt.PantryRadioButton(true, (Function0) objM17, null, false, sVar29, 3126, 4);
                } else {
                    sVar29.U();
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ c(int i11, byte b8) {
        this.f38861a = i11;
    }
}
