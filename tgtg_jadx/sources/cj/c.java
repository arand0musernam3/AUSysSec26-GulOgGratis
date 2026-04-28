package cj;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y80.a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f8180j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8181k;
    public final /* synthetic */ q l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(q qVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f8180j = i11;
        this.l = qVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f8180j) {
            case 0:
                return new c(this.l, cVar, 0);
            case 1:
                return new c(this.l, cVar, 1);
            case 2:
                return new c(this.l, cVar, 2);
            case 3:
                return new c(this.l, cVar, 3);
            case 4:
                return new c(this.l, cVar, 4);
            case 5:
                return new c(this.l, cVar, 5);
            default:
                return new c(this.l, cVar, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f8180j) {
        }
        return ((c) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f8180j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f8181k;
                if (i11 != 0) {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    a2 a2Var = this.l.f8352n;
                    this.f8181k = 1;
                    a2Var.j(null);
                    if (Unit.f26487a == aVar) {
                    }
                }
                break;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f8181k;
                if (i12 != 0) {
                    if (i12 == 1 || i12 == 2) {
                        ba0.g.M(obj);
                    } else {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    q qVar = this.l;
                    boolean z11 = qVar.f8334b0;
                    String str = qVar.f8332a0;
                    if (z11) {
                        this.f8181k = 1;
                        if (q.a(qVar, str, this) == aVar2) {
                        }
                    } else {
                        this.f8181k = 2;
                        if (qVar.e(str, this) == aVar2) {
                        }
                    }
                }
                break;
            case 2:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f8181k;
                q qVar2 = this.l;
                switch (i13) {
                    case 0:
                        ba0.g.M(obj);
                        a2 a2Var2 = qVar2.f8358t;
                        Integer num = new Integer(1);
                        this.f8181k = 1;
                        a2Var2.getClass();
                        a2Var2.k(null, num);
                        if (Unit.f26487a == aVar3) {
                        }
                        a2 a2Var3 = qVar2.f8347i;
                        this.f8181k = 2;
                        a2Var3.j(null);
                        if (Unit.f26487a == aVar3) {
                        }
                        a2 a2Var4 = qVar2.f8354p;
                        this.f8181k = 3;
                        a2Var4.getClass();
                        a2Var4.k(null, aj.m.f1505a);
                        if (Unit.f26487a == aVar3) {
                        }
                        a2 a2Var5 = qVar2.f8356r;
                        Boolean bool = Boolean.FALSE;
                        this.f8181k = 4;
                        a2Var5.getClass();
                        a2Var5.k(null, bool);
                        if (Unit.f26487a == aVar3) {
                        }
                        a2 a2Var6 = qVar2.f8352n;
                        this.f8181k = 5;
                        a2Var6.j(null);
                        if (Unit.f26487a == aVar3) {
                        }
                        a2 a2Var7 = qVar2.l;
                        kotlin.collections.n0 n0Var = kotlin.collections.n0.f26529a;
                        this.f8181k = 6;
                        a2Var7.j(n0Var);
                        if (Unit.f26487a == aVar3) {
                        }
                        qVar2.Q = false;
                        qVar2.T = 1;
                        qVar2.U = 5;
                        qVar2.V = null;
                        qVar2.f8360v = null;
                        qVar2.f8336c0 = null;
                        a2 a2Var8 = qVar2.F;
                        Boolean bool2 = Boolean.FALSE;
                        this.f8181k = 7;
                        a2Var8.getClass();
                        a2Var8.k(null, bool2);
                        if (Unit.f26487a == aVar3) {
                        }
                        qVar2.N = null;
                        qVar2.O = false;
                        break;
                    case 1:
                        ba0.g.M(obj);
                        a2 a2Var32 = qVar2.f8347i;
                        this.f8181k = 2;
                        a2Var32.j(null);
                        if (Unit.f26487a == aVar3) {
                        }
                        a2 a2Var42 = qVar2.f8354p;
                        this.f8181k = 3;
                        a2Var42.getClass();
                        a2Var42.k(null, aj.m.f1505a);
                        if (Unit.f26487a == aVar3) {
                        }
                        a2 a2Var52 = qVar2.f8356r;
                        Boolean bool3 = Boolean.FALSE;
                        this.f8181k = 4;
                        a2Var52.getClass();
                        a2Var52.k(null, bool3);
                        if (Unit.f26487a == aVar3) {
                        }
                        a2 a2Var62 = qVar2.f8352n;
                        this.f8181k = 5;
                        a2Var62.j(null);
                        if (Unit.f26487a == aVar3) {
                        }
                        a2 a2Var72 = qVar2.l;
                        kotlin.collections.n0 n0Var2 = kotlin.collections.n0.f26529a;
                        this.f8181k = 6;
                        a2Var72.j(n0Var2);
                        if (Unit.f26487a == aVar3) {
                        }
                        qVar2.Q = false;
                        qVar2.T = 1;
                        qVar2.U = 5;
                        qVar2.V = null;
                        qVar2.f8360v = null;
                        qVar2.f8336c0 = null;
                        a2 a2Var82 = qVar2.F;
                        Boolean bool22 = Boolean.FALSE;
                        this.f8181k = 7;
                        a2Var82.getClass();
                        a2Var82.k(null, bool22);
                        if (Unit.f26487a == aVar3) {
                        }
                        qVar2.N = null;
                        qVar2.O = false;
                        break;
                    case 2:
                        ba0.g.M(obj);
                        a2 a2Var422 = qVar2.f8354p;
                        this.f8181k = 3;
                        a2Var422.getClass();
                        a2Var422.k(null, aj.m.f1505a);
                        if (Unit.f26487a == aVar3) {
                        }
                        a2 a2Var522 = qVar2.f8356r;
                        Boolean bool32 = Boolean.FALSE;
                        this.f8181k = 4;
                        a2Var522.getClass();
                        a2Var522.k(null, bool32);
                        if (Unit.f26487a == aVar3) {
                        }
                        a2 a2Var622 = qVar2.f8352n;
                        this.f8181k = 5;
                        a2Var622.j(null);
                        if (Unit.f26487a == aVar3) {
                        }
                        a2 a2Var722 = qVar2.l;
                        kotlin.collections.n0 n0Var22 = kotlin.collections.n0.f26529a;
                        this.f8181k = 6;
                        a2Var722.j(n0Var22);
                        if (Unit.f26487a == aVar3) {
                        }
                        qVar2.Q = false;
                        qVar2.T = 1;
                        qVar2.U = 5;
                        qVar2.V = null;
                        qVar2.f8360v = null;
                        qVar2.f8336c0 = null;
                        a2 a2Var822 = qVar2.F;
                        Boolean bool222 = Boolean.FALSE;
                        this.f8181k = 7;
                        a2Var822.getClass();
                        a2Var822.k(null, bool222);
                        if (Unit.f26487a == aVar3) {
                        }
                        qVar2.N = null;
                        qVar2.O = false;
                        break;
                    case 3:
                        ba0.g.M(obj);
                        a2 a2Var5222 = qVar2.f8356r;
                        Boolean bool322 = Boolean.FALSE;
                        this.f8181k = 4;
                        a2Var5222.getClass();
                        a2Var5222.k(null, bool322);
                        if (Unit.f26487a == aVar3) {
                        }
                        a2 a2Var6222 = qVar2.f8352n;
                        this.f8181k = 5;
                        a2Var6222.j(null);
                        if (Unit.f26487a == aVar3) {
                        }
                        a2 a2Var7222 = qVar2.l;
                        kotlin.collections.n0 n0Var222 = kotlin.collections.n0.f26529a;
                        this.f8181k = 6;
                        a2Var7222.j(n0Var222);
                        if (Unit.f26487a == aVar3) {
                        }
                        qVar2.Q = false;
                        qVar2.T = 1;
                        qVar2.U = 5;
                        qVar2.V = null;
                        qVar2.f8360v = null;
                        qVar2.f8336c0 = null;
                        a2 a2Var8222 = qVar2.F;
                        Boolean bool2222 = Boolean.FALSE;
                        this.f8181k = 7;
                        a2Var8222.getClass();
                        a2Var8222.k(null, bool2222);
                        if (Unit.f26487a == aVar3) {
                        }
                        qVar2.N = null;
                        qVar2.O = false;
                        break;
                    case 4:
                        ba0.g.M(obj);
                        a2 a2Var62222 = qVar2.f8352n;
                        this.f8181k = 5;
                        a2Var62222.j(null);
                        if (Unit.f26487a == aVar3) {
                        }
                        a2 a2Var72222 = qVar2.l;
                        kotlin.collections.n0 n0Var2222 = kotlin.collections.n0.f26529a;
                        this.f8181k = 6;
                        a2Var72222.j(n0Var2222);
                        if (Unit.f26487a == aVar3) {
                        }
                        qVar2.Q = false;
                        qVar2.T = 1;
                        qVar2.U = 5;
                        qVar2.V = null;
                        qVar2.f8360v = null;
                        qVar2.f8336c0 = null;
                        a2 a2Var82222 = qVar2.F;
                        Boolean bool22222 = Boolean.FALSE;
                        this.f8181k = 7;
                        a2Var82222.getClass();
                        a2Var82222.k(null, bool22222);
                        if (Unit.f26487a == aVar3) {
                        }
                        qVar2.N = null;
                        qVar2.O = false;
                        break;
                    case 5:
                        ba0.g.M(obj);
                        a2 a2Var722222 = qVar2.l;
                        kotlin.collections.n0 n0Var22222 = kotlin.collections.n0.f26529a;
                        this.f8181k = 6;
                        a2Var722222.j(n0Var22222);
                        if (Unit.f26487a == aVar3) {
                        }
                        qVar2.Q = false;
                        qVar2.T = 1;
                        qVar2.U = 5;
                        qVar2.V = null;
                        qVar2.f8360v = null;
                        qVar2.f8336c0 = null;
                        a2 a2Var822222 = qVar2.F;
                        Boolean bool222222 = Boolean.FALSE;
                        this.f8181k = 7;
                        a2Var822222.getClass();
                        a2Var822222.k(null, bool222222);
                        if (Unit.f26487a == aVar3) {
                        }
                        qVar2.N = null;
                        qVar2.O = false;
                        break;
                    case 6:
                        ba0.g.M(obj);
                        qVar2.Q = false;
                        qVar2.T = 1;
                        qVar2.U = 5;
                        qVar2.V = null;
                        qVar2.f8360v = null;
                        qVar2.f8336c0 = null;
                        a2 a2Var8222222 = qVar2.F;
                        Boolean bool2222222 = Boolean.FALSE;
                        this.f8181k = 7;
                        a2Var8222222.getClass();
                        a2Var8222222.k(null, bool2222222);
                        if (Unit.f26487a == aVar3) {
                        }
                        qVar2.N = null;
                        qVar2.O = false;
                        break;
                    case 7:
                        ba0.g.M(obj);
                        qVar2.N = null;
                        qVar2.O = false;
                        break;
                    default:
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        break;
                }
                break;
            case 3:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                int i14 = this.f8181k;
                if (i14 != 0) {
                    if (i14 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    a2 a2Var9 = this.l.f8361w;
                    this.f8181k = 1;
                    a2Var9.j(null);
                    if (Unit.f26487a == aVar4) {
                    }
                }
                break;
            case 4:
                y70.a aVar5 = y70.a.COROUTINE_SUSPENDED;
                int i15 = this.f8181k;
                if (i15 != 0) {
                    if (i15 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    al.a0 a0Var = new al.a0(this.l.f8341f.getData(), 10);
                    this.f8181k = 1;
                    obj = y80.r.r(a0Var, this);
                    if (obj == aVar5) {
                    }
                }
                Boolean bool4 = (Boolean) obj;
                break;
            case 5:
                y70.a aVar6 = y70.a.COROUTINE_SUSPENDED;
                int i16 = this.f8181k;
                if (i16 != 0) {
                    if (i16 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    d8.f fVar = this.l.f8341f;
                    bm.o oVar = new bm.o(2, null, 1);
                    this.f8181k = 1;
                    if (xz.b.r(fVar, oVar, this) == aVar6) {
                    }
                }
                break;
            default:
                y70.a aVar7 = y70.a.COROUTINE_SUSPENDED;
                int i17 = this.f8181k;
                if (i17 != 0) {
                    if (i17 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    a2 a2Var10 = this.l.f8343g;
                    Boolean bool5 = Boolean.FALSE;
                    this.f8181k = 1;
                    a2Var10.getClass();
                    a2Var10.k(null, bool5);
                    if (Unit.f26487a == aVar7) {
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}
