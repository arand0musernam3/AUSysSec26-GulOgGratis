package z1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o2 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f46624j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f46625k;
    public final /* synthetic */ float l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(Ref.FloatRef floatRef, float f11, x70.c cVar) {
        super(2, cVar);
        this.f46625k = floatRef;
        this.l = f11;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        o2 o2Var = new o2(this.f46625k, this.l, cVar);
        o2Var.f46624j = obj;
        return o2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o2) create((q2) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        this.f46625k.element = ((q2) this.f46624j).a(this.l);
        return Unit.f26487a;
    }
}
