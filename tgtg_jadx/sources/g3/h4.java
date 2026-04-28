package g3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h4 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18727a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f18728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f18729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f18730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f18731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f18732f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f18733g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u70.f f18734h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f18735i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u70.f f18736j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f18737k;

    public /* synthetic */ h4(d2.j2 j2Var, boolean z11, Function0 function0, u3.d dVar, b4.t tVar, boolean z12, Function2 function2, boolean z13, c4 c4Var, int i11) {
        this.f18733g = j2Var;
        this.f18728b = z11;
        this.f18729c = function0;
        this.f18734h = dVar;
        this.f18735i = tVar;
        this.f18730d = z12;
        this.f18736j = function2;
        this.f18731e = z13;
        this.f18737k = c4Var;
        this.f18732f = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18727a) {
            case 0:
                ((Integer) obj2).getClass();
                j4.b((d2.j2) this.f18733g, this.f18728b, this.f18729c, (u3.d) this.f18734h, (b4.t) this.f18735i, this.f18730d, (Function2) this.f18736j, this.f18731e, (c4) this.f18737k, (m3.n) obj, m3.i.F(this.f18732f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                lp.d.o((hp.g) this.f18733g, this.f18728b, this.f18729c, (Function0) this.f18734h, this.f18730d, (Function0) this.f18735i, this.f18731e, (Function1) this.f18736j, (Function1) this.f18737k, (m3.n) obj, m3.i.F(this.f18732f | 1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ h4(hp.g gVar, boolean z11, Function0 function0, Function0 function02, boolean z12, Function0 function03, boolean z13, Function1 function1, Function1 function12, int i11) {
        this.f18733g = gVar;
        this.f18728b = z11;
        this.f18729c = function0;
        this.f18734h = function02;
        this.f18730d = z12;
        this.f18735i = function03;
        this.f18731e = z13;
        this.f18736j = function1;
        this.f18737k = function12;
        this.f18732f = i11;
    }
}
