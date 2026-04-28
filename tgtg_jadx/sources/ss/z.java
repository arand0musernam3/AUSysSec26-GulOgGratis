package ss;

import com.braze.h2;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class z extends z70.i implements i80.n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f39273j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f39274k;
    public /* synthetic */ y80.j l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f39275m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ w0 f39276n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(int i11, w0 w0Var, x70.c cVar) {
        super(3, cVar);
        this.f39273j = i11;
        this.f39276n = w0Var;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        y80.j jVar = (y80.j) obj;
        x70.c cVar = (x70.c) obj3;
        switch (this.f39273j) {
            case 0:
                z zVar = new z(0, this.f39276n, cVar);
                zVar.l = jVar;
                zVar.f39275m = obj2;
                return zVar.invokeSuspend(Unit.f26487a);
            case 1:
                z zVar2 = new z(1, this.f39276n, cVar);
                zVar2.l = jVar;
                zVar2.f39275m = obj2;
                return zVar2.invokeSuspend(Unit.f26487a);
            case 2:
                z zVar3 = new z(2, this.f39276n, cVar);
                zVar3.l = jVar;
                zVar3.f39275m = obj2;
                return zVar3.invokeSuspend(Unit.f26487a);
            case 3:
                z zVar4 = new z(3, this.f39276n, cVar);
                zVar4.l = jVar;
                zVar4.f39275m = obj2;
                return zVar4.invokeSuspend(Unit.f26487a);
            case 4:
                z zVar5 = new z(4, this.f39276n, cVar);
                zVar5.l = jVar;
                zVar5.f39275m = obj2;
                return zVar5.invokeSuspend(Unit.f26487a);
            case 5:
                z zVar6 = new z(5, this.f39276n, cVar);
                zVar6.l = jVar;
                zVar6.f39275m = obj2;
                return zVar6.invokeSuspend(Unit.f26487a);
            case 6:
                z zVar7 = new z(6, this.f39276n, cVar);
                zVar7.l = jVar;
                zVar7.f39275m = obj2;
                return zVar7.invokeSuspend(Unit.f26487a);
            case 7:
                z zVar8 = new z(7, this.f39276n, cVar);
                zVar8.l = jVar;
                zVar8.f39275m = obj2;
                return zVar8.invokeSuspend(Unit.f26487a);
            default:
                z zVar9 = new z(8, this.f39276n, cVar);
                zVar9.l = jVar;
                zVar9.f39275m = obj2;
                return zVar9.invokeSuspend(Unit.f26487a);
        }
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f39273j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f39274k;
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
                    at.o oVar = new at.o(new b0(this.f39276n, (ts.a) this.f39275m, null));
                    this.l = null;
                    this.f39275m = null;
                    this.f39274k = 1;
                    if (y80.r.n(jVar, oVar, this) == aVar) {
                    }
                }
                break;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f39274k;
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
                    at.o oVar2 = new at.o(new os.c(this.f39276n, (ts.d) this.f39275m, (x70.c) null, 9));
                    this.l = null;
                    this.f39275m = null;
                    this.f39274k = 1;
                    if (y80.r.n(jVar2, oVar2, this) == aVar2) {
                    }
                }
                break;
            case 2:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f39274k;
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
                    at.o oVar3 = new at.o(new nk.j((ts.e) this.f39275m, this.f39276n, (x70.c) null, 25));
                    this.l = null;
                    this.f39275m = null;
                    this.f39274k = 1;
                    if (y80.r.n(jVar3, oVar3, this) == aVar3) {
                    }
                }
                break;
            case 3:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                int i14 = this.f39274k;
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
                    at.o oVar4 = new at.o(new os.c(this.f39276n, (ts.f) this.f39275m, (x70.c) null, 10));
                    this.l = null;
                    this.f39275m = null;
                    this.f39274k = 1;
                    if (y80.r.n(jVar4, oVar4, this) == aVar4) {
                    }
                }
                break;
            case 4:
                y70.a aVar5 = y70.a.COROUTINE_SUSPENDED;
                int i15 = this.f39274k;
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
                    at.o oVar5 = new at.o(new os.c(this.f39276n, (ts.g) this.f39275m, (x70.c) null, 11));
                    this.l = null;
                    this.f39275m = null;
                    this.f39274k = 1;
                    if (y80.r.n(jVar5, oVar5, this) == aVar5) {
                    }
                }
                break;
            case 5:
                y70.a aVar6 = y70.a.COROUTINE_SUSPENDED;
                int i16 = this.f39274k;
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
                    at.o oVar6 = new at.o(new nk.j(this.f39276n, (ts.h) this.f39275m, (x70.c) null, 26));
                    this.l = null;
                    this.f39275m = null;
                    this.f39274k = 1;
                    if (y80.r.n(jVar6, oVar6, this) == aVar6) {
                    }
                }
                break;
            case 6:
                y70.a aVar7 = y70.a.COROUTINE_SUSPENDED;
                int i17 = this.f39274k;
                if (i17 != 0) {
                    if (i17 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    y80.j jVar7 = this.l;
                    at.o oVar7 = new at.o(new rf.c((ts.l) this.f39275m, this.f39276n, null, 8));
                    this.l = null;
                    this.f39275m = null;
                    this.f39274k = 1;
                    if (y80.r.n(jVar7, oVar7, this) == aVar7) {
                    }
                }
                break;
            case 7:
                y70.a aVar8 = y70.a.COROUTINE_SUSPENDED;
                int i18 = this.f39274k;
                if (i18 != 0) {
                    if (i18 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    y80.j jVar8 = this.l;
                    at.o oVar8 = new at.o(new mn.g(this.f39276n, null, 28));
                    this.l = null;
                    this.f39275m = null;
                    this.f39274k = 1;
                    if (y80.r.n(jVar8, oVar8, this) == aVar8) {
                    }
                }
                break;
            default:
                y70.a aVar9 = y70.a.COROUTINE_SUSPENDED;
                int i19 = this.f39274k;
                if (i19 != 0) {
                    if (i19 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    y80.j jVar9 = this.l;
                    at.o oVar9 = new at.o(new nk.j(this.f39276n, (ts.j) this.f39275m, (x70.c) null, 27));
                    this.l = null;
                    this.f39275m = null;
                    this.f39274k = 1;
                    if (y80.r.n(jVar9, oVar9, this) == aVar9) {
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}
