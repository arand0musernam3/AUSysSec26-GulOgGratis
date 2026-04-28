package t1;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends z70.i implements Function1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f39586j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f39587k;
    public final /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y0 f39588m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q1 f39589n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f39590o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(Object obj, Object obj2, y0 y0Var, q1 q1Var, float f11, x70.c cVar) {
        super(1, cVar);
        this.f39587k = obj;
        this.l = obj2;
        this.f39588m = y0Var;
        this.f39589n = q1Var;
        this.f39590o = f11;
    }

    @Override // z70.a
    public final x70.c create(x70.c cVar) {
        return new v0(this.f39587k, this.l, this.f39588m, this.f39589n, this.f39590o, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((v0) create((x70.c) obj)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f39586j;
        if (i11 == 0) {
            ba0.g.M(obj);
            u0 u0Var = new u0(this.f39587k, this.l, this.f39588m, this.f39589n, this.f39590o, null);
            this.f39586j = 1;
            if (v80.f0.n(u0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
        }
        return Unit.f26487a;
    }
}
