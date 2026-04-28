package da;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import v80.b0;
import y9.c0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f14815j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14816k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Function1 f14817m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Function1 function1, x70.c cVar) {
        super(2, cVar);
        this.f14815j = 2;
        this.f14817m = function1;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f14815j) {
            case 0:
                f fVar = new f(0, this.f14817m, cVar);
                fVar.l = obj;
                return fVar;
            case 1:
                f fVar2 = new f(1, this.f14817m, cVar);
                fVar2.l = obj;
                return fVar2;
            default:
                f fVar3 = new f(this.f14817m, cVar);
                fVar3.l = obj;
                return fVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14815j) {
            case 0:
                return ((f) create((aa.o) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 1:
                return ((f) create((aa.o) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            default:
                return ((f) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
        }
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f14815j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f14816k;
                if (i11 != 0) {
                    if (i11 == 1) {
                        ba0.g.M(obj);
                        return obj;
                    }
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ba0.g.M(obj);
                this.f14816k = 1;
                InlineMarker.mark(6);
                Object objInvoke = this.f14817m.invoke(this);
                InlineMarker.mark(7);
                return objInvoke == aVar ? aVar : objInvoke;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f14816k;
                if (i12 != 0) {
                    if (i12 == 1) {
                        ba0.g.M(obj);
                        return obj;
                    }
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ba0.g.M(obj);
                this.f14816k = 1;
                InlineMarker.mark(6);
                Object objInvoke2 = this.f14817m.invoke(this);
                InlineMarker.mark(7);
                return objInvoke2 == aVar2 ? aVar2 : objInvoke2;
            default:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f14816k;
                if (i13 == 0) {
                    ba0.g.M(obj);
                    if (((b0) this.l).getCoroutineContext().get(c0.f45655b) != null) {
                        this.f14816k = 1;
                        Object objInvoke3 = this.f14817m.invoke(this);
                        return objInvoke3 == aVar3 ? aVar3 : objInvoke3;
                    }
                    h2.b("Expected a TransactionElement in the CoroutineContext but none was found.");
                } else {
                    if (i13 == 1) {
                        ba0.g.M(obj);
                        return obj;
                    }
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i11, Function1 function1, x70.c cVar) {
        super(2, cVar);
        this.f14815j = i11;
        this.f14817m = function1;
    }
}
