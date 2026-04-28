package nk;

import com.braze.h2;
import f0.f2;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends z70.i implements i80.n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f30997j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f30998k;
    public /* synthetic */ y80.j l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f30999m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ f2 f31000n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(x70.c cVar, f2 f2Var, int i11) {
        super(3, cVar);
        this.f30997j = i11;
        this.f31000n = f2Var;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        y80.j jVar = (y80.j) obj;
        x70.c cVar = (x70.c) obj3;
        switch (this.f30997j) {
            case 0:
                i iVar = new i(cVar, this.f31000n, 0);
                iVar.l = jVar;
                iVar.f30999m = obj2;
                return iVar.invokeSuspend(Unit.f26487a);
            case 1:
                i iVar2 = new i(cVar, this.f31000n, 1);
                iVar2.l = jVar;
                iVar2.f30999m = obj2;
                return iVar2.invokeSuspend(Unit.f26487a);
            case 2:
                i iVar3 = new i(cVar, this.f31000n, 2);
                iVar3.l = jVar;
                iVar3.f30999m = obj2;
                return iVar3.invokeSuspend(Unit.f26487a);
            case 3:
                i iVar4 = new i(cVar, this.f31000n, 3);
                iVar4.l = jVar;
                iVar4.f30999m = obj2;
                return iVar4.invokeSuspend(Unit.f26487a);
            case 4:
                i iVar5 = new i(cVar, this.f31000n, 4);
                iVar5.l = jVar;
                iVar5.f30999m = obj2;
                return iVar5.invokeSuspend(Unit.f26487a);
            case 5:
                i iVar6 = new i(cVar, this.f31000n, 5);
                iVar6.l = jVar;
                iVar6.f30999m = obj2;
                return iVar6.invokeSuspend(Unit.f26487a);
            case 6:
                i iVar7 = new i(cVar, this.f31000n, 6);
                iVar7.l = jVar;
                iVar7.f30999m = obj2;
                return iVar7.invokeSuspend(Unit.f26487a);
            case 7:
                i iVar8 = new i(cVar, this.f31000n, 7);
                iVar8.l = jVar;
                iVar8.f30999m = obj2;
                return iVar8.invokeSuspend(Unit.f26487a);
            case 8:
                i iVar9 = new i(cVar, this.f31000n, 8);
                iVar9.l = jVar;
                iVar9.f30999m = obj2;
                return iVar9.invokeSuspend(Unit.f26487a);
            case 9:
                i iVar10 = new i(cVar, this.f31000n, 9);
                iVar10.l = jVar;
                iVar10.f30999m = obj2;
                return iVar10.invokeSuspend(Unit.f26487a);
            case 10:
                i iVar11 = new i(cVar, this.f31000n, 10);
                iVar11.l = jVar;
                iVar11.f30999m = obj2;
                return iVar11.invokeSuspend(Unit.f26487a);
            default:
                i iVar12 = new i(cVar, this.f31000n, 11);
                iVar12.l = jVar;
                iVar12.f30999m = obj2;
                return iVar12.invokeSuspend(Unit.f26487a);
        }
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f30997j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f30998k;
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
                    at.o oVar = new at.o(new j((ok.b) this.f30999m, this.f31000n, (x70.c) null, 0));
                    this.l = null;
                    this.f30999m = null;
                    this.f30998k = 1;
                    if (y80.r.n(jVar, oVar, this) == aVar) {
                    }
                }
                break;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f30998k;
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
                    at.o oVar2 = new at.o(new j(this.f31000n, this.f30999m, (x70.c) null, 1));
                    this.l = null;
                    this.f30999m = null;
                    this.f30998k = 1;
                    if (y80.r.n(jVar2, oVar2, this) == aVar2) {
                    }
                }
                break;
            case 2:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f30998k;
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
                    at.o oVar3 = new at.o(new is.h(this.f31000n, (ok.i) this.f30999m, null, 12));
                    this.l = null;
                    this.f30999m = null;
                    this.f30998k = 1;
                    if (y80.r.n(jVar3, oVar3, this) == aVar3) {
                    }
                }
                break;
            case 3:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                int i14 = this.f30998k;
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
                    at.o oVar4 = new at.o(new r(this.f31000n, (ok.k) this.f30999m, null));
                    this.l = null;
                    this.f30999m = null;
                    this.f30998k = 1;
                    if (y80.r.n(jVar4, oVar4, this) == aVar4) {
                    }
                }
                break;
            case 4:
                y70.a aVar5 = y70.a.COROUTINE_SUSPENDED;
                int i15 = this.f30998k;
                if (i15 == 0) {
                    ba0.g.M(obj);
                    y80.j jVar5 = this.l;
                    if (this.f30999m != null) {
                        org.bouncycastle.jce.provider.a.c();
                    } else {
                        at.o oVar5 = new at.o(new a3.y(this.f31000n, (x70.c) null, 19));
                        this.l = null;
                        this.f30999m = null;
                        this.f30998k = 1;
                        if (y80.r.n(jVar5, oVar5, this) == aVar5) {
                        }
                    }
                } else if (i15 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                }
                break;
            case 5:
                y70.a aVar6 = y70.a.COROUTINE_SUSPENDED;
                int i16 = this.f30998k;
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
                    at.o oVar6 = new at.o(new j(this.f31000n, null, 2));
                    this.l = null;
                    this.f30999m = null;
                    this.f30998k = 1;
                    if (y80.r.n(jVar6, oVar6, this) == aVar6) {
                    }
                }
                break;
            case 6:
                y70.a aVar7 = y70.a.COROUTINE_SUSPENDED;
                int i17 = this.f30998k;
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
                    at.o oVar7 = new at.o(new is.h(this.f31000n, (ok.o) this.f30999m, null, 14));
                    this.l = null;
                    this.f30999m = null;
                    this.f30998k = 1;
                    if (y80.r.n(jVar7, oVar7, this) == aVar7) {
                    }
                }
                break;
            case 7:
                y70.a aVar8 = y70.a.COROUTINE_SUSPENDED;
                int i18 = this.f30998k;
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
                    at.o oVar8 = new at.o(new is.h((ok.n) this.f30999m, this.f31000n, null, 15));
                    this.l = null;
                    this.f30999m = null;
                    this.f30998k = 1;
                    if (y80.r.n(jVar8, oVar8, this) == aVar8) {
                    }
                }
                break;
            case 8:
                y70.a aVar9 = y70.a.COROUTINE_SUSPENDED;
                int i19 = this.f30998k;
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
                    at.o oVar9 = new at.o(new j(this.f31000n, this.f30999m, (x70.c) null, 3));
                    this.l = null;
                    this.f30999m = null;
                    this.f30998k = 1;
                    if (y80.r.n(jVar9, oVar9, this) == aVar9) {
                    }
                }
                break;
            case 9:
                y70.a aVar10 = y70.a.COROUTINE_SUSPENDED;
                int i21 = this.f30998k;
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
                    at.o oVar10 = new at.o(new is.h((ok.p) this.f30999m, this.f31000n, null, 16));
                    this.l = null;
                    this.f30999m = null;
                    this.f30998k = 1;
                    if (y80.r.n(jVar10, oVar10, this) == aVar10) {
                    }
                }
                break;
            case 10:
                y70.a aVar11 = y70.a.COROUTINE_SUSPENDED;
                int i22 = this.f30998k;
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
                    at.o oVar11 = new at.o(new cj.a0(this.f31000n, (ok.f) this.f30999m, null));
                    this.l = null;
                    this.f30999m = null;
                    this.f30998k = 1;
                    if (y80.r.n(jVar11, oVar11, this) == aVar11) {
                    }
                }
                break;
            default:
                y70.a aVar12 = y70.a.COROUTINE_SUSPENDED;
                int i23 = this.f30998k;
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
                    at.o oVar12 = new at.o(new j(this.f31000n, this.f30999m, (x70.c) null, 4));
                    this.l = null;
                    this.f30999m = null;
                    this.f30998k = 1;
                    if (y80.r.n(jVar12, oVar12, this) == aVar12) {
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}
