package l60;

import com.tgtg.componentlibrary.component.chip.type.choicechip.DemoChoiceChipKt;
import com.tgtg.componentlibrary.component.chip.type.filterchip.DemoFilterChipKt;
import com.tgtg.componentlibrary.component.chip.type.selectionchip.DemoSelectionChipKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.i;
import m3.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f27433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f27434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f27435d;

    public /* synthetic */ a(String str, boolean z11, Function1 function1, int i11, int i12) {
        this.f27432a = i12;
        this.f27433b = str;
        this.f27434c = z11;
        this.f27435d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f27432a;
        n nVar = (n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                DemoChoiceChipKt.a(this.f27433b, this.f27434c, this.f27435d, nVar, i.F(391));
                break;
            case 1:
                DemoFilterChipKt.a(this.f27433b, this.f27434c, this.f27435d, nVar, i.F(391));
                break;
            default:
                DemoSelectionChipKt.a(this.f27433b, this.f27434c, this.f27435d, nVar, i.F(391));
                break;
        }
        return Unit.f26487a;
    }
}
