package g3;

import com.tgtg.componentlibrary.component.radiobutton.PantryRadioButtonKt;
import com.tgtg.componentlibrary.component.radiobutton.model.RadioButtonColors;
import com.tgtg.componentlibrary.component.radiobutton.model.RadioButtonGeometry;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y7 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19838a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f19839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f19840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f19842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f19843f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f19844g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f19845h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f19846i;

    public /* synthetic */ y7(b4.t tVar, boolean z11, boolean z12, w7 w7Var, Function2 function2, b2.k kVar, i4.v0 v0Var, int i11) {
        this.f19842e = tVar;
        this.f19839b = z11;
        this.f19840c = z12;
        this.f19843f = w7Var;
        this.f19844g = function2;
        this.f19845h = kVar;
        this.f19846i = v0Var;
        this.f19841d = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19838a) {
            case 0:
                ((Integer) obj2).getClass();
                z7.b((b4.t) this.f19842e, this.f19839b, this.f19840c, (w7) this.f19843f, (Function2) this.f19844g, (b2.k) this.f19845h, (i4.v0) this.f19846i, (m3.n) obj, m3.i.F(this.f19841d | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                w0.e.e((r9.d) this.f19842e, this.f19839b, (Function0) this.f19843f, (Function0) this.f19844g, this.f19840c, (Function0) this.f19845h, (Function0) this.f19846i, (m3.n) obj, m3.i.F(this.f19841d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                PantryRadioButtonKt.a(this.f19839b, (Function0) this.f19843f, (b2.l) this.f19844g, (RadioButtonColors) this.f19845h, (RadioButtonGeometry) this.f19846i, (b4.t) this.f19842e, this.f19840c, (m3.n) obj, m3.i.F(this.f19841d | 1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ y7(r9.d dVar, boolean z11, Function0 function0, Function0 function02, boolean z12, Function0 function03, Function0 function04, int i11) {
        this.f19842e = dVar;
        this.f19839b = z11;
        this.f19843f = function0;
        this.f19844g = function02;
        this.f19840c = z12;
        this.f19845h = function03;
        this.f19846i = function04;
        this.f19841d = i11;
    }

    public /* synthetic */ y7(boolean z11, Function0 function0, b2.l lVar, RadioButtonColors radioButtonColors, RadioButtonGeometry radioButtonGeometry, b4.t tVar, boolean z12, int i11) {
        this.f19839b = z11;
        this.f19843f = function0;
        this.f19844g = lVar;
        this.f19845h = radioButtonColors;
        this.f19846i = radioButtonGeometry;
        this.f19842e = tVar;
        this.f19840c = z12;
        this.f19841d = i11;
    }
}
