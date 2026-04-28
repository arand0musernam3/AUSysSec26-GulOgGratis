package f2;

import com.tgtg.componentlibrary.component.button.PantryButtonKt;
import com.tgtg.componentlibrary.component.button.model.ButtonSize;
import com.tgtg.componentlibrary.component.button.model.ButtonVariant;
import d2.z1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import v1.o1;
import z1.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17075a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b4.t f17076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f17077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f17078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f17080f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f17081g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f17082h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f17083i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f17084j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f17085k;
    public final /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u70.f f17086m;

    public /* synthetic */ c(b4.t tVar, c0 c0Var, z1 z1Var, boolean z11, d2.f fVar, b4.j jVar, l1 l1Var, boolean z12, o1 o1Var, Function1 function1, int i11, int i12) {
        this.f17076b = tVar;
        this.f17081g = c0Var;
        this.f17082h = z1Var;
        this.f17077c = z11;
        this.f17083i = fVar;
        this.f17084j = jVar;
        this.f17085k = l1Var;
        this.f17078d = z12;
        this.l = o1Var;
        this.f17086m = function1;
        this.f17079e = i11;
        this.f17080f = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17075a) {
            case 0:
                ((Integer) obj2).getClass();
                ox.h.d(this.f17076b, (c0) this.f17081g, (z1) this.f17082h, this.f17077c, (d2.f) this.f17083i, (b4.j) this.f17084j, (l1) this.f17085k, this.f17078d, (o1) this.l, (Function1) this.f17086m, (m3.n) obj, m3.i.F(this.f17079e | 1), this.f17080f);
                break;
            default:
                ((Integer) obj2).intValue();
                PantryButtonKt.PantryButton((String) this.f17081g, (Function0) this.f17082h, this.f17076b, (String) this.f17083i, (ButtonVariant) this.f17084j, (ButtonSize) this.f17085k, this.f17077c, this.f17078d, (Function2) this.l, (Function2) this.f17086m, (m3.n) obj, m3.i.F(this.f17079e | 1), this.f17080f);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ c(String str, Function0 function0, b4.t tVar, String str2, ButtonVariant buttonVariant, ButtonSize buttonSize, boolean z11, boolean z12, Function2 function2, Function2 function22, int i11, int i12) {
        this.f17081g = str;
        this.f17082h = function0;
        this.f17076b = tVar;
        this.f17083i = str2;
        this.f17084j = buttonVariant;
        this.f17085k = buttonSize;
        this.f17077c = z11;
        this.f17078d = z12;
        this.l = function2;
        this.f17086m = function22;
        this.f17079e = i11;
        this.f17080f = i12;
    }
}
