package mv;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f30180j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f30181k;
    public final /* synthetic */ z70.i l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Function1 f30182m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f30183n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(Function2 function2, Function1 function1, long j9, x70.c cVar, int i11) {
        super(2, cVar);
        this.f30180j = i11;
        switch (i11) {
            case 1:
                this.l = (z70.i) function2;
                this.f30182m = function1;
                this.f30183n = j9;
                super(2, cVar);
                break;
            case 2:
                this.l = (z70.i) function2;
                this.f30182m = function1;
                this.f30183n = j9;
                super(2, cVar);
                break;
            default:
                this.l = (z70.i) function2;
                this.f30182m = function1;
                this.f30183n = j9;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.functions.Function2, z70.i] */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function2, z70.i] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.functions.Function2, z70.i] */
    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f30180j) {
            case 0:
                return new f(this.l, this.f30182m, this.f30183n, cVar, 0);
            case 1:
                return new f(this.l, this.f30182m, this.f30183n, cVar, 1);
            default:
                return new f(this.l, this.f30182m, this.f30183n, cVar, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f30180j) {
            case 0:
                return ((f) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 1:
                return ((f) create((y80.j) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            default:
                return ((f) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
        }
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.jvm.functions.Function2, z70.i] */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.jvm.functions.Function2, z70.i] */
    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f30180j;
        long j9 = this.f30183n;
        Function1 function1 = this.f30182m;
        ?? r52 = this.l;
        switch (i11) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f30181k;
                if (i12 == 0) {
                    ba0.g.M(obj);
                    Object objInvoke = function1.invoke(new Long(j9));
                    this.f30181k = 1;
                    if (r52.invoke(objInvoke, this) == aVar) {
                    }
                } else if (i12 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                }
                break;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f30181k;
                if (i13 == 0) {
                    ba0.g.M(obj);
                    c90.f fVar = v80.p0.f42144a;
                    w80.c cVar = a90.p.f1044a;
                    f fVar2 = new f(this.l, this.f30182m, this.f30183n, null, 0);
                    this.f30181k = 1;
                    if (v80.f0.K(cVar, fVar2, this) == aVar2) {
                    }
                } else if (i13 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                }
                break;
            default:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i14 = this.f30181k;
                if (i14 == 0) {
                    ba0.g.M(obj);
                    Object objInvoke2 = function1.invoke(new Long(j9));
                    this.f30181k = 1;
                    if (r52.invoke(objInvoke2, this) == aVar3) {
                    }
                } else if (i14 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                }
                break;
        }
        return Unit.f26487a;
    }
}
