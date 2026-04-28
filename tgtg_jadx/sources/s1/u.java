package s1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import t1.q1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends Lambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q1 f38685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f38686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b4.t f38687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0 f38688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y0 f38689e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function2 f38690f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i80.n f38691g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f38692h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(q1 q1Var, Function1 function1, b4.t tVar, x0 x0Var, y0 y0Var, Function2 function2, i80.n nVar, int i11) {
        super(2);
        this.f38685a = q1Var;
        this.f38686b = function1;
        this.f38687c = tVar;
        this.f38688d = x0Var;
        this.f38689e = y0Var;
        this.f38690f = function2;
        this.f38691g = nVar;
        this.f38692h = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        y.a(this.f38685a, this.f38686b, this.f38687c, this.f38688d, this.f38689e, this.f38690f, this.f38691g, (m3.n) obj, m3.i.F(this.f38692h | 1));
        return Unit.f26487a;
    }
}
