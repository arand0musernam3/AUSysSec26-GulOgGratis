package on;

import com.tgtg.componentlibrary.component.chip.type.selectionchip.variant.AvatarSelectionChipKt;
import com.tgtg.componentlibrary.component.chip.type.selectionchip.variant.IconSelectionChipKt;
import com.tgtg.componentlibrary.component.chip.type.selectionchip.variant.TextOnlySelectionChipKt;
import com.tgtg.componentlibrary.component.iconbutton.DemoPantryIconButtonKt;
import com.tgtg.componentlibrary.component.iconbutton.variant.AccentPantryIconButtonKt;
import com.tgtg.componentlibrary.component.iconbutton.variant.IconOnlyPantryIconButtonKt;
import com.tgtg.componentlibrary.component.iconbutton.variant.SubtlePantryIconButtonKt;
import com.tgtg.componentlibrary.component.pageheader.DemoPantryPageHeaderKt;
import com.tgtg.componentlibrary.component.pageheader.variant.GlobalPantryPageHeaderKt;
import com.tgtg.componentlibrary.component.pageheader.variant.ModalPantryPageHeaderKt;
import com.tgtg.componentlibrary.component.pageheader.variant.PagePantryPageHeaderKt;
import com.tgtg.componentlibrary.component.radiobutton.DemoPantryRadioButtonKt;
import com.tgtg.componentlibrary.component.spinner.DemoPantrySpinnerKt;
import com.tgtg.componentlibrary.theme.demo.DemoBorderKt;
import com.tgtg.componentlibrary.theme.demo.DemoColorKt;
import com.tgtg.componentlibrary.theme.demo.DemoRadiusKt;
import com.tgtg.componentlibrary.theme.demo.DemoShadowKt;
import com.tgtg.componentlibrary.theme.demo.DemoSizeKt;
import com.tgtg.componentlibrary.theme.demo.DemoSpacingKt;
import com.tgtg.componentlibrary.theme.demo.DemoTypographyKt;
import g3.i2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.n;
import m3.s;
import o00.x0;
import o30.f0;
import org.bouncycastle.iana.AEADAlgorithm;
import rk.v;
import zendesk.ui.android.common.noticemessage.NoticeMessageKt;
import zendesk.ui.android.conversation.activitymessage.ActivityMessageKt;
import zendesk.ui.android.conversation.aidisclaimer.AiDisclaimerKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32720b;

    public /* synthetic */ j(int i11, int i12) {
        this.f32719a = i12;
        this.f32720b = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        n nVar = (n) obj;
        Integer num = (Integer) obj2;
        switch (this.f32719a) {
            case 0:
                num.getClass();
                d.f(this.f32720b, nVar, m3.i.F(1));
                return Unit.f26487a;
            case 1:
                num.intValue();
                AvatarSelectionChipKt.PreviewAvatarSelectionChip(nVar, m3.i.F(this.f32720b | 1));
                return Unit.f26487a;
            case 2:
                num.intValue();
                IconSelectionChipKt.PreviewIconSelectionChip(nVar, m3.i.F(this.f32720b | 1));
                return Unit.f26487a;
            case 3:
                num.intValue();
                TextOnlySelectionChipKt.PreviewTextOnlySelectionChip(nVar, m3.i.F(this.f32720b | 1));
                return Unit.f26487a;
            case 4:
                num.intValue();
                DemoPantryIconButtonKt.DemoPantryIconButton(nVar, m3.i.F(this.f32720b | 1));
                return Unit.f26487a;
            case 5:
                num.intValue();
                AccentPantryIconButtonKt.PreviewAccentIconButtons(nVar, m3.i.F(this.f32720b | 1));
                return Unit.f26487a;
            case 6:
                num.intValue();
                IconOnlyPantryIconButtonKt.PreviewIconOnlyIconButtons(nVar, m3.i.F(this.f32720b | 1));
                return Unit.f26487a;
            case 7:
                num.intValue();
                SubtlePantryIconButtonKt.PreviewSubtleIconButtons(nVar, m3.i.F(this.f32720b | 1));
                return Unit.f26487a;
            case 8:
                num.getClass();
                v.a(this.f32720b, nVar, m3.i.F(1));
                return Unit.f26487a;
            case 9:
                num.intValue();
                DemoPantryPageHeaderKt.DemoPantryPageHeader(nVar, m3.i.F(this.f32720b | 1));
                return Unit.f26487a;
            case 10:
                int iIntValue = num.intValue();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i2.a(x0.z(this.f32720b, sVar, 0), null, null, 0L, sVar, 56, 12);
                } else {
                    sVar.U();
                }
                return Unit.f26487a;
            case 11:
                num.intValue();
                GlobalPantryPageHeaderKt.PreviewGlobalPageHeaders(nVar, m3.i.F(this.f32720b | 1));
                return Unit.f26487a;
            case 12:
                num.intValue();
                ModalPantryPageHeaderKt.PreviewModalPageHeaders(nVar, m3.i.F(this.f32720b | 1));
                return Unit.f26487a;
            case 13:
                num.intValue();
                PagePantryPageHeaderKt.PreviewPagePageHeaders(nVar, m3.i.F(this.f32720b | 1));
                return Unit.f26487a;
            case 14:
                num.intValue();
                DemoPantryRadioButtonKt.DemoPantryRadioButton(nVar, m3.i.F(this.f32720b | 1));
                return Unit.f26487a;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                num.getClass();
                v0.n.k(this.f32720b, nVar, m3.i.F(1));
                return Unit.f26487a;
            case 16:
                num.intValue();
                DemoPantrySpinnerKt.DemoPantrySpinner(nVar, m3.i.F(this.f32720b | 1));
                return Unit.f26487a;
            case 17:
                num.getClass();
                wi.a.e(this.f32720b, nVar, m3.i.F(1));
                return Unit.f26487a;
            case 18:
                num.getClass();
                f0.o(this.f32720b, nVar, m3.i.F(1));
                return Unit.f26487a;
            case 19:
                num.getClass();
                f0.k(this.f32720b, nVar, m3.i.F(1));
                return Unit.f26487a;
            case 20:
                num.intValue();
                DemoBorderKt.DemoBorder(nVar, m3.i.F(this.f32720b | 1));
                return Unit.f26487a;
            case 21:
                num.intValue();
                DemoColorKt.DemoColor(nVar, m3.i.F(this.f32720b | 1));
                return Unit.f26487a;
            case 22:
                num.intValue();
                DemoRadiusKt.DemoRadius(nVar, m3.i.F(this.f32720b | 1));
                return Unit.f26487a;
            case 23:
                num.intValue();
                DemoShadowKt.DemoShadow(nVar, m3.i.F(this.f32720b | 1));
                return Unit.f26487a;
            case 24:
                num.intValue();
                DemoSizeKt.DemoSize(nVar, m3.i.F(this.f32720b | 1));
                return Unit.f26487a;
            case 25:
                num.intValue();
                DemoSpacingKt.DemoSpacing(nVar, m3.i.F(this.f32720b | 1));
                return Unit.f26487a;
            case 26:
                num.intValue();
                DemoTypographyKt.DemoTypography(nVar, m3.i.F(this.f32720b | 1));
                return Unit.f26487a;
            case 27:
                return NoticeMessageKt.NoticeMessagePreview$lambda$4(this.f32720b, nVar, num.intValue());
            case 28:
                return ActivityMessageKt.ActivityMessagePreview$lambda$1(this.f32720b, nVar, num.intValue());
            default:
                return AiDisclaimerKt.PreviewAiDisclaimer$lambda$9(this.f32720b, nVar, num.intValue());
        }
    }

    public /* synthetic */ j(int i11, int i12, int i13) {
        this.f32719a = i13;
        this.f32720b = i11;
    }
}
