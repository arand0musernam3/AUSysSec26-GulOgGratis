package lp;

import cj.e0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m3.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28008a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f28009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f28010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f28011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f28012e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f28013f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f28014g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f28015h;

    public /* synthetic */ b(b4.t tVar, boolean z11, boolean z12, Function0 function0, Function0 function02, Function0 function03, int i11) {
        this.f28013f = tVar;
        this.f28010c = z11;
        this.f28011d = z12;
        this.f28009b = function0;
        this.f28014g = function02;
        this.f28015h = function03;
        this.f28012e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f28008a) {
            case 0:
                ((Integer) obj2).getClass();
                d.a((b4.t) this.f28013f, this.f28010c, this.f28011d, this.f28009b, (Function0) this.f28014g, (Function0) this.f28015h, (m3.n) obj, m3.i.F(this.f28012e | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                vi.c.b((cj.q) this.f28013f, (e0) this.f28014g, this.f28009b, this.f28010c, (b1) this.f28015h, this.f28011d, (m3.n) obj, m3.i.F(this.f28012e | 1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ b(cj.q qVar, e0 e0Var, Function0 function0, boolean z11, b1 b1Var, boolean z12, int i11) {
        this.f28013f = qVar;
        this.f28014g = e0Var;
        this.f28009b = function0;
        this.f28010c = z11;
        this.f28015h = b1Var;
        this.f28011d = z12;
        this.f28012e = i11;
    }
}
