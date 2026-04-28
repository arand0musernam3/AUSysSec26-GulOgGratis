package s1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import t1.q1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends Lambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38590a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1 f38591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f38592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b4.t f38593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f38594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f38595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f38596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i80.n f38597h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(q1 q1Var, b4.t tVar, Function1 function1, b4.f fVar, Function1 function12, u3.d dVar, int i11) {
        super(2);
        this.f38591b = q1Var;
        this.f38593d = tVar;
        this.f38592c = function1;
        this.f38596g = fVar;
        this.f38595f = function12;
        this.f38597h = dVar;
        this.f38594e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f38590a) {
            case 0:
                ((Number) obj2).intValue();
                b4.f fVar = (b4.f) this.f38596g;
                Function1 function1 = (Function1) this.f38595f;
                u3.d dVar = (u3.d) this.f38597h;
                i.b(this.f38591b, this.f38593d, this.f38592c, fVar, function1, dVar, (m3.n) obj, m3.i.F(this.f38594e | 1));
                break;
            default:
                ((Number) obj2).intValue();
                x0 x0Var = (x0) this.f38595f;
                y0 y0Var = (y0) this.f38596g;
                y.f(this.f38591b, this.f38592c, this.f38593d, x0Var, y0Var, this.f38597h, (m3.n) obj, m3.i.F(this.f38594e | 1));
                break;
        }
        return Unit.f26487a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(q1 q1Var, Function1 function1, b4.t tVar, x0 x0Var, y0 y0Var, i80.n nVar, int i11) {
        super(2);
        this.f38591b = q1Var;
        this.f38592c = function1;
        this.f38593d = tVar;
        this.f38595f = x0Var;
        this.f38596g = y0Var;
        this.f38597h = nVar;
        this.f38594e = i11;
    }
}
