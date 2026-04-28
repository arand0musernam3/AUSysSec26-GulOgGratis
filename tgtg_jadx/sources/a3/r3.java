package a3;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r3 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f547j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f548k;
    public final /* synthetic */ z70.i l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r3(int i11, Function1 function1, x70.c cVar) {
        super(2, cVar);
        this.f547j = i11;
        switch (i11) {
            case 1:
                this.l = (z70.i) function1;
                super(2, cVar);
                break;
            case 2:
                this.l = (z70.i) function1;
                super(2, cVar);
                break;
            default:
                this.l = (z70.i) function1;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, z70.i] */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1, z70.i] */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function1, z70.i] */
    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f547j) {
            case 0:
                return new r3(0, this.l, cVar);
            case 1:
                return new r3(1, this.l, cVar);
            default:
                return new r3(2, this.l, cVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f547j) {
        }
        return ((r3) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.functions.Function1, z70.i] */
    /* JADX WARN: Type inference failed for: r4v4, types: [kotlin.jvm.functions.Function1, z70.i] */
    /* JADX WARN: Type inference failed for: r4v9, types: [kotlin.jvm.functions.Function1, z70.i] */
    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f547j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f548k;
                if (i11 == 0) {
                    ba0.g.M(obj);
                    this.f548k = 1;
                    if (this.l.invoke(this) == aVar) {
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
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f548k;
                if (i12 == 0) {
                    ba0.g.M(obj);
                    this.f548k = 1;
                    Object objInvoke = this.l.invoke(this);
                    return objInvoke == aVar2 ? aVar2 : objInvoke;
                }
                if (i12 == 1) {
                    ba0.g.M(obj);
                    return obj;
                }
                com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f548k;
                if (i13 == 0) {
                    ba0.g.M(obj);
                    this.f548k = 1;
                    if (this.l.invoke(this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i13 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                return Unit.f26487a;
        }
    }
}
