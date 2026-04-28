package f0;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q2 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f16852j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f16853k;
    public final /* synthetic */ long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f16854m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f16855n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q2(h0.n nVar, Function1 function1, long j9, x70.c cVar) {
        super(2, cVar);
        this.f16854m = nVar;
        this.f16855n = (z70.i) function1;
        this.l = j9;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [kotlin.jvm.functions.Function1, z70.i] */
    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f16852j) {
            case 0:
                q2 q2Var = new q2(this.l, (s2) this.f16855n, cVar);
                q2Var.f16854m = obj;
                return q2Var;
            case 1:
                return new q2((h0.n) this.f16854m, (Function1) this.f16855n, this.l, cVar);
            case 2:
                return new q2((s1.f1) this.f16854m, this.l, (s1.h1) this.f16855n, cVar);
            default:
                q2 q2Var2 = new q2((z1.k1) this.f16855n, this.l, cVar);
                q2Var2.f16854m = obj;
                return q2Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f16852j) {
        }
        return ((q2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.jvm.functions.Function1, z70.i] */
    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        Object objC;
        int i11 = this.f16852j;
        long j9 = this.l;
        Object obj2 = this.f16855n;
        x70.c cVar = null;
        switch (i11) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f16853k;
                if (i12 == 0) {
                    ba0.g.M(obj);
                    Log.d("CXCP", "Finalizing " + ((v80.b0) this.f16854m) + " in " + j9 + " ms");
                    this.f16853k = 1;
                    if (v80.f0.o(j9, this) == aVar) {
                    }
                } else if (i12 != 1) {
                    com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                }
                ((s2) obj2).n(0L);
                break;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f16853k;
                if (i13 != 0) {
                    if (i13 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    h0.n nVar = (h0.n) this.f16854m;
                    a3.b2 b2Var = new a3.b2(v80.f0.f(nVar.f20982b, nVar.f20986f, null, new a3.r3(1, (z70.i) obj2, null), 2), cVar, 28);
                    this.f16853k = 1;
                    Object objC2 = v80.j2.c(j9, b2Var, this);
                    if (objC2 != aVar2) {
                        break;
                    }
                }
                break;
            case 2:
                s1.h1 h1Var = (s1.h1) obj2;
                s1.f1 f1Var = (s1.f1) this.f16854m;
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i14 = this.f16853k;
                if (i14 == 0) {
                    ba0.g.M(obj);
                    t1.b bVar = f1Var.f38588a;
                    z5.l lVar = new z5.l(j9);
                    t1.i iVar = h1Var.f38608p;
                    this.f16853k = 1;
                    objC = t1.b.c(bVar, lVar, iVar, null, this, 12);
                    if (objC == aVar3) {
                    }
                } else if (i14 != 1) {
                    com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                    objC = obj;
                }
                t1.f fVar = ((t1.g) objC).f39433b;
                t1.f fVar2 = t1.f.BoundReached;
                break;
            default:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                int i15 = this.f16853k;
                if (i15 == 0) {
                    ba0.g.M(obj);
                    v80.b0 b0Var = (v80.b0) this.f16854m;
                    i80.n nVar2 = ((z1.k1) obj2).L;
                    h4.b bVar2 = new h4.b(j9);
                    this.f16853k = 1;
                    if (nVar2.invoke(b0Var, bVar2, this) == aVar4) {
                    }
                } else if (i15 != 1) {
                    com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                }
                break;
        }
        return Unit.f26487a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(long j9, s2 s2Var, x70.c cVar) {
        super(2, cVar);
        this.l = j9;
        this.f16855n = s2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(s1.f1 f1Var, long j9, s1.h1 h1Var, x70.c cVar) {
        super(2, cVar);
        this.f16854m = f1Var;
        this.l = j9;
        this.f16855n = h1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(z1.k1 k1Var, long j9, x70.c cVar) {
        super(2, cVar);
        this.f16855n = k1Var;
        this.l = j9;
    }
}
