package c60;

import com.app.tgtg.R;
import com.tgtg.componentlibrary.component.avatar.DemoPantryAvatarKt;
import com.tgtg.componentlibrary.component.badgelabel.DemoPantryBadgeLabelKt;
import com.tgtg.componentlibrary.component.badgelabel.variant.AccentPantryBadgeLabelKt;
import com.tgtg.componentlibrary.component.badgelabel.variant.AttentionPantryBadgeLabelKt;
import com.tgtg.componentlibrary.component.badgelabel.variant.BasePantryBadgeLabelKt;
import com.tgtg.componentlibrary.component.badgelabel.variant.NegativePantryBadgeLabelKt;
import com.tgtg.componentlibrary.component.badgelabel.variant.PositivePantryBadgeLabelKt;
import com.tgtg.componentlibrary.component.badgelabel.variant.UnavailablePantryBadgeLabelKt;
import com.tgtg.componentlibrary.component.button.DemoPantryButtonKt;
import com.tgtg.componentlibrary.component.button.variant.AccentPantryButtonKt;
import com.tgtg.componentlibrary.component.button.variant.NegativePantryButtonKt;
import com.tgtg.componentlibrary.component.button.variant.PrimaryPantryButtonKt;
import com.tgtg.componentlibrary.component.button.variant.SubtlePantryButtonKt;
import com.tgtg.componentlibrary.component.button.variant.TextTransparentPantryButtonKt;
import com.tgtg.componentlibrary.component.checkbox.DemoPantryCheckboxKt;
import com.tgtg.componentlibrary.component.chip.DemoPantryChipKt;
import com.tgtg.componentlibrary.component.chip.type.choicechip.DemoChoiceChipKt;
import com.tgtg.componentlibrary.component.chip.type.filterchip.DemoFilterChipKt;
import com.tgtg.componentlibrary.component.chip.type.filterchip.variant.AvatarFilterChipKt;
import com.tgtg.componentlibrary.component.chip.type.filterchip.variant.IconFilterChipKt;
import com.tgtg.componentlibrary.component.chip.type.filterchip.variant.TextOnlyFilterChipKt;
import com.tgtg.componentlibrary.component.chip.type.selectionchip.DemoSelectionChipKt;
import com.tgtg.componentlibrary.component.p000switch.DemoPantrySwitchKt;
import g3.i2;
import i4.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.i;
import m3.n;
import m3.s;
import o00.x0;
import o30.f0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7771b;

    public /* synthetic */ b(int i11, int i12) {
        this.f7770a = i12;
        this.f7771b = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f7770a;
        int i12 = this.f7771b;
        switch (i11) {
            case 0:
                ((Integer) obj2).intValue();
                DemoPantryAvatarKt.DemoPantryAvatar((n) obj, i.F(i12 | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                DemoPantrySwitchKt.DemoPantrySwitch((n) obj, i.F(i12 | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                DemoPantryBadgeLabelKt.DemoPantryBadgeLabel((n) obj, i.F(i12 | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                AccentPantryBadgeLabelKt.PreviewAccentBadgeLabels((n) obj, i.F(i12 | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                AttentionPantryBadgeLabelKt.PreviewAttentionBadgeLabels((n) obj, i.F(i12 | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                BasePantryBadgeLabelKt.PreviewBaseBadgeLabels((n) obj, i.F(i12 | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                NegativePantryBadgeLabelKt.PreviewNegativeBadgeLabels((n) obj, i.F(i12 | 1));
                break;
            case 7:
                ((Integer) obj2).intValue();
                PositivePantryBadgeLabelKt.PreviewPositiveBadgeLabels((n) obj, i.F(i12 | 1));
                break;
            case 8:
                ((Integer) obj2).intValue();
                UnavailablePantryBadgeLabelKt.PreviewUnavailableBadgeLabels((n) obj, i.F(i12 | 1));
                break;
            case 9:
                ((Integer) obj2).intValue();
                DemoPantryButtonKt.DemoPantryButton((n) obj, i.F(i12 | 1));
                break;
            case 10:
                ((Integer) obj2).intValue();
                AccentPantryButtonKt.PreviewAccentButtons((n) obj, i.F(i12 | 1));
                break;
            case 11:
                ((Integer) obj2).intValue();
                NegativePantryButtonKt.PreviewNegativeButtons((n) obj, i.F(i12 | 1));
                break;
            case 12:
                ((Integer) obj2).intValue();
                PrimaryPantryButtonKt.PreviewPrimaryButtons((n) obj, i.F(i12 | 1));
                break;
            case 13:
                ((Integer) obj2).intValue();
                SubtlePantryButtonKt.PreviewSubtleButtons((n) obj, i.F(i12 | 1));
                break;
            case 14:
                ((Integer) obj2).intValue();
                TextTransparentPantryButtonKt.PreviewTextTransparentButtons((n) obj, i.F(i12 | 1));
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = (s) nVar;
                if (sVar.R(1 & iIntValue, (iIntValue & 3) != 2)) {
                    v1.n.d(x0.z(i12, sVar, 0), null, null, null, null, 0.0f, null, sVar, 56, 124);
                } else {
                    sVar.U();
                }
                break;
            case 16:
                ((Integer) obj2).intValue();
                DemoPantryCheckboxKt.DemoPantryCheckbox((n) obj, i.F(i12 | 1));
                break;
            case 17:
                ((Integer) obj2).intValue();
                DemoPantryChipKt.DemoPantryChip((n) obj, i.F(i12 | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                jk.d.c(i12, (n) obj, i.F(1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                jk.d.b(i12, (n) obj, i.F(1));
                break;
            case 20:
                ((Integer) obj2).intValue();
                DemoChoiceChipKt.DemoChoiceChip((n) obj, i.F(i12 | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                lp.d.l(i12, (n) obj, i.F(1));
                break;
            case 22:
                n nVar2 = (n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                s sVar2 = (s) nVar2;
                if (sVar2.R(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    i2.a(x0.z(i12, sVar2, 0), null, null, v.f23315h, sVar2, 3128, 4);
                } else {
                    sVar2.U();
                }
                break;
            case 23:
                n nVar3 = (n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                s sVar3 = (s) nVar3;
                if (sVar3.R(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    i2.a(x0.z(i12, sVar3, 0), f0.U(sVar3, R.string.content_desc_close), null, v.f23315h, sVar3, 3080, 4);
                } else {
                    sVar3.U();
                }
                break;
            case 24:
                ((Integer) obj2).intValue();
                DemoFilterChipKt.DemoFilterChip((n) obj, i.F(i12 | 1));
                break;
            case 25:
                ((Integer) obj2).intValue();
                AvatarFilterChipKt.PreviewAvatarFilterChip((n) obj, i.F(i12 | 1));
                break;
            case 26:
                ((Integer) obj2).intValue();
                IconFilterChipKt.PreviewIconFilterChip((n) obj, i.F(i12 | 1));
                break;
            case 27:
                ((Integer) obj2).intValue();
                TextOnlyFilterChipKt.PreviewTextOnlyFilterChip((n) obj, i.F(i12 | 1));
                break;
            case 28:
                n nVar4 = (n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                s sVar4 = (s) nVar4;
                if (sVar4.R(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    i2.a(x0.z(i12, sVar4, 0), f0.U(sVar4, R.string.profile_voice_over_open_manage_account), null, v.f23315h, sVar4, 3080, 4);
                } else {
                    sVar4.U();
                }
                break;
            default:
                ((Integer) obj2).intValue();
                DemoSelectionChipKt.DemoSelectionChip((n) obj, i.F(i12 | 1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ b(int i11, int i12, int i13) {
        this.f7770a = i13;
        this.f7771b = i11;
    }
}
