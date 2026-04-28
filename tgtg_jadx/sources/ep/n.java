package ep;

import a3.f3;
import androidx.lifecycle.m1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f16316j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d0 f16317k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(d0 d0Var, x70.c cVar, int i11) {
        super(2, cVar);
        this.f16316j = i11;
        this.f16317k = d0Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f16316j) {
            case 0:
                return new n(this.f16317k, cVar, 0);
            case 1:
                return new n(this.f16317k, cVar, 1);
            case 2:
                return new n(this.f16317k, cVar, 2);
            default:
                return new n(this.f16317k, cVar, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f16316j) {
        }
        return ((n) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f16316j;
        d0 d0Var = this.f16317k;
        switch (i11) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                d0Var.r(cv.i.ACTION_START_CAMERA, null);
                break;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                d0Var.getClass();
                f0.B(m1.d(d0Var), null, null, new u(d0Var, null, 2), 3);
                f0.B(m1.d(d0Var), null, null, new f3(d0Var, false, null, 3), 3);
                break;
            case 2:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                d0Var.getClass();
                f0.B(m1.d(d0Var), null, null, new f3(d0Var, true, null, 3), 3);
                break;
            default:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                d0Var.r(cv.i.SCREEN_RECIPE_PREFERENCES, null);
                break;
        }
        return Unit.f26487a;
    }
}
