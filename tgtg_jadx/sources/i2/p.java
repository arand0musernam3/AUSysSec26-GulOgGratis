package i2;

import c5.z0;
import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v1.j1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f22885j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22886k;
    public final /* synthetic */ e0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(e0 e0Var, x70.c cVar, int i11) {
        super(2, cVar);
        this.f22885j = i11;
        this.l = e0Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f22885j) {
            case 0:
                return new p(this.l, cVar, 0);
            case 1:
                return new p(this.l, cVar, 1);
            case 2:
                return new p(this.l, cVar, 2);
            case 3:
                return new p(this.l, cVar, 3);
            case 4:
                return new p(this.l, cVar, 4);
            case 5:
                return new p(this.l, cVar, 5);
            default:
                return new p(this.l, cVar, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f22885j) {
        }
        return ((p) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        Object objF;
        Object objF2;
        int i11 = this.f22885j;
        e0 e0Var = this.l;
        x70.c cVar = null;
        switch (i11) {
            case 0:
                Object obj2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f22886k;
                if (i12 == 0) {
                    ba0.g.M(obj);
                    this.f22886k = 1;
                    float f11 = g0.f22857a;
                    if (e0Var.l() - 1 < 0 || (objF = e0Var.f(e0Var.l() - 1, t1.c.j(0.0f, 0.0f, null, 7), this)) != obj2) {
                        objF = Unit.f26487a;
                    }
                    if (objF == obj2) {
                    }
                } else if (i12 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                }
                break;
            case 1:
                Object obj3 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f22886k;
                if (i13 == 0) {
                    ba0.g.M(obj);
                    this.f22886k = 1;
                    float f12 = g0.f22857a;
                    if (e0Var.l() + 1 >= e0Var.o() || (objF2 = e0Var.f(e0Var.l() + 1, t1.c.j(0.0f, 0.0f, null, 7), this)) != obj3) {
                        objF2 = Unit.f26487a;
                    }
                    if (objF2 == obj3) {
                    }
                } else if (i13 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                }
                break;
            case 2:
                Object obj4 = y70.a.COROUTINE_SUSPENDED;
                int i14 = this.f22886k;
                if (i14 == 0) {
                    ba0.g.M(obj);
                    this.f22886k = 1;
                    j1 j1Var = j1.Default;
                    z0 z0Var = new z0(2, cVar, 13);
                    e0Var.getClass();
                    Object objU = e0.u(e0Var, j1Var, z0Var, this);
                    if (objU != obj4) {
                        objU = Unit.f26487a;
                    }
                    if (objU == obj4) {
                    }
                } else if (i14 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                }
                break;
            case 3:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i15 = this.f22886k;
                if (i15 == 0) {
                    ba0.g.M(obj);
                    this.f22886k = 1;
                    if (e0Var.f(0, t1.c.j(0.0f, 0.0f, null, 7), this) == aVar) {
                    }
                } else if (i15 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                }
                break;
            case 4:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i16 = this.f22886k;
                if (i16 == 0) {
                    ba0.g.M(obj);
                    this.f22886k = 1;
                    if (e0Var.f(0, t1.c.j(0.0f, 0.0f, null, 7), this) == aVar2) {
                    }
                } else if (i16 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                }
                break;
            case 5:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i17 = this.f22886k;
                if (i17 == 0) {
                    ba0.g.M(obj);
                    this.f22886k = 1;
                    if (e0Var.f(0, t1.c.j(0.0f, 0.0f, null, 7), this) == aVar3) {
                    }
                } else if (i17 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                }
                break;
            default:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                int i18 = this.f22886k;
                if (i18 == 0) {
                    ba0.g.M(obj);
                    this.f22886k = 1;
                    if (e0Var.f(1, t1.c.j(0.0f, 0.0f, null, 7), this) == aVar4) {
                    }
                } else if (i18 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                }
                break;
        }
        return Unit.f26487a;
    }
}
