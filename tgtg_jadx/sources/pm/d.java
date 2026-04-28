package pm;

import com.google.firebase.messaging.a0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ tm.e f35500j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ a0 f35501k;
    public final /* synthetic */ boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(tm.e eVar, a0 a0Var, boolean z11, x70.c cVar) {
        super(2, cVar);
        this.f35500j = eVar;
        this.f35501k = a0Var;
        this.l = z11;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new d(this.f35500j, this.f35501k, this.l, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        a0 a0Var = this.f35501k;
        this.f35500j.k(a0Var.I(), this.l);
        Function1 function1 = (Function1) a0Var.f12780c;
        j jVarI = a0Var.I();
        j jVar = j.Expanded;
        function1.invoke(Boolean.valueOf(jVarI == jVar && ((j) ((z1.r) a0Var.f12782e).f46654i.getValue()) == jVar && a0Var.I() == jVar));
        return Unit.f26487a;
    }
}
