package o60;

import b4.q;
import b4.t;
import b5.h;
import b5.j;
import com.app.tgtg.R;
import com.tgtg.componentlibrary.component.avatar.model.AvatarSize;
import com.tgtg.componentlibrary.component.avatar.variant.PantryAvatarIllustrationKt;
import com.tgtg.componentlibrary.component.chip.type.selectionchip.ComposableSingletons$DemoSelectionChipKt;
import com.tgtg.componentlibrary.component.chip.type.selectionchip.ComposableSingletons$PantrySelectionChipKt;
import com.tgtg.componentlibrary.component.chip.type.selectionchip.DemoSelectionChipKt;
import com.tgtg.componentlibrary.component.chip.type.selectionchip.variant.AvatarSelectionChipKt;
import com.tgtg.componentlibrary.component.chip.type.selectionchip.variant.ComposableSingletons$AvatarSelectionChipKt;
import com.tgtg.componentlibrary.component.chip.type.selectionchip.variant.ComposableSingletons$IconSelectionChipKt;
import com.tgtg.componentlibrary.component.chip.type.selectionchip.variant.IconSelectionChipKt;
import com.tgtg.componentlibrary.component.chip.type.selectionchip.variant.TextOnlySelectionChipKt;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.b;
import d2.c;
import d2.i;
import d2.w;
import d2.y;
import g3.i2;
import g3.r9;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m3.f;
import m3.m;
import m3.n;
import m3.s;
import n90.p;
import o00.x0;
import o30.f0;
import o60.a;
import org.bouncycastle.iana.AEADAlgorithm;
import org.jetbrains.annotations.NotNull;
import u3.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32039a;

    public /* synthetic */ a(int i11) {
        this.f32039a = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f32039a;
        f fVar = m.f29332a;
        q qVar = q.f5711a;
        switch (i11) {
            case 0:
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ComposableSingletons$DemoSelectionChipKt composableSingletons$DemoSelectionChipKt = ComposableSingletons$DemoSelectionChipKt.INSTANCE;
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    r9.d("Icon", null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, sVar, 6, 0, 262142);
                } else {
                    sVar.U();
                }
                break;
            case 1:
                n nVar2 = (n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoSelectionChipKt composableSingletons$DemoSelectionChipKt2 = ComposableSingletons$DemoSelectionChipKt.INSTANCE;
                s sVar2 = (s) nVar2;
                if (!sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    sVar2.U();
                }
                break;
            case 2:
                n nVar3 = (n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoSelectionChipKt composableSingletons$DemoSelectionChipKt3 = ComposableSingletons$DemoSelectionChipKt.INSTANCE;
                s sVar3 = (s) nVar3;
                if (sVar3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    r9.d("Avatar", null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, sVar3, 6, 0, 262142);
                } else {
                    sVar3.U();
                }
                break;
            case 3:
                n nVar4 = (n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoSelectionChipKt composableSingletons$DemoSelectionChipKt4 = ComposableSingletons$DemoSelectionChipKt.INSTANCE;
                s sVar4 = (s) nVar4;
                if (sVar4.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    DemoSelectionChipKt.DemoSelectionChip(sVar4, 0);
                } else {
                    sVar4.U();
                }
                break;
            case 4:
                n nVar5 = (n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoSelectionChipKt composableSingletons$DemoSelectionChipKt5 = ComposableSingletons$DemoSelectionChipKt.INSTANCE;
                s sVar5 = (s) nVar5;
                if (sVar5.R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    DemoSelectionChipKt.DemoSelectionChip(sVar5, 0);
                } else {
                    sVar5.U();
                }
                break;
            case 5:
                n nVar6 = (n) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoSelectionChipKt composableSingletons$DemoSelectionChipKt6 = ComposableSingletons$DemoSelectionChipKt.INSTANCE;
                s sVar6 = (s) nVar6;
                if (sVar6.R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    PantryAvatarIllustrationKt.PantryAvatarIllustration(ComposableSingletons$DemoSelectionChipKt.f13107b, null, "Illustration", AvatarSize.Small, sVar6, 3462, 2);
                } else {
                    sVar6.U();
                }
                break;
            case 6:
                n nVar7 = (n) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoSelectionChipKt composableSingletons$DemoSelectionChipKt7 = ComposableSingletons$DemoSelectionChipKt.INSTANCE;
                s sVar7 = (s) nVar7;
                if (sVar7.R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.check, sVar7, 0), null, null, 0L, sVar7, 56, 12);
                } else {
                    sVar7.U();
                }
                break;
            case 7:
                n nVar8 = (n) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoSelectionChipKt composableSingletons$DemoSelectionChipKt8 = ComposableSingletons$DemoSelectionChipKt.INSTANCE;
                s sVar8 = (s) nVar8;
                if (sVar8.R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    PantryAvatarIllustrationKt.PantryAvatarIllustration(ComposableSingletons$DemoSelectionChipKt.f13110e, null, "Illustration", AvatarSize.Small, sVar8, 3462, 2);
                } else {
                    sVar8.U();
                }
                break;
            case 8:
                n nVar9 = (n) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                ComposableSingletons$PantrySelectionChipKt composableSingletons$PantrySelectionChipKt = new Object() { // from class: com.tgtg.componentlibrary.component.chip.type.selectionchip.ComposableSingletons$PantrySelectionChipKt

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final d f13119a = new d(new a(8), false, 904943638);

                    @NotNull
                    public final Function2<n, Integer, Unit> getLambda$904943638$app_release() {
                        return f13119a;
                    }
                };
                s sVar9 = (s) nVar9;
                if (sVar9.R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x60.m mVar = (x60.m) sVar9.j(PantryThemeKt.getLocalPantrySpacing());
                    t tVarZ = c.z(qVar, mVar.f44015k);
                    b bVar = i.f13801a;
                    y yVarA = w.a(i.g(mVar.l), b4.d.f5694m, sVar9, 0);
                    int iHashCode = Long.hashCode(sVar9.T);
                    u3.i iVarL = sVar9.l();
                    t tVarC = b4.a.c(tVarZ, sVar9);
                    j.R.getClass();
                    h hVar = b5.i.f5839b;
                    sVar9.e0();
                    if (sVar9.S) {
                        sVar9.k(hVar);
                    } else {
                        sVar9.n0();
                    }
                    m3.i.C(yVarA, b5.i.f5843f, sVar9);
                    m3.i.C(iVarL, b5.i.f5842e, sVar9);
                    m3.i.v(sVar9, Integer.valueOf(iHashCode), b5.i.f5844g);
                    m3.i.z(sVar9, b5.i.f5845h);
                    m3.i.C(tVarC, b5.i.f5841d, sVar9);
                    TextOnlySelectionChipKt.PreviewTextOnlySelectionChip(sVar9, 0);
                    IconSelectionChipKt.PreviewIconSelectionChip(sVar9, 0);
                    AvatarSelectionChipKt.PreviewAvatarSelectionChip(sVar9, 0);
                    sVar9.q(true);
                } else {
                    sVar9.U();
                }
                break;
            case 9:
                n nVar10 = (n) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                s sVar10 = (s) nVar10;
                if (!sVar10.R(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    sVar10.U();
                }
                break;
            case 10:
                n nVar11 = (n) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                s sVar11 = (s) nVar11;
                if (sVar11.R(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    v1.n.d(x0.z(R.drawable.system_icon_arrow_back_neutral_80, sVar11, 0), f0.U(sVar11, R.string.voice_over_back), null, null, null, 0.0f, null, sVar11, 8, 124);
                } else {
                    sVar11.U();
                }
                break;
            case 11:
                n nVar12 = (n) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                s sVar12 = (s) nVar12;
                if (!sVar12.R(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    sVar12.U();
                }
                break;
            case 12:
                ((Integer) obj2).getClass();
                oo.a.J((n) obj, m3.i.F(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                oo.a.B((n) obj, m3.i.F(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                oo.a.h((n) obj, m3.i.F(1));
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                ((Integer) obj2).getClass();
                oo.a.a((n) obj, m3.i.F(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                oo.a.N((n) obj, m3.i.F(1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                oo.a.o((n) obj, m3.i.F(1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                oo.a.p((n) obj, m3.i.F(1));
                break;
            case 19:
                n nVar13 = (n) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                s sVar13 = (s) nVar13;
                if (sVar13.R(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.system_icon_arrow_back_neutral_80, sVar13, 0), null, null, lv.s.C, sVar13, 3128, 4);
                } else {
                    sVar13.U();
                }
                break;
            case 20:
                n nVar14 = (n) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                s sVar14 = (s) nVar14;
                if (sVar14.R(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.system_icon_close_neutral_80, sVar14, 0), null, null, lv.s.C, sVar14, 3128, 4);
                } else {
                    sVar14.U();
                }
                break;
            case 21:
                n nVar15 = (n) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                s sVar15 = (s) nVar15;
                if (sVar15.R(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    long j9 = lv.s.C;
                    os.a.d(j9, R.string.special_reward_feature_item_activation_instruction, j9, sVar15, 390);
                } else {
                    sVar15.U();
                }
                break;
            case 22:
                n nVar16 = (n) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                s sVar16 = (s) nVar16;
                if (sVar16.R(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    long j11 = lv.s.f28230j;
                    os.a.d(j11, R.string.special_reward_feature_item_expiration_warning, j11, sVar16, 390);
                } else {
                    sVar16.U();
                }
                break;
            case 23:
                ((Integer) obj2).getClass();
                os.a.c((n) obj, m3.i.F(1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                os.a.f((n) obj, m3.i.F(1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                os.a.h((n) obj, m3.i.F(1));
                break;
            case 26:
                n nVar17 = (n) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                ComposableSingletons$AvatarSelectionChipKt composableSingletons$AvatarSelectionChipKt = ComposableSingletons$AvatarSelectionChipKt.INSTANCE;
                s sVar17 = (s) nVar17;
                if (sVar17.R(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    PantryAvatarIllustrationKt.PantryAvatarIllustration(ComposableSingletons$AvatarSelectionChipKt.f13121a, null, "Illustration", AvatarSize.Small, sVar17, 3462, 2);
                } else {
                    sVar17.U();
                }
                break;
            case 27:
                n nVar18 = (n) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                ComposableSingletons$AvatarSelectionChipKt composableSingletons$AvatarSelectionChipKt2 = ComposableSingletons$AvatarSelectionChipKt.INSTANCE;
                s sVar18 = (s) nVar18;
                if (sVar18.R(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    x60.m mVar2 = (x60.m) sVar18.j(PantryThemeKt.getLocalPantrySpacing());
                    t tVarZ2 = c.z(qVar, mVar2.f44015k);
                    b bVar2 = i.f13801a;
                    y yVarA2 = w.a(i.g(mVar2.l), b4.d.f5694m, sVar18, 0);
                    int iHashCode2 = Long.hashCode(sVar18.T);
                    u3.i iVarL2 = sVar18.l();
                    t tVarC2 = b4.a.c(tVarZ2, sVar18);
                    j.R.getClass();
                    h hVar2 = b5.i.f5839b;
                    sVar18.e0();
                    if (sVar18.S) {
                        sVar18.k(hVar2);
                    } else {
                        sVar18.n0();
                    }
                    m3.i.C(yVarA2, b5.i.f5843f, sVar18);
                    m3.i.C(iVarL2, b5.i.f5842e, sVar18);
                    m3.i.v(sVar18, Integer.valueOf(iHashCode2), b5.i.f5844g);
                    m3.i.z(sVar18, b5.i.f5845h);
                    m3.i.C(tVarC2, b5.i.f5841d, sVar18);
                    Object objM = sVar18.M();
                    if (objM == fVar) {
                        objM = new p(27);
                        sVar18.k0(objM);
                    }
                    AvatarSelectionChipKt.AvatarSelectionChip("Avatar Selection Chip", false, (Function0) objM, null, null, false, false, ComposableSingletons$AvatarSelectionChipKt.f13122b, sVar18, 12583350, 120);
                    sVar18.q(true);
                } else {
                    sVar18.U();
                }
                break;
            case 28:
                n nVar19 = (n) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                ComposableSingletons$IconSelectionChipKt composableSingletons$IconSelectionChipKt = ComposableSingletons$IconSelectionChipKt.INSTANCE;
                s sVar19 = (s) nVar19;
                if (sVar19.R(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.check, sVar19, 0), null, null, 0L, sVar19, 56, 12);
                } else {
                    sVar19.U();
                }
                break;
            default:
                n nVar20 = (n) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                ComposableSingletons$IconSelectionChipKt composableSingletons$IconSelectionChipKt2 = ComposableSingletons$IconSelectionChipKt.INSTANCE;
                s sVar20 = (s) nVar20;
                if (sVar20.R(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    x60.m mVar3 = (x60.m) sVar20.j(PantryThemeKt.getLocalPantrySpacing());
                    t tVarZ3 = c.z(qVar, mVar3.f44015k);
                    b bVar3 = i.f13801a;
                    y yVarA3 = w.a(i.g(mVar3.l), b4.d.f5694m, sVar20, 0);
                    int iHashCode3 = Long.hashCode(sVar20.T);
                    u3.i iVarL3 = sVar20.l();
                    t tVarC3 = b4.a.c(tVarZ3, sVar20);
                    j.R.getClass();
                    h hVar3 = b5.i.f5839b;
                    sVar20.e0();
                    if (sVar20.S) {
                        sVar20.k(hVar3);
                    } else {
                        sVar20.n0();
                    }
                    m3.i.C(yVarA3, b5.i.f5843f, sVar20);
                    m3.i.C(iVarL3, b5.i.f5842e, sVar20);
                    m3.i.v(sVar20, Integer.valueOf(iHashCode3), b5.i.f5844g);
                    m3.i.z(sVar20, b5.i.f5845h);
                    m3.i.C(tVarC3, b5.i.f5841d, sVar20);
                    Object objM2 = sVar20.M();
                    if (objM2 == fVar) {
                        objM2 = new p(28);
                        sVar20.k0(objM2);
                    }
                    IconSelectionChipKt.IconSelectionChip("Icon Selection Chip", false, (Function0) objM2, null, null, false, false, ComposableSingletons$IconSelectionChipKt.f13124a, sVar20, 12583350, 120);
                    sVar20.q(true);
                } else {
                    sVar20.U();
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ a(int i11, int i12) {
        this.f32039a = i12;
    }
}
