package s1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends Lambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f38697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b4.t f38698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0 f38699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y0 f38700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f38701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f38702g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f38703h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i80.n f38704i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(boolean z11, b4.t tVar, x0 x0Var, y0 y0Var, String str, i80.n nVar, int i11, int i12, int i13) {
        super(2);
        this.f38696a = i13;
        this.f38697b = z11;
        this.f38698c = tVar;
        this.f38699d = x0Var;
        this.f38700e = y0Var;
        this.f38701f = str;
        this.f38704i = nVar;
        this.f38702g = i11;
        this.f38703h = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f38696a) {
            case 0:
                ((Number) obj2).intValue();
                y.d(this.f38697b, this.f38698c, this.f38699d, this.f38700e, this.f38701f, this.f38704i, (m3.n) obj, m3.i.F(this.f38702g | 1), this.f38703h);
                break;
            default:
                ((Number) obj2).intValue();
                u3.d dVar = (u3.d) this.f38704i;
                y.e(this.f38697b, this.f38698c, this.f38699d, this.f38700e, this.f38701f, dVar, (m3.n) obj, m3.i.F(this.f38702g | 1), this.f38703h);
                break;
        }
        return Unit.f26487a;
    }
}
