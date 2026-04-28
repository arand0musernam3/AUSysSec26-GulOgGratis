package f0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p2 extends z70.i implements Function1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f16839j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f16840k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p2(Object obj, x70.c cVar, int i11) {
        super(1, cVar);
        this.f16839j = i11;
        this.f16840k = obj;
    }

    @Override // z70.a
    public final x70.c create(x70.c cVar) {
        switch (this.f16839j) {
            case 0:
                return new p2((s2) this.f16840k, cVar, 0);
            case 1:
                return new p2((t1.b) this.f16840k, cVar, 1);
            default:
                return new p2((w2.v0) this.f16840k, cVar, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        x70.c cVar = (x70.c) obj;
        switch (this.f16839j) {
        }
        return ((p2) create(cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) throws InterruptedException {
        int i11 = this.f16839j;
        Object obj2 = this.f16840k;
        switch (i11) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                ((s2) obj2).f16900x.await();
                break;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                t1.b.b((t1.b) obj2);
                break;
            default:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                ((w2.v0) obj2).f43058u.f43799t.setValue(Boolean.FALSE);
                break;
        }
        return Unit.f26487a;
    }
}
