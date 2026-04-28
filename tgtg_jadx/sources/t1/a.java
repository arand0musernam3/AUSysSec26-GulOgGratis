package t1;

import com.braze.h2;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends z70.i implements Function1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public j f39345j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Ref.BooleanRef f39346k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f39347m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f39348n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k1 f39349o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f39350p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Function1 f39351q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Object obj, k1 k1Var, long j9, Function1 function1, x70.c cVar) {
        super(1, cVar);
        this.f39347m = bVar;
        this.f39348n = obj;
        this.f39349o = k1Var;
        this.f39350p = j9;
        this.f39351q = function1;
    }

    @Override // z70.a
    public final x70.c create(x70.c cVar) {
        return new a(this.f39347m, this.f39348n, this.f39349o, this.f39350p, this.f39351q, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((a) create((x70.c) obj)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        j jVar;
        Ref.BooleanRef booleanRef;
        k1 k1Var = this.f39349o;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.l;
        b bVar = this.f39347m;
        try {
            if (i11 == 0) {
                ba0.g.M(obj);
                bVar.f39359c.f39465c = (o) bVar.f39357a.f39591a.invoke(this.f39348n);
                bVar.f39361e.setValue(k1Var.f39475c);
                bVar.f39360d.setValue(Boolean.TRUE);
                j jVar2 = bVar.f39359c;
                j jVar3 = new j(jVar2.f39463a, jVar2.f39464b.getValue(), c.e(jVar2.f39465c), jVar2.f39466d, Long.MIN_VALUE, jVar2.f39468f);
                Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                long j9 = this.f39350p;
                b0.x1 x1Var = new b0.x1(27, bVar, jVar3, this.f39351q, booleanRef2);
                this.f39345j = jVar3;
                this.f39346k = booleanRef2;
                this.l = 1;
                if (j1.b(jVar3, k1Var, j9, x1Var, this) == aVar) {
                    return aVar;
                }
                jVar = jVar3;
                booleanRef = booleanRef2;
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                booleanRef = this.f39346k;
                jVar = this.f39345j;
                ba0.g.M(obj);
            }
            f fVar = booleanRef.element ? f.BoundReached : f.Finished;
            b.b(bVar);
            return new g(jVar, fVar);
        } catch (CancellationException e5) {
            b.b(bVar);
            throw e5;
        }
    }
}
