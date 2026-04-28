package y80;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class w1 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f45606j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f45607k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w1(int i11, x70.c cVar, int i12) {
        super(i11, cVar);
        this.f45606j = i12;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f45606j) {
            case 0:
                w1 w1Var = new w1(2, cVar, 0);
                w1Var.f45607k = obj;
                return w1Var;
            default:
                w1 w1Var2 = new w1(2, cVar, 1);
                w1Var2.f45607k = obj;
                return w1Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f45606j) {
            case 0:
                return ((w1) create((o1) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            default:
                return ((w1) create((h8.a) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
        }
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f45606j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                return Boolean.valueOf(((o1) this.f45607k) != o1.START);
            default:
                h8.a aVar2 = (h8.a) this.f45607k;
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                aVar2.f(im.c.IS_CHARITY_LOGIN.a(), Boolean.TRUE);
                return Unit.f26487a;
        }
    }
}
