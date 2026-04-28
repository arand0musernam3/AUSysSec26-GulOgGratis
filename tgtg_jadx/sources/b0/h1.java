package b0;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f5214j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f5215k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f5216m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(long j9, l1 l1Var, w.z zVar, x70.c cVar) {
        super(2, cVar);
        this.f5215k = j9;
        this.l = l1Var;
        this.f5216m = zVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f5214j) {
            case 0:
                return new h1(this.f5215k, (l1) this.l, (w.z) this.f5216m, cVar);
            default:
                h1 h1Var = new h1(this.f5215k, (Function0) this.f5216m, cVar);
                h1Var.l = obj;
                return h1Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f5214j) {
        }
        return ((h1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f5214j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                long jCurrentTimeMillis = System.currentTimeMillis() + this.f5215k;
                y0.f fVar = ((l1) this.l).f5290h;
                if (fVar != null) {
                    fVar.a((w.z) this.f5216m);
                }
                if (wd.a.B(3, "CXCP")) {
                    Log.d("CXCP", "applyScreenFlash: ScreenFlash.apply() invoked, expirationTimeMillis = " + jCurrentTimeMillis);
                }
                break;
            default:
                v80.b0 b0Var = (v80.b0) this.l;
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                v80.f0.B(b0Var, null, null, new a3.v1(this.f5215k, (Function0) this.f5216m, (x70.c) null, 3), 3);
                break;
        }
        return Unit.f26487a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(long j9, Function0 function0, x70.c cVar) {
        super(2, cVar);
        this.f5215k = j9;
        this.f5216m = function0;
    }
}
