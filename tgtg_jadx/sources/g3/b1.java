package g3;

import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends z70.i implements i80.n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f18353j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ float f18354k;
    public final /* synthetic */ z6 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(z6 z6Var, x70.c cVar) {
        super(3, cVar);
        this.l = z6Var;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        b1 b1Var = new b1(this.l, (x70.c) obj3);
        b1Var.f18354k = fFloatValue;
        return b1Var.invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        ja jaVar = this.l.l;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f18353j;
        if (i11 == 0) {
            ba0.g.M(obj);
            float f11 = this.f18354k;
            ka state = jaVar.getState();
            t1.s sVarA = jaVar.a();
            t1.i iVarB = jaVar.b();
            this.f18353j = 1;
            if (i.e(state, f11, sVarA, iVarB, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
        }
        return Unit.f26487a;
    }
}
