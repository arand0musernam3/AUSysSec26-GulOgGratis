package le;

import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends z70.i implements i80.n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f27758j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i11, x70.c cVar, int i12) {
        super(i11, cVar);
        this.f27758j = i12;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f27758j) {
            case 0:
                ((Number) obj).intValue();
                new v(3, (x70.c) obj3, 0).invokeSuspend(Unit.f26487a);
                return Boolean.FALSE;
            case 1:
                long j9 = ((h4.b) obj2).f21378a;
                return new v(3, (x70.c) obj3, 1).invokeSuspend(Unit.f26487a);
            case 2:
                ((Number) obj2).floatValue();
                return new v(3, (x70.c) obj3, 2).invokeSuspend(Unit.f26487a);
            default:
                long j11 = ((h4.b) obj2).f21378a;
                return new v(3, (x70.c) obj3, 3).invokeSuspend(Unit.f26487a);
        }
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f27758j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                break;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                break;
            case 2:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                break;
            default:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                break;
        }
        return Unit.f26487a;
    }
}
