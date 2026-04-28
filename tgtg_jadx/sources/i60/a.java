package i60;

import com.tgtg.componentlibrary.component.checkbox.DemoPantryCheckboxKt;
import com.tgtg.componentlibrary.component.radiobutton.DemoPantryRadioButtonKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.i;
import m3.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f23464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f23465c;

    public /* synthetic */ a(String str, Function2 function2, int i11, int i12) {
        this.f23463a = i12;
        this.f23464b = str;
        this.f23465c = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f23463a;
        n nVar = (n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                DemoPantryCheckboxKt.a(this.f23464b, this.f23465c, nVar, i.F(55));
                break;
            default:
                DemoPantryRadioButtonKt.a(this.f23464b, this.f23465c, nVar, i.F(55));
                break;
        }
        return Unit.f26487a;
    }
}
