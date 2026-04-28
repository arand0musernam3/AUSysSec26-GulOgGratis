package pi;

import com.app.tgtg.feature.itemview.ui.ItemViewActivity;
import com.tgtg.componentlibrary.component.iconbutton.variant.ComposableSingletons$AccentPantryIconButtonKt;
import com.tgtg.componentlibrary.component.iconbutton.variant.ComposableSingletons$IconOnlyPantryIconButtonKt;
import com.tgtg.componentlibrary.component.iconbutton.variant.ComposableSingletons$SubtlePantryIconButtonKt;
import java.time.YearMonth;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import m3.b1;
import org.bouncycastle.iana.AEADAlgorithm;
import qc.y;
import z4.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f35352b;

    public /* synthetic */ b(b1 b1Var, int i11) {
        this.f35351a = i11;
        this.f35352b = b1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i11 = this.f35351a;
        b1 b1Var = this.f35352b;
        switch (i11) {
            case 0:
                b1Var.setValue(Boolean.FALSE);
                break;
            case 1:
                int i12 = ItemViewActivity.f9011k;
                b1Var.setValue(Boolean.FALSE);
                break;
            case 2:
                b1Var.setValue(Boolean.FALSE);
                break;
            case 3:
                z zVar = (z) b1Var.getValue();
                if (zVar == null) {
                    c2.a.d("Required value was null.");
                    y.m();
                }
                break;
            case 4:
                z zVar2 = (z) b1Var.getValue();
                if (zVar2 == null) {
                    c2.a.d("Required value was null.");
                    y.m();
                }
                break;
            case 5:
                ComposableSingletons$AccentPantryIconButtonKt composableSingletons$AccentPantryIconButtonKt = ComposableSingletons$AccentPantryIconButtonKt.INSTANCE;
                b1Var.setValue(Boolean.valueOf(!((Boolean) b1Var.getValue()).booleanValue()));
                break;
            case 6:
                ComposableSingletons$AccentPantryIconButtonKt composableSingletons$AccentPantryIconButtonKt2 = ComposableSingletons$AccentPantryIconButtonKt.INSTANCE;
                b1Var.setValue(Boolean.valueOf(!((Boolean) b1Var.getValue()).booleanValue()));
                break;
            case 7:
                ComposableSingletons$AccentPantryIconButtonKt composableSingletons$AccentPantryIconButtonKt3 = ComposableSingletons$AccentPantryIconButtonKt.INSTANCE;
                b1Var.setValue(Boolean.valueOf(!((Boolean) b1Var.getValue()).booleanValue()));
                break;
            case 8:
                ComposableSingletons$IconOnlyPantryIconButtonKt composableSingletons$IconOnlyPantryIconButtonKt = ComposableSingletons$IconOnlyPantryIconButtonKt.INSTANCE;
                b1Var.setValue(Boolean.valueOf(!((Boolean) b1Var.getValue()).booleanValue()));
                break;
            case 9:
                ComposableSingletons$IconOnlyPantryIconButtonKt composableSingletons$IconOnlyPantryIconButtonKt2 = ComposableSingletons$IconOnlyPantryIconButtonKt.INSTANCE;
                b1Var.setValue(Boolean.valueOf(!((Boolean) b1Var.getValue()).booleanValue()));
                break;
            case 10:
                ComposableSingletons$IconOnlyPantryIconButtonKt composableSingletons$IconOnlyPantryIconButtonKt3 = ComposableSingletons$IconOnlyPantryIconButtonKt.INSTANCE;
                b1Var.setValue(Boolean.valueOf(!((Boolean) b1Var.getValue()).booleanValue()));
                break;
            case 11:
                ComposableSingletons$SubtlePantryIconButtonKt composableSingletons$SubtlePantryIconButtonKt = ComposableSingletons$SubtlePantryIconButtonKt.INSTANCE;
                b1Var.setValue(Boolean.valueOf(!((Boolean) b1Var.getValue()).booleanValue()));
                break;
            case 12:
                ComposableSingletons$SubtlePantryIconButtonKt composableSingletons$SubtlePantryIconButtonKt2 = ComposableSingletons$SubtlePantryIconButtonKt.INSTANCE;
                b1Var.setValue(Boolean.valueOf(!((Boolean) b1Var.getValue()).booleanValue()));
                break;
            case 13:
                ComposableSingletons$SubtlePantryIconButtonKt composableSingletons$SubtlePantryIconButtonKt3 = ComposableSingletons$SubtlePantryIconButtonKt.INSTANCE;
                b1Var.setValue(Boolean.valueOf(!((Boolean) b1Var.getValue()).booleanValue()));
                break;
            case 14:
                b1Var.setValue(Boolean.TRUE);
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                b1Var.setValue(Boolean.FALSE);
                break;
            case 16:
                z zVar3 = (z) b1Var.getValue();
                if (zVar3 == null) {
                    c2.a.d("Required value was null.");
                    y.m();
                }
                break;
            case 17:
                b1Var.setValue(Boolean.FALSE);
                break;
            case 18:
                b1Var.setValue(((YearMonth) b1Var.getValue()).minusMonths(1L));
                break;
            case 19:
                b1Var.setValue(((YearMonth) b1Var.getValue()).plusMonths(1L));
                break;
            case 20:
                b1Var.setValue(Boolean.FALSE);
                break;
            case 21:
                b1Var.setValue(Boolean.FALSE);
                break;
            case 22:
                b1Var.setValue(Boolean.FALSE);
                break;
            case 23:
                b1Var.setValue(Boolean.FALSE);
                break;
            case 24:
                b1Var.setValue(Boolean.TRUE);
                break;
            case 25:
                b1Var.setValue(Boolean.FALSE);
                break;
            case 26:
                b1Var.setValue(Boolean.TRUE);
                break;
            case 27:
                b1Var.setValue(Boolean.TRUE);
                break;
            case 28:
                b1Var.setValue(Boolean.TRUE);
                break;
            default:
                b1Var.setValue(Boolean.FALSE);
                break;
        }
        return Unit.f26487a;
    }
}
