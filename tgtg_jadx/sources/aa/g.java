package aa;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1100j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function2 f1101k;
    public final /* synthetic */ Ref.ObjectRef l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Function2 function2, Ref.ObjectRef objectRef, x70.c cVar) {
        super(2, cVar);
        this.f1101k = function2;
        this.l = objectRef;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new g(this.f1101k, this.l, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f1100j;
        if (i11 != 0) {
            if (i11 == 1) {
                ba0.g.M(obj);
                return obj;
            }
            h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ba0.g.M(obj);
        Object obj2 = this.l.element;
        this.f1100j = 1;
        Object objInvoke = this.f1101k.invoke(obj2, this);
        return objInvoke == aVar ? aVar : objInvoke;
    }
}
