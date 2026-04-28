package z1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e2 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f46483j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g2 f46484k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(g2 g2Var, x70.c cVar) {
        super(2, cVar);
        this.f46484k = g2Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new e2(this.f46484k, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e2) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f46483j;
        if (i11 != 0) {
            if (i11 == 1) {
                ba0.g.M(obj);
                return obj;
            }
            com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ba0.g.M(obj);
        x80.i iVar = this.f46484k.f46524e;
        this.f46483j = 1;
        Object objN = v80.f0.n(new a2(iVar, null, 0), this);
        return objN == aVar ? aVar : objN;
    }
}
