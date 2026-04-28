package h2;

import com.app.tgtg.feature.orderview.manufacture.ManufacturerOrderActivity;
import com.app.tgtg.feature.tabdiscover.discoveritems.DiscoverFavoritesPromoItemView;
import com.app.tgtg.feature.tabprofile.manageaccount.paymentoptions.PaymentOptionsActivity;
import com.tgtg.componentlibrary.component.checkbox.ComposableSingletons$DemoPantryCheckboxKt;
import com.tgtg.componentlibrary.component.chip.model.ChipVariant;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m3.b1 f21183b;

    public /* synthetic */ n0(m3.b1 b1Var, int i11) {
        this.f21182a = i11;
        this.f21183b = b1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i11 = this.f21182a;
        m3.b1 b1Var = this.f21183b;
        switch (i11) {
            case 0:
                break;
            case 1:
                ComposableSingletons$DemoPantryCheckboxKt composableSingletons$DemoPantryCheckboxKt = ComposableSingletons$DemoPantryCheckboxKt.INSTANCE;
                int i12 = ComposableSingletons$DemoPantryCheckboxKt.WhenMappings.$EnumSwitchMapping$0[((l5.a) b1Var.getValue()).ordinal()];
                b1Var.setValue(i12 != 1 ? i12 != 2 ? l5.a.Indeterminate : l5.a.Off : l5.a.On);
                break;
            case 2:
                ComposableSingletons$DemoPantryCheckboxKt composableSingletons$DemoPantryCheckboxKt2 = ComposableSingletons$DemoPantryCheckboxKt.INSTANCE;
                int i13 = ComposableSingletons$DemoPantryCheckboxKt.WhenMappings.$EnumSwitchMapping$0[((l5.a) b1Var.getValue()).ordinal()];
                b1Var.setValue(i13 != 1 ? i13 != 2 ? l5.a.Indeterminate : l5.a.Off : l5.a.On);
                break;
            case 3:
                ComposableSingletons$DemoPantryCheckboxKt composableSingletons$DemoPantryCheckboxKt3 = ComposableSingletons$DemoPantryCheckboxKt.INSTANCE;
                int i14 = ComposableSingletons$DemoPantryCheckboxKt.WhenMappings.$EnumSwitchMapping$0[((l5.a) b1Var.getValue()).ordinal()];
                b1Var.setValue(i14 != 1 ? i14 != 2 ? l5.a.Indeterminate : l5.a.Off : l5.a.On);
                break;
            case 4:
                b1Var.setValue(Boolean.FALSE);
                break;
            case 5:
                b1Var.setValue(Boolean.FALSE);
                break;
            case 6:
                b1Var.setValue(Boolean.FALSE);
                break;
            case 7:
                b1Var.setValue(Boolean.FALSE);
                break;
            case 8:
                b1Var.setValue(Boolean.FALSE);
                break;
            case 9:
                b1Var.setValue(Boolean.TRUE);
                break;
            case 10:
                b1Var.setValue(Boolean.TRUE);
                break;
            case 11:
                b1Var.setValue(Boolean.FALSE);
                break;
            case 12:
                b1Var.setValue(Boolean.FALSE);
                break;
            case 13:
                int i15 = PaymentOptionsActivity.f9428g;
                b1Var.setValue(null);
                break;
            case 14:
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                break;
            case 16:
                b1Var.setValue(Boolean.FALSE);
                break;
            case 17:
                b1Var.setValue(Boolean.FALSE);
                break;
            case 18:
                int i16 = ManufacturerOrderActivity.f9167q;
                b1Var.setValue(Boolean.TRUE);
                break;
            case 19:
                int i17 = ManufacturerOrderActivity.f9167q;
                b1Var.setValue(Boolean.FALSE);
                break;
            case 20:
                int i18 = ManufacturerOrderActivity.f9167q;
                b1Var.setValue(Boolean.FALSE);
                break;
            case 21:
                int i19 = ManufacturerOrderActivity.f9167q;
                b1Var.setValue(Boolean.FALSE);
                break;
            case 22:
                int i21 = ManufacturerOrderActivity.f9167q;
                b1Var.setValue(Boolean.FALSE);
                break;
            case 23:
                b1Var.setValue(Boolean.FALSE);
                break;
            case 24:
                int i22 = DiscoverFavoritesPromoItemView.f9294k;
                b1Var.setValue(Boolean.FALSE);
                break;
            case 25:
                if (b1Var != null) {
                }
                break;
            case 26:
                Boolean bool = (Boolean) b1Var.getValue();
                bool.booleanValue();
                break;
            case 27:
                b1Var.setValue(ChipVariant.TextOnly);
                break;
            case 28:
                b1Var.setValue(ChipVariant.Icon);
                break;
            default:
                b1Var.setValue(ChipVariant.Avatar);
                break;
        }
        return Unit.f26487a;
    }
}
