package g3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v9 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f19662j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ w9 f19663k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v9(w9 w9Var, x70.c cVar) {
        super(2, cVar);
        this.f19663k = w9Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new v9(this.f19663k, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v9) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f19662j;
        if (i11 == 0) {
            ba0.g.M(obj);
            Ref.IntRef intRef = new Ref.IntRef();
            w9 w9Var = this.f19663k;
            y80.i iVarA = w9Var.f19734o.a();
            u9 u9Var = new u9(intRef, w9Var);
            this.f19662j = 1;
            if (iVarA.collect(u9Var, this) == aVar) {
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
