package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3544j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f3545k;
    public final /* synthetic */ Lifecycle l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Lifecycle.State f3546m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ z70.i f3547n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w0(Lifecycle lifecycle, Lifecycle.State state, Function2 function2, x70.c cVar) {
        super(2, cVar);
        this.l = lifecycle;
        this.f3546m = state;
        this.f3547n = (z70.i) function2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function2, z70.i] */
    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        w0 w0Var = new w0(this.l, this.f3546m, this.f3547n, cVar);
        w0Var.f3545k = obj;
        return w0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.jvm.functions.Function2, z70.i] */
    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f3544j;
        if (i11 == 0) {
            ba0.g.M(obj);
            v80.b0 b0Var = (v80.b0) this.f3545k;
            c90.f fVar = v80.p0.f42144a;
            w80.c cVar = a90.p.f1044a.f43295e;
            v0 v0Var = new v0(this.l, this.f3546m, b0Var, this.f3547n, null);
            this.f3544j = 1;
            if (v80.f0.K(cVar, v0Var, this) == aVar) {
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
