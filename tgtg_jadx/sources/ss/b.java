package ss;

import com.braze.h2;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends z70.i implements i80.n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f39131j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f39132k;
    public /* synthetic */ y80.j l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f39133m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ w f39134n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i11, w wVar, x70.c cVar) {
        super(3, cVar);
        this.f39131j = i11;
        this.f39134n = wVar;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        y80.j jVar = (y80.j) obj;
        x70.c cVar = (x70.c) obj3;
        switch (this.f39131j) {
            case 0:
                b bVar = new b(0, this.f39134n, cVar);
                bVar.l = jVar;
                bVar.f39133m = obj2;
                return bVar.invokeSuspend(Unit.f26487a);
            case 1:
                b bVar2 = new b(1, this.f39134n, cVar);
                bVar2.l = jVar;
                bVar2.f39133m = obj2;
                return bVar2.invokeSuspend(Unit.f26487a);
            case 2:
                b bVar3 = new b(2, this.f39134n, cVar);
                bVar3.l = jVar;
                bVar3.f39133m = obj2;
                return bVar3.invokeSuspend(Unit.f26487a);
            case 3:
                b bVar4 = new b(3, this.f39134n, cVar);
                bVar4.l = jVar;
                bVar4.f39133m = obj2;
                return bVar4.invokeSuspend(Unit.f26487a);
            case 4:
                b bVar5 = new b(4, this.f39134n, cVar);
                bVar5.l = jVar;
                bVar5.f39133m = obj2;
                return bVar5.invokeSuspend(Unit.f26487a);
            case 5:
                b bVar6 = new b(5, this.f39134n, cVar);
                bVar6.l = jVar;
                bVar6.f39133m = obj2;
                return bVar6.invokeSuspend(Unit.f26487a);
            case 6:
                b bVar7 = new b(6, this.f39134n, cVar);
                bVar7.l = jVar;
                bVar7.f39133m = obj2;
                return bVar7.invokeSuspend(Unit.f26487a);
            case 7:
                b bVar8 = new b(7, this.f39134n, cVar);
                bVar8.l = jVar;
                bVar8.f39133m = obj2;
                return bVar8.invokeSuspend(Unit.f26487a);
            case 8:
                b bVar9 = new b(8, this.f39134n, cVar);
                bVar9.l = jVar;
                bVar9.f39133m = obj2;
                return bVar9.invokeSuspend(Unit.f26487a);
            case 9:
                b bVar10 = new b(9, this.f39134n, cVar);
                bVar10.l = jVar;
                bVar10.f39133m = obj2;
                return bVar10.invokeSuspend(Unit.f26487a);
            case 10:
                b bVar11 = new b(10, this.f39134n, cVar);
                bVar11.l = jVar;
                bVar11.f39133m = obj2;
                return bVar11.invokeSuspend(Unit.f26487a);
            case 11:
                b bVar12 = new b(11, this.f39134n, cVar);
                bVar12.l = jVar;
                bVar12.f39133m = obj2;
                return bVar12.invokeSuspend(Unit.f26487a);
            case 12:
                b bVar13 = new b(12, this.f39134n, cVar);
                bVar13.l = jVar;
                bVar13.f39133m = obj2;
                return bVar13.invokeSuspend(Unit.f26487a);
            default:
                b bVar14 = new b(13, this.f39134n, cVar);
                bVar14.l = jVar;
                bVar14.f39133m = obj2;
                return bVar14.invokeSuspend(Unit.f26487a);
        }
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f39131j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f39132k;
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
                    at.o oVar = new at.o(new d(this.f39134n, (ts.m) this.f39133m, null));
                    this.l = null;
                    this.f39133m = null;
                    this.f39132k = 1;
                    if (y80.r.n(jVar, oVar, this) == aVar) {
                    }
                }
                break;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f39132k;
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
                    at.o oVar2 = new at.o(new f(0, this.f39134n, null));
                    this.l = null;
                    this.f39133m = null;
                    this.f39132k = 1;
                    if (y80.r.n(jVar2, oVar2, this) == aVar2) {
                    }
                }
                break;
            case 2:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f39132k;
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
                    at.o oVar3 = new at.o(new b0.i0(this.f39134n, null, 5));
                    this.l = null;
                    this.f39133m = null;
                    this.f39132k = 1;
                    if (y80.r.n(jVar3, oVar3, this) == aVar3) {
                    }
                }
                break;
            case 3:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                int i14 = this.f39132k;
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
                    at.o oVar4 = new at.o(new os.c(this.f39134n, (ts.p) this.f39133m, (x70.c) null, 6));
                    this.l = null;
                    this.f39133m = null;
                    this.f39132k = 1;
                    if (y80.r.n(jVar4, oVar4, this) == aVar4) {
                    }
                }
                break;
            case 4:
                y70.a aVar5 = y70.a.COROUTINE_SUSPENDED;
                int i15 = this.f39132k;
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
                    at.o oVar5 = new at.o(new nk.j((ts.q) this.f39133m, this.f39134n, (x70.c) null, 20));
                    this.l = null;
                    this.f39133m = null;
                    this.f39132k = 1;
                    if (y80.r.n(jVar5, oVar5, this) == aVar5) {
                    }
                }
                break;
            case 5:
                y70.a aVar6 = y70.a.COROUTINE_SUSPENDED;
                int i16 = this.f39132k;
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
                    at.o oVar6 = new at.o(new os.c((ts.r) this.f39133m, this.f39134n, (x70.c) null, 7));
                    this.l = null;
                    this.f39133m = null;
                    this.f39132k = 1;
                    if (y80.r.n(jVar6, oVar6, this) == aVar6) {
                    }
                }
                break;
            case 6:
                y70.a aVar7 = y70.a.COROUTINE_SUSPENDED;
                int i17 = this.f39132k;
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
                    at.o oVar7 = new at.o(new os.c(this.f39134n, (ts.s) this.f39133m, (x70.c) null, 8));
                    this.l = null;
                    this.f39133m = null;
                    this.f39132k = 1;
                    if (y80.r.n(jVar7, oVar7, this) == aVar7) {
                    }
                }
                break;
            case 7:
                y70.a aVar8 = y70.a.COROUTINE_SUSPENDED;
                int i18 = this.f39132k;
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
                    at.o oVar8 = new at.o(new nk.j((ts.t) this.f39133m, this.f39134n, (x70.c) null, 21));
                    this.l = null;
                    this.f39133m = null;
                    this.f39132k = 1;
                    if (y80.r.n(jVar8, oVar8, this) == aVar8) {
                    }
                }
                break;
            case 8:
                y70.a aVar9 = y70.a.COROUTINE_SUSPENDED;
                int i19 = this.f39132k;
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
                    at.o oVar9 = new at.o(new rf.c((ts.x) this.f39133m, this.f39134n, null, 6));
                    this.l = null;
                    this.f39133m = null;
                    this.f39132k = 1;
                    if (y80.r.n(jVar9, oVar9, this) == aVar9) {
                    }
                }
                break;
            case 9:
                y70.a aVar10 = y70.a.COROUTINE_SUSPENDED;
                int i21 = this.f39132k;
                if (i21 != 0) {
                    if (i21 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    y80.j jVar10 = this.l;
                    at.o oVar10 = new at.o(new f(1, this.f39134n, null));
                    this.l = null;
                    this.f39133m = null;
                    this.f39132k = 1;
                    if (y80.r.n(jVar10, oVar10, this) == aVar10) {
                    }
                }
                break;
            case 10:
                y70.a aVar11 = y70.a.COROUTINE_SUSPENDED;
                int i22 = this.f39132k;
                if (i22 != 0) {
                    if (i22 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    y80.j jVar11 = this.l;
                    at.o oVar11 = new at.o(new nk.j(this.f39134n, (ts.v) this.f39133m, (x70.c) null, 22));
                    this.l = null;
                    this.f39133m = null;
                    this.f39132k = 1;
                    if (y80.r.n(jVar11, oVar11, this) == aVar11) {
                    }
                }
                break;
            case 11:
                y70.a aVar12 = y70.a.COROUTINE_SUSPENDED;
                int i23 = this.f39132k;
                if (i23 != 0) {
                    if (i23 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    y80.j jVar12 = this.l;
                    at.o oVar12 = new at.o(new nk.j(this.f39134n, (ts.y) this.f39133m, (x70.c) null, 23));
                    this.l = null;
                    this.f39133m = null;
                    this.f39132k = 1;
                    if (y80.r.n(jVar12, oVar12, this) == aVar12) {
                    }
                }
                break;
            case 12:
                y70.a aVar13 = y70.a.COROUTINE_SUSPENDED;
                int i24 = this.f39132k;
                if (i24 != 0) {
                    if (i24 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    y80.j jVar13 = this.l;
                    at.o oVar13 = new at.o(new af.b(this.f39134n, null));
                    this.l = null;
                    this.f39133m = null;
                    this.f39132k = 1;
                    if (y80.r.n(jVar13, oVar13, this) == aVar13) {
                    }
                }
                break;
            default:
                y70.a aVar14 = y70.a.COROUTINE_SUSPENDED;
                int i25 = this.f39132k;
                if (i25 != 0) {
                    if (i25 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    y80.j jVar14 = this.l;
                    at.o oVar14 = new at.o(new nk.j(this.f39134n, (ts.a0) this.f39133m, (x70.c) null, 24));
                    this.l = null;
                    this.f39133m = null;
                    this.f39132k = 1;
                    if (y80.r.n(jVar14, oVar14, this) == aVar14) {
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}
