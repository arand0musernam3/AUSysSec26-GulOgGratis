package da;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f14792j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f14793k;
    public final /* synthetic */ Function1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Function1 function1, x70.c cVar) {
        super(2, cVar);
        this.f14792j = 2;
        this.l = function1;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f14792j) {
            case 0:
                a aVar = new a(0, this.l, cVar);
                aVar.f14793k = obj;
                return aVar;
            case 1:
                a aVar2 = new a(1, this.l, cVar);
                aVar2.f14793k = obj;
                return aVar2;
            default:
                a aVar3 = new a(this.l, cVar);
                aVar3.f14793k = obj;
                return aVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14792j) {
            case 0:
                return ((a) create((aa.o) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 1:
                return ((a) create((aa.o) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            default:
                return ((a) create((h8.a) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
        }
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f14792j;
        Function1 function1 = this.l;
        switch (i11) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                aa.o oVar = (aa.o) this.f14793k;
                oVar.getClass();
                return function1.invoke(oVar.c());
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                aa.o oVar2 = (aa.o) this.f14793k;
                oVar2.getClass();
                return function1.invoke(oVar2.c());
            default:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                function1.invoke((h8.a) this.f14793k);
                return Unit.f26487a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i11, Function1 function1, x70.c cVar) {
        super(2, cVar);
        this.f14792j = i11;
        this.l = function1;
    }
}
