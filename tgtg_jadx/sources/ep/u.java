package ep;

import com.braze.h2;
import hp.e1;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y80.a2;
import y80.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class u extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f16326j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f16327k;
    public final /* synthetic */ d0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(d0 d0Var, x70.c cVar, int i11) {
        super(2, cVar);
        this.f16326j = i11;
        this.l = d0Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f16326j) {
            case 0:
                return new u(this.l, cVar, 0);
            case 1:
                return new u(this.l, cVar, 1);
            default:
                return new u(this.l, cVar, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f16326j) {
        }
        return ((u) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        Object objG;
        Object pVar;
        Object objL;
        int i11 = this.f16326j;
        d0 d0Var = this.l;
        switch (i11) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f16327k;
                if (i12 == 0) {
                    ba0.g.M(obj);
                    jp.q qVar = d0Var.f16241a;
                    this.f16327k = 1;
                    objG = qVar.g(this);
                    if (objG == aVar) {
                    }
                } else if (i12 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                    objG = ((u70.q) obj).f40851a;
                }
                u70.o oVar = u70.q.f40850b;
                if (!(objG instanceof u70.p)) {
                    hp.k kVar = (hp.k) objG;
                    kVar.getClass();
                    try {
                        pVar = hp.h.valueOf(kVar.f22298b);
                    } catch (Throwable th2) {
                        u70.o oVar2 = u70.q.f40850b;
                        pVar = new u70.p(th2);
                    }
                    if (pVar instanceof u70.p) {
                        pVar = null;
                    }
                    if (((hp.h) pVar) == hp.h.RATE_LIMIT_EXCEEDED) {
                        hp.a aVar2 = hp.a.RATE_LIMIT_REACHED;
                        aVar2.getClass();
                        a2 a2Var = d0Var.A;
                        a2Var.getClass();
                        a2Var.k(null, aVar2);
                        cv.i iVar = cv.i.SCREEN_FRIDGE_WARNING;
                        dv.a aVar3 = dv.a.TYPE;
                        dv.d dVar = dv.d.RECIPE_GENERATION_LIMIT_REACHED;
                        Pair pair = new Pair(aVar3, new dv.c(dVar != null ? dVar.a() : null));
                        dv.a aVar4 = dv.a.SCREEN_NAME;
                        dv.d dVar2 = dv.d.SCREEN_FRIDGE_INTRO;
                        d0Var.r(iVar, h0.g.E(pair, new Pair(aVar4, new dv.c(dVar2 != null ? dVar2.a() : null))));
                    }
                }
                if (u70.q.a(objG) != null) {
                    d0.i(d0Var);
                }
                break;
            case 1:
                y70.a aVar5 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f16327k;
                if (i13 == 0) {
                    ba0.g.M(obj);
                    m1 m1Var = d0Var.f16248h;
                    hp.r rVar = hp.r.INSTANCE;
                    this.f16327k = 1;
                    if (m1Var.emit(rVar, this) == aVar5) {
                    }
                } else if (i13 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                }
                break;
            default:
                y70.a aVar6 = y70.a.COROUTINE_SUSPENDED;
                int i14 = this.f16327k;
                if (i14 == 0) {
                    ba0.g.M(obj);
                    jp.q qVar2 = d0Var.f16241a;
                    this.f16327k = 1;
                    objL = qVar2.l(this);
                    if (objL == aVar6) {
                    }
                } else if (i14 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                    objL = ((u70.q) obj).f40851a;
                }
                u70.o oVar3 = u70.q.f40850b;
                if (!(objL instanceof u70.p)) {
                    d0Var.w(((e1) objL).f22271b);
                    d0Var.t();
                }
                if (u70.q.a(objL) != null) {
                    d0.i(d0Var);
                }
                break;
        }
        return Unit.f26487a;
    }
}
