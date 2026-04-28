package z1;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f46552j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f46553k;
    public final /* synthetic */ Function0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Function2 f46554m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Function0 function0, Function2 function2, x70.c cVar) {
        super(2, cVar);
        this.l = function0;
        this.f46554m = function2;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        j jVar = new j(this.l, this.f46554m, cVar);
        jVar.f46553k = obj;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f46552j;
        if (i11 == 0) {
            ba0.g.M(obj);
            v80.b0 b0Var = (v80.b0) this.f46553k;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            at.o oVarD = m3.i.D(this.l);
            i iVar = new i(objectRef, b0Var, this.f46554m);
            this.f46552j = 1;
            if (oVarD.collect(iVar, this) == aVar) {
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
