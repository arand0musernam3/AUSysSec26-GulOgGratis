package s1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import t1.q1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends Lambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b4.t f38582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t1.x f38583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u3.d f38584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f38585e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f38586f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f38587g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(Object obj, b4.t tVar, t1.x xVar, Object obj2, u3.d dVar, int i11, int i12) {
        super(2);
        this.f38581a = i12;
        this.f38586f = obj;
        this.f38582b = tVar;
        this.f38583c = xVar;
        this.f38587g = obj2;
        this.f38584d = dVar;
        this.f38585e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f38581a) {
            case 0:
                ((Number) obj2).intValue();
                Boolean bool = (Boolean) this.f38586f;
                String str = (String) this.f38587g;
                y.g(bool, this.f38582b, this.f38583c, str, this.f38584d, (m3.n) obj, m3.i.F(this.f38585e | 1));
                break;
            default:
                ((Number) obj2).intValue();
                q1 q1Var = (q1) this.f38586f;
                Function1 function1 = (Function1) this.f38587g;
                y.h(q1Var, this.f38582b, this.f38583c, function1, this.f38584d, (m3.n) obj, m3.i.F(this.f38585e | 1));
                break;
        }
        return Unit.f26487a;
    }
}
