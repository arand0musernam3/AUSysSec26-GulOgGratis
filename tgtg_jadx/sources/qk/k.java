package qk;

import i80.n;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends z70.i implements n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f37186j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Throwable f37187k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i11, x70.c cVar, int i12) {
        super(i11, cVar);
        this.f37186j = i12;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Throwable th2 = (Throwable) obj2;
        x70.c cVar = (x70.c) obj3;
        switch (this.f37186j) {
            case 0:
                k kVar = new k(3, cVar, 0);
                kVar.f37187k = th2;
                return kVar.invokeSuspend(Unit.f26487a);
            case 1:
                k kVar2 = new k(3, cVar, 1);
                kVar2.f37187k = th2;
                return kVar2.invokeSuspend(Unit.f26487a);
            default:
                k kVar3 = new k(3, cVar, 2);
                kVar3.f37187k = th2;
                return kVar3.invokeSuspend(Unit.f26487a);
        }
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f37186j) {
            case 0:
                Throwable th2 = this.f37187k;
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                th2.getClass();
                break;
            case 1:
                Throwable th3 = this.f37187k;
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                th3.getClass();
                break;
            default:
                Throwable th4 = this.f37187k;
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                th4.getClass();
                break;
        }
        return Unit.f26487a;
    }
}
