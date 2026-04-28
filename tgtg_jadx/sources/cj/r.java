package cj;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y80.a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f8368j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8369k;
    public final /* synthetic */ e0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(e0 e0Var, x70.c cVar, int i11) {
        super(2, cVar);
        this.f8368j = i11;
        this.l = e0Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f8368j) {
            case 0:
                return new r(this.l, cVar, 0);
            case 1:
                return new r(this.l, cVar, 1);
            case 2:
                return new r(this.l, cVar, 2);
            case 3:
                return new r(this.l, cVar, 3);
            case 4:
                return new r(this.l, cVar, 4);
            default:
                return new r(this.l, cVar, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f8368j) {
        }
        return ((r) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f8368j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f8369k;
                e0 e0Var = this.l;
                if (i11 != 0) {
                    if (i11 == 1) {
                        ba0.g.M(obj);
                    } else if (i11 != 2) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    a2 a2Var = e0Var.f8228s;
                    this.f8369k = 1;
                    a2Var.j(null);
                    if (Unit.f26487a == aVar) {
                    }
                }
                a2 a2Var2 = e0Var.f8230u;
                Boolean bool = Boolean.TRUE;
                this.f8369k = 2;
                a2Var2.getClass();
                a2Var2.k(null, bool);
                if (Unit.f26487a == aVar) {
                }
                break;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f8369k;
                if (i12 != 0) {
                    if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    a2 a2Var3 = this.l.f8217g;
                    Boolean bool2 = Boolean.FALSE;
                    this.f8369k = 1;
                    a2Var3.getClass();
                    a2Var3.k(null, bool2);
                    if (Unit.f26487a == aVar2) {
                    }
                }
                break;
            case 2:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f8369k;
                e0 e0Var2 = this.l;
                if (i13 != 0) {
                    if (i13 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    e0Var2.W.i(null);
                    a2 a2Var4 = e0Var2.Y;
                    this.f8369k = 1;
                    a2Var4.j(null);
                    if (Unit.f26487a == aVar3) {
                    }
                }
                e0Var2.n();
                break;
            case 3:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                int i14 = this.f8369k;
                if (i14 != 0) {
                    if (i14 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    a2 a2Var5 = this.l.f8230u;
                    Boolean bool3 = Boolean.FALSE;
                    this.f8369k = 1;
                    a2Var5.getClass();
                    a2Var5.k(null, bool3);
                    if (Unit.f26487a == aVar4) {
                    }
                }
                break;
            case 4:
                y70.a aVar5 = y70.a.COROUTINE_SUSPENDED;
                int i15 = this.f8369k;
                if (i15 != 0) {
                    if (i15 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    a2 a2Var6 = this.l.f8234y;
                    Boolean bool4 = Boolean.FALSE;
                    this.f8369k = 1;
                    a2Var6.getClass();
                    a2Var6.k(null, bool4);
                    if (Unit.f26487a == aVar5) {
                    }
                }
                break;
            default:
                y70.a aVar6 = y70.a.COROUTINE_SUSPENDED;
                int i16 = this.f8369k;
                if (i16 != 0) {
                    if (i16 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    a2 a2Var7 = this.l.A;
                    Boolean bool5 = Boolean.FALSE;
                    this.f8369k = 1;
                    a2Var7.getClass();
                    a2Var7.k(null, bool5);
                    if (Unit.f26487a == aVar6) {
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}
