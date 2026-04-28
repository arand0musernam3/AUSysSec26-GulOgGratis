package oq;

import com.braze.h2;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends z70.i implements i80.n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f32916j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f32917k;
    public /* synthetic */ y80.j l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f32918m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ n f32919n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i11, n nVar, x70.c cVar) {
        super(3, cVar);
        this.f32916j = i11;
        this.f32919n = nVar;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        y80.j jVar = (y80.j) obj;
        x70.c cVar = (x70.c) obj3;
        switch (this.f32916j) {
            case 0:
                b bVar = new b(0, this.f32919n, cVar);
                bVar.l = jVar;
                bVar.f32918m = obj2;
                return bVar.invokeSuspend(Unit.f26487a);
            case 1:
                b bVar2 = new b(1, this.f32919n, cVar);
                bVar2.l = jVar;
                bVar2.f32918m = obj2;
                return bVar2.invokeSuspend(Unit.f26487a);
            case 2:
                b bVar3 = new b(2, this.f32919n, cVar);
                bVar3.l = jVar;
                bVar3.f32918m = obj2;
                return bVar3.invokeSuspend(Unit.f26487a);
            case 3:
                b bVar4 = new b(3, this.f32919n, cVar);
                bVar4.l = jVar;
                bVar4.f32918m = obj2;
                return bVar4.invokeSuspend(Unit.f26487a);
            case 4:
                b bVar5 = new b(4, this.f32919n, cVar);
                bVar5.l = jVar;
                bVar5.f32918m = obj2;
                return bVar5.invokeSuspend(Unit.f26487a);
            default:
                b bVar6 = new b(5, this.f32919n, cVar);
                bVar6.l = jVar;
                bVar6.f32918m = obj2;
                return bVar6.invokeSuspend(Unit.f26487a);
        }
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f32916j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f32917k;
                if (i11 != 0) {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    y80.j jVar = this.l;
                    at.o oVar = new at.o(new c(0, this.f32919n, null));
                    this.l = null;
                    this.f32918m = null;
                    this.f32917k = 1;
                    if (y80.r.n(jVar, oVar, this) == aVar) {
                    }
                }
                break;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f32917k;
                if (i12 != 0) {
                    if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    y80.j jVar2 = this.l;
                    at.o oVar2 = new at.o(new is.h(this.f32919n, (pq.b) this.f32918m, null, 22));
                    this.l = null;
                    this.f32918m = null;
                    this.f32917k = 1;
                    if (y80.r.n(jVar2, oVar2, this) == aVar2) {
                    }
                }
                break;
            case 2:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f32917k;
                if (i13 != 0) {
                    if (i13 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    y80.j jVar3 = this.l;
                    at.o oVar3 = new at.o(new i(this.f32919n, null));
                    this.l = null;
                    this.f32918m = null;
                    this.f32917k = 1;
                    if (y80.r.n(jVar3, oVar3, this) == aVar3) {
                    }
                }
                break;
            case 3:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                int i14 = this.f32917k;
                if (i14 != 0) {
                    if (i14 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    y80.j jVar4 = this.l;
                    at.o oVar4 = new at.o(new c(1, this.f32919n, null));
                    this.l = null;
                    this.f32918m = null;
                    this.f32917k = 1;
                    if (y80.r.n(jVar4, oVar4, this) == aVar4) {
                    }
                }
                break;
            case 4:
                y70.a aVar5 = y70.a.COROUTINE_SUSPENDED;
                int i15 = this.f32917k;
                if (i15 != 0) {
                    if (i15 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    y80.j jVar5 = this.l;
                    at.o oVar5 = new at.o(new c(2, this.f32919n, null));
                    this.l = null;
                    this.f32918m = null;
                    this.f32917k = 1;
                    if (y80.r.n(jVar5, oVar5, this) == aVar5) {
                    }
                }
                break;
            default:
                y70.a aVar6 = y70.a.COROUTINE_SUSPENDED;
                int i16 = this.f32917k;
                if (i16 != 0) {
                    if (i16 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    y80.j jVar6 = this.l;
                    at.o oVar6 = new at.o(new c(3, this.f32919n, null));
                    this.l = null;
                    this.f32918m = null;
                    this.f32917k = 1;
                    if (y80.r.n(jVar6, oVar6, this) == aVar6) {
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}
